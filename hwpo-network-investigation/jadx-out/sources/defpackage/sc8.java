package defpackage;

import j$.time.LocalDateTime;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sc8 {
    public final int a;
    public final String b;
    public final a08 c;
    public final Integer d;
    public final LocalDateTime e;
    public final List<hd8> f;
    public final boolean g;
    public final boolean h;

    public sc8(int i, String str, a08 a08Var, Integer num, LocalDateTime localDateTime, List<hd8> list, boolean z, boolean z2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = a08Var;
        this.d = num;
        this.e = localDateTime;
        this.f = list;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc8)) {
            return false;
        }
        sc8 sc8Var = (sc8) obj;
        return this.a == sc8Var.a && xj5.a(this.b, sc8Var.b) && this.c.equals(sc8Var.c) && xj5.a(this.d, sc8Var.d) && this.e.equals(sc8Var.e) && this.f.equals(sc8Var.f) && this.g == sc8Var.g && this.h == sc8Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.h) + uo2.a(ho2.a((this.e.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ProgramModel(id=", ", color=", this.b, ", plan=", this.a);
        sbA.append(this.c);
        sbA.append(", day=");
        sbA.append(this.d);
        sbA.append(", date=");
        sbA.append(this.e);
        sbA.append(", sections=");
        sbA.append(this.f);
        sbA.append(", canNavigateBack=");
        sbA.append(this.g);
        sbA.append(", canNavigateForward=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
