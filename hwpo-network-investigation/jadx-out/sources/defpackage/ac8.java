package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ac8 implements el0 {
    public static final a Companion = new a();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final s10 g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public ac8(boolean z, boolean z2, String str, String str2, String str3, String str4, s10 s10Var) {
        str2.getClass();
        str4.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = s10Var;
    }

    public static ac8 a(ac8 ac8Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ac8Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = ac8Var.b;
        }
        String str = ac8Var.c;
        String str2 = ac8Var.d;
        String str3 = ac8Var.e;
        String str4 = ac8Var.f;
        s10 s10Var = ac8Var.g;
        ac8Var.getClass();
        str2.getClass();
        str4.getClass();
        return new ac8(z3, z2, str, str2, str3, str4, s10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac8)) {
            return false;
        }
        ac8 ac8Var = (ac8) obj;
        return this.a == ac8Var.a && this.b == ac8Var.b && xj5.a(this.c, ac8Var.c) && xj5.a(this.d, ac8Var.d) && xj5.a(this.e, ac8Var.e) && xj5.a(this.f, ac8Var.f) && this.g == ac8Var.g;
    }

    public final int hashCode() {
        int iA = uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31);
        String str = this.c;
        int iC = ru3.c((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iC2 = ru3.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        s10 s10Var = this.g;
        return iC2 + (s10Var != null ? s10Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileViewState(isProgress=");
        sb.append(this.a);
        sb.append(", isRefreshing=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        ux1.b(sb, this.c, ", fullName=", this.d, ", userNameFirstLetter=");
        ux1.b(sb, this.e, ", email=", this.f, ", appLanguage=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
