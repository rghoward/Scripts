# CS Capstone Expo print materials

The Python scripts are shared across semesters. Each semester has a local `input/` folder for source files and an `output/` folder for generated PDFs and editable PowerPoints. Git ignores these folders because they can contain student data. The shared Georgia Tech logo and client QR image are in `assets/`.

## Generate Fall 2026 materials

Open a terminal in this folder. If you need to install the Python dependencies, run these commands once.

```sh
python3 -m venv .venv
source .venv/bin/activate
python -m pip install pandas openpyxl Pillow python-pptx reportlab
```

Create `fall-2026/input/` and put the Fall files there. Run the scripts for the formats you need.

```sh
python3 table_tent_generator_portrait.py fall-2026
python3 table_tent_generator_8.5x_11.py fall-2026
python3 team_directory_generator.py fall-2026
python3 qr_code_insert_portrait.py fall-2026
```

The table-sign scripts above make letter portrait and letter landscape signs. Select the Expo Planning workbook when prompted. It needs course section, team number, table number, and project name columns. For descriptions, the scripts prefer `Project Description` and fall back to `Short Description of Project (2-3 sentences)`. Text that exceeds the space available on the sign ends with an ellipsis.

While table assignments are pending, add `--draft` to either table-sign command. Missing assignments print as “TABLE TBD” and the files go to `fall-2026/output/draft/`. For final signs, fill in the `Table Number` column and run without `--draft`.

For the directory poster and map handout, select a workbook with `Team Name` and `Table Number` columns, then select the fall map image. The QR sign uses the shared client QR image and needs no file selection.

On macOS the picker starts in `fall-2026/input/`. You can also supply paths directly, which lets you run the scripts without the picker.

```sh
python3 table_tent_generator_portrait.py fall-2026 --excel "fall-2026/input/Expo Planning.xlsx"
python3 team_directory_generator.py fall-2026 --excel "fall-2026/input/teams_tables.xlsx" --map "fall-2026/input/exhibition_map.png"
```

Files go to `fall-2026/output/`. Rerunning a format for the same semester replaces that format's generated files. Use a different semester argument, such as `spring-2027`, to generate files for a future Expo.

## Compile classroom mock expo feedback

Use the Microsoft Forms feedback export and the Expo Planning workbook. The script matches responses by course section and team number, calculates the average for each rubric category, and produces a PDF per team with the written comments. Reviewer names and emails from the form are omitted. If any team numbers cannot be matched, the script writes a CSV with their workbook row numbers for review.

```sh
python3 compile_mock_expo_feedback.py "fall-2026/input/Classroom Mock Expo Demos Fall 2026.xlsx" \
  --roster "fall-2026/input/Expo Planning Information Form Fall 2026.xlsx" \
  --output "fall-2026/output/mock-expo-feedback" --term "Fall 2026"
```

Use a new or empty output directory for each run. The optional `--map-61-to-63` flag corrects team numbers in the 6100s to the corresponding numbers in the 6300s for the Fall 2026 form.
