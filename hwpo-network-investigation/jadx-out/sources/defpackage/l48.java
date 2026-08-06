package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l48 implements el0 {
    public static final a Companion = new a();
    public final boolean a;
    public final s10 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public l48(boolean z, s10 s10Var) {
        this.a = z;
        this.b = s10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l48)) {
            return false;
        }
        l48 l48Var = (l48) obj;
        return this.a == l48Var.a && this.b == l48Var.b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        s10 s10Var = this.b;
        return iHashCode + (s10Var == null ? 0 : s10Var.hashCode());
    }

    public final String toString() {
        return "PlayerViewState(isPlaceholderVisible=" + this.a + ", currentAppLanguage=" + this.b + ")";
    }
}
