package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w34 implements t89 {
    public final x34 a;
    public final long b;

    public w34(x34 x34Var, long j) {
        this.a = x34Var;
        this.b = j;
    }

    @Override // defpackage.t89
    public final boolean b() {
        return true;
    }

    @Override // defpackage.t89
    public final t89.a e(long j) {
        x34 x34Var = this.a;
        x34Var.k.getClass();
        x34.a aVar = x34Var.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int iF = n6b.f(jArr, n6b.j((((long) x34Var.e) * j) / 1000000, 0L, x34Var.j - 1), false);
        long j2 = iF == -1 ? 0L : jArr[iF];
        long j3 = iF != -1 ? jArr2[iF] : 0L;
        int i = x34Var.e;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.b;
        v89 v89Var = new v89(j4, j3 + j5);
        if (j4 == j || iF == jArr.length - 1) {
            return new t89.a(v89Var, v89Var);
        }
        int i2 = iF + 1;
        return new t89.a(v89Var, new v89((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
    }

    @Override // defpackage.t89
    public final long g() {
        return this.a.b();
    }
}
