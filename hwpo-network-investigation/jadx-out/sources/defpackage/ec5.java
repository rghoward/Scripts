package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ec5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ec5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec5)) {
            return false;
        }
        ec5 ec5Var = (ec5) obj;
        return this.a == ec5Var.a && this.b == ec5Var.b && this.c == ec5Var.c && this.d == ec5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + os2.a(this.c, os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("InitialPadding(left=", ", top=", ", right=", this.a, this.b);
        sbB.append(this.c);
        sbB.append(", bottom=");
        sbB.append(this.d);
        sbB.append(")");
        return sbB.toString();
    }
}
