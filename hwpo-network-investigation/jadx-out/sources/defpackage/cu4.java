package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cu4 {
    public static final g01 d;
    public static final g01 e;
    public static final g01 f;
    public static final g01 g;
    public static final g01 h;
    public static final g01 i;
    public final g01 a;
    public final g01 b;
    public final int c;

    static {
        g01 g01Var = g01.w;
        d = g01.a.c(":");
        e = g01.a.c(":status");
        f = g01.a.c(":method");
        g = g01.a.c(":path");
        h = g01.a.c(":scheme");
        i = g01.a.c(":authority");
    }

    public cu4(g01 g01Var, g01 g01Var2) {
        g01Var.getClass();
        g01Var2.getClass();
        this.a = g01Var;
        this.b = g01Var2;
        this.c = g01Var2.g() + g01Var.g() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu4)) {
            return false;
        }
        cu4 cu4Var = (cu4) obj;
        return xj5.a(this.a, cu4Var.a) && xj5.a(this.b, cu4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.w() + ": " + this.b.w();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cu4(String str, String str2) {
        this(g01.a.c(str), g01.a.c(str2));
        g01 g01Var = g01.w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cu4(g01 g01Var, String str) {
        this(g01Var, g01.a.c(str));
        g01Var.getClass();
        str.getClass();
        g01 g01Var2 = g01.w;
    }
}
