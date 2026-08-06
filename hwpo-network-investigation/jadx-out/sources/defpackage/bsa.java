package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bsa {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final id4 g;
    public final int h;
    public final long[] i;
    public final long[] j;
    public final int k;
    public final csa[] l;

    public bsa(int i, int i2, long j, long j2, long j3, long j4, id4 id4Var, int i3, csa[] csaVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = id4Var;
        this.h = i3;
        this.l = csaVarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final bsa a(id4 id4Var) {
        return new bsa(this.a, this.b, this.c, this.d, this.e, this.f, id4Var, this.h, this.l, this.k, this.i, this.j);
    }
}
