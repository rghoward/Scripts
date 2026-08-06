package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov6 implements d99 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public ov6(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? n6b.N(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> h(long j, long[] jArr, long[] jArr2) {
        int iF = n6b.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.d99
    public final long a() {
        return -1L;
    }

    @Override // defpackage.t89
    public final boolean b() {
        return true;
    }

    @Override // defpackage.d99
    public final long c(long j) {
        return n6b.N(((Long) h(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.t89
    public final t89.a e(long j) {
        Pair<Long, Long> pairH = h(n6b.Z(n6b.j(j, 0L, this.c)), this.b, this.a);
        v89 v89Var = new v89(n6b.N(((Long) pairH.first).longValue()), ((Long) pairH.second).longValue());
        return new t89.a(v89Var, v89Var);
    }

    @Override // defpackage.d99
    public final int f() {
        return -2147483647;
    }

    @Override // defpackage.t89
    public final long g() {
        return this.c;
    }
}
