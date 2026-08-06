package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ax6 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ ci4<jt1, Integer, omb> t;
    public final /* synthetic */ qt<Float, bw> u;
    public final /* synthetic */ hn9 v;
    public final /* synthetic */ ci4<jt1, Integer, g2b> w;
    public final /* synthetic */ fr1 x;
    public final /* synthetic */ mh4<g2b> y;
    public final /* synthetic */ t72 z;

    public ax6(ci4 ci4Var, qt qtVar, hn9 hn9Var, ci4 ci4Var2, fr1 fr1Var, mh4 mh4Var, t72 t72Var, boolean z) {
        this.t = ci4Var;
        this.u = qtVar;
        this.v = hn9Var;
        this.w = ci4Var2;
        this.x = fr1Var;
        this.y = mh4Var;
        this.z = t72Var;
        this.A = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6 ox6VarC = hnb.c(ir9.c(ox6.a.t, 1.0f), this.t.invoke(jt1Var2, 0));
            final qt<Float, bw> qtVar = this.u;
            boolean zJ = jt1Var2.j(qtVar);
            Object objF = jt1Var2.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: rw6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ro4 ro4Var = (ro4) obj;
                        float fFloatValue = ((Number) qtVar.d()).floatValue();
                        float fD = bx6.d(ro4Var, fFloatValue);
                        float fE = bx6.e(ro4Var, fFloatValue);
                        ro4Var.k(fE == 0.0f ? 1.0f : fD / fE);
                        ro4Var.o1(bx6.a);
                        return g2b.a;
                    }
                };
                jt1Var2.C(objF);
            }
            ox6 ox6VarA = po4.a(ox6VarC, (oh4) objF);
            hn9 hn9Var = this.v;
            ox6 ox6VarA2 = po4.a(ox6VarA, new gu0(0, hn9Var));
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
            int iD = jt1Var2.D();
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarA2);
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
            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
            ci4<jt1, Integer, g2b> ci4Var = this.w;
            if (ci4Var != null) {
                jt1Var2.K(1352934765);
                dn9.a(gr1.b(2000500644, new zw6(hn9Var, this.y, this.z, this.A, ws3.b(jt1Var2, R.string.m3c_bottom_sheet_dismiss_description), ws3.b(jt1Var2, R.string.m3c_bottom_sheet_expand_description), ws3.b(jt1Var2, R.string.m3c_bottom_sheet_collapse_description), ci4Var), jt1Var2), jt1Var2, 54);
                jt1Var2.B();
            } else {
                jt1Var2.K(1356009965);
                jt1Var2.B();
            }
            this.x.invoke(cj1.a, jt1Var2, 6);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
