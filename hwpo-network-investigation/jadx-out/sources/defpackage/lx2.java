package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lx2 implements ra3 {
    public final int a;
    public final int b;

    public lx2(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        vc5.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.ra3
    public final void a(td3 td3Var) {
        int i = td3Var.c;
        yt7 yt7Var = td3Var.a;
        int i2 = this.b;
        int iA = i + i2;
        if (((i ^ iA) & (i2 ^ iA)) < 0) {
            iA = yt7Var.a();
        }
        td3Var.a(td3Var.c, Math.min(iA, yt7Var.a()));
        int i3 = td3Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        td3Var.a(Math.max(0, i5), td3Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx2)) {
            return false;
        }
        lx2 lx2Var = (lx2) obj;
        return this.a == lx2Var.a && this.b == lx2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return e44.a(sb, this.b, ')');
    }
}
