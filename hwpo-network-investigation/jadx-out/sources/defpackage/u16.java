package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u16 {
    public final d26 a;
    public int[] b;
    public final bt7 c;
    public int[] d;
    public final bt7 e;
    public boolean f;
    public Object g;
    public final xw5 h;

    public u16(int[] iArr, int[] iArr2, d26 d26Var) {
        this.a = d26Var;
        this.b = iArr;
        this.c = new bt7(a(iArr));
        this.d = iArr2;
        this.e = new bt7(b(iArr, iArr2));
        Integer numC = u30.C(iArr);
        this.h = new xw5(numC != null ? numC.intValue() : 0, 90, 200);
    }

    public static int a(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int iA = a(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iA) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }
}
