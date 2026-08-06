package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 {
    public static final ko7 a;
    public static final ko7 b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        float f = hu1.v;
        float f2 = hu1.w;
        a = new ko7(f, 8.0f, f2, 8.0f);
        if (!((f2 >= 0.0f) & (16.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            sc5.a("Padding must be non-negative");
        }
        b = new ko7(12.0f, 8.0f, 12.0f, 8.0f);
        if (!((16.0f >= 0.0f) & (12.0f >= 0.0f) & (8.0f >= 0.0f) & (8.0f >= 0.0f))) {
            sc5.a("Padding must be non-negative");
        }
        c = 58.0f;
        d = 40.0f;
        e = kz0.u;
    }

    public static yy0 a(long j, long j2, long j3, long j4, jt1 jt1Var, int i) {
        if ((i & 2) != 0) {
            j2 = uh1.k;
        }
        return c((fi1) jt1Var.F(hi1.a)).a(j, j2, (i & 4) != 0 ? uh1.k : j3, (i & 8) != 0 ? uh1.k : j4);
    }

    public static cz0 b(int i) {
        return new cz0((i & 1) != 0 ? 0.0f : 2.0f, (i & 2) != 0 ? 0.0f : 8.0f, (i & 4) != 0 ? 0.0f : 4.0f, (i & 8) != 0 ? fz3.f : 4.0f, 0.0f);
    }

    public static yy0 c(fi1 fi1Var) {
        yy0 yy0Var = fi1Var.W;
        if (yy0Var != null) {
            return yy0Var;
        }
        yy0 yy0Var2 = new yy0(hi1.c(fi1Var, fz3.a), hi1.c(fi1Var, fz3.g), uh1.b(fz3.c, hi1.c(fi1Var, fz3.b)), uh1.b(fz3.e, hi1.c(fi1Var, fz3.d)));
        fi1Var.W = yy0Var2;
        return yy0Var2;
    }

    public static yy0 d(fi1 fi1Var) {
        yy0 yy0Var = fi1Var.Y;
        if (yy0Var != null) {
            return yy0Var;
        }
        long j = uh1.j;
        yy0 yy0Var2 = new yy0(j, hi1.c(fi1Var, gi1.F), j, uh1.b(i03.D, hi1.c(fi1Var, i03.C)));
        fi1Var.Y = yy0Var2;
        return yy0Var2;
    }

    public static yy0 e(long j, long j2, jt1 jt1Var) {
        yy0 yy0Var;
        long j3 = uh1.k;
        fi1 fi1Var = (fi1) jt1Var.F(hi1.a);
        yy0 yy0Var2 = fi1Var.X;
        if (yy0Var2 == null) {
            long j4 = uh1.j;
            yy0 yy0Var3 = new yy0(j4, hi1.c(fi1Var, gm7.c), j4, uh1.b(gm7.b, hi1.c(fi1Var, gm7.a)));
            fi1Var.X = yy0Var3;
            yy0Var = yy0Var3;
        } else {
            yy0Var = yy0Var2;
        }
        return yy0Var.a(j, j2, j3, j3);
    }

    public static yy0 f(long j, long j2, jt1 jt1Var, int i) {
        if ((i & 1) != 0) {
            j = uh1.k;
        }
        long j3 = j;
        long j4 = uh1.k;
        return d((fi1) jt1Var.F(hi1.a)).a(j3, j2, j4, j4);
    }
}
