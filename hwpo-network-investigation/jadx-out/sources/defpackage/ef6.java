package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ef6 extends jz7.a {
    public final df6 u;

    public ef6(df6 df6Var) {
        this.u = df6Var;
    }

    @Override // jz7.a, defpackage.tx2
    public final float N0() {
        return this.u.N0();
    }

    @Override // jz7.a
    public final float f(uy8 uy8Var, float f) {
        int iA;
        ci4<jz7.a, Float, Float> ci4Var = uy8Var.a;
        if (ci4Var != null) {
            return ci4Var.invoke(this, Float.valueOf(f)).floatValue();
        }
        df6 df6Var = this.u;
        if (df6Var.D) {
            return f;
        }
        df6 df6Var2 = df6Var;
        while (true) {
            xy8 xy8Var = df6Var2.F;
            float f2 = Float.NaN;
            if (xy8Var != null && (iA = u30.A(xy8Var.b, uy8Var)) >= 0) {
                f2 = xy8Var.c[iA];
            }
            if (!Float.isNaN(f2)) {
                df6Var2.n0(df6Var.x1(), uy8Var);
                return uy8Var.a(f2, df6Var2.j0(), df6Var.j0());
            }
            df6 df6VarX0 = df6Var2.x0();
            if (df6VarX0 == null) {
                df6Var2.n0(df6Var.x1(), uy8Var);
                return f;
            }
            df6Var2 = df6VarX0;
        }
    }

    @Override // jz7.a
    public final tq5 g() {
        return this.u.getLayoutDirection();
    }

    @Override // jz7.a, defpackage.tx2
    public final float getDensity() {
        return this.u.getDensity();
    }

    @Override // jz7.a
    public final int j() {
        return this.u.g0();
    }
}
