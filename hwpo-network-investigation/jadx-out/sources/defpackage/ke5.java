package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ke5 implements go7 {
    public final omb a;
    public final tx2 b;

    public ke5(omb ombVar, tx2 tx2Var) {
        this.a = ombVar;
        this.b = tx2Var;
    }

    @Override // defpackage.go7
    public final float a() {
        omb ombVar = this.a;
        tx2 tx2Var = this.b;
        return tx2Var.F0(ombVar.c(tx2Var));
    }

    @Override // defpackage.go7
    public final float b(tq5 tq5Var) {
        omb ombVar = this.a;
        tx2 tx2Var = this.b;
        return tx2Var.F0(ombVar.d(tx2Var, tq5Var));
    }

    @Override // defpackage.go7
    public final float c(tq5 tq5Var) {
        omb ombVar = this.a;
        tx2 tx2Var = this.b;
        return tx2Var.F0(ombVar.b(tx2Var, tq5Var));
    }

    @Override // defpackage.go7
    public final float d() {
        omb ombVar = this.a;
        tx2 tx2Var = this.b;
        return tx2Var.F0(ombVar.a(tx2Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke5)) {
            return false;
        }
        ke5 ke5Var = (ke5) obj;
        return xj5.a(this.a, ke5Var.a) && xj5.a(this.b, ke5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
