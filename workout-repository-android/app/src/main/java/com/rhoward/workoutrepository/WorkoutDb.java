package com.rhoward.workoutrepository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.time.Instant;

final class WorkoutDb extends SQLiteOpenHelper {
    static final class Workout {
        final long id;
        final int sequence;
        final String phase;
        final String title;
        final String prescription;
        final String originalPrescription;
        final String official60Prescription;

        Workout(long id, int sequence, String phase, String title, String prescription,
                String originalPrescription, String official60Prescription) {
            this.id = id;
            this.sequence = sequence;
            this.phase = phase;
            this.title = title;
            this.prescription = prescription;
            this.originalPrescription = originalPrescription;
            this.official60Prescription = official60Prescription;
        }
    }

    private final Context context;

    WorkoutDb(Context context) {
        super(context, "workouts.db", null, 5);
        this.context = context.getApplicationContext();
    }

    @Override public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE workouts (id INTEGER PRIMARY KEY, sequence_number INTEGER UNIQUE NOT NULL, phase TEXT NOT NULL, title TEXT NOT NULL, prescription TEXT NOT NULL, original_prescription TEXT, official_60_prescription TEXT)");
        db.execSQL("CREATE TABLE sessions (id INTEGER PRIMARY KEY, workout_id INTEGER NOT NULL, outcome TEXT NOT NULL, occurred_at TEXT NOT NULL, notes TEXT, FOREIGN KEY(workout_id) REFERENCES workouts(id))");
        db.execSQL("CREATE TABLE benchmarks (id INTEGER PRIMARY KEY, name TEXT NOT NULL, value REAL, unit TEXT, measured_on TEXT, source TEXT)");
        db.execSQL("CREATE TABLE section_progress (workout_id INTEGER NOT NULL, variant TEXT NOT NULL, section_key TEXT NOT NULL, completed_at TEXT NOT NULL, PRIMARY KEY(workout_id,variant,section_key), FOREIGN KEY(workout_id) REFERENCES workouts(id))");
        seedRamp(db);
        seedProgram(db);
    }

    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE workouts ADD COLUMN original_prescription TEXT");
            db.execSQL("ALTER TABLE workouts ADD COLUMN official_60_prescription TEXT");
            db.execSQL("UPDATE workouts SET original_prescription=prescription WHERE original_prescription IS NULL");
            seedProgram(db);
        }
        if (oldVersion >= 2 && oldVersion < 3) seedProgram(db);
        if (oldVersion < 4) seedProgram(db);
        if (oldVersion < 5) {
            db.execSQL("CREATE TABLE IF NOT EXISTS section_progress (workout_id INTEGER NOT NULL, variant TEXT NOT NULL, section_key TEXT NOT NULL, completed_at TEXT NOT NULL, PRIMARY KEY(workout_id,variant,section_key), FOREIGN KEY(workout_id) REFERENCES workouts(id))");
        }
    }

    private void seedRamp(SQLiteDatabase db) {
        String[][] rows = {
            {"Ramp 1", "35–40 min • RPE 5\nEasy full-body strength technique + 8 min conversational conditioning"},
            {"Ramp 2", "35–40 min • RPE 5–6\nLight hinge and upper-body work + easy cyclical conditioning"},
            {"Ramp 3", "40–45 min • RPE 6\nSquat and weightlifting technique + 8–10 min controlled conditioning"},
            {"Ramp 4", "45–50 min • RPE 6\nMain lift at 60–65% training max + 10 min moderate conditioning"},
            {"Ramp 5", "45–50 min • RPE 6\nUpper-body strength + simple gymnastics substitutions + short metcon"},
            {"Ramp 6", "50–55 min • RPE 6–7\nWeightlifting technique + hinge work + 12 min conditioning"},
            {"Ramp 7", "50–55 min • RPE 6–7\nFull rehearsal: 5 min warm-up, 18 min strength, 12–15 min conditioning, short accessory"}
        };
        for (int i = 0; i < rows.length; i++) {
            ContentValues values = new ContentValues();
            values.put("sequence_number", i + 1);
            values.put("phase", "RAMP");
            values.put("title", rows[i][0]);
            values.put("prescription", rows[i][1]);
            values.put("original_prescription", rows[i][1]);
            db.insertOrThrow("workouts", null, values);
        }
    }

    private String formatSections(JSONArray sections) throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sections.length(); i++) {
            JSONObject section = sections.getJSONObject(i);
            if (result.length() > 0) result.append('\u001e');
            result.append(section.getString("title")).append('\u001f').append(section.optString("body"));
        }
        return result.toString();
    }

    private void seedProgram(SQLiteDatabase db) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(context.getAssets().open("program.json")))) {
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) json.append(line);
            JSONArray days = new JSONObject(json.toString()).getJSONArray("days");
            for (int i = 0; i < days.length(); i++) {
                JSONObject day = days.getJSONObject(i);
                ContentValues values = new ContentValues();
                values.put("sequence_number", 7 + day.getInt("day"));
                values.put("phase", "FLAGSHIP 1.0");
                values.put("title", day.optString("questTitle", day.getString("title")));
                values.put("prescription", formatSections(day.getJSONArray("recommended")));
                values.put("original_prescription", formatSections(day.getJSONArray("original")));
                if (!day.isNull("official60")) values.put("official_60_prescription", formatSections(day.getJSONArray("official60")));
                db.insertWithOnConflict("workouts", null, values, SQLiteDatabase.CONFLICT_REPLACE);
            }
        } catch (Exception error) {
            throw new IllegalStateException("Unable to load bundled workout program", error);
        }
    }

    Workout nextWorkout() {
        String sql = "SELECT w.id,w.sequence_number,w.phase,w.title,w.prescription,w.original_prescription,w.official_60_prescription FROM workouts w " +
            "LEFT JOIN sessions s ON s.workout_id=w.id AND s.outcome IN ('COMPLETED','SKIPPED') " +
            "WHERE s.id IS NULL ORDER BY w.sequence_number LIMIT 1";
        try (Cursor c = getReadableDatabase().rawQuery(sql, null)) {
            if (!c.moveToFirst()) return null;
            return new Workout(c.getLong(0), c.getInt(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5), c.getString(6));
        }
    }

    Workout workoutAt(int sequence) {
        String sql = "SELECT id,sequence_number,phase,title,prescription,original_prescription,official_60_prescription FROM workouts WHERE sequence_number=?";
        try (Cursor c = getReadableDatabase().rawQuery(sql, new String[]{String.valueOf(sequence)})) {
            if (!c.moveToFirst()) return null;
            return new Workout(c.getLong(0), c.getInt(1), c.getString(2), c.getString(3), c.getString(4), c.getString(5), c.getString(6));
        }
    }

    String outcomeFor(long workoutId) {
        String sql = "SELECT outcome FROM sessions WHERE workout_id=? ORDER BY id DESC LIMIT 1";
        try (Cursor c = getReadableDatabase().rawQuery(sql, new String[]{String.valueOf(workoutId)})) {
            return c.moveToFirst() ? c.getString(0) : null;
        }
    }

    int workoutCount() {
        try (Cursor c = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM workouts", null)) {
            return c.moveToFirst() ? c.getInt(0) : 0;
        }
    }

    int completedCount() {
        try (Cursor c = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM sessions WHERE outcome='COMPLETED'", null)) {
            return c.moveToFirst() ? c.getInt(0) : 0;
        }
    }

    void record(long workoutId, String outcome) {
        getWritableDatabase().delete("sessions", "workout_id=?", new String[]{String.valueOf(workoutId)});
        ContentValues values = new ContentValues();
        values.put("workout_id", workoutId);
        values.put("outcome", outcome);
        values.put("occurred_at", Instant.now().toString());
        getWritableDatabase().insertOrThrow("sessions", null, values);
    }

    boolean sectionComplete(long workoutId, String variant, String sectionKey) {
        String sql = "SELECT 1 FROM section_progress WHERE workout_id=? AND variant=? AND section_key=?";
        try (Cursor c = getReadableDatabase().rawQuery(sql, new String[]{
                String.valueOf(workoutId), variant, sectionKey})) {
            return c.moveToFirst();
        }
    }

    void setSectionComplete(long workoutId, String variant, String sectionKey, boolean complete) {
        String[] args = {String.valueOf(workoutId), variant, sectionKey};
        if (!complete) {
            getWritableDatabase().delete("section_progress", "workout_id=? AND variant=? AND section_key=?", args);
            return;
        }
        ContentValues values = new ContentValues();
        values.put("workout_id", workoutId);
        values.put("variant", variant);
        values.put("section_key", sectionKey);
        values.put("completed_at", Instant.now().toString());
        getWritableDatabase().insertWithOnConflict("section_progress", null, values, SQLiteDatabase.CONFLICT_REPLACE);
    }
}
