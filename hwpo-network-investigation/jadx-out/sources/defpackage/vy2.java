package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vy2 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;

    public vy2(int i, String str, String str2, int i2, int i3, String str3, int i4, int i5, int i6, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy2)) {
            return false;
        }
        vy2 vy2Var = (vy2) obj;
        return this.a == vy2Var.a && xj5.a(this.b, vy2Var.b) && xj5.a(this.c, vy2Var.c) && this.d == vy2Var.d && this.e == vy2Var.e && this.f.equals(vy2Var.f) && this.g == vy2Var.g && this.h == vy2Var.h && this.i == vy2Var.i && this.j == vy2Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + os2.a(this.i, os2.a(this.h, os2.a(this.g, ru3.c(os2.a(this.e, os2.a(this.d, ru3.c(ru3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("DetailValueModel(id=", ", valueText=", this.b, ", percentageText=", this.a);
        sbA.append(this.c);
        sbA.append(", colorText=");
        sbA.append(this.d);
        sbA.append(", colorBackground=");
        sbA.append(this.e);
        sbA.append(", date=");
        sbA.append(this.f);
        sbA.append(", attachmentsCount=");
        p23.a(sbA, this.g, ", attachmentsTint=", this.h, ", noteTint=");
        sbA.append(this.i);
        sbA.append(", enabled=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
