package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xv2 {
    public final lr9 a;
    public final s39 b;
    public final xva.a c;
    public final x68 d;

    public xv2(lr9 lr9Var, s39 s39Var, xva.a aVar, x68 x68Var) {
        this.a = lr9Var;
        this.b = s39Var;
        this.c = aVar;
        this.d = x68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv2)) {
            return false;
        }
        xv2 xv2Var = (xv2) obj;
        return xj5.a(this.a, xv2Var.a) && this.b == xv2Var.b && xj5.a(this.c, xv2Var.c) && this.d == xv2Var.d;
    }

    public final int hashCode() {
        lr9 lr9Var = this.a;
        int iHashCode = (lr9Var != null ? lr9Var.hashCode() : 0) * 31;
        s39 s39Var = this.b;
        int iHashCode2 = (iHashCode + (s39Var != null ? s39Var.hashCode() : 0)) * 28629151;
        xva.a aVar = this.c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        x68 x68Var = this.d;
        return (iHashCode3 + (x68Var != null ? x68Var.hashCode() : 0)) * 887503681;
    }
}
