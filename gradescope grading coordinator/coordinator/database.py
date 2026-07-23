from __future__ import annotations

import os
import sqlite3
from contextlib import contextmanager
from pathlib import Path


PROJECT_DIR = Path(__file__).resolve().parents[1]


def data_dir() -> Path:
    override = os.environ.get("GRADING_COORDINATOR_DATA_DIR")
    if override:
        return Path(override)
    return PROJECT_DIR / "data"


def database_path() -> Path:
    return data_dir() / "coordinator.sqlite3"


@contextmanager
def connect():
    directory = data_dir()
    directory.mkdir(parents=True, exist_ok=True, mode=0o700)
    path = database_path()
    database = sqlite3.connect(path)
    database.row_factory = sqlite3.Row
    database.execute("PRAGMA foreign_keys = ON")
    try:
        yield database
        database.commit()
    finally:
        database.close()
        path.chmod(0o600)


SCHEMA = """
CREATE TABLE IF NOT EXISTS courses (
    id INTEGER PRIMARY KEY,
    gradescope_id TEXT NOT NULL UNIQUE,
    code TEXT NOT NULL,
    name TEXT NOT NULL,
    term TEXT NOT NULL,
    active INTEGER NOT NULL DEFAULT 1
);

CREATE TABLE IF NOT EXISTS assignments (
    id INTEGER PRIMARY KEY,
    course_id INTEGER NOT NULL REFERENCES courses(id) ON DELETE CASCADE,
    gradescope_id TEXT NOT NULL,
    title TEXT NOT NULL,
    regular_deadline TEXT,
    late_deadline TEXT,
    imported_at TEXT,
    discovered_at TEXT,
    version_group TEXT,
    version_index INTEGER,
    is_versioned INTEGER NOT NULL DEFAULT 0,
    is_container INTEGER NOT NULL DEFAULT 0,
    distribution_style TEXT NOT NULL DEFAULT 'by_question',
    UNIQUE(course_id, gradescope_id)
);

CREATE TABLE IF NOT EXISTS graders (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    active INTEGER NOT NULL DEFAULT 1,
    gradescope_id TEXT,
    role TEXT NOT NULL DEFAULT 'TA'
);

CREATE TABLE IF NOT EXISTS assignment_graders (
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    grader_id INTEGER NOT NULL REFERENCES graders(id) ON DELETE CASCADE,
    weight REAL NOT NULL DEFAULT 1,
    PRIMARY KEY (assignment_id, grader_id)
);

CREATE TABLE IF NOT EXISTS questions (
    id INTEGER PRIMARY KEY,
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    gradescope_id TEXT NOT NULL,
    position INTEGER NOT NULL,
    label TEXT NOT NULL,
    title TEXT NOT NULL DEFAULT '',
    total_count INTEGER NOT NULL DEFAULT 0,
    graded_count INTEGER NOT NULL DEFAULT 0,
    max_points REAL,
    effort_weight REAL NOT NULL DEFAULT 1,
    grading_mode TEXT NOT NULL DEFAULT 'balanced',
    staff_owner_id INTEGER REFERENCES graders(id) ON DELETE SET NULL,
    UNIQUE(assignment_id, gradescope_id)
);

CREATE TABLE IF NOT EXISTS submissions (
    id INTEGER PRIMARY KEY,
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    gradescope_id TEXT NOT NULL,
    student_key TEXT NOT NULL,
    student_name TEXT NOT NULL,
    display_index INTEGER NOT NULL,
    submitted_at TEXT,
    is_late INTEGER NOT NULL DEFAULT 0,
    UNIQUE(assignment_id, gradescope_id)
);

CREATE TABLE IF NOT EXISTS rounds (
    id INTEGER PRIMARY KEY,
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    name TEXT NOT NULL,
    kind TEXT NOT NULL CHECK(kind IN ('initial', 'supplemental')),
    status TEXT NOT NULL DEFAULT 'draft' CHECK(status IN ('draft', 'published', 'closed')),
    snapshot_at TEXT NOT NULL,
    due_at TEXT,
    deadline_timezone TEXT NOT NULL DEFAULT 'America/New_York',
    deadline_note TEXT NOT NULL DEFAULT '',
    deadline_updated_at TEXT,
    version_group TEXT,
    scope_title TEXT,
    created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS round_assignments (
    round_id INTEGER NOT NULL REFERENCES rounds(id) ON DELETE CASCADE,
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    PRIMARY KEY (round_id, assignment_id)
);

CREATE TABLE IF NOT EXISTS grader_deadlines (
    round_id INTEGER NOT NULL REFERENCES rounds(id) ON DELETE CASCADE,
    grader_id INTEGER NOT NULL REFERENCES graders(id) ON DELETE CASCADE,
    due_at TEXT NOT NULL,
    updated_at TEXT NOT NULL,
    PRIMARY KEY (round_id, grader_id)
);

CREATE TABLE IF NOT EXISTS course_managers (
    course_id INTEGER NOT NULL REFERENCES courses(id) ON DELETE CASCADE,
    grader_id INTEGER NOT NULL REFERENCES graders(id) ON DELETE CASCADE,
    manager_role TEXT NOT NULL CHECK(manager_role IN ('instructor','head_ta','admin')),
    PRIMARY KEY (course_id, grader_id)
);

CREATE TABLE IF NOT EXISTS notifications (
    id INTEGER PRIMARY KEY,
    round_id INTEGER NOT NULL REFERENCES rounds(id) ON DELETE CASCADE,
    grader_id INTEGER NOT NULL REFERENCES graders(id) ON DELETE CASCADE,
    kind TEXT NOT NULL CHECK(kind IN ('assignment','deadline_changed','reminder_24h','overdue')),
    scheduled_at TEXT NOT NULL,
    status TEXT NOT NULL DEFAULT 'pending' CHECK(status IN ('pending','previewed','sent','cancelled','suppressed','failed')),
    subject TEXT NOT NULL,
    body_html TEXT NOT NULL,
    dedupe_key TEXT NOT NULL UNIQUE,
    sent_at TEXT,
    created_at TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS round_submissions (
    round_id INTEGER NOT NULL REFERENCES rounds(id) ON DELETE CASCADE,
    submission_id INTEGER NOT NULL REFERENCES submissions(id) ON DELETE CASCADE,
    snapshot_index INTEGER NOT NULL,
    PRIMARY KEY (round_id, submission_id)
);

CREATE TABLE IF NOT EXISTS allocations (
    id INTEGER PRIMARY KEY,
    round_id INTEGER NOT NULL REFERENCES rounds(id) ON DELETE CASCADE,
    submission_id INTEGER NOT NULL REFERENCES submissions(id) ON DELETE CASCADE,
    question_id INTEGER NOT NULL REFERENCES questions(id) ON DELETE CASCADE,
    grader_id INTEGER NOT NULL REFERENCES graders(id) ON DELETE CASCADE,
    completed_at TEXT,
    UNIQUE(round_id, submission_id, question_id)
);

CREATE TABLE IF NOT EXISTS question_plan_graders (
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    question_id INTEGER NOT NULL REFERENCES questions(id) ON DELETE CASCADE,
    grader_id INTEGER NOT NULL REFERENCES graders(id) ON DELETE CASCADE,
    PRIMARY KEY (assignment_id, question_id, grader_id)
);

CREATE TABLE IF NOT EXISTS grading_activity (
    id INTEGER PRIMARY KEY,
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    submission_id INTEGER NOT NULL REFERENCES submissions(id) ON DELETE CASCADE,
    question_id INTEGER NOT NULL REFERENCES questions(id) ON DELETE CASCADE,
    grader_id INTEGER REFERENCES graders(id) ON DELETE SET NULL,
    observed_grader TEXT,
    score REAL,
    max_points REAL,
    graded_at TEXT,
    UNIQUE(assignment_id, submission_id, question_id)
);

CREATE TABLE IF NOT EXISTS cell_links (
    assignment_id INTEGER NOT NULL REFERENCES assignments(id) ON DELETE CASCADE,
    submission_id INTEGER NOT NULL REFERENCES submissions(id) ON DELETE CASCADE,
    question_id INTEGER NOT NULL REFERENCES questions(id) ON DELETE CASCADE,
    gradescope_question_submission_id TEXT NOT NULL,
    PRIMARY KEY (assignment_id, submission_id, question_id)
);
"""


def initialize() -> None:
    with connect() as database:
        database.executescript(SCHEMA)
        migrations = {
            "assignments": {
                "imported_at": "TEXT",
                "discovered_at": "TEXT",
                "distribution_style": "TEXT NOT NULL DEFAULT 'by_question'",
                "version_group": "TEXT",
                "version_index": "INTEGER",
                "is_versioned": "INTEGER NOT NULL DEFAULT 0",
                "is_container": "INTEGER NOT NULL DEFAULT 0",
            },
            "graders": {"gradescope_id": "TEXT", "role": "TEXT NOT NULL DEFAULT 'TA'"},
            "questions": {
                "total_count": "INTEGER NOT NULL DEFAULT 0",
                "graded_count": "INTEGER NOT NULL DEFAULT 0",
                "effort_weight": "REAL NOT NULL DEFAULT 1",
                "grading_mode": "TEXT NOT NULL DEFAULT 'balanced'",
                "staff_owner_id": "INTEGER REFERENCES graders(id) ON DELETE SET NULL",
                "max_points": "REAL",
            },
            "grading_activity": {"score": "REAL", "max_points": "REAL"},
            "rounds": {
                "due_at": "TEXT",
                "deadline_timezone": "TEXT NOT NULL DEFAULT 'America/New_York'",
                "deadline_note": "TEXT NOT NULL DEFAULT ''",
                "deadline_updated_at": "TEXT",
                "version_group": "TEXT",
                "scope_title": "TEXT",
            },
        }
        for table, columns in migrations.items():
            existing = {row["name"] for row in database.execute(f"PRAGMA table_info({table})")}
            for name, definition in columns.items():
                if name not in existing:
                    database.execute(f"ALTER TABLE {table} ADD COLUMN {name} {definition}")
        database.execute(
            "CREATE UNIQUE INDEX IF NOT EXISTS submissions_student_key ON submissions(assignment_id, student_key)"
        )
