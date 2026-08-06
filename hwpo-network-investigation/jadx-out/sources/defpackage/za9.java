package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class za9 {
    public final ys4 a;
    public final long b;
    public final ya9 c;
    public final boolean d;

    public za9(ys4 ys4Var, long j, ya9 ya9Var, boolean z) {
        this.a = ys4Var;
        this.b = j;
        this.c = ya9Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za9)) {
            return false;
        }
        za9 za9Var = (za9) obj;
        return this.a == za9Var.a && vf7.b(this.b, za9Var.b) && this.c == za9Var.c && this.d == za9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + al.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) vf7.g(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return pi1.a(sb, this.d, ')');
    }
}
