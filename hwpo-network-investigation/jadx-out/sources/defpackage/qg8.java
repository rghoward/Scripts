package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qg8 implements pg8.d {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;

    public qg8(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    @Override // pg8.d
    public final void a(pg8.c cVar, int i) throws IOException {
        int[] iArr = this.b;
        try {
            cVar.read(this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            cVar.close();
        }
    }
}
