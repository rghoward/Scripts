package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.intercom.twig.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vy9 implements z4a {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final uy9 b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final pt7 c = new pt7();

    public vy9(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        byte[] bArr = list.get(0);
        String str = n6b.a;
        Charset charset = StandardCharsets.UTF_8;
        String str2 = new String(bArr, charset);
        xl7.g(str2.startsWith("Format:"));
        uy9 uy9VarA = uy9.a(str2);
        uy9VarA.getClass();
        this.b = uy9VarA;
        d(new pt7(list.get(1)), charset);
    }

    public static int c(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long e(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = n6b.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0251 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:104:0x0253  */
    /* JADX WARN: Code duplicated, block: B:105:0x0256  */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:110:0x0265 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:111:0x0267  */
    /* JADX WARN: Code duplicated, block: B:112:0x0269  */
    /* JADX WARN: Code duplicated, block: B:113:0x026b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0271  */
    /* JADX WARN: Code duplicated, block: B:117:0x0275  */
    /* JADX WARN: Code duplicated, block: B:118:0x0277  */
    /* JADX WARN: Code duplicated, block: B:119:0x0279  */
    /* JADX WARN: Code duplicated, block: B:127:0x0296  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02be  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d6 A[LOOP:2: B:147:0x02d4->B:148:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131 A[Catch: RuntimeException -> 0x0144, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0144, blocks: (B:55:0x0125, B:57:0x0131), top: B:188:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x0182  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0208  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:94:0x0237  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    /* JADX WARN: Code duplicated, block: B:97:0x0243 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0245  */
    /* JADX WARN: Code duplicated, block: B:99:0x0248  */
    @Override // defpackage.z4a
    public final void b(byte[] bArr, int i, int i2, z4a.b bVar, ry1<mc2> ry1Var) {
        long j;
        int i3;
        wy9 wy9Var;
        Matcher matcher;
        int i4;
        PointF pointF;
        float f;
        float f2;
        SpannableString spannableString;
        ec2.a aVar;
        float f3;
        int i5;
        Layout.Alignment alignment;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f4;
        float f5;
        ec2 ec2VarA;
        int iC;
        int iC2;
        boolean z;
        Integer num;
        Integer num2;
        int i11;
        int i12;
        float f6;
        boolean z2;
        int i13;
        int i14;
        Matcher matcher2;
        int iA;
        PointF pointFA;
        vy9 vy9Var = this;
        long j2 = bVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        pt7 pt7Var = vy9Var.c;
        pt7Var.K(bArr, i + i2);
        pt7Var.M(i);
        Charset charsetI = pt7Var.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        boolean z3 = vy9Var.a;
        if (!z3) {
            vy9Var.d(pt7Var, charsetI);
        }
        uy9 uy9VarA = z3 ? vy9Var.b : null;
        while (true) {
            String strN = pt7Var.n(charsetI);
            if (strN == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty() || i15 == 0) {
                        if (i15 == arrayList.size() - 1) {
                            d43.c();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i15)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i15 + 1)).longValue();
                        mc2 mc2Var = new mc2(jLongValue, jLongValue2 - jLongValue, list);
                        if (j3 == -9223372036854775807L || jLongValue2 >= j3) {
                            ry1Var.accept(mc2Var);
                        } else if (arrayList3 != null) {
                            arrayList3.add(mc2Var);
                        }
                    }
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList3.get(i16);
                        i16++;
                        ry1Var.accept((mc2) obj);
                    }
                    return;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                uy9VarA = uy9.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (uy9VarA == null) {
                        md6.g("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i17 = uy9VarA.f;
                        xl7.g(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i18 = uy9VarA.a;
                        String[] strArrSplit = strSubstring.split(",", i17);
                        if (strArrSplit.length != i17) {
                            md6.g("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i18 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i18].trim());
                                } catch (RuntimeException unused) {
                                    md6.g("SsaParser", "Fail to parse layer: " + strArrSplit[i18]);
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            j = j2;
                            long jE = e(strArrSplit[uy9VarA.b]);
                            if (jE == -9223372036854775807L) {
                                md6.g("SsaParser", "Skipping invalid timing: ".concat(strN));
                            } else {
                                long jE2 = e(strArrSplit[uy9VarA.c]);
                                if (jE2 == -9223372036854775807L || jE2 <= jE) {
                                    charsetI = charsetI;
                                    md6.g("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = vy9Var.d;
                                    if (linkedHashMap != null) {
                                        int i19 = uy9VarA.d;
                                        charsetI = charsetI;
                                        wy9Var = i19 != -1 ? (wy9) linkedHashMap.get(strArrSplit[i19].trim()) : null;
                                        String str = strArrSplit[uy9VarA.e];
                                        matcher = wy9.b.a.matcher(str);
                                        i4 = -1;
                                        pointF = null;
                                        while (matcher.find()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            try {
                                                pointFA = wy9.b.a(strGroup);
                                                if (pointFA != null) {
                                                    pointF = pointFA;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                matcher2 = wy9.b.d.matcher(strGroup);
                                                if (matcher2.find()) {
                                                    String strGroup2 = matcher2.group(1);
                                                    strGroup2.getClass();
                                                    iA = wy9.a(strGroup2);
                                                } else {
                                                    iA = -1;
                                                }
                                                if (iA != -1) {
                                                    i4 = iA;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                        }
                                        String strReplace = wy9.b.a.matcher(str).replaceAll(BuildConfig.FLAVOR).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        f = vy9Var.e;
                                        f2 = vy9Var.f;
                                        spannableString = new SpannableString(strReplace);
                                        aVar = new ec2.a();
                                        aVar.a = spannableString;
                                        aVar.b = null;
                                        aVar.r = i3;
                                        if (wy9Var != null) {
                                            f3 = -3.4028235E38f;
                                            z = wy9Var.g;
                                            num = wy9Var.d;
                                            num2 = wy9Var.c;
                                            if (num2 != null) {
                                                i11 = 0;
                                                i12 = 33;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                i11 = 0;
                                                i12 = 33;
                                            }
                                            if (wy9Var.j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i11, spannableString.length(), i12);
                                            }
                                            f6 = wy9Var.e;
                                            if (f6 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                                aVar.k = f6 / f2;
                                                aVar.j = 1;
                                            }
                                            z2 = wy9Var.f;
                                            if (z2 || !z) {
                                                i13 = 0;
                                                i14 = 33;
                                                if (z2) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z != 0) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            } else {
                                                i13 = 0;
                                                i14 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            }
                                            if (wy9Var.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i14);
                                            }
                                            if (wy9Var.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i14);
                                            }
                                        } else {
                                            f = f;
                                            f2 = f2;
                                            f3 = -3.4028235E38f;
                                        }
                                        if (i4 != -1) {
                                            i5 = i4;
                                        } else if (wy9Var != null) {
                                            i5 = wy9Var.b;
                                        } else {
                                            i5 = -1;
                                        }
                                        switch (i5) {
                                            case 0:
                                            default:
                                                d80.a(i5, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        aVar.c = alignment;
                                        i6 = Integer.MIN_VALUE;
                                        switch (i5) {
                                            case 0:
                                            default:
                                                d80.a(i5, "Unknown alignment: ", "SsaParser");
                                            case -1:
                                                i7 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i7 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i7 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i7 = 2;
                                                break;
                                        }
                                        aVar.i = i7;
                                        switch (i5) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                d80.a(i5, "Unknown alignment: ", "SsaParser");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i6 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i6 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i6 = 0;
                                                break;
                                        }
                                        aVar.g = i6;
                                        if (pointF != null || f2 == f3 || f == f3) {
                                            i8 = aVar.i;
                                            if (i8 != 0) {
                                                i9 = 1;
                                                if (i8 != 1) {
                                                    i10 = 2;
                                                    if (i8 != 2) {
                                                        f4 = f3;
                                                    } else {
                                                        f4 = 0.95f;
                                                    }
                                                } else {
                                                    i10 = 2;
                                                    f4 = 0.5f;
                                                }
                                            } else {
                                                i9 = 1;
                                                i10 = 2;
                                                f4 = 0.05f;
                                            }
                                            aVar.h = f4;
                                            if (i6 == 0) {
                                                f5 = 0.05f;
                                            } else if (i6 == i9) {
                                                f5 = 0.5f;
                                            } else if (i6 != i10) {
                                                f5 = f3;
                                            } else {
                                                f5 = 0.95f;
                                            }
                                            aVar.e = f5;
                                            aVar.f = 0;
                                        } else {
                                            aVar.h = pointF.x / f;
                                            aVar.e = pointF.y / f2;
                                            aVar.f = 0;
                                        }
                                        ec2VarA = aVar.a();
                                        iC2 = c(jE2, arrayList2, arrayList);
                                        for (iC = c(jE, arrayList2, arrayList); iC < iC2; iC++) {
                                            ((List) arrayList.get(iC)).add(ec2VarA);
                                        }
                                    } else {
                                        charsetI = charsetI;
                                    }
                                    String str2 = strArrSplit[uy9VarA.e];
                                    matcher = wy9.b.a.matcher(str2);
                                    i4 = -1;
                                    pointF = null;
                                    while (matcher.find()) {
                                        String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        pointFA = wy9.b.a(strGroup3);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                        matcher2 = wy9.b.d.matcher(strGroup3);
                                        if (matcher2.find()) {
                                            String strGroup4 = matcher2.group(1);
                                            strGroup4.getClass();
                                            iA = wy9.a(strGroup4);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i4 = iA;
                                        }
                                    }
                                    String strReplace2 = wy9.b.a.matcher(str2).replaceAll(BuildConfig.FLAVOR).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    f = vy9Var.e;
                                    f2 = vy9Var.f;
                                    spannableString = new SpannableString(strReplace2);
                                    aVar = new ec2.a();
                                    aVar.a = spannableString;
                                    aVar.b = null;
                                    aVar.r = i3;
                                    if (wy9Var != null) {
                                        f3 = -3.4028235E38f;
                                        z = wy9Var.g;
                                        num = wy9Var.d;
                                        num2 = wy9Var.c;
                                        if (num2 != null) {
                                            i11 = 0;
                                            i12 = 33;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i11 = 0;
                                            i12 = 33;
                                        }
                                        if (wy9Var.j == 3) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i11, spannableString.length(), i12);
                                        }
                                        f6 = wy9Var.e;
                                        if (f6 != -3.4028235E38f) {
                                            aVar.k = f6 / f2;
                                            aVar.j = 1;
                                        }
                                        z2 = wy9Var.f;
                                        if (z2) {
                                            i13 = 0;
                                            i14 = 33;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else {
                                            i13 = 0;
                                            i14 = 33;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (wy9Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i14);
                                        }
                                        if (wy9Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i14);
                                        }
                                    } else {
                                        f = f;
                                        f2 = f2;
                                        f3 = -3.4028235E38f;
                                    }
                                    if (i4 != -1) {
                                        i5 = i4;
                                    } else if (wy9Var != null) {
                                        i5 = wy9Var.b;
                                    } else {
                                        i5 = -1;
                                    }
                                    switch (i5) {
                                        case 0:
                                        default:
                                            d80.a(i5, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    aVar.c = alignment;
                                    i6 = Integer.MIN_VALUE;
                                    switch (i5) {
                                        case 0:
                                        default:
                                            d80.a(i5, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i7 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i7 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i7 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i7 = 2;
                                            break;
                                    }
                                    aVar.i = i7;
                                    switch (i5) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            d80.a(i5, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i6 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i6 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i6 = 0;
                                            break;
                                    }
                                    aVar.g = i6;
                                    if (pointF != null) {
                                        i8 = aVar.i;
                                        if (i8 != 0) {
                                            i9 = 1;
                                            if (i8 != 1) {
                                                i10 = 2;
                                                if (i8 != 2) {
                                                    f4 = f3;
                                                } else {
                                                    f4 = 0.95f;
                                                }
                                            } else {
                                                i10 = 2;
                                                f4 = 0.5f;
                                            }
                                        } else {
                                            i9 = 1;
                                            i10 = 2;
                                            f4 = 0.05f;
                                        }
                                        aVar.h = f4;
                                        if (i6 == 0) {
                                            f5 = 0.05f;
                                        } else if (i6 == i9) {
                                            f5 = 0.5f;
                                        } else if (i6 != i10) {
                                            f5 = f3;
                                        } else {
                                            f5 = 0.95f;
                                        }
                                        aVar.e = f5;
                                        aVar.f = 0;
                                    } else {
                                        i8 = aVar.i;
                                        if (i8 != 0) {
                                            i9 = 1;
                                            if (i8 != 1) {
                                                i10 = 2;
                                                if (i8 != 2) {
                                                    f4 = f3;
                                                } else {
                                                    f4 = 0.95f;
                                                }
                                            } else {
                                                i10 = 2;
                                                f4 = 0.5f;
                                            }
                                        } else {
                                            i9 = 1;
                                            i10 = 2;
                                            f4 = 0.05f;
                                        }
                                        aVar.h = f4;
                                        if (i6 == 0) {
                                            f5 = 0.05f;
                                        } else if (i6 == i9) {
                                            f5 = 0.5f;
                                        } else if (i6 != i10) {
                                            f5 = f3;
                                        } else {
                                            f5 = 0.95f;
                                        }
                                        aVar.e = f5;
                                        aVar.f = 0;
                                    }
                                    ec2VarA = aVar.a();
                                    iC2 = c(jE2, arrayList2, arrayList);
                                    while (iC < iC2) {
                                        ((List) arrayList.get(iC)).add(ec2VarA);
                                    }
                                }
                            }
                        }
                    }
                    j = j2;
                } else {
                    j = j2;
                }
                vy9Var = this;
                j2 = j;
                uy9VarA = uy9VarA;
                charsetI = charsetI;
                pt7Var = pt7Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void d(pt7 pt7Var, Charset charset) {
        int i;
        wy9 wy9Var;
        while (true) {
            String strN = pt7Var.n(charset);
            if (strN == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = pt7Var.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (pt7Var.a() != 0) {
                        int iH = pt7Var.h(charset);
                        if ((iH != 0 ? ek5.i1(iH >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strF = h40.f(strArrSplit[0].trim());
                        strF.getClass();
                        if (strF.equals("playresx")) {
                            this.e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strF.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                wy9.a aVar = null;
                while (true) {
                    String strN3 = pt7Var.n(charset);
                    if (strN3 != null) {
                        if (pt7Var.a() != 0) {
                            int iH2 = pt7Var.h(charset);
                            if ((iH2 != 0 ? ek5.i1(iH2 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (strN3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strN3.substring(7), ",");
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < strArrSplit2.length; i15++) {
                                String strF2 = h40.f(strArrSplit2[i15].trim());
                                strF2.getClass();
                                switch (strF2.hashCode()) {
                                    case -1178781136:
                                        i = strF2.equals("italic") ? i2 : -1;
                                        break;
                                    case -1026963764:
                                        i = strF2.equals("underline") ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i = strF2.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i = strF2.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i = strF2.equals("bold") ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i = strF2.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i = strF2.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i = strF2.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i = strF2.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i = strF2.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case 3:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case 5:
                                        i5 = i15;
                                        break;
                                    case 6:
                                        i9 = i15;
                                        break;
                                    case 7:
                                        i14 = i15;
                                        break;
                                    case 8:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            aVar = i5 != -1 ? new wy9.a(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length) : null;
                        } else {
                            if (strN3.startsWith("Style:")) {
                                if (aVar == null) {
                                    md6.g("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                } else {
                                    xl7.g(strN3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strN3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i16 = aVar.k;
                                    if (length != i16) {
                                        int length2 = strArrSplit3.length;
                                        String str = n6b.a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbB = u43.b("Skipping malformed 'Style:' line (expected ", " values, found ", "): '", i16, length2);
                                        sbB.append(strN3);
                                        sbB.append("'");
                                        md6.g("SsaStyle", sbB.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[aVar.a].trim();
                                            int i17 = aVar.b;
                                            int iA = i17 != -1 ? wy9.a(strArrSplit3[i17].trim()) : -1;
                                            int i18 = aVar.c;
                                            Integer numC = i18 != -1 ? wy9.c(strArrSplit3[i18].trim()) : null;
                                            int i19 = aVar.d;
                                            Integer numC2 = i19 != -1 ? wy9.c(strArrSplit3[i19].trim()) : null;
                                            int i20 = aVar.e;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String strTrim2 = strArrSplit3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e) {
                                                    md6.h("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = aVar.f;
                                            boolean z = i21 != -1 && wy9.b(strArrSplit3[i21].trim());
                                            int i22 = aVar.g;
                                            boolean z2 = i22 != -1 && wy9.b(strArrSplit3[i22].trim());
                                            int i23 = aVar.h;
                                            boolean z3 = i23 != -1 && wy9.b(strArrSplit3[i23].trim());
                                            int i24 = aVar.i;
                                            boolean z4 = i24 != -1 && wy9.b(strArrSplit3[i24].trim());
                                            int i25 = aVar.j;
                                            if (i25 != -1) {
                                                String strTrim3 = strArrSplit3[i25].trim();
                                                try {
                                                    int i26 = Integer.parseInt(strTrim3.trim());
                                                    if (i26 == 1 || i26 == 3) {
                                                        i4 = i26;
                                                    } else {
                                                        md6.g("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            wy9Var = new wy9(strTrim, iA, numC, numC2, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            md6.h("SsaStyle", "Skipping malformed 'Style:' line: '" + strN3 + "'", e2);
                                            wy9Var = null;
                                        }
                                        if (wy9Var != null) {
                                            linkedHashMap.put(wy9Var.a, wy9Var);
                                        }
                                    }
                                    wy9Var = null;
                                    if (wy9Var != null) {
                                        linkedHashMap.put(wy9Var.a, wy9Var);
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                md6.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }
}
