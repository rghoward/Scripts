package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i3d implements i2d {
    public boolean a;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.i2d
    public final Object a(h2d h2dVar) throws IOException {
        if (this.a) {
            if (h2dVar.b.isEmpty()) {
                return h2dVar.a.d(h2dVar.d);
            }
            throw new c3d("Short circuit would skip transforms.");
        }
        Closeable closeableC = mp0.c(h2dVar);
        try {
            if (!(closeableC instanceof y2d)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((y2d) closeableC).a();
            if (closeableC != null) {
                closeableC.close();
            }
            return fileA;
        } catch (Throwable th) {
            if (closeableC != null) {
                try {
                    closeableC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
