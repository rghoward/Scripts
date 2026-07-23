from __future__ import annotations

import csv
import fcntl
import html
import io
import json
import os
import re
import subprocess
import sys
import time
import tomllib
from http.cookiejar import MozillaCookieJar
from dataclasses import dataclass
from datetime import datetime, timezone
from pathlib import Path

from bs4 import BeautifulSoup
from gradescopeapi.classes.connection import GSConnection

from .database import connect, data_dir, initialize


PROJECT_DIR = Path(__file__).resolve().parents[1]
CONFIG_PATH = PROJECT_DIR / "config.local.toml"
ROLE_NAMES = {"0": "Student", "1": "Instructor", "2": "TA", "3": "Reader"}


@dataclass(frozen=True)
class ImportResult:
    course_id: int
    assignment_id: int
    questions: int
    submissions: int
    late_submissions: int
    staff: int
    graded_cells: int


@dataclass(frozen=True)
class DiscoveryResult:
    courses: int
    assignments: int = 0


def load_config() -> dict:
    if not CONFIG_PATH.exists():
        raise RuntimeError("config.local.toml is missing; copy config.example.toml first")
    with CONFIG_PATH.open("rb") as handle:
        return tomllib.load(handle)


def read_password(settings: dict) -> str:
    env_name = settings.get("password_env", "GRADING_COORDINATOR_GRADESCOPE_PASSWORD")
    if os.environ.get(env_name):
        return os.environ[env_name]
    if sys.platform != "darwin":
        raise RuntimeError(f"Set {env_name} on this system")
    result = subprocess.run(
        [
            "/usr/bin/security", "find-generic-password", "-a", settings["email"],
            "-s", settings["keychain_service"], "-w",
        ],
        check=False, capture_output=True, text=True,
    )
    password = result.stdout.rstrip("\n")
    if result.returncode or not password:
        raise RuntimeError("Gradescope password was not found in macOS Keychain")
    return password


def grading_dashboard(connection: GSConnection, course_id: str, assignment_id: str) -> dict:
    url = f"{connection.gradescope_base_url}/courses/{course_id}/assignments/{assignment_id}/grade"
    response = connection.session.get(url, timeout=30)
    response.raise_for_status()
    soup = BeautifulSoup(response.text, "html.parser")
    component = soup.find(attrs={"data-react-class": "GradingDashboard"})
    if not component:
        raise RuntimeError("Gradescope grading dashboard data was not found")
    payload = json.loads(html.unescape(component["data-react-props"]))
    assignment = payload["presenter"]["assignments"].get(str(assignment_id))
    if not assignment:
        raise RuntimeError("The requested assignment was not present in the grading dashboard")
    return assignment


def score_rows(connection: GSConnection, course_id: str, assignment_id: str) -> list[dict]:
    url = f"{connection.gradescope_base_url}/courses/{course_id}/assignments/{assignment_id}/scores.csv"
    response = connection.session.get(url, timeout=30)
    response.raise_for_status()
    rows = list(csv.DictReader(io.StringIO(response.text.lstrip("\ufeff"))))
    required = {"First Name", "Last Name", "Email", "Submission ID", "Submission Time", "Lateness (H:M:S)"}
    if rows and not required.issubset(rows[0]):
        raise RuntimeError("Unexpected Gradescope score export format")
    return [row for row in rows if (row.get("Submission ID") or "").strip()]


def staff_rows(connection: GSConnection, course_id: str) -> list[dict]:
    url = f"{connection.gradescope_base_url}/courses/{course_id}/memberships"
    response = connection.session.get(url, timeout=30)
    response.raise_for_status()
    soup = BeautifulSoup(response.text, "html.parser")
    staff = []
    for row in soup.select("tr.rosterRow"):
        control = row.select_one("button.rosterCell--editIcon")
        if not control:
            continue
        role = ROLE_NAMES.get(control.get("data-role"), "Unknown")
        if role == "Student":
            continue
        details = json.loads(control.get("data-cm", "{}"))
        staff.append({
            "gradescope_id": control.get("data-id", ""),
            "name": details.get("full_name") or control.get("data-email", "Unknown staff"),
            "email": control.get("data-email", "").strip(),
            "role": role,
        })
    return staff


def question_activity(connection: GSConnection, course_id: str, question_id: str) -> list[dict]:
    url = f"{connection.gradescope_base_url}/courses/{course_id}/questions/{question_id}/submissions"
    response = connection.session.get(url, timeout=30)
    response.raise_for_status()
    soup = BeautifulSoup(response.text, "html.parser")
    table = soup.find("table")
    if not table:
        return []
    activity = []
    for row in table.find_all("tr")[1:]:
        cells = row.find_all("td")
        link = row.select_one(f'a[href*="/questions/{question_id}/submissions/"][href$="/grade"]')
        if not link or len(cells) < 6:
            continue
        match = re.search(r"/submissions/(\d+)/grade", link.get("href", ""))
        if not match:
            continue
        graded = cells[5].select_one(".fa-check") is not None
        score_text = cells[4].get_text(" ", strip=True)
        score_match = re.search(r"-?\d+(?:\.\d+)?", score_text)
        user_text = cells[1].get_text(" ", strip=True)
        email_match = re.search(r"[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}", user_text, re.I)
        activity.append({
            "submission_id": match.group(1),
            "student_email": email_match.group(0).casefold() if email_match else "",
            "grader_name": cells[2].get_text(" ", strip=True),
            "graded": graded,
            "score": float(score_match.group(0)) if score_match else None,
        })
    return activity


def _connection(settings: dict) -> GSConnection:
    session_dir = Path(os.environ.get("GRADING_COORDINATOR_GRADESCOPE_SESSION_DIR", data_dir()))
    session_dir.mkdir(parents=True, exist_ok=True, mode=0o700)
    lock_path = session_dir / "gradescope-session.lock"
    cookie_path = session_dir / "gradescope-session.cookies"
    failure_path = session_dir / "gradescope-auth-failure"
    lock_handle = lock_path.open("a+")
    lock_path.chmod(0o600)
    fcntl.flock(lock_handle.fileno(), fcntl.LOCK_EX)
    connection = GSConnection()
    try:
        if cookie_path.exists():
            cookie_jar = MozillaCookieJar(str(cookie_path))
            cookie_jar.load(ignore_discard=True, ignore_expires=False)
            connection.session.cookies.update(cookie_jar)
        response = connection.session.get(connection.gradescope_base_url + "/", timeout=30)
        response.raise_for_status()
        soup = BeautifulSoup(response.text, "html.parser")
        authenticated = bool(soup.select_one("a.courseBox, a[href='/logout'], form[action='/logout']"))
        if not authenticated:
            if failure_path.exists() and time.time() - failure_path.stat().st_mtime < 900:
                raise RuntimeError("Gradescope authentication is in a 15-minute cooldown after a failed login")
            try:
                connection.login(settings["email"], read_password(settings))
            except (ValueError, RuntimeError):
                failure_path.touch(mode=0o600)
                raise
            failure_path.unlink(missing_ok=True)
        else:
            connection.logged_in = True
        connection._coordinator_cookie_path = cookie_path
        connection._coordinator_lock_handle = lock_handle
        return connection
    except Exception:
        connection.session.close()
        fcntl.flock(lock_handle.fileno(), fcntl.LOCK_UN)
        lock_handle.close()
        raise


def _close_connection(connection: GSConnection) -> None:
    """Persist this session locally without invalidating it on Gradescope."""
    cookie_path = getattr(connection, "_coordinator_cookie_path", None)
    lock_handle = getattr(connection, "_coordinator_lock_handle", None)
    try:
        if cookie_path is not None:
            cookie_jar = MozillaCookieJar(str(cookie_path))
            for cookie in connection.session.cookies:
                cookie_jar.set_cookie(cookie)
            cookie_jar.save(ignore_discard=True, ignore_expires=True)
            cookie_path.chmod(0o600)
    finally:
        connection.session.close()
        connection.logged_in = False
        connection.account = None
        if lock_handle is not None:
            fcntl.flock(lock_handle.fileno(), fcntl.LOCK_UN)
            lock_handle.close()


def parse_course_catalog(page: str) -> list[dict]:
    soup = BeautifulSoup(page, "html.parser")
    discovered = []
    for course_list in soup.select(".courseList"):
        term = "Unknown term"
        for child in course_list.find_all(recursive=False):
            classes = child.get("class", [])
            if "courseList--term" in classes:
                term = child.get_text(" ", strip=True) or term
                continue
            if "courseList--coursesForTerm" not in classes:
                continue
            for link in child.select("a.courseBox[href]"):
                match = re.fullmatch(r"/courses/(\d+)", link.get("href", ""))
                if not match:
                    continue
                code_node = link.select_one(".courseBox--shortname")
                name_node = link.select_one(".courseBox--name")
                discovered.append({
                    "gradescope_id": match.group(1),
                    "code": code_node.get_text(" ", strip=True) if code_node else f"Course {match.group(1)}",
                    "name": name_node.get_text(" ", strip=True) if name_node else "",
                    "term": term,
                })
    return discovered


def parse_assignment_catalog(page: str) -> list[dict]:
    soup = BeautifulSoup(page, "html.parser")
    component = soup.find(attrs={"data-react-class": "AssignmentsTable"})
    if not component:
        raise RuntimeError("Gradescope assignment table was not found")
    payload = json.loads(html.unescape(component["data-react-props"]))
    return payload.get("table_data", [])


def normalized_assignment_id(raw_id: object) -> str:
    value = str(raw_id)
    match = re.search(r"(\d+)$", value)
    return match.group(1) if match else value


def reconcile_assignment_catalog(database, course_id: int) -> int:
    """Remove empty prefixed duplicates while preserving every imported record and plan."""
    rows = database.execute(
        """SELECT a.*,
        (SELECT COUNT(*) FROM questions q WHERE q.assignment_id=a.id) question_count,
        (SELECT COUNT(*) FROM submissions s WHERE s.assignment_id=a.id) submission_count,
        (SELECT COUNT(*) FROM rounds r WHERE r.assignment_id=a.id) round_count
        FROM assignments a WHERE a.course_id=? ORDER BY a.id""",
        (course_id,),
    ).fetchall()
    groups = {}
    for row in rows:
        groups.setdefault(normalized_assignment_id(row["gradescope_id"]), []).append(row)
    removed = 0
    for normalized_id, matches in groups.items():
        canonical = max(
            matches,
            key=lambda row: (
                bool(row["imported_at"]), row["question_count"] + row["submission_count"] + row["round_count"],
                row["gradescope_id"] == normalized_id, -row["id"],
            ),
        )
        for duplicate in matches:
            if duplicate["id"] == canonical["id"]:
                continue
            if duplicate["question_count"] or duplicate["submission_count"] or duplicate["round_count"]:
                continue
            database.execute("DELETE FROM assignments WHERE id=?", (duplicate["id"],))
            removed += 1
        conflict = database.execute(
            "SELECT id FROM assignments WHERE course_id=? AND gradescope_id=? AND id!=?",
            (course_id, normalized_id, canonical["id"]),
        ).fetchone()
        if not conflict:
            database.execute("UPDATE assignments SET gradescope_id=? WHERE id=?", (normalized_id, canonical["id"]))
    return removed


def discover_courses() -> DiscoveryResult:
    """Refresh course metadata without reading rosters, submissions, or grades."""
    initialize()
    settings = load_config()["gradescope"]
    connection = _connection(settings)
    try:
        response = connection.session.get(connection.gradescope_base_url + "/", timeout=30)
        response.raise_for_status()
        discovered = parse_course_catalog(response.text)
        with connect() as database:
            database.execute("UPDATE courses SET active=0")
            for course in discovered:
                database.execute(
                    """INSERT INTO courses (gradescope_id, code, name, term, active) VALUES (?, ?, ?, ?, 1)
                    ON CONFLICT(gradescope_id) DO UPDATE SET code=excluded.code, name=excluded.name,
                    term=excluded.term, active=1""",
                    (course["gradescope_id"], course["code"], course["name"], course["term"]),
                )
        return DiscoveryResult(courses=len(discovered))
    finally:
        _close_connection(connection)


def discover_assignments(local_course_id: int) -> DiscoveryResult:
    """Refresh assignment metadata for one course without reading student data."""
    initialize()
    with connect() as database:
        course = database.execute("SELECT * FROM courses WHERE id=?", (local_course_id,)).fetchone()
    if not course:
        raise RuntimeError("Course not found")
    settings = load_config()["gradescope"]
    connection = _connection(settings)
    try:
        response = connection.session.get(
            f"{connection.gradescope_base_url}/courses/{course['gradescope_id']}", timeout=30
        )
        response.raise_for_status()
        assignments = parse_assignment_catalog(response.text)
        now = datetime.now(timezone.utc).isoformat()
        with connect() as database:
            for item in assignments:
                window = item.get("submission_window") or {}
                gs_assignment_id = normalized_assignment_id(item["id"])
                old_id = str(item["id"])
                if old_id != gs_assignment_id:
                    existing = database.execute(
                        "SELECT id FROM assignments WHERE course_id=? AND gradescope_id=?",
                        (local_course_id, old_id),
                    ).fetchone()
                    normalized = database.execute(
                        "SELECT id FROM assignments WHERE course_id=? AND gradescope_id=?",
                        (local_course_id, gs_assignment_id),
                    ).fetchone()
                    if existing and not normalized:
                        database.execute("UPDATE assignments SET gradescope_id=? WHERE id=?", (gs_assignment_id, existing["id"]))
                database.execute(
                    """INSERT INTO assignments
                    (course_id, gradescope_id, title, regular_deadline, late_deadline, discovered_at,
                    version_group, version_index, is_versioned, is_container)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                    ON CONFLICT(course_id, gradescope_id) DO UPDATE SET title=excluded.title,
                    regular_deadline=excluded.regular_deadline, late_deadline=excluded.late_deadline,
                    discovered_at=excluded.discovered_at, version_group=excluded.version_group,
                    version_index=excluded.version_index, is_versioned=excluded.is_versioned,
                    is_container=excluded.is_container""",
                    (
                        local_course_id, gs_assignment_id, item.get("title") or "Untitled assignment",
                        window.get("due_date"), window.get("hard_due_date"), now,
                        str(item.get("container_id") or "") or None, item.get("version_index"),
                        int(bool(item.get("is_versioned_assignment") or item.get("container_id"))),
                        int(str(item["id"]).startswith("assignment_container_")),
                    ),
                )
            reconcile_assignment_catalog(database, local_course_id)
        return DiscoveryResult(courses=1, assignments=len(assignments))
    finally:
        _close_connection(connection)


def import_assignment(sync_activity: bool = True, local_assignment_id: int | None = None) -> ImportResult:
    initialize()
    config = load_config()
    settings = config["gradescope"]
    if local_assignment_id is None:
        source = config["import"]
    else:
        with connect() as database:
            selected = database.execute(
                """SELECT a.gradescope_id assignment_id, a.title assignment_title,
                c.gradescope_id course_id, c.code course_code, c.name course_name, c.term
                FROM assignments a JOIN courses c ON c.id=a.course_id WHERE a.id=?""",
                (local_assignment_id,),
            ).fetchone()
        if not selected:
            raise RuntimeError("Assignment not found")
        source = dict(selected)
    gs_course_id = str(source["course_id"])
    gs_assignment_id = normalized_assignment_id(source["assignment_id"])
    connection = GSConnection()
    try:
        connection.login(settings["email"], read_password(settings))
        dashboard = grading_dashboard(connection, gs_course_id, gs_assignment_id)
        scores = score_rows(connection, gs_course_id, gs_assignment_id)
        staff = staff_rows(connection, gs_course_id)

        with connect() as database:
            database.execute(
                """INSERT INTO courses (gradescope_id, code, name, term) VALUES (?, ?, ?, ?)
                ON CONFLICT(gradescope_id) DO UPDATE SET code=excluded.code, name=excluded.name, term=excluded.term""",
                (gs_course_id, source["course_code"], source["course_name"], source["term"]),
            )
            course_id = database.execute("SELECT id FROM courses WHERE gradescope_id=?", (gs_course_id,)).fetchone()[0]
            database.execute(
                """INSERT INTO assignments (course_id, gradescope_id, title, imported_at) VALUES (?, ?, ?, ?)
                ON CONFLICT(course_id, gradescope_id) DO UPDATE SET title=excluded.title, imported_at=excluded.imported_at""",
                (course_id, gs_assignment_id, source["assignment_title"], datetime.now(timezone.utc).isoformat()),
            )
            assignment_id = database.execute(
                "SELECT id FROM assignments WHERE course_id=? AND gradescope_id=?", (course_id, gs_assignment_id)
            ).fetchone()[0]

            questions = dashboard["questions"]
            leaf_ids = dashboard["leaf_question_ids"]
            for position, gs_question_id in enumerate(leaf_ids, 1):
                question = questions[str(gs_question_id)]
                database.execute(
                    """INSERT INTO questions
                    (assignment_id, gradescope_id, position, label, title, total_count, graded_count, max_points)
                    VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                    ON CONFLICT(assignment_id, gradescope_id) DO UPDATE SET
                    position=excluded.position, label=excluded.label, title=excluded.title,
                    total_count=excluded.total_count, graded_count=excluded.graded_count,
                    max_points=excluded.max_points""",
                    (
                        assignment_id, str(gs_question_id), position,
                        f"Question {question.get('title') or position}", question.get("title") or "",
                        int(question.get("total_count", 0)), int(question.get("total_graded_count", 0)),
                        float(question.get("weight") or 0),
                    ),
                )

            late_count = 0
            for display_index, row in enumerate(scores, 1):
                lateness = (row.get("Lateness (H:M:S)") or "").strip()
                is_late = bool(lateness and lateness not in {"0:00:00", "00:00:00"})
                late_count += int(is_late)
                student_key = (row.get("Email") or row.get("SID") or row["Submission ID"]).strip().casefold()
                name = " ".join(part.strip() for part in (row.get("First Name", ""), row.get("Last Name", "")) if part.strip())
                existing = database.execute(
                    "SELECT id FROM submissions WHERE assignment_id=? AND student_key=?", (assignment_id, student_key)
                ).fetchone()
                if existing:
                    database.execute(
                        """UPDATE submissions SET gradescope_id=?, student_name=?, display_index=?,
                        submitted_at=?, is_late=? WHERE id=?""",
                        (row["Submission ID"], name, display_index, row.get("Submission Time"), int(is_late), existing["id"]),
                    )
                else:
                    database.execute(
                        """INSERT INTO submissions
                        (assignment_id, gradescope_id, student_key, student_name, display_index, submitted_at, is_late)
                        VALUES (?, ?, ?, ?, ?, ?, ?)""",
                        (assignment_id, row["Submission ID"], student_key, name, display_index, row.get("Submission Time"), int(is_late)),
                    )

            for member in staff:
                if not member["email"]:
                    continue
                database.execute(
                    """INSERT INTO graders (name, email, gradescope_id, role) VALUES (?, ?, ?, ?)
                    ON CONFLICT(email) DO UPDATE SET name=excluded.name, gradescope_id=excluded.gradescope_id, role=excluded.role""",
                    (member["name"], member["email"], member["gradescope_id"], member["role"]),
                )
                grader_id = database.execute("SELECT id FROM graders WHERE email=?", (member["email"],)).fetchone()[0]
                database.execute(
                    "INSERT OR IGNORE INTO assignment_graders (assignment_id, grader_id) VALUES (?, ?)",
                    (assignment_id, grader_id),
                )

        graded_cells = 0
        if sync_activity:
            for gs_question_id in leaf_ids:
                activity = question_activity(connection, gs_course_id, str(gs_question_id))
                with connect() as database:
                    question = database.execute(
                        "SELECT id, max_points FROM questions WHERE assignment_id=? AND gradescope_id=?",
                        (assignment_id, str(gs_question_id)),
                    ).fetchone()
                    database.execute(
                        "DELETE FROM grading_activity WHERE assignment_id=? AND question_id=?",
                        (assignment_id, question["id"]),
                    )
                    for item in activity:
                        submission = database.execute(
                            "SELECT id FROM submissions WHERE assignment_id=? AND gradescope_id=?",
                            (assignment_id, item["submission_id"]),
                        ).fetchone()
                        if not submission:
                            submission = database.execute(
                                "SELECT id FROM submissions WHERE assignment_id=? AND student_key=?",
                                (assignment_id, item["student_email"]),
                            ).fetchone()
                        if not submission:
                            continue
                        database.execute(
                            """INSERT INTO cell_links
                            (assignment_id, submission_id, question_id, gradescope_question_submission_id)
                            VALUES (?, ?, ?, ?)
                            ON CONFLICT(assignment_id, submission_id, question_id) DO UPDATE SET
                            gradescope_question_submission_id=excluded.gradescope_question_submission_id""",
                            (assignment_id, submission["id"], question["id"], item["submission_id"]),
                        )
                        if not item["graded"]:
                            continue
                        graded_cells += 1
                        grader = database.execute(
                            "SELECT id FROM graders WHERE name=?", (item["grader_name"],)
                        ).fetchone()
                        database.execute(
                            """INSERT INTO grading_activity
                            (assignment_id, submission_id, question_id, grader_id, observed_grader, graded_at,
                            score, max_points)
                            VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                            ON CONFLICT(assignment_id, submission_id, question_id) DO UPDATE SET
                            grader_id=excluded.grader_id, observed_grader=excluded.observed_grader,
                            graded_at=COALESCE(grading_activity.graded_at, excluded.graded_at),
                            score=excluded.score, max_points=excluded.max_points""",
                            (
                                assignment_id, submission["id"], question["id"],
                                grader["id"] if grader else None, item["grader_name"],
                                datetime.now(timezone.utc).isoformat(),
                                item["score"], question["max_points"],
                            ),
                        )

        return ImportResult(course_id, assignment_id, len(leaf_ids), len(scores), late_count, len(staff), graded_cells)
    finally:
        _close_connection(connection)
