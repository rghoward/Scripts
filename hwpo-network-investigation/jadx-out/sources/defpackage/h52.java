package defpackage;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h52 {
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static int a(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x009a  */
        public static long b(int i, String str) {
            int iA = a(0, i, str, false);
            Matcher matcher = h52.n.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iU = -1;
            int i5 = -1;
            int i6 = -1;
            while (iA < i) {
                int iA2 = a(iA + 1, i, str, true);
                matcher.region(iA, iA2);
                if (i3 == -1 && matcher.usePattern(h52.n).matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    i3 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    i6 = Integer.parseInt(strGroup3);
                } else if (i4 == -1 && matcher.usePattern(h52.m).matches()) {
                    String strGroup4 = matcher.group(1);
                    strGroup4.getClass();
                    i4 = Integer.parseInt(strGroup4);
                } else if (iU == -1) {
                    Pattern pattern = h52.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        strGroup5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = strGroup5.toLowerCase(locale);
                        lowerCase.getClass();
                        String strPattern = pattern.pattern();
                        strPattern.getClass();
                        iU = z2a.u(strPattern, lowerCase, 0, false, 6) / 4;
                    } else if (i2 != -1 && matcher.usePattern(h52.k).matches()) {
                        String strGroup6 = matcher.group(1);
                        strGroup6.getClass();
                        i2 = Integer.parseInt(strGroup6);
                    }
                } else if (i2 != -1) {
                }
                iA = a(iA2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (i2 < 1601) {
                z90.a("Failed requirement.");
                return 0L;
            }
            if (iU == -1) {
                z90.a("Failed requirement.");
                return 0L;
            }
            if (1 > i4 || i4 >= 32) {
                z90.a("Failed requirement.");
                return 0L;
            }
            if (i3 < 0 || i3 >= 24) {
                z90.a("Failed requirement.");
                return 0L;
            }
            if (i5 < 0 || i5 >= 60) {
                z90.a("Failed requirement.");
                return 0L;
            }
            if (i6 < 0 || i6 >= 60) {
                z90.a("Failed requirement.");
                return 0L;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(ytb.a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, iU - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i6);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public h52(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h52)) {
            return false;
        }
        h52 h52Var = (h52) obj;
        return h52Var.a.equals(this.a) && h52Var.b.equals(this.b) && h52Var.c == this.c && h52Var.d.equals(this.d) && h52Var.e.equals(this.e) && h52Var.f == this.f && h52Var.g == this.g && h52Var.h == this.h && h52Var.i == this.i && xj5.a(h52Var.j, this.j);
    }

    public final int hashCode() {
        int iA = uo2.a(uo2.a(uo2.a(uo2.a(ru3.c(ru3.c(al.c(this.c, ru3.c(ru3.c(527, 31, this.a), 31, this.b), 31), 31, this.d), 31, this.e), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
        String str = this.j;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = xg2.a.get().format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String str2 = this.j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
