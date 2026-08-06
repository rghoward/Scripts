package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i8c implements Iterable, a8c {
    public final String t;

    public i8c(String str) {
        if (str != null) {
            this.t = str;
        } else {
            z90.a("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.a8c
    public final String c() {
        return this.t;
    }

    @Override // defpackage.a8c
    public final Double d() {
        String str = this.t;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.a8c
    public final Boolean e() {
        return Boolean.valueOf(!this.t.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i8c) {
            return this.t.equals(((i8c) obj).t);
        }
        return false;
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return new e8c(this);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g8c(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02d3 A[PHI: r8
      0x02d3: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02bf, B:101:0x02c1, B:103:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        cgc cgcVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                z90.a(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strC = "undefined";
        String str3 = this.t;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    gic.a(1, "hasOwnProperty", arrayList);
                    a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0));
                    boolean zEquals = "length".equals(a8cVarB.c());
                    b3c b3cVar = a8c.q;
                    if (zEquals) {
                        return b3cVar;
                    }
                    double dDoubleValue = a8cVarB.d().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? a8c.r : b3cVar;
                }
                z90.a("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    gic.a(0, "toString", arrayList);
                    return this;
                }
                z90.a("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    gic.a(0, "toLocaleLowerCase", arrayList);
                    return new i8c(str3.toLowerCase());
                }
                z90.a("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    gic.c("charAt", 1, arrayList);
                    int iH = arrayList.isEmpty() ? 0 : (int) gic.h(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue());
                    return (iH < 0 || iH >= str3.length()) ? a8c.s : new i8c(String.valueOf(str3.charAt(iH)));
                }
                z90.a("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(cgcVar.b.b(cgcVar, (a8c) arrayList.get(i4)).c());
                        }
                        return new i8c(sb.toString());
                    }
                    return this;
                }
                z90.a("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    gic.a(0, "toLowerCase", arrayList);
                    return new i8c(str3.toLowerCase(Locale.ENGLISH));
                }
                z90.a("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    gic.c("search", 1, arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c()).matcher(str3);
                    return matcher.find() ? new d5c(Double.valueOf(matcher.start())) : new d5c(Double.valueOf(-1.0d));
                }
                z90.a("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    gic.a(0, "toLocaleUpperCase", arrayList);
                    return new i8c(str3.toUpperCase());
                }
                z90.a("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    gic.c("lastIndexOf", 2, arrayList);
                    String strC2 = arrayList.size() > 0 ? cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue();
                    return new d5c(Double.valueOf(str3.lastIndexOf(strC2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : gic.h(dDoubleValue2)))));
                }
                z90.a("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    gic.a(0, "toUpperCase", arrayList);
                    return new i8c(str3.toUpperCase(Locale.ENGLISH));
                }
                z90.a("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    gic.a(0, "toUpperCase", arrayList);
                    return new i8c(str3.trim());
                }
                z90.a("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    gic.c("match", 1, arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? BuildConfig.FLAVOR : cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c()).matcher(str3);
                    return matcher2.find() ? new a2c(Arrays.asList(new i8c(matcher2.group()))) : a8c.m;
                }
                z90.a("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    gic.c("slice", 2, arrayList);
                    double dH = gic.h(!arrayList.isEmpty() ? cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue() : 0.0d);
                    double dMax = dH < 0.0d ? Math.max(((double) str3.length()) + dH, 0.0d) : Math.min(dH, str3.length());
                    double dH2 = gic.h(arrayList.size() > 1 ? cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new i8c(str3.substring(i5, Math.max(0, ((int) (dH2 < 0.0d ? Math.max(((double) str3.length()) + dH2, 0.0d) : Math.min(dH2, str3.length()))) - i5) + i5));
                }
                z90.a("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    gic.c("split", 2, arrayList);
                    if (str3.length() == 0) {
                        return new a2c(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strC3 = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c();
                        long jG = arrayList.size() > 1 ? ((long) gic.g(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue())) & 4294967295L : 2147483647L;
                        if (jG == 0) {
                            return new a2c();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strC3), ((int) jG) + 1);
                        int length = strArrSplit.length;
                        if (!strC3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jG) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new i8c(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new a2c(arrayList2);
                }
                z90.a("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    gic.c("substring", 2, arrayList);
                    int iH2 = !arrayList.isEmpty() ? (int) gic.h(cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).d().doubleValue()) : 0;
                    int iH3 = arrayList.size() > 1 ? (int) gic.h(cgcVar.b.b(cgcVar, (a8c) arrayList.get(1)).d().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iH2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iH3, 0), str3.length());
                    return new i8c(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                z90.a("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    gic.c("replace", 2, arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    a8c a8cVarA = a8c.l;
                    if (!zIsEmpty2) {
                        strC = cgcVar.b.b(cgcVar, (a8c) arrayList.get(0)).c();
                        if (arrayList.size() > 1) {
                            a8cVarA = cgcVar.b.b(cgcVar, (a8c) arrayList.get(1));
                        }
                    }
                    String str4 = strC;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (a8cVarA instanceof g6c) {
                            a8cVarA = ((g6c) a8cVarA).a(cgcVar, Arrays.asList(new i8c(str4), new d5c(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strC4 = a8cVarA.c();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new i8c(w27.a(new StringBuilder(strSubstring.length() + String.valueOf(strC4).length() + strSubstring2.length()), strSubstring, strC4, strSubstring2));
                    }
                    return this;
                }
                z90.a("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    gic.c("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        cgcVar2 = cgcVar;
                    } else {
                        cgcVar2 = cgcVar;
                        strC = cgcVar2.b.b(cgcVar2, (a8c) arrayList.get(0)).c();
                    }
                    return new d5c(Double.valueOf(str3.indexOf(strC, (int) gic.h(arrayList.size() < 2 ? 0.0d : cgcVar2.b.b(cgcVar2, (a8c) arrayList.get(1)).d().doubleValue()))));
                }
                z90.a("Command not supported");
                return null;
            default:
                z90.a("Command not supported");
                return null;
        }
    }

    @Override // defpackage.a8c
    public final a8c n() {
        return new i8c(this.t);
    }

    public final String toString() {
        String str = this.t;
        return w27.a(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
