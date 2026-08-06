package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class de0 extends pq3 {
    public final byte[] a;
    public final byte[] b;

    public de0(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // defpackage.pq3
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.pq3
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pq3)) {
            return false;
        }
        pq3 pq3Var = (pq3) obj;
        boolean z = pq3Var instanceof de0;
        if (Arrays.equals(this.a, z ? ((de0) pq3Var).a : pq3Var.a())) {
            return Arrays.equals(this.b, z ? ((de0) pq3Var).b : pq3Var.b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
