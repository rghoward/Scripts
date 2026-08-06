package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lo7 implements omb {
    public final go7 a;

    public lo7(go7 go7Var) {
        this.a = go7Var;
    }

    @Override // defpackage.omb
    public final int a(tx2 tx2Var) {
        return tx2Var.n1(this.a.d());
    }

    @Override // defpackage.omb
    public final int b(tx2 tx2Var, tq5 tq5Var) {
        return tx2Var.n1(this.a.c(tq5Var));
    }

    @Override // defpackage.omb
    public final int c(tx2 tx2Var) {
        return tx2Var.n1(this.a.a());
    }

    @Override // defpackage.omb
    public final int d(tx2 tx2Var, tq5 tq5Var) {
        return tx2Var.n1(this.a.b(tq5Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lo7) {
            return xj5.a(((lo7) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        go7 go7Var = this.a;
        tq5 tq5Var = tq5.t;
        return "PaddingValues(" + ((Object) y43.f(go7Var.b(tq5Var))) + ", " + ((Object) y43.f(go7Var.d())) + ", " + ((Object) y43.f(go7Var.c(tq5Var))) + ", " + ((Object) y43.f(go7Var.a())) + ')';
    }
}
