package defpackage;

import com.hwpo_training_app.core.data.model.user.UserNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z81 implements x81 {
    public final k81 a;
    public final wg9 b;

    public z81(k81 k81Var, wg9 wg9Var) {
        k81Var.getClass();
        wg9Var.getClass();
        this.a = k81Var;
        this.b = wg9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.x81
    public final Object a(String str, String str2, String str3, u02 u02Var) throws Throwable {
        y81 y81Var;
        if (u02Var instanceof y81) {
            y81Var = (y81) u02Var;
            int i = y81Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                y81Var.v = i - Integer.MIN_VALUE;
            } else {
                y81Var = new y81(this, u02Var);
            }
        } else {
            y81Var = new y81(this, u02Var);
        }
        Object objA = y81Var.t;
        int i2 = y81Var.v;
        if (i2 == 0) {
            dv8.b(objA);
            y81Var.v = 1;
            objA = this.a.a(str, str2, str3, y81Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        this.b.c(((UserNetworkEntity) objA).a());
        return g2b.a;
    }
}
