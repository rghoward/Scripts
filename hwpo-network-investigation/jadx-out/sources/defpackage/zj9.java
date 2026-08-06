package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zj9 implements ra3 {
    public final int a;
    public final int b;

    public zj9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ra3
    public final void a(td3 td3Var) {
        boolean zE = td3Var.e();
        yt7 yt7Var = td3Var.a;
        if (zE) {
            td3Var.d = -1;
            td3Var.e = -1;
        }
        int iG = uh8.g(this.a, 0, yt7Var.a());
        int iG2 = uh8.g(this.b, 0, yt7Var.a());
        if (iG != iG2) {
            if (iG < iG2) {
                td3Var.g(iG, iG2);
            } else {
                td3Var.g(iG2, iG);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj9)) {
            return false;
        }
        zj9 zj9Var = (zj9) obj;
        return this.a == zj9Var.a && this.b == zj9Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return e44.a(sb, this.b, ')');
    }
}
