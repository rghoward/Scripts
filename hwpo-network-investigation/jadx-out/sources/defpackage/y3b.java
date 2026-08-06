package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y3b extends g5b<g2b, g2b> {
    public final w5b a;

    public y3b(w5b w5bVar) {
        w5bVar.getClass();
        this.a = w5bVar;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        x3b x3bVar;
        if (r02Var instanceof x3b) {
            x3bVar = (x3b) r02Var;
            int i = x3bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                x3bVar.v = i - Integer.MIN_VALUE;
            } else {
                x3bVar = new x3b(this, (u02) r02Var);
            }
        } else {
            x3bVar = new x3b(this, (u02) r02Var);
        }
        Object obj = x3bVar.t;
        int i2 = x3bVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            x3bVar.v = 1;
            Object objI = this.a.i(x3bVar);
            v72 v72Var = v72.t;
            if (objI == v72Var) {
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
