package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m82 {
    public final String a;
    public final String b;
    public final boolean c;

    public m82(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static m82 a(m82 m82Var, boolean z) {
        String str = m82Var.a;
        String str2 = m82Var.b;
        m82Var.getClass();
        str.getClass();
        str2.getClass();
        return new m82(str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m82)) {
            return false;
        }
        m82 m82Var = (m82) obj;
        return xj5.a(this.a, m82Var.a) && xj5.a(this.b, m82Var.b) && this.c == m82Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ru3.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return fz.c(vb0.a("CountryUiEntity(code=", this.a, ", name=", this.b, ", isChecked="), this.c, ")");
    }
}
