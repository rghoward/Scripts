package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class el1 extends gm3<g2b> {
    public final boolean b;
    public final boolean c;

    public el1(boolean z, boolean z2) {
        super(g2b.a);
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el1)) {
            return false;
        }
        el1 el1Var = (el1) obj;
        return this.b == el1Var.b && this.c == el1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ShowCommentActionsDialog(isDeleteVisible=" + this.b + ", isReportVisible=" + this.c + ")";
    }
}
