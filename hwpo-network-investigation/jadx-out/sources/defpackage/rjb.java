package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rjb {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public rjb(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final boolean a() {
        boolean z = (((this.a[this.c] & MessagePack.Code.EXT_TIMESTAMP) >> this.d) & 1) == 1;
        c(1);
        return z;
    }

    public final int b(int i) {
        int i2 = this.c;
        int iMin = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        byte[] bArr = this.a;
        int i4 = ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) >> this.d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & MessagePack.Code.EXT_TIMESTAMP) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        c(i);
        return i5;
    }

    public final void c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        int i6 = this.c;
        if (i6 < 0 || (i6 >= (i2 = this.b) && (i6 != i2 || this.d != 0))) {
            z = false;
        }
        xl7.r(z);
    }
}
