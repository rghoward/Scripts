package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fk1 extends v65 {
    public final String b;
    public final String c;
    public final String d;

    public fk1(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fk1.class != obj.getClass()) {
            return false;
        }
        fk1 fk1Var = (fk1) obj;
        return this.c.equals(fk1Var.c) && this.b.equals(fk1Var.b) && Objects.equals(this.d, fk1Var.d);
    }

    public final int hashCode() {
        int iC = ru3.c(ru3.c(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.v65
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
