package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j34 implements omb {
    public final int a;

    public j34(int i) {
        this.a = i;
    }

    @Override // defpackage.omb
    public final int a(tx2 tx2Var) {
        return this.a;
    }

    @Override // defpackage.omb
    public final int b(tx2 tx2Var, tq5 tq5Var) {
        return 0;
    }

    @Override // defpackage.omb
    public final int c(tx2 tx2Var) {
        return 0;
    }

    @Override // defpackage.omb
    public final int d(tx2 tx2Var, tq5 tq5Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j34) && this.a == ((j34) obj).a;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return i34.b(this.a, ", right=0, bottom=0)", new StringBuilder("Insets(left=0, top="));
    }
}
