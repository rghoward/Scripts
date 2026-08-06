package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ir9 {
    public static final az3 a;
    public static final az3 b;
    public static final az3 c;
    public static final iqb d;
    public static final iqb e;
    public static final iqb f;
    public static final iqb g;
    public static final iqb h;
    public static final iqb i;

    static {
        d13 d13Var = d13.u;
        a = new az3(d13Var, 1.0f);
        d13 d13Var2 = d13.t;
        b = new az3(d13Var2, 1.0f);
        d13 d13Var3 = d13.v;
        c = new az3(d13Var3, 1.0f);
        sp0.a aVar = di.a.n;
        d = new iqb(d13Var, new gqb(aVar), aVar);
        sp0.a aVar2 = di.a.m;
        e = new iqb(d13Var, new gqb(aVar2), aVar2);
        int i2 = 1;
        sp0.b bVar = di.a.k;
        f = new iqb(d13Var2, new yf1(i2, bVar), bVar);
        sp0.b bVar2 = di.a.j;
        g = new iqb(d13Var2, new yf1(i2, bVar2), bVar2);
        sp0 sp0Var = di.a.e;
        h = new iqb(d13Var3, new hqb(sp0Var), sp0Var);
        sp0 sp0Var2 = di.a.a;
        i = new iqb(d13Var3, new hqb(sp0Var2), sp0Var2);
    }

    public static final ox6 a(float f2, float f3, ox6 ox6Var) {
        return ox6Var.H(new j3b(f2, f3));
    }

    public static /* synthetic */ ox6 b(ox6 ox6Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(f2, f3, ox6Var);
    }

    public static final ox6 c(ox6 ox6Var, float f2) {
        return ox6Var.H(f2 == 1.0f ? a : new az3(d13.u, f2));
    }

    public static final ox6 d(ox6 ox6Var, float f2) {
        return ox6Var.H(new hr9(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static ox6 e(ox6 ox6Var, float f2, float f3, int i2) {
        return ox6Var.H(new hr9(0.0f, (i2 & 1) != 0 ? Float.NaN : f2, 0.0f, (i2 & 2) != 0 ? Float.NaN : f3, true, 5));
    }

    public static final ox6 f(ox6 ox6Var, float f2) {
        return ox6Var.H(new hr9(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final ox6 g(float f2, float f3) {
        return new hr9(f2, f3, f2, f3, false);
    }

    public static ox6 h(ox6 ox6Var, float f2, float f3, float f4, float f5, int i2) {
        return ox6Var.H(new hr9(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final ox6 i(float f2) {
        return new hr9(f2, 0.0f, f2, 0.0f, false, 10);
    }

    public static final ox6 j(ox6 ox6Var, float f2) {
        return ox6Var.H(new hr9(f2, f2, f2, f2, true));
    }

    public static final ox6 k(float f2, float f3, ox6 ox6Var) {
        return ox6Var.H(new hr9(f2, f3, f2, f3, true));
    }

    public static final ox6 l(ox6 ox6Var, float f2, float f3, float f4, float f5) {
        return ox6Var.H(new hr9(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ ox6 m(ox6 ox6Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return l(ox6Var, f2, f3, f4, f5);
    }

    public static final ox6 n(ox6 ox6Var, float f2) {
        return ox6Var.H(new hr9(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static ox6 o(ox6 ox6Var, float f2) {
        return ox6Var.H(new hr9(Float.NaN, 0.0f, f2, 0.0f, true, 10));
    }

    public static ox6 p(ox6 ox6Var) {
        iqb iqbVar;
        sp0.b bVar = di.a.k;
        if (xj5.a(bVar, bVar)) {
            iqbVar = f;
        } else if (xj5.a(bVar, di.a.j)) {
            iqbVar = g;
        } else {
            iqbVar = new iqb(d13.t, new yf1(1, bVar), bVar);
        }
        return ox6Var.H(iqbVar);
    }

    public static ox6 q(ox6 ox6Var) {
        iqb iqbVar;
        sp0 sp0Var = di.a.e;
        if (xj5.a(sp0Var, sp0Var)) {
            iqbVar = h;
        } else if (xj5.a(sp0Var, di.a.a)) {
            iqbVar = i;
        } else {
            iqbVar = new iqb(d13.v, new hqb(sp0Var), sp0Var);
        }
        return ox6Var.H(iqbVar);
    }

    public static ox6 r(ox6 ox6Var) {
        iqb iqbVar;
        sp0.a aVar = di.a.n;
        if (xj5.a(aVar, aVar)) {
            iqbVar = d;
        } else if (xj5.a(aVar, di.a.m)) {
            iqbVar = e;
        } else {
            iqbVar = new iqb(d13.u, new gqb(aVar), aVar);
        }
        return ox6Var.H(iqbVar);
    }
}
