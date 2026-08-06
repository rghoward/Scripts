package defpackage;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j56 extends i21 {
    public static final TimeZone e = DesugarTimeZone.getTimeZone("UTC");
    public final int c;
    public final e96 d;

    public j56(Locale locale) {
        List listAsList;
        super(locale);
        int firstDayOfWeek = (Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.c = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        e96 e96VarF = ws0.f();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        weekdays.getClass();
        int length = weekdays.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            ca0.a(pk.d(length, "Requested element count ", " is less than zero."));
            listAsList = null;
        } else if (length == 0) {
            listAsList = hf3.t;
        } else {
            int length2 = weekdays.length;
            if (length >= length2) {
                listAsList = u30.E(weekdays);
            } else if (length == 1) {
                listAsList = ws0.h(weekdays[length2 - 1]);
            } else {
                listAsList = Arrays.asList(gz3.k(length2 - length, length2, weekdays));
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        for (int i = 0; i < size; i++) {
            e96VarF.add(new js7((String) listAsList.get(i), shortWeekdays[i + 2]));
        }
        e96VarF.add(new js7(weekdays[1], shortWeekdays[1]));
        this.d = ws0.e(e96VarF);
    }

    @Override // defpackage.i21
    public final String a(long j, String str, Locale locale) {
        StringBuilder sbA = bl2.a(str);
        sbA.append(locale.toLanguageTag());
        String string = sbA.toString();
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(string);
        TimeZone timeZone = e;
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(string, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // defpackage.i21
    public final b21 b(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new b21(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // defpackage.i21
    public final yg2 c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.getClass();
        return b0a.d(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // defpackage.i21
    public final int d() {
        return this.c;
    }

    @Override // defpackage.i21
    public final l21 e(int i, int i2) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // defpackage.i21
    public final l21 f(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // defpackage.i21
    public final l21 g(b21 b21Var) {
        return e(b21Var.t, b21Var.u);
    }

    @Override // defpackage.i21
    public final b21 h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new b21(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(16) + calendar.get(15))));
    }

    @Override // defpackage.i21
    public final List<js7<String, String>> i() {
        return this.d;
    }

    @Override // defpackage.i21
    public final b21 j(String str, String str2, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = e;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new b21(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // defpackage.i21
    public final l21 k(l21 l21Var, int i) {
        if (i <= 0) {
            return l21Var;
        }
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(l21Var.e);
        calendar.add(2, i);
        return l(calendar);
    }

    public final l21 l(Calendar calendar) {
        int i = (calendar.get(7) + 6) % 7;
        int i2 = (i != 0 ? i : 7) - this.c;
        if (i2 < 0) {
            i2 += 7;
        }
        return new l21(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i2, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
