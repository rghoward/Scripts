package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c08 {
    public final int a;
    public final String b;
    public final boolean c;

    public c08(int i, String str, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c08)) {
            return false;
        }
        c08 c08Var = (c08) obj;
        return this.a == c08Var.a && xj5.a(this.b, c08Var.b) && this.c == c08Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return fz.c(il.a("PlanOption(id=", ", title=", this.b, ", isDefault=", this.a), this.c, ")");
    }
}
