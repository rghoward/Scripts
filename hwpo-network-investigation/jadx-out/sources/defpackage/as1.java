package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class as1 {
    public static final fr1 a = new fr1(false, -1783408023, a.t);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ei4<b4a, jt1, Integer, g2b> {
        public static final a t = new a();

        @Override // defpackage.ei4
        public final g2b invoke(b4a b4aVar, jt1 jt1Var, Integer num) {
            b4a b4aVar2 = b4aVar;
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= jt1Var2.J(b4aVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && jt1Var2.r()) {
                jt1Var2.u();
            } else {
                a4a.c(b4aVar2, null, null, null, null, null, 0.0f, null, false, jt1Var2, iIntValue & 14);
            }
            return g2b.a;
        }
    }
}
