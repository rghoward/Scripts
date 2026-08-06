package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ky8 {
    public float a = 0.0f;
    public boolean b = true;
    public nb2 c = null;

    public ky8(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky8)) {
            return false;
        }
        ky8 ky8Var = (ky8) obj;
        return Float.compare(this.a, ky8Var.a) == 0 && this.b == ky8Var.b && xj5.a(this.c, ky8Var.c);
    }

    public final int hashCode() {
        int iA = uo2.a(Float.hashCode(this.a) * 31, this.b, 31);
        nb2 nb2Var = this.c;
        return (iA + (nb2Var == null ? 0 : nb2Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
