package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ncb implements d99 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public ncb(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.d99
    public final long a() {
        return this.d;
    }

    @Override // defpackage.t89
    public final boolean b() {
        return true;
    }

    @Override // defpackage.d99
    public final long c(long j) {
        return this.a[n6b.f(this.b, j, true)];
    }

    @Override // defpackage.t89
    public final t89.a e(long j) {
        long[] jArr = this.a;
        int iF = n6b.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        v89 v89Var = new v89(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new t89.a(v89Var, v89Var);
        }
        int i = iF + 1;
        return new t89.a(v89Var, new v89(jArr[i], jArr2[i]));
    }

    @Override // defpackage.d99
    public final int f() {
        return this.e;
    }

    @Override // defpackage.t89
    public final long g() {
        return this.c;
    }
}
