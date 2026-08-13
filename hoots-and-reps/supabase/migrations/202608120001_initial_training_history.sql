-- Hoots & Reps: immutable, user-owned training history.
--
-- Apply with the Supabase CLI after linking the intended project. This
-- migration intentionally contains no production credentials. It assumes the
-- standard Supabase auth schema and uses auth.uid() in every user-facing RLS
-- policy.

create extension if not exists pgcrypto;
create schema if not exists private;

create or replace function public.set_updated_at()
returns trigger
language plpgsql
set search_path = public
as $$
begin
  new.updated_at = timezone('utc', now());
  return new;
end;
$$;

create table public.profiles (
  id uuid primary key references auth.users(id) on delete cascade,
  display_name text,
  timezone text not null default 'UTC',
  weight_unit text not null default 'pounds'
    check (weight_unit in ('pounds', 'kilograms')),
  onboarding_complete boolean not null default false,
  created_at timestamptz not null default timezone('utc', now()),
  updated_at timestamptz not null default timezone('utc', now())
);

create table public.program_versions (
  id uuid primary key default gen_random_uuid(),
  owner_user_id uuid not null references auth.users(id) on delete cascade,
  -- Stable source ID maps the local published snapshot, never a sequence.
  snapshot_id text not null,
  version integer not null check (version > 0),
  title text not null,
  source text not null check (source in ('legacy_import', 'bundled', 'published', 'manual')),
  status text not null check (status in ('draft', 'active', 'archived')),
  starts_on date,
  published_at timestamptz,
  archived_at timestamptz,
  snapshot_json jsonb not null,
  checksum text not null,
  imported_from_device_id text,
  created_at timestamptz not null default timezone('utc', now()),
  updated_at timestamptz not null default timezone('utc', now()),
  unique (owner_user_id, snapshot_id),
  unique (owner_user_id, checksum)
);

create unique index one_active_program_per_user
  on public.program_versions(owner_user_id)
  where status = 'active';

create table public.workout_prescriptions (
  id uuid primary key default gen_random_uuid(),
  program_version_id uuid not null references public.program_versions(id) on delete restrict,
  sequence_number integer not null check (sequence_number > 0),
  scheduled_offset_days integer,
  title text not null,
  role text,
  prescription_json jsonb not null,
  prescription_signature text not null,
  created_at timestamptz not null default timezone('utc', now()),
  unique (program_version_id, sequence_number),
  unique (program_version_id, prescription_signature)
);

create table public.program_transformations (
  id uuid primary key default gen_random_uuid(),
  program_version_id uuid not null references public.program_versions(id) on delete restrict,
  workout_prescription_id uuid references public.workout_prescriptions(id) on delete restrict,
  transformation_type text not null check (transformation_type in (
    'benchmark_reference', 'movement_swap', 'profile_setting', 'load_rounding',
    'equipment_regression', 'restriction_regression', 'correction'
  )),
  reason text not null,
  payload_json jsonb not null default '{}'::jsonb,
  created_at timestamptz not null default timezone('utc', now())
);

create table public.workout_assignments (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references auth.users(id) on delete cascade,
  program_version_id uuid not null references public.program_versions(id) on delete restrict,
  workout_prescription_id uuid not null references public.workout_prescriptions(id) on delete restrict,
  assigned_date date not null,
  status text not null default 'planned' check (status in (
    'planned', 'in_progress', 'unconfirmed', 'completed', 'skipped', 'cancelled'
  )),
  started_at timestamptz,
  completed_at timestamptz,
  client_created_id text not null,
  created_at timestamptz not null default timezone('utc', now()),
  updated_at timestamptz not null default timezone('utc', now()),
  unique (user_id, client_created_id)
);

create index workout_assignments_by_user_date
  on public.workout_assignments(user_id, assigned_date desc);
create index workout_assignments_by_program
  on public.workout_assignments(program_version_id, assigned_date);

create table public.workout_completions (
  id uuid primary key default gen_random_uuid(),
  assignment_id uuid not null references public.workout_assignments(id) on delete restrict,
  user_id uuid not null references auth.users(id) on delete cascade,
  completion_status text not null check (completion_status in ('partial', 'complete')),
  completed_at timestamptz not null,
  section_state_json jsonb not null default '{}'::jsonb,
  feedback_json jsonb not null default '{}'::jsonb,
  notes text,
  supersedes_id uuid references public.workout_completions(id) on delete restrict,
  client_created_id text not null,
  created_at timestamptz not null default timezone('utc', now()),
  unique (user_id, client_created_id)
);

create index workout_completions_by_assignment
  on public.workout_completions(assignment_id, completed_at desc);

create table public.conditioning_results (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references auth.users(id) on delete cascade,
  assignment_id uuid references public.workout_assignments(id) on delete restrict,
  program_version_id uuid references public.program_versions(id) on delete restrict,
  workout_prescription_id uuid references public.workout_prescriptions(id) on delete restrict,
  template_id text not null,
  variant text not null,
  score_schema text not null,
  result_json jsonb not null,
  recorded_at timestamptz not null,
  client_created_id text not null,
  created_at timestamptz not null default timezone('utc', now()),
  unique (user_id, client_created_id)
);

create index conditioning_results_by_user_time
  on public.conditioning_results(user_id, recorded_at desc);

create table public.benchmark_result_events (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references auth.users(id) on delete cascade,
  benchmark_id text not null,
  recorded_at timestamptz not null,
  client_created_id text not null,
  created_at timestamptz not null default timezone('utc', now()),
  unique (user_id, client_created_id)
);

create table public.benchmark_result_values (
  event_id uuid not null references public.benchmark_result_events(id) on delete cascade,
  metric_key text not null,
  canonical_value numeric not null check (canonical_value >= 0),
  primary key (event_id, metric_key)
);

create table public.personal_record_history (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references auth.users(id) on delete cascade,
  movement_id text not null,
  canonical_value_lb numeric not null check (canonical_value_lb > 0),
  achieved_on date not null,
  source text not null check (source in ('tested', 'competition', 'estimated', 'imported')),
  note text,
  client_created_id text not null,
  created_at timestamptz not null default timezone('utc', now()),
  unique (user_id, client_created_id)
);

create table public.training_max_history (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references auth.users(id) on delete cascade,
  movement_id text not null,
  canonical_value_lb numeric not null check (canonical_value_lb > 0),
  effective_from date not null,
  reason text,
  client_created_id text not null,
  created_at timestamptz not null default timezone('utc', now()),
  unique (user_id, client_created_id)
);

-- Every retried client mutation uses a durable key. This becomes the sync
-- acknowledgement ledger; the device's SQLite sync_outbox remains local.
create table public.client_mutations (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references auth.users(id) on delete cascade,
  client_mutation_id text not null,
  entity_type text not null,
  payload_json jsonb not null,
  applied_at timestamptz not null default timezone('utc', now()),
  unique (user_id, client_mutation_id)
);

create or replace function private.handle_new_user()
returns trigger
language plpgsql
security definer set search_path = public
as $$
begin
  insert into public.profiles (id, display_name)
  values (new.id, nullif(new.raw_user_meta_data ->> 'display_name', ''))
  on conflict (id) do nothing;
  return new;
end;
$$;

create trigger on_auth_user_created
  after insert on auth.users
  for each row execute procedure private.handle_new_user();

create trigger profiles_set_updated_at
  before update on public.profiles
  for each row execute procedure public.set_updated_at();
create trigger program_versions_set_updated_at
  before update on public.program_versions
  for each row execute procedure public.set_updated_at();
create trigger workout_assignments_set_updated_at
  before update on public.workout_assignments
  for each row execute procedure public.set_updated_at();

-- Published program content stays immutable. The only permitted transition is
-- draft -> active, active -> archived, or draft -> archived after a cancelled
-- import. A later correction creates a new version and transformation record.
create or replace function private.protect_program_version()
returns trigger
language plpgsql
set search_path = public
as $$
begin
  if old.owner_user_id is distinct from new.owner_user_id
     or old.snapshot_id is distinct from new.snapshot_id
     or old.version is distinct from new.version
     or old.title is distinct from new.title
     or old.source is distinct from new.source
     or old.starts_on is distinct from new.starts_on
     or old.published_at is distinct from new.published_at
     or old.snapshot_json is distinct from new.snapshot_json
     or old.checksum is distinct from new.checksum
     or old.imported_from_device_id is distinct from new.imported_from_device_id then
    raise exception 'Program version content is immutable';
  end if;
  if old.status = 'draft' and new.status in ('active', 'archived') then
    return new;
  end if;
  if old.status = 'active' and new.status = 'archived'
     and new.archived_at is not null then
    return new;
  end if;
  raise exception 'Invalid immutable program status transition';
end;
$$;

create trigger protect_program_version
  before update on public.program_versions
  for each row execute procedure private.protect_program_version();

create or replace function private.protect_assignment()
returns trigger
language plpgsql
set search_path = public
as $$
begin
  if old.user_id is distinct from new.user_id
     or old.program_version_id is distinct from new.program_version_id
     or old.workout_prescription_id is distinct from new.workout_prescription_id
     or old.client_created_id is distinct from new.client_created_id then
    raise exception 'Workout assignment identity is immutable';
  end if;
  if old.status in ('completed', 'skipped', 'cancelled') then
    raise exception 'Closed workout assignments are immutable';
  end if;
  if new.status = 'completed' and new.completed_at is null then
    raise exception 'Completed workout assignments require completed_at';
  end if;
  return new;
end;
$$;

create trigger protect_assignment
  before update on public.workout_assignments
  for each row execute procedure private.protect_assignment();

alter table public.profiles enable row level security;
alter table public.program_versions enable row level security;
alter table public.workout_prescriptions enable row level security;
alter table public.program_transformations enable row level security;
alter table public.workout_assignments enable row level security;
alter table public.workout_completions enable row level security;
alter table public.conditioning_results enable row level security;
alter table public.benchmark_result_events enable row level security;
alter table public.benchmark_result_values enable row level security;
alter table public.personal_record_history enable row level security;
alter table public.training_max_history enable row level security;
alter table public.client_mutations enable row level security;

create policy "profiles are private" on public.profiles
  for all to authenticated using ((select auth.uid()) = id)
  with check ((select auth.uid()) = id);

create policy "owners read program versions" on public.program_versions
  for select to authenticated using ((select auth.uid()) = owner_user_id);
create policy "owners insert program versions" on public.program_versions
  for insert to authenticated with check ((select auth.uid()) = owner_user_id);
create policy "owners archive program versions" on public.program_versions
  for update to authenticated using ((select auth.uid()) = owner_user_id)
  with check ((select auth.uid()) = owner_user_id);

create policy "owners read prescriptions" on public.workout_prescriptions
  for select to authenticated using (exists (
    select 1 from public.program_versions p
    where p.id = program_version_id and p.owner_user_id = (select auth.uid())
  ));
create policy "owners insert draft prescriptions" on public.workout_prescriptions
  for insert to authenticated with check (exists (
    select 1 from public.program_versions p
    where p.id = program_version_id
      and p.owner_user_id = (select auth.uid())
      and p.status = 'draft'
  ));

create policy "owners read transformations" on public.program_transformations
  for select to authenticated using (exists (
    select 1 from public.program_versions p
    where p.id = program_version_id and p.owner_user_id = (select auth.uid())
  ));
create policy "owners append draft transformations" on public.program_transformations
  for insert to authenticated with check (exists (
    select 1 from public.program_versions p
    where p.id = program_version_id
      and p.owner_user_id = (select auth.uid())
      and p.status = 'draft'
  ));

create policy "users manage their assignments" on public.workout_assignments
  for all to authenticated using ((select auth.uid()) = user_id)
  with check ((select auth.uid()) = user_id and exists (
    select 1 from public.program_versions p
    where p.id = program_version_id and p.owner_user_id = (select auth.uid())
  ));

create policy "users read their completions" on public.workout_completions
  for select to authenticated using ((select auth.uid()) = user_id);
create policy "users append their completions" on public.workout_completions
  for insert to authenticated with check (
    (select auth.uid()) = user_id and exists (
      select 1 from public.workout_assignments a
      where a.id = assignment_id and a.user_id = (select auth.uid())
    )
  );

create policy "users manage conditioning results" on public.conditioning_results
  for all to authenticated using ((select auth.uid()) = user_id)
  with check ((select auth.uid()) = user_id);
create policy "users manage benchmark events" on public.benchmark_result_events
  for all to authenticated using ((select auth.uid()) = user_id)
  with check ((select auth.uid()) = user_id);
create policy "users read benchmark values" on public.benchmark_result_values
  for select to authenticated using (exists (
    select 1 from public.benchmark_result_events e
    where e.id = event_id and e.user_id = (select auth.uid())
  ));
create policy "users write benchmark values" on public.benchmark_result_values
  for insert to authenticated with check (exists (
    select 1 from public.benchmark_result_events e
    where e.id = event_id and e.user_id = (select auth.uid())
  ));
create policy "users manage personal records" on public.personal_record_history
  for all to authenticated using ((select auth.uid()) = user_id)
  with check ((select auth.uid()) = user_id);
create policy "users manage training max history" on public.training_max_history
  for all to authenticated using ((select auth.uid()) = user_id)
  with check ((select auth.uid()) = user_id);
create policy "users manage their mutation ledger" on public.client_mutations
  for all to authenticated using ((select auth.uid()) = user_id)
  with check ((select auth.uid()) = user_id);
