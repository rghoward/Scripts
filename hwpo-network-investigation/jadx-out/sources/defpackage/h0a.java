package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h0a<T> implements ListIterator<T>, zn5 {
    public final fv9<T> t;
    public int u;
    public int v = -1;
    public int w;

    public h0a(fv9<T> fv9Var, int i) {
        this.t = fv9Var;
        this.u = i - 1;
        this.w = gv9.d(fv9Var);
    }

    public final void a() {
        if (gv9.d(this.t) == this.w) {
            return;
        }
        yk.b();
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.u + 1;
        fv9<T> fv9Var = this.t;
        fv9Var.add(i, t);
        this.v = -1;
        this.u++;
        this.w = gv9.d(fv9Var);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.u < this.t.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.u >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i = this.u + 1;
        this.v = i;
        fv9<T> fv9Var = this.t;
        gv9.a(i, fv9Var.size());
        T t = fv9Var.get(i);
        this.u = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.u + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i = this.u;
        fv9<T> fv9Var = this.t;
        gv9.a(i, fv9Var.size());
        int i2 = this.u;
        this.v = i2;
        T t = fv9Var.get(i2);
        this.u--;
        return t;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.u;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.v;
        fv9<T> fv9Var = this.t;
        fv9Var.remove(i);
        this.u--;
        this.v = -1;
        this.w = gv9.d(fv9Var);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.v;
        if (i < 0) {
            aa0.c("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
            return;
        }
        fv9<T> fv9Var = this.t;
        fv9Var.set(i, t);
        this.w = gv9.d(fv9Var);
    }
}
