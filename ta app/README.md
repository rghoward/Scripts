# GT TA Hiring Toolkit

Install `gt-ta-hiring-toolkit.user.js` in Tampermonkey. It is a generated file;
make changes under `src/` instead of editing the bundle directly.

## Source layout

```text
src/
├── core/
│   └── runtime.js              Feature registration and safe startup
├── theme/
│   └── shared.js               Shared design tokens and global styles
└── features/
    ├── page-enhancer/
    ├── landing-page/
    ├── instructor-home/
    ├── my-courses/
    ├── instructor-dashboard/
    └── power-tools/
```

Each feature owns its page detection, behavior, and component-specific styles.
The runtime starts features independently, so an error in one feature is logged
without preventing the others from starting.

## Build and validate

From this directory, run:

```sh
python3 build_toolkit.py
node --check gt-ta-hiring-toolkit.user.js
```

After rebuilding, update the installed Tampermonkey script with the generated
`gt-ta-hiring-toolkit.user.js`. Do not enable old individual scripts alongside
the toolkit.

## Add a feature

1. Create `src/features/<feature-name>/index.js`.
2. Give the feature its own narrow page guard and duplicate-initialization guard.
3. Add one `Feature(...)` entry to `FEATURES` in `build_toolkit.py`.
4. Rebuild and run the syntax check.

Keep shared infrastructure small. UI or behavior used by only one feature should
stay inside that feature until a second feature genuinely needs it.
