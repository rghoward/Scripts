package defpackage;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.DecimalStyle;
import j$.time.format.FormatStyle;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j21 extends i21 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final int c;
    public final ArrayList d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static DateTimeFormatter a(String str, Locale locale, LinkedHashMap linkedHashMap) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = linkedHashMap.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                linkedHashMap.put(str2, objWithDecimalStyle);
            }
            objWithDecimalStyle.getClass();
            return (DateTimeFormatter) objWithDecimalStyle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class b {
        public static final /* synthetic */ pl3 a = ol3.b(DayOfWeek.values());
    }

    public j21(Locale locale) {
        super(locale);
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        pl3 pl3Var = b.a;
        ArrayList arrayList = new ArrayList(pl3Var.d());
        int iD = pl3Var.d();
        for (int i = 0; i < iD; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) pl3Var.get(i);
            arrayList.add(new js7(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    @Override // defpackage.i21
    public final String a(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(e).m().format(a.a(str, locale, this.b));
    }

    @Override // defpackage.i21
    public final b21 b(long j) {
        LocalDate localDateM = Instant.ofEpochMilli(j).atZone(e).m();
        return new b21(localDateM.getYear(), localDateM.getMonthValue(), localDateM.getDayOfMonth(), 1000 * localDateM.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // defpackage.i21
    public final yg2 c(Locale locale) {
        return b0a.d(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // defpackage.i21
    public final int d() {
        return this.c;
    }

    @Override // defpackage.i21
    public final l21 e(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // defpackage.i21
    public final l21 f(long j) {
        return l(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).m());
    }

    @Override // defpackage.i21
    public final l21 g(b21 b21Var) {
        return l(LocalDate.of(b21Var.t, b21Var.u, 1));
    }

    @Override // defpackage.i21
    public final b21 h() {
        LocalDate localDateNow = LocalDate.now();
        return new b21(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.Q(LocalTime.MIDNIGHT).K(e).toInstant().toEpochMilli());
    }

    @Override // defpackage.i21
    public final List<js7<String, String>> i() {
        return this.d;
    }

    @Override // defpackage.i21
    public final b21 j(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, a.a(str2, locale, this.b));
            return new b21(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.Q(LocalTime.MIDNIGHT).K(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // defpackage.i21
    public final l21 k(l21 l21Var, int i) {
        return i <= 0 ? l21Var : l(Instant.ofEpochMilli(l21Var.e).atZone(e).m().plusMonths(i));
    }

    public final l21 l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new l21(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.Q(LocalTime.MIDNIGHT).K(e).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
