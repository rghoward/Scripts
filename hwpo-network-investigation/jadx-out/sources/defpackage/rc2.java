package defpackage;

import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rc2 implements pc2 {
    public final ga0 a;
    public final wg9 b;

    public rc2(ga0 ga0Var, wg9 wg9Var) {
        ga0Var.getClass();
        wg9Var.getClass();
        this.a = ga0Var;
        this.b = wg9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pc2
    public final Object c(u02 u02Var) throws Throwable {
        qc2 qc2Var;
        if (u02Var instanceof qc2) {
            qc2Var = (qc2) u02Var;
            int i = qc2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc2Var.v = i - Integer.MIN_VALUE;
            } else {
                qc2Var = new qc2(this, u02Var);
            }
        } else {
            qc2Var = new qc2(this, u02Var);
        }
        Object objB = qc2Var.t;
        int i2 = qc2Var.v;
        wg9 wg9Var = this.b;
        if (i2 == 0) {
            dv8.b(objB);
            h5b h5bVarB = wg9Var.b();
            if (h5bVarB != null) {
                return h5bVarB;
            }
            qc2Var.v = 1;
            objB = this.a.b(qc2Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objB);
        }
        h5b h5bVarA = ((UserNetworkEntity) objB).a();
        wg9Var.c(h5bVarA);
        return h5bVarA;
    }
}
