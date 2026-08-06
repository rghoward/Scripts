package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u45 {
    static {
        g01 g01Var = g01.w;
        g01.a.c("\"\\");
        g01.a.c("\t ,=");
    }

    public static final boolean a(qu8 qu8Var) {
        if (xj5.a(qu8Var.t.b, "HEAD")) {
            return false;
        }
        int i = qu8Var.w;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || ytb.e(qu8Var) != -1) {
            return true;
        }
        String strD = qu8Var.y.d("Transfer-Encoding");
        if (strD == null) {
            strD = null;
        }
        return "chunked".equalsIgnoreCase(strD);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:18:0x0072  */
    public static final void b(i52 i52Var, f55 f55Var, nu4 nu4Var) {
        List listUnmodifiableList;
        h52 h52Var;
        h52 h52Var2;
        String strSubstring;
        i52Var.getClass();
        f55Var.getClass();
        nu4Var.getClass();
        if (i52Var == i52.a) {
            return;
        }
        Pattern pattern = h52.k;
        List<String> listK = nu4Var.k("Set-Cookie");
        int size = listK.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = listK.get(i);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int iG = vtb.g(str, ';', 0, 0, 6);
            char c2 = '=';
            int iG2 = vtb.g(str, '=', 0, iG, 2);
            if (iG2 == iG) {
                h52Var = null;
            } else {
                int iJ = vtb.j(0, iG2, str);
                String strSubstring2 = str.substring(iJ, vtb.k(iJ, iG2, str));
                if (strSubstring2.length() != 0 && vtb.i(strSubstring2) == -1) {
                    int iJ2 = vtb.j(iG2 + 1, iG, str);
                    String strSubstring3 = str.substring(iJ2, vtb.k(iJ2, iG, str));
                    if (vtb.i(strSubstring3) == -1) {
                        int i2 = iG + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jB = 253402300799999L;
                        String str2 = null;
                        String str3 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        String str4 = null;
                        while (true) {
                            if (i2 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                        j = j3;
                                    }
                                } else {
                                    j = jB;
                                }
                                String str5 = f55Var.d;
                                if (str2 != null) {
                                    if (!xj5.a(str5, str2) && (!w2a.h(str5, str2, false) || str5.charAt((str5.length() - str2.length()) - 1) != '.' || stb.a.c(str5))) {
                                        h52Var2 = null;
                                    }
                                    h52Var = h52Var2;
                                    break;
                                }
                                str2 = str5;
                                if (str5.length() == str2.length() || PublicSuffixDatabase.d.a(str2) != null) {
                                    String strSubstring4 = AgentHeaderCreator.AGENT_DIVIDER;
                                    if (str3 == null || !w2a.n(str3, AgentHeaderCreator.AGENT_DIVIDER, false)) {
                                        String strB = f55Var.b();
                                        int iY = z2a.y(strB, '/', 0, 6);
                                        if (iY != 0) {
                                            strSubstring4 = strB.substring(0, iY);
                                        }
                                        str3 = strSubstring4;
                                    }
                                    h52Var2 = new h52(strSubstring2, strSubstring3, j, str2, str3, z, z2, z3, z4, str4);
                                } else {
                                    h52Var2 = null;
                                }
                                h52Var = h52Var2;
                                break;
                            }
                            int iF = vtb.f(str, c, i2, length);
                            int iF2 = vtb.f(str, c2, i2, iF);
                            int iJ3 = vtb.j(i2, iF2, str);
                            String strSubstring5 = str.substring(iJ3, vtb.k(iJ3, iF2, str));
                            if (iF2 < iF) {
                                int iJ4 = vtb.j(iF2 + 1, iF, str);
                                strSubstring = str.substring(iJ4, vtb.k(iJ4, iF, str));
                            } else {
                                strSubstring = BuildConfig.FLAVOR;
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    jB = h52.a.b(strSubstring.length(), strSubstring);
                                    z3 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    j2 = Long.parseLong(strSubstring);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    patternCompile.getClass();
                                    if (!patternCompile.matcher(strSubstring).matches()) {
                                        throw e;
                                    }
                                    j2 = w2a.n(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z3 = true;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (w2a.h(strSubstring, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strB2 = stb.b(z2a.C(strSubstring, "."));
                                if (strB2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strB2;
                                z4 = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                str3 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                z = true;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                z2 = true;
                            } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                str4 = strSubstring;
                            }
                            i2 = iF + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        h52Var = null;
                    }
                } else {
                    h52Var = null;
                }
            }
            if (h52Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(h52Var);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = hf3.t;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        f55Var.getClass();
    }
}
