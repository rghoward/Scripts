package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vc0 extends lf1 {
    public final lf1.a a = lf1.a.t;
    public final rc0 b;

    public vc0(rc0 rc0Var) {
        this.b = rc0Var;
    }

    @Override // defpackage.lf1
    public final rl a() {
        return this.b;
    }

    @Override // defpackage.lf1
    public final lf1.a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lf1)) {
            return false;
        }
        lf1 lf1Var = (lf1) obj;
        lf1.a aVar = this.a;
        if (aVar == null) {
            if (lf1Var.b() != null) {
                return false;
            }
        } else if (!aVar.equals(lf1Var.b())) {
            return false;
        }
        rc0 rc0Var = this.b;
        if (rc0Var == null) {
            return lf1Var.a() == null;
        }
        return rc0Var.equals(lf1Var.a());
    }

    public final int hashCode() {
        lf1.a aVar = this.a;
        int iHashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        rc0 rc0Var = this.b;
        return iHashCode ^ (rc0Var != null ? rc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
