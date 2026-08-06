package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pv9 {
    public final pt7 a = new pt7(8);
    public int b;

    public final long a(zq2 zq2Var) {
        pt7 pt7Var = this.a;
        int i = 0;
        zq2Var.f(pt7Var.a, 0, 1, false);
        int i2 = pt7Var.a[0] & MessagePack.Code.EXT_TIMESTAMP;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        zq2Var.f(pt7Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (pt7Var.a[i] & MessagePack.Code.EXT_TIMESTAMP) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
