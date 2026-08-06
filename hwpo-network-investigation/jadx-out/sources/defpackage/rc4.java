package defpackage;

import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rc4 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ hk0 u;

    public /* synthetic */ rc4(hk0 hk0Var, int i) {
        this.t = i;
        this.u = hk0Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        hk0 hk0Var = this.u;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ho5<Object>[] ho5VarArr = oc4.C;
                ((oc4) hk0Var).p().f.setVisible(zBooleanValue);
                break;
            default:
                vz7 vz7Var = (vz7) obj;
                bf9 bf9Var = (bf9) hk0Var;
                bf9.a aVar = bf9.Companion;
                if (vz7Var.b) {
                    PlaceHolder placeHolder = bf9Var.p().j;
                    placeHolder.setTitle(vz7Var.d);
                    placeHolder.q(vz7Var.e);
                    placeHolder.p(vz7Var.f, true);
                    placeHolder.i(new va3(1, bf9Var));
                    PlaceHolder.r(placeHolder);
                } else {
                    PlaceHolder.h(bf9Var.p().j);
                }
                break;
        }
        return g2b.a;
    }
}
