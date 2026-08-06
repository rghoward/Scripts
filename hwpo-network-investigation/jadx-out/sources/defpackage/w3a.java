package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w3a implements ei4<pv0, jt1, Integer, g2b> {
    public final /* synthetic */ lr9 t;
    public final /* synthetic */ fr1 u;
    public final /* synthetic */ f50 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ nz1 x;

    public w3a(lr9 lr9Var, fr1 fr1Var, f50 f50Var, String str, nz1 nz1Var) {
        this.t = lr9Var;
        this.u = fr1Var;
        this.v = f50Var;
        this.w = str;
        this.x = nz1Var;
    }

    @Override // defpackage.ei4
    public final g2b invoke(pv0 pv0Var, jt1 jt1Var, Integer num) {
        pv0 pv0Var2 = pv0Var;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= jt1Var2.J(pv0Var2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && jt1Var2.r()) {
            jt1Var2.u();
        } else {
            by1 by1Var = (by1) this.t;
            long jC = pv0Var2.c();
            a0a a0aVar = by1Var.t;
            xx1 xx1Var = new xx1(jC);
            a0aVar.getClass();
            a0aVar.l(null, xx1Var);
            this.u.invoke(new jj8(pv0Var2, this.v, this.w, this.x), jt1Var2, 0);
        }
        return g2b.a;
    }
}
