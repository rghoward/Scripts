package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zr7<Key, Value> {
    private final ik5<mh4<g2b>> invalidateCallbackTracker = new ik5<>(new dp6(1));

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<Key> {

        /* JADX INFO: renamed from: zr7$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0296a<Key> extends a<Key> {
            public final Key a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0296a(Object obj) {
                obj.getClass();
                this.a = obj;
            }

            @Override // zr7.a
            public final Key a() {
                return this.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b<Key> extends a<Key> {
            public final Key a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Object obj) {
                obj.getClass();
                this.a = obj;
            }

            @Override // zr7.a
            public final Key a() {
                return this.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c<Key> extends a<Key> {
            public final Key a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(Object obj) {
                this.a = obj;
            }

            @Override // zr7.a
            public final Key a() {
                return this.a;
            }
        }

        public abstract Key a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b<Key, Value> {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<Key, Value> extends b<Key, Value> {
            public final Throwable t;

            public a(Throwable th) {
                th.getClass();
                this.t = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && xj5.a(this.t, ((a) obj).t);
            }

            public final int hashCode() {
                return this.t.hashCode();
            }

            public final String toString() {
                return s2a.c("LoadResult.Error(\n                    |   throwable: " + this.t + "\n                    |) ");
            }
        }

        /* JADX INFO: renamed from: zr7$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0297b<Key, Value> extends b<Key, Value> implements Iterable<Value>, zn5 {
            public final List<Value> t;
            public final Key u;
            public final Key v;
            public final int w;
            public final int x;

            static {
                new C0297b(hf3.t, null, null, 0, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0297b(List<? extends Value> list, Key key, Key key2, int i, int i2) {
                list.getClass();
                this.t = list;
                this.u = key;
                this.v = key2;
                this.w = i;
                this.x = i2;
                if (i != Integer.MIN_VALUE && i < 0) {
                    z90.a("itemsBefore cannot be negative");
                    throw null;
                }
                if (i2 == Integer.MIN_VALUE || i2 >= 0) {
                    return;
                }
                z90.a("itemsAfter cannot be negative");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0297b)) {
                    return false;
                }
                C0297b c0297b = (C0297b) obj;
                return xj5.a(this.t, c0297b.t) && xj5.a(this.u, c0297b.u) && xj5.a(this.v, c0297b.v) && this.w == c0297b.w && this.x == c0297b.x;
            }

            public final int hashCode() {
                int iHashCode = this.t.hashCode() * 31;
                Key key = this.u;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.v;
                return Integer.hashCode(this.x) + os2.a(this.w, (iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator<Value> iterator() {
                return this.t.listIterator();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List<Value> list = this.t;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(th1.A(list));
                sb.append("\n                    |   last Item: ");
                sb.append(th1.H(list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.v);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.u);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.w);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.x);
                sb.append("\n                    |) ");
                return s2a.c(sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invalidateCallbackTracker$lambda$0(mh4 mh4Var) {
        mh4Var.getClass();
        mh4Var.invoke();
        return g2b.a;
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.d;
    }

    public final int getInvalidateCallbackCount$paging_common() {
        return this.invalidateCallbackTracker.c.size();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Key getRefreshKey(as7<Key, Value> as7Var);

    public final void invalidate() {
        boolean z;
        ik5<mh4<g2b>> ik5Var = this.invalidateCallbackTracker;
        if (ik5Var.d) {
            z = false;
        } else {
            synchronized (ik5Var.b) {
                if (ik5Var.d) {
                    z = false;
                } else {
                    ik5Var.d = true;
                    List listT = th1.T(ik5Var.c);
                    ik5Var.c.clear();
                    dp6 dp6Var = ik5Var.a;
                    Iterator it = listT.iterator();
                    while (it.hasNext()) {
                        dp6Var.invoke(it.next());
                    }
                    z = true;
                }
            }
        }
        if (z) {
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                Log.d("Paging", "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract Object load(a<Key> aVar, r02<? super b<Key, Value>> r02Var);

    public final void registerInvalidatedCallback(mh4<g2b> mh4Var) {
        boolean z;
        mh4Var.getClass();
        ik5<mh4<g2b>> ik5Var = this.invalidateCallbackTracker;
        ik5Var.getClass();
        if (ik5Var.d) {
            ik5Var.a.getClass();
            invalidateCallbackTracker$lambda$0(mh4Var);
            return;
        }
        synchronized (ik5Var.b) {
            if (ik5Var.d) {
                z = true;
            } else {
                ik5Var.c.add(mh4Var);
                z = false;
            }
        }
        if (z) {
            ik5Var.a.getClass();
            invalidateCallbackTracker$lambda$0(mh4Var);
        }
    }

    public final void unregisterInvalidatedCallback(mh4<g2b> mh4Var) {
        mh4Var.getClass();
        ik5<mh4<g2b>> ik5Var = this.invalidateCallbackTracker;
        synchronized (ik5Var.b) {
            ik5Var.c.remove(mh4Var);
        }
    }
}
