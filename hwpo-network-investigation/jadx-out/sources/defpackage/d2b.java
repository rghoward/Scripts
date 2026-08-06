package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d2b implements omb {
    public final omb a;
    public final omb b;

    public d2b(omb ombVar, omb ombVar2) {
        this.a = ombVar;
        this.b = ombVar2;
    }

    @Override // defpackage.omb
    public final int a(tx2 tx2Var) {
        return Math.max(this.a.a(tx2Var), this.b.a(tx2Var));
    }

    @Override // defpackage.omb
    public final int b(tx2 tx2Var, tq5 tq5Var) {
        return Math.max(this.a.b(tx2Var, tq5Var), this.b.b(tx2Var, tq5Var));
    }

    @Override // defpackage.omb
    public final int c(tx2 tx2Var) {
        return Math.max(this.a.c(tx2Var), this.b.c(tx2Var));
    }

    @Override // defpackage.omb
    public final int d(tx2 tx2Var, tq5 tq5Var) {
        return Math.max(this.a.d(tx2Var, tq5Var), this.b.d(tx2Var, tq5Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2b)) {
            return false;
        }
        d2b d2bVar = (d2b) obj;
        return xj5.a(d2bVar.a, this.a) && xj5.a(d2bVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
