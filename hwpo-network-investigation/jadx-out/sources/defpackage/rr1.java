package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rr1 implements gi4 {
    @Override // defpackage.gi4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        ada adaVar = (ada) obj;
        gca gcaVar = (gca) obj2;
        mh4 mh4Var = (mh4) obj3;
        jt1 jt1Var = (jt1) obj4;
        int iIntValue = ((Integer) obj5).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? jt1Var.J(adaVar) : jt1Var.j(adaVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? jt1Var.J(gcaVar) : jt1Var.j(gcaVar) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= jt1Var.j(mh4Var) ? 256 : 128;
        }
        if (jt1Var.A(i & 1, (i & 1171) != 1170)) {
            nu2.c(adaVar, gcaVar, mh4Var, jt1Var, i & 1022);
        } else {
            jt1Var.u();
        }
        return g2b.a;
    }
}
