#!/usr/bin/env python3
"""Build the installable GT TA Hiring Toolkit userscript."""

from dataclasses import dataclass
from pathlib import Path
import re


ROOT = Path(__file__).parent
SRC = ROOT / "src"
OUTPUT = ROOT / "gt-ta-hiring-toolkit.user.js"


@dataclass(frozen=True)
class Feature:
    id: str
    name: str
    source: str


FEATURES = (
    Feature("landing-page", "Landing Page", "features/landing-page/index.js"),
    Feature("instructor-home", "Instructor Home", "features/instructor-home/index.js"),
    Feature("page-enhancer", "Page Enhancer", "features/page-enhancer/index.js"),
    Feature("my-courses", "My Courses Dashboard", "features/my-courses/index.js"),
    Feature("manager-home", "Manager Home", "features/manager-home/index.js"),
    Feature("manager-users", "Manager Users", "features/manager-users/index.js"),
    Feature("manager-user-form", "Manager User Form", "features/manager-user-form/index.js"),
    Feature("manager-candidates", "Manager TAs", "features/manager-candidates/index.js"),
    Feature("manager-semesters", "Manager Semesters", "features/manager-semesters/index.js"),
    Feature("manager-semester-form", "Manager Semester Form", "features/manager-semester-form/index.js"),
    Feature("manager-reports", "Manager Reports", "features/manager-reports/index.js"),
    Feature(
        "instructor-dashboard",
        "Instructor Dashboard",
        "features/instructor-dashboard/index.js",
    ),
    Feature("power-tools", "Power Tools", "features/power-tools/index.js"),
)

HEADER = """// ==UserScript==
// @name         GT TA Hiring Toolkit
// @namespace    https://gatech.edu/
// @version      2.10.0
// @description  Unified dashboards, search, ranking tools, student details, and styling for the GT TA Hiring application.
// @match        https://ta-app.cc.gatech.edu/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==
"""


def read_source(relative_path: str) -> str:
    path = SRC / relative_path
    if not path.is_file():
        raise FileNotFoundError(f"Missing source file: {path.relative_to(ROOT)}")
    return path.read_text(encoding="utf-8").rstrip()


def without_metadata(source: str) -> str:
    """Allow feature sources to remain independently installable while bundled."""
    start = source.find("// ==UserScript==")
    if start == -1:
        return source.strip()

    marker = "// ==/UserScript=="
    end = source.find(marker, start)
    if end == -1:
        raise ValueError("Found userscript metadata without a closing marker")
    return source[end + len(marker) :].lstrip()


def indent(source: str, spaces: int = 8) -> str:
    prefix = " " * spaces
    return "\n".join(prefix + line if line else "" for line in source.splitlines())


def compact_css_blocks(source: str) -> str:
    """Collapse CSS template indentation in generated output, not source files."""
    pattern = re.compile(r"(style\.textContent\s*=\s*`)(.*?)(`;)", re.DOTALL)

    def compact(match: re.Match[str]) -> str:
        css = " ".join(
            line.strip()
            for line in match.group(2).splitlines()
            if line.strip()
        )
        return f"{match.group(1)}\n{css}\n{match.group(3)}"

    return pattern.sub(compact, source)


def build_feature(feature: Feature) -> str:
    body = compact_css_blocks(without_metadata(read_source(feature.source)))
    return f"""// ---- feature: {feature.id} ----
    toolkit.register({{
        id: {feature.id!r},
        name: {feature.name!r},
        init() {{
{indent(body)}
        }}
    }});"""


def build() -> str:
    runtime = read_source("core/runtime.js")
    theme = compact_css_blocks(read_source("theme/shared.js"))
    features = "\n\n".join(build_feature(feature) for feature in FEATURES)

    return "\n\n".join(
        (
            HEADER.rstrip(),
            runtime,
            "(function registerToolkitFeatures(toolkit) {\n"
            "    'use strict';\n\n"
            f"{theme}\n\n"
            f"{features}\n"
            "})(window.GTTAHiringToolkit);",
            "window.GTTAHiringToolkit.start();",
        )
    ) + "\n"


if __name__ == "__main__":
    OUTPUT.write_text(build(), encoding="utf-8")
    print(f"Built {OUTPUT.name} with {len(FEATURES)} features.")
