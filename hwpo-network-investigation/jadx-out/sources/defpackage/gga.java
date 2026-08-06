package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gga {
    public static final au3 g = xa6.b(new ega(), new fga(0));
    public final at7 a;
    public final at7 b;
    public final bt7 c;
    public sk8 d;
    public long e;
    public final dt7 f;

    public gga(fl7 fl7Var, float f) {
        this.a = new at7(f);
        this.b = new at7(0.0f);
        this.c = new bt7(0);
        this.d = sk8.e;
        this.e = lja.b;
        this.f = new dt7(fl7Var, d3a.u);
    }

    public final void a(fl7 fl7Var, sk8 sk8Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.g(f2);
        float f3 = sk8Var.a;
        float f4 = sk8Var.b;
        sk8 sk8Var2 = this.d;
        float f5 = sk8Var2.a;
        at7 at7Var = this.a;
        if (f3 != f5 || f4 != sk8Var2.b) {
            boolean z = fl7Var == fl7.t;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? sk8Var.d : sk8Var.c;
            float fH = at7Var.h();
            float f7 = i;
            float f8 = fH + f7;
            if (f6 <= f8 && (f3 >= fH || f6 - f3 <= f7)) {
                f = (f3 >= fH || f6 - f3 > f7) ? 0.0f : f3 - fH;
            } else {
                f = f6 - f8;
            }
            at7Var.g(at7Var.h() + f);
            this.d = sk8Var;
        }
        at7Var.g(uh8.f(at7Var.h(), 0.0f, f2));
        this.c.j(i);
    }

    public /* synthetic */ gga(fl7 fl7Var) {
        this(fl7Var, 0.0f);
    }

    public gga() {
        this(fl7.t);
    }
}
