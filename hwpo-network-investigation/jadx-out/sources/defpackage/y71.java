package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y71 implements el0 {
    public static final a Companion = new a();
    public static final y71 f = new y71(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, null, new vz7(0, false, false, null, null, null, 127));
    public final String a;
    public final String b;
    public final boolean c;
    public final d71 d;
    public final vz7 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public y71(String str, String str2, boolean z, d71 d71Var, vz7 vz7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = d71Var;
        this.e = vz7Var;
    }

    public static y71 a(y71 y71Var, String str, String str2, boolean z, d71 d71Var, vz7 vz7Var, int i) {
        if ((i & 1) != 0) {
            str = y71Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = y71Var.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = y71Var.c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            d71Var = y71Var.d;
        }
        d71 d71Var2 = d71Var;
        if ((i & 16) != 0) {
            vz7Var = y71Var.e;
        }
        y71Var.getClass();
        return new y71(str3, str4, z2, d71Var2, vz7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y71)) {
            return false;
        }
        y71 y71Var = (y71) obj;
        return this.a.equals(y71Var.a) && this.b.equals(y71Var.b) && this.c == y71Var.c && xj5.a(this.d, y71Var.d) && this.e.equals(y71Var.e);
    }

    public final int hashCode() {
        int iA = uo2.a(ru3.c(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        d71 d71Var = this.d;
        return this.e.hashCode() + ((iA + (d71Var == null ? 0 : d71Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = vb0.a("ChallengeEntryDetailsViewState(screenTitle=", this.a, ", date=", this.b, ", isProgress=");
        sbA.append(this.c);
        sbA.append(", entryDetails=");
        sbA.append(this.d);
        sbA.append(", placeholderState=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
