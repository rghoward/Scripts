package defpackage;

import io.intercom.android.sdk.AppIdentityInjector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z00 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ z00(int i, Object obj) {
        this.t = i;
        this.u = obj;
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
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return AppIdentityInjector.onClientError$lambda$5((AppIdentityInjector) obj2, (Throwable) obj);
            case 1:
                d73 d73Var = (d73) obj;
                long j = ((uh1) ((yz9) obj2).getValue()).a;
                if (!uh1.c(j, uh1.k)) {
                    d73.W0(d73Var, j, 0L, 0L, 0.0f, 126);
                }
                return g2b.a;
            default:
                vv vvVar = (vv) obj;
                ((ci4) obj2).invoke(vvVar.e.getValue(), b0a.v.b.invoke(vvVar.f));
                return g2b.a;
        }
    }
}
