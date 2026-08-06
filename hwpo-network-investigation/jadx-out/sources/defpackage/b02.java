package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b02 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public b02(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b02)) {
            return false;
        }
        b02 b02Var = (b02) obj;
        return uh1.c(this.a, b02Var.a) && uh1.c(this.b, b02Var.b) && uh1.c(this.c, b02Var.c) && uh1.c(this.d, b02Var.d) && uh1.c(this.e, b02Var.e);
    }

    public final int hashCode() {
        int i = uh1.l;
        return Long.hashCode(this.e) + al.c(this.d, al.c(this.c, al.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        a83.b(this.a, ", textColor=", sb);
        a83.b(this.b, ", iconColor=", sb);
        a83.b(this.c, ", disabledTextColor=", sb);
        a83.b(this.d, ", disabledIconColor=", sb);
        sb.append((Object) uh1.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
