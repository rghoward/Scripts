# HWPO Android workout API investigation

Date: 2026-07-27  
App: `com.hwpo_training_app` version `1.3.25` (`versionCode` 41)  
Environment: Android 15 / API 35 Google Play emulator, `emulator-5554`

## Scope and confidence

This investigation used the user's own installed app and account. Chrome HTTPS interception was verified, but HWPO rejected the user-installed proxy CA before sending HTTP. No pinning bypass, app modification, runtime instrumentation, or private app-storage extraction was attempted.

The hostname, base path, methods, endpoint annotations, form fields, bearer-token interceptor, and Kotlin serialization field names below are confirmed by read-only inspection of the installed APK. The JSON examples are schema-derived and sanitized; they are not captured account records.

## Interception result

- Google Play AVD booted and appeared in `adb devices` as `emulator-5554`.
- Official Play package `com.hwpo_training_app` was installed.
- mitmproxy was configured at emulator proxy `10.0.2.2:8080`.
- Android Chrome successfully loaded `https://example.com` through the proxy after installing its user CA.
- HWPO connected to `app.hwpo-training.com:443`, but terminated TLS with `SSLHandshakeException` / `CertPathValidatorException: Trust anchor for certification path not found`.
- This is consistent with Android's default network security behavior for a target-SDK-35 app: user-added CAs are not automatically trusted by the app.
- No certificate-pin mismatch or explicit pinning exception was observed. Therefore pinning is **not established**; the confirmed blocker is the app trust configuration.

## API

- Hostname: `app.hwpo-training.com`
- Base URL: `https://app.hwpo-training.com/mobile/api/v4/`
- Transport: HTTPS
- Serialization: JSON for normal API bodies; login is form URL encoded.
- Authenticated requests: `Authorization: Bearer <ACCESS_TOKEN>`

### Authentication

`POST users/sign_in` is form URL encoded with:

- `client_id`
- `client_secret`
- `email`
- `password`

The response model contains:

- `access_token`
- `token_type`
- `current` (the current user object)

The app stores the access token through Android `AccountManager`. An OkHttp interceptor reads it and adds `Authorization: Bearer <token>` when present. The inspected response model has no refresh-token field. The app also exposes `GET users/me` and `DELETE users/sign_out`.

### Workout retrieval endpoints

| Method | Relative endpoint | Request | Response model |
|---|---|---|---|
| GET | `schedules` | Query `from` and `to`, Unix epoch seconds | `ScheduleResponse` |
| GET | `schedules/{schedule_id}/` | Path ID | `ScheduleDetailsResponse` |
| GET | `schedules/{schedule_id}/sections/{section_id}` | Path IDs | `ProgramSectionNetworkEntity` |
| GET | `athlete/schedules/{date}/plans/{plan_id}` | Date string and plan ID | `ScheduleDetailsResponse` |

Related mutation endpoints found in the same interface:

| Method | Relative endpoint | Purpose |
|---|---|---|
| POST | `schedules/{schedule_id}/sections/{section_id}/performance` | Save performance JSON |
| DELETE | `schedules/{schedule_id}/sections/{section_id}/performance` | Delete performance |
| POST | `schedules/{schedule_id}/sections/{section_id}/complete` | Mark complete |
| DELETE | `schedules/{schedule_id}/sections/{section_id}/complete` | Undo complete |
| POST | `sections/{section_id}/benchmarks` | Save benchmark JSON |

For a read-only personal importer, only the GET endpoints should be used.

## Response JSON structure

`GET schedules` returns an object shaped as follows:

- `schedules`: array of schedule objects
  - `id`: integer
  - `color`: string
  - `plan`: object
    - `id`: nullable integer
    - `title`: string
    - `plan_type`: enum-like string
    - `cover_url`: nullable string
    - `plan_options`: nullable array
  - `day_number`: nullable integer
  - `date`: Unix epoch seconds
  - `sections`: array of workout-section objects
  - `can_navigate_back`: nullable boolean
  - `can_navigate_forward`: nullable boolean
- `launch_dates`: array of `{title, cover_url}` objects

A section can contain:

- `id`, `title`, `kind`, `position`, `description`
- `has_performance`, `has_feedback`
- `attachment_for_tip`, `attachments`
- `benchmarks`
- `performance`
- `plan_option_id`
- `score`
- `pre_wod`, `post_wod`

Known section kinds are `tip`, `leaderboard`, `section`, `challenge`, `pre_wod`, and `post_wod`. Attachments include identifiers and metadata such as `title`, `src`, thumbnails, content type, streaming source, video ID, position, type, and file sizes. Performance objects include `id`, text, and attachments. Benchmark objects include `id`, name, measure type, last value, units, and symbol.

## Official API check

No public, athlete-facing HWPO/FITR API documentation was found in the official help material. FITR documents Zapier features for some provider plans, but that is not evidence of a supported client workout-history API. Before relying on the private mobile API, contact HWPO/FITR support and ask specifically for a personal data export or read-only API access.

## Recommended architecture

1. **Official path first.** Ask support for an official export/API. If supplied, use it and avoid coupling to mobile internals.
2. **Private API adapter, only if permitted.** Keep all HWPO-specific logic behind a replaceable `WorkoutSource` interface. Authenticate interactively; store the token only in Android Keystore-backed encrypted storage. Never embed a personal password. Treat endpoint behavior as unstable and respect subscription visibility.
3. **Local-first database.** Use Room with normalized tables for plans, workout days, sections, attachments, benchmarks, and performance. Preserve a sanitized/raw JSON snapshot per fetched object for forward compatibility, plus `source_id`, `source_updated_at` if available, `first_seen_at`, `last_seen_at`, and a content hash.
4. **Incremental synchronization.** Fetch a bounded date window using `GET schedules?from=&to=`. Upsert by source IDs in one transaction. Expand backward in chunks for historical import, then sync a small recent/future window. Use WorkManager with network constraints and conservative retry/backoff. Do not automate mutation endpoints.
5. **Search and analysis.** Add Room FTS over plan title, section title, description, performance text, and benchmark names. Build analytics from normalized records, not directly from network DTOs.
6. **Export.** Generate versioned JSON for lossless backup, flattened CSV for portability, and optional Google Sheets upload as an explicit user action. Exclude access tokens and internal account identifiers from every export.

Recommended module boundary:

```text
HWPO/FITR source adapter -> sync mapper -> Room database -> search/analytics/export
                                 |
                                 +-> encrypted sync credentials (never exported)
```

## Remaining uncertainty

Because app TLS decryption was not bypassed, exact live header variations, status codes, pagination behavior, server-side rate limits, and an actual account response were not observed. The saved examples intentionally distinguish confirmed schema from captured data. A system-CA test on a disposable emulator would be the next technical step, but it is more invasive and should only be considered after checking official support/terms.
