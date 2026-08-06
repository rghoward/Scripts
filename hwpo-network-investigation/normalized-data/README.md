# Max-based workout normalization

`hwpo-workouts-with-loads.json` is a derived copy of the private consolidated
archive. The original files in `clean-data/` remain unchanged.

Run `python3 normalize_workout_loads.py` from the investigation directory to
rebuild it.

## Added fields

Each recognized section receives a `load_annotations` array. An annotation can
contain:

- `movement`
- `basis` (`historical_personal_max` or `prior_result`)
- `benchmark_code` and `benchmark_name`
- `historical_max_lb` and `historical_max_date`
- `rendered_load_lb`
- `percent_of_max`
- `load_formula`
- `confidence`
- `review_status` and `review_reason`
- `evidence_excerpt`

Each annotated workout also receives a small `load_normalization` summary.

## Interpretation

`explicit` means the percentage appeared in the source text. `high` means a
precise rendered load resolves to an integer percentage of the dated benchmark.
`medium` means an integer rendered load resolves the same way but deserves more
care because ordinary fixed workout weights can coincide with percentages.
`review_status` records whether that inference was verified or still needs a
manual decision.

Only annotated values may be recalculated against a new max. Unannotated loads
must remain literal until reviewed. The application should round calculated
loads to equipment the athlete can actually use.

This is a reconstruction aid, not a claim that every source load was based on a
max. Complexes, limiting-movement formulas, fixed metcon standards, missing
benchmark histories, and prescriptions based on a recent rep-max can require
manual review.
