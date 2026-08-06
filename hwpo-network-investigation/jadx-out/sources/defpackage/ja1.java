package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 extends v65 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final v65[] g;

    public ja1(String str, int i, int i2, long j, long j2, v65[] v65VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = v65VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ja1.class != obj.getClass()) {
            return false;
        }
        ja1 ja1Var = (ja1) obj;
        return this.c == ja1Var.c && this.d == ja1Var.d && this.e == ja1Var.e && this.f == ja1Var.f && this.b.equals(ja1Var.b) && Arrays.equals(this.g, ja1Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
