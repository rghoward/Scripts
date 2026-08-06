package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p16 extends l4c {
    public final boolean b;
    public final x06 c;
    public final tw5 d;
    public final x16 e;

    public p16(boolean z, x06 x06Var, tw5 tw5Var, x16 x16Var) {
        super(2);
        this.b = z;
        this.c = x06Var;
        this.d = tw5Var;
        this.e = x16Var;
    }

    @Override // defpackage.l4c
    public final uw5 a(int i, int i2, int i3, long j) {
        x06 x06Var = this.c;
        return u(i, i2, i3, x06Var.f(i), x06Var.g(i), c(this.d, i, j), j);
    }

    public abstract s16 u(int i, int i2, int i3, Object obj, Object obj2, List<? extends jz7> list, long j);

    public final s16 v(int i, long j) {
        int i2;
        long jH;
        x06 x06Var = this.c;
        Object objF = x06Var.f(i);
        Object objG = x06Var.g(i);
        x16 x16Var = this.e;
        int[] iArr = x16Var.b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = x16Var.a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.b) {
            if (i2 < 0) {
                wc5.a("width must be >= 0");
            }
            jH = zx1.h(i2, i2, 0, Integer.MAX_VALUE);
        } else {
            if (i2 < 0) {
                wc5.a("height must be >= 0");
            }
            jH = zx1.h(0, Integer.MAX_VALUE, i2, i2);
        }
        long j2 = jH;
        return u(i, i4, i5, objF, objG, c(this.d, i, j2), j2);
    }
}
