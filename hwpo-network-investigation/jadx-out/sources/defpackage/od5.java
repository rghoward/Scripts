package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class od5 extends wp5 implements oh4<sd7, g2b> {
    public final /* synthetic */ pd5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od5(pd5 pd5Var) {
        super(1);
        this.u = pd5Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(sd7 sd7Var) {
        sd7 sd7Var2 = sd7Var;
        sd7Var2.a();
        pd5 pd5Var = this.u;
        k37<mkb<sd7>> k37Var = pd5Var.d;
        mkb<sd7>[] mkbVarArr = k37Var.t;
        int i = k37Var.v;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (xj5.a(mkbVarArr[i2], sd7Var2)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            k37Var.o(i2);
        }
        if (k37Var.v == 0) {
            pd5Var.b.invoke();
        }
        return g2b.a;
    }
}
