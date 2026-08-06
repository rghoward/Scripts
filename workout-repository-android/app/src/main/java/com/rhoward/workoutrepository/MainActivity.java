package com.rhoward.workoutrepository;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public final class MainActivity extends Activity {
    private WorkoutDb db;
    private LocalDate selectedDate;
    private LocalDate scheduleStart;
    private String selectedVariant = "RECOMMENDED";
    private float touchDownX;
    private boolean trackingSwipe;
    private View currentDayContent;
    private FrameLayout scene;
    private int pendingEnterDirection;
    private boolean transitionLocked;
    private long lastTransitionAt;
    private MediaPlayer soundtrack;
    private boolean activityVisible;
    private final AudioManager.OnAudioFocusChangeListener audioFocusListener = change -> {
        if ((change == AudioManager.AUDIOFOCUS_LOSS || change == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT
                || change == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK)
                && soundtrack != null && soundtrack.isPlaying()) {
            soundtrack.pause();
        } else if (change == AudioManager.AUDIOFOCUS_GAIN && activityVisible && musicEnabled()) {
            startSoundtrack();
        }
    };

    private static final int INK = Color.rgb(247, 245, 239);
    private static final int MUTED = Color.rgb(173, 166, 193);
    private static final int PAPER = Color.rgb(7, 6, 21);
    private static final int CARD = Color.rgb(21, 17, 39);
    private static final int GRAPHITE = Color.rgb(33, 24, 58);
    private static final int BORDER = Color.rgb(75, 58, 120);
    private static final int FIRE = Color.rgb(168, 85, 247);
    private static final int EMBER = Color.rgb(255, 196, 78);
    private static final int PALE_FLAME = Color.rgb(37, 20, 67);
    private static final int GOLD = Color.rgb(86, 215, 255);
    private static final int SUCCESS = Color.rgb(84, 255, 174);

    @Override protected void onCreate(Bundle state) {
        super.onCreate(state);
        Window window = getWindow();
        window.setStatusBarColor(PAPER);
        window.setNavigationBarColor(PAPER);
        db = new WorkoutDb(this);
        selectedDate = LocalDate.now();
        String storedStart = getPreferences(MODE_PRIVATE).getString("schedule_start", null);
        scheduleStart = storedStart == null ? selectedDate : LocalDate.parse(storedStart);
        if (storedStart == null) getPreferences(MODE_PRIVATE).edit().putString("schedule_start", scheduleStart.toString()).apply();
        render();
    }

    @Override protected void onStart() {
        super.onStart();
        activityVisible = true;
        if (musicEnabled()) startSoundtrack();
    }

    @Override protected void onStop() {
        activityVisible = false;
        if (soundtrack != null && soundtrack.isPlaying()) soundtrack.pause();
        AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
        audio.abandonAudioFocus(audioFocusListener);
        super.onStop();
    }

    @Override protected void onDestroy() {
        if (soundtrack != null) {
            soundtrack.release();
            soundtrack = null;
        }
        super.onDestroy();
    }

    private int dp(int value) { return Math.round(value * getResources().getDisplayMetrics().density); }

    private GradientDrawable background(int color, float radius, int strokeColor, int strokeWidth) {
        GradientDrawable shape = new GradientDrawable();
        shape.setColor(color);
        shape.setCornerRadius(dp((int) radius));
        if (strokeWidth > 0) shape.setStroke(dp(strokeWidth), strokeColor);
        return shape;
    }

    private GradientDrawable flameGradient(float radius) {
        GradientDrawable shape = new GradientDrawable(GradientDrawable.Orientation.TL_BR,
                new int[]{Color.rgb(168, 85, 247), Color.rgb(45, 126, 255)});
        shape.setCornerRadius(dp((int) radius));
        return shape;
    }

    private GradientDrawable darkFlameGradient(float radius) {
        GradientDrawable shape = new GradientDrawable(GradientDrawable.Orientation.TL_BR,
                new int[]{Color.rgb(49, 25, 83), Color.rgb(20, 22, 52)});
        shape.setCornerRadius(dp((int) radius));
        shape.setStroke(dp(1), FIRE);
        return shape;
    }

    private GradientDrawable cosmicBackground() {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{Color.rgb(7, 6, 21), Color.rgb(15, 9, 36), Color.rgb(7, 6, 21)});
    }

    private TextView text(String value, float size, int color) {
        TextView view = new TextView(this);
        view.setText(value);
        view.setTextSize(size);
        view.setTextColor(color);
        view.setLineSpacing(0, 1.15f);
        return view;
    }

    private TextView label(String value, float size, int color, boolean bold) {
        TextView view = text(value, size, color);
        if (bold) view.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        return view;
    }

    private void addSpacer(LinearLayout parent, int height) {
        View spacer = new View(this);
        parent.addView(spacer, new LinearLayout.LayoutParams(1, dp(height)));
    }

    private boolean isTrainingDay(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day == DayOfWeek.MONDAY || day == DayOfWeek.TUESDAY || day == DayOfWeek.THURSDAY || day == DayOfWeek.SATURDAY;
    }

    private int sequenceFor(LocalDate date) {
        if (date.isBefore(scheduleStart) || !isTrainingDay(date)) return -1;
        int sequence = 0;
        for (LocalDate cursor = scheduleStart; !cursor.isAfter(date); cursor = cursor.plusDays(1)) {
            if (isTrainingDay(cursor)) sequence++;
        }
        return sequence;
    }

    private void render() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackground(cosmicBackground());
        root.setPadding(dp(20), dp(12), dp(20), 0);
        root.setOnApplyWindowInsetsListener((view, insets) -> {
            view.setPadding(dp(20), insets.getSystemWindowInsetTop() + dp(10), dp(20),
                    insets.getSystemWindowInsetBottom());
            return insets;
        });

        LinearLayout brand = new LinearLayout(this);
        brand.setGravity(Gravity.CENTER_VERTICAL);
        TextView title = label("✦  HOOTS & REPS", 19, INK, true);
        title.setLetterSpacing(0.08f);
        brand.addView(title, new LinearLayout.LayoutParams(0, -2, 1));
        TextView music = label(musicEnabled() ? "♫ ON" : "♫ OFF", 9, musicEnabled() ? SUCCESS : MUTED, true);
        music.setGravity(Gravity.CENTER);
        music.setPadding(dp(9), dp(7), dp(9), dp(7));
        music.setBackground(background(Color.TRANSPARENT, 16, musicEnabled() ? SUCCESS : BORDER, 1));
        music.setContentDescription(musicEnabled() ? "Turn soundtrack off" : "Turn soundtrack on");
        music.setOnClickListener(v -> toggleSoundtrack());
        LinearLayout.LayoutParams musicParams = new LinearLayout.LayoutParams(-2, -2);
        musicParams.rightMargin = dp(7);
        brand.addView(music, musicParams);
        TextView today = label("TODAY'S QUEST", 10, EMBER, true);
        today.setGravity(Gravity.CENTER);
        today.setPadding(dp(12), dp(7), dp(12), dp(7));
        today.setBackground(background(Color.TRANSPARENT, 18, FIRE, 1));
        today.setOnClickListener(v -> transitionToDate(LocalDate.now(), LocalDate.now().isAfter(selectedDate) ? 1 : -1));
        brand.addView(today);
        root.addView(brand);
        addSpacer(root, 12);

        LocalDate weekStart = selectedDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LinearLayout weekHeader = new LinearLayout(this);
        weekHeader.setGravity(Gravity.CENTER_VERTICAL);
        Button previous = weekArrow("‹", -7);
        weekHeader.addView(previous, new LinearLayout.LayoutParams(dp(36), dp(36)));
        String range = weekStart.format(DateTimeFormatter.ofPattern("MMM d", Locale.US)) + " – " +
                weekStart.plusDays(6).format(DateTimeFormatter.ofPattern("MMM d", Locale.US));
        TextView rangeTitle = label(range.toUpperCase(Locale.US), 14, INK, true);
        rangeTitle.setGravity(Gravity.CENTER);
        weekHeader.addView(rangeTitle, new LinearLayout.LayoutParams(0, -2, 1));
        weekHeader.addView(weekArrow("›", 7), new LinearLayout.LayoutParams(dp(36), dp(36)));
        root.addView(weekHeader);
        addSpacer(root, 4);

        LinearLayout days = new LinearLayout(this);
        for (int i = 0; i < 7; i++) days.addView(dayCell(weekStart.plusDays(i)), new LinearLayout.LayoutParams(0, dp(58), 1));
        root.addView(days);
        addSpacer(root, 6);
        root.addView(inertiusCampaign(weekStart), new LinearLayout.LayoutParams(-1, dp(48)));
        addSpacer(root, 8);

        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setOnTouchListener((v, event) -> {
            if (transitionLocked) return true;
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                touchDownX = event.getX();
                trackingSwipe = true;
            }
            if (event.getAction() == MotionEvent.ACTION_CANCEL) trackingSwipe = false;
            if (event.getAction() == MotionEvent.ACTION_UP && trackingSwipe && Math.abs(event.getX() - touchDownX) > dp(80)) {
                trackingSwipe = false;
                LocalDate targetDate = selectedDate.plusDays(event.getX() < touchDownX ? 1 : -1);
                int direction = event.getX() < touchDownX ? 1 : -1;
                v.post(() -> transitionToDate(targetDate, direction));
            }
            return false;
        });
        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(0, dp(10), 0, dp(32));
        renderDay(content);
        scroll.addView(content);
        root.addView(scroll, new LinearLayout.LayoutParams(-1, 0, 1));
        currentDayContent = scroll;
        scene = new FrameLayout(this);
        scene.setBackground(cosmicBackground());
        scene.addView(root, new FrameLayout.LayoutParams(-1, -1));
        setContentView(scene);
        runQuestEntrance(scroll);
    }

    private Button weekArrow(String value, int delta) {
        Button button = new Button(this);
        button.setText(value);
        button.setTextSize(21);
        button.setTextColor(INK);
        button.setPadding(0, 0, 0, 0);
        button.setBackground(background(CARD, 18, BORDER, 1));
        button.setOnClickListener(v -> transitionToDate(selectedDate.plusDays(delta), delta > 0 ? 1 : -1));
        return button;
    }

    private View dayCell(LocalDate date) {
        boolean selected = date.equals(selectedDate);
        LinearLayout cell = new LinearLayout(this);
        cell.setOrientation(LinearLayout.VERTICAL);
        cell.setGravity(Gravity.CENTER);
        cell.setPadding(dp(1), 0, dp(1), 0);
        TextView day = label(date.format(DateTimeFormatter.ofPattern("EEEEE", Locale.US)), 10, selected ? EMBER : MUTED, true);
        day.setGravity(Gravity.CENTER);
        TextView number = label(String.valueOf(date.getDayOfMonth()), 16, selected ? Color.WHITE : INK, true);
        number.setGravity(Gravity.CENTER);
        number.setBackground(selected ? flameGradient(18) : background(Color.TRANSPARENT, 18,
                date.equals(LocalDate.now()) ? FIRE : Color.TRANSPARENT,
                date.equals(LocalDate.now()) ? 1 : 0));
        if (selected) number.setElevation(dp(5));
        cell.addView(day);
        LinearLayout.LayoutParams numberParams = new LinearLayout.LayoutParams(dp(36), dp(36));
        numberParams.topMargin = dp(1);
        cell.addView(number, numberParams);
        int sequence = sequenceFor(date);
        WorkoutDb.Workout workout = sequence > 0 ? db.workoutAt(sequence) : null;
        String outcome = workout == null ? null : db.outcomeFor(workout.id);
        TextView marker = label("COMPLETED".equals(outcome) ? "✓" : workout != null ? "•" : "", 9,
                "COMPLETED".equals(outcome) ? SUCCESS : GOLD, true);
        marker.setGravity(Gravity.CENTER);
        marker.setTranslationY(-dp(4));
        cell.addView(marker, new LinearLayout.LayoutParams(-1, dp(10)));
        cell.setOnClickListener(v -> transitionToDate(date, date.isAfter(selectedDate) ? 1 : -1));
        return cell;
    }

    private View inertiusCampaign(LocalDate weekStart) {
        int victories = 0;
        for (int i = 0; i < 7; i++) {
            int sequence = sequenceFor(weekStart.plusDays(i));
            WorkoutDb.Workout workout = sequence > 0 ? db.workoutAt(sequence) : null;
            if (workout != null && "COMPLETED".equals(db.outcomeFor(workout.id))) victories++;
        }

        LinearLayout campaign = new LinearLayout(this);
        campaign.setGravity(Gravity.CENTER_VERTICAL);
        campaign.setPadding(dp(14), dp(6), dp(12), dp(6));
        campaign.setBackground(darkFlameGradient(16));

        LinearLayout copy = new LinearLayout(this);
        copy.setOrientation(LinearLayout.VERTICAL);
        TextView villain = label("⚔  DREADLORD INERTIUS", 11, EMBER, true);
        villain.setLetterSpacing(0.06f);
        copy.addView(villain);
        String message = victories >= 4 ? "THE REALM IS DEFENDED"
                : victories == 3 ? "ONE QUEST REMAINS"
                : victories == 0 ? "INERTIUS APPROACHES…"
                : "THE REALM STRIKES BACK";
        copy.addView(label(message, 9, victories >= 4 ? SUCCESS : MUTED, true));
        campaign.addView(copy, new LinearLayout.LayoutParams(0, -2, 1));

        TextView score = label(Math.min(victories, 4) + "/4", 20, victories >= 4 ? SUCCESS : GOLD, true);
        score.setGravity(Gravity.CENTER);
        campaign.addView(score, new LinearLayout.LayoutParams(dp(48), -1));
        return campaign;
    }

    private void renderDay(LinearLayout content) {
        String dayName = selectedDate.format(DateTimeFormatter.ofPattern("EEEE", Locale.US));
        String date = selectedDate.format(DateTimeFormatter.ofPattern("MMMM d", Locale.US));
        content.addView(label(dayName, 34, INK, true));
        content.addView(label(date, 16, MUTED, false));
        addSpacer(content, 24);

        int sequence = sequenceFor(selectedDate);
        WorkoutDb.Workout workout = sequence > 0 ? db.workoutAt(sequence) : null;
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(dp(24), dp(24), dp(24), dp(24));
        card.setBackground(background(CARD, 24, BORDER, 1));
        card.setElevation(dp(8));

        if (workout == null) {
            card.addView(label(sequence > db.workoutCount() ? "SAGA COMPLETE" : "RESTORATION QUEST", 12, EMBER, true));
            addSpacer(card, 12);
            card.addView(label(sequence > db.workoutCount() ? "The saga is complete" : "Rest at the enchanted tavern.", 28, INK, true));
            addSpacer(card, 12);
            if (sequence <= db.workoutCount()) {
                card.addView(label("✦  THIS TERRITORY IS PROTECTED", 11, SUCCESS, true));
                addSpacer(card, 10);
            }
            card.addView(text(sequence > db.workoutCount()
                    ? "You’ve reached the end of the current ramp."
                    : "Light mobility, a heroic meal, and deep slumber shall restore your might.", 17, MUTED));
            addSpacer(card, 24);
            TextView next = label("NEXT QUEST  →", 13, EMBER, true);
            next.setOnClickListener(v -> transitionToDate(nextTrainingDate(selectedDate), 1));
            card.addView(next);
        } else {
            String outcome = db.outcomeFor(workout.id);
            String progress = workout.phase.startsWith("FLAGSHIP")
                    ? workout.phase + "  •  DAY " + (workout.sequence - 7)
                    : "INITIATION  •  " + workout.sequence + " OF 7";
            card.addView(label(progress, 12, EMBER, true));
            addSpacer(card, 12);
            String battleStatus = "COMPLETED".equals(outcome) ? "⚔  INERTIUS VANQUISHED"
                    : "SKIPPED".equals(outcome) ? "⚑  THE VILLAIN ESCAPED — FOR NOW"
                    : "☄  INERTIUS APPROACHES…";
            int battleColor = "COMPLETED".equals(outcome) ? SUCCESS
                    : "SKIPPED".equals(outcome) ? GOLD : EMBER;
            TextView status = label(battleStatus, 11, battleColor, true);
            status.setLetterSpacing(0.04f);
            status.setPadding(dp(11), dp(7), dp(11), dp(7));
            status.setBackground(background(PALE_FLAME, 14, battleColor, 1));
            card.addView(status);
            addSpacer(card, 14);
            String displayTitle = workout.phase.startsWith("FLAGSHIP")
                    ? workout.title
                    : "Trial of Might " + workout.sequence;
            card.addView(label(displayTitle, 30, INK, true));
            addSpacer(card, 8);
            card.addView(label(workout.phase.startsWith("FLAGSHIP") ? "ABOUT 60 MIN   •   ADAPTED" : "35–55 MIN   •   CONTROLLED EFFORT", 12, MUTED, true));
            if (workout.phase.startsWith("FLAGSHIP")) {
                addSpacer(card, 20);
                LinearLayout variants = new LinearLayout(this);
                variants.setOrientation(LinearLayout.HORIZONTAL);
                variants.addView(variantButton("Heroic cut", "RECOMMENDED", true), new LinearLayout.LayoutParams(0, dp(44), 1));
                if (workout.official60Prescription != null) {
                    LinearLayout.LayoutParams tabParams = new LinearLayout.LayoutParams(0, dp(44), 1);
                    tabParams.leftMargin = dp(6);
                    variants.addView(variantButton("60-min saga", "OFFICIAL_60", true), tabParams);
                }
                LinearLayout.LayoutParams originalParams = new LinearLayout.LayoutParams(0, dp(44), 1);
                originalParams.leftMargin = dp(6);
                variants.addView(variantButton("Ancient scroll", "ORIGINAL", true), originalParams);
                card.addView(variants);
            }
            addSpacer(card, 24);
            View rule = new View(this);
            rule.setBackgroundColor(BORDER);
            card.addView(rule, new LinearLayout.LayoutParams(-1, dp(1)));
            addSpacer(card, 24);
            String displayedPrescription = workout.prescription;
            if ("ORIGINAL".equals(selectedVariant) && workout.originalPrescription != null) displayedPrescription = workout.originalPrescription;
            if ("OFFICIAL_60".equals(selectedVariant) && workout.official60Prescription != null) displayedPrescription = workout.official60Prescription;
            int[] sectionProgress = sectionProgress(workout.id, displayedPrescription);
            TextView trials = label(sectionProgress[0] + " OF " + sectionProgress[1] + " TRIALS VANQUISHED", 11,
                    sectionProgress[0] == sectionProgress[1] ? SUCCESS : GOLD, true);
            trials.setLetterSpacing(0.05f);
            trials.setPadding(0, 0, 0, dp(12));
            card.addView(trials);
            addSectionCards(card, displayedPrescription, workout);
            addSpacer(card, 28);

            Button complete = new Button(this);
            complete.setText("COMPLETED".equals(outcome) ? "✓  Victory claimed" : "Claim victory");
            complete.setAllCaps(false);
            complete.setTextSize(17);
            complete.setTextColor(Color.WHITE);
            complete.setBackground("COMPLETED".equals(outcome)
                    ? background(SUCCESS, 18, Color.TRANSPARENT, 0)
                    : flameGradient(18));
            complete.setElevation(dp(6));
            complete.setOnClickListener(v -> { db.record(workout.id, "COMPLETED"); render(); });
            card.addView(complete, new LinearLayout.LayoutParams(-1, dp(58)));

            Button skip = new Button(this);
            skip.setText("SKIPPED".equals(outcome) ? "Retreat recorded" : "Retreat for now");
            skip.setAllCaps(false);
            skip.setTextSize(15);
            skip.setTextColor(MUTED);
            skip.setBackgroundColor(Color.TRANSPARENT);
            skip.setOnClickListener(v -> { db.record(workout.id, "SKIPPED"); render(); });
            LinearLayout.LayoutParams skipParams = new LinearLayout.LayoutParams(-1, dp(50));
            skipParams.topMargin = dp(8);
            card.addView(skip, skipParams);
        }
        content.addView(card);

        TextView hint = label("SWIPE TO TRAVERSE THE REALM", 11, MUTED, true);
        hint.setGravity(Gravity.CENTER);
        hint.setPadding(0, dp(22), 0, 0);
        content.addView(hint);
    }

    private LocalDate nextTrainingDate(LocalDate from) {
        LocalDate date = from.plusDays(1);
        while (!isTrainingDay(date)) date = date.plusDays(1);
        return date;
    }

    private void transitionToDate(LocalDate targetDate, int direction) {
        long now = SystemClock.uptimeMillis();
        if (targetDate.equals(selectedDate) || currentDayContent == null || transitionLocked || now - lastTransitionAt < 750) return;
        transitionLocked = true;
        lastTransitionAt = now;
        View outgoing = currentDayContent;
        outgoing.animate().cancel();
        outgoing.animate()
                .translationX(-direction * Math.max(dp(110), outgoing.getWidth() * 0.32f))
                .rotation(-direction * 3f)
                .scaleX(0.95f)
                .scaleY(0.95f)
                .alpha(0f)
                .setDuration(190)
                .setInterpolator(new AccelerateInterpolator(1.25f))
                .withEndAction(() -> {
                    selectedDate = targetDate;
                    selectedVariant = "RECOMMENDED";
                    pendingEnterDirection = direction;
                    render();
                })
                .start();
    }

    private void runQuestEntrance(View incoming) {
        int direction = pendingEnterDirection;
        pendingEnterDirection = 0;
        if (direction == 0) return;
        incoming.setAlpha(0.12f);
        incoming.setTranslationX(direction * dp(115));
        incoming.setRotation(direction * 2f);
        incoming.setScaleX(0.96f);
        incoming.setScaleY(0.96f);
        incoming.post(() -> incoming.animate()
                .translationX(0)
                .rotation(0)
                .scaleX(1f)
                .scaleY(1f)
                .alpha(1f)
                .setDuration(270)
                .setInterpolator(new DecelerateInterpolator(1.7f))
                .start());
        incoming.postDelayed(() -> transitionLocked = false, 700);
        showQuestFlare();
    }

    private void showQuestFlare() {
        if (scene == null) return;
        TextView flare = label("✦", 46, EMBER, true);
        flare.setGravity(Gravity.CENTER);
        flare.setAlpha(0f);
        flare.setScaleX(0.35f);
        flare.setScaleY(0.35f);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(dp(90), dp(90), Gravity.CENTER);
        scene.addView(flare, params);
        flare.animate().alpha(1f).scaleX(1.25f).scaleY(1.25f).setDuration(100)
                .withEndAction(() -> flare.animate().alpha(0f).scaleX(2.2f).scaleY(2.2f).rotation(35f)
                        .setDuration(190).withEndAction(() -> scene.removeView(flare)).start())
                .start();
    }

    private Button variantButton(String text, String variant, boolean enabled) {
        boolean selected = variant.equals(selectedVariant);
        Button button = new Button(this);
        button.setText(text);
        button.setAllCaps(false);
        button.setTextSize(12);
        button.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        button.setTextColor(selected ? Color.WHITE : INK);
        button.setEnabled(enabled);
        button.setBackground(selected ? flameGradient(14) : background(GRAPHITE, 14, BORDER, 1));
        if (selected) button.setElevation(dp(4));
        button.setOnClickListener(v -> { selectedVariant = variant; render(); });
        return button;
    }

    private void addSectionCards(LinearLayout parent, String prescription, WorkoutDb.Workout workout) {
        String[] rawSections = prescription.indexOf('\u001e') >= 0
                ? prescription.split(String.valueOf('\u001e'))
                : new String[]{"WORKOUT\u001f" + prescription};
        for (int i = 0; i < rawSections.length; i++) {
            String[] pieces = rawSections[i].split(String.valueOf('\u001f'), 2);
            String title = pieces[0].trim();
            String bodyText = pieces.length > 1 ? pieces[1].trim() : "";
            String sectionKey = sectionKey(i, title);
            boolean completed = db.sectionComplete(workout.id, selectedVariant, sectionKey);
            boolean optional = isOptionalSection(title);
            LinearLayout section = new LinearLayout(this);
            section.setOrientation(LinearLayout.VERTICAL);
            section.setPadding(dp(18), dp(14), dp(18), dp(14));
            section.setBackground(completed ? shatteredBackground()
                    : i == 0 ? darkFlameGradient(18) : background(GRAPHITE, 18, BORDER, 1));
            section.setElevation(dp(i == 0 ? 4 : 2));

            LinearLayout header = new LinearLayout(this);
            header.setGravity(Gravity.CENTER_VERTICAL);
            TextView name = label(title, 15, INK, true);
            header.addView(name, new LinearLayout.LayoutParams(0, -2, 1));
            TextView claw = label(completed ? "╱╱╱" : "○", completed ? 18 : 20,
                    completed ? EMBER : MUTED, true);
            claw.setGravity(Gravity.CENTER);
            claw.setContentDescription(completed ? "Mark " + title + " incomplete" : "Mark " + title + " complete");
            claw.setBackground(completed
                    ? background(PALE_FLAME, 18, EMBER, 1)
                    : background(Color.TRANSPARENT, 18, BORDER, 1));
            header.addView(claw, new LinearLayout.LayoutParams(dp(38), dp(38)));
            TextView duration = label(sectionDuration(title), 11, EMBER, true);
            duration.setMinWidth(dp(88));
            duration.setGravity(Gravity.CENTER);
            duration.setPadding(dp(10), dp(5), dp(10), dp(5));
            duration.setTextColor(GOLD);
            duration.setBackground(background(Color.rgb(18, 43, 67), 12, Color.rgb(42, 111, 155), 1));
            header.addView(duration);
            TextView chevron = label(completed || i != 0 ? "  +" : "  −", 18, EMBER, true);
            header.addView(chevron);
            section.addView(header);

            TextView body = text(bodyText, 17, INK);
            body.setLineSpacing(dp(4), 1.12f);
            body.setPadding(0, dp(16), 0, dp(4));
            body.setVisibility(!completed && i == 0 ? View.VISIBLE : View.GONE);
            section.addView(body);
            claw.setOnClickListener(v -> {
                if (db.sectionComplete(workout.id, selectedVariant, sectionKey)) {
                    db.setSectionComplete(workout.id, selectedVariant, sectionKey, false);
                    render();
                    return;
                }
                db.setSectionComplete(workout.id, selectedVariant, sectionKey, true);
                boolean finale = allRequiredSectionsComplete(workout.id, prescription);
                if (finale) db.record(workout.id, "COMPLETED");
                body.setVisibility(View.GONE);
                chevron.setText("  +");
                showOwlStrike(section, finale, this::render);
            });
            header.setOnClickListener(v -> {
                boolean open = body.getVisibility() == View.VISIBLE;
                body.setVisibility(open ? View.GONE : View.VISIBLE);
                chevron.setText(open ? "  +" : "  −");
                duration.setText(sectionDuration(title));
                section.setBackground(completed ? shatteredBackground()
                        : open ? background(GRAPHITE, 18, BORDER, 1) : darkFlameGradient(18));
                section.setElevation(dp(open ? 2 : 4));
            });
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(-1, -2);
            params.bottomMargin = dp(10);
            parent.addView(section, params);
        }
    }

    private String sectionKey(int index, String title) {
        return index + ":" + title.trim().toLowerCase(Locale.US);
    }

    private boolean isOptionalSection(String title) {
        String normalized = title.toLowerCase(Locale.US);
        return normalized.contains("accessory") || normalized.contains("bonus");
    }

    private int[] sectionProgress(long workoutId, String prescription) {
        String[] rawSections = prescription.indexOf('\u001e') >= 0
                ? prescription.split(String.valueOf('\u001e'))
                : new String[]{"WORKOUT\u001f" + prescription};
        int completed = 0;
        int required = 0;
        for (int i = 0; i < rawSections.length; i++) {
            String title = rawSections[i].split(String.valueOf('\u001f'), 2)[0].trim();
            if (isOptionalSection(title)) continue;
            required++;
            if (db.sectionComplete(workoutId, selectedVariant, sectionKey(i, title))) completed++;
        }
        return new int[]{completed, required};
    }

    private boolean allRequiredSectionsComplete(long workoutId, String prescription) {
        int[] progress = sectionProgress(workoutId, prescription);
        return progress[1] > 0 && progress[0] == progress[1];
    }

    private Drawable shatteredBackground() {
        return new Drawable() {
            final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
            final Path path = new Path();

            @Override public void draw(Canvas canvas) {
                RectF bounds = new RectF(getBounds());
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(GRAPHITE);
                canvas.drawRoundRect(bounds, dp(18), dp(18), paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(dp(1));
                paint.setColor(EMBER);
                canvas.drawRoundRect(bounds.left + 1, bounds.top + 1, bounds.right - 1, bounds.bottom - 1,
                        dp(18), dp(18), paint);
                float x = bounds.width() * 0.73f;
                float y = bounds.height() * 0.5f;
                paint.setStrokeWidth(dp(2));
                paint.setColor(Color.argb(205, 255, 196, 78));
                float[][] cracks = {{-92,-35,-42,-12}, {-82,42,-38,16}, {-20,-56,-10,-18},
                        {54,-46,28,-12}, {74,32,34,12}, {8,58,4,20}};
                for (float[] c : cracks) {
                    path.reset();
                    path.moveTo(x, y);
                    path.lineTo(x + dp((int)c[2]), y + dp((int)c[3]));
                    path.lineTo(x + dp((int)c[0]), y + dp((int)c[1]));
                    canvas.drawPath(path, paint);
                }
            }

            @Override public void setAlpha(int alpha) { paint.setAlpha(alpha); }
            @Override public void setColorFilter(android.graphics.ColorFilter filter) { paint.setColorFilter(filter); }
            @Override public int getOpacity() { return android.graphics.PixelFormat.TRANSLUCENT; }
        };
    }

    private void showOwlStrike(View target, boolean finale, Runnable finished) {
        if (scene == null) {
            finished.run();
            return;
        }
        FrameLayout veil = new FrameLayout(this);
        veil.setBackgroundColor(finale ? Color.argb(190, 7, 6, 21) : Color.TRANSPARENT);
        scene.addView(veil, new FrameLayout.LayoutParams(-1, -1));
        if (finale && soundtrack != null && soundtrack.isPlaying()) soundtrack.setVolume(0.38f, 0.38f);

        int[] sceneLocation = new int[2];
        int[] targetLocation = new int[2];
        scene.getLocationOnScreen(sceneLocation);
        target.getLocationOnScreen(targetLocation);
        int targetTop = targetLocation[1] - sceneLocation[1];
        int owlSize = dp(260);

        ImageView owl = new ImageView(this);
        owl.setImageResource(R.drawable.hoots_battle_owl);
        owl.setScaleType(ImageView.ScaleType.FIT_CENTER);
        owl.setAlpha(0f);
        owl.setScaleX(0.48f);
        owl.setScaleY(0.48f);
        FrameLayout.LayoutParams owlParams = new FrameLayout.LayoutParams(owlSize, owlSize);
        owlParams.leftMargin = Math.max(0, scene.getWidth() / 2 - owlSize / 2);
        owlParams.topMargin = -owlSize;
        veil.addView(owl, owlParams);

        ShatterBurstView impact = new ShatterBurstView();
        impact.setAlpha(0f);
        FrameLayout.LayoutParams impactParams = new FrameLayout.LayoutParams(target.getWidth(), target.getHeight());
        impactParams.leftMargin = targetLocation[0] - sceneLocation[0];
        impactParams.topMargin = targetTop;
        veil.addView(impact, impactParams);

        // The talons sit around 72% down the sprite; align that point with the card's center.
        float travel = targetTop + target.getHeight() * 0.5f + owlSize * 0.28f;
        owl.animate().alpha(1f).translationY(travel).rotation(4f).scaleX(1.08f).scaleY(1.08f)
                .setDuration(820).setInterpolator(new AccelerateInterpolator(1.08f))
                .withEndAction(() -> {
                    target.animate().alpha(0.18f).scaleX(0.96f).scaleY(0.92f).rotation(0.8f)
                            .setDuration(420).start();
                    owl.animate().alpha(0f).scaleX(1.45f).scaleY(1.45f).setDuration(380).start();
                    impact.setAlpha(1f);
                    impact.burst();
                    if (finale) {
                        TextView victory = label("THE HOOTS HAVE\nBEEN SUMMONED", 25, SUCCESS, true);
                        victory.setGravity(Gravity.CENTER);
                        victory.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        victory.setLetterSpacing(0.05f);
                        victory.setAlpha(0f);
                        victory.setTranslationY(dp(100));
                        veil.addView(victory, new FrameLayout.LayoutParams(-1, dp(150), Gravity.CENTER));
                        victory.animate().alpha(1f).translationY(dp(70)).setStartDelay(450)
                                .setDuration(420).start();
                    }
                }).start();
        veil.postDelayed(() -> {
            if (soundtrack != null) soundtrack.setVolume(0.16f, 0.16f);
            scene.removeView(veil);
            finished.run();
        }, finale ? 2700 : 1950);
    }

    private final class ShatterBurstView extends View {
        private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        private final Path path = new Path();

        ShatterBurstView() { super(MainActivity.this); }

        void burst() {
            setScaleX(0.65f);
            setScaleY(0.65f);
            animate().scaleX(1.18f).scaleY(1.18f).alpha(0f).setDuration(900)
                    .setStartDelay(340).start();
        }

        @Override protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float cx = getWidth() * 0.72f;
            float cy = getHeight() * 0.5f;
            paint.setStyle(Paint.Style.FILL);
            int[][] shards = {{-150,-60,-70,-85,-92,-20}, {-112,22,-54,6,-80,72},
                    {-35,-100,10,-52,-18,-20}, {30,-72,94,-48,42,-8},
                    {48,12,122,42,54,72}, {-12,28,28,96,-42,74}};
            for (int i = 0; i < shards.length; i++) {
                int[] s = shards[i];
                path.reset();
                path.moveTo(cx + dp(s[0]), cy + dp(s[1]));
                path.lineTo(cx + dp(s[2]), cy + dp(s[3]));
                path.lineTo(cx + dp(s[4]), cy + dp(s[5]));
                path.close();
                paint.setColor(i % 2 == 0 ? Color.rgb(47, 36, 78) : Color.rgb(25, 31, 68));
                canvas.drawPath(path, paint);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(dp(2));
                paint.setColor(i % 2 == 0 ? EMBER : GOLD);
                canvas.drawPath(path, paint);
                paint.setStyle(Paint.Style.FILL);
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dp(3));
            paint.setColor(INK);
            for (int angle = 0; angle < 360; angle += 45) {
                double radians = Math.toRadians(angle);
                canvas.drawLine(cx, cy, cx + (float)Math.cos(radians) * getWidth() * 0.42f,
                        cy + (float)Math.sin(radians) * getHeight() * 0.8f, paint);
            }
        }
    }

    private boolean musicEnabled() {
        return getPreferences(MODE_PRIVATE).getBoolean("music_enabled", true);
    }

    private void startSoundtrack() {
        AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
        int focus = audio.requestAudioFocus(audioFocusListener, AudioManager.STREAM_MUSIC,
                AudioManager.AUDIOFOCUS_GAIN);
        if (focus != AudioManager.AUDIOFOCUS_REQUEST_GRANTED) return;
        if (soundtrack == null) {
            soundtrack = MediaPlayer.create(this, R.raw.hoots_ascendant);
            if (soundtrack == null) return;
            soundtrack.setLooping(true);
            soundtrack.setVolume(0.16f, 0.16f);
        }
        if (!soundtrack.isPlaying()) soundtrack.start();
    }

    private void toggleSoundtrack() {
        boolean enabled = !musicEnabled();
        getPreferences(MODE_PRIVATE).edit().putBoolean("music_enabled", enabled).apply();
        if (enabled) startSoundtrack();
        else if (soundtrack != null && soundtrack.isPlaying()) soundtrack.pause();
        render();
    }

    private String sectionDuration(String title) {
        String normalized = title.toLowerCase(Locale.US);
        if (normalized.contains("warm")) return "8–10 MIN";
        if (normalized.contains("strength")) return "20–25 MIN";
        if (normalized.contains("metcon") || normalized.contains("emom") || normalized.contains("cardio")) return "12–20 MIN";
        if (normalized.contains("accessory") || normalized.contains("bonus")) return "OPTIONAL";
        if (normalized.contains("rest")) return "RECOVERY";
        return "8–15 MIN";
    }
}
