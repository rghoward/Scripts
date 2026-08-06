package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ej5 extends v65 {
    public final String b;
    public final String c;
    public final String d;

    public ej5(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ej5.class != obj.getClass()) {
            return false;
        }
        ej5 ej5Var = (ej5) obj;
        return this.c.equals(ej5Var.c) && this.b.equals(ej5Var.b) && this.d.equals(ej5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ru3.c(ru3.c(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.v65
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
