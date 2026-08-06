package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t7 implements el0 {
    public static final a Companion = new a();
    public static final t7 g = new t7(null, null, null, null, false, false);
    public final wj4 a;
    public final zlb b;
    public final o33 c;
    public final s10 d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public t7(s10 s10Var, o33 o33Var, wj4 wj4Var, zlb zlbVar, boolean z, boolean z2) {
        this.a = wj4Var;
        this.b = zlbVar;
        this.c = o33Var;
        this.d = s10Var;
        this.e = z;
        this.f = z2;
    }

    public static t7 a(t7 t7Var, wj4 wj4Var, zlb zlbVar, o33 o33Var, s10 s10Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            wj4Var = t7Var.a;
        }
        wj4 wj4Var2 = wj4Var;
        if ((i & 2) != 0) {
            zlbVar = t7Var.b;
        }
        zlb zlbVar2 = zlbVar;
        if ((i & 4) != 0) {
            o33Var = t7Var.c;
        }
        o33 o33Var2 = o33Var;
        if ((i & 8) != 0) {
            s10Var = t7Var.d;
        }
        s10 s10Var2 = s10Var;
        if ((i & 16) != 0) {
            z = t7Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = t7Var.f;
        }
        t7Var.getClass();
        return new t7(s10Var2, o33Var2, wj4Var2, zlbVar2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return this.a == t7Var.a && this.b == t7Var.b && this.c == t7Var.c && this.d == t7Var.d && this.e == t7Var.e && this.f == t7Var.f;
    }

    public final int hashCode() {
        wj4 wj4Var = this.a;
        int iHashCode = (wj4Var == null ? 0 : wj4Var.hashCode()) * 31;
        zlb zlbVar = this.b;
        int iHashCode2 = (iHashCode + (zlbVar == null ? 0 : zlbVar.hashCode())) * 31;
        o33 o33Var = this.c;
        int iHashCode3 = (iHashCode2 + (o33Var == null ? 0 : o33Var.hashCode())) * 31;
        s10 s10Var = this.d;
        return Boolean.hashCode(this.f) + uo2.a((iHashCode3 + (s10Var != null ? s10Var.hashCode() : 0)) * 31, this.e, 31);
    }

    public final String toString() {
        return "AccountSettingsViewState(gender=" + this.a + ", weightUnits=" + this.b + ", distanceUnits=" + this.c + ", selectedLanguage=" + this.d + ", isSaveButtonEnabled=" + this.e + ", isProgress=" + this.f + ")";
    }
}
