package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cn9 implements ei4<bra, jt1, Integer, g2b> {
    public final /* synthetic */ String t;

    public cn9(String str) {
        this.t = str;
    }

    @Override // defpackage.ei4
    public final g2b invoke(bra braVar, jt1 jt1Var, Integer num) {
        bra braVar2 = braVar;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? jt1Var2.J(braVar2) : jt1Var2.j(braVar2) ? 4 : 2;
        }
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            yqa.a(braVar2, null, 0.0f, null, 0L, 0L, gr1.b(-999924215, new bn9(this.t), jt1Var2), jt1Var2, (iIntValue & 14) | 805306368);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
