package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class he1 extends g5b<g2b, g2b> {
    public final sr8 a;

    public he1(sr8 sr8Var) {
        sr8Var.getClass();
        this.a = sr8Var;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        ge1 ge1Var;
        if (r02Var instanceof ge1) {
            ge1Var = (ge1) r02Var;
            int i = ge1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ge1Var.v = i - Integer.MIN_VALUE;
            } else {
                ge1Var = new ge1(this, (u02) r02Var);
            }
        } else {
            ge1Var = new ge1(this, (u02) r02Var);
        }
        Object obj = ge1Var.t;
        int i2 = ge1Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            ge1Var.v = 1;
            Object objC = this.a.c(ge1Var);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
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
