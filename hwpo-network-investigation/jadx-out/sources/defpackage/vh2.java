package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vh2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ fr1 t;
    public final /* synthetic */ ci4<jt1, Integer, g2b> u;
    public final /* synthetic */ fr1 v;

    public vh2(fr1 fr1Var, ci4 ci4Var, fr1 fr1Var2) {
        this.t = fr1Var;
        this.u = ci4Var;
        this.v = fr1Var2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            aj1 aj1VarA = yi1.a(c30.f, di.a.m, jt1Var2, 6);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var2, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var2.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var2.q();
            if (jt1Var2.l()) {
                jt1Var2.k(aVar2);
            } else {
                jt1Var2.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(jt1Var2, cVar, aj1VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(jt1Var2, eVar, kw7VarY);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                rh.b(iD, jt1Var2, iD, bVar);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(jt1Var2, dVar, ox6VarC);
            qs5 qs5Var = new qs5(false, 1.0f);
            sp0 sp0Var = di.a.a;
            fl6 fl6VarD = dv0.d(sp0Var, false);
            int iD2 = jt1Var2.D();
            kw7 kw7VarY2 = jt1Var2.y();
            ox6 ox6VarC2 = it1.c(jt1Var2, qs5Var);
            if (jt1Var2.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var2.q();
            if (jt1Var2.l()) {
                jt1Var2.k(aVar2);
            } else {
                jt1Var2.z();
            }
            rd7.d(jt1Var2, cVar, fl6VarD);
            rd7.d(jt1Var2, eVar, kw7VarY2);
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD2))) {
                rh.b(iD2, jt1Var2, iD2, bVar);
            }
            rd7.d(jt1Var2, dVar, ox6VarC2);
            fr1 fr1Var = this.t;
            cj1 cj1Var = cj1.a;
            fr1Var.invoke(cj1Var, jt1Var2, 6);
            jt1Var2.I();
            ox6 ox6VarH = eo7.h(cj1Var.a(aVar, di.a.o), xh2.a);
            fl6 fl6VarD2 = dv0.d(sp0Var, false);
            int iD3 = jt1Var2.D();
            kw7 kw7VarY3 = jt1Var2.y();
            ox6 ox6VarC3 = it1.c(jt1Var2, ox6VarH);
            if (jt1Var2.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var2.q();
            if (jt1Var2.l()) {
                jt1Var2.k(aVar2);
            } else {
                jt1Var2.z();
            }
            rd7.d(jt1Var2, cVar, fl6VarD2);
            rd7.d(jt1Var2, eVar, kw7VarY3);
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD3))) {
                rh.b(iD3, jt1Var2, iD3, bVar);
            }
            rd7.d(jt1Var2, dVar, ox6VarC3);
            bzb.b(hi1.d(i03.t, jt1Var2), j0b.a(i03.u, jt1Var2), gr1.b(-1103927529, new uh2(this.u, this.v), jt1Var2), jt1Var2, 384);
            jt1Var2.I();
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
