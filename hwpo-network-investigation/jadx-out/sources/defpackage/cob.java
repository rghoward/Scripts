package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cob extends ContentObserver {
    public final /* synthetic */ zx0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cob(zx0 zx0Var, Handler handler) {
        super(handler);
        this.a = zx0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.n(g2b.a);
    }
}
