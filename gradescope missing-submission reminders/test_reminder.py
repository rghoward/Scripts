from datetime import datetime
import os
from types import SimpleNamespace
import tempfile
import unittest
from unittest.mock import patch
from zoneinfo import ZoneInfo

import sqlite3
from requests.cookies import create_cookie
from requests.exceptions import ConnectionError, ReadTimeout

import reminder
from reminder import (
    GradescopeAuthenticationBackoff,
    GradescopeAuthenticationExpired,
    LateSubmission,
    PersistentGradescopeConnection,
    Student,
    effective_late_deadline,
    failure_summary_message,
    late_report_message,
    parse_lateness,
    student_message,
    summary_message,
    sync_assignment_schedule,
    run_lock,
)


class ReminderTests(unittest.TestCase):
    def setUp(self):
        self.zone = ZoneInfo("America/New_York")

    def test_policy_deadline_wins_when_gradescope_is_later(self):
        assignment = SimpleNamespace(
            due_date=datetime(2026, 7, 24, 23, 59),
            late_due_date=datetime(2026, 7, 28, 23, 59),
        )
        actual = effective_late_deadline(assignment, self.zone, 48)
        self.assertEqual(actual, datetime(2026, 7, 26, 23, 59, tzinfo=self.zone))

    def test_gradescope_deadline_wins_when_earlier(self):
        assignment = SimpleNamespace(
            due_date=datetime(2026, 7, 22, 23, 59),
            late_due_date=datetime(2026, 7, 23, 12, 0),
        )
        actual = effective_late_deadline(assignment, self.zone, 24)
        self.assertEqual(actual, datetime(2026, 7, 23, 12, 0, tzinfo=self.zone))

    def test_message_contains_student_assignment_and_deadlines(self):
        assignment = SimpleNamespace(name="HW07")
        course = {"code": "CS 1301", "policy": "The lowest homework grade is dropped."}
        due = datetime(2026, 7, 22, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        subject, body, html_body = student_message(
            Student("Taylor", "Example", "student@example.edu"),
            course, assignment, due, late,
        )
        self.assertIn("HW07", subject)
        self.assertIn("Hello Taylor", body)
        self.assertIn("Thursday, July 23 at 11:59 PM EDT", body)
        self.assertIn("lowest homework grade", body)
        self.assertIn("already contacted me", body)
        self.assertIn("email address on your Gradescope account matches", body)
        self.assertIn("merge them", body)
        self.assertIn("Course policy", html_body)
        self.assertIn("Already submitted?", html_body)
        self.assertIn("Canvas account", html_body)
        self.assertIn("background:#003057", html_body)

    def test_summary_html_contains_counts_and_exclusions(self):
        assignment = SimpleNamespace(name="HW07")
        course = {"code": "CS 1301", "name": "Intro to Computing", "term": "Summer 2026"}
        due = datetime(2026, 7, 22, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        student = Student("Taylor", "Example", "student@example.edu")
        subject, text_body, html_body = summary_message(
            course, assignment, due, late,
            [student], [], [], [(student, "Approved exception")], [], True,
        )
        self.assertIn("CS 1301", subject)
        self.assertIn("Instructor exclusions: 1", text_body)
        self.assertIn("Instructor exclusions", html_body)
        self.assertIn("Approved exception", html_body)
        self.assertIn("background:#003057", html_body)

    def test_deadline_change_reopens_completed_assignment(self):
        database = sqlite3.connect(":memory:")
        database.execute(
            "CREATE TABLE completed_runs (course_id TEXT, assignment_id TEXT, completed_at TEXT, PRIMARY KEY (course_id, assignment_id))"
        )
        database.execute(
            "CREATE TABLE assignment_schedules (course_id TEXT, assignment_id TEXT, due_at TEXT, late_at TEXT, observed_at TEXT, PRIMARY KEY (course_id, assignment_id))"
        )
        database.execute(
            "CREATE TABLE late_reports (course_id TEXT, assignment_id TEXT, sent_at TEXT, PRIMARY KEY (course_id, assignment_id))"
        )
        database.execute(
            "CREATE TABLE late_submissions (course_id TEXT, assignment_id TEXT, student_key TEXT, PRIMARY KEY (course_id, assignment_id, student_key))"
        )
        due = datetime(2026, 7, 22, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        self.assertFalse(sync_assignment_schedule(database, "1", "2", due, late, due))
        database.execute("INSERT INTO completed_runs VALUES ('1', '2', 'now')")
        database.commit()
        new_due = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        new_late = datetime(2026, 7, 24, 23, 59, tzinfo=self.zone)
        self.assertTrue(sync_assignment_schedule(database, "1", "2", new_due, new_late, due))
        self.assertIsNone(
            database.execute(
                "SELECT 1 FROM completed_runs WHERE course_id='1' AND assignment_id='2'"
            ).fetchone()
        )

    def test_persistent_session_is_reused_without_login(self):
        class FakeConnection:
            login_count = 0

            def __init__(self):
                import requests
                self.session = requests.Session()
                self.gradescope_base_url = "https://www.gradescope.com"
                self.logged_in = False
                self.account = None

            def login(self, email, password):
                type(self).login_count += 1
                self.session.cookies.set_cookie(
                    create_cookie("_gradescope_session", "session-value", domain="gradescope.com")
                )
                self.logged_in = True
                self.account = object()

        with tempfile.TemporaryDirectory() as directory, patch.dict(
            os.environ, {"GRADESCOPE_REMINDER_STATE_DIR": directory}
        ), patch.object(reminder, "GSConnection", FakeConnection), patch.object(
            reminder, "Account", lambda session, base_url: object()
        ), patch.object(reminder, "read_gradescope_password", return_value="secret"):
            database = reminder.open_database()
            now = datetime(2026, 7, 23, 8, 0, tzinfo=self.zone)
            first = PersistentGradescopeConnection({"email": "me@example.edu"}, database, now)
            first.save()
            second = PersistentGradescopeConnection({"email": "me@example.edu"}, database, now)
            self.assertEqual(FakeConnection.login_count, 1)
            self.assertTrue(second.connection.session.cookies)
            database.close()

    def test_expired_session_reauthenticates_once(self):
        manager = PersistentGradescopeConnection.__new__(PersistentGradescopeConnection)
        manager.connection = object()
        refreshes = []
        manager._refresh_after_expiration = lambda: refreshes.append(True)
        attempts = []

        def operation(connection):
            attempts.append(connection)
            if len(attempts) == 1:
                raise GradescopeAuthenticationExpired("expired")
            return "ok"

        self.assertEqual(manager.call(operation), "ok")
        self.assertEqual(len(refreshes), 1)

    def test_authentication_failure_uses_persistent_backoff(self):
        class FailingConnection:
            login_count = 0

            def __init__(self):
                import requests
                self.session = requests.Session()
                self.gradescope_base_url = "https://www.gradescope.com"

            def login(self, email, password):
                type(self).login_count += 1
                raise ValueError("Invalid credentials")

        with tempfile.TemporaryDirectory() as directory, patch.dict(
            os.environ, {"GRADESCOPE_REMINDER_STATE_DIR": directory}
        ), patch.object(reminder, "GSConnection", FailingConnection), patch.object(
            reminder, "read_gradescope_password", return_value="bad"
        ):
            database = reminder.open_database()
            now = datetime(2026, 7, 23, 8, 0, tzinfo=self.zone)
            with self.assertRaises(RuntimeError):
                PersistentGradescopeConnection({"email": "me@example.edu"}, database, now)
            with self.assertRaises(GradescopeAuthenticationBackoff):
                PersistentGradescopeConnection({"email": "me@example.edu"}, database, now)
            self.assertEqual(FailingConnection.login_count, 1)
            retry_after = database.execute(
                "SELECT retry_after FROM authentication_state WHERE provider='gradescope'"
            ).fetchone()[0]
            self.assertEqual(
                datetime.fromisoformat(retry_after), now + reminder.timedelta(minutes=5)
            )
            database.close()

    def test_run_lock_rejects_an_overlapping_process(self):
        with tempfile.TemporaryDirectory() as directory, patch.dict(
            os.environ, {"GRADESCOPE_REMINDER_STATE_DIR": directory}
        ):
            with run_lock() as first:
                with run_lock() as second:
                    self.assertTrue(first)
                    self.assertFalse(second)

    def test_failure_summary_explains_dns_failure_and_retry(self):
        subject, body, html_body = failure_summary_message(
            ConnectionError("Failed to resolve 'www.gradescope.com'")
        )
        self.assertIn("Network or DNS", subject)
        self.assertIn("did not reject the login", body)
        self.assertIn("next five-minute check", body)
        self.assertIn("duplicate protection", body)
        self.assertIn("background:#003057", html_body)
        self.assertIn("Student-email impact", html_body)
        self.assertIn("Technical detail", html_body)

    def test_failure_summary_distinguishes_timeout(self):
        subject, body, html_body = failure_summary_message(ReadTimeout("read timed out"))
        self.assertIn("timed out", subject)
        self.assertIn("usually temporary", body)
        self.assertIn("Next step", html_body)

    def test_parse_lateness_supports_hours_over_one_day(self):
        self.assertEqual(parse_lateness("00:00:00"), 0)
        self.assertEqual(parse_lateness("00:00:25"), 25)
        self.assertEqual(parse_lateness("49:02:03"), 176523)

    def test_late_report_flags_third_late_submission(self):
        database = sqlite3.connect(":memory:")
        database.execute(
            """CREATE TABLE late_submissions (
            course_id TEXT, assignment_id TEXT, student_key TEXT, sid TEXT,
            first_name TEXT, last_name TEXT, email TEXT, submitted_at TEXT,
            lateness_seconds INTEGER, recorded_at TEXT,
            PRIMARY KEY (course_id, assignment_id, student_key))"""
        )
        for assignment_id in ("1", "2", "3"):
            database.execute(
                "INSERT INTO late_submissions VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                ("10", assignment_id, "sid:123", "123", "John", "Example",
                 "john@example.edu", "time", 25, "now"),
            )
        assignment = SimpleNamespace(name="Homework 3")
        course = {
            "id": "10", "code": "CS 2050", "name": "Discrete Math",
            "term": "Fall 2026",
        }
        due = datetime(2026, 9, 18, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 9, 20, 23, 59, tzinfo=self.zone)
        current = [
            LateSubmission(
                "sid:123", "123", "John", "Example", "john@example.edu",
                "time", 25,
            )
        ]
        subject, body, html_body = late_report_message(
            database, course, assignment, due, late, current
        )
        self.assertIn("Late-submission totals", subject)
        self.assertIn("John Example <john@example.edu>: 3", body)
        self.assertIn("ZERO-POLICY THRESHOLD EXCEEDED", body)
        self.assertIn("REVIEW FOR ZERO", html_body)


if __name__ == "__main__":
    unittest.main()
