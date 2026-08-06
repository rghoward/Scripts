package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zn0 extends wab {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public zn0(String str, String str2, int i, String str3, int i2, int i3) {
        fk.b(str, str2, str3);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.wab
    public final int a() {
        return this.f;
    }

    @Override // defpackage.wab
    public final int b() {
        return this.e;
    }

    @Override // defpackage.wab
    public final int c() {
        return this.a;
    }

    @Override // defpackage.wab
    public final String d() {
        return this.d;
    }

    @Override // defpackage.wab
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0)) {
            return false;
        }
        zn0 zn0Var = (zn0) obj;
        return this.a == zn0Var.a && xj5.a(this.b, zn0Var.b) && xj5.a(this.c, zn0Var.c) && xj5.a(this.d, zn0Var.d) && this.e == zn0Var.e && this.f == zn0Var.f;
    }

    @Override // defpackage.wab
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + os2.a(this.e, ru3.c(ru3.c(ru3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("BenchmarkMetricItemModel(id=", ", title=", this.b, ", valueText=", this.a);
        ux1.b(sbA, this.c, ", percentageText=", this.d, ", colorText=");
        sbA.append(this.e);
        sbA.append(", colorBackground=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
