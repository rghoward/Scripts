package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jj8 implements b4a, jv0 {
    public final jv0 a;
    public final f50 b;
    public final String c;
    public final nz1 d;

    public jj8(jv0 jv0Var, f50 f50Var, String str, nz1 nz1Var) {
        this.a = jv0Var;
        this.b = f50Var;
        this.c = str;
        this.d = nz1Var;
    }

    @Override // defpackage.b4a
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.b4a
    public final nz1 b() {
        return this.d;
    }

    @Override // defpackage.b4a
    public final boolean e() {
        return true;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jj8) {
            jj8 jj8Var = (jj8) obj;
            if (xj5.a(this.a, jj8Var.a) && this.b == jj8Var.b && xj5.a(this.c, jj8Var.c)) {
                sp0 sp0Var = di.a.e;
                if (sp0Var.equals(sp0Var) && xj5.a(this.d, jj8Var.d) && Float.compare(1.0f, 1.0f) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jv0
    public final ox6 f(ox6 ox6Var, sp0 sp0Var) {
        return this.a.f(ox6Var, sp0Var);
    }

    @Override // defpackage.b4a
    public final di g() {
        return di.a.e;
    }

    @Override // defpackage.b4a
    public final String getContentDescription() {
        return this.c;
    }

    @Override // defpackage.b4a
    public final f50 h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(true) + h44.a((this.d.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 1.0f, 961);
    }

    @Override // defpackage.b4a
    public final wh1 j() {
        return null;
    }

    @Override // defpackage.jv0
    public final ox6 k() {
        throw null;
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.b + ", contentDescription=" + this.c + ", alignment=" + di.a.e + ", contentScale=" + this.d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
