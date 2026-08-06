package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cga implements s79 {
    public final /* synthetic */ s79 a;
    public final my2 b;
    public final my2 c;

    public cga(s79 s79Var, gga ggaVar) {
        this.a = s79Var;
        this.b = bl7.f(new cy9(1, ggaVar));
        this.c = bl7.f(new kd9(1, ggaVar));
    }

    @Override // defpackage.s79
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.s79
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final Object c(o37 o37Var, ci4<? super t69, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super g2b> r02Var) {
        return this.a.c(o37Var, ci4Var, r02Var);
    }

    @Override // defpackage.s79
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final float e(float f) {
        return this.a.e(f);
    }
}
