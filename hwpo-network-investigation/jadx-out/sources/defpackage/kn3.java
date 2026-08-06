package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kn3 implements omb {
    public final omb a;
    public final omb b;

    public kn3(omb ombVar, omb ombVar2) {
        this.a = ombVar;
        this.b = ombVar2;
    }

    @Override // defpackage.omb
    public final int a(tx2 tx2Var) {
        int iA = this.a.a(tx2Var) - this.b.a(tx2Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.omb
    public final int b(tx2 tx2Var, tq5 tq5Var) {
        int iB = this.a.b(tx2Var, tq5Var) - this.b.b(tx2Var, tq5Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.omb
    public final int c(tx2 tx2Var) {
        int iC = this.a.c(tx2Var) - this.b.c(tx2Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.omb
    public final int d(tx2 tx2Var, tq5 tq5Var) {
        int iD = this.a.d(tx2Var, tq5Var) - this.b.d(tx2Var, tq5Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn3)) {
            return false;
        }
        kn3 kn3Var = (kn3) obj;
        return xj5.a(kn3Var.a, this.a) && xj5.a(kn3Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
