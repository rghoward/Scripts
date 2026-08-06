package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements e {
    public static final ConcurrentMap c = new ConcurrentHashMap(16, 0.75f, 2);
    public final FormatStyle a;
    public final FormatStyle b;

    public i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    @Override // j$.time.format.e
    public final int E(v vVar, CharSequence charSequence, int i) {
        return a(vVar.a.b, vVar.d()).c().E(vVar, charSequence, i);
    }

    public final DateTimeFormatter a(Locale locale, Chronology chronology) {
        String id = chronology.getId();
        String string = locale.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append("|");
        sb.append(string);
        sb.append("|");
        FormatStyle formatStyle = this.a;
        sb.append(formatStyle);
        FormatStyle formatStyle2 = this.b;
        sb.append(formatStyle2);
        String string2 = sb.toString();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string2);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, formatStyle2, chronology, locale);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(localizedDateTimePattern);
        DateTimeFormatter dateTimeFormatterR = dateTimeFormatterBuilder.r(locale, c0.SMART, null);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string2, dateTimeFormatterR);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : dateTimeFormatterR;
    }

    public final String toString() {
        return "Localized(" + this.a + "," + this.b + ")";
    }

    @Override // j$.time.format.e
    public final boolean z(x xVar, StringBuilder sb) {
        a(xVar.b.b, Chronology.p(xVar.a)).c().z(xVar, sb);
        return true;
    }
}
