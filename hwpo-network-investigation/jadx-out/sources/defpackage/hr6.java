package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hr6 {
    public final int a;
    public final boolean b;
    public final String c;

    public hr6(int i, String str, boolean z) {
        str.getClass();
        this.a = i;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr6)) {
            return false;
        }
        hr6 hr6Var = (hr6) obj;
        return this.a == hr6Var.a && this.b == hr6Var.b && xj5.a(this.c, hr6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uo2.a(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MentionUiEntity(userId=");
        sb.append(this.a);
        sb.append(", isMentionMine=");
        sb.append(this.b);
        sb.append(", userFullName=");
        return av.a(sb, this.c, ")");
    }
}
