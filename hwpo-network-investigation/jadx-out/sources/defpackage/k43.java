package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k43<T> implements nf8<T> {
    public static final Object c = new Object();
    public volatile zs3 a;
    public volatile Object b;

    public static nf8 a(zs3 zs3Var) {
        if (zs3Var instanceof k43) {
            return zs3Var;
        }
        k43 k43Var = new k43();
        k43Var.b = c;
        k43Var.a = zs3Var;
        return k43Var;
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
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
