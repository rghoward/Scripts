package defpackage;

import j$.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class oj3 implements el0 {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final vn0 c;
    public final String d;
    public final boolean e;
    public final List<p7b> f;
    public final LocalDate g;
    public final List<l89> h;
    public final boolean i;
    public final int j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oj3(String str, String str2, vn0 vn0Var, String str3, boolean z, List<? extends p7b> list, LocalDate localDate, List<l89> list2, boolean z2, int i, String str4) {
        this.a = str;
        this.b = str2;
        this.c = vn0Var;
        this.d = str3;
        this.e = z;
        this.f = list;
        this.g = localDate;
        this.h = list2;
        this.i = z2;
        this.j = i;
        this.k = str4;
    }

    public static oj3 a(oj3 oj3Var, String str, String str2, vn0 vn0Var, String str3, boolean z, List list, LocalDate localDate, List list2, int i, String str4, int i2) {
        if ((i2 & 1) != 0) {
            str = oj3Var.a;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            str2 = oj3Var.b;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            vn0Var = oj3Var.c;
        }
        vn0 vn0Var2 = vn0Var;
        String str7 = (i2 & 8) != 0 ? oj3Var.d : str3;
        boolean z2 = (i2 & 16) != 0 ? oj3Var.e : z;
        List list3 = (i2 & 32) != 0 ? oj3Var.f : list;
        LocalDate localDate2 = (i2 & 64) != 0 ? oj3Var.g : localDate;
        List list4 = (i2 & 128) != 0 ? oj3Var.h : list2;
        boolean z3 = oj3Var.i;
        int i3 = (i2 & 512) != 0 ? oj3Var.j : i;
        String str8 = (i2 & 1024) != 0 ? oj3Var.k : str4;
        oj3Var.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        return new oj3(str5, str6, vn0Var2, str7, z2, list3, localDate2, list4, z3, i3, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj3)) {
            return false;
        }
        oj3 oj3Var = (oj3) obj;
        return this.a.equals(oj3Var.a) && this.b.equals(oj3Var.b) && xj5.a(this.c, oj3Var.c) && this.d.equals(oj3Var.d) && this.e == oj3Var.e && this.f.equals(oj3Var.f) && xj5.a(this.g, oj3Var.g) && this.h.equals(oj3Var.h) && this.i == oj3Var.i && this.j == oj3Var.j && this.k.equals(oj3Var.k);
    }

    public final int hashCode() {
        int iC = ru3.c(this.a.hashCode() * 31, 31, this.b);
        vn0 vn0Var = this.c;
        int iA = ho2.a(uo2.a(ru3.c((iC + (vn0Var == null ? 0 : vn0Var.hashCode())) * 31, 31, this.d), this.e, 31), 31, this.f);
        LocalDate localDate = this.g;
        return this.k.hashCode() + os2.a(this.j, uo2.a(ho2.a((iA + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.h), this.i, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("EnterValueViewState(screenTitle=", this.a, ", buttonText=", this.b, ", value=");
        sbA.append(this.c);
        sbA.append(", enteredValue=");
        sbA.append(this.d);
        sbA.append(", isProgress=");
        sbA.append(this.e);
        sbA.append(", validation=");
        sbA.append(this.f);
        sbA.append(", selectedDate=");
        sbA.append(this.g);
        sbA.append(", attachments=");
        sbA.append(this.h);
        sbA.append(", isSaveEnabled=");
        sbA.append(this.i);
        sbA.append(", characterCount=");
        sbA.append(this.j);
        sbA.append(", note=");
        return av.a(sbA, this.k, ")");
    }
}
