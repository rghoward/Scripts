package defpackage;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s50 implements l5a {
    public final /* synthetic */ int t;

    public /* synthetic */ s50(int i) {
        this.t = i;
    }

    @Override // defpackage.l5a
    public final Object get() {
        return new HandlerThread(u50.u(this.t, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }
}
