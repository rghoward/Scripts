package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ci8 extends g5b<pk1, g2b> {
    public final pm1 a;

    public ci8(pm1 pm1Var) {
        pm1Var.getClass();
        this.a = pm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(pk1 pk1Var, u02 u02Var) throws Throwable {
        bi8 bi8Var;
        if (u02Var instanceof bi8) {
            bi8Var = (bi8) u02Var;
            int i = bi8Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bi8Var.v = i - Integer.MIN_VALUE;
            } else {
                bi8Var = new bi8(this, u02Var);
            }
        } else {
            bi8Var = new bi8(this, u02Var);
        }
        Object obj = bi8Var.t;
        int i2 = bi8Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            bi8Var.v = 1;
            Object objE = this.a.e(pk1Var, bi8Var);
            v72 v72Var = v72.t;
            if (objE == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
