package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mu5 {
    public final bt7 a;
    public final bt7 b;
    public boolean c;
    public Object d;
    public final xw5 e;

    public mu5(int i, int i2) {
        this.a = new bt7(i);
        this.b = new bt7(i2);
        this.e = new xw5(i, 90, 200);
    }

    public final void a(int i, int i2) {
        if (i < 0.0f) {
            xc5.a("Index should be non-negative");
        }
        this.a.j(i);
        this.e.d(i);
        this.b.j(i2);
    }
}
