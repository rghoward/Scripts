package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jj {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(mh4 mh4Var, ci4 ci4Var, u02 u02Var) throws Throwable {
        hj hjVar;
        if (u02Var instanceof hj) {
            hjVar = (hj) u02Var;
            int i = hjVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                hjVar.u = i - Integer.MIN_VALUE;
            } else {
                hjVar = new hj(u02Var);
            }
        } else {
            hjVar = new hj(u02Var);
        }
        Object obj = hjVar.t;
        int i2 = hjVar.u;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                ij ijVar = new ij(mh4Var, ci4Var, null);
                hjVar.u = 1;
                Object objD = u72.d(ijVar, hjVar);
                v72 v72Var = v72.t;
                if (objD == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
        } catch (dj unused) {
        }
        return g2b.a;
    }
}
