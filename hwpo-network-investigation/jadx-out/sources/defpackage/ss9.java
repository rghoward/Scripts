package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ss9 implements ei4<ci4<? super jt1, ? super Integer, ? extends g2b>, jt1, Integer, g2b> {
    public final /* synthetic */ ms9 t;
    public final /* synthetic */ ms9 u;
    public final /* synthetic */ gt3<ms9> v;
    public final /* synthetic */ String w;

    public ss9(ms9 ms9Var, ms9 ms9Var2, gt3<ms9> gt3Var, String str) {
        this.t = ms9Var;
        this.u = ms9Var2;
        this.v = gt3Var;
        this.w = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ei4
    public final g2b invoke(ci4<? super jt1, ? super Integer, ? extends g2b> ci4Var, jt1 jt1Var, Integer num) {
        ci4<? super jt1, ? super Integer, ? extends g2b> ci4Var2 = ci4Var;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jt1Var2.j(ci4Var2) ? 4 : 2;
        }
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            ms9 ms9Var = this.u;
            final ms9 ms9Var2 = this.t;
            boolean zA = xj5.a(ms9Var2, ms9Var);
            a04 a04VarE = zs4.e(wy6.w, jt1Var2);
            boolean zJ = jt1Var2.J(ms9Var2);
            final gt3<ms9> gt3Var = this.v;
            boolean zJ2 = zJ | jt1Var2.j(gt3Var);
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ2 || objF == c0187a) {
                objF = new mh4() { // from class: qs9
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        gt3 gt3Var2 = gt3Var;
                        Object obj = gt3Var2.a;
                        ms9 ms9Var3 = ms9Var2;
                        if (!xj5.a(ms9Var3, obj)) {
                            rh1.p(new t22(2, ms9Var3), gt3Var2.b);
                            vj8 vj8Var = gt3Var2.c;
                            if (vj8Var != null) {
                                vj8Var.invalidate();
                            }
                        }
                        return g2b.a;
                    }
                };
                jt1Var2.C(objF);
            }
            mh4 mh4Var = (mh4) objF;
            Object objF2 = jt1Var2.f();
            if (objF2 == c0187a) {
                objF2 = ut.a(!zA ? 1.0f : 0.0f);
                jt1Var2.C(objF2);
            }
            qt qtVar = (qt) objF2;
            Boolean boolValueOf = Boolean.valueOf(zA);
            boolean zJ3 = jt1Var2.j(qtVar) | jt1Var2.c(zA) | jt1Var2.j(a04VarE) | jt1Var2.J(mh4Var);
            Object objF3 = jt1Var2.f();
            if (zJ3 || objF3 == c0187a) {
                vs9 vs9Var = new vs9(qtVar, zA, a04VarE, mh4Var, null);
                jt1Var2.C(vs9Var);
                objF3 = vs9Var;
            }
            wd3.d(jt1Var2, (ci4) objF3, boolValueOf);
            yv<T, V> yvVar = qtVar.c;
            a04 a04VarE2 = zs4.e(wy6.u, jt1Var2);
            Object objF4 = jt1Var2.f();
            if (objF4 == c0187a) {
                objF4 = ut.a(zA ? 0.8f : 1.0f);
                jt1Var2.C(objF4);
            }
            qt qtVar2 = (qt) objF4;
            Boolean boolValueOf2 = Boolean.valueOf(zA);
            boolean zJ4 = jt1Var2.j(qtVar2) | jt1Var2.c(zA) | jt1Var2.j(a04VarE2);
            Object objF5 = jt1Var2.f();
            if (zJ4 || objF5 == c0187a) {
                objF5 = new ws9(qtVar2, zA, a04VarE2, null);
                jt1Var2.C(objF5);
            }
            wd3.d(jt1Var2, (ci4) objF5, boolValueOf2);
            yv<T, V> yvVar2 = qtVar2.c;
            ox6 ox6VarB = po4.b(ox6.a.t, ((Number) yvVar2.u.getValue()).floatValue(), ((Number) yvVar2.u.getValue()).floatValue(), ((Number) yvVar.u.getValue()).floatValue(), 0.0f, null, 131064);
            boolean zC = jt1Var2.c(zA) | jt1Var2.J(ms9Var2);
            String str = this.w;
            boolean zJ5 = zC | jt1Var2.J(str);
            Object objF6 = jt1Var2.f();
            if (zJ5 || objF6 == c0187a) {
                objF6 = new rz2(zA, str, ms9Var2);
                jt1Var2.C(objF6);
            }
            ox6 ox6VarB2 = pb9.b(ox6VarB, false, (oh4) objF6);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = jt1Var2.D();
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
            rd7.d(jt1Var2, bt1.a.f, fl6VarD);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l() || !xj5.a(jt1Var2.f(), Integer.valueOf(iD))) {
                rh.b(iD, jt1Var2, iD, bVar);
            }
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            sh.a(ci4Var2, jt1Var2, iIntValue & 14);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
