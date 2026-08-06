package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final class fn7 {
    public final long a;
    public final ko7 b;

    public fn7() {
        long jD = u7d.d(4284900966L);
        ko7 ko7VarB = eo7.b(3);
        this.a = jD;
        this.b = ko7VarB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fn7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        fn7 fn7Var = (fn7) obj;
        return uh1.c(this.a, fn7Var.a) && xj5.a(this.b, fn7Var.b);
    }

    public final int hashCode() {
        int i = uh1.l;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        a83.b(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
