package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pr8 {
    public final boolean a;
    public final vn0 b;

    public pr8(boolean z, vn0 vn0Var) {
        this.a = z;
        this.b = vn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr8)) {
            return false;
        }
        pr8 pr8Var = (pr8) obj;
        return this.a == pr8Var.a && this.b.equals(pr8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequiredBenchmarkUiEntity(isChecked=" + this.a + ", benchmark=" + this.b + ")";
    }
}
