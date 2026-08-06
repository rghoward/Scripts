package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xe implements el0 {
    public static final a Companion = new a();
    public final oq4.b a;
    public final oq4.a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public xe(oq4.b bVar, oq4.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    public static xe a(xe xeVar, oq4.b bVar, oq4.a aVar, int i) {
        xeVar.getClass();
        if ((i & 2) != 0) {
            bVar = xeVar.a;
        }
        if ((i & 4) != 0) {
            aVar = xeVar.b;
        }
        xeVar.getClass();
        return new xe(bVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return xj5.a(this.a, xeVar.a) && xj5.a(this.b, xeVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(false) * 31;
        oq4.b bVar = this.a;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.t.hashCode())) * 31;
        oq4.a aVar = this.b;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "AffiliatedGymFilterViewState(isProgress=false, selectedCountryFilter=" + this.a + ", selectedCityFilter=" + this.b + ")";
    }
}
