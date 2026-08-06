# Python for Analytics Bootcamp v2 — Codex Build Specification

## 1. Goal and constraints

Build a completely new five-day Python for Analytics bootcamp for incoming analytics master's students. Most students have some Python experience; a few are complete beginners.

Total contact time is 15.5 hours:

- Monday: 1:00–4:30 (3.5 hours)
- Tuesday: 1:00–4:30 (3.5 hours)
- Wednesday: 1:30–4:30 (3 hours)
- Thursday: 2:00–4:30 (2.5 hours)
- Friday: 9:00–12:00 (3 hours)

Build the course from scratch. Do not copy, paraphrase, refactor, or adapt code, explanations, exercises, datasets, comments, or structure from the old course archive. The archive may be consulted only to confirm broad topic coverage.

## 2. Course mission

Teach enough Python for students to succeed in later analytics courses.

By Friday, students should be able to:

1. Read and write small Python programs.
2. Use variables, conditionals, loops, functions, strings, lists, and dictionaries.
3. Read and write text, CSV, Excel, and JSON data.
4. Retrieve JSON from a real public API and save it locally.
5. Use NumPy arrays, vectorization, indexing, aggregation, and boolean masking.
6. Load, inspect, filter, transform, group, merge, and export pandas DataFrames.
7. Perform a basic exploratory data analysis.
8. Create simple visualizations.
9. Recognize web scraping as another acquisition method.
10. Read tracebacks and use documentation and help tools.

## 3. Required instructional philosophy

- Analytics first.
- Scripts before notebooks.
- Practice over coverage.
- One or two new ideas per lesson segment.
- Examples should be concise and usually fit on one screen.
- Use one coherent business theme.
- Every lesson includes guided practice and independent work.
- Leave time for questions and do not fill every minute with lecture.
- Instructor files are the source of truth.
- Starter files mirror instructor files exactly in section order.

## 4. Explicitly out of scope

Do not make these required lessons:

- XML
- advanced regular expressions
- object-oriented programming
- classes
- decorators or generators
- advanced NumPy
- deep matplotlib instruction
- comprehensive web scraping
- machine learning theory
- scikit-learn as a required lesson

Web scraping may appear only as a short optional demonstration. Scikit-learn may be placed in an optional folder only if time remains after the core course is complete.

## 5. Paired-file rule

Every teaching artifact must have exactly two versions:

- `*_instructor.py` or `*_instructor.ipynb`
- `*_starter.py` or `*_starter.ipynb`

### Instructor version

Must contain:

- all code completed and runnable
- detailed comments explaining new syntax and reasoning
- all exercises and challenges solved
- expected output where useful
- teaching cues marked `INSTRUCTOR NOTE:`
- likely misconceptions marked `COMMON MISTAKE:`
- optional extensions marked `IF TIME:`

Comments should explain reasoning and new concepts, not narrate every obvious line.

### Starter version

Must contain:

- the same headings and sequence as the instructor version
- concise explanations of new concepts
- setup and imports needed to begin
- partially completed examples where appropriate
- clear `TODO:` markers
- exercise prompts and expected outcomes
- enough scaffolding for complete beginners
- no hidden or commented-out solutions

Derive starter files from instructor files so they remain synchronized.

## 6. Repository structure

Create all work inside a new folder named `python-analytics-bootcamp`.

```text
python-analytics-bootcamp/
├── README.md
├── COURSE_MAP.md
├── STYLE_GUIDE.md
├── COMPANY_AND_DATA_GUIDE.md
├── BUILD_REPORT.md
├── LESSONS_LEARNED.md
├── requirements.txt
├── data/
│   ├── raw/
│   │   ├── orders.csv
│   │   ├── products.csv
│   │   ├── customers.xlsx
│   │   ├── stores.csv
│   │   └── open_meteo_sample_response.json
│   ├── processed/
│   └── generate_data.py
├── day01_python_fundamentals/
├── day02_working_with_data/
├── day03_numpy/
├── day04_pandas_foundations/
├── day05_analysis/
└── optional/
    ├── web_scraping/
    └── sklearn/
```

Keep paired files beside one another.

## 7. Common theme

Use a fictional outdoor retailer named **Blue Ridge Outfitters** throughout the course.

The company operates stores in several southeastern and mid-Atlantic cities and sells outdoor equipment and apparel. Use this context for variables, conditionals, loops, functions, files, arrays, DataFrames, exercises, and the final analysis.

Do not force the theme into every trivial syntax example, but prefer it whenever it improves continuity.

## 8. Real API requirement

Use the real public **Open-Meteo Forecast API**.

Use store latitude and longitude values from `stores.csv`. Query daily forecast values such as:

- `temperature_2m_max`
- `temperature_2m_min`
- `precipitation_sum`
- `weather_code`

Use Fahrenheit and an appropriate timezone.

The API lesson must:

1. make a real request with `requests.get(..., timeout=10)`
2. use query parameters rather than manually concatenating a long URL
3. call `raise_for_status()`
4. inspect the returned top-level dictionary and nested lists
5. explain that JSON objects become Python dictionaries and arrays become Python lists
6. save the result to JSON
7. handle `requests.RequestException`
8. fall back to `data/raw/open_meteo_sample_response.json` when the network fails

The cached response must have the same shape as the live response.

Do not require an API key.

## 9. CSV and Excel data package

Create deterministic fictional business data with a fixed random seed.

### `stores.csv`

Approximately 5–8 stores with:

- store_id
- store_name
- city
- state
- region
- latitude
- longitude

Suggested cities may include Atlanta, Asheville, Charlotte, Nashville, Richmond, and Knoxville.

### `products.csv`

Approximately 40–60 products with:

- product_id
- product_name
- category
- subcategory
- supplier
- standard_cost
- list_price

Suggested categories:

- Camping
- Hiking
- Apparel
- Hydration
- Accessories

### `customers.xlsx`

Approximately 250 customers. Include at least two worksheets:

- `customers`
- `segments`

Customer columns:

- customer_id
- customer_name
- segment
- city
- state
- region
- signup_date
- loyalty_member

### `orders.csv`

Approximately 2,000–3,000 order-line records with:

- order_id
- order_date
- customer_id
- store_id
- product_id
- quantity
- unit_price
- discount
- shipping_cost
- sales_channel
- returned

Include limited intentional messiness:

- a few missing customer regions
- a few null discounts
- minor whitespace or capitalization inconsistencies
- a small number of duplicate order rows
- one or two quantity outliers

Cleaning must be meaningful but must not consume the entire final day.

## 10. Weekly lesson architecture

### Monday — Python fundamentals (3.5 hours, `.py` files)

1. `01_getting_started_and_variables` — 35 minutes
   - run a script in VS Code
   - comments, `print()`, variables, naming
   - integers, floats, strings, booleans
   - arithmetic, `type()`, light f-string introduction
   - exercise: retail subtotal, tax, and total

2. `02_conditionals` — 40 minutes
   - comparisons
   - `if`, `elif`, `else`
   - `and`, `or`, `not`
   - exercise: discount tier and shipping eligibility

3. `03_iteration` — 50 minutes
   - `for`, `range()`, accumulator pattern
   - iterate over a short list
   - brief `while` demonstration only
   - exercise: total and average daily sales

4. `04_functions` — 50 minutes
   - defining and calling functions
   - parameters and return values
   - local variables
   - docstrings briefly
   - exercise: reusable order-total function

5. `05_day01_practice` — 35 minutes
   - cumulative student work
   - challenge: a small order-pricing program

Reserve 20–30 minutes across the day for setup, questions, break, and recap.

### Tuesday — Working with data (3.5 hours, `.py` files)

1. `01_strings_lists_and_dictionaries` — 70 minutes
   - useful string methods
   - indexing and slicing briefly
   - lists: create, access, append, iterate
   - dictionaries: keys, values, lookup, update
   - nested list/dictionary structures

2. `02_files_csv_excel_json` — 65 minutes
   - `with open(...)`
   - text files briefly
   - CSV with Python's `csv` module at an introductory level
   - JSON with `json.load` and `json.dump`
   - introduce Excel as a format to be handled later with pandas

3. `03_real_api_and_error_handling` — 55 minutes
   - Open-Meteo request
   - parameters, response, status, JSON
   - exceptions and fallback file
   - save API response locally

4. `04_day02_practice` — 30 minutes
   - inspect nested API data
   - extract selected forecast values
   - save a concise summary

Reserve time for questions and recap.

### Wednesday — NumPy (3 hours, notebooks)

1. `01_jupyter_and_numpy_foundations` — 75 minutes
   - notebook cells, Markdown, kernel basics
   - create arrays
   - shape, dtype, indexing, slicing
   - simple aggregations

2. `02_vectorization_and_masking` — 75 minutes
   - vectorized arithmetic
   - comparison operations
   - boolean masks
   - broadcasting at an introductory level
   - exercise using product prices, quantities, or daily sales

3. `03_numpy_practice` — 30 minutes
   - cumulative numeric analysis

Reserve roughly 20–30 minutes for transition, questions, and recap.

### Thursday — pandas foundations (2.5 hours, notebooks)

1. `01_dataframe_foundations` — 70 minutes
   - Series only as a brief bridge
   - `read_csv`, `read_excel`
   - `head`, `info`, `shape`, `columns`, `dtypes`
   - column selection
   - `loc` and `iloc` at a practical level

2. `02_filter_sort_transform` — 60 minutes
   - boolean filtering
   - sorting
   - creating calculated columns
   - string cleaning
   - missing values at an introductory level

Reserve 20 minutes for questions and recap.

### Friday — Analysis workflow (3 hours, notebooks)

1. `01_eda_groupby_and_missing_data` — 65 minutes
   - EDA workflow
   - `head`, `info`, `describe`, `value_counts`, `isna().sum()`
   - groupby and aggregation
   - handling missing values

2. `02_merging_and_api_normalization` — 50 minutes
   - merge orders, customers, products, and stores
   - load Tuesday's saved weather JSON
   - reshape or normalize daily weather lists into tabular form
   - merge forecast data with store data

3. `03_visualization_and_capstone` — 55 minutes
   - simple pandas plots only
   - answer business questions
   - export a result CSV

Suggested capstone questions:

- Which region generated the most revenue?
- Which product categories produced the highest estimated margin?
- Which stores had the highest return rates?
- Which customer segments generated the most revenue?
- Which stores have the highest forecast precipitation?
- Which locations may need weather-sensitive inventory or staffing decisions?

Optional only if core material is complete:

- 10-minute web-scraping demonstration
- short scikit-learn epilogue

## 11. Lesson design standard

Every lesson artifact should follow this rhythm:

1. Why this matters
2. Learning objectives
3. Concise concept explanation
4. Instructor demonstration
5. Guided exercise
6. Independent challenge
7. Recap and preview

Do not build lecture-heavy reference manuals. Build teachable artifacts that fit the stated time budgets.

## 12. Code and writing standards

- Python 3.11+ compatible
- use descriptive `snake_case` names
- use f-strings
- use `pathlib.Path` for file paths
- use context managers for files
- use `encoding="utf-8"` for text files
- use request timeouts and exception handling
- avoid unnecessary dependencies
- keep code cells and examples concise
- do not introduce advanced syntax before it is taught
- do not use list comprehensions before the course has explained them; they are not required
- use reproducible random seeds
- avoid type hints where they distract beginners; use them only when they clearly help

## 13. Validation requirements

Codex must:

1. run every instructor `.py` file
2. execute every instructor notebook from top to bottom
3. confirm all expected datasets and output files exist
4. confirm paired starter and instructor artifacts use identical section order
5. verify starter files contain no solutions
6. verify no core lesson exceeds its scope or time budget
7. record results in `BUILD_REPORT.md`

## 14. Build order

1. Create repository and documentation.
2. Create deterministic datasets and cached API fixture.
3. Build and validate all Day 1 instructor files.
4. Derive and inspect Day 1 starter files.
5. Repeat for Days 2–5.
6. Build optional material only after every core artifact passes validation.
7. Perform a final teachability and pacing review.

## 15. Definition of done

The project is complete when:

- every required lesson has a synchronized starter/instructor pair
- all instructor artifacts run successfully
- datasets are deterministic and documented
- the live API lesson has a working cached fallback
- the full schedule fits within 15.5 hours without assuming nonstop lecture
- pandas and NumPy are taught on separate days
- web scraping and scikit-learn remain optional
- all content is newly written and follows the common Blue Ridge Outfitters theme
