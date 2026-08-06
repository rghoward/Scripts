package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hu3 extends g5b<pk1, g2b> {
    public final pm1 a;

    public hu3(pm1 pm1Var) {
        pm1Var.getClass();
        this.a = pm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(pk1 pk1Var, u02 u02Var) throws Throwable {
        gu3 gu3Var;
        if (u02Var instanceof gu3) {
            gu3Var = (gu3) u02Var;
            int i = gu3Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                gu3Var.v = i - Integer.MIN_VALUE;
            } else {
                gu3Var = new gu3(this, u02Var);
            }
        } else {
            gu3Var = new gu3(this, u02Var);
        }
        Object obj = gu3Var.t;
        int i2 = gu3Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            gu3Var.v = 1;
            Object objF = this.a.f(pk1Var, gu3Var);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
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
