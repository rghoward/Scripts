package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends v65 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final v65[] f;

    public ka1(String str, boolean z, boolean z2, String[] strArr, v65[] v65VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = v65VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ka1.class != obj.getClass()) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        return this.c == ka1Var.c && this.d == ka1Var.d && this.b.equals(ka1Var.b) && Arrays.equals(this.e, ka1Var.e) && Arrays.equals(this.f, ka1Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
