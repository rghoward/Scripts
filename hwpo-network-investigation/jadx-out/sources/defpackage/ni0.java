package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0<T> {
    public final kt4 a;
    public final kt4 b;
    public final a<T> c;
    public T d;
    public T e;
    public int f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T> {
        void a(T t, T t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ni0(Object obj, Looper looper, Looper looper2, z7a z7aVar, a aVar) {
        this.a = z7aVar.b(looper, null);
        this.b = z7aVar.b(looper2, null);
        this.d = obj;
        this.e = obj;
        this.c = aVar;
    }

    public final void a(Runnable runnable) {
        kt4 kt4Var = this.a;
        if (kt4Var.n().getThread().isAlive()) {
            kt4Var.e(runnable);
        }
    }

    public final void b(T t) {
        T t2 = this.d;
        this.d = t;
        if (t2.equals(t)) {
            return;
        }
        this.c.a(t2, t);
    }
}
