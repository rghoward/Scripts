# iOS parity acceptance checklist

## Scope

iOS parity means a reliable iPhone training experience, not merely a project
that compiles. Android-only HDMI secondary-display and Chromecast controls are
explicitly out of scope until an Apple-specific display/casting decision is
made; they must remain unavailable rather than partially functional.

## Baseline target

* iOS 13.0 or later.
* The same immutable published snapshot, SQLite schedule/history, guided
  workout, score capture, PRs, and profile settings as Android.
* Local-first operation when cloud settings are absent.
* The same optional Supabase account/import flow when cloud settings are
  supplied at build time.

## Acceptance checks

### Build and launch

- [x] Debug build succeeds for an iOS simulator without code signing. An
  unsigned iOS device build also completed on 2026-08-13.
- [x] The app launches on an iPhone 16 (iOS 18) simulator and renders the
  expected first-run setup shell. Snapshot import/relaunch persistence remains
  a separate acceptance check.
- [ ] The initial setup, Profile, and all five scheduled workout cards render
  without Android-only controls or missing-plugin errors.

### Training loop

- [ ] Full, 60-minute, and recovery views display the same sections and
  percentage-load references as Android.
- [ ] Guided Workout timers, section completion, pause/resume/reset, and
  final completion recap work while the app remains foregrounded.
- [ ] Conditioning scores, benchmarks, PR/training-max edits, substitutions,
  backfilled completions, and scheduled-day stability persist across relaunch.

### Cloud account flow

- [x] Register `com.rhoward.hootsandreps://auth/callback` in the iOS app.
- [x] The iPhone simulator resolves
  `com.rhoward.hootsandreps://auth/callback` back to the installed app.
- [ ] On a physical iPhone, create/sign in to an account; the confirmation
  landing page's **Open Hoots & Reps** button returns the auth response to the
  app and establishes a session.
- [ ] Review and import local history only after the audit counts are shown;
  verify the cloud counts against the phone before enabling sync.

### Explicit iOS exclusions for this phase

- HDMI secondary-display presentation is Android-only.
- Chromecast control is Android-only. The iPhone must keep the normal local
  workout and timer experience; an Apple TV/AirPlay solution requires a
  separate product decision and implementation.

## Completion evidence

Record simulator build output, iOS version/device, the first-launch and
relaunch checks, and a physical-device email-confirmation test before calling
iOS parity complete.
