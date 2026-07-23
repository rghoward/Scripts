from __future__ import annotations

from pathlib import Path
from datetime import datetime, timezone
from zoneinfo import ZoneInfo

from fastapi import FastAPI, Form, HTTPException, Request
from fastapi.responses import RedirectResponse
from fastapi.staticfiles import StaticFiles
from fastapi.templating import Jinja2Templates

from .database import connect, initialize
from .consistency import analyze_consistency, logical_question
from .demo import seed_demo
from .gradescope_importer import discover_assignments, discover_courses, import_assignment
from .repository import allocate_question_plan, allocate_round, allocate_weighted_plan, create_round, create_version_round, publish_round, round_assignment_ids
from .deadlines import set_round_deadline, sync_round_notifications


PACKAGE_DIR = Path(__file__).resolve().parent
app = FastAPI(title="Gradescope Grading Coordinator")
app.mount("/static", StaticFiles(directory=PACKAGE_DIR / "static"), name="static")
templates = Jinja2Templates(directory=PACKAGE_DIR / "templates")


def display_deadline(value: str | None, timezone_name: str = "America/New_York") -> str:
    if not value:
        return "Not set"
    return datetime.fromisoformat(value).astimezone(ZoneInfo(timezone_name)).strftime("%a, %b %-d at %-I:%M %p %Z")


def deadline_input(value: str | None, timezone_name: str = "America/New_York") -> str:
    if not value:
        return ""
    return datetime.fromisoformat(value).astimezone(ZoneInfo(timezone_name)).strftime("%Y-%m-%dT%H:%M")


templates.env.globals.update(display_deadline=display_deadline, deadline_input=deadline_input)


@app.on_event("startup")
def startup() -> None:
    initialize()


def assignment_details(assignment_id: int) -> dict:
    with connect() as database:
        assignment = database.execute(
            """SELECT a.*, c.code course_code, c.name course_name, c.term, c.gradescope_id course_gs_id
            FROM assignments a JOIN courses c ON c.id=a.course_id WHERE a.id=?""",
            (assignment_id,),
        ).fetchone()
        if not assignment:
            raise HTTPException(404, "Assignment not found")
        questions = database.execute(
            "SELECT * FROM questions WHERE assignment_id=? ORDER BY position", (assignment_id,)
        ).fetchall()
        submissions = database.execute(
            "SELECT * FROM submissions WHERE assignment_id=? ORDER BY display_index", (assignment_id,)
        ).fetchall()
        graders = database.execute(
            """SELECT g.* FROM graders g JOIN assignment_graders ag ON ag.grader_id=g.id
            WHERE ag.assignment_id=? ORDER BY g.name""", (assignment_id,)
        ).fetchall()
        rounds = database.execute(
            """SELECT r.*,
            (SELECT COUNT(*) FROM round_submissions rs WHERE rs.round_id=r.id) submission_count,
            (SELECT COUNT(*) FROM allocations al WHERE al.round_id=r.id) cell_count
            FROM rounds r WHERE r.assignment_id=? ORDER BY r.id""", (assignment_id,)
        ).fetchall()
        late_unassigned = database.execute(
            """SELECT s.* FROM submissions s WHERE s.assignment_id=? AND s.is_late=1
            AND NOT EXISTS (SELECT 1 FROM round_submissions rs WHERE rs.submission_id=s.id)
            ORDER BY s.display_index""", (assignment_id,)
        ).fetchall()
        progress = database.execute(
            """SELECT COUNT(*) graded_cells,
            (SELECT COUNT(*) FROM submissions WHERE assignment_id=?) *
            (SELECT COUNT(*) FROM questions WHERE assignment_id=?) total_cells,
            (SELECT COUNT(*) FROM questions WHERE assignment_id=? AND total_count>0 AND graded_count>=total_count) completed_questions
            FROM grading_activity WHERE assignment_id=?""",
            (assignment_id, assignment_id, assignment_id, assignment_id),
        ).fetchone()
    return {
        "assignment": assignment, "questions": questions, "submissions": submissions,
        "graders": graders, "rounds": rounds, "late_unassigned": late_unassigned, "progress": progress,
    }


@app.get("/")
def dashboard(request: Request):
    with connect() as database:
        courses = database.execute(
            """SELECT c.*,
            (SELECT COUNT(*) FROM assignments a WHERE a.course_id=c.id) assignment_count,
            (SELECT COUNT(*) FROM assignments a WHERE a.course_id=c.id AND a.imported_at IS NOT NULL) imported_count
            FROM courses c WHERE c.active=1 ORDER BY c.term DESC, c.code"""
        ).fetchall()
        assignments = database.execute(
            """SELECT a.*, c.code course_code, c.term,
            (SELECT COUNT(*) FROM submissions s WHERE s.assignment_id=a.id) submission_count,
            (SELECT COUNT(*) FROM questions q WHERE q.assignment_id=a.id) question_count,
            (SELECT COUNT(*) FROM rounds r WHERE r.assignment_id=a.id AND r.status='published') published_rounds,
            (SELECT COUNT(*) FROM grading_activity ga WHERE ga.assignment_id=a.id) graded_cells,
            (SELECT COUNT(*) FROM submissions s WHERE s.assignment_id=a.id) *
              (SELECT COUNT(*) FROM questions q WHERE q.assignment_id=a.id) total_cells,
            (SELECT COUNT(*) FROM submissions s WHERE s.assignment_id=a.id AND s.is_late=1
              AND NOT EXISTS (SELECT 1 FROM round_submissions rs WHERE rs.submission_id=s.id)) late_unassigned
            FROM assignments a JOIN courses c ON c.id=a.course_id ORDER BY a.id DESC"""
        ).fetchall()
    return templates.TemplateResponse(request, "dashboard.html", {"courses": courses, "assignments": assignments})


@app.post("/courses/discover")
def refresh_courses():
    try:
        discover_courses()
    except RuntimeError as exc:
        raise HTTPException(502, str(exc)) from exc
    return RedirectResponse("/", status_code=303)


@app.get("/courses/{course_id}")
def course_page(request: Request, course_id: int):
    with connect() as database:
        course = database.execute("SELECT * FROM courses WHERE id=?", (course_id,)).fetchone()
        if not course:
            raise HTTPException(404, "Course not found")
        assignments = database.execute(
            """SELECT a.*,
            (SELECT COUNT(*) FROM submissions s WHERE s.assignment_id=a.id) submission_count,
            (SELECT COUNT(*) FROM questions q WHERE q.assignment_id=a.id) question_count,
            (SELECT COUNT(*) FROM grading_activity ga WHERE ga.assignment_id=a.id) graded_cells
            FROM assignments a WHERE a.course_id=? ORDER BY COALESCE(a.regular_deadline, '') DESC, a.id DESC""",
            (course_id,),
        ).fetchall()
    enriched = []
    for row in assignments:
        item = dict(row)
        item["total_cells"] = item["submission_count"] * item["question_count"]
        enriched.append(item)
    return templates.TemplateResponse(request, "course.html", {"course": course, "assignments": enriched})


@app.post("/courses/{course_id}/discover")
def refresh_assignments(course_id: int):
    try:
        discover_assignments(course_id)
    except RuntimeError as exc:
        raise HTTPException(502, str(exc)) from exc
    return RedirectResponse(f"/courses/{course_id}", status_code=303)


@app.post("/assignments/{assignment_id}/sync")
def sync_assignment(assignment_id: int):
    with connect() as database:
        assignment = database.execute("SELECT is_container FROM assignments WHERE id=?", (assignment_id,)).fetchone()
    if not assignment:
        raise HTTPException(404, "Assignment not found")
    if assignment["is_container"]:
        raise HTTPException(400, "Choose a specific assignment version to import")
    try:
        import_assignment(sync_activity=True, local_assignment_id=assignment_id)
    except RuntimeError as exc:
        raise HTTPException(502, str(exc)) from exc
    return RedirectResponse(f"/assignments/{assignment_id}", status_code=303)


@app.post("/demo")
def create_demo():
    seed_demo()
    return RedirectResponse("/", status_code=303)


@app.get("/assignments/{assignment_id}")
def assignment_page(request: Request, assignment_id: int):
    context = assignment_details(assignment_id)
    context["request"] = request
    return templates.TemplateResponse(request, "assignment.html", context)


@app.get("/version-groups/{container_id}")
def version_group_page(request: Request, container_id: int):
    with connect() as database:
        container = database.execute(
            """SELECT a.*, c.code course_code, c.name course_name, c.term
            FROM assignments a JOIN courses c ON c.id=a.course_id
            WHERE a.id=? AND a.is_container=1""", (container_id,)
        ).fetchone()
        if not container:
            raise HTTPException(404, "Version group not found")
        versions = database.execute(
            """SELECT a.*,
            (SELECT COUNT(*) FROM submissions s WHERE s.assignment_id=a.id) submission_count,
            (SELECT COUNT(*) FROM questions q WHERE q.assignment_id=a.id) question_count
            FROM assignments a WHERE a.course_id=? AND a.version_group=?
            ORDER BY COALESCE(a.version_index,0), a.id""",
            (container["course_id"], container["gradescope_id"]),
        ).fetchall()
        rounds = database.execute(
            """SELECT r.*, (SELECT COUNT(*) FROM round_submissions rs WHERE rs.round_id=r.id) submission_count,
            (SELECT COUNT(*) FROM allocations al WHERE al.round_id=r.id) cell_count
            FROM rounds r WHERE r.version_group=? ORDER BY r.id""", (container["gradescope_id"],)
        ).fetchall()
        physical_questions = database.execute(
            """SELECT q.id, q.title, q.position, q.max_points, a.title version_title
            FROM questions q JOIN assignments a ON a.id=q.assignment_id
            WHERE a.course_id=? AND a.version_group=? ORDER BY q.position, a.version_index""",
            (container["course_id"], container["gradescope_id"]),
        ).fetchall()
        logical_groups = {}
        for question in physical_questions:
            key = logical_question(question["title"], question["position"])
            logical_groups.setdefault(key, {
                "title": question["title"] or f"Question {question['position']}", "members": [],
            })["members"].append(question)
    return templates.TemplateResponse(request, "version_group.html", {
        "container": container, "versions": versions, "rounds": rounds,
        "logical_groups": list(logical_groups.values()),
    })


@app.post("/version-groups/{container_id}/rounds")
def new_version_round(container_id: int):
    try:
        round_id = create_version_round(container_id, "Combined initial grading batch")
    except ValueError as exc:
        raise HTTPException(400, str(exc)) from exc
    return RedirectResponse(f"/rounds/{round_id}", status_code=303)


@app.get("/assignments/{assignment_id}/consistency")
def consistency_page(request: Request, assignment_id: int):
    with connect() as database:
        assignment = database.execute(
            """SELECT a.*, c.code course_code, c.name course_name, c.term
            FROM assignments a JOIN courses c ON c.id=a.course_id WHERE a.id=?""",
            (assignment_id,),
        ).fetchone()
        if not assignment:
            raise HTTPException(404, "Assignment not found")
        if assignment["version_group"]:
            related = database.execute(
                """SELECT id, title FROM assignments WHERE course_id=? AND version_group=?
                AND imported_at IS NOT NULL ORDER BY COALESCE(version_index, 0), id""",
                (assignment["course_id"], assignment["version_group"]),
            ).fetchall()
        else:
            related = database.execute("SELECT id, title FROM assignments WHERE id=?", (assignment_id,)).fetchall()
        related_ids = [row["id"] for row in related]
        placeholders = ",".join("?" for _ in related_ids)
        observations = database.execute(
            f"""SELECT COALESCE(g.name, ga.observed_grader) grader_name,
            ga.score, COALESCE(ga.max_points, q.max_points) max_points,
            q.title question_title, q.position, q.gradescope_id question_gs_id,
            a.title assignment_title, c.gradescope_id course_gs_id
            FROM grading_activity ga JOIN questions q ON q.id=ga.question_id
            JOIN assignments a ON a.id=ga.assignment_id JOIN courses c ON c.id=a.course_id
            LEFT JOIN graders g ON g.id=ga.grader_id
            WHERE ga.assignment_id IN ({placeholders}) AND ga.grader_id IS NOT NULL
            AND ga.score IS NOT NULL AND COALESCE(ga.max_points, q.max_points, 0)>0""",
            related_ids,
        ).fetchall()
    analysis = analyze_consistency([dict(row) for row in observations])
    return templates.TemplateResponse(request, "consistency.html", {
        "assignment": assignment, "related": related, "analysis": analysis,
    })


@app.post("/assignments/{assignment_id}/rounds")
def new_round(
    assignment_id: int,
    name: str = Form(...),
    kind: str = Form(...),
    pool: str = Form(...),
):
    details = assignment_details(assignment_id)
    if not details["assignment"]["imported_at"]:
        raise HTTPException(400, "Import this assignment from Gradescope before creating a grading plan")
    if pool == "initial":
        ids = [row["id"] for row in details["submissions"] if not row["is_late"]]
    elif pool == "late":
        ids = [row["id"] for row in details["late_unassigned"]]
    else:
        raise HTTPException(400, "Unknown submission pool")
    try:
        round_id = create_round(assignment_id, name, kind, ids)
    except ValueError as exc:
        raise HTTPException(400, str(exc)) from exc
    return RedirectResponse(f"/rounds/{round_id}", status_code=303)


@app.post("/assignments/{assignment_id}/archive-plan")
def archive_plan(assignment_id: int):
    with connect() as database:
        database.execute(
            "UPDATE rounds SET status='closed' WHERE assignment_id=? AND status IN ('draft', 'published')",
            (assignment_id,),
        )
    return RedirectResponse(f"/assignments/{assignment_id}", status_code=303)


@app.get("/rounds/{round_id}")
def round_page(request: Request, round_id: int):
    with connect() as database:
        round_row = database.execute(
            """SELECT r.*, COALESCE(r.scope_title,a.title) assignment_title,
            a.gradescope_id assignment_gs_id, a.distribution_style,
            c.code course_code, c.gradescope_id course_gs_id
            FROM rounds r JOIN assignments a ON a.id=r.assignment_id
            JOIN courses c ON c.id=a.course_id WHERE r.id=?""", (round_id,)
        ).fetchone()
        if not round_row:
            raise HTTPException(404, "Round not found")
        assignment_ids = round_assignment_ids(database, round_id, round_row["assignment_id"])
        placeholders = ",".join("?" for _ in assignment_ids)
        version_container = database.execute(
            "SELECT id FROM assignments WHERE gradescope_id=? AND is_container=1",
            (round_row["version_group"],),
        ).fetchone() if round_row["version_group"] else None
        graders = database.execute(
            f"""SELECT g.* FROM graders g JOIN assignment_graders ag ON ag.grader_id=g.id
            WHERE ag.assignment_id IN ({placeholders}) GROUP BY g.id ORDER BY g.name""", assignment_ids
        ).fetchall()
        allocations = database.execute(
            """SELECT al.*, g.name grader_name, q.label question_label, a.title version_title,
            q.gradescope_id question_gs_id, s.student_name, rs.snapshot_index
            FROM allocations al JOIN graders g ON g.id=al.grader_id
            JOIN questions q ON q.id=al.question_id JOIN assignments a ON a.id=q.assignment_id
            JOIN submissions s ON s.id=al.submission_id
            JOIN round_submissions rs ON rs.round_id=al.round_id AND rs.submission_id=al.submission_id
            WHERE al.round_id=? ORDER BY q.position, rs.snapshot_index""", (round_id,)
        ).fetchall()
        workload = database.execute(
            f"""SELECT g.id, g.name, COUNT(al.id) cell_count,
            COUNT(DISTINCT al.question_id) question_count, COUNT(DISTINCT al.submission_id) submission_count,
            COALESCE(SUM(q.effort_weight), 0) effort_units
            FROM graders g LEFT JOIN allocations al ON al.grader_id=g.id AND al.round_id=?
            LEFT JOIN questions q ON q.id=al.question_id
            WHERE g.id IN (SELECT grader_id FROM assignment_graders WHERE assignment_id IN ({placeholders}))
            GROUP BY g.id ORDER BY g.name""", [round_id, *assignment_ids]
        ).fetchall()
        ranges = database.execute(
            """SELECT g.id grader_id, g.name grader_name, q.label question_label, a.title version_title,
            q.position question_position, q.effort_weight,
            MIN(rs.snapshot_index) range_start, MAX(rs.snapshot_index) range_end,
            COUNT(al.id) cell_count, COUNT(ga.id) completed_count,
            COUNT(al.id) * q.effort_weight effort_units
            FROM allocations al JOIN graders g ON g.id=al.grader_id
            JOIN questions q ON q.id=al.question_id
            JOIN assignments a ON a.id=q.assignment_id
            JOIN round_submissions rs ON rs.round_id=al.round_id AND rs.submission_id=al.submission_id
            LEFT JOIN grading_activity ga ON ga.assignment_id=q.assignment_id
              AND ga.submission_id=al.submission_id AND ga.question_id=al.question_id
            WHERE al.round_id=?
            GROUP BY g.id, q.id ORDER BY g.name, a.version_index, q.position""", (round_id,)
        ).fetchall()
        questions = database.execute(
            f"""SELECT q.*, a.title version_title, a.version_index FROM questions q
            JOIN assignments a ON a.id=q.assignment_id WHERE q.assignment_id IN ({placeholders})
            ORDER BY COALESCE(a.version_index,0), q.position""", assignment_ids
        ).fetchall()
        question_logical = {row["id"]: logical_question(row["title"], row["position"]) for row in questions}
        inherited = {}
        for row in database.execute(
            "SELECT question_id, grader_id FROM question_plan_graders WHERE assignment_id IN (" + placeholders + ")",
            assignment_ids,
        ):
            inherited.setdefault(row["question_id"], set()).add(row["grader_id"])
        if not inherited:
            defaults = {grader["id"] for grader in graders if grader["role"] != "Instructor"}
            inherited = {question["id"]: defaults for question in questions}
        selected_graders = set().union(*inherited.values()) if inherited else set()
        workload_metric = "submission_count" if round_row["distribution_style"] == "whole_submissions" else "effort_units"
        max_effort = max((row[workload_metric] for row in workload), default=0)
    return templates.TemplateResponse(request, "round.html", {
        "round": round_row, "graders": graders, "allocations": allocations, "workload": workload,
        "questions": questions, "inherited": inherited,
        "selected_graders": selected_graders, "ranges": ranges, "max_effort": max_effort,
        "version_container_id": version_container["id"] if version_container else None,
        "question_logical": question_logical,
    })


@app.post("/rounds/{round_id}/allocate")
def auto_allocate(
    round_id: int,
    strategy: str = Form(...),
    grader_ids: list[int] = Form(...),
    only_ungraded: bool = Form(False),
):
    try:
        allocate_round(round_id, strategy, grader_ids, only_ungraded=only_ungraded)
    except ValueError as exc:
        raise HTTPException(400, str(exc)) from exc
    return RedirectResponse(f"/rounds/{round_id}", status_code=303)


@app.post("/rounds/{round_id}/allocate-questions")
async def allocate_questions(request: Request, round_id: int):
    form = await request.form()
    with connect() as database:
        round_row = database.execute("SELECT assignment_id FROM rounds WHERE id=?", (round_id,)).fetchone()
        if not round_row:
            raise HTTPException(404, "Batch not found")
        assignment_ids = round_assignment_ids(database, round_id, round_row["assignment_id"])
        question_ids = [
            row["id"] for row in database.execute(
                f"SELECT id FROM questions WHERE assignment_id IN ({','.join('?' for _ in assignment_ids)}) ORDER BY assignment_id, position",
                assignment_ids,
            )
        ]
    try:
        question_graders = {
            question_id: [int(value) for value in form.getlist(f"graders_{question_id}")]
            for question_id in question_ids
        }
        effort_weights = {
            question_id: float(form.get(f"effort_{question_id}", "1"))
            for question_id in question_ids
        }
        allocate_question_plan(
            round_id,
            question_graders,
            effort_weights,
            only_ungraded=form.get("only_ungraded") == "true",
        )
    except (ValueError, TypeError) as exc:
        raise HTTPException(400, str(exc)) from exc
    return RedirectResponse(f"/rounds/{round_id}", status_code=303)


@app.post("/rounds/{round_id}/allocate-weighted")
async def allocate_weighted(request: Request, round_id: int):
    form = await request.form()
    with connect() as database:
        round_row = database.execute("SELECT assignment_id FROM rounds WHERE id=?", (round_id,)).fetchone()
        if not round_row:
            raise HTTPException(404, "Batch not found")
        assignment_ids = round_assignment_ids(database, round_id, round_row["assignment_id"])
        question_ids = [
            row["id"] for row in database.execute(
                f"SELECT id FROM questions WHERE assignment_id IN ({','.join('?' for _ in assignment_ids)}) ORDER BY assignment_id, position",
                assignment_ids,
            )
        ]
    try:
        grader_ids = [int(value) for value in form.getlist("grader_ids")]
        effort_weights = {
            question_id: float(form.get(f"effort_{question_id}", "1"))
            for question_id in question_ids
        }
        question_modes = {
            question_id: str(form.get(f"mode_{question_id}", "balanced"))
            for question_id in question_ids
        }
        staff_owners = {
            question_id: int(form[f"owner_{question_id}"])
            if form.get(f"owner_{question_id}") else None
            for question_id in question_ids
        }
        allocate_weighted_plan(
            round_id,
            grader_ids,
            effort_weights,
            question_modes,
            staff_owners,
            str(form.get("distribution_style", "by_question")),
        )
    except (ValueError, TypeError) as exc:
        raise HTTPException(400, str(exc)) from exc
    return RedirectResponse(f"/rounds/{round_id}", status_code=303)


@app.post("/rounds/{round_id}/publish")
def publish(round_id: int):
    try:
        publish_round(round_id)
        sync_round_notifications(round_id, include_assignment=True)
    except ValueError as exc:
        raise HTTPException(400, str(exc)) from exc
    return RedirectResponse(f"/rounds/{round_id}", status_code=303)


@app.post("/rounds/{round_id}/deadline")
def update_deadline(
    round_id: int,
    due_at: str = Form(...),
    deadline_timezone: str = Form("America/New_York"),
    deadline_note: str = Form(""),
):
    try:
        zone = ZoneInfo(deadline_timezone)
        local_due = datetime.fromisoformat(due_at).replace(tzinfo=zone)
        set_round_deadline(round_id, local_due, deadline_timezone, deadline_note)
    except (ValueError, TypeError) as exc:
        raise HTTPException(400, str(exc)) from exc
    return RedirectResponse(f"/rounds/{round_id}", status_code=303)


@app.get("/notifications")
def notification_outbox(request: Request):
    with connect() as database:
        notifications = database.execute(
            """SELECT n.*, g.name grader_name, g.email, r.name round_name,
            a.title assignment_title, c.code course_code
            FROM notifications n JOIN graders g ON g.id=n.grader_id
            JOIN rounds r ON r.id=n.round_id JOIN assignments a ON a.id=r.assignment_id
            JOIN courses c ON c.id=a.course_id ORDER BY n.scheduled_at, n.id"""
        ).fetchall()
    return templates.TemplateResponse(request, "notifications.html", {"notifications": notifications})


@app.get("/statistics/deadlines")
def deadline_statistics(request: Request):
    now = datetime.now(timezone.utc).isoformat()
    with connect() as database:
        rows = database.execute(
            """SELECT g.id, g.name, g.email, COUNT(al.id) assigned,
            SUM(CASE WHEN ga.id IS NOT NULL THEN 1 ELSE 0 END) completed,
            SUM(CASE WHEN ga.id IS NOT NULL AND ga.graded_at<=COALESCE(gd.due_at,r.due_at) THEN 1 ELSE 0 END) on_time,
            SUM(CASE WHEN ga.id IS NOT NULL AND ga.graded_at>COALESCE(gd.due_at,r.due_at) THEN 1 ELSE 0 END) late,
            SUM(CASE WHEN ga.id IS NULL THEN 1 ELSE 0 END) remaining,
            SUM(CASE WHEN ga.id IS NULL AND COALESCE(gd.due_at,r.due_at)<? THEN 1 ELSE 0 END) overdue,
            COUNT(DISTINCT r.id) batches
            FROM graders g JOIN allocations al ON al.grader_id=g.id
            JOIN rounds r ON r.id=al.round_id AND r.status='published' AND r.due_at IS NOT NULL
            JOIN questions q ON q.id=al.question_id
            LEFT JOIN grader_deadlines gd ON gd.round_id=r.id AND gd.grader_id=g.id
            LEFT JOIN grading_activity ga ON ga.assignment_id=q.assignment_id
              AND ga.submission_id=al.submission_id AND ga.question_id=al.question_id
            GROUP BY g.id ORDER BY overdue DESC, remaining DESC, g.name""",
            (now,),
        ).fetchall()
        active = database.execute(
            """SELECT r.id, r.name, r.due_at, r.deadline_timezone, a.title assignment_title,
            c.code course_code, COUNT(al.id) assigned,
            SUM(CASE WHEN ga.id IS NULL THEN 1 ELSE 0 END) remaining
            FROM rounds r JOIN assignments a ON a.id=r.assignment_id JOIN courses c ON c.id=a.course_id
            JOIN allocations al ON al.round_id=r.id JOIN questions q ON q.id=al.question_id
            LEFT JOIN grading_activity ga ON ga.assignment_id=q.assignment_id
              AND ga.submission_id=al.submission_id AND ga.question_id=al.question_id
            WHERE r.status='published' AND r.due_at IS NOT NULL GROUP BY r.id ORDER BY r.due_at"""
        ).fetchall()
    return templates.TemplateResponse(request, "deadline_statistics.html", {"rows": rows, "active": active, "now": now})


@app.get("/graders/{grader_id}")
def grader_tasks(request: Request, grader_id: int, preview: bool = False):
    with connect() as database:
        grader = database.execute("SELECT * FROM graders WHERE id=?", (grader_id,)).fetchone()
        if not grader:
            raise HTTPException(404, "Grader not found")
        tasks = database.execute(
            """SELECT al.*, r.id round_id, r.name round_name, r.status round_status, r.kind round_kind,
            COALESCE(gd.due_at, r.due_at) effective_due_at, r.deadline_timezone, r.deadline_note,
            a.id assignment_id, a.title assignment_title, a.distribution_style,
            c.code course_code, c.gradescope_id course_gs_id, q.label question_label,
            q.gradescope_id question_gs_id, s.student_name, rs.snapshot_index,
            cl.gradescope_question_submission_id,
            CASE WHEN ga.id IS NULL THEN 0 ELSE 1 END is_graded,
            ga.observed_grader
            FROM allocations al JOIN rounds r ON r.id=al.round_id
            JOIN assignments a ON a.id=r.assignment_id JOIN courses c ON c.id=a.course_id
            JOIN questions q ON q.id=al.question_id JOIN submissions s ON s.id=al.submission_id
            JOIN round_submissions rs ON rs.round_id=r.id AND rs.submission_id=s.id
            LEFT JOIN grader_deadlines gd ON gd.round_id=r.id AND gd.grader_id=al.grader_id
            LEFT JOIN cell_links cl ON cl.assignment_id=a.id AND cl.submission_id=s.id AND cl.question_id=q.id
            LEFT JOIN grading_activity ga ON ga.assignment_id=a.id AND ga.submission_id=s.id AND ga.question_id=q.id
            WHERE al.grader_id=? AND (r.status='published' OR ?=1)
            ORDER BY r.id, q.position, rs.snapshot_index""", (grader_id, int(preview))
        ).fetchall()
        summary = {
            "cells": len(tasks),
            "completed": sum(row["is_graded"] for row in tasks),
            "assignments": len({row["assignment_id"] for row in tasks}),
            "courses": len({row["course_code"] for row in tasks}),
        }
    return templates.TemplateResponse(request, "grader.html", {
        "grader": grader, "tasks": tasks, "preview": preview, "summary": summary,
        "now": datetime.now(timezone.utc).isoformat(),
    })


@app.get("/instructor/view-as")
def view_as_directory(request: Request):
    with connect() as database:
        graders = database.execute(
            """SELECT g.*,
            COUNT(DISTINCT CASE WHEN r.status IN ('draft','published') THEN r.id END) batch_count,
            COUNT(CASE WHEN r.status IN ('draft','published') THEN al.id END) assigned,
            SUM(CASE WHEN r.status IN ('draft','published') AND ga.id IS NULL THEN 1 ELSE 0 END) remaining
            FROM graders g LEFT JOIN allocations al ON al.grader_id=g.id
            LEFT JOIN rounds r ON r.id=al.round_id LEFT JOIN questions q ON q.id=al.question_id
            LEFT JOIN grading_activity ga ON ga.assignment_id=q.assignment_id
              AND ga.submission_id=al.submission_id AND ga.question_id=al.question_id
            WHERE g.role!='Instructor' GROUP BY g.id ORDER BY g.name"""
        ).fetchall()
    return templates.TemplateResponse(request, "view_as.html", {"graders": graders})


@app.get("/gradescope/question/{course_id}/{question_id}")
def open_gradescope_question(course_id: str, question_id: str):
    url = f"https://www.gradescope.com/courses/{course_id}/questions/{question_id}/submissions"
    return RedirectResponse(url)


@app.get("/gradescope/cell/{course_id}/{question_id}/{question_submission_id}")
def open_gradescope_cell(course_id: str, question_id: str, question_submission_id: str):
    url = f"https://www.gradescope.com/courses/{course_id}/questions/{question_id}/submissions/{question_submission_id}/grade"
    return RedirectResponse(url)
