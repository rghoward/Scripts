package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rz2 implements oh4 {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ rz2(r47 r47Var, List list, boolean z) {
        this.v = r47Var;
        this.u = z;
        this.w = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [l76, tz2] */
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
        Object obj2 = this.w;
        Object obj3 = this.v;
        final boolean z = this.u;
        switch (i) {
            case 0:
                final r47 r47Var = (r47) obj3;
                final List list = (List) obj2;
                ?? r5 = new g76() { // from class: tz2
                    @Override // defpackage.g76
                    public final void t(m76 m76Var, s66.a aVar) {
                        boolean z2 = z;
                        List list2 = list;
                        r47 r47Var2 = r47Var;
                        if (z2 && !list2.contains(r47Var2)) {
                            list2.add(r47Var2);
                        }
                        if (aVar == s66.a.ON_START && !list2.contains(r47Var2)) {
                            list2.add(r47Var2);
                        }
                        if (aVar == s66.a.ON_STOP) {
                            list2.remove(r47Var2);
                        }
                    }
                };
                r47Var.A.j.a(r5);
                return new xz2.c(r47Var, r5);
            default:
                String str = (String) obj3;
                ms9 ms9Var = (ms9) obj2;
                hc9 hc9Var = (hc9) obj;
                if (z) {
                    ec9.c(hc9Var, 0);
                }
                rs9 rs9Var = new rs9(0, ms9Var);
                ho5<Object>[] ho5VarArr = ec9.a;
                hc9Var.d(kb9.v, new k3(null, rs9Var));
                ec9.d(str, hc9Var);
                return g2b.a;
        }
    }

    public /* synthetic */ rz2(boolean z, String str, ms9 ms9Var) {
        this.u = z;
        this.v = str;
        this.w = ms9Var;
    }
}
