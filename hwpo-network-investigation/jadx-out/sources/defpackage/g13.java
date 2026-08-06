package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g13 implements hsa {
    public final byte[] a = new byte[4096];

    @Override // defpackage.hsa
    public final void b(pt7 pt7Var, int i, int i2) {
        pt7Var.N(i);
    }

    @Override // defpackage.hsa
    public final int c(ef2 ef2Var, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = ef2Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.hsa
    public final void g(id4 id4Var) {
    }

    @Override // defpackage.hsa
    public final void a(long j, int i, int i2, int i3, hsa.a aVar) {
    }
}
