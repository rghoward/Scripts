package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xk7 implements ko5 {
    public final g11 b = new g11();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            g11 g11Var = this.b;
            if (i >= g11Var.v) {
                return;
            }
            mk7 mk7Var = (mk7) g11Var.f(i);
            V vJ = this.b.j(i);
            mk7.b<T> bVar = mk7Var.b;
            if (mk7Var.d == null) {
                mk7Var.d = mk7Var.c.getBytes(ko5.a);
            }
            bVar.a(mk7Var.d, vJ, messageDigest);
            i++;
        }
    }

    public final <T> T c(mk7<T> mk7Var) {
        g11 g11Var = this.b;
        return g11Var.containsKey(mk7Var) ? (T) g11Var.get(mk7Var) : mk7Var.a;
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof xk7) {
            return this.b.equals(((xk7) obj).b);
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
