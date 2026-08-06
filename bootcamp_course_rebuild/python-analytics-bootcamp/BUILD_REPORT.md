# Build Report

## Scope completed

This first delivery intentionally stops at the requested review gate: repository foundation, supporting documentation, deterministic shared data, the cached Open-Meteo fixture, and all Day 1 lessons. Days 2–5 and optional material have not been authored.

## Repository foundation

- Created the specified top-level course structure, data folders, day folders, and optional folders.
- Created `README.md`, `COURSE_MAP.md`, `STYLE_GUIDE.md`, `COMPANY_AND_DATA_GUIDE.md`, `LESSONS_LEARNED.md`, and `requirements.txt`.
- Created `data/generate_data.py`, using fixed seed `20260804`.

## Data and API fixture

| Artifact | Result |
| --- | --- |
| `stores.csv` | 7 stores with coordinates |
| `products.csv` | 40 fictional products across five categories |
| `customers.xlsx` | 250 customers; `customers` and `segments` worksheets |
| `orders.csv` | 2,432 order lines, including two duplicate rows, three blank discounts, two quantity outliers, and minor channel-text inconsistencies |
| `open_meteo_sample_response.json` | Captured from the public Open-Meteo Forecast API; includes daily time, maximum/minimum temperature, precipitation, and weather-code lists |

The customer workbook includes three intentionally blank region values for introductory missing-data practice after merging.

## Day 1 lesson pairs

| Lesson | Minutes | Instructor and starter artifacts |
| --- | ---: | --- |
| 01 Getting started and variables | 35 | Variables, types, arithmetic, f-strings |
| 02 Conditionals | 40 | Comparisons, pricing rules, Boolean logic |
| 03 Iteration | 50 | `for`, `range`, accumulator, brief `while` |
| 04 Functions | 50 | Parameters, returns, local values, docstrings |
| 05 Day 1 practice | 35 | Small order-pricing program |

Each instructor lesson includes completed code, instructional comments, exercises, expected output where useful, and teaching cues. Every starter file retains the same section order and contains scaffolding and TODO prompts without solution functions.

## Validation completed

Run on 2026-08-04:

- Executed all five Day 1 instructor scripts successfully.
- Checked all five required data artifacts exist and their schemas/row counts meet the specification.
- Confirmed the Excel workbook has exactly the required worksheets and 250 customer rows.
- Confirmed the cached API fixture has the required nested `daily` fields.
- Confirmed each Day 1 starter/instructor pair has identical ordered section headings.
- Confirmed starter files contain no `def` statements, preventing embedded function solutions.
- Reviewed Day 1 scope and timing against the 3.5-hour course map.

## Notes for review

The first live fixture capture was blocked by the sandbox network boundary. A one-time authorized request then captured the compatible Open-Meteo response successfully. The future Day 2 API lesson will use this fixture only when its live `requests.get(..., timeout=10)` call raises a `requests.RequestException`.

No deviations from the requested Day 1 scope remain. Awaiting approval before authoring Day 2.
