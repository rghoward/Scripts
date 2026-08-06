package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 implements el0 {
    public static final a Companion = new a();
    public static final n91 i = new n91(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, null, null, false, false);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public n91(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
    }

    public static n91 a(n91 n91Var, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            str = n91Var.a;
        }
        String str7 = str;
        if ((i2 & 2) != 0) {
            str2 = n91Var.b;
        }
        String str8 = str2;
        if ((i2 & 4) != 0) {
            str3 = n91Var.c;
        }
        String str9 = str3;
        if ((i2 & 8) != 0) {
            str4 = n91Var.d;
        }
        String str10 = str4;
        if ((i2 & 16) != 0) {
            str5 = n91Var.e;
        }
        String str11 = str5;
        if ((i2 & 32) != 0) {
            str6 = n91Var.f;
        }
        String str12 = str6;
        boolean z3 = (i2 & 64) != 0 ? n91Var.g : z;
        boolean z4 = (i2 & 128) != 0 ? n91Var.h : z2;
        n91Var.getClass();
        return new n91(str7, str8, str9, str10, str11, str12, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n91)) {
            return false;
        }
        n91 n91Var = (n91) obj;
        return this.a.equals(n91Var.a) && this.b.equals(n91Var.b) && this.c.equals(n91Var.c) && xj5.a(this.d, n91Var.d) && xj5.a(this.e, n91Var.e) && xj5.a(this.f, n91Var.f) && this.g == n91Var.g && this.h == n91Var.h;
    }

    public final int hashCode() {
        int iC = ru3.c(ru3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.h) + uo2.a((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("ChangePasswordViewState(currentPassword=", this.a, ", newPassword=", this.b, ", newConfirmedPassword=");
        ux1.b(sbA, this.c, ", currentPasswordError=", this.d, ", newPasswordError=");
        ux1.b(sbA, this.e, ", newConfirmedPasswordError=", this.f, ", isSaveButtonEnabled=");
        sbA.append(this.g);
        sbA.append(", isProgress=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
