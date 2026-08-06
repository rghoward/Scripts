package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w3b extends g5b<yp4, g2b> {
    public final w5b a;

    public w3b(w5b w5bVar) {
        w5bVar.getClass();
        this.a = w5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(yp4 yp4Var, u02 u02Var) throws Throwable {
        v3b v3bVar;
        if (u02Var instanceof v3b) {
            v3bVar = (v3b) u02Var;
            int i = v3bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3bVar.v = i - Integer.MIN_VALUE;
            } else {
                v3bVar = new v3b(this, u02Var);
            }
        } else {
            v3bVar = new v3b(this, u02Var);
        }
        Object obj = v3bVar.t;
        int i2 = v3bVar.v;
        if (i2 == 0) {
            dv8.b(obj);
            v3bVar.v = 1;
            Object objG = this.a.g(yp4Var, v3bVar);
            v72 v72Var = v72.t;
            if (objG == v72Var) {
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
