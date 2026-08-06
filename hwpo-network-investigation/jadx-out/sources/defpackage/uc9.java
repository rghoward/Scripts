package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uc9 extends g5b<dl2, g2b> {
    public final g49 a;

    public uc9(g49 g49Var) {
        g49Var.getClass();
        this.a = g49Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(dl2 dl2Var, u02 u02Var) throws Throwable {
        tc9 tc9Var;
        if (u02Var instanceof tc9) {
            tc9Var = (tc9) u02Var;
            int i = tc9Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                tc9Var.v = i - Integer.MIN_VALUE;
            } else {
                tc9Var = new tc9(this, u02Var);
            }
        } else {
            tc9Var = new tc9(this, u02Var);
        }
        Object obj = tc9Var.t;
        int i2 = tc9Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            tc9Var.v = 1;
            Object objB = this.a.b(dl2Var, tc9Var);
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
