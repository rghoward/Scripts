package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wl9 {
    public static final y0a a = new y0a(new vl9(0));

    public static final jl9 a(ul9 ul9Var, pl9 pl9Var) {
        switch (pl9Var.ordinal()) {
            case 0:
                return ul9Var.h;
            case 1:
                return ul9Var.e;
            case 2:
                return ul9Var.g;
            case 3:
                return c(ul9Var.e);
            case 4:
                return ul9Var.a;
            case 5:
                return c(ul9Var.a);
            case 6:
                return ay8.a;
            case 7:
                return ul9Var.d;
            case 8:
                b72 b72Var = ul9Var.d;
                z43 z43Var = ol9.i;
                return b72.b(b72Var, z43Var, null, null, z43Var, 6);
            case 9:
                return ul9Var.f;
            case 10:
                b72 b72Var2 = ul9Var.d;
                z43 z43Var2 = ol9.i;
                return b72.b(b72Var2, null, z43Var2, z43Var2, null, 9);
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return c(ul9Var.d);
            case 12:
                return ul9Var.c;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return al8.a;
            case 14:
                return ul9Var.b;
            default:
                u.b();
                return null;
        }
    }

    public static final jl9 b(pl9 pl9Var, jt1 jt1Var) {
        return a((ul9) jt1Var.F(a), pl9Var);
    }

    public static b72 c(b72 b72Var) {
        z43 z43Var = ol9.i;
        return b72.b(b72Var, null, null, z43Var, z43Var, 3);
    }
}
