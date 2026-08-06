package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sr9 {
    public final oh4<kg5, bg5> a;
    public final a04<bg5> b;

    public sr9(a04 a04Var, oh4 oh4Var) {
        this.a = oh4Var;
        this.b = a04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr9)) {
            return false;
        }
        sr9 sr9Var = (sr9) obj;
        return this.a.equals(sr9Var.a) && xj5.a(this.b, sr9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
