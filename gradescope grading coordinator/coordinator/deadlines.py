from __future__ import annotations

import os
from datetime import datetime, timedelta, timezone
from html import escape

from .database import connect


def _notification_copy(round_row, grader, cells: int, remaining: int, kind: str) -> tuple[str, str]:
    public_url = os.environ.get("COORDINATOR_PUBLIC_URL", "http://127.0.0.1:8844").rstrip("/")
    labels = {
        "assignment": "New grading assignment",
        "deadline_changed": "Grading deadline updated",
        "reminder_24h": "Grading deadline reminder",
        "overdue": "Grading work is overdue",
    }
    subject = f"{labels[kind]}: {round_row['course_code']} {round_row['assignment_title']}"
    body = f"""<p>Hello {escape(grader['name'])},</p>
<p>{escape(labels[kind])} for <strong>{escape(round_row['course_code'])} — {escape(round_row['assignment_title'])}</strong>.</p>
<ul><li>Batch: {escape(round_row['name'])}</li><li>Assigned responses: {cells}</li><li>Currently remaining: {remaining}</li><li>Deadline: {escape(round_row['due_at'])} ({escape(round_row['deadline_timezone'])})</li></ul>
{f"<p>{escape(round_row['deadline_note'])}</p>" if round_row['deadline_note'] else ""}
<p><a href="{public_url}/graders/{grader['id']}">Open your grading dashboard</a></p>
<p>Assignments are guidance and do not prevent you from helping with other Gradescope work.</p>"""
    return subject, body


def sync_round_notifications(round_id: int, *, include_assignment: bool = False, deadline_changed: bool = False) -> int:
    now = datetime.now(timezone.utc)
    with connect() as database:
        round_row = database.execute(
            """SELECT r.*, a.title assignment_title, c.code course_code
            FROM rounds r JOIN assignments a ON a.id=r.assignment_id
            JOIN courses c ON c.id=a.course_id WHERE r.id=?""",
            (round_id,),
        ).fetchone()
        if not round_row or not round_row["due_at"]:
            return 0
        due = datetime.fromisoformat(round_row["due_at"])
        database.execute(
            """UPDATE notifications SET status='cancelled' WHERE round_id=? AND status='pending'
            AND kind IN ('reminder_24h','deadline_changed') AND dedupe_key NOT LIKE ?""",
            (round_id, f"%:due:{round_row['due_at']}"),
        )
        graders = database.execute(
            """SELECT g.*, COUNT(al.id) cells,
            SUM(CASE WHEN ga.id IS NULL THEN 1 ELSE 0 END) remaining
            FROM graders g JOIN allocations al ON al.grader_id=g.id AND al.round_id=?
            JOIN rounds r ON r.id=al.round_id JOIN questions q ON q.id=al.question_id
            LEFT JOIN grading_activity ga ON ga.assignment_id=q.assignment_id
              AND ga.submission_id=al.submission_id AND ga.question_id=al.question_id
            GROUP BY g.id ORDER BY g.name""",
            (round_id,),
        ).fetchall()
        created = 0
        for grader in graders:
            kinds = []
            if include_assignment:
                kinds.append(("assignment", now))
            if deadline_changed:
                kinds.append(("deadline_changed", now))
            kinds.append(("reminder_24h", max(now, due - timedelta(hours=24))))
            for kind, scheduled in kinds:
                subject, body = _notification_copy(round_row, grader, grader["cells"], grader["remaining"], kind)
                key = f"round:{round_id}:grader:{grader['id']}:{kind}:due:{round_row['due_at']}"
                cursor = database.execute(
                    """INSERT OR IGNORE INTO notifications
                    (round_id, grader_id, kind, scheduled_at, subject, body_html, dedupe_key)
                    VALUES (?, ?, ?, ?, ?, ?, ?)""",
                    (round_id, grader["id"], kind, scheduled.isoformat(), subject, body, key),
                )
                created += int(cursor.rowcount > 0)
        return created


def set_round_deadline(round_id: int, due_at: datetime, timezone_name: str, note: str) -> None:
    if due_at.tzinfo is None:
        raise ValueError("Deadline must include a time zone")
    due_utc = due_at.astimezone(timezone.utc)
    if due_utc <= datetime.now(timezone.utc):
        raise ValueError("Deadline must be in the future")
    with connect() as database:
        row = database.execute("SELECT status FROM rounds WHERE id=?", (round_id,)).fetchone()
        if not row:
            raise ValueError("Batch not found")
        database.execute(
            """UPDATE rounds SET due_at=?, deadline_timezone=?, deadline_note=?, deadline_updated_at=? WHERE id=?""",
            (due_utc.isoformat(), timezone_name, note.strip(), datetime.now(timezone.utc).isoformat(), round_id),
        )
        published = row["status"] == "published"
    if published:
        sync_round_notifications(round_id, deadline_changed=True)


def due_notification_previews(now: datetime | None = None) -> list[dict]:
    """Return deliverable messages and suppress completed-work reminders; never sends mail."""
    current = (now or datetime.now(timezone.utc)).isoformat()
    with connect() as database:
        due = database.execute(
            """SELECT n.*, g.name grader_name, g.email,
            SUM(CASE WHEN ga.id IS NULL THEN 1 ELSE 0 END) remaining
            FROM notifications n JOIN graders g ON g.id=n.grader_id
            JOIN allocations al ON al.round_id=n.round_id AND al.grader_id=n.grader_id
            JOIN questions q ON q.id=al.question_id
            LEFT JOIN grading_activity ga ON ga.assignment_id=q.assignment_id
              AND ga.submission_id=al.submission_id AND ga.question_id=al.question_id
            WHERE n.status='pending' AND n.scheduled_at<=? GROUP BY n.id ORDER BY n.scheduled_at""",
            (current,),
        ).fetchall()
        result = []
        for row in due:
            if row["kind"] in {"reminder_24h", "overdue"} and row["remaining"] == 0:
                database.execute("UPDATE notifications SET status='suppressed' WHERE id=?", (row["id"],))
                continue
            result.append(dict(row))
        return result
