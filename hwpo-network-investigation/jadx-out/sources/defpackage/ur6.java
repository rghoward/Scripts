package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ur6 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ox6 t;
    public final /* synthetic */ x69 u;
    public final /* synthetic */ fr1 v;

    public ur6(ox6 ox6Var, x69 x69Var, fr1 fr1Var) {
        this.t = ox6Var;
        this.u = x69Var;
        this.v = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6 ox6VarH = q69.h(oj5.h(eo7.k(this.t, 0.0f, 8.0f, 1)), this.u, 14);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarH);
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
            rd7.d(jt1Var2, bt1.a.f, aj1VarA);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                rh.b(iD, jt1Var2, iD, bVar);
            }
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            this.v.invoke(cj1.a, jt1Var2, 6);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
