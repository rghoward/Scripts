package defpackage;

import defpackage.fw;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mdb<V extends fw> implements edb<V> {
    public final idb<V> t;
    public final qn8 u;
    public final long v;
    public final long w;

    public mdb(idb idbVar, qn8 qn8Var, long j) {
        this.t = idbVar;
        this.u = qn8Var;
        this.v = ((long) (idbVar.c() + idbVar.f())) * 1000000;
        this.w = j * 1000000;
    }

    public final long a(long j) {
        long j2 = this.w;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.v;
        long j5 = j3 / j4;
        return (this.u == qn8.t || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // defpackage.edb
    public final boolean b() {
        return true;
    }

    @Override // defpackage.edb
    public final long d(V v, V v2, V v3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.edb
    public final V e(long j, V v, V v2, V v3) {
        return this.t.e(a(j), v, v2, i(j, v, v3, v2));
    }

    @Override // defpackage.edb
    public final V g(long j, V v, V v2, V v3) {
        return this.t.g(a(j), v, v2, i(j, v, v3, v2));
    }

    public final V i(long j, V v, V v2, V v3) {
        long j2 = this.w;
        long j3 = j + j2;
        long j4 = this.v;
        return j3 > j4 ? this.t.e(j4 - j2, v, v3, v2) : v2;
    }
}
