package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pdb<V extends fw> implements jdb<V> {
    public final /* synthetic */ kdb<V> t;

    public pdb(float f, float f2, V v) {
        int[] iArr = hdb.a;
        this.t = new kdb<>(v != null ? new fdb(f, f2, v) : new gdb(f, f2));
    }

    @Override // defpackage.jdb, defpackage.edb
    public final boolean b() {
        this.t.getClass();
        return false;
    }

    @Override // defpackage.edb
    public final long d(V v, V v2, V v3) {
        return this.t.d(v, v2, v3);
    }

    @Override // defpackage.edb
    public final V e(long j, V v, V v2, V v3) {
        return (V) this.t.e(j, v, v2, v3);
    }

    @Override // defpackage.edb
    public final V g(long j, V v, V v2, V v3) {
        return (V) this.t.g(j, v, v2, v3);
    }

    @Override // defpackage.edb
    public final V h(V v, V v2, V v3) {
        return (V) this.t.h(v, v2, v3);
    }
}
