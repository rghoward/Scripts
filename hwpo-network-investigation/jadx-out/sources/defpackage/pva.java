package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pva<T, R> implements yc9<R> {
    public final yc9<T> a;
    public final oh4<T, R> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<R>, zn5 {
        public final Iterator<T> t;
        public final /* synthetic */ pva<T, R> u;

        public a(pva<T, R> pvaVar) {
            this.u = pvaVar;
            this.t = pvaVar.a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.t.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.u.b.invoke(this.t.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pva(yc9<? extends T> yc9Var, oh4<? super T, ? extends R> oh4Var) {
        this.a = yc9Var;
        this.b = oh4Var;
    }

    @Override // defpackage.yc9
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
