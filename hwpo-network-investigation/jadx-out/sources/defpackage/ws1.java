package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ws1 extends wp5 implements oh4<Throwable, g2b> {
    public final /* synthetic */ CancellationSignal u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws1(CancellationSignal cancellationSignal) {
        super(1);
        this.u = cancellationSignal;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) {
        if (th != null) {
            this.u.cancel();
        }
        return g2b.a;
    }
}
