package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cs4 implements el0 {
    public static final a Companion = new a();
    public final boolean a;
    public final String b;
    public final String c;
    public final List<w23> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final vz7 h;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cs4(boolean z, String str, String str2, List<? extends w23> list, boolean z2, boolean z3, boolean z4, vz7 vz7Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = vz7Var;
    }

    public static cs4 a(cs4 cs4Var, boolean z, String str, String str2, List list, boolean z2, boolean z3, boolean z4, vz7 vz7Var, int i) {
        if ((i & 1) != 0) {
            z = cs4Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            str = cs4Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = cs4Var.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = cs4Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z2 = cs4Var.e;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            z3 = cs4Var.f;
        }
        boolean z7 = z3;
        boolean z8 = (i & 64) != 0 ? cs4Var.g : z4;
        vz7 vz7Var2 = (i & 128) != 0 ? cs4Var.h : vz7Var;
        cs4Var.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        return new cs4(z5, str3, str4, list2, z6, z7, z8, vz7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs4)) {
            return false;
        }
        cs4 cs4Var = (cs4) obj;
        return this.a == cs4Var.a && this.b.equals(cs4Var.b) && this.c.equals(cs4Var.c) && this.d.equals(cs4Var.d) && this.e == cs4Var.e && this.f == cs4Var.f && this.g == cs4Var.g && this.h.equals(cs4Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uo2.a(uo2.a(uo2.a(ho2.a(ru3.c(ru3.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GymLocationFilterViewState(isProgress=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", pickItemLabel=");
        sb.append(this.c);
        sb.append(", filterItems=");
        sb.append(this.d);
        sb.append(", isPaginationProgress=");
        e4.a(sb, this.e, ", hasNextPage=", this.f, ", saveEnabled=");
        sb.append(this.g);
        sb.append(", placeholderState=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
