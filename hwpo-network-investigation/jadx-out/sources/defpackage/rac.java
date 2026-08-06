package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rac extends ResultReceiver {
    public final /* synthetic */ t9a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rac(Handler handler, t9a t9aVar) {
        super(handler);
        this.t = t9aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.t.d(null);
    }
}
