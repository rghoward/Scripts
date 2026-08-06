package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vz7 {
    public static final a Companion = new a();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public static vz7 a(bu8 bu8Var) {
            bu8Var.getClass();
            return new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65);
        }
    }

    public /* synthetic */ vz7(int i, boolean z, boolean z2, String str, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? BuildConfig.FLAVOR : str, (i2 & 16) != 0 ? BuildConfig.FLAVOR : str2, (i2 & 32) != 0 ? BuildConfig.FLAVOR : str3);
    }

    public static vz7 a(vz7 vz7Var) {
        int i = vz7Var.a;
        boolean z = vz7Var.c;
        String str = vz7Var.d;
        String str2 = vz7Var.e;
        String str3 = vz7Var.f;
        vz7Var.getClass();
        vz7Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new vz7(i, false, z, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz7)) {
            return false;
        }
        vz7 vz7Var = (vz7) obj;
        return this.a == vz7Var.a && this.b == vz7Var.b && this.c == vz7Var.c && xj5.a(this.d, vz7Var.d) && xj5.a(this.e, vz7Var.e) && xj5.a(this.f, vz7Var.f);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ru3.c(ru3.c(ru3.c(uo2.a(uo2.a(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceholderState(placeholderId=");
        sb.append(this.a);
        sb.append(", isVisible=");
        sb.append(this.b);
        sb.append(", showActionButton=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subTitle=");
        return ao2.a(sb, this.e, ", actionButtonText=", this.f, ", image=0)");
    }

    public vz7(int i, boolean z, boolean z2, String str, String str2, String str3) {
        fk.b(str, str2, str3);
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public vz7() {
        this(0, false, false, null, null, null, 127);
    }
}
