package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0a extends u2<a0a<?>> {
    public final AtomicReference<Object> a = new AtomicReference<>(null);

    @Override // defpackage.u2
    public final boolean a(s2 s2Var) {
        AtomicReference<Object> atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(b0a.t);
        return true;
    }

    @Override // defpackage.u2
    public final r02[] b(s2 s2Var) {
        this.a.set(null);
        return t2.t;
    }
}
