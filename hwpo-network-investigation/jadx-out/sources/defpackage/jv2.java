package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jv2 {
    public final tdb a = new tdb();
    public final tdb b = new tdb();
    public long c;

    public final void a(long j, long j2) {
        this.a.a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        this.b.a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }
}
