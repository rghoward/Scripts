package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g11<K, V> extends n30<K, V> {
    public int z;

    @Override // defpackage.ep9, java.util.Map
    public final void clear() {
        this.z = 0;
        super.clear();
    }

    @Override // defpackage.ep9
    public final void g(ep9<? extends K, ? extends V> ep9Var) {
        this.z = 0;
        super.g(ep9Var);
    }

    @Override // defpackage.ep9
    public final V h(int i) {
        this.z = 0;
        return (V) super.h(i);
    }

    @Override // defpackage.ep9, java.util.Map
    public final int hashCode() {
        if (this.z == 0) {
            this.z = super.hashCode();
        }
        return this.z;
    }

    @Override // defpackage.ep9
    public final V i(int i, V v) {
        this.z = 0;
        return (V) super.i(i, v);
    }

    @Override // defpackage.ep9, java.util.Map
    public final V put(K k, V v) {
        this.z = 0;
        return (V) super.put(k, v);
    }
}
