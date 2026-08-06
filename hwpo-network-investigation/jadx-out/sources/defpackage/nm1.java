package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 implements v23 {
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Integer d;

    public nm1(String str, String str2, int i, Integer num) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm1)) {
            return false;
        }
        nm1 nm1Var = (nm1) obj;
        return xj5.a(this.a, nm1Var.a) && xj5.a(this.b, nm1Var.b) && this.c == nm1Var.c && xj5.a(this.d, nm1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int iA = os2.a(this.c, (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        Integer num = this.d;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CommentsHeaderUiEntity(title=" + this.a + ", description=" + ((Object) this.b) + ", color=" + this.c + ", attachmentsCount=" + this.d + ")";
    }
}
