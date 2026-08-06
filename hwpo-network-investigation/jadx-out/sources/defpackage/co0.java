package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class co0 extends osa {
    public final int a;
    public final String b;
    public final xn0 c;
    public final double d;
    public final n03 e;
    public final m2b f;
    public final String g;
    public final Integer h;

    public co0(int i, String str, xn0 xn0Var, double d, n03 n03Var, m2b m2bVar, String str2, Integer num) {
        str.getClass();
        xn0Var.getClass();
        m2bVar.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = xn0Var;
        this.d = d;
        this.e = n03Var;
        this.f = m2bVar;
        this.g = str2;
        this.h = num;
    }

    @Override // defpackage.osa
    public final n03 a() {
        return this.e;
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
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co0)) {
            return false;
        }
        co0 co0Var = (co0) obj;
        return this.a == co0Var.a && xj5.a(this.b, co0Var.b) && this.c == co0Var.c && Double.compare(this.d, co0Var.d) == 0 && this.e == co0Var.e && this.f == co0Var.f && xj5.a(this.g, co0Var.g) && xj5.a(this.h, co0Var.h);
    }

    @Override // defpackage.osa
    public final String f() {
        return this.g;
    }

    @Override // defpackage.osa
    public final m2b g() {
        return this.f;
    }

    @Override // defpackage.osa
    public final Double h() {
        return Double.valueOf(this.d);
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.d) + ((this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        n03 n03Var = this.e;
        int iC = ru3.c((this.f.hashCode() + ((iHashCode + (n03Var == null ? 0 : n03Var.hashCode())) * 31)) * 31, 31, this.g);
        Integer num = this.h;
        return iC + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("BenchmarkValue(id=", ", name=", this.b, ", measureType=", this.a);
        sbA.append(this.c);
        sbA.append(", value=");
        sbA.append(this.d);
        sbA.append(", difference=");
        sbA.append(this.e);
        sbA.append(", units=");
        sbA.append(this.f);
        sbA.append(", symbol=");
        sbA.append(this.g);
        sbA.append(", progress=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
