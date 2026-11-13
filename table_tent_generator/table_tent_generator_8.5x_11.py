import os
from itertools import groupby

from PIL import Image

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
from reportlab.pdfbase.pdfmetrics import stringWidth


from expo_paths import ASSETS_DIR, expo_run
from table_insert_data import load_teams_from_excel


# ========== EXPO SEMESTER ==========
run = expo_run(workbook="Expo Planning Excel file", table_inserts=True)
OUTPUT_DIR = run.output_dir
LOGO_PATH = str(ASSETS_DIR / "extended-RGB.png")


# ========== CONFIG ==========
TITLE_TEXT = f"Georgia Tech CS Capstone Expo – {run.term_label}"

# 11 x 8.5 landscape
W_IN, H_IN = 11, 8.5

HEADER_H_IN = 0.90
BORDER_PT = 3
TABLE_MAX = 16

# How far from header down toward gold rule
PLACEMENT_FRACTION = 0.43

PPTX_OUT = os.path.join(OUTPUT_DIR, f"GT_CS_Capstone_Expo_Inserts_{run.filename_term}_11x8p5_Landscape.pptx")
PDF_OUT = os.path.join(OUTPUT_DIR, f"GT_CS_Capstone_Expo_Inserts_{run.filename_term}_11x8p5_Landscape.pdf")

COVER_TEXT = "Table Inserts (Draft)" if run.draft else "Table Inserts"

EXCEL_PATH = run.excel


# ========== COLORS ==========
NAVY = (0, 48, 87)
GOLD = (179, 163, 105)
WHITE = (255, 255, 255)

NAVY_RGB = RGBColor(*NAVY)
GOLD_RGB = RGBColor(*GOLD)
WHITE_RGB = RGBColor(*WHITE)


# ========== ASSETS ==========
if not os.path.exists(LOGO_PATH):
    raise FileNotFoundError(
        f"Logo not found: {LOGO_PATH}\n"
        f"Put 'extended-RGB.png' in the assets folder."
    )

logo_img = Image.open(LOGO_PATH).convert("RGBA")


# ========== LAYOUT ==========
NAME_BOX_H_IN = 0.95
DESC_BOX_HEIGHT_IN = 1.45

DELTA_NAME_IN = 1.62
DELTA_DESC_IN = 2.60

EXTRA_UP_IN_2LINES = 0.12
EXTRA_DESC_DOWN_IN_2LINES = 0.38

# Footer label in bottom-right corner
FOOTER_RIGHT_MARGIN_IN = 0.28
FOOTER_BOTTOM_MARGIN_IN = 0.18
FOOTER_TEAMNUM_W_IN = 1.2
FOOTER_TEAMNUM_H_IN = 0.22


# ========== LOAD DATA ==========
teams = load_teams_from_excel(EXCEL_PATH, draft=run.draft)

teams_by_section = {}
for sec, grp in groupby(teams, key=lambda x: x["section_code"]):
    teams_by_section[sec] = list(grp)


# ========== PDF FONTS ==========
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
CAMBRIA_BLD = ["/Library/Fonts/Cambria Bold.ttf", "C:/Windows/Fonts/CambriaB.ttf"]

PDF_SERIF_REG = register_first_available_font([("Georgia", GEORGIA_REG)]) or "Times-Roman"
PDF_SERIF_BOLD = register_first_available_font([("Georgia-Bold", GEORGIA_BLD)]) or "Times-Bold"
PDF_TABLE_BOLD = register_first_available_font([("Cambria-Bold", CAMBRIA_BLD)]) or "Times-Bold"


# ========== TEXT HELPERS ==========
def fit_font_size_by_length(text: str, base_size: int, thresholds, min_size: int) -> int:
    size = base_size
    text_len = len((text or "").strip())
    for threshold, decrement in thresholds:
        if text_len > threshold:
            size = base_size - decrement
    return max(size, min_size)


def fit_font_size_by_wrap(
    text: str,
    font_face: str,
    start_size: int,
    min_size: int,
    max_lines: int,
    max_width_in: float
):
    size = start_size
    text = text or ""

    while size >= min_size:
        lines = simpleSplit(text, font_face, size, max_width_in * inch)
        if len(lines) <= max_lines:
            return size, lines
        size -= 1

    width = max_width_in * inch
    lines = simpleSplit(text, font_face, min_size, width)[:max_lines]
    last_line = lines[-1].rstrip()
    while stringWidth(last_line + "…", font_face, min_size) > width:
        last_line = last_line[:-1].rstrip()
    lines[-1] = last_line + "…"
    return min_size, lines


def likely_two_lines_name(name: str) -> bool:
    name = name or ""
    return len(name) > 42 or name.count(" ") >= 6


# ========== PPTX ==========
prs = Presentation()
prs.slide_width = Inches(W_IN)
prs.slide_height = Inches(H_IN)


def add_header(slide):
    hdr = slide.shapes.add_shape(
        MSO_SHAPE.RECTANGLE,
        Inches(0), Inches(0), Inches(W_IN), Inches(HEADER_H_IN)
    )
    hdr.fill.solid()
    hdr.fill.fore_color.rgb = NAVY_RGB
    hdr.line.fill.background()

    tb = slide.shapes.add_textbox(
        Inches(0.45), Inches(0.14), Inches(W_IN - 0.9), Inches(HEADER_H_IN - 0.24)
    )
    tf = tb.text_frame
    tf.clear()
    tf.vertical_anchor = MSO_ANCHOR.MIDDLE

    p = tf.paragraphs[0]
    p.alignment = PP_ALIGN.CENTER

    run = p.add_run()
    run.text = TITLE_TEXT
    run.font.name = "Georgia"
    run.font.size = Pt(24)
    run.font.bold = True
    run.font.color.rgb = WHITE_RGB


def add_border(slide):
    rect = slide.shapes.add_shape(
        MSO_SHAPE.RECTANGLE,
        Inches(0), Inches(0), Inches(W_IN), Inches(H_IN)
    )
    rect.fill.solid()
    rect.fill.transparency = 1.0
    rect.line.color.rgb = NAVY_RGB
    rect.line.width = Pt(BORDER_PT)


def add_centered_textbox(
    slide,
    text,
    top_in,
    height_in,
    width_in,
    font_name,
    font_size,
    color_rgb,
    bold=False,
    italic=False,
    wrap=True
):
    left_in = (W_IN - width_in) / 2
    box = slide.shapes.add_textbox(
        Inches(left_in), Inches(top_in), Inches(width_in), Inches(height_in)
    )
    tf = box.text_frame
    tf.clear()
    tf.word_wrap = wrap
    tf.vertical_anchor = MSO_ANCHOR.MIDDLE

    p = tf.paragraphs[0]
    p.alignment = PP_ALIGN.CENTER

    run = p.add_run()
    run.text = text
    run.font.name = font_name
    run.font.size = Pt(font_size)
    run.font.bold = bold
    run.font.italic = italic
    run.font.color.rgb = color_rgb

    return box


def add_bottom_logo_and_get_gold_top(slide):
    target_h = Inches(1.05)
    w, h = logo_img.size
    aspect = w / h
    target_w = target_h * aspect

    top_logo_in = H_IN - 1.05 - 0.35
    left_in = (W_IN - (target_w / Inches(1))) / 2

    slide.shapes.add_picture(
        LOGO_PATH,
        Inches(left_in),
        Inches(top_logo_in),
        height=target_h
    )

    rule_w_in = min(5.0, W_IN - 2.0)
    rule_left_in = (W_IN - rule_w_in) / 2
    rule_top_in = top_logo_in - 0.24

    rule = slide.shapes.add_shape(
        MSO_SHAPE.RECTANGLE,
        Inches(rule_left_in),
        Inches(rule_top_in),
        Inches(rule_w_in),
        Inches(0.08)
    )
    rule.fill.solid()
    rule.fill.fore_color.rgb = GOLD_RGB
    rule.line.fill.background()

    return rule_top_in


def add_table_line_ppt(slide, table_label: str, top_in: float):
    add_centered_textbox(
        slide=slide,
        text=table_label,
        top_in=top_in,
        height_in=0.90,
        width_in=W_IN - 1.4,
        font_name="Cambria",
        font_size=68,
        color_rgb=GOLD_RGB,
        bold=True
    )


def add_team_name_ppt(slide, name: str, top_in: float):
    font_size = fit_font_size_by_length(
        name,
        base_size=34,
        thresholds=[(40, 2), (52, 4), (66, 6), (82, 8)],
        min_size=20
    )
    add_centered_textbox(
        slide=slide,
        text=name,
        top_in=top_in,
        height_in=NAME_BOX_H_IN,
        width_in=W_IN - 1.4,
        font_name="Georgia",
        font_size=font_size,
        color_rgb=NAVY_RGB,
        bold=False
    )


def add_description_ppt(slide, description: str, top_in: float):
    font_size, lines = fit_font_size_by_wrap(
        description, PDF_SERIF_REG, 20, 11, 3, W_IN - 1.85
    )
    add_centered_textbox(
        slide=slide,
        text=" ".join(lines),
        top_in=top_in,
        height_in=DESC_BOX_HEIGHT_IN,
        width_in=W_IN - 1.6,
        font_name="Georgia",
        font_size=font_size,
        color_rgb=NAVY_RGB,
        bold=False,
        italic=False,
        wrap=True
    )


def add_team_footer_ppt(slide, label: str):
    left_in = W_IN - FOOTER_RIGHT_MARGIN_IN - FOOTER_TEAMNUM_W_IN
    top_in = H_IN - FOOTER_BOTTOM_MARGIN_IN - FOOTER_TEAMNUM_H_IN

    box = slide.shapes.add_textbox(
        Inches(left_in),
        Inches(top_in),
        Inches(FOOTER_TEAMNUM_W_IN),
        Inches(FOOTER_TEAMNUM_H_IN)
    )
    tf = box.text_frame
    tf.clear()
    tf.word_wrap = False
    tf.vertical_anchor = MSO_ANCHOR.MIDDLE

    p = tf.paragraphs[0]
    p.alignment = PP_ALIGN.RIGHT

    run = p.add_run()
    run.text = label
    run.font.name = "Georgia"
    run.font.size = Pt(12)
    run.font.bold = False
    run.font.italic = False
    run.font.color.rgb = NAVY_RGB


# Cover slide
cov = prs.slides.add_slide(prs.slide_layouts[6])
add_header(cov)
add_border(cov)
add_centered_textbox(cov, COVER_TEXT, HEADER_H_IN + 1.10, 0.90, W_IN - 1.4, "Georgia", 34, NAVY_RGB, bold=True)
add_centered_textbox(cov, "8.5×11 Acrylic Holders • Landscape", HEADER_H_IN + 1.75, 0.60, W_IN - 1.4, "Georgia", 18, NAVY_RGB)

# Generate by section
for section_code, section_teams in teams_by_section.items():
    title_slide = prs.slides.add_slide(prs.slide_layouts[6])
    add_header(title_slide)
    add_border(title_slide)
    add_centered_textbox(title_slide, f"Section {section_code}", HEADER_H_IN + 2.60, 0.90, W_IN - 1.4, "Georgia", 44, NAVY_RGB, bold=True)
    add_centered_textbox(title_slide, "Capstone Teams", HEADER_H_IN + 3.30, 0.60, W_IN - 1.4, "Georgia", 22, NAVY_RGB)

    for team in section_teams[:TABLE_MAX]:
        s = prs.slides.add_slide(prs.slide_layouts[6])
        add_header(s)
        add_border(s)

        gold_top_in = add_bottom_logo_and_get_gold_top(s)
        header_bottom_in = HEADER_H_IN
        gap_in = gold_top_in - header_bottom_in
        block_top_in = header_bottom_in + (gap_in * PLACEMENT_FRACTION)

        name_is_two_lines = likely_two_lines_name(team["team_name"])

        if name_is_two_lines:
            block_top_in -= EXTRA_UP_IN_2LINES

        desc_top_in = block_top_in + DELTA_DESC_IN
        if name_is_two_lines:
            desc_top_in += EXTRA_DESC_DOWN_IN_2LINES

        add_table_line_ppt(s, team["table_label"], block_top_in)
        add_team_name_ppt(s, team["team_name"], block_top_in + DELTA_NAME_IN)
        add_description_ppt(s, team["description"], desc_top_in)
        add_team_footer_ppt(s, team["team_label"])

prs.save(PPTX_OUT)


# ========== PDF ==========
page_w, page_h = (W_IN * inch, H_IN * inch)
c = canvas.Canvas(PDF_OUT, pagesize=(page_w, page_h))


def hdr_pdf():
    c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c.rect(0, page_h - HEADER_H_IN * inch, page_w, HEADER_H_IN * inch, stroke=0, fill=1)

    c.setFillColor(Color(1, 1, 1))
    c.setFont(PDF_SERIF_BOLD, 20)
    c.drawCentredString(page_w / 2, page_h - HEADER_H_IN * inch + 0.28 * inch, TITLE_TEXT)


def border_pdf():
    c.setStrokeColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c.setLineWidth(BORDER_PT / 0.75)
    c.rect(0, 0, page_w, page_h, stroke=1, fill=0)


def bottom_logo_and_get_gold_top_pdf():
    target_h = 1.05 * inch
    w, h = logo_img.size
    tw = target_h * (w / h)

    x = (page_w - tw) / 2
    y = 0.35 * inch
    c.drawImage(ImageReader(logo_img), x, y, width=tw, height=target_h, mask="auto")

    rw = min(5.0 * inch, page_w - 2.0 * inch)
    rx = (page_w - rw) / 2
    ry = y + target_h + 0.24 * inch
    rh = 0.08 * inch

    c.setFillColor(Color(GOLD[0] / 255, GOLD[1] / 255, GOLD[2] / 255))
    c.rect(rx, ry, rw, rh, stroke=0, fill=1)

    return ry + rh


def draw_centered_multiline_block(
    text: str,
    face: str,
    start_size: int,
    min_size: int,
    color_rgb,
    box_top_pt: float,
    box_height_in: float,
    max_width_in: float,
    max_lines: int,
    leading: float = 1.15,
):
    fitted_size, lines = fit_font_size_by_wrap(
        text=text,
        font_face=face,
        start_size=start_size,
        min_size=min_size,
        max_lines=max_lines,
        max_width_in=max_width_in
    )

    c.setFont(face, fitted_size)
    c.setFillColor(Color(color_rgb[0] / 255, color_rgb[1] / 255, color_rgb[2] / 255))

    total_h = len(lines) * fitted_size * leading
    start_y = box_top_pt + (box_height_in * inch - total_h) / 2 + fitted_size * 0.33

    for i, ln in enumerate(lines):
        c.drawCentredString(page_w / 2, start_y - i * (fitted_size * leading), ln)

    return fitted_size, lines


def draw_table_line_pdf(table_label: str, top_pt: float):
    c.setFont(PDF_TABLE_BOLD, 68)
    c.setFillColor(Color(GOLD[0] / 255, GOLD[1] / 255, GOLD[2] / 255))
    w = stringWidth(table_label, PDF_TABLE_BOLD, 68)
    c.drawString((page_w - w) / 2, top_pt + 0.34 * inch, table_label)


def draw_team_footer_pdf(label: str):
    x = page_w - FOOTER_RIGHT_MARGIN_IN * inch
    y = FOOTER_BOTTOM_MARGIN_IN * inch

    c.setFont(PDF_SERIF_REG, 12)
    c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c.drawRightString(x, y, label)


# Cover
hdr_pdf()
border_pdf()
c.setFont(PDF_SERIF_BOLD, 28)
c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
c.drawCentredString(page_w / 2, page_h - HEADER_H_IN * inch - 1.10 * inch, COVER_TEXT)
c.setFont(PDF_SERIF_REG, 16)
c.drawCentredString(page_w / 2, page_h - HEADER_H_IN * inch - 1.75 * inch, "8.5×11 Acrylic Holders • Landscape")
c.showPage()

# Sections
for section_code, section_teams in teams_by_section.items():
    hdr_pdf()
    border_pdf()
    c.setFont(PDF_SERIF_BOLD, 46)
    c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c.drawCentredString(page_w / 2, page_h / 2 + 0.30 * inch, f"Section {section_code}")
    c.setFont(PDF_SERIF_REG, 22)
    c.drawCentredString(page_w / 2, page_h / 2 - 0.30 * inch, "Capstone Teams")
    c.showPage()

    for team in section_teams[:TABLE_MAX]:
        hdr_pdf()
        border_pdf()

        gold_top_pt = bottom_logo_and_get_gold_top_pdf()
        header_bottom_pt = page_h - HEADER_H_IN * inch
        gap_pt = header_bottom_pt - gold_top_pt
        block_top_pt = gold_top_pt + (1.0 - PLACEMENT_FRACTION) * gap_pt

        name_is_two_lines = likely_two_lines_name(team["team_name"])

        if name_is_two_lines:
            block_top_pt += EXTRA_UP_IN_2LINES * inch

        draw_table_line_pdf(team["table_label"], block_top_pt)

        name_box_top = block_top_pt - DELTA_NAME_IN * inch
        draw_centered_multiline_block(
            text=team["team_name"],
            face=PDF_SERIF_REG,
            start_size=34,
            min_size=20,
            color_rgb=NAVY,
            box_top_pt=name_box_top,
            box_height_in=NAME_BOX_H_IN,
            max_width_in=W_IN - 1.4,
            max_lines=2
        )

        desc_box_top = block_top_pt - DELTA_DESC_IN * inch
        if name_is_two_lines:
            desc_box_top -= EXTRA_DESC_DOWN_IN_2LINES * inch

        draw_centered_multiline_block(
            text=team["description"],
            face=PDF_SERIF_REG,
            start_size=20,
            min_size=11,
            color_rgb=NAVY,
            box_top_pt=desc_box_top,
            box_height_in=DESC_BOX_HEIGHT_IN,
            max_width_in=W_IN - 1.6,
            max_lines=3
        )

        draw_team_footer_pdf(team["team_label"])
        c.showPage()

c.save()

print(f"✅ Created {len(teams_by_section)} sections, total {sum(len(v) for v in teams_by_section.values())} teams.")
print(f"📁 Output directory: {OUTPUT_DIR}")
print("📄 Output files:")
print(f" - {os.path.basename(PPTX_OUT)}")
print(f" - {os.path.basename(PDF_OUT)}")