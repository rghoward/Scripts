package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xb7 extends y0 implements el5 {
    public static final xb7 u = new xb7(el5.a.t);

    @Override // defpackage.el5
    @gy2
    public final e33 E(boolean z, boolean z2, jl5 jl5Var) {
        return yb7.t;
    }

    @Override // defpackage.el5
    @gy2
    public final CancellationException H() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.el5
    public final boolean h() {
        return true;
    }

    @Override // defpackage.el5
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.el5
    @gy2
    public final e33 j0(oh4<? super Throwable, g2b> oh4Var) {
        return yb7.t;
    }

    @Override // defpackage.el5
    @gy2
    public final Object p0(u02 u02Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.el5
    @gy2
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.el5
    @gy2
    public final ac1 y(ll5 ll5Var) {
        return yb7.t;
    }

    @Override // defpackage.el5
    @gy2
    public final void k(CancellationException cancellationException) {
    }
}
