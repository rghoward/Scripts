package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pj2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ String t;
    public final /* synthetic */ lh2 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;

    public pj2(String str, lh2 lh2Var, boolean z, boolean z2, boolean z3) {
        this.t = str;
        this.u = lh2Var;
        this.v = z;
        this.w = z2;
        this.x = z3;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6 ox6VarG = ir9.g(fk2.g, fk2.e);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarG);
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
            rd7.d(jt1Var2, bt1.a.f, fl6VarD);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                rh.b(iD, jt1Var2, iD, bVar);
            }
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            Object objF = jt1Var2.f();
            if (objF == jt1.a.a) {
                objF = new m32(1);
                jt1Var2.C(objF);
            }
            ox6 ox6VarA = pb9.a(ox6.a.t, (oh4) objF);
            lh2 lh2Var = this.u;
            long j = lh2Var.o;
            boolean z = this.w;
            boolean z2 = this.x;
            if (z && z2) {
                j = lh2Var.p;
            } else if (z && !z2) {
                j = lh2Var.q;
            } else if (this.v && z2) {
                j = lh2Var.t;
            } else if (z2) {
                j = lh2Var.n;
            }
            long j2 = j;
            jt1Var2.K(-969417610);
            yz9 yz9VarA = tq9.a(j2, zs4.e(wy6.v, jt1Var2), null, jt1Var2, 0, 12);
            jt1Var2.B();
            mia.b(this.t, ox6VarA, ((uh1) yz9VarA.getValue()).a, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 261112);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
