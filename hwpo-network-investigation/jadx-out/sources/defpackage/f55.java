package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.transport.Defaults;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f55 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List<String> g;
    public final String h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public String a;
        public String d;
        public ArrayList g;
        public String h;
        public String b = BuildConfig.FLAVOR;
        public String c = BuildConfig.FLAVOR;
        public int e = -1;
        public final ArrayList f = ws0.j(BuildConfig.FLAVOR);

        public static ArrayList f(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iT = z2a.t(str, '&', i, 4);
                if (iT == -1) {
                    iT = str.length();
                }
                int iT2 = z2a.t(str, '=', i, 4);
                if (iT2 == -1 || iT2 > iT) {
                    arrayList.add(str.substring(i, iT));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, iT2));
                    arrayList.add(str.substring(iT2 + 1, iT));
                }
                i = iT + 1;
            }
            return arrayList;
        }

        public final f55 a() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                aa0.c("scheme == null");
                return null;
            }
            String strD = utb.d(0, 0, 7, this.b);
            String strD2 = utb.d(0, 0, 7, this.c);
            String str2 = this.d;
            if (str2 == null) {
                aa0.c("host == null");
                return null;
            }
            int iB = b();
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(ph1.n(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList3.add(utb.d(0, 0, 7, (String) obj));
            }
            ArrayList arrayList4 = this.g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(ph1.n(arrayList4, 10));
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    String str3 = (String) obj2;
                    arrayList.add(str3 != null ? utb.d(0, 0, 3, str3) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.h;
            return new f55(str, strD, strD2, str2, iB, arrayList3, arrayList, str4 != null ? utb.d(0, 0, 7, str4) : null, toString());
        }

        public final int b() {
            int i = this.e;
            if (i != -1) {
                return i;
            }
            String str = this.a;
            str.getClass();
            if (str.equals("http")) {
                return 80;
            }
            if (str.equals("https")) {
                return Defaults.TLS_PORT;
            }
            return -1;
        }

        public final void c(String str) {
            str.getClass();
            String strB = stb.b(utb.d(0, 0, 7, str));
            if (strB != null) {
                this.d = strB;
            } else {
                z90.a("unexpected host: ".concat(str));
            }
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0028  */
        public final void d(f55 f55Var, String str) {
            int i;
            int i2;
            int iE;
            int i3;
            int i4;
            char cCharAt;
            str.getClass();
            byte[] bArr = vtb.a;
            int iJ = vtb.j(0, str.length(), str);
            int iK = vtb.k(iJ, str.length(), str);
            byte b = -1;
            if (iK - iJ >= 2) {
                char cCharAt2 = str.charAt(iJ);
                if ((xj5.b(cCharAt2, 97) >= 0 && xj5.b(cCharAt2, 122) <= 0) || (xj5.b(cCharAt2, 65) >= 0 && xj5.b(cCharAt2, 90) <= 0)) {
                    i = iJ + 1;
                    while (true) {
                        if (i < iK) {
                            char cCharAt3 = str.charAt(i);
                            if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                                if (cCharAt3 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            }
                            i++;
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            int i5 = 1;
            if (i != -1) {
                if (w2a.m(str, "https:", iJ, true)) {
                    this.a = "https";
                    iJ += 6;
                } else {
                    if (!w2a.m(str, "http:", iJ, true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                    }
                    this.a = "http";
                    iJ += 5;
                }
            } else {
                if (f55Var == null) {
                    z90.a("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? a3a.U(6, str).concat("...") : str));
                    return;
                }
                this.a = f55Var.a;
            }
            int i6 = iJ;
            int i7 = 0;
            while (true) {
                i2 = i5;
                if (i6 >= iK || !((cCharAt = str.charAt(i6)) == '/' || cCharAt == '\\')) {
                    break;
                }
                i7++;
                i6++;
                i5 = i2;
            }
            ArrayList arrayList = this.f;
            byte b2 = 35;
            if (i7 >= 2 || f55Var == null || !xj5.a(f55Var.a, this.a)) {
                int i8 = iJ + i7;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    iE = vtb.e(i8, iK, str, "@/\\?#");
                    byte bCharAt = iE != iK ? str.charAt(iE) : b;
                    if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (i9 == 0) {
                            int iF = vtb.f(str, ':', i8, iE);
                            String strA = utb.a(i8, iF, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                            if (i10 != 0) {
                                strA = w27.a(new StringBuilder(), this.b, "%40", strA);
                            }
                            this.b = strA;
                            if (iF != iE) {
                                this.c = utb.a(iF + 1, iE, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                                i9 = i2;
                            }
                            i10 = i2;
                        } else {
                            this.c += "%40" + utb.a(i8, iE, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                        }
                        i8 = iE + 1;
                        b2 = 35;
                        b = -1;
                    }
                }
                int i11 = i8;
                while (true) {
                    if (i11 < iE) {
                        char cCharAt4 = str.charAt(i11);
                        if (cCharAt4 == ':') {
                            break;
                        }
                        if (cCharAt4 == '[') {
                            do {
                                i11++;
                                if (i11 >= iE) {
                                    break;
                                }
                            } while (str.charAt(i11) != ']');
                        }
                        i11++;
                    } else {
                        i11 = iE;
                        break;
                    }
                }
                int i12 = i11 + 1;
                if (i12 < iE) {
                    this.d = stb.b(utb.d(i8, i11, 4, str));
                    try {
                        i4 = Integer.parseInt(utb.a(i12, iE, 120, str, BuildConfig.FLAVOR));
                        if (i2 > i4 || i4 >= 65536) {
                            i4 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.e = i4;
                    if (i4 == -1) {
                        e55.c("Invalid URL port: \"", str.substring(i12, iE), 34);
                        return;
                    }
                } else {
                    this.d = stb.b(utb.d(i8, i11, 4, str));
                    String str2 = this.a;
                    str2.getClass();
                    if (str2.equals("http")) {
                        i3 = 80;
                    } else {
                        i3 = str2.equals("https") ? Defaults.TLS_PORT : -1;
                    }
                    this.e = i3;
                }
                if (this.d == null) {
                    e55.c("Invalid URL host: \"", str.substring(i8, i11), 34);
                    return;
                }
                iJ = iE;
            } else {
                this.b = f55Var.e();
                this.c = f55Var.a();
                this.d = f55Var.d;
                this.e = f55Var.e;
                arrayList.clear();
                arrayList.addAll(f55Var.c());
                if (iJ == iK || str.charAt(iJ) == '#') {
                    String strD = f55Var.d();
                    this.g = strD != null ? f(utb.a(0, 0, 83, strD, " \"'<>#")) : null;
                }
            }
            int iE2 = vtb.e(iJ, iK, str, "?#");
            if (iJ != iE2) {
                char cCharAt5 = str.charAt(iJ);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList.clear();
                    arrayList.add(BuildConfig.FLAVOR);
                    iJ++;
                } else {
                    arrayList.set(arrayList.size() - 1, BuildConfig.FLAVOR);
                }
                while (iJ < iE2) {
                    int iE3 = vtb.e(iJ, iE2, str, "/\\");
                    boolean z = iE3 < iE2;
                    String strA2 = utb.a(iJ, iE3, 112, str, " \"<>^`{}|/\\?#");
                    if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                        if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                            if (((CharSequence) p51.b(1, arrayList)).length() == 0) {
                                arrayList.set(arrayList.size() - 1, strA2);
                            } else {
                                arrayList.add(strA2);
                            }
                            if (z) {
                                arrayList.add(BuildConfig.FLAVOR);
                            }
                        } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                            arrayList.add(BuildConfig.FLAVOR);
                        } else {
                            arrayList.set(arrayList.size() - 1, BuildConfig.FLAVOR);
                        }
                    }
                    iJ = z ? iE3 + 1 : iE3;
                }
            }
            if (iE2 < iK && str.charAt(iE2) == '?') {
                int iF2 = vtb.f(str, '#', iE2, iK);
                this.g = f(utb.a(iE2 + 1, iF2, 80, str, " \"'<>#"));
                iE2 = iF2;
            }
            if (iE2 >= iK || str.charAt(iE2) != '#') {
                return;
            }
            this.h = utb.a(iE2 + 1, iK, 48, str, BuildConfig.FLAVOR);
        }

        public final void e(int i) {
            if (1 > i || i >= 65536) {
                ca0.a(pp2.a(i, "unexpected port: "));
            } else {
                this.e = i;
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x008b  */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.b.length() > 0 || this.c.length() > 0) {
                sb.append(this.b);
                if (this.c.length() > 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (z2a.p(str2, ':')) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i = -1;
            if (this.e != -1 || this.a != null) {
                int iB = b();
                String str3 = this.a;
                if (str3 == null) {
                    sb.append(':');
                    sb.append(iB);
                } else {
                    if (str3.equals("http")) {
                        i = 80;
                    } else if (str3.equals("https")) {
                        i = Defaults.TLS_PORT;
                    }
                    if (iB != i) {
                        sb.append(':');
                        sb.append(iB);
                    }
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (this.g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.g;
                arrayList2.getClass();
                b.a(arrayList2, sb);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final void a(List list, StringBuilder sb) {
            dg5 dg5VarI = uh8.i(uh8.j(0, list.size()), 2);
            int i = dg5VarI.t;
            int i2 = dg5VarI.u;
            int i3 = dg5VarI.v;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }
    }

    public f55() {
        throw null;
    }

    public f55(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(z2a.t(str, ':', length, 4) + 1, z2a.t(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iT = z2a.t(str, '/', length, 4);
        return str.substring(iT, vtb.e(iT, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iT = z2a.t(str, '/', length, 4);
        int iE = vtb.e(iT, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iT < iE) {
            int i = iT + 1;
            int iF = vtb.f(str, '/', i, iE);
            arrayList.add(str.substring(i, iF));
            iT = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iT = z2a.t(str, '?', 0, 6) + 1;
        return str.substring(iT, vtb.f(str, '#', iT, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, vtb.e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f55) && xj5.a(((f55) obj).i, this.i);
    }

    public final boolean f() {
        return xj5.a(this.a, "https");
    }

    public final a g() {
        int i;
        a aVar = new a();
        String str = this.a;
        aVar.a = str;
        aVar.b = e();
        aVar.c = a();
        aVar.d = this.d;
        str.getClass();
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals("https") ? Defaults.TLS_PORT : -1;
        }
        int i2 = this.e;
        aVar.e = i2 != i ? i2 : -1;
        ArrayList arrayList = aVar.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        aVar.g = strD != null ? a.f(utb.a(0, 0, 83, strD, " \"'<>#")) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(z2a.t(str2, '#', 0, 6) + 1);
        }
        aVar.h = strSubstring;
        return aVar;
    }

    public final String h() {
        a aVar;
        try {
            aVar = new a();
            aVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        aVar.getClass();
        aVar.b = utb.a(0, 0, 123, BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#");
        aVar.c = utb.a(0, 0, 123, BuildConfig.FLAVOR, " \"':;<=>@[]^`{}|/\\?#");
        return aVar.a().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        String strReplaceAll;
        a aVarG = g();
        ArrayList arrayList = aVarG.f;
        String str = aVarG.d;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll(BuildConfig.FLAVOR);
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        aVarG.d = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, utb.a(0, 0, 99, (String) arrayList.get(i), "[]"));
        }
        ArrayList arrayList2 = aVarG.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? utb.a(0, 0, 67, str2, "\\^`{|}") : null);
            }
        }
        String str3 = aVarG.h;
        aVarG.h = str3 != null ? utb.a(0, 0, 35, str3, " \"#<>\\^`{|}") : null;
        String string = aVarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll(BuildConfig.FLAVOR);
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                d55.a(e);
                return null;
            }
        }
    }

    public final URL j() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            d55.a(e);
            return null;
        }
    }

    public final String toString() {
        return this.i;
    }
}
