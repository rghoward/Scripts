package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ca8 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public ca8(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca8)) {
            return false;
        }
        ca8 ca8Var = (ca8) obj;
        return this.a.equals(ca8Var.a) && this.b == ca8Var.b && this.c == ca8Var.c && this.d == ca8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + os2.a(this.c, os2.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return pi1.a(sb, this.d, ')');
    }
}
