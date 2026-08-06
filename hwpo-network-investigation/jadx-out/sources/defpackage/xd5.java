package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xd5 {
    public static final xd5 e = new xd5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public xd5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static xd5 a(xd5 xd5Var, xd5 xd5Var2) {
        return c(Math.max(xd5Var.a, xd5Var2.a), Math.max(xd5Var.b, xd5Var2.b), Math.max(xd5Var.c, xd5Var2.c), Math.max(xd5Var.d, xd5Var2.d));
    }

    public static xd5 b(xd5 xd5Var, xd5 xd5Var2) {
        return c(Math.min(xd5Var.a, xd5Var2.a), Math.min(xd5Var.b, xd5Var2.b), Math.min(xd5Var.c, xd5Var2.c), Math.min(xd5Var.d, xd5Var2.d));
    }

    public static xd5 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new xd5(i, i2, i3, i4);
    }

    public static xd5 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xd5.class != obj.getClass()) {
            return false;
        }
        xd5 xd5Var = (xd5) obj;
        return this.d == xd5Var.d && this.a == xd5Var.a && this.c == xd5Var.c && this.b == xd5Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return e44.a(sb, this.d, '}');
    }
}
