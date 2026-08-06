package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cq5 {
    public final String a;
    public final LocalDate b;
    public final String c;

    public cq5(String str, LocalDate localDate, String str2) {
        str.getClass();
        this.a = str;
        this.b = localDate;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq5)) {
            return false;
        }
        cq5 cq5Var = (cq5) obj;
        return xj5.a(this.a, cq5Var.a) && this.b.equals(cq5Var.b) && xj5.a(this.c, cq5Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchDate(title=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", cover=");
        return av.a(sb, this.c, ")");
    }
}
