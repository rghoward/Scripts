package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pw7 implements lw7 {
    public final pf2<t78> a;
    public final t78.a<Boolean> b;

    public pw7(bu8 bu8Var, pf2<t78> pf2Var) {
        this.a = pf2Var;
        this.b = new t78.a<>(bu8Var.b(R.string.intercom_login_status, new Object[0]));
    }

    @Override // defpackage.lw7
    public final Object a(sb1 sb1Var) {
        Object objA = v78.a(this.a, new ow7(this, null), sb1Var);
        return objA == v72.t ? objA : g2b.a;
    }

    @Override // defpackage.lw7
    public final Object b(sd6 sd6Var) {
        Object objA = v78.a(this.a, new mw7(2, null), sd6Var);
        return objA == v72.t ? objA : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lw7
    public final Object c(u02 u02Var) throws Throwable {
        nw7 nw7Var;
        if (u02Var instanceof nw7) {
            nw7Var = (nw7) u02Var;
            int i = nw7Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                nw7Var.v = i - Integer.MIN_VALUE;
            } else {
                nw7Var = new nw7(this, u02Var);
            }
        } else {
            nw7Var = new nw7(this, u02Var);
        }
        Object objK = nw7Var.t;
        int i2 = nw7Var.v;
        if (i2 == 0) {
            dv8.b(objK);
            r54<t78> data = this.a.getData();
            nw7Var.v = 1;
            objK = yk2.k(data, nw7Var);
            v72 v72Var = v72.t;
            if (objK == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objK);
        }
        Boolean bool = (Boolean) ((t78) objK).b(this.b);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
