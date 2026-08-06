package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v98 extends v65 {
    public final String b;
    public final byte[] c;

    public v98(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v98.class != obj.getClass()) {
            return false;
        }
        v98 v98Var = (v98) obj;
        return this.b.equals(v98Var.b) && Arrays.equals(this.c, v98Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ru3.c(527, 31, this.b);
    }

    @Override // defpackage.v65
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
