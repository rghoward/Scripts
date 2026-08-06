package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qdb<V extends fw> implements idb<V> {
    public final int t;
    public final int u;
    public final kdb<V> v;

    public qdb(int i, int i2, aa3 aa3Var) {
        this.t = i;
        this.u = i2;
        this.v = new kdb<>(new z44(i, i2, aa3Var));
    }

    @Override // defpackage.idb
    public final int c() {
        return this.t;
    }

    @Override // defpackage.edb
    public final V e(long j, V v, V v2, V v3) {
        return (V) this.v.e(j, v, v2, v3);
    }

    @Override // defpackage.idb
    public final int f() {
        return this.u;
    }

    @Override // defpackage.edb
    public final V g(long j, V v, V v2, V v3) {
        return (V) this.v.g(j, v, v2, v3);
    }
}
