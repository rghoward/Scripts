package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b21 implements Comparable<b21> {
    public final int t;
    public final int u;
    public final int v;
    public final long w;

    public b21(int i, int i2, int i3, long j) {
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b21 b21Var) {
        return xj5.c(this.w, b21Var.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b21)) {
            return false;
        }
        b21 b21Var = (b21) obj;
        return this.t == b21Var.t && this.u == b21Var.u && this.v == b21Var.v && this.w == b21Var.w;
    }

    public final int hashCode() {
        return Long.hashCode(this.w) + os2.a(this.v, os2.a(this.u, Integer.hashCode(this.t) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.t);
        sb.append(", month=");
        sb.append(this.u);
        sb.append(", dayOfMonth=");
        sb.append(this.v);
        sb.append(", utcTimeMillis=");
        return fh0.b(sb, this.w, ')');
    }
}
