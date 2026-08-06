package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 implements nv9 {
    public final int a;
    public final long b;
    public final int c;

    public g60(long j, int i, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
        sb.append(n6b.Y(this.a));
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", minHeaderSize=");
        return i34.b(this.c, "}", sb);
    }
}
