package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mz7 {
    public final long a;
    public final long b;

    public mz7(long j, long j2) {
        this.a = j;
        this.b = j2;
        dka[] dkaVarArr = bka.b;
        if ((j & 1095216660480L) == 0) {
            vc5.a("width cannot be TextUnit.Unspecified");
        }
        if ((j2 & 1095216660480L) == 0) {
            vc5.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz7)) {
            return false;
        }
        mz7 mz7Var = (mz7) obj;
        return bka.a(this.a, mz7Var.a) && bka.a(this.b, mz7Var.b);
    }

    public final int hashCode() {
        dka[] dkaVarArr = bka.b;
        return Integer.hashCode(4) + al.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) bka.d(this.a)) + ", height=" + ((Object) bka.d(this.b)) + ", placeholderVerticalAlign=" + ((Object) "Center") + ')';
    }
}
