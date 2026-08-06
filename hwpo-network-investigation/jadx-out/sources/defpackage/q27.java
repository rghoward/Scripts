package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q27<K, V> extends ph6<K, V> {
    public final vw7<K, V> v;
    public V w;

    public q27(vw7<K, V> vw7Var, K k, V v) {
        super(k, v);
        this.v = vw7Var;
        this.w = v;
    }

    @Override // defpackage.ph6, java.util.Map.Entry
    public final V getValue() {
        return this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ph6, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.w;
        this.w = v;
        tw7<K, V, Map.Entry<K, V>> tw7Var = this.v.t;
        sw7<K, V> sw7Var = tw7Var.w;
        K k = this.t;
        if (!sw7Var.containsKey(k)) {
            return v2;
        }
        boolean z = tw7Var.v;
        if (!z) {
            sw7Var.put(k, v);
        } else {
            if (!z) {
                vl.b();
                return null;
            }
            zxa zxaVar = tw7Var.t[tw7Var.u];
            Object obj = zxaVar.t[zxaVar.v];
            sw7Var.put(k, v);
            tw7Var.c(obj != null ? obj.hashCode() : 0, sw7Var.u, obj, 0);
        }
        tw7Var.z = sw7Var.w;
        return v2;
    }
}
