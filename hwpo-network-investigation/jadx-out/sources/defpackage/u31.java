package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u31 implements v31 {
    public final ScheduledFuture t;

    public u31(ScheduledFuture scheduledFuture) {
        this.t = scheduledFuture;
    }

    @Override // defpackage.v31
    public final void c(Throwable th) {
        this.t.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.t + ']';
    }
}
