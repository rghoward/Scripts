package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface bq6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
        void a(qk0 qk0Var, toa toaVar);
    }

    void a(Handler handler, jq6 jq6Var);

    void b(jq6 jq6Var);

    up6 c(b bVar, ki kiVar, long j);

    void d(Handler handler, j83 j83Var);

    void e(c cVar, yua yuaVar, x38 x38Var);

    void f(j83 j83Var);

    void g(c cVar);

    co6 h();

    void i(c cVar);

    void j();

    default boolean k() {
        return true;
    }

    default toa l() {
        return null;
    }

    void n(up6 up6Var);

    void o(c cVar);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }

        public final b a(Object obj) {
            if (this.a.equals(obj)) {
                return this;
            }
            return new b(obj, this.b, this.c, this.d, this.e);
        }

        public final boolean b() {
            return this.b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public b(long j, Object obj) {
            this(obj, -1, -1, j, -1);
        }

        public b(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public b(Object obj) {
            this(-1L, obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        bq6 c(co6 co6Var);

        default void a(zt2 zt2Var) {
        }

        @Deprecated
        default void b(boolean z) {
        }

        default void d(int i) {
        }
    }

    default void m(co6 co6Var) {
    }
}
