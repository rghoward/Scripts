package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements t89 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public wc1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.t89
    public final boolean b() {
        return true;
    }

    @Override // defpackage.t89
    public final t89.a e(long j) {
        long[] jArr = this.e;
        int iF = n6b.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        v89 v89Var = new v89(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new t89.a(v89Var, v89Var);
        }
        int i = iF + 1;
        return new t89.a(v89Var, new v89(jArr[i], jArr2[i]));
    }

    @Override // defpackage.t89
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
