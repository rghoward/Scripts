package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 extends uj0 {
    public int[] i;
    public int[] j;

    @Override // defpackage.uj0
    public final s80.a a(s80.a aVar) throws s80.c {
        int i = aVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return s80.a.e;
        }
        int i2 = aVar.b;
        if (!n6b.J(i)) {
            throw new s80.c(aVar);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new s80.c("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new s80.a(aVar.a, iArr.length, i) : s80.a.e;
    }

    @Override // defpackage.uj0
    public final void b() {
        this.j = this.i;
    }

    @Override // defpackage.uj0
    public final void e() {
        this.j = null;
        this.i = null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    @Override // defpackage.s80
    public final void k(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferF = f(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iS = (n6b.s(this.b.c) * i5) + iPosition;
                int i6 = this.b.c;
                if (i6 == 2) {
                    byteBufferF.putShort(byteBuffer.getShort(iS));
                } else if (i6 == 3) {
                    byteBufferF.put(byteBuffer.get(iS));
                } else if (i6 == 4) {
                    byteBufferF.putFloat(byteBuffer.getFloat(iS));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iS;
                    } else {
                        i = iS + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iS + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iS += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iS) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xl7.i(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    xl7.g(byteBufferF.remaining() >= 3);
                    if (byteBufferF.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferF.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferF.put(b3).put(b4).put((byte) i4);
                } else if (i6 == 22) {
                    byteBufferF.putInt(byteBuffer.getInt(iS));
                } else if (i6 == 268435456) {
                    byteBufferF.putShort(byteBuffer.getShort(iS));
                } else if (i6 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iS;
                    } else {
                        i = iS + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iS + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iS += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iS) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    xl7.i(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    xl7.g(byteBufferF.remaining() >= 3);
                    if (byteBufferF.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferF.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferF.put(b7).put(b8).put((byte) i4);
                } else if (i6 == 1610612736) {
                    byteBufferF.putInt(byteBuffer.getInt(iS));
                } else {
                    if (i6 != 1879048192) {
                        j08.a(this.b.c, "Unexpected encoding: ");
                        return;
                    }
                    byteBufferF.putDouble(byteBuffer.getDouble(iS));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferF.flip();
    }
}
