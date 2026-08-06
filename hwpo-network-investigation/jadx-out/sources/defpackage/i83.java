package defpackage;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface i83 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends IOException {
        public final int t;

        public a(Throwable th, int i) {
            super(th);
            this.t = i;
        }
    }

    UUID a();

    default boolean b() {
        return false;
    }

    void c(j83.a aVar);

    void d(j83.a aVar);

    boolean e(String str);

    a f();

    ih4 g();

    int getState();
}
