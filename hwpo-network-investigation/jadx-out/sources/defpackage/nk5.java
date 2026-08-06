package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nk5 extends kl5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(nk5.class, "_invoked$volatile");
    public final jl5 A;
    private volatile /* synthetic */ int _invoked$volatile;

    public nk5(jl5 jl5Var) {
        this.A = jl5Var;
    }

    @Override // defpackage.kl5
    public final boolean q() {
        return true;
    }

    @Override // defpackage.kl5
    public final void r(Throwable th) {
        if (B.compareAndSet(this, 0, 1)) {
            this.A.invoke(th);
        }
    }
}
