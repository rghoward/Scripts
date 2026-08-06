package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kv9<T> {
    public final AtomicReference<ela> a = new AtomicReference<>(lv9.t);
    public final Object b = new Object();
    public T c;

    public final T a() {
        long jA = e00.a();
        if (jA == jla.a) {
            return this.c;
        }
        ela elaVar = this.a.get();
        int iA = elaVar.a(jA);
        if (iA >= 0) {
            return (T) elaVar.c[iA];
        }
        return null;
    }

    public final void b(T t) {
        long jA = e00.a();
        if (jA == jla.a) {
            this.c = t;
            return;
        }
        synchronized (this.b) {
            ela elaVar = this.a.get();
            int iA = elaVar.a(jA);
            if (iA >= 0) {
                elaVar.c[iA] = t;
            } else {
                this.a.set(elaVar.b(jA, t));
                g2b g2bVar = g2b.a;
            }
        }
    }
}
