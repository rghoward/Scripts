package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 {
    public static final fr1 a = new fr1(false, 210148896, a.u);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<jt1, Integer, g2b> {
        public static final a u = new a(2);

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
}
