package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lk4 extends v65 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public lk4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lk4.class != obj.getClass()) {
            return false;
        }
        lk4 lk4Var = (lk4) obj;
        return Objects.equals(this.b, lk4Var.b) && this.c.equals(lk4Var.c) && this.d.equals(lk4Var.d) && Arrays.equals(this.e, lk4Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ru3.c(ru3.c((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.v65
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
