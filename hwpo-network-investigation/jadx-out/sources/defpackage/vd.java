package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vd implements omb {
    public final omb a;
    public final lo7 b;

    public vd(omb ombVar, lo7 lo7Var) {
        this.a = ombVar;
        this.b = lo7Var;
    }

    @Override // defpackage.omb
    public final int a(tx2 tx2Var) {
        return this.b.a(tx2Var) + this.a.a(tx2Var);
    }

    @Override // defpackage.omb
    public final int b(tx2 tx2Var, tq5 tq5Var) {
        return this.b.b(tx2Var, tq5Var) + this.a.b(tx2Var, tq5Var);
    }

    @Override // defpackage.omb
    public final int c(tx2 tx2Var) {
        return this.b.c(tx2Var) + this.a.c(tx2Var);
    }

    @Override // defpackage.omb
    public final int d(tx2 tx2Var, tq5 tq5Var) {
        return this.b.d(tx2Var, tq5Var) + this.a.d(tx2Var, tq5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return xj5.a(vdVar.a, this.a) && vdVar.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
