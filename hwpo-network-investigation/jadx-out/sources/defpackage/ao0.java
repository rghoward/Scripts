package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ao0 {
    public final int a;
    public final String b;
    public final xn0 c;
    public final Double d;
    public final m2b e;
    public final String f;

    public ao0(int i, String str, xn0 xn0Var, Double d, m2b m2bVar, String str2) {
        str.getClass();
        xn0Var.getClass();
        m2bVar.getClass();
        this.a = i;
        this.b = str;
        this.c = xn0Var;
        this.d = d;
        this.e = m2bVar;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao0)) {
            return false;
        }
        ao0 ao0Var = (ao0) obj;
        return this.a == ao0Var.a && xj5.a(this.b, ao0Var.b) && this.c == ao0Var.c && xj5.a(this.d, ao0Var.d) && this.e == ao0Var.e && xj5.a(this.f, ao0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Double d = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (d == null ? 0 : d.hashCode())) * 31)) * 31;
        String str = this.f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("BenchmarkModel(id=", ", name=", this.b, ", benchmarkMeasureType=", this.a);
        sbA.append(this.c);
        sbA.append(", value=");
        sbA.append(this.d);
        sbA.append(", units=");
        sbA.append(this.e);
        sbA.append(", symbol=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
