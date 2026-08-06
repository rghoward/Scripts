package defpackage;

import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ul2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ hk0 u;

    public /* synthetic */ ul2(hk0 hk0Var, int i) {
        this.t = i;
        this.u = hk0Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        hk0 hk0Var = this.u;
        switch (i) {
            case 0:
                vz7 vz7Var = (vz7) obj;
                ql2 ql2Var = (ql2) hk0Var;
                ql2.a aVar = ql2.Companion;
                if (vz7Var.b) {
                    PlaceHolder placeHolder = ql2Var.p().b;
                    placeHolder.setTitle(vz7Var.d);
                    placeHolder.q(vz7Var.e);
                    placeHolder.p(vz7Var.f, vz7Var.c);
                    placeHolder.i(new pl2(0, ql2Var));
                    PlaceHolder.r(placeHolder);
                } else {
                    PlaceHolder.h(ql2Var.p().b);
                }
                break;
            default:
                rbb rbbVar = (rbb) hk0Var;
                rbb.a aVar2 = rbb.Companion;
                rbbVar.p().b.g((vz7) obj, new ll2(2, rbbVar));
                break;
        }
        return g2b.a;
    }
}
