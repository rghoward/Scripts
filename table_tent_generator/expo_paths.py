import argparse
import re
import subprocess
import sys
from pathlib import Path


BASE_DIR = Path(__file__).resolve().parent
ASSETS_DIR = BASE_DIR / "assets"
EXCEL_TYPES = '{"org.openxmlformats.spreadsheetml.sheet", "com.microsoft.excel.xls"}'
IMAGE_TYPES = '{"public.image"}'


def pick_input(parser, path, input_dir, flag, label, file_types):
    if path is None:
        if sys.platform != "darwin":
            parser.error(f"provide {flag} on systems without the macOS file picker")
        input_dir.mkdir(parents=True, exist_ok=True)
        script = f"""
on run argv
    set startFolder to (POSIX file (item 1 of argv)) as alias
    set chosenFile to choose file with prompt (item 2 of argv) ¬
        default location startFolder of type {file_types}
    return POSIX path of chosenFile
end run
"""
        result = subprocess.run(
            ["osascript", "-e", script, str(input_dir), f"Select the {label}"],
            capture_output=True,
            text=True,
        )
        selected = result.stdout.strip()
        if result.returncode or not selected:
            parser.exit(1, f"No {label} selected. Exiting. Use {flag} to supply a path.\n")
        path = Path(selected)

    path = path.expanduser().resolve()
    if not path.is_file():
        parser.error(f"{flag} file not found: {path}")
    return str(path)


def expo_run(*, workbook=None, map_image=False, table_inserts=False):
    parser = argparse.ArgumentParser()
    parser.add_argument("term", help="Expo semester, such as fall-2026")
    if workbook:
        parser.add_argument("--excel", type=Path, help=f"{workbook} (defaults to the macOS file picker)")
    if map_image:
        parser.add_argument("--map", type=Path, help="Exhibition map (defaults to the macOS file picker)")
    if table_inserts:
        parser.add_argument("--draft", action="store_true", help="Allow missing table numbers and save under output/draft")

    args = parser.parse_args()
    match = re.fullmatch(r"(spring|summer|fall|winter)-([0-9]{4})", args.term.lower())
    if not match:
        parser.error("use a semester and four-digit year, such as fall-2026")

    season, year = match.groups()
    term_dir = BASE_DIR / f"{season}-{year}"
    input_dir = term_dir / "input"
    args.term_label = f"{season.title()} {year}"
    args.filename_term = f"{season.title()}_{year}"
    args.output_dir = term_dir / "output"
    if table_inserts and args.draft:
        args.output_dir /= "draft"

    if workbook:
        args.excel = pick_input(parser, args.excel, input_dir, "--excel", workbook, EXCEL_TYPES)
    if map_image:
        args.map = pick_input(parser, args.map, input_dir, "--map", "exhibition map image", IMAGE_TYPES)
    args.output_dir.mkdir(parents=True, exist_ok=True)
    return args
