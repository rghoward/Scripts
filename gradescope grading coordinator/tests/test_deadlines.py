import os
from datetime import datetime, timedelta, timezone

from coordinator.database import connect, initialize
from coordinator.deadlines import set_round_deadline, sync_round_notifications


def test_deadline_builds_idempotent_assignment_and_reminder_outbox(tmp_path):
    previous = os.environ.get("GRADING_COORDINATOR_DATA_DIR")
    os.environ["GRADING_COORDINATOR_DATA_DIR"] = str(tmp_path)
    try:
        initialize()
        with connect() as database:
            course = database.execute("INSERT INTO courses (gradescope_id,code,name,term) VALUES ('c','CS','Course','Term')").lastrowid
            assignment = database.execute("INSERT INTO assignments (course_id,gradescope_id,title) VALUES (?,'a','Exam')", (course,)).lastrowid
            grader = database.execute("INSERT INTO graders (name,email) VALUES ('TA','ta@example.edu')").lastrowid
            question = database.execute("INSERT INTO questions (assignment_id,gradescope_id,position,label) VALUES (?,'q',1,'Q1')", (assignment,)).lastrowid
            submission = database.execute("INSERT INTO submissions (assignment_id,gradescope_id,student_key,student_name,display_index) VALUES (?,'s','student','',1)", (assignment,)).lastrowid
            round_id = database.execute("INSERT INTO rounds (assignment_id,name,kind,snapshot_at) VALUES (?,'Initial','initial','now')", (assignment,)).lastrowid
            database.execute("INSERT INTO allocations (round_id,submission_id,question_id,grader_id) VALUES (?,?,?,?)", (round_id,submission,question,grader))
        set_round_deadline(round_id, datetime.now(timezone.utc) + timedelta(days=2), "UTC", "Please finish on time.")
        created = sync_round_notifications(round_id, include_assignment=True)
        repeated = sync_round_notifications(round_id, include_assignment=True)
        with connect() as database:
            notifications = database.execute("SELECT kind,status FROM notifications ORDER BY kind").fetchall()
        assert created == 2
        assert repeated == 0
        assert [(row["kind"], row["status"]) for row in notifications] == [
            ("assignment", "pending"), ("reminder_24h", "pending"),
        ]
    finally:
        if previous is None:
            os.environ.pop("GRADING_COORDINATOR_DATA_DIR", None)
        else:
            os.environ["GRADING_COORDINATOR_DATA_DIR"] = previous
