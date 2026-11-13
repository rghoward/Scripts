import re
from typing import Optional

import pandas as pd


# Exact Excel headers expected
SECTION_HEADER = "Course Section:"
TEAM_NUMBER_HEADER = "Team Number"
TEAM_NAME_HEADER = "Project Name (keep this concise for printing purposes)"
TABLE_NUMBER_HEADER = "Table Number"
DESCRIPTION_HEADER = "Project Description"
FORM_DESCRIPTION_HEADER = "Short Description of Project (2-3 sentences)"

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


def extract_code(val: Optional[str]) -> Optional[str]:
    s = str(val or "").upper()
    m = re.search(r"\bDC[A-Z]\b", s)
    return m.group(0) if m else None


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


def load_teams_from_excel(path: str, *, draft: bool = False):
    df = pd.read_excel(path)

    section_col = find_column_by_exact_or_normalized(df, SECTION_HEADER)
    teamnum_col = find_column_by_exact_or_normalized(df, TEAM_NUMBER_HEADER)
    teamname_col = find_column_by_exact_or_normalized(df, TEAM_NAME_HEADER)
    tablenum_col = find_column_by_exact_or_normalized(df, TABLE_NUMBER_HEADER)
    desc_col = find_column_by_exact_or_normalized(df, DESCRIPTION_HEADER)
    form_desc_col = find_column_by_exact_or_normalized(df, FORM_DESCRIPTION_HEADER)

    missing = []
    if not section_col:
        missing.append(SECTION_HEADER)
    if not teamnum_col:
        missing.append(TEAM_NUMBER_HEADER)
    if not teamname_col:
        missing.append(TEAM_NAME_HEADER)
    if not tablenum_col and not draft:
        missing.append(f"{TABLE_NUMBER_HEADER} (add assignments or run with --draft)")
    if not (desc_col or form_desc_col):
        missing.append(f"{DESCRIPTION_HEADER} or {FORM_DESCRIPTION_HEADER}")

    if missing:
        raise ValueError(
            "Could not find these required Excel columns:\n - "
            + "\n - ".join(missing)
        )

    rows = []
    for excel_idx, (_, r) in enumerate(df.iterrows(), start=2):
        code = extract_code(r.get(section_col, ""))
        if not code:
            continue

        team_number = parse_int_like(r.get(teamnum_col, ""), "team number", excel_idx)
        table_value = r.get(tablenum_col)
        if draft and (pd.isna(table_value) or not str(table_value).strip()):
            table_number = None
        else:
            table_number = parse_int_like(r.get(tablenum_col, ""), "table number", excel_idx)

        team_name = str(r.get(teamname_col, "")).strip()
        description = ""
        for column in (desc_col, form_desc_col):
            value = r.get(column)
            if pd.notna(value) and str(value).strip():
                description = str(value).strip()
                break

        if not team_name or team_name.lower() == "nan":
            raise ValueError(f"Missing project/team name on Excel row {excel_idx}.")

        team_label = f"{code}-{team_number}"

        rows.append({
            "section_code": code,
            "team_number": team_number,
            "table_number": table_number,
            "table_label": "TABLE TBD" if table_number is None else f"TABLE {table_number}",
            "team_label": team_label,
            "team_name": team_name,
            "description": description,
        })

    if not rows:
        raise ValueError("No valid teams found in Excel.")

    rows.sort(key=lambda d: (
        d["section_code"],
        d["table_number"] is None,
        d["table_number"],
        d["team_number"],
    ))
    return rows
