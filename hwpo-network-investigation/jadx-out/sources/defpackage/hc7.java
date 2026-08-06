package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hc7 extends q7b {
    public final int a;
    public final String b;
    public final boolean c;

    public hc7(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.q7b
    public final int a() {
        return this.a;
    }

    @Override // defpackage.q7b
    public final p7b b(String str, vn0 vn0Var) {
        str.getClass();
        int length = str.length();
        int i = this.a;
        if (length == 0 && this.c) {
            return new p7b.b(i);
        }
        try {
            if (wn0.b(vn0Var.z, str, vn0Var.y).doubleValue() == 0.0d) {
                return new p7b.a(i, this.b);
            }
        } catch (NumberFormatException unused) {
        }
        return new p7b.b(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc7)) {
            return false;
        }
        hc7 hc7Var = (hc7) obj;
        return this.a == hc7Var.a && xj5.a(this.b, hc7Var.b) && this.c == hc7Var.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return fz.c(il.a("NonZeroValue(validatingId=", ", errorText=", this.b, ", emptyInputIsAllowed=", this.a), this.c, ")");
    }
}
