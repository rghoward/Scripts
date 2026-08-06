package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ag4 implements g76 {
    public final /* synthetic */ Handler t;
    public final /* synthetic */ zf4 u;

    public ag4(Handler handler, zf4 zf4Var) {
        this.t = handler;
        this.u = zf4Var;
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        if (aVar == s66.a.ON_DESTROY) {
            this.t.removeCallbacks(this.u);
            m76Var.getLifecycle().c(this);
        }
    }
}
