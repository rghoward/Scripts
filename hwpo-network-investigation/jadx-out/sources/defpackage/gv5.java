package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gv5 implements fv5 {
    public bt7 a;
    public bt7 b;

    @Override // defpackage.fv5
    public final ox6 a() {
        return new lt7(null, this.b, 2);
    }

    @Override // defpackage.fv5
    public final ox6 b() {
        return new lt7(this.a, null, 4);
    }

    @Override // defpackage.fv5
    public final ox6 c(ox6 ox6Var, ty9 ty9Var, ty9 ty9Var2) {
        return (ty9Var == null && ty9Var2 == null) ? ox6Var : ox6Var.H(new iv5(ty9Var, ty9Var2));
    }
}
