package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class br9 {
    public static final br9 c;
    public final s03 a;
    public final s03 b;

    static {
        s03.b bVar = s03.b.a;
        c = new br9(bVar, bVar);
    }

    public br9(s03 s03Var, s03 s03Var2) {
        this.a = s03Var;
        this.b = s03Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br9)) {
            return false;
        }
        br9 br9Var = (br9) obj;
        return xj5.a(this.a, br9Var.a) && xj5.a(this.b, br9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
