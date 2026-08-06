package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0b extends g98<x0b> {
    public long[] a;
    public int b;

    @Override // defpackage.g98
    public final x0b a() {
        return new x0b(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.g98
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.g98
    public final int d() {
        return this.b;
    }
}
