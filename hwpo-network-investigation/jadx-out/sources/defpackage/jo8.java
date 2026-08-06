package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jo8 {
    public final String a;
    public final String b;

    public jo8(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo8)) {
            return false;
        }
        jo8 jo8Var = (jo8) obj;
        return this.a.equals(jo8Var.a) && xj5.a(this.b, jo8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return op3.a("ReportReason(textId=", this.a, ", text=", this.b, ")");
    }
}
