package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zd1 extends g5b<g2b, g2b> {
    public final pm1 a;

    public zd1(pm1 pm1Var) {
        pm1Var.getClass();
        this.a = pm1Var;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        yd1 yd1Var;
        if (r02Var instanceof yd1) {
            yd1Var = (yd1) r02Var;
            int i = yd1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                yd1Var.v = i - Integer.MIN_VALUE;
            } else {
                yd1Var = new yd1(this, (u02) r02Var);
            }
        } else {
            yd1Var = new yd1(this, (u02) r02Var);
        }
        Object obj = yd1Var.t;
        int i2 = yd1Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            yd1Var.v = 1;
            Object objB = this.a.b(yd1Var);
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
