package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rk7<T> {
    public final T a;

    public rk7(T t) {
        if (t != null) {
            this.a = t;
        } else {
            ac4.c("value for optional is empty.");
            throw null;
        }
    }

    public final T a() {
        T t = this.a;
        if (t != null) {
            return t;
        }
        px1.b("No value present");
        return null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public rk7() {
        this.a = null;
    }
}
