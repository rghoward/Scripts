package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kd4 implements lj1 {
    public final z59 a;

    public kd4(z59 z59Var) {
        z59Var.getClass();
        this.a = z59Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd4) && xj5.a(this.a, ((kd4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Forward(screen=" + this.a + ')';
    }
}
