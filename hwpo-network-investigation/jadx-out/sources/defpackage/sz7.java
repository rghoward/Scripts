package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sz7 {
    public static final dm7 a(cz1 cz1Var, jl9 jl9Var, long j, kn9 kn9Var, float f, dm7 dm7Var, tq5 tq5Var, cr9 cr9Var) {
        dm7 dm7VarMo0createOutlinePq9zytI = null;
        if (jl9Var == al8.a) {
            d73.W0(cz1Var, j, 0L, 0L, 0.0f, 126);
            d73.Q(cz1Var, kn9Var.b(f, cz1Var.c()), 0L, 0L, kn9Var.a(f), null, null, 118);
            return null;
        }
        long jC = cz1Var.c();
        if (cr9Var != null && jC == cr9Var.a && cz1Var.getLayoutDirection() == tq5Var) {
            dm7VarMo0createOutlinePq9zytI = dm7Var;
        }
        if (dm7VarMo0createOutlinePq9zytI == null) {
            dm7VarMo0createOutlinePq9zytI = jl9Var.mo0createOutlinePq9zytI(cz1Var.c(), cz1Var.getLayoutDirection(), cz1Var);
        }
        em7.c(cz1Var, dm7VarMo0createOutlinePq9zytI, j);
        em7.b(cz1Var, dm7VarMo0createOutlinePq9zytI, kn9Var.b(f, cz1Var.c()), kn9Var.a(f), 56);
        return dm7VarMo0createOutlinePq9zytI;
    }
}
