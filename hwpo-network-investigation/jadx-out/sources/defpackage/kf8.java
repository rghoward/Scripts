package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kf8<T> {
    public final hf8 a;
    public final boolean b;
    public final wu9<T> c;
    public final boolean d;
    public final T e;
    public boolean f = true;

    /* JADX WARN: Multi-variable type inference failed */
    public kf8(hf8 hf8Var, Object obj, boolean z, wu9 wu9Var, boolean z2) {
        this.a = hf8Var;
        this.b = z;
        this.c = wu9Var;
        this.d = z2;
        this.e = obj;
    }

    public final T a() {
        if (this.b) {
            return null;
        }
        T t = this.e;
        if (t != null) {
            return t;
        }
        pt1.b("Unexpected form of a provided value");
        fl.a();
        return null;
    }
}
