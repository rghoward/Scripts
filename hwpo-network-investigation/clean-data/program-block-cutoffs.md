# Inferred programming block cutoffs

## Conclusion

The strongest supported block model is a **12-week / 84-day cycle**, anchored to
the plans' own day numbers. The source data explicitly labels individual weeks;
the 12-week grouping is inferred from recurring strength-program changes and
testing/reset patterns. It is not explicitly named by the API.

Confidence: **high** for weekly boundaries; **moderate** for the 12-week theme
boundaries.

## Inferred themes by block

These names summarize the most frequent strength movements and the apparent
progression emphasis. They are descriptive labels, not official HWPO names.

| Block | Days | Inferred theme | Main evidence |
|---:|---:|---|---|
| 1 | 1-84 | Squat and press foundation | High-frequency front/back squat, strict press, bench, deadlift, and introductory power-jerk/snatch work |
| 2 | 85-168 | Olympic-lifting and posterior-chain intensification | Highest snatch emphasis of early FLAGSHIP, increased deadlift, power snatch/clean, overhead squat, and split jerk |
| 3 | 169-252 | Squat, jerk, and bench strength | Back/front squat dominate; split jerk and bench volume rise while power snatch/clean remain in support |
| 4 | 253-336 | Balanced Olympic technique and pulling strength | Snatch, deadlift, split jerk, strict press, bench, and both squat patterns are distributed unusually evenly |
| 5 | 337-420 | Squat-and-press development with snatch exposure | Front/back squat, strict press, bench, deadlift, and snatch recur across nearly every week |
| 6 | 421-504 | Full Olympic integration | Snatch/squat snatch, squat clean, split jerk, power clean, squats, and deadlift are trained together; FLAGSHIP ends during this block |
| 7 | 505-588 | Power-clean complexes and total-body strength | Power clean becomes the leading emphasis, supported by squat clean, split jerk, squat snatch, bench, squats, and deadlift |
| 8 | 589-672 | Snatch and upper-body strength with max testing | Snatch/squat snatch plus bench and strict press dominate; front-squat and deadlift 1RM-style testing appears late in the block |
| 9 | 673-756 | Front squat, strict press, and aerobic benchmarking | Front squat, strict press, bench, squat snatch, and deadlift lead; rowing volume and a 2K row time trial stand out |
| 10 | 757-840 | Squat/press strength and clean-and-jerk testing | Back/front squat, strict/push press, bench, split jerk, and squat clean lead into strict-press/front-squat max tests |
| 11 | 841-924 | Olympic-lifting rebuild | Squat snatch, power clean, power jerk, front/back squat, and clean-and-jerk complexes become the clear center of the block |
| 12 | 925-946 available | Balanced continuation / incomplete block | The available three weeks mix squats, split/power jerk, squat/power snatch, power clean, and deadlift without enough data to identify a distinct full-block peak |

## FLAGSHIP 1.0

| Block | Weeks | Days | Dates | Status |
|---:|---:|---:|---|---|
| 1 | 1-12 | 1-84 | 2023-04-02 to 2023-06-24 | Complete |
| 2 | 13-24 | 85-168 | 2023-06-25 to 2023-09-16 | Complete |
| 3 | 25-36 | 169-252 | 2023-09-17 to 2023-12-09 | Complete |
| 4 | 37-48 | 253-336 | 2023-12-10 to 2024-03-02 | Complete |
| 5 | 49-60 | 337-420 | 2024-03-03 to 2024-05-25 | Complete |
| 6 | 61-69 | 421-481 | 2024-05-26 to 2024-07-25 | Plan ends mid-block |

## 60 1.0

| Block | Weeks | Days | Dates | Status |
|---:|---:|---:|---|---|
| 4 | 41-48 available | 286-336 | 2024-10-05 to 2024-11-24 | Partial; earlier days not fetched |
| 5 | 49-60 | 337-420 | 2024-11-25 to 2025-02-16 | Complete |
| 6 | 61-72 | 421-504 | 2025-02-17 to 2025-05-11 | Complete |
| 7 | 73-84 | 505-588 | 2025-05-12 to 2025-08-03 | Complete |
| 8 | 85-96 | 589-672 | 2025-08-04 to 2025-10-26 | Complete |
| 9 | 97-108 | 673-756 | 2025-10-27 to 2026-01-18 | Complete |
| 10 | 109-120 | 757-840 | 2026-01-19 to 2026-04-12 | Complete |
| 11 | 121-132 | 841-924 | 2026-04-13 to 2026-07-05 | Complete |
| 12 | 133-135 available | 925-946 | 2026-07-06 to 2026-07-27 | Plan ends mid-block |

## Evidence and caveats

- FLAGSHIP video titles explicitly label Weeks 1 through 69.
- 60 video titles explicitly label Weeks 41 through 132; its day numbers align
  with the same seven-day week numbering (`week = ceil(day / 7)`).
- Large strength-program signature changes occur at or near several 12-week
  boundaries, especially FLAGSHIP Weeks 13 and 25.
- Max/testing language clusters around several cycle transitions, including
  Weeks 49, 61, 73, and 97 in the overlapping programming.
- Smaller changes also occur inside these blocks. Those appear to be weekly or
  short mesocycle changes, so they are not reliable top-level cutoffs.
- The API provides week numbers but no explicit field naming a larger phase or
  theme. Treat the 12-week grouping as derived metadata, not source truth.
