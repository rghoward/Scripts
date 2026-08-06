package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class or8 implements el0 {
    public static final a Companion = new a();
    public static final or8 e = new or8(BuildConfig.FLAVOR, null, false, false);
    public final String a;
    public final vn0 b;
    public final boolean c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public or8(String str, vn0 vn0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = vn0Var;
        this.c = z;
        this.d = z2;
    }

    public static or8 a(or8 or8Var, String str, vn0 vn0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = or8Var.a;
        }
        if ((i & 2) != 0) {
            vn0Var = or8Var.b;
        }
        if ((i & 4) != 0) {
            z = or8Var.c;
        }
        if ((i & 8) != 0) {
            z2 = or8Var.d;
        }
        or8Var.getClass();
        str.getClass();
        return new or8(str, vn0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or8)) {
            return false;
        }
        or8 or8Var = (or8) obj;
        return this.a.equals(or8Var.a) && xj5.a(this.b, or8Var.b) && this.c == or8Var.c && this.d == or8Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vn0 vn0Var = this.b;
        return Boolean.hashCode(this.d) + uo2.a((iHashCode + (vn0Var == null ? 0 : vn0Var.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return "RequiredBenchmarkInputViewState(title=" + this.a + ", benchmark=" + this.b + ", isSaveButtonEnabled=" + this.c + ", isProgress=" + this.d + ")";
    }
}
