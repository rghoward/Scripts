package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hq5 implements x23 {
    public final String t;
    public final String u;

    public hq5(String str, String str2) {
        str.getClass();
        this.t = str;
        this.u = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq5)) {
            return false;
        }
        hq5 hq5Var = (hq5) obj;
        return xj5.a(this.t, hq5Var.t) && xj5.a(this.u, hq5Var.u);
    }

    public final int hashCode() {
        int iHashCode = this.t.hashCode() * 31;
        String str = this.u;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return op3.a("LaunchDateUiModel(title=", this.t, ", cover=", this.u, ")");
    }
}
