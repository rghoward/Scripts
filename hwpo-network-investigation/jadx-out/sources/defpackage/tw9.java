package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tw9 extends ku3 {
    public final m85 a;
    public final String b;
    public final jf2 c;

    public tw9(m85 m85Var, String str, jf2 jf2Var) {
        this.a = m85Var;
        this.b = str;
        this.c = jf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw9)) {
            return false;
        }
        tw9 tw9Var = (tw9) obj;
        return xj5.a(this.a, tw9Var.a) && xj5.a(this.b, tw9Var.b) && this.c == tw9Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
