package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x1<E extends Map.Entry<? extends K, ? extends V>, K, V> extends f2<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        kh6<K, V> kh6Var = ((lh6) this).t;
        kh6Var.getClass();
        int iF = kh6Var.f((K) entry.getKey());
        if (iF < 0) {
            return false;
        }
        V[] vArr = kh6Var.u;
        vArr.getClass();
        return xj5.a(vArr[iF], entry.getValue());
    }

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
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        kh6<K, V> kh6Var = ((lh6) this).t;
        kh6Var.getClass();
        kh6Var.b();
        int iF = kh6Var.f((K) entry.getKey());
        if (iF >= 0) {
            V[] vArr = kh6Var.u;
            vArr.getClass();
            if (xj5.a(vArr[iF], entry.getValue())) {
                kh6Var.j(iF);
                return true;
            }
        }
        return false;
    }
}
