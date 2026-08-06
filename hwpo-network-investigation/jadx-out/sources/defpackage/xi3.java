package defpackage;

import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi3 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ xi3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        q7b hc7Var;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                fj3 fj3Var = (fj3) obj;
                vn0 vn0Var = fj3Var.K;
                bu8 bu8Var = fj3Var.G;
                xn0 xn0Var = vn0Var.z;
                int i2 = vn0Var.t;
                m2b m2bVar = vn0Var.y;
                if (xn0Var == xn0.D) {
                    hc7Var = new nr0(i2, bu8Var.b(R.string.blood_pressure_validation_error, new Object[0]));
                } else {
                    hc7Var = (xn0Var != xn0.u || m2bVar == m2b.u) ? new hc7(i2, bu8Var.b(R.string.zero_value_validtion_error, new Object[0]), false) : new vma(i2, false);
                }
                return ws0.i(hc7Var, new zb7(vn0Var.t));
            default:
                return ListAttributeCollectorKt.ListAttributeCollector$lambda$6$lambda$5((AttributeData) obj);
        }
    }
}
