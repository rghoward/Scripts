package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sq extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ d68 u;
    public final /* synthetic */ h37 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(d68 d68Var, h37 h37Var) {
        super(2);
        this.u = d68Var;
        this.v = h37Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = qq.u;
                jt1Var2.C(objF);
            }
            ox6 ox6VarB = pb9.b(ox6.a.t, false, (oh4) objF);
            d68 d68Var = this.u;
            boolean zJ = jt1Var2.j(d68Var);
            Object objF2 = jt1Var2.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new rq(d68Var);
                jt1Var2.C(objF2);
            }
            ox6 ox6VarB2 = yq5.b(ox6VarB.H(new bi7((oh4) objF2)), d68Var.getCanCalculatePosition() ? 1.0f : 0.0f);
            u93 u93Var = fq.a;
            ci4 ci4Var = (ci4) this.v.getValue();
            Object objF3 = jt1Var2.f();
            if (objF3 == c0187a) {
                objF3 = uq.a;
                jt1Var2.C(objF3);
            }
            fl6 fl6Var = (fl6) objF3;
            int iHashCode = Long.hashCode(jt1Var2.v());
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarB2);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (jt1Var2.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var2.q();
            if (jt1Var2.l()) {
                jt1Var2.k(aVar);
            } else {
                jt1Var2.z();
            }
            rd7.d(jt1Var2, bt1.a.f, fl6Var);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var2, bt1.a.h);
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            sh.a(ci4Var, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
