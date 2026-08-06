package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gd8 {
    public final int a;
    public final String b;
    public final o89 c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final List<l89> h;
    public final List<vn0> i;
    public final tc8 j;
    public final zc8 k;

    public gd8(int i, String str, o89 o89Var, int i2, String str2, boolean z, boolean z2, List<l89> list, List<vn0> list2, tc8 tc8Var, zc8 zc8Var) {
        o89Var.getClass();
        this.a = i;
        this.b = str;
        this.c = o89Var;
        this.d = i2;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = list2;
        this.j = tc8Var;
        this.k = zc8Var;
    }

    public static gd8 a(gd8 gd8Var, ArrayList arrayList) {
        int i = gd8Var.a;
        String str = gd8Var.b;
        o89 o89Var = gd8Var.c;
        int i2 = gd8Var.d;
        String str2 = gd8Var.e;
        boolean z = gd8Var.f;
        boolean z2 = gd8Var.g;
        List<vn0> list = gd8Var.i;
        tc8 tc8Var = gd8Var.j;
        zc8 zc8Var = gd8Var.k;
        o89Var.getClass();
        return new gd8(i, str, o89Var, i2, str2, z, z2, arrayList, list, tc8Var, zc8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd8)) {
            return false;
        }
        gd8 gd8Var = (gd8) obj;
        return this.a == gd8Var.a && this.b.equals(gd8Var.b) && this.c == gd8Var.c && this.d == gd8Var.d && this.e.equals(gd8Var.e) && this.f == gd8Var.f && this.g == gd8Var.g && this.h.equals(gd8Var.h) && this.i.equals(gd8Var.i) && this.j.equals(gd8Var.j) && this.k.equals(gd8Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ho2.a(ho2.a(uo2.a(uo2.a(ru3.c(os2.a(this.d, (this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31), 31, this.e), this.f, 31), this.g, 31), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ProgramSectionDetails(id=", ", title=", this.b, ", kind=", this.a);
        sbA.append(this.c);
        sbA.append(", position=");
        sbA.append(this.d);
        sbA.append(", description=");
        sbA.append(this.e);
        sbA.append(", isCompleted=");
        sbA.append(this.f);
        sbA.append(", couldCompletedStateBeChanged=");
        sbA.append(this.g);
        sbA.append(", attachments=");
        sbA.append(this.h);
        sbA.append(", benchmarks=");
        sbA.append(this.i);
        sbA.append(", performance=");
        sbA.append(this.j);
        sbA.append(", score=");
        sbA.append(this.k);
        sbA.append(")");
        return sbA.toString();
    }
}
