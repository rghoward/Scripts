package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 extends g5b<g2b, Boolean> {
    public final w5b a;

    public vb1(w5b w5bVar) {
        w5bVar.getClass();
        this.a = w5bVar;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        ub1 ub1Var;
        if (r02Var instanceof ub1) {
            ub1Var = (ub1) r02Var;
            int i = ub1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ub1Var.v = i - Integer.MIN_VALUE;
            } else {
                ub1Var = new ub1(this, (u02) r02Var);
            }
        } else {
            ub1Var = new ub1(this, (u02) r02Var);
        }
        Object objC = ub1Var.t;
        int i2 = ub1Var.v;
        if (i2 == 0) {
            dv8.b(objC);
            ub1Var.v = 1;
            objC = this.a.c(ub1Var);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objC);
        }
        return Boolean.valueOf(((h5b) objC).o);
    }
}
