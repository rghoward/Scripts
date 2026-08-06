package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oe0 extends q97 {
    public final q97.b a;
    public final q97.a b;

    public oe0(q97.b bVar, q97.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // defpackage.q97
    public final q97.a a() {
        return this.b;
    }

    @Override // defpackage.q97
    public final q97.b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q97)) {
            return false;
        }
        q97 q97Var = (q97) obj;
        q97.b bVar = this.a;
        if (bVar == null) {
            if (q97Var.b() != null) {
                return false;
            }
        } else if (!bVar.equals(q97Var.b())) {
            return false;
        }
        q97.a aVar = this.b;
        if (aVar == null) {
            return q97Var.a() == null;
        }
        return aVar.equals(q97Var.a());
    }

    public final int hashCode() {
        q97.b bVar = this.a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        q97.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
