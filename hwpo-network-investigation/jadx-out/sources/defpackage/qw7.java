package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class qw7<K, V> extends t1<K, V> {
    public static final qw7 v = new qw7(yxa.e, 0);
    public final yxa<K, V> t;
    public final int u;

    public qw7(yxa<K, V> yxaVar, int i) {
        this.t = yxaVar;
        this.u = i;
    }

    public final qw7 b(Object obj, z86 z86Var) {
        yxa.a aVarU = this.t.u(obj != null ? obj.hashCode() : 0, 0, obj, z86Var);
        return aVarU == null ? this : new qw7(aVarU.a, this.u + aVarU.b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.t.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) this.t.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
