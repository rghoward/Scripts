package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i4a implements z4a {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList<String> b = new ArrayList<>();
    public final pt7 c = new pt7();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2  */
    public static ec2 c(Spanned spanned, String str) {
        float f;
        ec2.a aVar = new ec2.a();
        aVar.a = spanned;
        aVar.b = null;
        if (str == null) {
            return aVar.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                aVar.i = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                aVar.i = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                aVar.i = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    aVar.i = 1;
                } else {
                    aVar.i = 2;
                }
                break;
            default:
                aVar.i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    aVar.g = 1;
                } else {
                    aVar.g = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    aVar.g = 1;
                } else {
                    aVar.g = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    aVar.g = 1;
                } else {
                    aVar.g = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                aVar.g = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                aVar.g = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                aVar.g = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    aVar.g = 1;
                } else {
                    aVar.g = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    aVar.g = 1;
                } else {
                    aVar.g = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    aVar.g = 1;
                } else {
                    aVar.g = 0;
                }
                break;
            default:
                aVar.g = 1;
                break;
        }
        int i = aVar.i;
        float f2 = 0.08f;
        if (i == 0) {
            f = 0.08f;
        } else if (i == 1) {
            f = 0.5f;
        } else {
            if (i != 2) {
                zn3.b();
                return null;
            }
            f = 0.92f;
        }
        aVar.h = f;
        int i2 = aVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                f2 = 0.5f;
            } else {
                if (i2 != 2) {
                    zn3.b();
                    return null;
                }
                f2 = 0.92f;
            }
        }
        aVar.e = f2;
        aVar.f = 0;
        return aVar.a();
    }

    public static long d(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.z4a
    public final void b(byte[] bArr, int i, int i2, z4a.b bVar, ry1<mc2> ry1Var) {
        String str;
        i4a i4aVar = this;
        long j = bVar.a;
        pt7 pt7Var = i4aVar.c;
        pt7Var.K(bArr, i + i2);
        pt7Var.M(i);
        Charset charsetI = pt7Var.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
        while (true) {
            String strN = pt7Var.n(charsetI);
            if (strN == null) {
                break;
            }
            if (!strN.isEmpty()) {
                try {
                    Integer.parseInt(strN);
                    String strN2 = pt7Var.n(charsetI);
                    if (strN2 == null) {
                        md6.g("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = d.matcher(strN2);
                    if (matcher.matches()) {
                        long jD = d(matcher, 1);
                        long jD2 = d(matcher, 6);
                        StringBuilder sb = i4aVar.a;
                        sb.setLength(0);
                        long j3 = j2;
                        ArrayList<String> arrayList2 = i4aVar.b;
                        arrayList2.clear();
                        for (String strN3 = pt7Var.n(charsetI); !TextUtils.isEmpty(strN3); strN3 = pt7Var.n(charsetI)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strN3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = e.matcher(strTrim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i3;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, BuildConfig.FLAVOR);
                                i3 += length;
                                j = j;
                            }
                            sb.append(sb2.toString());
                        }
                        long j4 = j;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (j4 == j3 || jD2 >= j4) {
                            ry1Var.accept(new mc2(jD, jD2 - jD, k95.v(c(spannedFromHtml, str))));
                        } else if (arrayList != null) {
                            arrayList.add(new mc2(jD, jD2 - jD, k95.v(c(spannedFromHtml, str))));
                        }
                        i4aVar = this;
                        j2 = j3;
                        j = j4;
                    } else {
                        md6.g("SubripParser", "Skipping invalid timing: ".concat(strN2));
                        i4aVar = this;
                    }
                } catch (NumberFormatException unused) {
                    md6.g("SubripParser", "Skipping invalid index: ".concat(strN));
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ry1Var.accept((mc2) obj);
            }
        }
    }
}
