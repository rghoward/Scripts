package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q68 extends g5b<rsa, g2b> {
    public final tsa a;

    public q68(tsa tsaVar) {
        tsaVar.getClass();
        this.a = tsaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(rsa rsaVar, u02 u02Var) throws Throwable {
        p68 p68Var;
        if (u02Var instanceof p68) {
            p68Var = (p68) u02Var;
            int i = p68Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                p68Var.v = i - Integer.MIN_VALUE;
            } else {
                p68Var = new p68(this, u02Var);
            }
        } else {
            p68Var = new p68(this, u02Var);
        }
        Object obj = p68Var.t;
        int i2 = p68Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            p68Var.v = 1;
            Object objB = this.a.b(rsaVar, p68Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
