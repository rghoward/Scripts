package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 {
    public static final fr1 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ei4<oy8, jt1, Integer, g2b> {
        public static final a t = new a();

        @Override // defpackage.ei4
        public final g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (!jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ci4<jt1, Integer, g2b> {
        public static final b t = new b();

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (!jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    static {
        new fr1(false, 657782987, b.t);
        a = new fr1(false, -1270442071, a.t);
    }
}
