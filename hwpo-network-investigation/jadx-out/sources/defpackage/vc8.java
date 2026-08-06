package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vc8 {
    public static final a Companion = new a();
    public final int a;
    public final String b;
    public final List<m89> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public vc8(int i, String str, List<m89> list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc8)) {
            return false;
        }
        vc8 vc8Var = (vc8) obj;
        return this.a == vc8Var.a && xj5.a(this.b, vc8Var.b) && this.c.equals(vc8Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ProgramPerformanceModel(id=", ", text=", this.b, ", attachments=", this.a);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
