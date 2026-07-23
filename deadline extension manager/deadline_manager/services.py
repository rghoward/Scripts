from __future__ import annotations

import os
import subprocess
import sys
from datetime import datetime

import requests
from gradescopeapi.classes.connection import GSConnection
from gradescopeapi.classes.extensions import update_student_extension

from .core import normalized


class CanvasClient:
    def __init__(self, settings: dict):
        self.base = settings["base_url"].rstrip("/")
        token = os.environ.get(settings.get("token_env", "CANVAS_DEADLINE_MANAGER_TOKEN"))
        if not token and sys.platform == "darwin":
            result = subprocess.run(
                ["/usr/bin/security", "find-generic-password", "-a",
                 settings.get("token_keychain_account", "canvas"), "-s",
                 settings["token_keychain_service"], "-w"],
                capture_output=True, text=True, check=False,
            )
            token = result.stdout.strip() if result.returncode == 0 else None
        if not token:
            raise RuntimeError("Canvas token was not found in the environment or macOS Keychain")
        self.session = requests.Session()
        self.session.headers["Authorization"] = f"Bearer {token}"

    def request(self, method: str, path: str, **kwargs):
        response = self.session.request(method, f"{self.base}/api/v1{path}", timeout=30, **kwargs)
        if not response.ok:
            detail = response.text[:500]
            raise RuntimeError(f"Canvas {method} {path} failed ({response.status_code}): {detail}")
        return response.json() if response.content else None

    def pages(self, path: str, params: dict | None = None) -> list[dict]:
        url = f"{self.base}/api/v1{path}"
        output = []
        while url:
            response = self.session.get(url, params=params, timeout=30)
            if not response.ok:
                raise RuntimeError(f"Canvas GET {path} failed ({response.status_code}): {response.text[:500]}")
            output.extend(response.json())
            url = response.links.get("next", {}).get("url")
            params = None
        return output

    def courses(self) -> list[dict]:
        courses = self.pages("/courses", {
            "enrollment_type": "teacher", "state[]": ["available", "completed"],
            "include[]": ["term", "total_students"], "per_page": 100,
        })
        return [c for c in courses if c.get("name") and c.get("term")]

    def students(self, course_id: str) -> list[dict]:
        return self.pages(f"/courses/{course_id}/users", {
            "enrollment_type[]": "student", "include[]": ["email", "enrollments"], "per_page": 100,
        })

    def assignments(self, course_id: str) -> list[dict]:
        return self.pages(f"/courses/{course_id}/assignments", {
            "include[]": ["all_dates"], "order_by": "due_at", "per_page": 100,
        })

    def student_override(self, course_id: str, assignment_id: str, student_id: str) -> dict | None:
        rows = self.pages(f"/courses/{course_id}/assignments/{assignment_id}/overrides", {"per_page": 100})
        return next((row for row in rows if str(student_id) in {str(v) for v in row.get("student_ids", [])}), None)

    def save_override(self, course_id: str, assignment_id: str, student: dict,
                      due_at: str, lock_at: str | None) -> dict:
        existing = self.student_override(course_id, assignment_id, str(student["id"]))
        override = {"student_ids": [student["id"]], "due_at": due_at, "lock_at": lock_at,
                    "title": f"Extension — {student['name']}"}
        if existing:
            return self.request("PUT", f"/courses/{course_id}/assignments/{assignment_id}/overrides/{existing['id']}",
                                json={"assignment_override": override})
        return self.request("POST", f"/courses/{course_id}/assignments/{assignment_id}/overrides",
                            json={"assignment_override": override})


class GradescopeClient:
    def __init__(self, settings: dict):
        if not settings.get("email") or str(settings.get("email", "")).startswith("YOUR_"):
            raise RuntimeError(
                "Gradescope email is not configured. Update [gradescope] in config.local.toml."
            )
        password = os.environ.get(settings.get("password_env", "GRADESCOPE_PASSWORD"))
        if not password and sys.platform == "darwin":
            result = subprocess.run(
                ["/usr/bin/security", "find-generic-password", "-a", settings["email"],
                 "-s", settings["keychain_service"], "-w"], capture_output=True, text=True, check=False,
            )
            password = result.stdout.strip() if result.returncode == 0 else None
        if not password:
            raise RuntimeError("Gradescope password was not found in the environment or macOS Keychain")
        self.connection = GSConnection()
        self.connection.login(settings["email"], password)

    def catalog(self) -> dict:
        return self.connection.account.get_courses().get("instructor", {})

    def match_course(self, canvas_course: dict, explicit_id: str | None = None):
        courses = self.catalog()
        if explicit_id:
            return explicit_id, courses.get(str(explicit_id))
        canvas_keys = {normalized(canvas_course.get("name", "")), normalized(canvas_course.get("course_code", ""))}
        hits = []
        for course_id, course in courses.items():
            keys = {normalized(course.name), normalized(course.full_name)}
            if any(a and (a == b or a in b or b in a) for a in canvas_keys for b in keys):
                hits.append((course_id, course))
        return hits[0] if len(hits) == 1 else (None, None)

    def assignments(self, course_id: str):
        return self.connection.account.get_assignments(course_id)

    def students(self, course_id: str):
        return [u for u in (self.connection.account.get_course_users(course_id) or [])
                if (u.role or "").casefold() == "student"]

    def save_extension(self, course_id: str, assignment_id: str, user_id: str,
                       due: datetime, late: datetime | None) -> None:
        # Gradescope extensions cannot explicitly clear hard_due_date through this
        # endpoint. Setting it equal to due produces the requested no-late window.
        effective_late = late or due
        ok = update_student_extension(self.connection.session, course_id, assignment_id, user_id,
                                      due_date=due, late_due_date=effective_late,
                                      gradescope_base_url=self.connection.gradescope_base_url)
        if not ok:
            raise RuntimeError("Gradescope rejected the extension update")
