package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ox1 extends nx1 implements d99 {
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final long m;

    public ox1(long j, long j2, int i, int i2, boolean z, boolean z2) {
        super(j, j2, i, i2, z, z2);
        this.i = j2;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = j == -1 ? -1L : j;
    }

    @Override // defpackage.d99
    public final long a() {
        return this.m;
    }

    @Override // defpackage.d99
    public final long c(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.d99
    public final int f() {
        return this.j;
    }
}
