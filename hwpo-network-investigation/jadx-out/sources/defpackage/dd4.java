package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dd4 implements el0 {
    public static final a Companion = new a();
    public static final dd4 d = new dd4(false, BuildConfig.FLAVOR, false);
    public final String a;
    public final boolean b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public dd4(boolean z, String str, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public static dd4 a(dd4 dd4Var, String str, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = dd4Var.a;
        }
        dd4Var.getClass();
        if ((i & 4) != 0) {
            z = dd4Var.b;
        }
        if ((i & 8) != 0) {
            z2 = dd4Var.c;
        }
        dd4Var.getClass();
        str.getClass();
        return new dd4(z, str, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd4)) {
            return false;
        }
        dd4 dd4Var = (dd4) obj;
        return this.a.equals(dd4Var.a) && this.b == dd4Var.b && this.c == dd4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + uo2.a(this.a.hashCode() * 961, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForgotPasswordViewState(email=");
        sb.append(this.a);
        sb.append(", emailError=null, isRestorePasswordBtnEnabled=");
        sb.append(this.b);
        sb.append(", isProgress=");
        return fz.c(sb, this.c, ")");
    }
}
