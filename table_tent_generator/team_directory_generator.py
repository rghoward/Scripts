import os
import re
import math
from typing import Optional

import pandas as pd

# ---------- PPTX ----------
from pptx import Presentation
from pptx.util import Inches, Pt
from pptx.dml.color import RGBColor
from pptx.enum.text import PP_ALIGN, MSO_ANCHOR
from pptx.enum.shapes import MSO_SHAPE

# ---------- PDF ----------
from reportlab.pdfgen import canvas
from reportlab.lib.pagesizes import inch
from reportlab.lib.utils import ImageReader, simpleSplit
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.lib.colors import Color


from expo_paths import expo_run


# ========== EXPO SEMESTER ==========
run = expo_run(workbook="team directory Excel file", map_image=True)
OUTPUT_DIR = run.output_dir


# ========== CONFIG ==========
TITLE_TEXT = f"Georgia Tech CS Capstone Expo – {run.term_label}"
SUBTITLE_TEXT = "Team Directory"

TABLE_NUMBER_HEADER = "Table Number"
TEAM_NAME_HEADER = "Team Name"

NAVY = (0, 48, 87)
GOLD = (179, 163, 105)
WHITE = (255, 255, 255)

NAVY_RGB = RGBColor(*NAVY)
GOLD_RGB = RGBColor(*GOLD)
WHITE_RGB = RGBColor(*WHITE)

# 24x36 portrait foam board outputs
BOARD_W_IN, BOARD_H_IN = 24, 36
BOARD_HEADER_H_IN = 2.40
BOARD_BORDER_PT = 4

PPTX_OUT = os.path.join(OUTPUT_DIR, "GT_CS_Capstone_Team_Directory_24x36_Portrait.pptx")
PDF_OUT = os.path.join(OUTPUT_DIR, "GT_CS_Capstone_Team_Directory_24x36_Portrait.pdf")

# 8.5x11 landscape handout/map-back PDF
HANDOUT_W_IN, HANDOUT_H_IN = 11, 8.5
HANDOUT_HEADER_H_IN = 0.90
HANDOUT_BORDER_PT = 3
HANDOUT_PDF_OUT = os.path.join(OUTPUT_DIR, "GT_CS_Capstone_Team_Directory_11x8p5_Landscape.pdf")


EXCEL_PATH = run.excel
MAP_IMAGE_PATH = run.map


# ========== HELPERS ==========
def normalize_col(s: str) -> str:
    return re.sub(r"[^a-z0-9#]+", " ", str(s).lower()).strip()


def find_column_by_exact_or_normalized(df: pd.DataFrame, target: str) -> Optional[str]:
    if target in df.columns:
        return target

    target_norm = normalize_col(target)
    for col in df.columns:
        if normalize_col(col) == target_norm:
            return col

    return None


def parse_int_like(value, field_name: str, row_num: int) -> int:
    s = str(value).strip()

    if not s or s.lower() == "nan":
        raise ValueError(f"Missing {field_name} on Excel row {row_num}.")

    try:
        num = float(s)
        if num.is_integer():
            return int(num)
    except ValueError:
        pass

    raise ValueError(f"Invalid {field_name} '{value}' on Excel row {row_num}.")


def load_directory_data(path: str):
    df = pd.read_excel(path)

    table_col = find_column_by_exact_or_normalized(df, TABLE_NUMBER_HEADER)
    team_col = find_column_by_exact_or_normalized(df, TEAM_NAME_HEADER)

    missing = []
    if not table_col:
        missing.append(TABLE_NUMBER_HEADER)
    if not team_col:
        missing.append(TEAM_NAME_HEADER)

    if missing:
        raise ValueError(
            "Could not find these required Excel columns:\n - "
            + "\n - ".join(missing)
        )

    rows = []
    for excel_idx, (_, r) in enumerate(df.iterrows(), start=2):
        raw_team_name = str(r.get(team_col, "")).strip()
        if not raw_team_name or raw_team_name.lower() == "nan":
            continue

        table_number = parse_int_like(r.get(table_col, ""), "table number", excel_idx)

        rows.append({
            "table_number": table_number,
            "team_name": raw_team_name
        })

    if not rows:
        raise ValueError("No valid rows found in Excel.")

    rows.sort(key=lambda d: d["table_number"])
    return rows


def register_first_available_font(candidates):
    for family, paths in candidates:
        for p in paths:
            if os.path.exists(p):
                try:
                    pdfmetrics.registerFont(TTFont(f"Custom_{family}", p))
                    return f"Custom_{family}"
                except Exception:
                    continue
    return None


GEORGIA_REG = ["/Library/Fonts/Georgia.ttf", "C:/Windows/Fonts/georgia.ttf"]
GEORGIA_BLD = ["/Library/Fonts/Georgia Bold.ttf", "C:/Windows/Fonts/georgiab.ttf"]

PDF_SERIF_REG = register_first_available_font([("Georgia", GEORGIA_REG)]) or "Times-Roman"
PDF_SERIF_BOLD = register_first_available_font([("Georgia-Bold", GEORGIA_BLD)]) or "Times-Bold"


def split_into_two_columns(items):
    half = math.ceil(len(items) / 2)
    return items[:half], items[half:]


def compute_line_units(items, font_size, max_width_in, max_lines_per_item=2):
    units = []
    for item in items:
        lines = simpleSplit(item["team_name"], PDF_SERIF_REG, font_size, max_width_in * inch)
        units.append(max(1, min(len(lines), max_lines_per_item)))
    return units


def choose_best_font_and_spacing(
    col1,
    col2,
    available_height_in,
    max_width_in,
    start_size=34,
    min_size=16,
    max_lines_per_item=2,
    min_unit_height_in=0.72,
):
    best = None

    for font_size in range(start_size, min_size - 1, -1):
        col1_units = compute_line_units(col1, font_size, max_width_in, max_lines_per_item)
        col2_units = compute_line_units(col2, font_size, max_width_in, max_lines_per_item)

        tallest_units = max(sum(col1_units), sum(col2_units), 1)
        unit_height_in = available_height_in / tallest_units

        if unit_height_in >= min_unit_height_in:
            best = {
                "team_font_size": font_size,
                "num_font_size": font_size,
                "col1_units": col1_units,
                "col2_units": col2_units,
                "unit_height_in": unit_height_in,
            }
            break

    if best is None:
        font_size = min_size
        col1_units = compute_line_units(col1, font_size, max_width_in, max_lines_per_item)
        col2_units = compute_line_units(col2, font_size, max_width_in, max_lines_per_item)
        tallest_units = max(sum(col1_units), sum(col2_units), 1)
        unit_height_in = available_height_in / tallest_units
        best = {
            "team_font_size": font_size,
            "num_font_size": font_size,
            "col1_units": col1_units,
            "col2_units": col2_units,
            "unit_height_in": unit_height_in,
        }

    return best


def draw_wrapped_row(pdf_canvas, page_h, font_name, name, x_left, y_top_in, width_in, row_h_in, font_size):
    lines = simpleSplit(name, font_name, font_size, width_in * inch)[:2]
    leading = font_size * 1.10
    total_h = len(lines) * leading
    y_start = page_h - y_top_in * inch - (row_h_in * inch - total_h) / 2 - font_size * 0.80

    pdf_canvas.setFont(font_name, font_size)
    for i, line in enumerate(lines):
        pdf_canvas.drawString(x_left * inch, y_start - i * leading, line)


def draw_map_page_handout(pdf_canvas, image_path, page_w, page_h):
    pdf_canvas.setFillColor(Color(1, 1, 1))
    pdf_canvas.rect(0, 0, page_w, page_h, stroke=0, fill=1)

    margin_in = 0.20
    usable_w = page_w - 2 * margin_in * inch
    usable_h = page_h - 2 * margin_in * inch

    img = ImageReader(image_path)
    img_w, img_h = img.getSize()
    img_aspect = img_w / img_h
    box_aspect = usable_w / usable_h

    if img_aspect > box_aspect:
        draw_w = usable_w
        draw_h = draw_w / img_aspect
    else:
        draw_h = usable_h
        draw_w = draw_h * img_aspect

    x = (page_w - draw_w) / 2
    y = (page_h - draw_h) / 2

    pdf_canvas.drawImage(
        img,
        x,
        y,
        width=draw_w,
        height=draw_h,
        preserveAspectRatio=True,
        mask="auto"
    )
    pdf_canvas.showPage()


teams = load_directory_data(EXCEL_PATH)
col1, col2 = split_into_two_columns(teams)


# ========== 24x36 BOARD LAYOUT ==========
BOARD_TOP_START_IN = BOARD_HEADER_H_IN + 2.15
BOARD_BOTTOM_MARGIN_IN = 1.25
BOARD_AVAILABLE_HEIGHT_IN = BOARD_H_IN - BOARD_TOP_START_IN - BOARD_BOTTOM_MARGIN_IN

BOARD_COL1_NUM_LEFT = 1.20
BOARD_COL1_NAME_LEFT = 2.70
BOARD_COL2_NUM_LEFT = 12.70
BOARD_COL2_NAME_LEFT = 14.20

BOARD_NUM_W_IN = 1.00
BOARD_NAME_W_IN = 8.60

board_layout = choose_best_font_and_spacing(
    col1=col1,
    col2=col2,
    available_height_in=BOARD_AVAILABLE_HEIGHT_IN,
    max_width_in=BOARD_NAME_W_IN,
    start_size=34,
    min_size=16,
    max_lines_per_item=2,
    min_unit_height_in=0.72,
)

board_team_font_size = board_layout["team_font_size"]
board_num_font_size = board_layout["num_font_size"]
board_col1_units = board_layout["col1_units"]
board_col2_units = board_layout["col2_units"]
board_unit_height_in = board_layout["unit_height_in"]


# ========== 8.5x11 LANDSCAPE HANDOUT LAYOUT ==========
HANDOUT_TOP_START_IN = HANDOUT_HEADER_H_IN + 1.45
HANDOUT_BOTTOM_MARGIN_IN = 0.35
HANDOUT_AVAILABLE_HEIGHT_IN = HANDOUT_H_IN - HANDOUT_TOP_START_IN - HANDOUT_BOTTOM_MARGIN_IN

HANDOUT_COL1_NUM_LEFT = 0.45
HANDOUT_COL1_NAME_LEFT = 1.05
HANDOUT_COL2_NUM_LEFT = 5.65
HANDOUT_COL2_NAME_LEFT = 6.25

HANDOUT_NUM_W_IN = 0.45
HANDOUT_NAME_W_IN = 4.20

handout_layout = choose_best_font_and_spacing(
    col1=col1,
    col2=col2,
    available_height_in=HANDOUT_AVAILABLE_HEIGHT_IN,
    max_width_in=HANDOUT_NAME_W_IN,
    start_size=18,
    min_size=9,
    max_lines_per_item=2,
    min_unit_height_in=0.24,
)

handout_team_font_size = handout_layout["team_font_size"]
handout_num_font_size = handout_layout["num_font_size"]
handout_col1_units = handout_layout["col1_units"]
handout_col2_units = handout_layout["col2_units"]
handout_unit_height_in = handout_layout["unit_height_in"]


# ========== PPTX 24x36 ==========
prs = Presentation()
prs.slide_width = Inches(BOARD_W_IN)
prs.slide_height = Inches(BOARD_H_IN)


def add_board_header(slide):
    hdr = slide.shapes.add_shape(
        MSO_SHAPE.RECTANGLE,
        Inches(0), Inches(0), Inches(BOARD_W_IN), Inches(BOARD_HEADER_H_IN)
    )
    hdr.fill.solid()
    hdr.fill.fore_color.rgb = NAVY_RGB
    hdr.line.fill.background()

    tb = slide.shapes.add_textbox(
        Inches(0.5), Inches(0.2), Inches(BOARD_W_IN - 1.0), Inches(BOARD_HEADER_H_IN - 0.3)
    )
    tf = tb.text_frame
    tf.clear()
    tf.vertical_anchor = MSO_ANCHOR.MIDDLE

    p1 = tf.paragraphs[0]
    p1.alignment = PP_ALIGN.CENTER
    run1 = p1.add_run()
    run1.text = TITLE_TEXT
    run1.font.name = "Georgia"
    run1.font.size = Pt(40)
    run1.font.bold = True
    run1.font.color.rgb = WHITE_RGB

    p2 = tf.add_paragraph()
    p2.alignment = PP_ALIGN.CENTER
    run2 = p2.add_run()
    run2.text = SUBTITLE_TEXT
    run2.font.name = "Georgia"
    run2.font.size = Pt(30)
    run2.font.bold = False
    run2.font.color.rgb = WHITE_RGB


def add_board_border(slide):
    rect = slide.shapes.add_shape(
        MSO_SHAPE.RECTANGLE,
        Inches(0), Inches(0), Inches(BOARD_W_IN), Inches(BOARD_H_IN)
    )
    rect.fill.solid()
    rect.fill.transparency = 1.0
    rect.line.color.rgb = NAVY_RGB
    rect.line.width = Pt(BOARD_BORDER_PT)


def add_board_textbox(
    slide,
    text,
    left_in,
    top_in,
    width_in,
    height_in,
    font_name,
    font_size,
    color_rgb,
    bold=False,
    align=PP_ALIGN.LEFT,
    wrap=True
):
    box = slide.shapes.add_textbox(
        Inches(left_in), Inches(top_in), Inches(width_in), Inches(height_in)
    )
    tf = box.text_frame
    tf.clear()
    tf.word_wrap = wrap
    tf.vertical_anchor = MSO_ANCHOR.MIDDLE

    p = tf.paragraphs[0]
    p.alignment = align

    run = p.add_run()
    run.text = text
    run.font.name = font_name
    run.font.size = Pt(font_size)
    run.font.bold = bold
    run.font.color.rgb = color_rgb
    return box


slide = prs.slides.add_slide(prs.slide_layouts[6])
add_board_header(slide)
add_board_border(slide)

header_y = BOARD_HEADER_H_IN + 1.10
add_board_textbox(slide, "Table", BOARD_COL1_NUM_LEFT, header_y, 1.20, 0.55, "Georgia", 22, GOLD_RGB, bold=True, wrap=False)
add_board_textbox(slide, "Team Name", BOARD_COL1_NAME_LEFT, header_y, BOARD_NAME_W_IN, 0.55, "Georgia", 22, GOLD_RGB, bold=True, wrap=False)
add_board_textbox(slide, "Table", BOARD_COL2_NUM_LEFT, header_y, 1.20, 0.55, "Georgia", 22, GOLD_RGB, bold=True, wrap=False)
add_board_textbox(slide, "Team Name", BOARD_COL2_NAME_LEFT, header_y, BOARD_NAME_W_IN, 0.55, "Georgia", 22, GOLD_RGB, bold=True, wrap=False)

for left in (BOARD_COL1_NUM_LEFT, BOARD_COL2_NUM_LEFT):
    line = slide.shapes.add_shape(
        MSO_SHAPE.RECTANGLE,
        Inches(left), Inches(BOARD_HEADER_H_IN + 1.60), Inches(9.70), Inches(0.06)
    )
    line.fill.solid()
    line.fill.fore_color.rgb = GOLD_RGB
    line.line.fill.background()

y_cursor = BOARD_TOP_START_IN
for item, units in zip(col1, board_col1_units):
    row_h = units * board_unit_height_in
    add_board_textbox(
        slide, str(item["table_number"]),
        BOARD_COL1_NUM_LEFT, y_cursor, BOARD_NUM_W_IN, row_h,
        "Georgia", board_num_font_size, NAVY_RGB, bold=True, wrap=False
    )
    add_board_textbox(
        slide, item["team_name"],
        BOARD_COL1_NAME_LEFT, y_cursor, BOARD_NAME_W_IN, row_h,
        "Georgia", board_team_font_size, NAVY_RGB, bold=False, wrap=True
    )
    y_cursor += row_h

y_cursor = BOARD_TOP_START_IN
for item, units in zip(col2, board_col2_units):
    row_h = units * board_unit_height_in
    add_board_textbox(
        slide, str(item["table_number"]),
        BOARD_COL2_NUM_LEFT, y_cursor, BOARD_NUM_W_IN, row_h,
        "Georgia", board_num_font_size, NAVY_RGB, bold=True, wrap=False
    )
    add_board_textbox(
        slide, item["team_name"],
        BOARD_COL2_NAME_LEFT, y_cursor, BOARD_NAME_W_IN, row_h,
        "Georgia", board_team_font_size, NAVY_RGB, bold=False, wrap=True
    )
    y_cursor += row_h

prs.save(PPTX_OUT)


# ========== 24x36 PDF ==========
board_page_w, board_page_h = (BOARD_W_IN * inch, BOARD_H_IN * inch)
c = canvas.Canvas(PDF_OUT, pagesize=(board_page_w, board_page_h))


def board_hdr_pdf():
    c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c.rect(0, board_page_h - BOARD_HEADER_H_IN * inch, board_page_w, BOARD_HEADER_H_IN * inch, stroke=0, fill=1)

    c.setFillColor(Color(1, 1, 1))
    c.setFont(PDF_SERIF_BOLD, 36)
    c.drawCentredString(board_page_w / 2, board_page_h - BOARD_HEADER_H_IN * inch + 1.35 * inch, TITLE_TEXT)
    c.setFont(PDF_SERIF_REG, 28)
    c.drawCentredString(board_page_w / 2, board_page_h - BOARD_HEADER_H_IN * inch + 0.55 * inch, SUBTITLE_TEXT)


def board_border_pdf():
    c.setStrokeColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c.setLineWidth(BOARD_BORDER_PT / 0.75)
    c.rect(0, 0, board_page_w, board_page_h, stroke=1, fill=0)


board_hdr_pdf()
board_border_pdf()

header_y = board_page_h - (BOARD_HEADER_H_IN + 1.38) * inch
c.setFillColor(Color(GOLD[0] / 255, GOLD[1] / 255, GOLD[2] / 255))
c.setFont(PDF_SERIF_BOLD, 22)
c.drawString(BOARD_COL1_NUM_LEFT * inch, header_y, "Table")
c.drawString(BOARD_COL1_NAME_LEFT * inch, header_y, "Team Name")
c.drawString(BOARD_COL2_NUM_LEFT * inch, header_y, "Table")
c.drawString(BOARD_COL2_NAME_LEFT * inch, header_y, "Team Name")

c.rect(BOARD_COL1_NUM_LEFT * inch, board_page_h - (BOARD_HEADER_H_IN + 1.62) * inch, 9.70 * inch, 0.06 * inch, stroke=0, fill=1)
c.rect(BOARD_COL2_NUM_LEFT * inch, board_page_h - (BOARD_HEADER_H_IN + 1.62) * inch, 9.70 * inch, 0.06 * inch, stroke=0, fill=1)

c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))

y_cursor = BOARD_TOP_START_IN
for item, units in zip(col1, board_col1_units):
    row_h = units * board_unit_height_in
    y_text = board_page_h - (y_cursor + row_h / 2 + 0.18) * inch

    c.setFont(PDF_SERIF_BOLD, board_num_font_size)
    c.drawString(BOARD_COL1_NUM_LEFT * inch, y_text, str(item["table_number"]))
    draw_wrapped_row(c, board_page_h, PDF_SERIF_REG, item["team_name"], BOARD_COL1_NAME_LEFT, y_cursor, BOARD_NAME_W_IN, row_h, board_team_font_size)

    y_cursor += row_h

y_cursor = BOARD_TOP_START_IN
for item, units in zip(col2, board_col2_units):
    row_h = units * board_unit_height_in
    y_text = board_page_h - (y_cursor + row_h / 2 + 0.18) * inch

    c.setFont(PDF_SERIF_BOLD, board_num_font_size)
    c.drawString(BOARD_COL2_NUM_LEFT * inch, y_text, str(item["table_number"]))
    draw_wrapped_row(c, board_page_h, PDF_SERIF_REG, item["team_name"], BOARD_COL2_NAME_LEFT, y_cursor, BOARD_NAME_W_IN, row_h, board_team_font_size)

    y_cursor += row_h

c.save()


# ========== 8.5x11 LANDSCAPE PDF ==========
handout_page_w, handout_page_h = (HANDOUT_W_IN * inch, HANDOUT_H_IN * inch)
c2 = canvas.Canvas(HANDOUT_PDF_OUT, pagesize=(handout_page_w, handout_page_h))

# Page 1: map image
draw_map_page_handout(c2, MAP_IMAGE_PATH, handout_page_w, handout_page_h)


def handout_hdr_pdf():
    c2.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c2.rect(0, handout_page_h - HANDOUT_HEADER_H_IN * inch, handout_page_w, HANDOUT_HEADER_H_IN * inch, stroke=0, fill=1)

    c2.setFillColor(Color(1, 1, 1))
    c2.setFont(PDF_SERIF_BOLD, 18)
    c2.drawCentredString(handout_page_w / 2, handout_page_h - HANDOUT_HEADER_H_IN * inch + 0.28 * inch, TITLE_TEXT)


def handout_border_pdf():
    c2.setStrokeColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c2.setLineWidth(HANDOUT_BORDER_PT / 0.75)
    c2.rect(0, 0, handout_page_w, handout_page_h, stroke=1, fill=0)


def draw_wrapped_row_handout(name, x_left, y_top_in, width_in, row_h_in, font_size):
    lines = simpleSplit(name, PDF_SERIF_REG, font_size, width_in * inch)[:2]
    leading = font_size * 1.08
    total_h = len(lines) * leading
    y_start = handout_page_h - y_top_in * inch - (row_h_in * inch - total_h) / 2 - font_size * 0.78

    c2.setFont(PDF_SERIF_REG, font_size)
    for i, line in enumerate(lines):
        c2.drawString(x_left * inch, y_start - i * leading, line)


handout_hdr_pdf()
handout_border_pdf()

c2.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
c2.setFont(PDF_SERIF_REG, 12)
c2.drawCentredString(handout_page_w / 2, handout_page_h - (HANDOUT_HEADER_H_IN + 0.35) * inch, SUBTITLE_TEXT)

header_y = handout_page_h - (HANDOUT_HEADER_H_IN + 0.82) * inch
c2.setFillColor(Color(GOLD[0] / 255, GOLD[1] / 255, GOLD[2] / 255))
c2.setFont(PDF_SERIF_BOLD, 11)
c2.drawString(HANDOUT_COL1_NUM_LEFT * inch, header_y, "Table")
c2.drawString(HANDOUT_COL1_NAME_LEFT * inch, header_y, "Team Name")
c2.drawString(HANDOUT_COL2_NUM_LEFT * inch, header_y, "Table")
c2.drawString(HANDOUT_COL2_NAME_LEFT * inch, header_y, "Team Name")

c2.rect(HANDOUT_COL1_NUM_LEFT * inch, handout_page_h - (HANDOUT_HEADER_H_IN + 1.02) * inch, 4.80 * inch, 0.03 * inch, stroke=0, fill=1)
c2.rect(HANDOUT_COL2_NUM_LEFT * inch, handout_page_h - (HANDOUT_HEADER_H_IN + 1.02) * inch, 4.80 * inch, 0.03 * inch, stroke=0, fill=1)

c2.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))

y_cursor = HANDOUT_TOP_START_IN
for item, units in zip(col1, handout_col1_units):
    row_h = units * handout_unit_height_in
    y_text = handout_page_h - (y_cursor + row_h / 2 + 0.06) * inch

    c2.setFont(PDF_SERIF_BOLD, handout_num_font_size)
    c2.drawString(HANDOUT_COL1_NUM_LEFT * inch, y_text, str(item["table_number"]))
    draw_wrapped_row_handout(item["team_name"], HANDOUT_COL1_NAME_LEFT, y_cursor, HANDOUT_NAME_W_IN, row_h, handout_team_font_size)

    y_cursor += row_h

y_cursor = HANDOUT_TOP_START_IN
for item, units in zip(col2, handout_col2_units):
    row_h = units * handout_unit_height_in
    y_text = handout_page_h - (y_cursor + row_h / 2 + 0.06) * inch

    c2.setFont(PDF_SERIF_BOLD, handout_num_font_size)
    c2.drawString(HANDOUT_COL2_NUM_LEFT * inch, y_text, str(item["table_number"]))
    draw_wrapped_row_handout(item["team_name"], HANDOUT_COL2_NAME_LEFT, y_cursor, HANDOUT_NAME_W_IN, row_h, handout_team_font_size)

    y_cursor += row_h

c2.save()

print(f"✅ Created directory for {len(teams)} teams.")
print(f"📁 Output directory: {OUTPUT_DIR}")
print("📄 Output files:")
print(f" - {os.path.basename(PPTX_OUT)}")
print(f" - {os.path.basename(PDF_OUT)}")
print(f" - {os.path.basename(HANDOUT_PDF_OUT)}")