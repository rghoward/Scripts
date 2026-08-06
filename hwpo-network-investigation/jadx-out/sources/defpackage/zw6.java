package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zw6 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ci4<jt1, Integer, g2b> A;
    public final /* synthetic */ hn9 t;
    public final /* synthetic */ mh4<g2b> u;
    public final /* synthetic */ t72 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: Multi-variable type inference failed */
    public zw6(hn9 hn9Var, mh4<g2b> mh4Var, t72 t72Var, boolean z, String str, String str2, String str3, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        this.t = hn9Var;
        this.u = mh4Var;
        this.v = t72Var;
        this.w = z;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = ci4Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            final hn9 hn9Var = this.t;
            boolean zJ = jt1Var2.J(hn9Var);
            final mh4<g2b> mh4Var = this.u;
            boolean zJ2 = zJ | jt1Var2.J(mh4Var);
            final t72 t72Var = this.v;
            boolean zJ3 = zJ2 | jt1Var2.j(t72Var);
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ3 || objF == c0187a) {
                objF = new mh4() { // from class: sw6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        hn9 hn9Var2 = hn9Var;
                        int iOrdinal = ((in9) hn9Var2.d.g.getValue()).ordinal();
                        if (iOrdinal != 1) {
                            t72 t72Var2 = t72Var;
                            if (iOrdinal != 2) {
                                oy0.d(t72Var2, null, null, new ww6(hn9Var2, null), 3);
                            } else {
                                oy0.d(t72Var2, null, null, new vw6(hn9Var2, null), 3);
                            }
                        } else {
                            mh4Var.invoke();
                            g2b g2bVar = g2b.a;
                        }
                        return g2b.a;
                    }
                };
                jt1Var2.C(objF);
            }
            final mh4 mh4Var2 = (mh4) objF;
            ox6 ox6VarA = it1.a(ox6.a.t, new ei4() { // from class: ue1
                @Override // defpackage.ei4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h27 h27Var;
                    jt1 jt1Var3 = (jt1) obj2;
                    ((Integer) obj3).getClass();
                    jt1Var3.K(-756081143);
                    va5 va5Var = (va5) jt1Var3.F(xa5.a);
                    if (va5Var instanceof bb5) {
                        jt1Var3.K(-1604682242);
                        jt1Var3.B();
                        h27Var = null;
                    } else {
                        jt1Var3.K(-1604549624);
                        Object objF2 = jt1Var3.f();
                        if (objF2 == jt1.a.a) {
                            objF2 = new i27();
                            jt1Var3.C(objF2);
                        }
                        h27Var = (h27) objF2;
                        jt1Var3.B();
                    }
                    ox6 ox6VarA2 = we1.a(ox6.a.t, h27Var, va5Var, true, null, mh4Var2);
                    jt1Var3.B();
                    return ox6VarA2;
                }
            });
            boolean zJ4 = jt1Var2.J(mh4Var) | jt1Var2.c(this.w) | jt1Var2.J(hn9Var) | jt1Var2.J(this.x) | jt1Var2.J(this.y) | jt1Var2.j(t72Var) | jt1Var2.J(this.z);
            Object objF2 = jt1Var2.f();
            if (zJ4 || objF2 == c0187a) {
                final boolean z = this.w;
                final String str = this.x;
                final String str2 = this.y;
                final String str3 = this.z;
                final mh4<g2b> mh4Var3 = this.u;
                final t72 t72Var2 = this.v;
                oh4 oh4Var = new oh4() { // from class: tw6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        final hn9 hn9Var2 = hn9Var;
                        wj<in9> wjVar = hn9Var2.d;
                        hc9 hc9Var = (hc9) obj;
                        if (z) {
                            zw5 zw5Var = new zw5(1, mh4Var3);
                            ho5<Object>[] ho5VarArr = ec9.a;
                            hc9Var.d(kb9.v, new k3(str, zw5Var));
                            in9 in9Var = (in9) wjVar.g.getValue();
                            final t72 t72Var3 = t72Var2;
                            in9 in9Var2 = in9.v;
                            if (in9Var == in9Var2) {
                                hc9Var.d(kb9.t, new k3(str2, new mh4() { // from class: uw6
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        if (hn9Var2.d.d.invoke(in9.u).booleanValue()) {
                                            oy0.d(t72Var3, null, null, new xw6(hn9Var2, null), 3);
                                        }
                                        return Boolean.TRUE;
                                    }
                                }));
                            } else if (wjVar.e().e(in9Var2)) {
                                hc9Var.d(kb9.u, new k3(str3, new n22(1, hn9Var2, t72Var3)));
                            }
                        }
                        return g2b.a;
                    }
                };
                jt1Var2.C(oh4Var);
                objF2 = oh4Var;
            }
            ox6 ox6VarB = pb9.b(ox6VarA, true, (oh4) objF2);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarB);
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
            sh.a(this.A, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
