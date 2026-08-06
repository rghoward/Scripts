package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cp4 implements Iterator<Object>, zn5 {
    public final zr9 t;
    public final int u;
    public int v;
    public final int w;

    public cp4(zr9 zr9Var, int i, int i2) {
        this.t = zr9Var;
        this.u = i2;
        this.v = i;
        this.w = zr9Var.E;
        if (zr9Var.D) {
            bs9.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.v < this.u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zr9 zr9Var = this.t;
        int i = zr9Var.E;
        int i2 = this.w;
        if (i != i2) {
            bs9.g();
        }
        int i3 = this.v;
        this.v = bs9.a(zr9Var.x, i3) + i3;
        return new as9(zr9Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
