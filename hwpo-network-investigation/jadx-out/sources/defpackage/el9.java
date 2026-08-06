package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class el9 {
    public static final el9 d = new el9();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ el9() {
        this(0.0f, u7d.d(4278190080L), 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el9)) {
            return false;
        }
        el9 el9Var = (el9) obj;
        return uh1.c(this.a, el9Var.a) && vf7.b(this.b, el9Var.b) && this.c == el9Var.c;
    }

    public final int hashCode() {
        int i = uh1.l;
        return Float.hashCode(this.c) + al.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        a83.b(this.a, ", offset=", sb);
        sb.append((Object) vf7.g(this.b));
        sb.append(", blurRadius=");
        return ho.a(sb, this.c, ')');
    }

    public el9(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}
