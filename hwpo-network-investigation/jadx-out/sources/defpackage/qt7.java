package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qt7 {
    public byte[] a;
    public int b;
    public int c;
    public int d;
    public int e = 0;

    public qt7(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.d = i;
        this.b = i2;
        a();
    }

    public final void a() {
        int i;
        int i2 = this.d;
        xl7.r(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.e == 0)));
    }

    public final boolean b(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.b) {
                break;
            }
            if (h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public final boolean c() {
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.b && !d()) {
            i3++;
        }
        boolean z = this.d == this.b;
        this.d = i;
        this.e = i2;
        return !z && b((i3 * 2) + 1);
    }

    public final boolean d() {
        boolean z = (this.a[this.d] & (128 >> this.e)) != 0;
        i();
        return z;
    }

    public final int e(int i) {
        int i2;
        this.e += i;
        int i3 = 0;
        while (true) {
            i2 = this.e;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.e = i5;
            byte[] bArr = this.a;
            int i6 = this.d;
            i3 |= (bArr[i6] & MessagePack.Code.EXT_TIMESTAMP) << i5;
            if (!h(i6 + 1)) {
                i4 = 1;
            }
            this.d = i6 + i4;
        }
        byte[] bArr2 = this.a;
        int i7 = this.d;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & MessagePack.Code.EXT_TIMESTAMP) >> (8 - i2)));
        if (i2 == 8) {
            this.e = 0;
            this.d = i7 + (h(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public final int f() {
        int i = 0;
        while (!d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? e(i) : 0);
    }

    public final int g() {
        int iF = f();
        return ((iF + 1) / 2) * (iF % 2 == 0 ? -1 : 1);
    }

    public final boolean h(int i) {
        int i2 = i - 2;
        if (this.c > i2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public final void i() {
        int i = this.e + 1;
        this.e = i;
        if (i == 8) {
            this.e = 0;
            int i2 = this.d;
            this.d = i2 + (h(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public final void j(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.d = i4;
        int i5 = (i - (i3 * 8)) + this.e;
        this.e = i5;
        if (i5 > 7) {
            this.d = i4 + 1;
            this.e = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.d) {
                a();
                return;
            } else if (h(i2)) {
                this.d++;
                i2 += 2;
            }
        }
    }
}
