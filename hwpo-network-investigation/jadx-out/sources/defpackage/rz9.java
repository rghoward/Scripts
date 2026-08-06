package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rz9 implements ls3 {
    public final long t;
    public final ls3 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends rd4 {
        public final /* synthetic */ t89 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t89 t89Var, t89 t89Var2) {
            super(t89Var);
            this.b = t89Var2;
        }

        @Override // defpackage.rd4, defpackage.t89
        public final t89.a e(long j) {
            t89.a aVarE = this.b.e(j);
            v89 v89Var = aVarE.a;
            long j2 = v89Var.a;
            long j3 = v89Var.b;
            long j4 = rz9.this.t;
            v89 v89Var2 = new v89(j2, j3 + j4);
            v89 v89Var3 = aVarE.b;
            return new t89.a(v89Var2, new v89(v89Var3.a, v89Var3.b + j4));
        }
    }

    public rz9(long j, ls3 ls3Var) {
        this.t = j;
        this.u = ls3Var;
    }

    @Override // defpackage.ls3
    public final void k() {
        this.u.k();
    }

    @Override // defpackage.ls3
    public final hsa p(int i, int i2) {
        return this.u.p(i, i2);
    }

    @Override // defpackage.ls3
    public final void t(t89 t89Var) {
        this.u.t(new a(t89Var, t89Var));
    }
}
