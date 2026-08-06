package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0b extends g98<n0b> {
    public byte[] a;
    public int b;

    @Override // defpackage.g98
    public final n0b a() {
        return new n0b(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.g98
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.g98
    public final int d() {
        return this.b;
    }
}
