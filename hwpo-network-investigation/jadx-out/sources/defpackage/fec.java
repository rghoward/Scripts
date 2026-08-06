package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fec extends bec {
    public final /* synthetic */ Activity x;
    public final /* synthetic */ lec y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fec(lec lecVar, Activity activity) {
        super(lecVar.t, true);
        this.x = activity;
        this.y = lecVar;
    }

    @Override // defpackage.bec
    public final void a() {
        lbc lbcVar = this.y.t.f;
        a78.g(lbcVar);
        lbcVar.onActivityResumedByScionActivityInfo(lcc.j(this.x), this.u);
    }
}
