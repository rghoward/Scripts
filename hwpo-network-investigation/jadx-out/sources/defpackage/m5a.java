package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m5a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<T> implements l5a<T>, Serializable {
        public final transient Object t = new Object();
        public final l5a<T> u;
        public volatile transient boolean v;
        public transient T w;

        public a(l5a<T> l5aVar) {
            l5aVar.getClass();
            this.u = l5aVar;
        }

        @Override // defpackage.l5a
        public final T get() {
            if (!this.v) {
                synchronized (this.t) {
                    try {
                        if (!this.v) {
                            T t = this.u.get();
                            this.w = t;
                            this.v = true;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.w;
        }

        public final String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.v) {
                obj = "<supplier that returned " + this.w + ">";
            } else {
                obj = this.u;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b<T> implements l5a<T> {
        public static final n5a w = new n5a();
        public final Object t = new Object();
        public volatile l5a<T> u;
        public T v;

        public b(l5a<T> l5aVar) {
            l5aVar.getClass();
            this.u = l5aVar;
        }

        @Override // defpackage.l5a
        public final T get() {
            l5a<T> l5aVar = this.u;
            n5a n5aVar = w;
            if (l5aVar != n5aVar) {
                synchronized (this.t) {
                    try {
                        if (this.u != n5aVar) {
                            T t = this.u.get();
                            this.v = t;
                            this.u = n5aVar;
                            return t;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.v;
        }

        public final String toString() {
            Object obj = this.u;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == w) {
                obj = "<supplier that returned " + this.v + ">";
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c<T> implements l5a<T>, Serializable {
        public final T t;

        public c(T t) {
            this.t = t;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return e18.a(this.t, ((c) obj).t);
            }
            return false;
        }

        @Override // defpackage.l5a
        public final T get() {
            return this.t;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.t});
        }

        public final String toString() {
            return "Suppliers.ofInstance(" + this.t + ")";
        }
    }

    public static <T> l5a<T> a(l5a<T> l5aVar) {
        if ((l5aVar instanceof b) || (l5aVar instanceof a)) {
            return l5aVar;
        }
        return l5aVar instanceof Serializable ? new a(l5aVar) : new b(l5aVar);
    }
}
