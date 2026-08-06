package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xj9 implements el0 {
    public static final a Companion = new a();
    public final bc8 a;
    public final List<s23> b;
    public final boolean c;
    public final String d;
    public final String e;
    public final h08 f;
    public final vz7 g;
    public final boolean h;
    public final yl2 i;
    public final yl2 j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xj9(bc8 bc8Var, List<? extends s23> list, boolean z, String str, String str2, h08 h08Var, vz7 vz7Var, boolean z2, yl2 yl2Var, yl2 yl2Var2) {
        this.a = bc8Var;
        this.b = list;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = h08Var;
        this.g = vz7Var;
        this.h = z2;
        this.i = yl2Var;
        this.j = yl2Var2;
    }

    public static xj9 a(xj9 xj9Var, bc8 bc8Var, List list, boolean z, String str, String str2, h08 h08Var, vz7 vz7Var, yl2 yl2Var, yl2 yl2Var2, int i) {
        if ((i & 1) != 0) {
            bc8Var = xj9Var.a;
        }
        bc8 bc8Var2 = bc8Var;
        if ((i & 2) != 0) {
            list = xj9Var.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = xj9Var.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str = xj9Var.d;
        }
        String str3 = str;
        String str4 = (i & 16) != 0 ? xj9Var.e : str2;
        h08 h08Var2 = (i & 32) != 0 ? xj9Var.f : h08Var;
        vz7 vz7Var2 = (i & 64) != 0 ? xj9Var.g : vz7Var;
        boolean z3 = xj9Var.h;
        yl2 yl2Var3 = (i & 256) != 0 ? xj9Var.i : yl2Var;
        yl2 yl2Var4 = (i & 512) != 0 ? xj9Var.j : yl2Var2;
        xj9Var.getClass();
        list2.getClass();
        return new xj9(bc8Var2, list2, z2, str3, str4, h08Var2, vz7Var2, z3, yl2Var3, yl2Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj9)) {
            return false;
        }
        xj9 xj9Var = (xj9) obj;
        return xj5.a(this.a, xj9Var.a) && this.b.equals(xj9Var.b) && this.c == xj9Var.c && this.d.equals(xj9Var.d) && this.e.equals(xj9Var.e) && xj5.a(this.f, xj9Var.f) && this.g.equals(xj9Var.g) && this.h == xj9Var.h && this.i == xj9Var.i && this.j == xj9Var.j;
    }

    public final int hashCode() {
        bc8 bc8Var = this.a;
        int iC = ru3.c(ru3.c(uo2.a(ho2.a((bc8Var == null ? 0 : bc8Var.hashCode()) * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e);
        h08 h08Var = this.f;
        return this.j.hashCode() + ((this.i.hashCode() + uo2.a((this.g.hashCode() + ((iC + (h08Var != null ? h08Var.hashCode() : 0)) * 31)) * 31, this.h, 31)) * 31);
    }

    public final String toString() {
        return "SessionsViewState(program=" + this.a + ", sessionItems=" + this.b + ", isProgress=" + this.c + ", programTitle=" + this.d + ", programSubtitle=" + this.e + ", selectedOption=" + this.f + ", placeholderState=" + this.g + ", canReschedule=" + this.h + ", prevDayButtonState=" + this.i + ", nextDayButtonState=" + this.j + ")";
    }
}
