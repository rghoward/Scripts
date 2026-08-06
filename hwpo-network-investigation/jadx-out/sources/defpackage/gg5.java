package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gg5 {
    public static final gg5 e = new gg5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gg5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg5)) {
            return false;
        }
        gg5 gg5Var = (gg5) obj;
        return this.a == gg5Var.a && this.b == gg5Var.b && this.c == gg5Var.c && this.d == gg5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + os2.a(this.c, os2.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return e44.a(sb, this.d, ')');
    }
}
