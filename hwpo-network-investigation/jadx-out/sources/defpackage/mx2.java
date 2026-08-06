package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mx2 implements ra3 {
    public final int a;
    public final int b;

    public mx2(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        vc5.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.ra3
    public final void a(td3 td3Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = td3Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(td3Var.b((i4 - i3) + (-1))) && Character.isLowSurrogate(td3Var.b(td3Var.b - i3))) ? i + 2 : i3;
        }
        int iA = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iA + 1;
            int i7 = td3Var.c;
            yt7 yt7Var = td3Var.a;
            if (i7 + i6 >= yt7Var.a()) {
                iA = yt7Var.a() - td3Var.c;
                break;
            }
            iA = (Character.isHighSurrogate(td3Var.b((td3Var.c + i6) + (-1))) && Character.isLowSurrogate(td3Var.b(td3Var.c + i6))) ? iA + 2 : i6;
        }
        int i8 = td3Var.c;
        td3Var.a(i8, iA + i8);
        int i9 = td3Var.b;
        td3Var.a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx2)) {
            return false;
        }
        mx2 mx2Var = (mx2) obj;
        return this.a == mx2Var.a && this.b == mx2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return e44.a(sb, this.b, ')');
    }
}
