package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l5b {
    public final String a;
    public final String b;

    public l5b(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5b)) {
            return false;
        }
        l5b l5bVar = (l5b) obj;
        return xj5.a(this.a, l5bVar.a) && this.b.equals(l5bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return op3.a("UserCountryUiEntity(countryCode=", this.a, ", countryName=", this.b, ")");
    }
}
