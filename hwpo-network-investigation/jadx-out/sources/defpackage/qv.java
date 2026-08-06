package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable t;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.t.run();
    }
}
