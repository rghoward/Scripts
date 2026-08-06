package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wg7 extends i87 {
    public final vg7 a;
    public final m76 b;

    public wg7(m76 m76Var, vg7 vg7Var) {
        vg7Var.getClass();
        this.a = vg7Var;
        this.b = m76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg7)) {
            return false;
        }
        wg7 wg7Var = (wg7) obj;
        return xj5.a(this.a, wg7Var.a) && xj5.a(this.b, wg7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m76 m76Var = this.b;
        return iHashCode + (m76Var == null ? 0 : m76Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
