package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qa5 implements t89 {
    public final de6 a;
    public final de6 b;
    public long c;

    public qa5(long j, long[] jArr, long[] jArr2) {
        xl7.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new de6(length);
            this.b = new de6(length);
        } else {
            int i = length + 1;
            de6 de6Var = new de6(i);
            this.a = de6Var;
            de6 de6Var2 = new de6(i);
            this.b = de6Var2;
            de6Var.a(0L);
            de6Var2.a(0L);
        }
        this.a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // defpackage.t89
    public final boolean b() {
        return this.b.a > 0;
    }

    @Override // defpackage.t89
    public final t89.a e(long j) {
        de6 de6Var = this.b;
        if (de6Var.a == 0) {
            v89 v89Var = v89.c;
            return new t89.a(v89Var, v89Var);
        }
        int iC = n6b.c(de6Var, j);
        long jC = de6Var.c(iC);
        de6 de6Var2 = this.a;
        v89 v89Var2 = new v89(jC, de6Var2.c(iC));
        if (jC == j || iC == de6Var.a - 1) {
            return new t89.a(v89Var2, v89Var2);
        }
        int i = iC + 1;
        return new t89.a(v89Var2, new v89(de6Var.c(i), de6Var2.c(i)));
    }

    @Override // defpackage.t89
    public final long g() {
        return this.c;
    }
}
