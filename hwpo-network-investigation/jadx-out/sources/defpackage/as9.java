package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class as9 implements au1, Iterable<Object>, zn5 {
    public final zr9 t;
    public final int u;
    public final int v;

    public as9(zr9 zr9Var, int i, int i2) {
        this.t = zr9Var;
        this.u = i;
        this.v = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof as9)) {
            return false;
        }
        as9 as9Var = (as9) obj;
        return as9Var.u == this.u && as9Var.v == this.v && as9Var.t == this.t;
    }

    public final int hashCode() {
        return (this.t.hashCode() * 31) + this.u;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        zr9 zr9Var = this.t;
        if (zr9Var.E != this.v) {
            bs9.g();
        }
        int i = this.u;
        gj4 gj4VarO1 = zr9Var.o1(i);
        return gj4VarO1 != null ? new qw9(zr9Var, i, gj4VarO1, new xj(i)) : new cp4(zr9Var, i + 1, bs9.a(zr9Var.x, i) + i);
    }
}
