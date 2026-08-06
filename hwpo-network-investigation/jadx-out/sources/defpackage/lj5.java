package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lj5<T> {
    public final int a;
    public final int b;
    public final rv5.a c;

    public lj5(int i, int i2, rv5.a aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
        if (i < 0) {
            xc5.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        xc5.a("size should be > 0");
    }
}
