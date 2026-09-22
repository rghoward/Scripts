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
    late_report_ready,
    late_report_csv,
    late_report_recipients,
    late_allowance_notice_message,
    late_submissions,
    parse_lateness,
    queue_late_allowance_notices,
    record_late_submissions,
    report_recipients,
    student_message,
    summary_message,
    sync_assignment_schedule,
    weekly_backcheck_key,
    weekly_backcheck_message,
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

    def test_weekly_backcheck_starts_after_monday_at_eight(self):
        schedule = {"backcheck_weekday": "Monday", "backcheck_hour": 8}
        self.assertIsNone(
            weekly_backcheck_key(datetime(2026, 9, 21, 7, 59, tzinfo=self.zone), schedule)
        )
        self.assertEqual(
            weekly_backcheck_key(datetime(2026, 9, 21, 8, 0, tzinfo=self.zone), schedule),
            "2026-W39",
        )
        self.assertEqual(
            weekly_backcheck_key(datetime(2026, 9, 23, 12, 0, tzinfo=self.zone), schedule),
            "2026-W39",
        )

    def test_weekly_backcheck_no_changes_has_clear_wording(self):
        subject, body, html_body = weekly_backcheck_message([], 7)
        self.assertIn("no new records found", subject)
        self.assertIn("New late submissions found: 0", body)
        self.assertIn("No newly reported late submissions", html_body)

    def test_late_report_waits_ten_minutes_after_close(self):
        late = datetime(2026, 9, 20, 23, 59, tzinfo=self.zone)
        schedule = {"late_report_delay_minutes": 10}
        self.assertFalse(
            late_report_ready(datetime(2026, 9, 21, 0, 8, 59, tzinfo=self.zone), late, schedule)
        )
        self.assertTrue(
            late_report_ready(datetime(2026, 9, 21, 0, 9, tzinfo=self.zone), late, schedule)
        )

    def test_weekly_backcheck_flags_third_late_submission(self):
        course = {"code": "CS 2050"}
        assignment = SimpleNamespace(name="Homework 4")
        item = LateSubmission(
            "sid:123", "123", "Taylor", "Example", "taylor@example.edu",
            "2026-09-27 23:58:00 -0400", 172740,
        )
        subject, body, html_body = weekly_backcheck_message(
            [(course, assignment, item, 3)], 8
        )
        self.assertIn("requires policy review", subject)
        self.assertIn("semester total: 3 — REVIEW FOR ZERO", body)
        self.assertIn("REVIEW FOR ZERO", html_body)

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

    def test_late_allowance_notice_explains_current_and_future_status(self):
        student = Student("Taylor", "Example", "taylor@example.edu")
        course = {
            "code": "CS 2050",
            "policy": "Two late homeworks are allowed; additional late homework receives a zero.",
        }
        assignment = SimpleNamespace(name="Homework 4")
        subject, body, html_body = late_allowance_notice_message(
            student, course, assignment, 2, 2, preview=True
        )
        self.assertIn("PREVIEW", subject)
        self.assertIn("remains eligible for credit", body)
        self.assertIn("Any additional homework", body)
        self.assertIn("one-time automated notice", body)
        self.assertIn("Late allowance used", html_body)

    def test_retroactive_notice_names_second_late_homework(self):
        student = Student("Taylor", "Example", "taylor@example.edu")
        course = {
            "code": "CS 2050",
            "policy": "Two late homeworks are allowed; additional late homework receives a zero.",
        }
        assignment = SimpleNamespace(name="Homework 2")
        subject, body, html_body = late_allowance_notice_message(
            student, course, assignment, 3, 2, preview=True, retroactive=True
        )
        self.assertIn("PREVIEW", subject)
        self.assertIn("Homework 2 was your 2nd late homework submission", body)
        self.assertIn("currently shows 3 late homework submissions", body)
        self.assertIn("second late homework, remained eligible", body)
        self.assertIn("sent retroactively", html_body)

    def test_late_allowance_notice_is_queued_once_at_limit(self):
        database = sqlite3.connect(":memory:")
        database.execute(
            """CREATE TABLE late_submissions (
            course_id TEXT, assignment_id TEXT, student_key TEXT, sid TEXT,
            first_name TEXT, last_name TEXT, email TEXT, submitted_at TEXT,
            lateness_seconds INTEGER, recorded_at TEXT,
            PRIMARY KEY (course_id, assignment_id, student_key))"""
        )
        database.execute(
            """CREATE TABLE late_allowance_notices (
            course_id TEXT, student_key TEXT, email TEXT, first_name TEXT,
            last_name TEXT, assignment_id TEXT, assignment_name TEXT,
            total_lates INTEGER, status TEXT, created_at TEXT, sent_at TEXT,
            last_error TEXT, retroactive INTEGER NOT NULL DEFAULT 0,
            PRIMARY KEY (course_id, student_key))"""
        )
        student = LateSubmission(
            "sid:123", "123", "Taylor", "Example", "taylor@example.edu",
            "time", 60,
        )
        course = {"id": "1", "allowed_late_submissions": 2}
        now = datetime.now(self.zone)
        record_late_submissions(database, "1", "1", [student], now)
        self.assertEqual(
            queue_late_allowance_notices(
                database, course, SimpleNamespace(assignment_id="1", name="Homework 1"),
                [student], now,
            ),
            0,
        )
        record_late_submissions(database, "1", "2", [student], now)
        assignment = SimpleNamespace(assignment_id="2", name="Homework 2")
        self.assertEqual(
            queue_late_allowance_notices(database, course, assignment, [student], now), 1
        )
        self.assertEqual(
            queue_late_allowance_notices(database, course, assignment, [student], now), 0
        )

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
        self.assertIn("semester total: 3 — REVIEW FOR ZERO", body)
        self.assertIn("Late on this assignment", html_body)
        self.assertIn("Late total", html_body)
        csv_body = late_report_csv(database, course, "3")
        self.assertIn("Late on This Assignment,Late Submission Count,Policy Status", csv_body)
        self.assertIn("John,Example,123,john@example.edu,Yes,3,REVIEW FOR ZERO", csv_body)

    def test_current_lates_are_sorted_by_total_then_name(self):
        database = sqlite3.connect(":memory:")
        database.execute(
            """CREATE TABLE late_submissions (
            course_id TEXT, assignment_id TEXT, student_key TEXT, sid TEXT,
            first_name TEXT, last_name TEXT, email TEXT, submitted_at TEXT,
            lateness_seconds INTEGER, recorded_at TEXT,
            PRIMARY KEY (course_id, assignment_id, student_key))"""
        )
        current = [
            LateSubmission("sid:2", "2", "Zoe", "Zulu", "z@example.edu", "time", 60),
            LateSubmission("sid:1", "1", "Amy", "Alpha", "a@example.edu", "time", 120),
        ]
        record_late_submissions(database, "1", "2", current, datetime.now(self.zone))
        database.execute(
            "INSERT INTO late_submissions VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
            ("1", "1", "sid:2", "2", "Zoe", "Zulu", "z@example.edu", "time", 30, "now"),
        )
        course = {
            "id": "1", "code": "CS 2050", "name": "Discrete Math",
            "term": "Fall 2026",
        }
        assignment = SimpleNamespace(name="Homework 2")
        _subject, body, _html = late_report_message(
            database, course, assignment,
            datetime(2026, 9, 1, tzinfo=self.zone),
            datetime(2026, 9, 3, tzinfo=self.zone), current,
        )
        current_section = body.split("Late on this assignment:", 1)[1].split(
            "Semester running totals:", 1
        )[0]
        self.assertLess(current_section.index("Zoe Zulu"), current_section.index("Amy Alpha"))

    def test_late_counter_requires_gradescope_late_badge(self):
        class Response:
            def __init__(self, text):
                self.text = text

            def raise_for_status(self):
                return None

        class Connection:
            connection = SimpleNamespace(gradescope_base_url="https://www.gradescope.com")

            def get(self, url, **kwargs):
                if url.endswith("/review_grades"):
                    return Response(
                        '<table><tr><td><a href="/courses/1/assignments/2/submissions/100">submission</a></td>'
                        '<td><span class="lateSubmissionBadge">Late</span></td></tr>'
                        '<tr><td><a href="/courses/1/assignments/2/submissions/200">submission</a></td></tr></table>'
                    )
                return Response(
                    "First Name,Last Name,SID,Email,Status,Submission ID,Submission Time,Lateness (H:M:S)\n"
                    "Late,Student,1,late@example.edu,Graded,100,time,48:00:29\n"
                    "Not,Tagged,2,tagged@example.edu,Graded,200,time,00:00:25\n"
                )

        result = late_submissions(Connection(), "1", "2", 48)
        self.assertEqual([item.email for item in result], ["late@example.edu"])

    def test_recording_replaces_stale_assignment_late_rows(self):
        database = sqlite3.connect(":memory:")
        database.execute(
            """CREATE TABLE late_submissions (
            course_id TEXT, assignment_id TEXT, student_key TEXT, sid TEXT,
            first_name TEXT, last_name TEXT, email TEXT, submitted_at TEXT,
            lateness_seconds INTEGER, recorded_at TEXT,
            PRIMARY KEY (course_id, assignment_id, student_key))"""
        )
        database.execute(
            "INSERT INTO late_submissions VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
            ("1", "2", "sid:stale", "stale", "Stale", "Student",
             "stale@example.edu", "time", 1, "now"),
        )
        current = [
            LateSubmission(
                "sid:current", "current", "Current", "Student",
                "current@example.edu", "time", 60,
            )
        ]
        record_late_submissions(database, "1", "2", current, datetime.now(self.zone))
        keys = [row[0] for row in database.execute(
            "SELECT student_key FROM late_submissions WHERE course_id='1' AND assignment_id='2'"
        )]
        self.assertEqual(keys, ["sid:current"])

    def test_report_recipients_include_unique_course_specific_addresses(self):
        config = {"delivery": {"summary_email": "owner@example.edu"}}
        course = {
            "additional_report_emails": [
                "ta1@example.edu", "OWNER@example.edu", "ta2@example.edu",
            ]
        }
        self.assertEqual(
            report_recipients(config, course),
            ["owner@example.edu", "ta1@example.edu", "ta2@example.edu"],
        )

    def test_late_report_recipients_include_csv_only_addresses(self):
        config = {"delivery": {"summary_email": "owner@example.edu"}}
        course = {
            "additional_report_emails": ["ta@example.edu"],
            "additional_late_report_emails": ["csv@example.edu", "TA@example.edu"],
        }
        self.assertEqual(
            late_report_recipients(config, course),
            ["owner@example.edu", "ta@example.edu", "csv@example.edu"],
        )

    def test_additional_recipients_expire_after_configured_date(self):
        config = {"delivery": {"summary_email": "owner@example.edu"}}
        course = {
            "additional_report_emails": ["ta@example.edu"],
            "additional_late_report_emails": ["csv@example.edu"],
            "additional_email_end_date": datetime(2026, 12, 25).date(),
        }
        on_cutoff = datetime(2026, 12, 25, 23, 59, tzinfo=self.zone)
        after_cutoff = datetime(2026, 12, 26, 0, 0, tzinfo=self.zone)
        self.assertEqual(
            late_report_recipients(config, course, on_cutoff),
            ["owner@example.edu", "ta@example.edu", "csv@example.edu"],
        )
        self.assertEqual(
            late_report_recipients(config, course, after_cutoff),
            ["owner@example.edu"],
        )


if __name__ == "__main__":
    unittest.main()
