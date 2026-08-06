package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hu extends wp5 implements ei4<jv, jt1, Integer, g2b> {
    public final /* synthetic */ fv9<Object> u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ su<Object> w;
    public final /* synthetic */ fr1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(fv9 fv9Var, Object obj, su suVar, fr1 fr1Var) {
        super(3);
        this.u = fv9Var;
        this.v = obj;
        this.w = suVar;
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
    @Override // defpackage.ei4
    public final g2b invoke(jv jvVar, jt1 jt1Var, Integer num) {
        jv jvVar2 = jvVar;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? jt1Var2.J(jvVar2) : jt1Var2.j(jvVar2) ? 4 : 2;
        }
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            fv9<Object> fv9Var = this.u;
            boolean zJ = jt1Var2.J(fv9Var);
            Object obj = this.v;
            boolean zJ2 = zJ | jt1Var2.j(obj);
            su<Object> suVar = this.w;
            boolean zJ3 = zJ2 | jt1Var2.j(suVar);
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ3 || objF == c0187a) {
                objF = new gu(fv9Var, obj, suVar);
                jt1Var2.C(objF);
            }
            wd3.a(jvVar2, (oh4) objF, jt1Var2);
            c37<Object, yz9<kg5>> c37Var = suVar.d;
            jvVar2.getClass();
            c37Var.m(obj, ((kv) jvVar2).a);
            Object objF2 = jt1Var2.f();
            if (objF2 == c0187a) {
                objF2 = new ou(jvVar2);
                jt1Var2.C(objF2);
            }
            this.x.invoke((ou) objF2, obj, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
