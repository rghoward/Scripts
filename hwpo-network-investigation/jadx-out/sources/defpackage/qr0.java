package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qr0 extends osa {
    public final int a;
    public final String b;
    public final xn0 c;
    public final double d;
    public final Double e;
    public final n03 f;
    public final m2b g;
    public final String h;
    public final Integer i;

    public qr0(int i, String str, xn0 xn0Var, double d, Double d2, n03 n03Var, m2b m2bVar, String str2, Integer num) {
        str.getClass();
        xn0Var.getClass();
        m2bVar.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = xn0Var;
        this.d = d;
        this.e = d2;
        this.f = n03Var;
        this.g = m2bVar;
        this.h = str2;
        this.i = num;
    }

    @Override // defpackage.osa
    public final n03 a() {
        return this.f;
    }

    @Override // defpackage.osa
    public final int b() {
        return this.a;
    }

    @Override // defpackage.osa
    public final xn0 c() {
        return this.c;
    }

    @Override // defpackage.osa
    public final String d() {
        return this.b;
    }

    @Override // defpackage.osa
    public final Integer e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr0)) {
            return false;
        }
        qr0 qr0Var = (qr0) obj;
        return this.a == qr0Var.a && xj5.a(this.b, qr0Var.b) && this.c == qr0Var.c && Double.compare(this.d, qr0Var.d) == 0 && xj5.a(this.e, qr0Var.e) && this.f == qr0Var.f && this.g == qr0Var.g && xj5.a(this.h, qr0Var.h) && xj5.a(this.i, qr0Var.i);
    }

    @Override // defpackage.osa
    public final String f() {
        return this.h;
    }

    @Override // defpackage.osa
    public final m2b g() {
        return this.g;
    }

    @Override // defpackage.osa
    public final Double h() {
        return Double.valueOf(this.d);
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.d) + ((this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        Double d = this.e;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        n03 n03Var = this.f;
        int iC = ru3.c((this.g.hashCode() + ((iHashCode2 + (n03Var == null ? 0 : n03Var.hashCode())) * 31)) * 31, 31, this.h);
        Integer num = this.i;
        return iC + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("BodyMetricValue(id=", ", name=", this.b, ", measureType=", this.a);
        sbA.append(this.c);
        sbA.append(", value=");
        sbA.append(this.d);
        sbA.append(", secondValue=");
        sbA.append(this.e);
        sbA.append(", difference=");
        sbA.append(this.f);
        sbA.append(", units=");
        sbA.append(this.g);
        sbA.append(", symbol=");
        sbA.append(this.h);
        sbA.append(", progress=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
