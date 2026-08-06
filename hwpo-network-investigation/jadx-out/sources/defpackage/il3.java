package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class il3 implements el0 {
    public static final a Companion = new a();
    public static final il3 f = new il3(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, null, new vz7(0, false, false, null, null, null, 127));
    public final String a;
    public final String b;
    public final boolean c;
    public final xj3 d;
    public final vz7 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public il3(String str, String str2, boolean z, xj3 xj3Var, vz7 vz7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = xj3Var;
        this.e = vz7Var;
    }

    public static il3 a(il3 il3Var, String str, String str2, boolean z, xj3 xj3Var, vz7 vz7Var, int i) {
        if ((i & 1) != 0) {
            str = il3Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = il3Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = il3Var.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            xj3Var = il3Var.d;
        }
        xj3 xj3Var2 = xj3Var;
        if ((i & 16) != 0) {
            vz7Var = il3Var.e;
        }
        il3Var.getClass();
        str3.getClass();
        return new il3(str3, str4, z2, xj3Var2, vz7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il3)) {
            return false;
        }
        il3 il3Var = (il3) obj;
        return this.a.equals(il3Var.a) && this.b.equals(il3Var.b) && this.c == il3Var.c && xj5.a(this.d, il3Var.d) && this.e.equals(il3Var.e);
    }

    public final int hashCode() {
        int iA = uo2.a(ru3.c(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        xj3 xj3Var = this.d;
        return this.e.hashCode() + ((iA + (xj3Var == null ? 0 : xj3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("EntryDetailsViewState(screenTitle=", this.a, ", date=", this.b, ", isProgress=");
        sbA.append(this.c);
        sbA.append(", entryDetails=");
        sbA.append(this.d);
        sbA.append(", placeholderState=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
