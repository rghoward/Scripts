package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bx2 extends g5b<g2b, g2b> {
    public final h6 a;

    public bx2(h6 h6Var) {
        h6Var.getClass();
        this.a = h6Var;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        ax2 ax2Var;
        if (r02Var instanceof ax2) {
            ax2Var = (ax2) r02Var;
            int i = ax2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ax2Var.v = i - Integer.MIN_VALUE;
            } else {
                ax2Var = new ax2(this, (u02) r02Var);
            }
        } else {
            ax2Var = new ax2(this, (u02) r02Var);
        }
        Object obj = ax2Var.t;
        int i2 = ax2Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            ax2Var.v = 1;
            Object objC = this.a.c(ax2Var);
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
