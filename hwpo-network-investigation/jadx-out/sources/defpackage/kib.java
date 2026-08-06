package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kib implements oh4<Throwable, g2b> {
    public final /* synthetic */ mib<View> t;
    public final /* synthetic */ ViewTreeObserver u;
    public final /* synthetic */ lib v;

    public kib(mib<View> mibVar, ViewTreeObserver viewTreeObserver, lib libVar) {
        this.t = mibVar;
        this.u = viewTreeObserver;
        this.v = libVar;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) {
        this.t.d(this.u, this.v);
        return g2b.a;
    }
}
