"""Compile Microsoft Forms mock expo feedback into one PDF per rostered team."""

import argparse
import csv
import re
from collections import defaultdict
from dataclasses import dataclass
from pathlib import Path
from statistics import mean
from tempfile import TemporaryDirectory
from xml.sax.saxutils import escape

from openpyxl import load_workbook
from reportlab.lib import colors
from reportlab.lib.pagesizes import letter
from reportlab.lib.styles import ParagraphStyle
from reportlab.platypus import KeepTogether, Paragraph, SimpleDocTemplate, Spacer, Table, TableStyle


CATEGORIES = (
    "Audience Experience",
    "Stance & Persuasiveness",
    "Product's Aesthetic Value",
    "User Experience (UX)",
    "Product Functionality",
    "Overall Impression",
)
NAVY = colors.HexColor("#003057")
MUTED = colors.HexColor("#46596A")


@dataclass(frozen=True)
class Response:
    row: int
    section: str
    team: int
    scores: tuple[int | None, ...]
    comment: str


def read_sheet(path):
    book = load_workbook(path, read_only=True, data_only=True)
    try:
        rows = book.active.values
        headers = tuple(str(value or "").strip() for value in next(rows))
        return headers, [
            (number, row) for number, row in enumerate(rows, start=2)
            if any(value is not None for value in row)
        ]
    finally:
        book.close()


def column(headers, prefix):
    matches = [i for i, value in enumerate(headers) if value.casefold().startswith(prefix.casefold())]
    if len(matches) != 1:
        raise ValueError(f"Expected one column beginning with {prefix!r}, found {len(matches)}.")
    return matches[0]


def section_code(value, row):
    match = re.match(r"\s*(DC[A-Z])\b", str(value), re.I)
    if not match:
        raise ValueError(f"Excel row {row} has an invalid course section: {value!r}")
    return match.group(1).upper()


def team_number(value, row):
    match = re.fullmatch(r"\s*(\d+)(?:\.0+)?\s*", str(value))
    if not match:
        raise ValueError(f"Excel row {row} has an invalid team number: {value!r}")
    return int(match.group(1))


def score(value, row, category):
    if value is None or not str(value).strip():
        return None
    match = re.match(r"^\s*([1-5])(?:\.\s+|(?:\.0+)?\s*$)", str(value))
    if not match:
        raise ValueError(f"Excel row {row} has an invalid score for {category}: {value!r}")
    return int(match.group(1))


def read_roster(path):
    headers, rows = read_sheet(path)
    section_col = column(headers, "Course Section")
    team_col = column(headers, "Team Number")
    project_col = column(headers, "Project Name")
    roster = {}
    for number, row in rows:
        key = (section_code(row[section_col], number), team_number(row[team_col], number))
        if key in roster:
            raise ValueError(f"Duplicate roster entry at Excel row {number}: {key}")
        roster[key] = str(row[project_col] or "").strip()
    return roster


def read_responses(path):
    headers, rows = read_sheet(path)
    section_col = column(headers, "Course Section")
    team_col = column(headers, "What team are you evaluating?")
    comment_col = column(headers, "Please share any specific feedback")
    score_columns = [column(headers, category + ":") for category in CATEGORIES]
    return [
        Response(
            number,
            section_code(row[section_col], number),
            team_number(row[team_col], number),
            tuple(score(row[i], number, category) for i, category in zip(score_columns, CATEGORIES)),
            str(row[comment_col] or "").strip(),
        )
        for number, row in rows
    ]


def write_report(path, key, project, responses, term):
    section, team = key
    label = f"{section}-{team}"
    title = f"Team {label}"
    doc = SimpleDocTemplate(
        str(path), pagesize=letter, title=f"{title} | Mock Expo Feedback",
        leftMargin=54, rightMargin=54, topMargin=50, bottomMargin=50,
    )
    styles = {
        "eyebrow": ParagraphStyle("eyebrow", fontName="Helvetica-Bold", fontSize=10, leading=13, textColor=NAVY),
        "title": ParagraphStyle("title", fontName="Helvetica-Bold", fontSize=27, leading=32, textColor=NAVY),
        "sub": ParagraphStyle("sub", fontSize=11, leading=15, textColor=MUTED),
        "section": ParagraphStyle("section", fontName="Helvetica-Bold", fontSize=13, leading=17, textColor=NAVY, spaceAfter=6, keepWithNext=True),
        "review": ParagraphStyle("review", fontName="Helvetica-Bold", fontSize=10, leading=14, textColor=NAVY, spaceAfter=2, keepWithNext=True),
        "comment": ParagraphStyle("comment", fontSize=10.5, leading=15, spaceAfter=10),
    }

    def paragraph(text, style):
        return Paragraph(escape(text).replace("\n", "<br/>"), styles[style])

    story = [
        paragraph(f"Classroom Mock Expo Feedback | {term}", "eyebrow"),
        Spacer(1, 5),
        paragraph(title, "title"),
    ]
    if project:
        story.append(paragraph(project, "sub"))
    count = len(responses)
    story.extend([
        paragraph(f"{count} {'response' if count == 1 else 'responses'}", "sub"),
        Spacer(1, 16),
        paragraph("Category averages", "section"),
    ])

    summary = [["Category", "Average / 5", "Ratings"]]
    for i, category in enumerate(CATEGORIES):
        ratings = [r.scores[i] for r in responses if r.scores[i] is not None]
        summary.append([category, f"{mean(ratings):.2f}" if ratings else "-", str(len(ratings))])
    table = Table(summary, colWidths=[doc.width - 165, 90, 75])
    table.setStyle(TableStyle([
        ("BACKGROUND", (0, 0), (-1, 0), NAVY),
        ("TEXTCOLOR", (0, 0), (-1, 0), colors.white),
        ("FONTNAME", (0, 0), (-1, 0), "Helvetica-Bold"),
        ("ALIGN", (1, 0), (-1, -1), "RIGHT"),
        ("ROWBACKGROUNDS", (0, 1), (-1, -1), [colors.HexColor("#F0F4F7"), colors.white]),
        ("TOPPADDING", (0, 0), (-1, -1), 6),
        ("BOTTOMPADDING", (0, 0), (-1, -1), 6),
    ]))
    story.extend([table, Spacer(1, 17), paragraph("Individual feedback", "section")])
    for index, response in enumerate(responses, start=1):
        story.append(KeepTogether([
            paragraph(f"Response {index}", "review"),
            paragraph(response.comment or "No written comment.", "comment"),
        ]))

    def page_footer(canvas, document):
        canvas.setStrokeColor(colors.HexColor("#D8E2E9"))
        canvas.line(54, 43, letter[0] - 54, 43)
        canvas.setFillColor(MUTED)
        canvas.setFont("Helvetica", 9)
        canvas.drawString(54, 29, title)
        canvas.drawRightString(letter[0] - 54, 29, f"Page {document.page}")

    doc.build(story, onFirstPage=page_footer, onLaterPages=page_footer)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("responses", type=Path, help="Mock expo feedback workbook")
    parser.add_argument("--roster", required=True, type=Path, help="Expo planning workbook with team numbers")
    parser.add_argument("--output", required=True, type=Path, help="New or empty report directory")
    parser.add_argument("--term", required=True, help='Label for the reports, such as "Fall 2026"')
    parser.add_argument(
        "--map-61-to-63", action="store_true",
        help="Treat team numbers 6100–6199 as 6300–6399 when matching the roster",
    )
    args = parser.parse_args()

    if args.output.exists() and (not args.output.is_dir() or any(args.output.iterdir())):
        parser.error("choose a new or empty output directory so old reports cannot be mixed into this run")

    roster = read_roster(args.roster)
    responses = read_responses(args.responses)
    teams = defaultdict(list)
    unmatched = []
    for response in responses:
        team = response.team
        if args.map_61_to_63 and 6100 <= team <= 6199:
            team += 200
        key = (response.section, team)
        if key in roster:
            teams[key].append(response)
        else:
            unmatched.append(response)

    args.output.parent.mkdir(parents=True, exist_ok=True)
    with TemporaryDirectory(dir=args.output.parent) as temporary:
        staging = Path(temporary)
        team_dir = staging / "team-reports"
        team_dir.mkdir()
        for key, reviews in sorted(teams.items()):
            section, team = key
            write_report(team_dir / f"{section}-{team}_Mock_Expo_Feedback.pdf", key, roster[key], reviews, args.term)
        if unmatched:
            with (staging / "unmatched-responses-for-review.csv").open("w", newline="", encoding="utf-8-sig") as file:
                writer = csv.writer(file)
                writer.writerow(["Workbook row", "Course section", "Team number entered", *CATEGORIES])
                for response in unmatched:
                    writer.writerow([response.row, response.section, response.team, *response.scores])
        args.output.mkdir(exist_ok=True)
        for item in staging.iterdir():
            item.rename(args.output / item.name)

    print(f"Created {len(teams)} reports for {len(responses) - len(unmatched)} matched responses.")
    print(f"Held {len(unmatched)} unmatched responses for review. Reports are in {args.output / 'team-reports'}.")


if __name__ == "__main__":
    main()
