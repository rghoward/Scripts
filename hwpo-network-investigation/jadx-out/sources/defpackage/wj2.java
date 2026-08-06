package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wj2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ n85 t;
    public final /* synthetic */ String u;

    public wj2(n85 n85Var, String str) {
        this.t = n85Var;
        this.u = str;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            m65.a(this.t, this.u, null, 0L, jt1Var2, 0, 12);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
