package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d33 implements e33 {
    public final ScheduledFuture t;

    public d33(ScheduledFuture scheduledFuture) {
        this.t = scheduledFuture;
    }

    @Override // defpackage.e33
    public final void dispose() {
        this.t.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.t + ']';
    }
}
