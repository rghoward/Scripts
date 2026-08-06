package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c8 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ c8(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                e8.a aVar = e8.Companion;
                yp4 yp4Var = ((p8) obj).i;
                bu8 bu8Var = ((e8) obj2).F;
                bu8Var.getClass();
                if (yp4Var == null) {
                    return BuildConfig.FLAVOR;
                }
                if (yp4Var.equals(yp4.b.t)) {
                    return bu8Var.b(R.string.garage_gym, new Object[0]);
                }
                if (yp4Var.equals(yp4.c.t)) {
                    return bu8Var.b(R.string.unaffiliated_gym, new Object[0]);
                }
                if (yp4Var instanceof yp4.a) {
                    return ((yp4.a) yp4Var).u;
                }
                u.b();
                return null;
            default:
                k37 k37Var = (k37) obj2;
                Object[] objArr = k37Var.t;
                int i2 = k37Var.v;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((gl6) objArr[i3]).m();
                }
                return g2b.a;
        }
    }
}
