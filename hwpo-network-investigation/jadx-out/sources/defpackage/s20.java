package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface s20 extends lr5 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz7 jz7Var) {
            super(1);
            this.u = jz7Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            aVar.l(this.u, 0, 0, 0.0f);
            return g2b.a;
        }
    }

    default int P1(r20 r20Var, pj5 pj5Var, int i) {
        mb7 mb7Var = q().A;
        mb7Var.getClass();
        ff6 ff6VarE1 = mb7Var.e1();
        ff6VarE1.getClass();
        if (!ff6VarE1.t0()) {
            return pj5Var.o(i);
        }
        zx1.b(0, i, 0, 0, 13);
        r20Var.getLayoutDirection();
        return p0().h();
    }

    @Override // defpackage.lr5
    default gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE = cl6Var.E(j);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new a(jz7VarE));
    }

    default int n0(r20 r20Var, pj5 pj5Var, int i) {
        mb7 mb7Var = q().A;
        mb7Var.getClass();
        ff6 ff6VarE1 = mb7Var.e1();
        ff6VarE1.getClass();
        if (!ff6VarE1.t0()) {
            return pj5Var.C(i);
        }
        zx1.b(0, 0, 0, i, 7);
        r20Var.getLayoutDirection();
        return p0().j();
    }

    gl6 p0();

    default int q0(r20 r20Var, pj5 pj5Var, int i) {
        mb7 mb7Var = q().A;
        mb7Var.getClass();
        ff6 ff6VarE1 = mb7Var.e1();
        ff6VarE1.getClass();
        if (!ff6VarE1.t0()) {
            return pj5Var.A(i);
        }
        zx1.b(0, 0, 0, i, 7);
        r20Var.getLayoutDirection();
        return p0().j();
    }

    default int q1(r20 r20Var, pj5 pj5Var, int i) {
        mb7 mb7Var = q().A;
        mb7Var.getClass();
        ff6 ff6VarE1 = mb7Var.e1();
        ff6VarE1.getClass();
        if (!ff6VarE1.t0()) {
            return pj5Var.c0(i);
        }
        zx1.b(0, i, 0, 0, 13);
        r20Var.getLayoutDirection();
        return p0().h();
    }

    boolean s0();
}
