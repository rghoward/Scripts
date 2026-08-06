package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wh implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ fr1 A;
    public final /* synthetic */ ci4<jt1, Integer, g2b> t;
    public final /* synthetic */ ci4<jt1, Integer, g2b> u;
    public final /* synthetic */ ci4<jt1, Integer, g2b> v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public wh(ci4 ci4Var, ci4 ci4Var2, ci4 ci4Var3, long j, long j2, long j3, long j4, fr1 fr1Var) {
        this.t = ci4Var;
        this.u = ci4Var2;
        this.v = ci4Var3;
        this.w = j;
        this.x = j2;
        this.y = j3;
        this.z = j4;
        this.A = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6 ox6VarH = eo7.h(ox6.a.t, ci.a);
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
            ci4<jt1, Integer, g2b> ci4Var = this.t;
            if (ci4Var == null) {
                jt1Var2.K(346092326);
            } else {
                jt1Var2.K(346092327);
                nu1.a(zy1.a.a(new uh1(this.w)), gr1.b(-1128150638, new th(ci4Var), jt1Var2), jt1Var2, 56);
            }
            jt1Var2.B();
            ci4<jt1, Integer, g2b> ci4Var2 = this.u;
            if (ci4Var2 == null) {
                jt1Var2.K(346396529);
            } else {
                jt1Var2.K(346396530);
                bzb.b(this.x, j0b.a(i03.x, jt1Var2), gr1.b(71284337, new uh(ci4Var, ci4Var2), jt1Var2), jt1Var2, 384);
            }
            jt1Var2.B();
            ci4<jt1, Integer, g2b> ci4Var3 = this.v;
            if (ci4Var3 == null) {
                jt1Var2.K(347174009);
            } else {
                jt1Var2.K(347174010);
                bzb.b(this.y, j0b.a(i03.z, jt1Var2), gr1.b(705583346, new vh(ci4Var3), jt1Var2), jt1Var2, 384);
            }
            jt1Var2.B();
            c15 c15Var = new c15(di.a.o);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD2 = jt1Var2.D();
            kw7 kw7VarY2 = jt1Var2.y();
            ox6 ox6VarC2 = it1.c(jt1Var2, c15Var);
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
            rd7.d(jt1Var2, cVar, fl6VarD);
            rd7.d(jt1Var2, eVar, kw7VarY2);
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD2))) {
                rh.b(iD2, jt1Var2, iD2, bVar);
            }
            rd7.d(jt1Var2, dVar, ox6VarC2);
            bzb.b(this.z, j0b.a(i03.u, jt1Var2), this.A, jt1Var2, 0);
            jt1Var2.I();
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
