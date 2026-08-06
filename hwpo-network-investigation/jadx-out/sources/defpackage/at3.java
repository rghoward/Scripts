package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class at3 {
    public static final a a = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<T> {
        T a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<T> implements w58<T> {
        public final b<T> a;
        public final e<T> b;
        public final z58 c;

        public c(z58 z58Var, b bVar, e eVar) {
            this.c = z58Var;
            this.a = bVar;
            this.b = eVar;
        }

        @Override // defpackage.w58
        public final boolean a(T t) {
            if (t instanceof d) {
                ((d) t).g().a = true;
            }
            this.b.a(t);
            return this.c.a(t);
        }

        @Override // defpackage.w58
        public final T b() {
            T tA = (T) this.c.b();
            if (tA == null) {
                tA = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tA.getClass());
                }
            }
            if (tA instanceof d) {
                tA.g().a = false;
            }
            return (T) tA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
        p0a.a g();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e<T> {
        void a(T t);
    }

    public static c a(int i, b bVar) {
        return new c(new z58(i), bVar, a);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements e<Object> {
        @Override // at3.e
        public final void a(Object obj) {
        }
    }
}
