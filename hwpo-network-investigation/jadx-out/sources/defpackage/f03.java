package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f03 {
    public final boolean a;
    public final boolean b;
    public final s89 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public f03(int i) {
        boolean z = (i & 2) != 0;
        boolean z2 = (i & 4) != 0;
        z = (224 & 2) != 0 ? true : z;
        z2 = (224 & 8) != 0 ? true : z2;
        this.a = true;
        this.b = z;
        this.c = s89.t;
        this.d = z2;
        this.e = true;
        this.f = BuildConfig.FLAVOR;
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f03)) {
            return false;
        }
        f03 f03Var = (f03) obj;
        return this.a == f03Var.a && this.b == f03Var.b && this.c == f03Var.c && this.d == f03Var.d && this.e == f03Var.e && this.g == f03Var.g;
    }

    public final int hashCode() {
        return (uo2.a(uo2.a((this.c.hashCode() + uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31)) * 31, this.d, 31), this.e, 31) + this.g) * 31;
    }
}
