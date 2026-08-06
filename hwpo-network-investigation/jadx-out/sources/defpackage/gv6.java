package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gv6 {
    public static gv6 h;
    public final tq5 a;
    public final wja b;
    public final xx2 c;
    public final qa4.a d;
    public final wja e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static gv6 a(gv6 gv6Var, tq5 tq5Var, wja wjaVar, tx2 tx2Var, qa4.a aVar) {
            if (gv6Var != null && tq5Var == gv6Var.a && zu1.d(wjaVar, tq5Var).equals(gv6Var.b) && tx2Var.getDensity() == gv6Var.c.t && aVar == gv6Var.d) {
                return gv6Var;
            }
            gv6 gv6Var2 = gv6.h;
            if (gv6Var2 != null && tq5Var == gv6Var2.a && zu1.d(wjaVar, tq5Var).equals(gv6Var2.b) && tx2Var.getDensity() == gv6Var2.c.t && aVar == gv6Var2.d) {
                return gv6Var2;
            }
            gv6 gv6Var3 = new gv6(tq5Var, zu1.d(wjaVar, tq5Var), new xx2(tx2Var.getDensity(), tx2Var.N0()), aVar);
            gv6.h = gv6Var3;
            return gv6Var3;
        }
    }

    public gv6(tq5 tq5Var, wja wjaVar, xx2 xx2Var, qa4.a aVar) {
        this.a = tq5Var;
        this.b = wjaVar;
        this.c = xx2Var;
        this.d = aVar;
        this.e = zu1.d(wjaVar, tq5Var);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = hv6.a;
            long jB = zx1.b(0, 0, 0, 0, 15);
            wja wjaVar = this.e;
            xx2 xx2Var = this.c;
            float fC = qs7.a(str, wjaVar, jB, xx2Var, this.d, 1, 96).c();
            float fC2 = qs7.a(hv6.b, this.e, zx1.b(0, 0, 0, 0, 15), xx2Var, this.d, 2, 96).c() - fC;
            this.g = fC;
            this.f = fC2;
            f2 = fC2;
            f = fC;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = xx1.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = xx1.i(j);
        }
        return zx1.a(xx1.j(j), xx1.h(j), i2, xx1.g(j));
    }
}
