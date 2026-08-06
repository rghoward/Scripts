package defpackage;

import com.intercom.twig.BuildConfig;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1a {
    public final gf8 a;
    public final int b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static d1a a(String str) throws ProtocolException {
            int i;
            String strSubstring;
            boolean zN = w2a.n(str, "HTTP/1.", false);
            gf8 gf8Var = gf8.HTTP_1_0;
            gf8 gf8Var2 = gf8.HTTP_1_1;
            if (zN) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt != 0) {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    gf8Var = gf8Var2;
                }
            } else if (w2a.n(str, "ICY ", false)) {
                i = 4;
            } else {
                if (!w2a.n(str, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                i = 12;
                gf8Var = gf8Var2;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            Integer numF = v2a.f(str.substring(i, i2));
            if (numF == null) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iIntValue = numF.intValue();
            if (str.length() <= i2) {
                strSubstring = BuildConfig.FLAVOR;
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new d1a(gf8Var, iIntValue, strSubstring);
        }
    }

    public d1a(gf8 gf8Var, int i, String str) {
        this.a = gf8Var;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == gf8.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
