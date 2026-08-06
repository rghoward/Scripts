package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wj6 implements View.OnClickListener {
    public final /* synthetic */ rj6 t;

    public wj6(rj6 rj6Var) {
        this.t = rj6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rj6 rj6Var = this.t;
        rj6.e eVar = rj6Var.z;
        rj6.e eVar2 = rj6.e.t;
        rj6.e eVar3 = rj6.e.u;
        if (eVar == eVar3) {
            rj6Var.l(eVar2);
        } else if (eVar == eVar2) {
            rj6Var.l(eVar3);
        }
        rj6Var.m(rj6Var.getView());
    }
}
