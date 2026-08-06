package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class js0 {
    public po a = null;
    public ol b = null;
    public s41 c = null;
    public vp d = null;

    public js0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js0)) {
            return false;
        }
        js0 js0Var = (js0) obj;
        return xj5.a(this.a, js0Var.a) && xj5.a(this.b, js0Var.b) && xj5.a(this.c, js0Var.c) && xj5.a(this.d, js0Var.d);
    }

    public final int hashCode() {
        po poVar = this.a;
        int iHashCode = (poVar == null ? 0 : poVar.hashCode()) * 31;
        ol olVar = this.b;
        int iHashCode2 = (iHashCode + (olVar == null ? 0 : olVar.hashCode())) * 31;
        s41 s41Var = this.c;
        int iHashCode3 = (iHashCode2 + (s41Var == null ? 0 : s41Var.hashCode())) * 31;
        vp vpVar = this.d;
        return iHashCode3 + (vpVar != null ? vpVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
