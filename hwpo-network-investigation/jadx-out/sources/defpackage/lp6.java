package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lp6 implements el0 {
    public static final a Companion = new a();
    public static final lp6 j = new lp6(new vz7(0, false, false, null, null, null, 127), false, false, false, hf3.t, 0, null, null, BuildConfig.FLAVOR);
    public final vz7 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List<x60> e;
    public final int f;
    public final String g;
    public final sn6 h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lp6(vz7 vz7Var, boolean z, boolean z2, boolean z3, List<? extends x60> list, int i, String str, sn6 sn6Var, String str2) {
        this.a = vz7Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = list;
        this.f = i;
        this.g = str;
        this.h = sn6Var;
        this.i = str2;
    }

    public static lp6 a(lp6 lp6Var, vz7 vz7Var, boolean z, boolean z2, boolean z3, List list, int i, String str, sn6 sn6Var, String str2, int i2) {
        if ((i2 & 1) != 0) {
            vz7Var = lp6Var.a;
        }
        vz7 vz7Var2 = vz7Var;
        if ((i2 & 2) != 0) {
            z = lp6Var.b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = lp6Var.c;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            z3 = lp6Var.d;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            list = lp6Var.e;
        }
        List list2 = list;
        int i3 = (i2 & 32) != 0 ? lp6Var.f : i;
        String str3 = (i2 & 64) != 0 ? lp6Var.g : str;
        sn6 sn6Var2 = (i2 & 128) != 0 ? lp6Var.h : sn6Var;
        String str4 = (i2 & 256) != 0 ? lp6Var.i : str2;
        lp6Var.getClass();
        str4.getClass();
        return new lp6(vz7Var2, z4, z5, z6, list2, i3, str3, sn6Var2, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp6)) {
            return false;
        }
        lp6 lp6Var = (lp6) obj;
        return this.a.equals(lp6Var.a) && this.b == lp6Var.b && this.c == lp6Var.c && this.d == lp6Var.d && this.e.equals(lp6Var.e) && this.f == lp6Var.f && xj5.a(this.g, lp6Var.g) && this.h == lp6Var.h && this.i.equals(lp6Var.i);
    }

    public final int hashCode() {
        int iA = os2.a(this.f, ho2.a(uo2.a(uo2.a(uo2.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31);
        String str = this.g;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        sn6 sn6Var = this.h;
        return this.i.hashCode() + ((iHashCode + (sn6Var != null ? sn6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaLibraryViewState(placeholderState=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isPaginationProgress=");
        e4.a(sb, this.c, ", isClearSelectionsButtonVisible=", this.d, ", attachmentsList=");
        sb.append(this.e);
        sb.append(", selectedAttachmentsCount=");
        sb.append(this.f);
        sb.append(", sendFilesCountText=");
        sb.append(this.g);
        sb.append(", selectedFilter=");
        sb.append(this.h);
        sb.append(", selectedFilterText=");
        return av.a(sb, this.i, ")");
    }
}
