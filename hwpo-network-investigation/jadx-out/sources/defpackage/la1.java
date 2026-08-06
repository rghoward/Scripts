package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class la1 extends g98<char[]> {
    public char[] a;
    public int b;

    @Override // defpackage.g98
    public final char[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.g98
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.g98
    public final int d() {
        return this.b;
    }
}
