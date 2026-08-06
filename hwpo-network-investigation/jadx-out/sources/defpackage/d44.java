package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d44<T, R, E> implements yc9<E> {
    public final yc9<T> a;
    public final oh4<T, R> b;
    public final tm2 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<E>, zn5 {
        public final Iterator<T> t;
        public Iterator<? extends E> u;
        public int v;
        public final /* synthetic */ d44<T, R, E> w;

        public a(d44<T, R, E> d44Var) {
            this.w = d44Var;
            this.t = d44Var.a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.u;
            if (it2 != null && it2.hasNext()) {
                this.v = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.t;
                if (!it3.hasNext()) {
                    this.v = 2;
                    this.u = null;
                    return false;
                }
                T next = it3.next();
                d44<T, R, E> d44Var = this.w;
                it = (Iterator) d44Var.c.invoke(d44Var.b.invoke(next));
            } while (!it.hasNext());
            this.u = it;
            this.v = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.v;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.v;
            if (i == 2) {
                vl.b();
                return null;
            }
            if (i == 0 && !a()) {
                vl.b();
                return null;
            }
            this.v = 0;
            Iterator<? extends E> it = this.u;
            it.getClass();
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d44(yc9 yc9Var, oh4 oh4Var, tm2 tm2Var) {
        this.a = yc9Var;
        this.b = oh4Var;
        this.c = tm2Var;
    }

    @Override // defpackage.yc9
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
