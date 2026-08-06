package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum gf8 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    public static final a u = new a();
    public final String t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static gf8 a(String str) throws IOException {
            if (str.equals("http/1.0")) {
                return gf8.HTTP_1_0;
            }
            if (str.equals("http/1.1")) {
                return gf8.HTTP_1_1;
            }
            if (str.equals("h2_prior_knowledge")) {
                return gf8.H2_PRIOR_KNOWLEDGE;
            }
            if (str.equals("h2")) {
                return gf8.HTTP_2;
            }
            if (str.equals("spdy/3.1")) {
                return gf8.SPDY_3;
            }
            if (str.equals("quic")) {
                return gf8.QUIC;
            }
            if (w2a.n(str, "h3", false)) {
                return gf8.HTTP_3;
            }
            o03.a("Unexpected protocol: ".concat(str));
            return null;
        }
    }

    gf8(String str) {
        this.t = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.t;
    }
}
