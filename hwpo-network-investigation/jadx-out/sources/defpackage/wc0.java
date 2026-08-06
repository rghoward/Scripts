package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wc0 extends np1 {
    public final fe0 a;
    public final np1.a b;

    public wc0(fe0 fe0Var) {
        np1.a aVar = np1.a.t;
        this.a = fe0Var;
        this.b = aVar;
    }

    @Override // defpackage.np1
    public final is3 a() {
        return this.a;
    }

    @Override // defpackage.np1
    public final np1.a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof np1)) {
            return false;
        }
        np1 np1Var = (np1) obj;
        fe0 fe0Var = this.a;
        if (fe0Var == null) {
            if (np1Var.a() != null) {
                return false;
            }
        } else if (!fe0Var.equals(np1Var.a())) {
            return false;
        }
        np1.a aVar = this.b;
        if (aVar == null) {
            return np1Var.b() == null;
        }
        return aVar.equals(np1Var.b());
    }

    public final int hashCode() {
        fe0 fe0Var = this.a;
        int iHashCode = ((fe0Var == null ? 0 : fe0Var.hashCode()) ^ 1000003) * 1000003;
        np1.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}
