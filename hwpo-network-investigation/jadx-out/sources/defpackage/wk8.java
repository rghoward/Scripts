package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wk8 extends wp5 implements mh4<g2b> {
    public final /* synthetic */ xk8 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk8(xk8 xk8Var) {
        super(0);
        this.u = xk8Var;
    }

    @Override // defpackage.mh4
    public final g2b invoke() {
        xk8 xk8Var = this.u;
        xk8Var.h = null;
        Trace.beginSection("OnPositionedDispatch");
        try {
            xk8Var.a();
            g2b g2bVar = g2b.a;
            return g2b.a;
        } finally {
            Trace.endSection();
        }
    }
}
