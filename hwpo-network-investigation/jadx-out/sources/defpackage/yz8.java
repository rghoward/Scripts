package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yz8 {
    public final vc8 a;
    public final bd8 b;

    public yz8(vc8 vc8Var, bd8 bd8Var) {
        this.a = vc8Var;
        this.b = bd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz8)) {
            return false;
        }
        yz8 yz8Var = (yz8) obj;
        return xj5.a(this.a, yz8Var.a) && xj5.a(this.b, yz8Var.b);
    }

    public final int hashCode() {
        vc8 vc8Var = this.a;
        int iHashCode = (vc8Var == null ? 0 : vc8Var.hashCode()) * 31;
        bd8 bd8Var = this.b;
        return iHashCode + (bd8Var != null ? bd8Var.hashCode() : 0);
    }

    public final String toString() {
        return "SavePerformanceModel(performance=" + this.a + ", score=" + this.b + ")";
    }
}
