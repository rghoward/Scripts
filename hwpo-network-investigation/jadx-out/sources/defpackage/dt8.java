package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dt8 implements el0 {
    public static final a Companion = new a();
    public static final dt8 j = new dt8(0, BuildConfig.FLAVOR, 0, false, null, false, null, false, new vz7(0, false, false, null, null, null, 127));
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    public final Integer e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final vz7 i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public dt8(int i, String str, int i2, boolean z, Integer num, boolean z2, String str2, boolean z3, vz7 vz7Var) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.e = num;
        this.f = z2;
        this.g = str2;
        this.h = z3;
        this.i = vz7Var;
    }

    public static dt8 a(dt8 dt8Var, int i, String str, int i2, boolean z, Integer num, boolean z2, String str2, boolean z3, vz7 vz7Var, int i3) {
        if ((i3 & 1) != 0) {
            i = dt8Var.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            str = dt8Var.b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            i2 = dt8Var.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            z = dt8Var.d;
        }
        boolean z4 = z;
        if ((i3 & 16) != 0) {
            num = dt8Var.e;
        }
        Integer num2 = num;
        boolean z5 = (i3 & 32) != 0 ? dt8Var.f : z2;
        String str4 = (i3 & 64) != 0 ? dt8Var.g : str2;
        boolean z6 = (i3 & 128) != 0 ? dt8Var.h : z3;
        vz7 vz7Var2 = (i3 & 256) != 0 ? dt8Var.i : vz7Var;
        dt8Var.getClass();
        return new dt8(i4, str3, i5, z4, num2, z5, str4, z6, vz7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt8)) {
            return false;
        }
        dt8 dt8Var = (dt8) obj;
        return this.a == dt8Var.a && this.b.equals(dt8Var.b) && this.c == dt8Var.c && this.d == dt8Var.d && xj5.a(this.e, dt8Var.e) && this.f == dt8Var.f && xj5.a(this.g, dt8Var.g) && this.h == dt8Var.h && this.i.equals(dt8Var.i);
    }

    public final int hashCode() {
        int iA = uo2.a(os2.a(this.c, ru3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), this.d, 31);
        Integer num = this.e;
        int iA2 = uo2.a((iA + (num == null ? 0 : num.hashCode())) * 31, this.f, 31);
        String str = this.g;
        return this.i.hashCode() + uo2.a((iA2 + (str != null ? str.hashCode() : 0)) * 31, this.h, 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("RescheduleViewState(id=", ", todayDate=", this.b, ", maxDay=", this.a);
        sbA.append(this.c);
        sbA.append(", isContentVisible=");
        sbA.append(this.d);
        sbA.append(", enteredDay=");
        sbA.append(this.e);
        sbA.append(", isSaveButtonEnabled=");
        sbA.append(this.f);
        sbA.append(", fieldError=");
        sbA.append(this.g);
        sbA.append(", isProgress=");
        sbA.append(this.h);
        sbA.append(", placeholderState=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
