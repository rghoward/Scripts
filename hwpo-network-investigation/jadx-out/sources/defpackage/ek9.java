package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ek9 implements ra3 {
    public final int a;
    public final int b;

    public ek9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ra3
    public final void a(td3 td3Var) {
        int iG = uh8.g(this.a, 0, td3Var.a.a());
        int iG2 = uh8.g(this.b, 0, td3Var.a.a());
        if (iG < iG2) {
            td3Var.h(iG, iG2);
        } else {
            td3Var.h(iG2, iG);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek9)) {
            return false;
        }
        ek9 ek9Var = (ek9) obj;
        return this.a == ek9Var.a && this.b == ek9Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return e44.a(sb, this.b, ')');
    }
}
