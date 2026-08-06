package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ej2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ci4<jt1, Integer, g2b> t;
    public final /* synthetic */ ci4<jt1, Integer, g2b> u;
    public final /* synthetic */ ci4<jt1, Integer, g2b> v;
    public final /* synthetic */ lh2 w;
    public final /* synthetic */ wja x;

    /* JADX WARN: Multi-variable type inference failed */
    public ej2(ci4<? super jt1, ? super Integer, g2b> ci4Var, ci4<? super jt1, ? super Integer, g2b> ci4Var2, ci4<? super jt1, ? super Integer, g2b> ci4Var3, lh2 lh2Var, wja wjaVar) {
        this.t = ci4Var;
        this.u = ci4Var2;
        this.v = ci4Var3;
        this.w = lh2Var;
        this.x = wjaVar;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        c30.e eVar;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(aVar, 1.0f);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
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
            bt1.a.e eVar2 = bt1.a.e;
            rd7.d(jt1Var2, eVar2, kw7VarY);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                rh.b(iD, jt1Var2, iD, bVar);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(jt1Var2, dVar, ox6VarC2);
            ci4<jt1, Integer, g2b> ci4Var = this.t;
            ci4<jt1, Integer, g2b> ci4Var2 = this.u;
            if (ci4Var == null || ci4Var2 == null) {
                eVar = ci4Var != null ? c30.a : c30.b;
            } else {
                eVar = c30.f;
            }
            ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
            ny8 ny8VarA = ly8.a(eVar, di.a.k, jt1Var2, 48);
            int iD2 = jt1Var2.D();
            kw7 kw7VarY2 = jt1Var2.y();
            ox6 ox6VarC4 = it1.c(jt1Var2, ox6VarC3);
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
            rd7.d(jt1Var2, cVar, ny8VarA);
            rd7.d(jt1Var2, eVar2, kw7VarY2);
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD2))) {
                rh.b(iD2, jt1Var2, iD2, bVar);
            }
            rd7.d(jt1Var2, dVar, ox6VarC4);
            if (ci4Var != null) {
                jt1Var2.K(-516028300);
                mia.a(this.x, gr1.b(-738208900, new dj2(ci4Var), jt1Var2), jt1Var2, 48);
                jt1Var2.B();
            } else {
                jt1Var2.K(-515838022);
                jt1Var2.B();
            }
            if (ci4Var2 == null) {
                jt1Var2.K(-515799087);
            } else {
                jt1Var2.K(260455984);
                ci4Var2.invoke(jt1Var2, 0);
            }
            jt1Var2.B();
            jt1Var2.I();
            if (this.v == null && ci4Var == null && ci4Var2 == null) {
                jt1Var2.K(-250277930);
                jt1Var2.B();
            } else {
                jt1Var2.K(-250360576);
                v33.a(null, 0.0f, this.w.x, jt1Var2, 0, 3);
                jt1Var2.B();
            }
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
