package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j43<T> implements mf8<T> {
    public static final Object c = new Object();
    public volatile mf8<T> a;
    public volatile Object b;

    public static <T> mf8<T> a(mf8<T> mf8Var) {
        mf8Var.getClass();
        if (mf8Var instanceof j43) {
            return mf8Var;
        }
        j43 j43Var = new j43();
        j43Var.b = c;
        j43Var.a = mf8Var;
        return j43Var;
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
