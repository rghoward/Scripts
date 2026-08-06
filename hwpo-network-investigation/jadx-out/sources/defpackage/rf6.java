package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rf6 extends oe7.a {
    public static final oe7<rf6> d;
    public double b = 0.0d;
    public double c = 0.0d;

    static {
        oe7<rf6> oe7VarA = oe7.a(64, new rf6());
        d = oe7VarA;
        oe7VarA.f = 0.5f;
    }

    public static rf6 b(double d2, double d3) {
        rf6 rf6Var = (rf6) d.b();
        rf6Var.b = d2;
        rf6Var.c = d3;
        return rf6Var;
    }

    public static void c(rf6 rf6Var) {
        d.c(rf6Var);
    }

    @Override // oe7.a
    public final oe7.a a() {
        return new rf6();
    }

    public final String toString() {
        return "MPPointD, x: " + this.b + ", y: " + this.c;
    }
}
