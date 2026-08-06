package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cx6 {
    public final s89 a = s89.t;
    public final boolean b = true;
    public final boolean c = true;

    public cx6(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx6)) {
            return false;
        }
        cx6 cx6Var = (cx6) obj;
        return this.a == cx6Var.a && this.c == cx6Var.c && this.b == cx6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + uo2.a(this.a.hashCode() * 31, this.b, 29791);
    }
}
