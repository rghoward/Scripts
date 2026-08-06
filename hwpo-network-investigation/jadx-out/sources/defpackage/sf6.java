package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sf6 extends oe7.a {
    public static final oe7<sf6> d;
    public float b;
    public float c;

    static {
        oe7<sf6> oe7VarA = oe7.a(32, new sf6(0.0f, 0.0f));
        d = oe7VarA;
        oe7VarA.f = 0.5f;
    }

    public sf6(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static sf6 b(float f, float f2) {
        sf6 sf6Var = (sf6) d.b();
        sf6Var.b = f;
        sf6Var.c = f2;
        return sf6Var;
    }

    public static void c(sf6 sf6Var) {
        d.c(sf6Var);
    }

    @Override // oe7.a
    public final oe7.a a() {
        return new sf6(0.0f, 0.0f);
    }

    public sf6() {
    }
}
