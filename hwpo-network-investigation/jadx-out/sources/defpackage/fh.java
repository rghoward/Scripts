package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fh implements u23 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public fh(String str, String str2, int i, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public static fh a(fh fhVar, boolean z) {
        int i = fhVar.a;
        String str = fhVar.b;
        String str2 = fhVar.c;
        str.getClass();
        return new fh(str, str2, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj;
        return this.a == fhVar.a && xj5.a(this.b, fhVar.b) && this.c.equals(fhVar.c) && this.d == fhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ru3.c(ru3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = il.a("AffiliatedGymUiEntity(id=", ", firstRow=", this.b, ", secondRow=", this.a);
        sbA.append(this.c);
        sbA.append(", isSelected=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
