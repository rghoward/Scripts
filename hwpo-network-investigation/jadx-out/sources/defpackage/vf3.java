package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vf3 {
    public final ag3 a;
    public final byte[] b;

    public vf3(ag3 ag3Var, byte[] bArr) {
        if (ag3Var == null) {
            ac4.c("encoding is null");
            throw null;
        }
        if (bArr == null) {
            ac4.c("bytes is null");
            throw null;
        }
        this.a = ag3Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3)) {
            return false;
        }
        vf3 vf3Var = (vf3) obj;
        if (this.a.equals(vf3Var.a)) {
            return Arrays.equals(this.b, vf3Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
