package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pyb extends tyb {
    public static final pyb b = new pyb(uyb.a);
    public final AtomicReference a;

    public pyb(tyb tybVar) {
        this.a = new AtomicReference(tybVar);
    }

    @Override // defpackage.tyb
    public final void a(String str, Level level, boolean z) {
        ((tyb) this.a.get()).a(str, level, z);
    }

    @Override // defpackage.tyb
    public final gzb b() {
        return ((tyb) this.a.get()).b();
    }

    @Override // defpackage.tyb
    public final ln4 c() {
        return ((tyb) this.a.get()).c();
    }
}
