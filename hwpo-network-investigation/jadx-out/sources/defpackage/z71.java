package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class z71 extends wab {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;

    public z71(int i, String str, String str2, String str3, String str4, int i2, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.wab
    public final int a() {
        return this.g;
    }

    @Override // defpackage.wab
    public final int b() {
        return this.f;
    }

    @Override // defpackage.wab
    public final int c() {
        return this.a;
    }

    @Override // defpackage.wab
    public final String d() {
        return this.e;
    }

    @Override // defpackage.wab
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z71)) {
            return false;
        }
        z71 z71Var = (z71) obj;
        return this.a == z71Var.a && xj5.a(this.b, z71Var.b) && xj5.a(this.c, z71Var.c) && xj5.a(this.d, z71Var.d) && xj5.a(this.e, z71Var.e) && this.f == z71Var.f && this.g == z71Var.g;
    }

    @Override // defpackage.wab
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + os2.a(this.f, ru3.c(ru3.c(ru3.c(ru3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ChallengeItemModel(id=", ", title=", this.b, ", description=", this.a);
        ux1.b(sbA, this.c, ", valueText=", this.d, ", percentageText=");
        sbA.append(this.e);
        sbA.append(", colorText=");
        sbA.append(this.f);
        sbA.append(", colorBackground=");
        return i34.b(this.g, ")", sbA);
    }
}
