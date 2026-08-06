package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gr6 {
    public final int a;
    public final String b;

    public gr6(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr6)) {
            return false;
        }
        gr6 gr6Var = (gr6) obj;
        return this.a == gr6Var.a && xj5.a(this.b, gr6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MentionModel(id=" + this.a + ", fullName=" + this.b + ")";
    }
}
