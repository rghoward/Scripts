# Supabase setup

This directory is the cloud companion to the existing SQLite-first Hoots &
Reps app. Applying the migration creates user-scoped, immutable program and
history tables; it does not copy any athlete data by itself.

1. Create a Supabase project and enable Email Auth.
2. Link the project with the Supabase CLI, then run `supabase db push` from
   this directory's parent project.
3. Deploy `storage/email-confirmed.html` as the `email-confirmed` static asset
   on the Hoots & Reps Cloudflare Worker, then add the public page URL in
   **Authentication → URL Configuration → Additional Redirect URLs**:

   ```text
   https://hoots-reps-confirmed-page.YOUR_WORKERS_SUBDOMAIN.workers.dev/email-confirmed
   ```

   The page clearly confirms success in the browser and provides an explicit
   **Open Hoots & Reps** button. It forwards the returned auth code to
   `com.rhoward.hootsandreps://auth/callback` after a user gesture. Do not use
   an Edge Function or a Storage-dashboard upload as a GET confirmation page:
   they serve HTML as plain text.
4. Run the app with values from **Project Settings → API**:

   ```sh
   flutter run \
     --dart-define=SUPABASE_URL=https://YOUR_PROJECT.supabase.co \
     --dart-define=SUPABASE_PUBLISHABLE_KEY=YOUR_PUBLISHABLE_KEY
   ```

The publishable (or legacy anon) key is appropriate for the app. Never put a
service-role key in Flutter, source control, or a `dart-define`; the database
policies enforce that every row belongs to the signed-in user.

The next migration slice will add the idempotent local SQLite importer and
History UI. Until then, no cloud call is made after SDK startup and the app
continues to operate entirely from its existing local database.
