package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l59 {
    public final int a;
    public final List<String> b;
    public final String c;
    public final long d;
    public final List<m89> e;

    public l59(int i, List<String> list, String str, long j, List<m89> list2) {
        list.getClass();
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = j;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l59)) {
            return false;
        }
        l59 l59Var = (l59) obj;
        return this.a == l59Var.a && xj5.a(this.b, l59Var.b) && xj5.a(this.c, l59Var.c) && this.d == l59Var.d && this.e.equals(l59Var.e);
    }

    public final int hashCode() {
        int iA = ho2.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + al.c(this.d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ScoreInfo(id=" + this.a + ", tags=" + this.b + ", description=" + this.c + ", updatedAt=" + this.d + ", attachments=" + this.e + ")";
    }
}
