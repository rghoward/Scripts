package defpackage;

import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kpa extends uj0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void g(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.uj0
    public final s80.a a(s80.a aVar) throws s80.c {
        int i2 = aVar.c;
        if (n6b.I(i2) || i2 == 2) {
            return i2 != 4 ? new s80.a(aVar.a, aVar.b, 4) : s80.a.e;
        }
        throw new s80.c(aVar);
    }

    @Override // defpackage.s80
    public final void k(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferF;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 2) {
            byteBufferF = f(i2 * 2);
            while (iPosition < iLimit) {
                g(((byteBuffer.get(iPosition) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(iPosition + 1) & MessagePack.Code.EXT_TIMESTAMP) << 24), byteBufferF);
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            byteBufferF = f((i2 / 3) * 4);
            while (iPosition < iLimit) {
                g(((byteBuffer.get(iPosition + 2) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(iPosition + 1) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(iPosition) & MessagePack.Code.EXT_TIMESTAMP) << 24), byteBufferF);
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferF = f(i2);
            while (iPosition < iLimit) {
                g((byteBuffer.get(iPosition + 3) & MessagePack.Code.EXT_TIMESTAMP) | ((byteBuffer.get(iPosition + 2) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(iPosition + 1) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(iPosition) & MessagePack.Code.EXT_TIMESTAMP) << 24), byteBufferF);
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            byteBufferF = f(i2 / 2);
            while (iPosition < iLimit) {
                byteBufferF.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i3 == 21) {
            byteBufferF = f((i2 / 3) * 4);
            while (iPosition < iLimit) {
                g(((byteBuffer.get(iPosition) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(iPosition + 1) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(iPosition + 2) & MessagePack.Code.EXT_TIMESTAMP) << 24), byteBufferF);
                iPosition += 3;
            }
        } else {
            if (i3 != 22) {
                d43.c();
                return;
            }
            byteBufferF = f(i2);
            while (iPosition < iLimit) {
                g((byteBuffer.get(iPosition) & MessagePack.Code.EXT_TIMESTAMP) | ((byteBuffer.get(iPosition + 1) & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((byteBuffer.get(iPosition + 2) & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((byteBuffer.get(iPosition + 3) & MessagePack.Code.EXT_TIMESTAMP) << 24), byteBufferF);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
