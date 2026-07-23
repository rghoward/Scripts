import html
import json
from types import SimpleNamespace

import requests
import os

from coordinator.database import connect, initialize
from coordinator.gradescope_importer import _close_connection, parse_assignment_catalog, parse_course_catalog, reconcile_assignment_catalog


def test_course_catalog_tracks_term_and_ignores_unrelated_links():
    page = """
    <div class="courseList">
      <div class="courseList--term">Summer 2026</div>
      <div class="courseList--coursesForTerm">
        <a class="courseBox" href="/courses/123"><h3 class="courseBox--shortname">CS-9999-A</h3><div class="courseBox--name">Example Course</div></a>
        <a href="/courses/not-an-id">Ignore me</a>
      </div>
    </div>
    """
    assert parse_course_catalog(page) == [{
        "gradescope_id": "123", "code": "CS-9999-A", "name": "Example Course", "term": "Summer 2026",
    }]


def test_assignment_catalog_reads_react_payload():
    assignment = {
        "id": "456", "title": "Example Exam",
        "submission_window": {"due_date": "2026-07-01", "hard_due_date": "2026-07-02"},
    }
    payload = html.escape(json.dumps({"table_data": [assignment]}), quote=True)
    page = f'<div data-react-class="AssignmentsTable" data-react-props="{payload}"></div>'
    assert parse_assignment_catalog(page) == [assignment]


def test_close_connection_persists_requests_cookies_without_logging_out(tmp_path):
    session = requests.Session()
    session.cookies.set("example", "value", domain="www.gradescope.com", path="/")
    connection = SimpleNamespace(
        session=session,
        logged_in=True,
        account=object(),
        _coordinator_cookie_path=tmp_path / "session.cookies",
        _coordinator_lock_handle=None,
    )
    _close_connection(connection)
    contents = (tmp_path / "session.cookies").read_text()
    assert "example" in contents
    assert connection.logged_in is False


def test_reconciliation_preserves_imported_assignment_and_removes_empty_duplicate(tmp_path):
    previous = os.environ.get("GRADING_COORDINATOR_DATA_DIR")
    os.environ["GRADING_COORDINATOR_DATA_DIR"] = str(tmp_path)
    try:
        initialize()
        with connect() as database:
            course_id = database.execute(
                "INSERT INTO courses (gradescope_id, code, name, term) VALUES ('1','CS','Course','Term')"
            ).lastrowid
            canonical = database.execute(
                "INSERT INTO assignments (course_id, gradescope_id, title, imported_at) VALUES (?, '123', 'Exam', 'now')",
                (course_id,),
            ).lastrowid
            database.execute(
                "INSERT INTO assignments (course_id, gradescope_id, title) VALUES (?, 'assignment_123', 'Exam')",
                (course_id,),
            )
            removed = reconcile_assignment_catalog(database, course_id)
            remaining = database.execute("SELECT id, gradescope_id FROM assignments").fetchall()
        assert removed == 1
        assert [(row["id"], row["gradescope_id"]) for row in remaining] == [(canonical, "123")]
    finally:
        if previous is None:
            os.environ.pop("GRADING_COORDINATOR_DATA_DIR", None)
        else:
            os.environ["GRADING_COORDINATOR_DATA_DIR"] = previous
