package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ud implements el0 {
    public static final a Companion = new a();
    public static final ud l;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List<t23> e;
    public final List<cbb> f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final vz7 k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    static {
        vz7 vz7Var = new vz7(0, false, false, null, null, null, 127);
        hf3 hf3Var = hf3.t;
        l = new ud(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, hf3Var, hf3Var, false, false, true, false, vz7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ud(String str, String str2, String str3, String str4, List<? extends t23> list, List<cbb> list2, boolean z, boolean z2, boolean z3, boolean z4, vz7 vz7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = vz7Var;
    }

    public static ud a(ud udVar, String str, String str2, String str3, String str4, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, vz7 vz7Var, int i) {
        if ((i & 1) != 0) {
            str = udVar.a;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = udVar.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = udVar.c;
        }
        String str7 = str3;
        String str8 = (i & 8) != 0 ? udVar.d : str4;
        List list3 = (i & 16) != 0 ? udVar.e : list;
        List list4 = (i & 32) != 0 ? udVar.f : list2;
        boolean z5 = (i & 64) != 0 ? udVar.g : z;
        boolean z6 = (i & 128) != 0 ? udVar.h : z2;
        boolean z7 = (i & 256) != 0 ? udVar.i : z3;
        boolean z8 = (i & 512) != 0 ? udVar.j : z4;
        vz7 vz7Var2 = (i & 1024) != 0 ? udVar.k : vz7Var;
        udVar.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        list3.getClass();
        list4.getClass();
        return new ud(str5, str6, str7, str8, list3, list4, z5, z6, z7, z8, vz7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return this.a.equals(udVar.a) && this.b.equals(udVar.b) && this.c.equals(udVar.c) && this.d.equals(udVar.d) && this.e.equals(udVar.e) && this.f.equals(udVar.f) && this.g == udVar.g && this.h == udVar.h && this.i == udVar.i && this.j == udVar.j && this.k.equals(udVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + uo2.a(uo2.a(uo2.a(uo2.a(ho2.a(ho2.a(ru3.c(ru3.c(ru3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("AddValueViewState(screenTitle=", this.a, ", searchHint=", this.b, ", listTitle=");
        ux1.b(sbA, this.c, ", buttonText=", this.d, ", valueItems=");
        sbA.append(this.e);
        sbA.append(", valueItemsDomain=");
        sbA.append(this.f);
        sbA.append(", isProgress=");
        e4.a(sbA, this.g, ", isPaginationProgress=", this.h, ", hasNextPage=");
        e4.a(sbA, this.i, ", isSaveEnabled=", this.j, ", placeholderState=");
        sbA.append(this.k);
        sbA.append(")");
        return sbA.toString();
    }
}
