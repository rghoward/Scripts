package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ps6 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ps6(String str, String str2, String str3, String str4, int i) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps6)) {
            return false;
        }
        ps6 ps6Var = (ps6) obj;
        return this.a == ps6Var.a && xj5.a(this.b, ps6Var.b) && xj5.a(this.c, ps6Var.c) && xj5.a(this.d, ps6Var.d) && xj5.a(this.e, ps6Var.e);
    }

    public final int hashCode() {
        int iC = ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("MessageAuthorModel(id=", ", fullName=", this.b, ", firstName=", this.a);
        ux1.b(sbA, this.c, ", lastName=", this.d, ", avatarUrl=");
        return av.a(sbA, this.e, ")");
    }
}
