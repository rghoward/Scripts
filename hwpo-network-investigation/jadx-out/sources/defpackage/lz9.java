package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lz9<V extends fw> implements edb<V> {
    public final edb<V> t;
    public final long u;

    public lz9(edb<V> edbVar, long j) {
        this.t = edbVar;
        this.u = j;
    }

    @Override // defpackage.edb
    public final boolean b() {
        return this.t.b();
    }

    @Override // defpackage.edb
    public final long d(V v, V v2, V v3) {
        return this.t.d(v, v2, v3) + this.u;
    }

    @Override // defpackage.edb
    public final V e(long j, V v, V v2, V v3) {
        long j2 = this.u;
        return j < j2 ? v3 : (V) this.t.e(j - j2, v, v2, v3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lz9)) {
            return false;
        }
        lz9 lz9Var = (lz9) obj;
        return lz9Var.u == this.u && xj5.a(lz9Var.t, this.t);
    }

    @Override // defpackage.edb
    public final V g(long j, V v, V v2, V v3) {
        long j2 = this.u;
        return j < j2 ? v : (V) this.t.g(j - j2, v, v2, v3);
    }

    public final int hashCode() {
        return Long.hashCode(this.u) + (this.t.hashCode() * 31);
    }
}
