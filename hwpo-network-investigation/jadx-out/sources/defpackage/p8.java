package defpackage;

import com.intercom.twig.BuildConfig;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements el0 {
    public static final a Companion = new a();
    public static final p8 k = new p8(false, null, null, null, null, false, null, null, null, BuildConfig.FLAVOR);
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final LocalDate g;
    public final l5b h;
    public final yp4 i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public p8(boolean z, String str, String str2, String str3, String str4, boolean z2, LocalDate localDate, l5b l5bVar, yp4 yp4Var, String str5) {
        str5.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.g = localDate;
        this.h = l5bVar;
        this.i = yp4Var;
        this.j = str5;
    }

    public static p8 a(p8 p8Var, boolean z, String str, String str2, LocalDate localDate, l5b l5bVar, int i) {
        if ((i & 1) != 0) {
            z = p8Var.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = p8Var.b;
        }
        String str3 = str;
        String str4 = (i & 4) != 0 ? p8Var.c : null;
        String str5 = (i & 8) != 0 ? p8Var.d : str2;
        String str6 = p8Var.e;
        boolean z3 = p8Var.f;
        LocalDate localDate2 = (i & 64) != 0 ? p8Var.g : localDate;
        l5b l5bVar2 = (i & 128) != 0 ? p8Var.h : l5bVar;
        yp4 yp4Var = p8Var.i;
        String str7 = p8Var.j;
        p8Var.getClass();
        str7.getClass();
        return new p8(z2, str3, str4, str5, str6, z3, localDate2, l5bVar2, yp4Var, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return this.a == p8Var.a && xj5.a(this.b, p8Var.b) && xj5.a(this.c, p8Var.c) && xj5.a(this.d, p8Var.d) && xj5.a(this.e, p8Var.e) && this.f == p8Var.f && xj5.a(this.g, p8Var.g) && xj5.a(this.h, p8Var.h) && xj5.a(this.i, p8Var.i) && xj5.a(this.j, p8Var.j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iA = uo2.a((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, this.f, 31);
        LocalDate localDate = this.g;
        int iHashCode5 = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        l5b l5bVar = this.h;
        int iHashCode6 = (iHashCode5 + (l5bVar == null ? 0 : l5bVar.hashCode())) * 31;
        yp4 yp4Var = this.i;
        return this.j.hashCode() + ((iHashCode6 + (yp4Var != null ? yp4Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountViewState(isProgress=");
        sb.append(this.a);
        sb.append(", firstName=");
        sb.append(this.b);
        sb.append(", lastName=");
        ux1.b(sb, this.c, ", userNameFirstLetter=", this.d, ", avatarUrl=");
        sb.append(this.e);
        sb.append(", isBtnDeleteAvatarVisible=");
        sb.append(this.f);
        sb.append(", birthdate=");
        sb.append(this.g);
        sb.append(", country=");
        sb.append(this.h);
        sb.append(", gym=");
        sb.append(this.i);
        sb.append(", email=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
