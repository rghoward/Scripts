package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zl8 extends ln4 {
    public final ln4 x;
    public final int y;

    public zl8(ln4 ln4Var, int i) {
        super(22);
        this.x = ln4Var;
        this.y = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zl8)) {
            return false;
        }
        zl8 zl8Var = (zl8) obj;
        return xj5.a(zl8Var.x, this.x) && zl8Var.y == this.y;
    }

    public final int hashCode() {
        return this.x.hashCode() + (this.y * 31);
    }
}
