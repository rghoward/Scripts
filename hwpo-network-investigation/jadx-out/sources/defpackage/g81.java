package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g81 extends osa {
    public final int a;
    public final String b;
    public final xn0 c;
    public final Double d;
    public final n03 e;
    public final m2b f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final String k;

    public g81(int i, String str, xn0 xn0Var, Double d, n03 n03Var, m2b m2bVar, String str2, Integer num, Integer num2, Integer num3, String str3) {
        str.getClass();
        xn0Var.getClass();
        m2bVar.getClass();
        this.a = i;
        this.b = str;
        this.c = xn0Var;
        this.d = d;
        this.e = n03Var;
        this.f = m2bVar;
        this.g = str2;
        this.h = num;
        this.i = num2;
        this.j = num3;
        this.k = str3;
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
        if (!(obj instanceof g81)) {
            return false;
        }
        g81 g81Var = (g81) obj;
        return this.a == g81Var.a && xj5.a(this.b, g81Var.b) && this.c == g81Var.c && xj5.a(this.d, g81Var.d) && this.e == g81Var.e && this.f == g81Var.f && xj5.a(this.g, g81Var.g) && xj5.a(this.h, g81Var.h) && xj5.a(this.i, g81Var.i) && xj5.a(this.j, g81Var.j) && xj5.a(this.k, g81Var.k);
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
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Double d = this.d;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        n03 n03Var = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (n03Var == null ? 0 : n03Var.hashCode())) * 31)) * 31;
        String str = this.g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        return this.k.hashCode() + ((iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ChallengeValue(id=", ", name=", this.b, ", measureType=", this.a);
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
        sbA.append(", rounds=");
        sbA.append(this.i);
        sbA.append(", reps=");
        sbA.append(this.j);
        sbA.append(", description=");
        return av.a(sbA, this.k, ")");
    }
}
