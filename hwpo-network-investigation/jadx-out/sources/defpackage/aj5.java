package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class aj5 {
    public static final js7<Charset, wq6> a(wq6 wq6Var) {
        Charset charset = ua1.b;
        if (wq6Var != null) {
            Charset charsetA = wq6.a(wq6Var);
            if (charsetA == null) {
                try {
                    wq6Var = wq6.a.a(wq6Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    wq6Var = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return new js7<>(charset, wq6Var);
    }
}
