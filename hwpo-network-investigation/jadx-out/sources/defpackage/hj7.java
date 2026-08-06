package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hj7 implements el0 {
    public static final a Companion = new a();
    public static final hj7 g = new hj7(null, null, wj4.t, null, false, false);
    public final wj4 a;
    public final zlb b;
    public final o33 c;
    public final boolean d;
    public final boolean e;
    public final s10 f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public hj7(s10 s10Var, o33 o33Var, wj4 wj4Var, zlb zlbVar, boolean z, boolean z2) {
        this.a = wj4Var;
        this.b = zlbVar;
        this.c = o33Var;
        this.d = z;
        this.e = z2;
        this.f = s10Var;
    }

    public static hj7 a(hj7 hj7Var, wj4 wj4Var, zlb zlbVar, o33 o33Var, boolean z, boolean z2, s10 s10Var, int i) {
        if ((i & 1) != 0) {
            wj4Var = hj7Var.a;
        }
        wj4 wj4Var2 = wj4Var;
        if ((i & 2) != 0) {
            zlbVar = hj7Var.b;
        }
        zlb zlbVar2 = zlbVar;
        if ((i & 4) != 0) {
            o33Var = hj7Var.c;
        }
        o33 o33Var2 = o33Var;
        if ((i & 8) != 0) {
            z = hj7Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = hj7Var.e;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            s10Var = hj7Var.f;
        }
        hj7Var.getClass();
        return new hj7(s10Var, o33Var2, wj4Var2, zlbVar2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj7)) {
            return false;
        }
        hj7 hj7Var = (hj7) obj;
        return this.a == hj7Var.a && this.b == hj7Var.b && this.c == hj7Var.c && this.d == hj7Var.d && this.e == hj7Var.e && this.f == hj7Var.f;
    }

    public final int hashCode() {
        wj4 wj4Var = this.a;
        int iHashCode = (wj4Var == null ? 0 : wj4Var.hashCode()) * 31;
        zlb zlbVar = this.b;
        int iHashCode2 = (iHashCode + (zlbVar == null ? 0 : zlbVar.hashCode())) * 31;
        o33 o33Var = this.c;
        int iA = uo2.a(uo2.a((iHashCode2 + (o33Var == null ? 0 : o33Var.hashCode())) * 31, this.d, 31), this.e, 31);
        s10 s10Var = this.f;
        return iA + (s10Var != null ? s10Var.hashCode() : 0);
    }

    public final String toString() {
        return "OnboardingSettingsFirstPageViewState(gender=" + this.a + ", weightUnits=" + this.b + ", distanceUnits=" + this.c + ", isSaveButtonEnabled=" + this.d + ", isProgress=" + this.e + ", appLanguage=" + this.f + ")";
    }
}
