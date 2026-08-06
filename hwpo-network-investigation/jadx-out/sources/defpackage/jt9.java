package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jt9 implements ei4<oy8, jt1, Integer, g2b> {
    public final /* synthetic */ String t;

    public jt9(String str) {
        this.t = str;
    }

    @Override // defpackage.ei4
    public final g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
            mia.b(this.t, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
