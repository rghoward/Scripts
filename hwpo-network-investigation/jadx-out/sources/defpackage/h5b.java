package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h5b {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final LocalDate h;
    public final String i;
    public final yp4 j;
    public final uj4 k;
    public final ylb l;
    public final n33 m;
    public final boolean n;
    public final boolean o;
    public final s10 p;

    public h5b(int i, String str, String str2, String str3, String str4, String str5, int i2, LocalDate localDate, String str6, yp4 yp4Var, uj4 uj4Var, ylb ylbVar, n33 n33Var, boolean z, boolean z2, s10 s10Var) {
        fk.b(str, str4, str6);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
        this.h = localDate;
        this.i = str6;
        this.j = yp4Var;
        this.k = uj4Var;
        this.l = ylbVar;
        this.m = n33Var;
        this.n = z;
        this.o = z2;
        this.p = s10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5b)) {
            return false;
        }
        h5b h5bVar = (h5b) obj;
        return this.a == h5bVar.a && xj5.a(this.b, h5bVar.b) && xj5.a(this.c, h5bVar.c) && xj5.a(this.d, h5bVar.d) && xj5.a(this.e, h5bVar.e) && xj5.a(this.f, h5bVar.f) && this.g == h5bVar.g && xj5.a(this.h, h5bVar.h) && xj5.a(this.i, h5bVar.i) && xj5.a(this.j, h5bVar.j) && this.k == h5bVar.k && this.l == h5bVar.l && this.m == h5bVar.m && this.n == h5bVar.n && this.o == h5bVar.o && this.p == h5bVar.p;
    }

    public final int hashCode() {
        int iC = ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iC2 = ru3.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int iA = os2.a(this.g, (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        LocalDate localDate = this.h;
        int iC3 = ru3.c((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.i);
        yp4 yp4Var = this.j;
        int iHashCode2 = (iC3 + (yp4Var == null ? 0 : yp4Var.hashCode())) * 31;
        uj4 uj4Var = this.k;
        int iHashCode3 = (iHashCode2 + (uj4Var == null ? 0 : uj4Var.hashCode())) * 31;
        ylb ylbVar = this.l;
        int iHashCode4 = (iHashCode3 + (ylbVar == null ? 0 : ylbVar.hashCode())) * 31;
        n33 n33Var = this.m;
        return this.p.hashCode() + uo2.a(uo2.a((iHashCode4 + (n33Var != null ? n33Var.hashCode() : 0)) * 31, this.n, 31), this.o, 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("User(id=", ", fullName=", this.b, ", firstName=", this.a);
        ux1.b(sbA, this.c, ", lastName=", this.d, ", email=");
        ux1.b(sbA, this.e, ", avatarUrl=", this.f, ", age=");
        sbA.append(this.g);
        sbA.append(", birthDate=");
        sbA.append(this.h);
        sbA.append(", country=");
        sbA.append(this.i);
        sbA.append(", gym=");
        sbA.append(this.j);
        sbA.append(", gender=");
        sbA.append(this.k);
        sbA.append(", weightUnits=");
        sbA.append(this.l);
        sbA.append(", distanceUnits=");
        sbA.append(this.m);
        sbA.append(", needsUserReview=");
        sbA.append(this.n);
        sbA.append(", canComment=");
        sbA.append(this.o);
        sbA.append(", appLanguage=");
        sbA.append(this.p);
        sbA.append(")");
        return sbA.toString();
    }
}
