package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ik4<T> implements yc9<T> {
    public final mh4<T> a;
    public final oh4<T, T> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<T>, zn5 {
        public T t;
        public int u = -2;
        public final /* synthetic */ ik4<T> v;

        public a(ik4<T> ik4Var) {
            this.v = ik4Var;
        }

        public final void a() {
            T tInvoke;
            int i = this.u;
            ik4<T> ik4Var = this.v;
            if (i == -2) {
                tInvoke = ik4Var.a.invoke();
            } else {
                oh4<T, T> oh4Var = ik4Var.b;
                T t = this.t;
                t.getClass();
                tInvoke = oh4Var.invoke(t);
            }
            this.t = tInvoke;
            this.u = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.u < 0) {
                a();
            }
            return this.u == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.u < 0) {
                a();
            }
            if (this.u == 0) {
                vl.b();
                return null;
            }
            T t = this.t;
            t.getClass();
            this.u = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ik4(mh4<? extends T> mh4Var, oh4<? super T, ? extends T> oh4Var) {
        oh4Var.getClass();
        this.a = mh4Var;
        this.b = oh4Var;
    }

    @Override // defpackage.yc9
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
