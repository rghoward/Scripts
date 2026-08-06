package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c23<T> extends i59<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(c23.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public c23() {
        throw null;
    }

    @Override // defpackage.i59, defpackage.ll5
    public final void r(Object obj) {
        s(obj);
    }

    @Override // defpackage.i59, defpackage.ll5
    public final void s(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = z;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    b23.e(th0.e(this.y), lp1.b(obj));
                    return;
                } else {
                    aa0.c("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
