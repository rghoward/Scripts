package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jzb {
    public final int a;
    public final x9d b;

    public jzb(x9d x9dVar, int i) {
        if (x9dVar == null) {
            z90.a("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            z90.a(d43.a(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.a = i;
        this.b = x9dVar;
    }

    public abstract void a(q9d q9dVar, Object obj);
}
