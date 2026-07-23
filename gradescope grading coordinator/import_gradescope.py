#!/usr/bin/env python3
"""Import the configured Gradescope assignment without changing Gradescope."""

import argparse

from coordinator.gradescope_importer import import_assignment


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--skip-activity", action="store_true", help="Skip per-question progress synchronization")
    args = parser.parse_args()
    result = import_assignment(sync_activity=not args.skip_activity)
    print("Read-only Gradescope import completed.")
    print(f"Local assignment ID: {result.assignment_id}")
    print(f"Questions: {result.questions}")
    print(f"Submissions: {result.submissions} ({result.late_submissions} late)")
    print(f"Course staff: {result.staff}")
    print(f"Observed graded cells: {result.graded_cells}")


if __name__ == "__main__":
    main()
