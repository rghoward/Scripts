package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x98 extends ey9 {
    public final long a;
    public final long b;

    public x98(long j, long j2) {
        this.a = j2;
        this.b = j;
    }

    @Override // defpackage.ey9
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return jp2.a(this.b, " }", sb);
    }
}
