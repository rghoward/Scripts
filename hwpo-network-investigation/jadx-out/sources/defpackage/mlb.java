package defpackage;

import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mlb implements z4a {
    public final pt7 a = new pt7();
    public final glb b = new glb();

    /* JADX WARN: Code duplicated, block: B:120:0x0208  */
    /* JADX WARN: Code duplicated, block: B:130:0x022a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0235  */
    /* JADX WARN: Code duplicated, block: B:133:0x023e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0248  */
    /* JADX WARN: Code duplicated, block: B:136:0x0250  */
    /* JADX WARN: Code duplicated, block: B:138:0x0258  */
    /* JADX WARN: Code duplicated, block: B:139:0x025c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:142:0x026b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0273  */
    /* JADX WARN: Code duplicated, block: B:150:0x0286  */
    /* JADX WARN: Code duplicated, block: B:152:0x028b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0293  */
    /* JADX WARN: Code duplicated, block: B:156:0x029b  */
    /* JADX WARN: Code duplicated, block: B:157:0x029f  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02af  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:164:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:176:0x030b  */
    /* JADX WARN: Code duplicated, block: B:179:0x031c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0325  */
    /* JADX WARN: Code duplicated, block: B:183:0x0327  */
    /* JADX WARN: Code duplicated, block: B:186:0x0330  */
    /* JADX WARN: Code duplicated, block: B:187:0x0332  */
    /* JADX WARN: Code duplicated, block: B:190:0x033b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0343  */
    /* JADX WARN: Code duplicated, block: B:195:0x0348  */
    /* JADX WARN: Code duplicated, block: B:196:0x034d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0360  */
    /* JADX WARN: Code duplicated, block: B:238:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x02f1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z4a
    public final void b(byte[] bArr, int i, int i2, z4a.b bVar, ry1<mc2> ry1Var) {
        ilb ilbVarD;
        String strTrim;
        int i3;
        char c;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        mlb mlbVar = this;
        pt7 pt7Var = mlbVar.a;
        pt7Var.K(bArr, i + i2);
        pt7Var.M(i);
        ArrayList arrayList = new ArrayList();
        try {
            nlb.d(pt7Var);
            while (!TextUtils.isEmpty(pt7Var.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                byte b2 = -1;
                while (true) {
                    int i8 = 1;
                    char c2 = 2;
                    if (b2 == -1) {
                        i7 = pt7Var.b;
                        String strN = pt7Var.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b2 = 2;
                        } else {
                            b2 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        pt7Var.M(i7);
                        if (b2 == 0) {
                            q56.b(new plb(arrayList2), bVar, ry1Var);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(pt7Var.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    z90.a("A style block was found after the first cue.");
                                    return;
                                }
                                pt7Var.n(StandardCharsets.UTF_8);
                                glb glbVar = mlbVar.b;
                                pt7 pt7Var2 = glbVar.a;
                                StringBuilder sb = glbVar.b;
                                sb.setLength(0);
                                int i9 = pt7Var.b;
                                while (!TextUtils.isEmpty(pt7Var.n(StandardCharsets.UTF_8))) {
                                }
                                pt7Var2.K(pt7Var.a, pt7Var.b);
                                pt7Var2.M(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    glb.c(pt7Var2);
                                    if (pt7Var2.a() >= 5 && "::cue".equals(pt7Var2.x(5, StandardCharsets.UTF_8))) {
                                        int i10 = pt7Var2.b;
                                        String strB = glb.b(pt7Var2, sb);
                                        if (strB == null) {
                                            strTrim = null;
                                        } else if ("{".equals(strB)) {
                                            pt7Var2.M(i10);
                                            strTrim = BuildConfig.FLAVOR;
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i11 = pt7Var2.b;
                                                int i12 = pt7Var2.c;
                                                int i13 = i5;
                                                while (i11 < i12 && i13 == 0) {
                                                    int i14 = i11 + 1;
                                                    int i15 = ((char) pt7Var2.a[i11]) == ')' ? i8 : i5;
                                                    i11 = i14;
                                                    i13 = i15;
                                                }
                                                strTrim = pt7Var2.x((i11 - 1) - pt7Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = null;
                                            }
                                            if (!")".equals(glb.b(pt7Var2, sb))) {
                                                strTrim = null;
                                            }
                                        }
                                    } else {
                                        strTrim = null;
                                    }
                                    if (strTrim != null && "{".equals(glb.b(pt7Var2, sb))) {
                                        hlb hlbVar = new hlb();
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i6) {
                                                Matcher matcher2 = glb.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i8);
                                                    strGroup2.getClass();
                                                    hlbVar.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(i5, iIndexOf);
                                            }
                                            String str = n6b.a;
                                            String[] strArrSplit = strTrim.split("\\.", i6);
                                            String str2 = strArrSplit[i5];
                                            int iIndexOf2 = str2.indexOf(35);
                                            if (iIndexOf2 != i6) {
                                                hlbVar.b = str2.substring(i5, iIndexOf2);
                                                hlbVar.a = str2.substring(iIndexOf2 + 1);
                                            } else {
                                                hlbVar.b = str2;
                                            }
                                            if (strArrSplit.length > i8) {
                                                int length = strArrSplit.length;
                                                xl7.g(length <= strArrSplit.length ? i8 : i5);
                                                hlbVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i8, length)));
                                            }
                                        }
                                        int i16 = i5;
                                        String strB2 = null;
                                        while (i16 == 0) {
                                            int i17 = pt7Var2.b;
                                            strB2 = glb.b(pt7Var2, sb);
                                            int i18 = (strB2 == null || "}".equals(strB2)) ? i8 : i5;
                                            if (i18 == 0) {
                                                pt7Var2.M(i17);
                                                glb.c(pt7Var2);
                                                String strA = glb.a(pt7Var2, sb);
                                                if (!strA.isEmpty() && ":".equals(glb.b(pt7Var2, sb))) {
                                                    glb.c(pt7Var2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z2 = false;
                                                    while (true) {
                                                        if (z2) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i19 = pt7Var2.b;
                                                            String strB3 = glb.b(pt7Var2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                pt7Var2.M(i19);
                                                                z2 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                        c = 2;
                                                    } else {
                                                        int i20 = pt7Var2.b;
                                                        String strB4 = glb.b(pt7Var2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                hlbVar.f = ci1.a(string, true);
                                                                hlbVar.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    hlbVar.h = ci1.a(string, true);
                                                                    hlbVar.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        hlbVar.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            hlbVar.k = 1;
                                                                        }
                                                                        c = 2;
                                                                    } else if ("font-family".equals(strA)) {
                                                                        hlbVar.e = h40.f(string);
                                                                    } else if (!"font-weight".equals(strA)) {
                                                                        if ("bold".equals(string)) {
                                                                            i4 = 1;
                                                                            hlbVar.l = 1;
                                                                        }
                                                                        c = 2;
                                                                    } else {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                hlbVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = glb.d.matcher(h40.f(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                hlbVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                hlbVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                hlbVar.n = 1;
                                                                                                c = 2;
                                                                                                break;
                                                                                            default:
                                                                                                d43.c();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        hlbVar.o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                hlbVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                hlbVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                hlbVar.n = 1;
                                                                                                c = 2;
                                                                                                break;
                                                                                            default:
                                                                                                d43.c();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        hlbVar.o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                hlbVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                c = 2;
                                                                                                hlbVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                hlbVar.n = 1;
                                                                                                c = 2;
                                                                                                break;
                                                                                            default:
                                                                                                d43.c();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        hlbVar.o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        c = 2;
                                                                                        hlbVar.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        c = 2;
                                                                                        hlbVar.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        hlbVar.n = 1;
                                                                                        c = 2;
                                                                                        break;
                                                                                    default:
                                                                                        d43.c();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                hlbVar.o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                md6.g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    }
                                                                    i3 = 1;
                                                                    c = 2;
                                                                } else if ("over".equals(string)) {
                                                                    hlbVar.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    hlbVar.p = 2;
                                                                    c = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                    c = 2;
                                                                }
                                                            }
                                                            i3 = i4;
                                                            c = 2;
                                                        } else {
                                                            if ("}".equals(strB4)) {
                                                                pt7Var2.M(i20);
                                                                if ("color".equals(strA)) {
                                                                    i4 = 1;
                                                                    hlbVar.f = ci1.a(string, true);
                                                                    hlbVar.g = true;
                                                                } else {
                                                                    i4 = 1;
                                                                    if ("background-color".equals(strA)) {
                                                                        hlbVar.h = ci1.a(string, true);
                                                                        hlbVar.i = true;
                                                                    } else if ("ruby-position".equals(strA)) {
                                                                        if ("text-combine-upright".equals(strA)) {
                                                                            if ("all".equals(string) || string.startsWith("digits")) {
                                                                                z = true;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            hlbVar.q = z;
                                                                        } else if ("text-decoration".equals(strA)) {
                                                                            if ("underline".equals(string)) {
                                                                                i4 = 1;
                                                                                hlbVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(strA)) {
                                                                            hlbVar.e = h40.f(string);
                                                                        } else if (!"font-weight".equals(strA)) {
                                                                            i4 = 1;
                                                                            if ("font-style".equals(strA)) {
                                                                                if ("italic".equals(string)) {
                                                                                    hlbVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(strA)) {
                                                                                matcher = glb.d.matcher(h40.f(string));
                                                                                if (matcher.matches()) {
                                                                                    md6.g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                                } else {
                                                                                    strGroup = matcher.group(2);
                                                                                    strGroup.getClass();
                                                                                    switch (strGroup.hashCode()) {
                                                                                        case 37:
                                                                                            if (!strGroup.equals("%")) {
                                                                                                b = 0;
                                                                                            }
                                                                                            switch (b) {
                                                                                                case 0:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    hlbVar.n = 3;
                                                                                                    break;
                                                                                                case 1:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    hlbVar.n = 2;
                                                                                                    break;
                                                                                                case 2:
                                                                                                    i3 = 1;
                                                                                                    hlbVar.n = 1;
                                                                                                    c = 2;
                                                                                                    break;
                                                                                                default:
                                                                                                    d43.c();
                                                                                                    return;
                                                                                            }
                                                                                            String strGroup7 = matcher.group(i3);
                                                                                            strGroup7.getClass();
                                                                                            hlbVar.o = Float.parseFloat(strGroup7);
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (!strGroup.equals("em")) {
                                                                                                b = 1;
                                                                                            }
                                                                                            switch (b) {
                                                                                                case 0:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    hlbVar.n = 3;
                                                                                                    break;
                                                                                                case 1:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    hlbVar.n = 2;
                                                                                                    break;
                                                                                                case 2:
                                                                                                    i3 = 1;
                                                                                                    hlbVar.n = 1;
                                                                                                    c = 2;
                                                                                                    break;
                                                                                                default:
                                                                                                    d43.c();
                                                                                                    return;
                                                                                            }
                                                                                            String strGroup8 = matcher.group(i3);
                                                                                            strGroup8.getClass();
                                                                                            hlbVar.o = Float.parseFloat(strGroup8);
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (!strGroup.equals("px")) {
                                                                                                b = 2;
                                                                                            }
                                                                                            switch (b) {
                                                                                                case 0:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    hlbVar.n = 3;
                                                                                                    break;
                                                                                                case 1:
                                                                                                    i3 = 1;
                                                                                                    c = 2;
                                                                                                    hlbVar.n = 2;
                                                                                                    break;
                                                                                                case 2:
                                                                                                    i3 = 1;
                                                                                                    hlbVar.n = 1;
                                                                                                    c = 2;
                                                                                                    break;
                                                                                                default:
                                                                                                    d43.c();
                                                                                                    return;
                                                                                            }
                                                                                            String strGroup9 = matcher.group(i3);
                                                                                            strGroup9.getClass();
                                                                                            hlbVar.o = Float.parseFloat(strGroup9);
                                                                                            break;
                                                                                    }
                                                                                    b = -1;
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                            i3 = 1;
                                                                                            c = 2;
                                                                                            hlbVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i3 = 1;
                                                                                            c = 2;
                                                                                            hlbVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i3 = 1;
                                                                                            hlbVar.n = 1;
                                                                                            c = 2;
                                                                                            break;
                                                                                        default:
                                                                                            d43.c();
                                                                                            return;
                                                                                    }
                                                                                    String strGroup10 = matcher.group(i3);
                                                                                    strGroup10.getClass();
                                                                                    hlbVar.o = Float.parseFloat(strGroup10);
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(string)) {
                                                                            i4 = 1;
                                                                            hlbVar.l = 1;
                                                                        }
                                                                        i3 = 1;
                                                                    } else if ("over".equals(string)) {
                                                                        hlbVar.p = 1;
                                                                    } else if ("under".equals(string)) {
                                                                        hlbVar.p = 2;
                                                                        c = 2;
                                                                        i3 = 1;
                                                                    } else {
                                                                        i3 = 1;
                                                                    }
                                                                }
                                                                i3 = i4;
                                                            } else {
                                                                i3 = 1;
                                                            }
                                                            c = 2;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i8;
                                                    c = c2;
                                                }
                                            } else {
                                                i3 = i8;
                                                c = c2;
                                            }
                                            i8 = i3;
                                            c2 = c;
                                            i16 = i18;
                                            i5 = 0;
                                        }
                                        int i21 = i8;
                                        char c3 = c2;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(hlbVar);
                                        }
                                        i8 = i21;
                                        c2 = c3;
                                        i5 = 0;
                                        i6 = -1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = klb.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = pt7Var.n(charset);
                                if (strN2 == null) {
                                    ilbVarD = null;
                                } else {
                                    Pattern pattern2 = klb.a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        ilbVarD = klb.d(null, matcher3, pt7Var, arrayList);
                                    } else {
                                        ilbVarD = null;
                                        String strN3 = pt7Var.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                ilbVarD = klb.d(strN2.trim(), matcher4, pt7Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (ilbVarD != null) {
                                    arrayList2.add(ilbVarD);
                                }
                            }
                            mlbVar = this;
                        }
                    }
                }
            }
        } catch (ut7 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
