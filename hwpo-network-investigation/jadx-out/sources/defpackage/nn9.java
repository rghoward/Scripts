package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class nn9 extends g98<short[]> {
    public short[] a;
    public int b;

    @Override // defpackage.g98
    public final short[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.g98
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.g98
    public final int d() {
        return this.b;
    }
}
