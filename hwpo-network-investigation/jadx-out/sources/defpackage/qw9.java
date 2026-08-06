package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qw9 implements Iterator<Object>, zn5 {
    public final zr9 t;
    public final int u;
    public final gj4 v;
    public final ln4 w;
    public final int x;
    public int y;

    public qw9(zr9 zr9Var, int i, gj4 gj4Var, ln4 ln4Var) {
        this.t = zr9Var;
        this.u = i;
        this.v = gj4Var;
        this.w = ln4Var;
        this.x = zr9Var.E;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.v.a;
        return arrayList != null && this.y < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.v.a;
        if (arrayList != null) {
            int i = this.y;
            this.y = i + 1;
            obj = arrayList.get(i);
        } else {
            obj = null;
        }
        boolean z = obj instanceof vi4;
        zr9 zr9Var = this.t;
        if (z) {
            return new as9(zr9Var, ((vi4) obj).a, this.x);
        }
        if (!(obj instanceof gj4)) {
            pt1.b("Unexpected group information structure");
            fl.a();
            return null;
        }
        return new rw9(zr9Var, this.u, (gj4) obj, new zl8(this.w, this.y - 1));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
