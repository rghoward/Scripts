package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jz implements Runnable {
    public final /* synthetic */ gz t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends nq2 {
        public a() {
        }

        @Override // defpackage.nq2, defpackage.hib
        public final void a() {
            jz.this.t.O.setVisibility(0);
        }

        @Override // defpackage.hib
        public final void b() {
            gz gzVar = jz.this.t;
            gzVar.O.setAlpha(1.0f);
            gzVar.R.d(null);
            gzVar.R = null;
        }
    }

    public jz(gz gzVar) {
        this.t = gzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        gz gzVar = this.t;
        gzVar.P.showAtLocation(gzVar.O, 55, 0, 0);
        fib fibVar = gzVar.R;
        if (fibVar != null) {
            fibVar.b();
        }
        if (!gzVar.T || (viewGroup = gzVar.U) == null || !viewGroup.isLaidOut()) {
            gzVar.O.setAlpha(1.0f);
            gzVar.O.setVisibility(0);
            return;
        }
        gzVar.O.setAlpha(0.0f);
        fib fibVarB = egb.b(gzVar.O);
        fibVarB.a(1.0f);
        gzVar.R = fibVarB;
        fibVarB.d(new a());
    }
}
