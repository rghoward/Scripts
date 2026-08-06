package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bp5 {
    public static final bp5 c = new bp5(null, null, 63);
    public final oh4<ap5, g2b> a;
    public final oh4<ap5, g2b> b;

    public bp5(oh4 oh4Var, oh4 oh4Var2, int i) {
        oh4Var = (i & 4) != 0 ? null : oh4Var;
        oh4Var2 = (i & 16) != 0 ? null : oh4Var2;
        this.a = oh4Var;
        this.b = oh4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp5)) {
            return false;
        }
        bp5 bp5Var = (bp5) obj;
        return this.a == bp5Var.a && this.b == bp5Var.b;
    }

    public final int hashCode() {
        oh4<ap5, g2b> oh4Var = this.a;
        int iHashCode = (oh4Var != null ? oh4Var.hashCode() : 0) * 961;
        oh4<ap5, g2b> oh4Var2 = this.b;
        return (iHashCode + (oh4Var2 != null ? oh4Var2.hashCode() : 0)) * 31;
    }
}
