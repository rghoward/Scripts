import os
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
from reportlab.lib.utils import ImageReader
from reportlab.lib.colors import Color


from expo_paths import ASSETS_DIR, expo_run


# ========== EXPO SEMESTER ==========
run = expo_run()
OUTPUT_DIR = run.output_dir
LOGO_PATH = str(ASSETS_DIR / "extended-RGB.png")


# ========== CONFIG ==========
TITLE_TEXT = f"Georgia Tech CS Capstone Expo – {run.term_label}"

# 8.5 x 11 portrait
W_IN, H_IN = 8.5, 11

HEADER_H_IN = 0.90
BORDER_PT = 3

PPTX_OUT = os.path.join(OUTPUT_DIR, "QR_Code_Insert_Become_a_Client.pptx")
PDF_OUT = os.path.join(OUTPUT_DIR, "QR_Code_Insert_Become_a_Client.pdf")

QR_CODE_PATH = str(ASSETS_DIR / "qr_code.jpeg")


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

if not os.path.exists(QR_CODE_PATH):
    raise FileNotFoundError(
        f"QR code not found: {QR_CODE_PATH}\n"
        f"Put 'qr_code.jpeg' in the assets folder."
    )

logo_img = Image.open(LOGO_PATH).convert("RGBA")
qr_img = Image.open(QR_CODE_PATH)


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


# Create QR code slide
slide = prs.slides.add_slide(prs.slide_layouts[6])
add_header(slide)
add_border(slide)

# Add logo and gold rule
add_bottom_logo_and_get_gold_top(slide)

# Position QR code in the center
qr_size = Inches(3.0)
qr_left = (W_IN - 3.0) / 2
caption_top = HEADER_H_IN + 1.2

# Add "Become a Client" caption above QR code
add_centered_textbox(
    slide=slide,
    text="Become a Client",
    top_in=caption_top,
    height_in=0.6,
    width_in=W_IN - 1.4,
    font_name="Georgia",
    font_size=44,
    color_rgb=NAVY_RGB,
    bold=True
)

# Add QR code below caption with spacing
qr_top = caption_top + 1.0

slide.shapes.add_picture(
    QR_CODE_PATH,
    Inches(qr_left),
    Inches(qr_top),
    width=qr_size
)

# Add URL directly under QR code
add_centered_textbox(
    slide=slide,
    text="https://gatechcscapstone.edusourcedapp.com/submit",
    top_in=qr_top + 3.1,
    height_in=0.35,
    width_in=W_IN - 1.4,
    font_name="Georgia",
    font_size=12,
    color_rgb=GOLD_RGB,
    bold=False
)

# Add "or contact" with email below
add_centered_textbox(
    slide=slide,
    text="or contact cs-jd-capstone@cc.gatech.edu",
    top_in=qr_top + 3.55,
    height_in=0.4,
    width_in=W_IN - 1.4,
    font_name="Georgia",
    font_size=14,
    color_rgb=NAVY_RGB,
    bold=False
)

prs.save(PPTX_OUT)


# ========== PDF ==========
page_w, page_h = (W_IN * inch, H_IN * inch)
c = canvas.Canvas(PDF_OUT, pagesize=(page_w, page_h))


def hdr_pdf():
    c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
    c.rect(0, page_h - HEADER_H_IN * inch, page_w, HEADER_H_IN * inch, stroke=0, fill=1)

    c.setFillColor(Color(1, 1, 1))
    c.setFont("Times-Bold", 20)
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


# Draw PDF page
hdr_pdf()
border_pdf()

# Add logo and gold rule
bottom_logo_and_get_gold_top_pdf()

# Add "Become a Client" caption
caption_y = page_h - (HEADER_H_IN + 1.5) * inch
c.setFont("Times-Bold", 44)
c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
c.drawCentredString(page_w / 2, caption_y, "Become a Client")

# Add QR code below caption with spacing
qr_size = 3.0 * inch
qr_left = (page_w - qr_size) / 2
qr_top = caption_y - 1.0 * inch

c.drawImage(ImageReader(qr_img), qr_left, qr_top - qr_size, width=qr_size, height=qr_size)

# Add URL directly under QR code in gold
url_y = qr_top - qr_size - 0.30 * inch
c.setFont("Times-Roman", 10)
c.setFillColor(Color(GOLD[0] / 255, GOLD[1] / 255, GOLD[2] / 255))
c.drawCentredString(page_w / 2, url_y, "https://gatechcscapstone.edusourcedapp.com/submit")

# Add "or contact" with email below
contact_y = url_y - 0.28 * inch
c.setFont("Times-Roman", 12)
c.setFillColor(Color(NAVY[0] / 255, NAVY[1] / 255, NAVY[2] / 255))
c.drawCentredString(page_w / 2, contact_y, "or contact cs-jd-capstone@cc.gatech.edu")

c.showPage()
c.save()

print(f"✅ QR Code insert created.")
print(f"📁 Output directory: {OUTPUT_DIR}")
print("📄 Output files:")
print(f" - {os.path.basename(PPTX_OUT)}")
print(f" - {os.path.basename(PDF_OUT)}")
