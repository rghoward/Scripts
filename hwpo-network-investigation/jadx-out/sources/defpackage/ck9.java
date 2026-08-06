package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ck9 extends g5b<g2b, g2b> {
    public final gd7 a;

    public ck9(gd7 gd7Var) {
        gd7Var.getClass();
        this.a = gd7Var;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        bk9 bk9Var;
        if (r02Var instanceof bk9) {
            bk9Var = (bk9) r02Var;
            int i = bk9Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk9Var.v = i - Integer.MIN_VALUE;
            } else {
                bk9Var = new bk9(this, (u02) r02Var);
            }
        } else {
            bk9Var = new bk9(this, (u02) r02Var);
        }
        Object obj = bk9Var.t;
        int i2 = bk9Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            bk9Var.v = 1;
            g2b g2bVarA = this.a.a();
            v72 v72Var = v72.t;
            if (g2bVarA == v72Var) {
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
