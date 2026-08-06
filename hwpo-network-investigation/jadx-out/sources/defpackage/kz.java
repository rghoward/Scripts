package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kz extends nq2 {
    public final /* synthetic */ gz a;

    public kz(gz gzVar) {
        this.a = gzVar;
    }

    @Override // defpackage.nq2, defpackage.hib
    public final void a() {
        gz gzVar = this.a;
        gzVar.O.setVisibility(0);
        if (gzVar.O.getParent() instanceof View) {
            View view = (View) gzVar.O.getParent();
            WeakHashMap<View, fib> weakHashMap = egb.a;
            view.requestApplyInsets();
        }
    }

    @Override // defpackage.hib
    public final void b() {
        gz gzVar = this.a;
        gzVar.O.setAlpha(1.0f);
        gzVar.R.d(null);
        gzVar.R = null;
    }
}
