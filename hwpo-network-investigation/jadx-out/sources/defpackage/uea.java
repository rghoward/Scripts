package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uea implements ei4<ox6, jt1, Integer, g2b> {
    public final /* synthetic */ yz9<Float> t;
    public final /* synthetic */ long u;
    public final /* synthetic */ wja v;
    public final /* synthetic */ ci4<jt1, Integer, g2b> w;

    public uea(tva.d dVar, long j, wja wjaVar, ci4 ci4Var) {
        this.t = dVar;
        this.u = j;
        this.v = wjaVar;
        this.w = ci4Var;
    }

    @Override // defpackage.ei4
    public final g2b invoke(ox6 ox6Var, jt1 jt1Var, Integer num) {
        ox6 ox6Var2 = ox6Var;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jt1Var2.J(ox6Var2) ? 4 : 2;
        }
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            final yz9<Float> yz9Var = this.t;
            boolean zJ = jt1Var2.J(yz9Var);
            Object objF = jt1Var2.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: tea
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ((ro4) obj).b(((Number) yz9Var.getValue()).floatValue());
                        return g2b.a;
                    }
                };
                jt1Var2.C(objF);
            }
            ox6 ox6VarA = po4.a(ox6Var2, (oh4) objF);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarA);
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
            yea.b(this.u, this.v, this.w, jt1Var2, 0);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
