package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xb2 extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ tva<Object> u;
    public final /* synthetic */ a04<Float> v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ fr1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(tva tvaVar, a04 a04Var, Object obj, fr1 fr1Var) {
        super(2);
        this.u = tvaVar;
        this.v = a04Var;
        this.w = obj;
        this.x = fr1Var;
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
        Object objB;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            dza dzaVar = b0a.v;
            tva<Object> tvaVar = this.u;
            boolean zG = tvaVar.g();
            l4c l4cVar = tvaVar.a;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zG) {
                jt1Var2.K(1666827533);
                jt1Var2.B();
                objB = l4cVar.b();
            } else {
                jt1Var2.K(1666573488);
                boolean zJ = jt1Var2.J(tvaVar);
                objB = jt1Var2.f();
                if (zJ || objB == c0187a) {
                    hu9 hu9VarA = hu9.a.a();
                    oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
                    hu9 hu9VarB = hu9.a.b(hu9VarA);
                    try {
                        Object objB2 = l4cVar.b();
                        hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                        jt1Var2.C(objB2);
                        objB = objB2;
                    } catch (Throwable th) {
                        hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                        throw th;
                    }
                }
                jt1Var2.B();
            }
            jt1Var2.K(1378811975);
            Object obj = this.w;
            float f = xj5.a(objB, obj) ? 1.0f : 0.0f;
            jt1Var2.B();
            Float fValueOf = Float.valueOf(f);
            boolean zJ2 = jt1Var2.J(tvaVar);
            Object objF = jt1Var2.f();
            if (zJ2 || objF == c0187a) {
                objF = bl7.f(new vb2(tvaVar));
                jt1Var2.C(objF);
            }
            Object value = ((yz9) objF).getValue();
            jt1Var2.K(1378811975);
            float f2 = xj5.a(value, obj) ? 1.0f : 0.0f;
            jt1Var2.B();
            Float fValueOf2 = Float.valueOf(f2);
            boolean zJ3 = jt1Var2.J(tvaVar);
            Object objF2 = jt1Var2.f();
            if (zJ3 || objF2 == c0187a) {
                objF2 = bl7.f(new wb2(tvaVar));
                jt1Var2.C(objF2);
            }
            jt1Var2.K(955869654);
            jt1Var2.B();
            tva.d dVarC = owa.c(tvaVar, fValueOf, fValueOf2, this.v, dzaVar, jt1Var2, 0);
            boolean zJ4 = jt1Var2.J(dVarC);
            Object objF3 = jt1Var2.f();
            if (zJ4 || objF3 == c0187a) {
                objF3 = new ub2(dVarC);
                jt1Var2.C(objF3);
            }
            ox6 ox6VarA = po4.a(ox6.a.t, (oh4) objF3);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(jt1Var2.v());
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
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            if (jt1Var2.l()) {
                jt1Var2.b(bVar, numValueOf);
            }
            rd7.c(jt1Var2, bt1.a.h);
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            this.x.invoke(obj, jt1Var2, 0);
            jt1Var2.I();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
