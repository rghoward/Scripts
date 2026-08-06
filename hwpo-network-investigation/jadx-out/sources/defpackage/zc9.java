package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zc9<T> extends ad9<T> implements Iterator<T>, r02<g2b>, zn5 {
    public int t;
    public T u;
    public Iterator<? extends T> v;
    public r02<? super g2b> w;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ad9
    public final void a(r02 r02Var, Object obj) {
        this.u = obj;
        this.t = 3;
        this.w = r02Var;
        r02Var.getClass();
    }

    @Override // defpackage.ad9
    public final Object b(Iterator it, fhb fhbVar) {
        if (!it.hasNext()) {
            return g2b.a;
        }
        this.v = it;
        this.t = 2;
        this.w = fhbVar;
        return v72.t;
    }

    public final RuntimeException c() {
        int i = this.t;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.t);
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return ff3.t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.t;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator<? extends T> it = this.v;
                it.getClass();
                if (it.hasNext()) {
                    this.t = 2;
                    return true;
                }
                this.v = null;
            }
            this.t = 5;
            r02<? super g2b> r02Var = this.w;
            r02Var.getClass();
            this.w = null;
            r02Var.resumeWith(g2b.a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.t;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            vl.b();
            return null;
        }
        if (i == 2) {
            this.t = 1;
            Iterator<? extends T> it = this.v;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.t = 0;
        T t = this.u;
        this.u = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.r02
    public final void resumeWith(Object obj) throws Throwable {
        dv8.b(obj);
        this.t = 4;
    }
}
