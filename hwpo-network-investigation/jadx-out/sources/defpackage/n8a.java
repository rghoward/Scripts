package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n8a<T> implements yc9<T> {
    public final yc9<T> a;
    public final oh4<T, Boolean> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<T>, zn5 {
        public final Iterator<T> t;
        public int u = -1;
        public T v;
        public final /* synthetic */ n8a<T> w;

        public a(n8a<T> n8aVar) {
            this.w = n8aVar;
            this.t = n8aVar.a.iterator();
        }

        public final void a() {
            Iterator<T> it = this.t;
            if (it.hasNext()) {
                T next = it.next();
                if (this.w.b.invoke(next).booleanValue()) {
                    this.u = 1;
                    this.v = next;
                    return;
                }
            }
            this.u = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.u == -1) {
                a();
            }
            return this.u == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.u == -1) {
                a();
            }
            if (this.u == 0) {
                vl.b();
                return null;
            }
            T t = this.v;
            this.v = null;
            this.u = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n8a(yc9<? extends T> yc9Var, oh4<? super T, Boolean> oh4Var) {
        this.a = yc9Var;
        this.b = oh4Var;
    }

    @Override // defpackage.yc9
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
