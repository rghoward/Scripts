package defpackage;

import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 implements oh4<vz7, g2b> {
    public final /* synthetic */ am1 t;

    public dm1(am1 am1Var) {
        this.t = am1Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(vz7 vz7Var) {
        vz7 vz7Var2 = vz7Var;
        am1.a aVar = am1.Companion;
        boolean z = vz7Var2.b;
        final am1 am1Var = this.t;
        if (z) {
            PlaceHolder placeHolder = am1Var.r().h;
            placeHolder.setTitle(vz7Var2.d);
            placeHolder.q(vz7Var2.e);
            placeHolder.p(vz7Var2.f, vz7Var2.c);
            placeHolder.i(new mh4() { // from class: tl1
                @Override // defpackage.mh4
                public final Object invoke() {
                    am1.a aVar2 = am1.Companion;
                    qn1 qn1VarS = am1Var.s();
                    oy0.d(rhb.b(qn1VarS), null, null, new go1(qn1VarS, null), 3);
                    return g2b.a;
                }
            });
            PlaceHolder.r(placeHolder);
        } else {
            PlaceHolder.h(am1Var.r().h);
        }
        return g2b.a;
    }
}
