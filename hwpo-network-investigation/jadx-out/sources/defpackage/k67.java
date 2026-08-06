package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k67 implements Iterator<c67>, zn5 {
    public int t = -1;
    public boolean u;
    public final /* synthetic */ l67 v;

    public k67(l67 l67Var) {
        this.v = l67Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t + 1 < this.v.b.f();
    }

    @Override // java.util.Iterator
    public final c67 next() {
        if (!hasNext()) {
            vl.b();
            return null;
        }
        this.u = true;
        fx9<c67> fx9Var = this.v.b;
        int i = this.t + 1;
        this.t = i;
        return fx9Var.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.u) {
            aa0.c("You must call next() before you can remove an element");
            return;
        }
        fx9<c67> fx9Var = this.v.b;
        fx9Var.g(this.t).v = null;
        int i = this.t;
        Object[] objArr = fx9Var.v;
        Object obj = objArr[i];
        Object obj2 = zb9.u;
        if (obj != obj2) {
            objArr[i] = obj2;
            fx9Var.t = true;
        }
        this.t = i - 1;
        this.u = false;
    }
}
