#!/usr/bin/env python3
from __future__ import annotations

import threading
import tomllib
import subprocess
import sys
import webbrowser
from datetime import datetime
from pathlib import Path
from tkinter import BooleanVar, StringVar, Tk, messagebox, simpledialog
from tkinter import ttk
from zoneinfo import ZoneInfo

from deadline_manager.core import Dates, calculate_dates, normalized, parse_iso
from deadline_manager.services import CanvasClient, GradescopeClient


ROOT = Path(__file__).resolve().parent
CONFIG = ROOT / "config.local.toml"
DATE_FORMAT = "%Y-%m-%d %H:%M"


def load_config() -> dict:
    if not CONFIG.exists():
        raise RuntimeError("config.local.toml is missing. Copy config.example.toml and configure it first.")
    with CONFIG.open("rb") as handle:
        config = tomllib.load(handle)
    gradescope = config.setdefault("gradescope", {})
    if not gradescope.get("email") or str(gradescope.get("email", "")).startswith("YOUR_"):
        # Reuse the already-configured credentials from the related local tools.
        # Only settings are copied in memory; passwords remain in Keychain/env.
        candidates = [
            ROOT.parent / "gradescope missing-submission reminders" / "config.local.toml",
            ROOT.parent / "gradescope grading coordinator" / "config.local.toml",
        ]
        for candidate in candidates:
            if not candidate.exists():
                continue
            with candidate.open("rb") as handle:
                existing = tomllib.load(handle).get("gradescope", {})
            email = str(existing.get("email", "")).strip()
            if email and not email.startswith("YOUR_"):
                for key in ("email", "keychain_service", "password_env"):
                    if existing.get(key):
                        gradescope[key] = existing[key]
                break
    return config


class DeadlineApp(Tk):
    def __init__(self):
        super().__init__()
        self.title("Canvas + Gradescope Deadline Extensions")
        self.geometry("1240x760")
        self.minsize(1000, 650)
        self.option_add("*Font", "TkDefaultFont 12")
        self.config_data = load_config()
        self.zone = ZoneInfo(self.config_data.get("app", {}).get("timezone", "America/New_York"))
        self.canvas = None
        self.gradescope = None
        self.gs_course_id = None
        self.gs_students = []
        self.courses = []
        self.course_by_label = {}
        self.students = []
        self.student_by_label = {}
        self.assignments = {}
        self.gs_matches = {}
        self.manual_dates = {}
        self.term_var = StringVar()
        self.course_var = StringVar()
        self.student_var = StringVar()
        self.mode_var = StringVar(value="shift")
        self.days_var = StringVar(value="3")
        self.due_var = StringVar()
        self.late_var = StringVar()
        self.sync_gs_var = BooleanVar(value=True)
        self.status_var = StringVar(value="Starting…")
        self._build()
        self.after(100, lambda: self.run_task("Connecting to Canvas…", self._connect,
                                              self._finish_courses, self._connection_error))

    def _build(self):
        outer = ttk.Frame(self, padding=16)
        outer.pack(fill="both", expand=True)

        heading = ttk.Label(outer, text="Student deadline extension", font=("TkDefaultFont", 20, "bold"))
        heading.pack(anchor="w")
        ttk.Label(outer, text="Choose a Canvas term, course, student, and assignments. Preview before anything is changed.").pack(anchor="w", pady=(2, 14))

        selectors = ttk.LabelFrame(outer, text="1. Choose student", padding=10)
        selectors.pack(fill="x")
        for column, (label, variable, width) in enumerate([
            ("Term", self.term_var, 24), ("Course", self.course_var, 48), ("Student", self.student_var, 36)
        ]):
            ttk.Label(selectors, text=label).grid(row=0, column=column, sticky="w", padx=(0, 8))
            combo = ttk.Combobox(selectors, textvariable=variable, width=width, state="readonly")
            combo.grid(row=1, column=column, sticky="ew", padx=(0, 12))
            if label == "Term": self.term_combo = combo; combo.bind("<<ComboboxSelected>>", self._term_changed)
            if label == "Course": self.course_combo = combo; combo.bind("<<ComboboxSelected>>", self._course_changed)
            if label == "Student": self.student_combo = combo; combo.bind("<<ComboboxSelected>>", self._student_changed)
            selectors.columnconfigure(column, weight=1 if label != "Term" else 0)
        ttk.Button(selectors, text="Get Canvas token…", command=self._open_canvas_token_page).grid(
            row=1, column=3, sticky="e", padx=(4, 0)
        )

        assignment_box = ttk.LabelFrame(outer, text="2. Select assignments", padding=10)
        assignment_box.pack(fill="both", expand=True, pady=12)
        toolbar = ttk.Frame(assignment_box)
        toolbar.pack(fill="x", pady=(0, 8))
        ttk.Button(toolbar, text="Select all", command=lambda: self.tree.selection_set(self.tree.get_children())).pack(side="left")
        ttk.Button(toolbar, text="Clear", command=lambda: self.tree.selection_remove(self.tree.selection())).pack(side="left", padx=6)
        ttk.Button(toolbar, text="Set dates for selected…", command=self._manual_selected).pack(side="left", padx=12)
        ttk.Label(toolbar, text="Double-click an assignment to set its dates manually.").pack(side="right")

        columns = ("name", "canvas_due", "canvas_late", "gradescope", "new_due", "new_late")
        self.tree = ttk.Treeview(assignment_box, columns=columns, show="headings", selectmode="extended", height=12)
        headings = {"name": "Assignment", "canvas_due": "Current due", "canvas_late": "Current until",
                    "gradescope": "Gradescope", "new_due": "New due", "new_late": "New until"}
        for key in columns:
            self.tree.heading(key, text=headings[key])
            self.tree.column(key, width=260 if key == "name" else 150, anchor="w")
        self.tree.pack(side="left", fill="both", expand=True)
        scroll = ttk.Scrollbar(assignment_box, orient="vertical", command=self.tree.yview)
        scroll.pack(side="right", fill="y")
        self.tree.configure(yscrollcommand=scroll.set)
        self.tree.bind("<Double-1>", lambda _event: self._manual_selected())

        controls = ttk.LabelFrame(outer, text="3. Choose how to change selected deadlines", padding=10)
        controls.pack(fill="x")
        ttk.Radiobutton(controls, text="Increase both by", variable=self.mode_var, value="shift").grid(row=0, column=0, sticky="w")
        ttk.Entry(controls, textvariable=self.days_var, width=7).grid(row=0, column=1, padx=5)
        ttk.Label(controls, text="days").grid(row=0, column=2, sticky="w", padx=(0, 18))
        ttk.Radiobutton(controls, text="Use one date for all", variable=self.mode_var, value="same").grid(row=0, column=3, sticky="w")
        ttk.Label(controls, text="Due").grid(row=0, column=4, padx=(8, 3))
        ttk.Entry(controls, textvariable=self.due_var, width=18).grid(row=0, column=5)
        ttk.Label(controls, text="Until (blank = no late window)").grid(row=0, column=6, padx=(8, 3))
        ttk.Entry(controls, textvariable=self.late_var, width=18).grid(row=0, column=7)
        ttk.Radiobutton(controls, text="Manual dates", variable=self.mode_var, value="manual").grid(row=0, column=8, padx=16)
        ttk.Checkbutton(controls, text="Also update matched Gradescope extensions", variable=self.sync_gs_var).grid(row=1, column=0, columnspan=5, sticky="w", pady=(10, 0))
        ttk.Label(controls, text=f"Dates use {self.zone.key}; format: YYYY-MM-DD HH:MM").grid(row=1, column=5, columnspan=4, sticky="e", pady=(10, 0))

        footer = ttk.Frame(outer)
        footer.pack(fill="x", pady=(12, 0))
        ttk.Label(footer, textvariable=self.status_var).pack(side="left")
        self.preview_button = ttk.Button(footer, text="Preview changes", command=self._preview)
        self.preview_button.pack(side="right")
        self.apply_button = ttk.Button(footer, text="Apply confirmed changes", command=self._apply, state="disabled")
        self.apply_button.pack(side="right", padx=8)

    def run_task(self, status, operation, done=None, error=None):
        self.status_var.set(status)
        def worker():
            try:
                result = operation()
            except Exception as exc:
                def report_failure(captured_exc=exc):
                    if error:
                        error(captured_exc)
                    else:
                        self.status_var.set("Ready")
                        messagebox.showerror("Deadline manager", str(captured_exc))
                self.after(0, report_failure)
            else:
                self.after(0, lambda: done(result) if done else None)
        threading.Thread(target=worker, daemon=True).start()

    def _connection_error(self, exc):
        self.status_var.set(f"Canvas not connected — {exc}")
        if "Canvas token was not found" not in str(exc):
            messagebox.showerror("Canvas connection failed", str(exc))
            return
        if sys.platform != "darwin":
            messagebox.showerror("Canvas token needed", str(exc))
            return
        if not messagebox.askyesno(
            "Canvas token needed",
            "The app needs a Canvas access token to list your courses.\n\n"
            "Would you like to open Georgia Tech Canvas and enter one now? "
            "It will be stored in macOS Keychain, not in the config file.",
        ):
            return
        self._open_canvas_token_page()
        token = simpledialog.askstring("Canvas access token",
                                       "Generate a token on the Canvas page that just opened, then paste it here:",
                                       show="•", parent=self)
        if not token or not token.strip():
            return
        settings = self.config_data["canvas"]
        result = subprocess.run(
            ["/usr/bin/security", "add-generic-password", "-U", "-a",
             settings.get("token_keychain_account", "canvas"), "-s",
             settings["token_keychain_service"], "-w", token.strip()],
            capture_output=True, text=True, check=False,
        )
        if result.returncode:
            messagebox.showerror("Could not save token", result.stderr.strip() or "macOS Keychain rejected the token")
            return
        self.run_task("Connecting to Canvas…", self._connect, self._finish_courses, self._connection_error)

    @staticmethod
    def _open_canvas_token_page():
        webbrowser.open("https://gatech.instructure.com/profile/settings", new=2)

    def _connect(self):
        self.canvas = CanvasClient(self.config_data["canvas"])
        return self.canvas.courses()

    def _finish_courses(self, courses):
        self.courses = courses
        terms = sorted({c["term"]["name"] for c in courses}, reverse=True)
        self.term_combo["values"] = terms
        if terms:
            self.term_var.set(terms[0]); self._term_changed()
        self.status_var.set(f"Connected to Canvas — {len(courses)} courses found")

    def _term_changed(self, _event=None):
        matches = [c for c in self.courses if c["term"]["name"] == self.term_var.get()]
        self.course_by_label = {f"{c.get('course_code', '')} — {c['name']}": c for c in matches}
        self.course_combo["values"] = list(self.course_by_label)
        self.course_var.set(""); self.student_var.set(""); self._clear_tree()

    def _course_changed(self, _event=None):
        course = self.course_by_label[self.course_var.get()]
        self.run_task("Loading Canvas roster and assignments…",
                      lambda: (self.canvas.students(str(course["id"])), self.canvas.assignments(str(course["id"]))),
                      self._finish_course)

    def _finish_course(self, result):
        self.students, assignments = result
        self.student_by_label = {f"{s['name']} — {s.get('email') or 'no email'}": s for s in self.students}
        self.student_combo["values"] = sorted(self.student_by_label, key=str.casefold)
        self.assignments = {str(a["id"]): a for a in assignments if a.get("due_at")}
        self._populate_tree()
        self.status_var.set(f"Loaded {len(self.students)} students and {len(self.assignments)} dated assignments")
        self.run_task("Checking Gradescope matches…", self._load_gradescope, self._finish_gradescope)

    def _load_gradescope(self):
        if not self.gradescope:
            self.gradescope = GradescopeClient(self.config_data["gradescope"])
        course = self.course_by_label[self.course_var.get()]
        course_map = self.config_data.get("gradescope_course_map", {})
        gs_id, _ = self.gradescope.match_course(course, str(course_map.get(str(course["id"]), "")) or None)
        if not gs_id:
            return None, {}, []
        explicit = self.config_data.get("gradescope_assignment_map", {}).get(str(course["id"]), {})
        gs_assignments = self.gradescope.assignments(gs_id)
        matches = {}
        for canvas_id, assignment in self.assignments.items():
            wanted = str(explicit.get(canvas_id, ""))
            candidates = [g for g in gs_assignments if str(g.assignment_id) == wanted] if wanted else [g for g in gs_assignments if normalized(g.name) == normalized(assignment["name"])]
            if len(candidates) == 1: matches[canvas_id] = candidates[0]
        return gs_id, matches, self.gradescope.students(gs_id)

    def _finish_gradescope(self, result):
        self.gs_course_id, self.gs_matches, self.gs_students = result
        self._populate_tree()
        count = len(self.gs_matches)
        self.status_var.set(f"Ready — {count} assignment{'s' if count != 1 else ''} matched to Gradescope" if self.gs_course_id else "Ready — no unique Gradescope course match; Canvas updates are available")

    def _student_changed(self, _event=None):
        self.apply_button.configure(state="disabled")

    def _clear_tree(self):
        for item in self.tree.get_children(): self.tree.delete(item)

    def _display(self, value):
        dt = parse_iso(value) if isinstance(value, str) else value
        return dt.astimezone(self.zone).strftime(DATE_FORMAT) if dt else "—"

    def _populate_tree(self):
        selected = set(self.tree.selection())
        self._clear_tree()
        for aid, assignment in sorted(self.assignments.items(), key=lambda pair: pair[1].get("due_at") or ""):
            gs = self.gs_matches.get(aid)
            manual = self.manual_dates.get(aid)
            self.tree.insert("", "end", iid=aid, values=(assignment["name"], self._display(assignment.get("due_at")),
                self._display(assignment.get("lock_at")), gs.name if gs else "—",
                self._display(manual.due) if manual else "—", self._display(manual.late) if manual else "—"))
            if aid in selected: self.tree.selection_add(aid)

    def _read_date(self, text, required=False):
        if not text.strip():
            if required: raise ValueError("A due date is required")
            return None
        return datetime.strptime(text.strip(), DATE_FORMAT).replace(tzinfo=self.zone)

    def _manual_selected(self):
        selected = self.tree.selection()
        if not selected: return messagebox.showinfo("Manual dates", "Select one or more assignments first.")
        due_text = simpledialog.askstring("Manual normal deadline", "New due date (YYYY-MM-DD HH:MM):", parent=self)
        if due_text is None: return
        late_text = simpledialog.askstring("Manual late deadline", "New until/late date (blank for none):", parent=self)
        if late_text is None: return
        try: dates = Dates(self._read_date(due_text, True), self._read_date(late_text)); dates.validate()
        except ValueError as exc: return messagebox.showerror("Invalid dates", str(exc))
        for aid in selected: self.manual_dates[aid] = dates
        self.mode_var.set("manual"); self._populate_tree(); self.apply_button.configure(state="disabled")

    def _plans(self, resolve_existing=False):
        if not self.student_var.get(): raise ValueError("Choose a student")
        selected = self.tree.selection()
        if not selected: raise ValueError("Select at least one assignment")
        plans = []
        course = self.course_by_label[self.course_var.get()]
        student = self.student_by_label[self.student_var.get()]
        for aid in selected:
            assignment = self.assignments[aid]
            mode = self.mode_var.get()
            current = Dates(parse_iso(assignment["due_at"]), parse_iso(assignment.get("lock_at")))
            if mode == "shift" and resolve_existing:
                override = self.canvas.student_override(str(course["id"]), aid, str(student["id"]))
                if override and override.get("due_at"):
                    current = Dates(parse_iso(override["due_at"]), parse_iso(override.get("lock_at")))
            if mode == "shift": result = calculate_dates(current, mode, days=float(self.days_var.get()))
            elif mode == "same": result = calculate_dates(current, mode, due=self._read_date(self.due_var.get(), True), late=self._read_date(self.late_var.get()))
            else:
                if aid not in self.manual_dates: raise ValueError(f"Set manual dates for {assignment['name']}")
                result = self.manual_dates[aid]
            plans.append((aid, assignment, result))
        return plans

    def _preview(self):
        try: self._plans()
        except (ValueError, TypeError) as exc: return messagebox.showerror("Cannot preview", str(exc))
        self.run_task("Resolving existing student overrides…", lambda: self._plans(True), self._show_preview)

    def _show_preview(self, plans):
        lines = []
        for aid, assignment, dates in plans:
            target = "Canvas + Gradescope" if self.sync_gs_var.get() and aid in self.gs_matches else "Canvas only"
            lines.append(f"• {assignment['name']}\n  Due: {self._display(dates.due)}\n  Until: {self._display(dates.late)}\n  {target}")
        if messagebox.askyesno("Confirm deadline changes", "\n\n".join(lines) + "\n\nEnable the Apply button for these changes?"):
            self.pending_plans = plans
            self.apply_button.configure(state="normal")
        self.status_var.set("Ready")

    def _apply(self):
        plans = getattr(self, "pending_plans", None)
        if not plans: return
        self.apply_button.configure(state="disabled")
        self.run_task("Applying confirmed changes…", lambda: self._perform_apply(plans), self._finish_apply)

    def _perform_apply(self, plans):
        course = self.course_by_label[self.course_var.get()]
        student = self.student_by_label[self.student_var.get()]
        gs_student = None
        if self.gs_course_id and student.get("email"):
            hits = [s for s in self.gs_students if (s.email or "").casefold() == student["email"].casefold()]
            gs_student = hits[0] if len(hits) == 1 else None
        results = []
        for aid, assignment, dates in plans:
            canvas_ok = gs_ok = False
            errors = []
            try:
                self.canvas.save_override(str(course["id"]), aid, student, dates.due.isoformat(), dates.late.isoformat() if dates.late else None)
                canvas_ok = True
            except Exception as exc: errors.append(f"Canvas: {exc}")
            if self.sync_gs_var.get() and aid in self.gs_matches:
                if not gs_student: errors.append("Gradescope: student email did not uniquely match")
                else:
                    try:
                        gs = self.gs_matches[aid]
                        self.gradescope.save_extension(self.gs_course_id, str(gs.assignment_id), str(gs_student.user_id), dates.due, dates.late)
                        gs_ok = True
                    except Exception as exc: errors.append(f"Gradescope: {exc}")
            results.append((assignment["name"], canvas_ok, gs_ok, errors))
        return results

    def _finish_apply(self, results):
        successes = sum(1 for _, ok, _, errors in results if ok and not errors)
        details = []
        for name, canvas_ok, gs_ok, errors in results:
            details.append(f"{name}: Canvas {'✓' if canvas_ok else '✗'}, Gradescope {'✓' if gs_ok else ('—' if not self.sync_gs_var.get() else '✗')}" + ("\n  " + "; ".join(errors) if errors else ""))
        self.status_var.set(f"Finished — {successes} of {len(results)} completed without errors")
        messagebox.showinfo("Deadline update results", "\n\n".join(details))


if __name__ == "__main__":
    try:
        app = DeadlineApp()
    except Exception as exc:
        root = Tk(); root.withdraw(); messagebox.showerror("Deadline manager", str(exc)); raise SystemExit(1)
    app.mainloop()
