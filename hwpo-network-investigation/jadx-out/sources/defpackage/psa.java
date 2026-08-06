package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class psa {
    public final int a;
    public final double b;
    public final Double c;
    public final n03 d;
    public final m2b e;
    public final String f;
    public final Integer g;
    public final boolean h;
    public final Integer i;
    public final LocalDate j;

    public psa(int i, double d, Double d2, n03 n03Var, m2b m2bVar, String str, Integer num, boolean z, Integer num2, LocalDate localDate) {
        m2bVar.getClass();
        str.getClass();
        this.a = i;
        this.b = d;
        this.c = d2;
        this.d = n03Var;
        this.e = m2bVar;
        this.f = str;
        this.g = num;
        this.h = z;
        this.i = num2;
        this.j = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psa)) {
            return false;
        }
        psa psaVar = (psa) obj;
        return this.a == psaVar.a && Double.compare(this.b, psaVar.b) == 0 && xj5.a(this.c, psaVar.c) && this.d == psaVar.d && this.e == psaVar.e && xj5.a(this.f, psaVar.f) && xj5.a(this.g, psaVar.g) && this.h == psaVar.h && xj5.a(this.i, psaVar.i) && this.j.equals(psaVar.j);
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31;
        Double d = this.c;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        n03 n03Var = this.d;
        int iC = ru3.c((this.e.hashCode() + ((iHashCode2 + (n03Var == null ? 0 : n03Var.hashCode())) * 31)) * 31, 31, this.f);
        Integer num = this.g;
        int iA = uo2.a((iC + (num == null ? 0 : num.hashCode())) * 31, this.h, 31);
        Integer num2 = this.i;
        return this.j.hashCode() + ((iA + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TrackedValueEntry(id=" + this.a + ", value=" + this.b + ", secondValue=" + this.c + ", difference=" + this.d + ", units=" + this.e + ", symbol=" + this.f + ", progress=" + this.g + ", hasNote=" + this.h + ", mediaCount=" + this.i + ", date=" + this.j + ")";
    }
}
