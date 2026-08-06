package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i43<T> implements lf8<T> {
    public static final Object c = new Object();
    public volatile xs3 a;
    public volatile Object b;

    public static lf8 a(xs3 xs3Var) {
        if (xs3Var instanceof i43) {
            return xs3Var;
        }
        i43 i43Var = new i43();
        i43Var.b = c;
        i43Var.a = xs3Var;
        return i43Var;
    }

    @Override // defpackage.nf8
    public final T get() {
        T t;
        T t2 = (T) this.b;
        Object obj = c;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.b;
            if (t == obj) {
                t = this.a.get();
                Object obj2 = this.b;
                if (obj2 != obj && obj2 != t) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                }
                this.b = t;
                this.a = null;
            }
        }
        return t;
    }
}
