package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lw9 implements xe2.a<Object> {
    public final /* synthetic */ kx6.a t;
    public final /* synthetic */ mw9 u;

    public lw9(mw9 mw9Var, kx6.a aVar) {
        this.u = mw9Var;
        this.t = aVar;
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
    @Override // xe2.a
    public final void d(Exception exc) {
        mw9 mw9Var = this.u;
        kx6.a<?> aVar = this.t;
        kx6.a<?> aVar2 = mw9Var.y;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        mw9 mw9Var2 = this.u;
        kx6.a aVar3 = this.t;
        gn2 gn2Var = mw9Var2.u;
        ko5 ko5Var = mw9Var2.z;
        xe2<Data> xe2Var = aVar3.c;
        gn2Var.e(ko5Var, exc, xe2Var, xe2Var.getDataSource());
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
    @Override // xe2.a
    public final void e(Object obj) {
        mw9 mw9Var = this.u;
        kx6.a<?> aVar = this.t;
        kx6.a<?> aVar2 = mw9Var.y;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        mw9 mw9Var2 = this.u;
        kx6.a aVar3 = this.t;
        k13 k13Var = mw9Var2.t.p;
        if (obj != null && k13Var.c(aVar3.c.getDataSource())) {
            mw9Var2.x = obj;
            mw9Var2.u.o(gn2.e.u);
        } else {
            gn2 gn2Var = mw9Var2.u;
            ko5 ko5Var = aVar3.a;
            xe2<Data> xe2Var = aVar3.c;
            gn2Var.f(ko5Var, obj, xe2Var, xe2Var.getDataSource(), mw9Var2.z);
        }
    }
}
