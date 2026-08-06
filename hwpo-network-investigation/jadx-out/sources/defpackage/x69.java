package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x69 implements s79 {
    public static final au3 j = new au3(new v69(), new w69());
    public final bt7 a;
    public float f;
    public final ht2 g;
    public final my2 i;
    public final bt7 b = new bt7(0);
    public final bt7 c = new bt7(0);
    public final i27 d = new i27();
    public final bt7 e = new bt7(Integer.MAX_VALUE);
    public final my2 h = bl7.f(new mh4() { // from class: u69
        @Override // defpackage.mh4
        public final Object invoke() {
            x69 x69Var = this.t;
            return Boolean.valueOf(x69Var.a.k() < x69Var.e.k());
        }
    });

    public x69(int i) {
        this.a = new bt7(i);
        int i2 = 2;
        this.g = new ht2(new ye6(i2, this));
        this.i = bl7.f(new a32(i2, this));
    }

    @Override // defpackage.s79
    public final boolean a() {
        return this.g.a();
    }

    @Override // defpackage.s79
    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final Object c(o37 o37Var, ci4<? super t69, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super g2b> r02Var) {
        Object objC = this.g.c(o37Var, ci4Var, r02Var);
        return objC == v72.t ? objC : g2b.a;
    }

    @Override // defpackage.s79
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.s79
    public final float e(float f) {
        return this.g.e(f);
    }
}
