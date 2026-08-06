package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oea implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ h37<cr9> t;
    public final /* synthetic */ jfa.b u;
    public final /* synthetic */ go7 v;
    public final /* synthetic */ ci4<jt1, Integer, g2b> w;

    public oea(h37 h37Var, jfa.b bVar, go7 go7Var, ci4 ci4Var) {
        this.t = h37Var;
        this.u = bVar;
        this.v = go7Var;
        this.w = ci4Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6 ox6VarD = yq5.d(ox6.a.t, "Container");
            final nea neaVar = new nea(this.t, h37.class, "value", "getValue()Ljava/lang/Object;", 0);
            final di.b bVarE = yea.e(this.u);
            final go7 go7Var = this.v;
            ox6 ox6VarE = z63.e(ox6VarD, new oh4() { // from class: lm7
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    cz1 cz1Var = (cz1) obj;
                    long j = ((cr9) neaVar.get()).a;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    if (fIntBitsToFloat > 0.0f) {
                        float fU0 = cz1Var.U0(4.0f);
                        tq5 layoutDirection = cz1Var.getLayoutDirection();
                        go7 go7Var2 = go7Var;
                        float fU1 = cz1Var.U0(go7Var2.b(layoutDirection));
                        float f = fIntBitsToFloat / 2.0f;
                        float fA = bVarE.a(wk6.b(fIntBitsToFloat), wk6.b((Float.intBitsToFloat((int) (cz1Var.c() >> 32)) - fU1) - cz1Var.U0(go7Var2.c(cz1Var.getLayoutDirection()))), cz1Var.getLayoutDirection()) + fU1 + f;
                        float f2 = (fA - f) - fU0;
                        float f3 = f2 < 0.0f ? 0.0f : f2;
                        float f4 = fA + f + fU0;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cz1Var.c() >> 32));
                        float f5 = f4 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f4;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                        float f6 = (-fIntBitsToFloat3) / 2.0f;
                        float f7 = fIntBitsToFloat3 / 2.0f;
                        s41.b bVarY0 = cz1Var.Y0();
                        long jD = bVarY0.d();
                        bVarY0.a().f();
                        try {
                            bVarY0.a.b(f3, f6, f5, f7, 0);
                            cz1Var.K1();
                        } finally {
                            x3.b(bVarY0, jD);
                        }
                    } else {
                        cz1Var.K1();
                    }
                    return g2b.a;
                }
            });
            fl6 fl6VarD = dv0.d(di.a.a, true);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarE);
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
            sh.a(this.w, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
