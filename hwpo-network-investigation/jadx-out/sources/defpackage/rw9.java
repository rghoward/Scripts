package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rw9 implements au1, Iterable<Object>, zn5 {
    public final zr9 t;
    public final int u;
    public final gj4 v;
    public final zl8 w;

    public rw9(zr9 zr9Var, int i, gj4 gj4Var, zl8 zl8Var) {
        this.t = zr9Var;
        this.u = i;
        this.v = gj4Var;
        this.w = zl8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rw9)) {
            return false;
        }
        rw9 rw9Var = (rw9) obj;
        return rw9Var.u == this.u && rw9Var.t == this.t && rw9Var.w.equals(this.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.t.hashCode() + (this.u * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new qw9(this.t, this.u, this.v, this.w);
    }
}
