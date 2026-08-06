package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wq6 {
    public static final ol8 e = new ol8("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final ol8 f = new ol8(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static wq6 a(String str) {
            str.getClass();
            aj6 aj6VarA = wq6.e.a(0, str);
            if (aj6VarA == null) {
                z90.a(eca.a('\"', "No subtype found for: \"", str));
                return null;
            }
            if (aj6VarA.d == null) {
                aj6VarA.d = new yi6(aj6VarA);
            }
            yi6 yi6Var = aj6VarA.d;
            yi6Var.getClass();
            String str2 = (String) yi6Var.get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            if (aj6VarA.d == null) {
                aj6VarA.d = new yi6(aj6VarA);
            }
            yi6 yi6Var2 = aj6VarA.d;
            yi6Var2.getClass();
            String lowerCase2 = ((String) yi6Var2.get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int i = aj6VarA.a().u;
            while (true) {
                int i2 = i + 1;
                if (i2 >= str.length()) {
                    return new wq6(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                aj6 aj6VarA2 = wq6.f.a(i2, str);
                if (aj6VarA2 == null) {
                    v92.c("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                    return null;
                }
                aj6.a aVar = aj6VarA2.c;
                xi6 xi6VarE = aVar.e(1);
                String str3 = xi6VarE != null ? xi6VarE.a : null;
                if (str3 == null) {
                    i = aj6VarA2.a().u;
                } else {
                    xi6 xi6VarE2 = aVar.e(2);
                    String strSubstring = xi6VarE2 != null ? xi6VarE2.a : null;
                    if (strSubstring == null) {
                        xi6 xi6VarE3 = aVar.e(3);
                        xi6VarE3.getClass();
                        strSubstring = xi6VarE3.a;
                    } else if (z2a.K(strSubstring, '\'') && z2a.q(strSubstring, '\'') && strSubstring.length() > 2) {
                        strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                    }
                    arrayList.add(str3);
                    arrayList.add(strSubstring);
                    i = aj6VarA2.a().u;
                }
            }
        }
    }

    public wq6(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public static Charset a(wq6 wq6Var) {
        String str;
        String[] strArr = wq6Var.d;
        int i = 0;
        int iA = ie3.a(0, strArr.length - 1, 2);
        if (iA < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!w2a.i(strArr[i], "charset", true)) {
                if (i == iA) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wq6) && xj5.a(((wq6) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
