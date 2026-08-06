package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class md9 implements Iterator<String>, zn5 {
    public int t;
    public final /* synthetic */ ml3 u;

    public md9(ml3 ml3Var) {
        this.u = ml3Var;
        this.t = ml3Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        ml3 ml3Var = this.u;
        int i = ml3Var.c;
        int i2 = this.t;
        this.t = i2 - 1;
        return ml3Var.e[i - i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
