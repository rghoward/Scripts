package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hd8 {
    public final int a;
    public final String b;
    public final o89 c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final m89 i;
    public final List<m89> j;
    public final List<ao0> k;
    public final vc8 l;
    public final bd8 m;
    public final String n;
    public final Integer o;

    public hd8(int i, String str, o89 o89Var, int i2, String str2, boolean z, boolean z2, boolean z3, m89 m89Var, List<m89> list, List<ao0> list2, vc8 vc8Var, bd8 bd8Var, String str3, Integer num) {
        o89Var.getClass();
        this.a = i;
        this.b = str;
        this.c = o89Var;
        this.d = i2;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = m89Var;
        this.j = list;
        this.k = list2;
        this.l = vc8Var;
        this.m = bd8Var;
        this.n = str3;
        this.o = num;
    }

    public static hd8 a(hd8 hd8Var, boolean z, List list, int i) {
        int i2 = hd8Var.a;
        String str = hd8Var.b;
        o89 o89Var = hd8Var.c;
        int i3 = hd8Var.d;
        String str2 = hd8Var.e;
        boolean z2 = (i & 32) != 0 ? hd8Var.f : z;
        boolean z3 = hd8Var.g;
        boolean z4 = z2;
        boolean z5 = hd8Var.h;
        m89 m89Var = hd8Var.i;
        List list2 = (i & 512) != 0 ? hd8Var.j : list;
        List<ao0> list3 = hd8Var.k;
        vc8 vc8Var = hd8Var.l;
        bd8 bd8Var = hd8Var.m;
        String str3 = hd8Var.n;
        Integer num = hd8Var.o;
        hd8Var.getClass();
        o89Var.getClass();
        return new hd8(i2, str, o89Var, i3, str2, z4, z3, z5, m89Var, list2, list3, vc8Var, bd8Var, str3, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd8)) {
            return false;
        }
        hd8 hd8Var = (hd8) obj;
        return this.a == hd8Var.a && xj5.a(this.b, hd8Var.b) && this.c == hd8Var.c && this.d == hd8Var.d && xj5.a(this.e, hd8Var.e) && this.f == hd8Var.f && this.g == hd8Var.g && this.h == hd8Var.h && xj5.a(this.i, hd8Var.i) && this.j.equals(hd8Var.j) && this.k.equals(hd8Var.k) && xj5.a(this.l, hd8Var.l) && xj5.a(this.m, hd8Var.m) && xj5.a(this.n, hd8Var.n) && xj5.a(this.o, hd8Var.o);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iA = os2.a(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        String str2 = this.e;
        int iA2 = uo2.a(uo2.a(uo2.a((iA + (str2 == null ? 0 : str2.hashCode())) * 31, this.f, 31), this.g, 31), this.h, 31);
        m89 m89Var = this.i;
        int iA3 = ho2.a(ho2.a((iA2 + (m89Var == null ? 0 : m89Var.hashCode())) * 31, 31, this.j), 31, this.k);
        vc8 vc8Var = this.l;
        int iHashCode2 = (iA3 + (vc8Var == null ? 0 : vc8Var.hashCode())) * 31;
        bd8 bd8Var = this.m;
        int iHashCode3 = (iHashCode2 + (bd8Var == null ? 0 : bd8Var.hashCode())) * 31;
        String str3 = this.n;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.o;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ProgramSectionModel(id=", ", title=", this.b, ", kind=", this.a);
        sbA.append(this.c);
        sbA.append(", position=");
        sbA.append(this.d);
        sbA.append(", description=");
        sbA.append(this.e);
        sbA.append(", isCompleted=");
        sbA.append(this.f);
        sbA.append(", hasPerformance=");
        e4.a(sbA, this.g, ", hasFeedback=", this.h, ", tipAttachment=");
        sbA.append(this.i);
        sbA.append(", attachments=");
        sbA.append(this.j);
        sbA.append(", benchmarks=");
        sbA.append(this.k);
        sbA.append(", performance=");
        sbA.append(this.l);
        sbA.append(", score=");
        sbA.append(this.m);
        sbA.append(", deeplinkUrl=");
        sbA.append(this.n);
        sbA.append(", optionId=");
        sbA.append(this.o);
        sbA.append(")");
        return sbA.toString();
    }
}
