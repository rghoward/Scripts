package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pqb extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ qqb u;
    public final /* synthetic */ et1 v;
    public final /* synthetic */ ci4<jt1, Integer, g2b> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pqb(qqb qqbVar, et1 et1Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        super(2);
        this.u = qqbVar;
        this.v = et1Var;
        this.w = ci4Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            qqb qqbVar = this.u;
            cm cmVar = qqbVar.t;
            boolean zJ = jt1Var2.j(qqbVar);
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new nqb(qqbVar, null);
                jt1Var2.C(objF);
            }
            wd3.d(jt1Var2, (ci4) objF, cmVar);
            boolean zJ2 = jt1Var2.j(qqbVar);
            Object objF2 = jt1Var2.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new oqb(qqbVar, null);
                jt1Var2.C(objF2);
            }
            wd3.d(jt1Var2, (ci4) objF2, cmVar);
            this.v.a(cmVar, this.w, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
