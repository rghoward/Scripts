package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kcb {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends Exception {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends Exception {
    }

    static {
        ae6.e(kcb.class);
    }

    public static int a(int i) {
        int i2 = 0;
        for (int i3 = 28; i3 >= 0; i3 -= 7) {
            if ((i >> i3) != 0 || i3 == 0) {
                i2++;
            }
        }
        return i2;
    }

    public static int b(ByteBuffer byteBuffer) throws a, b {
        int iPosition = byteBuffer.position();
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - iPosition >= 5) {
                throw new b("Data too long for a 32-bit int");
            }
            byte b2 = byteBuffer.get();
            int i2 = i + (b2 & 127);
            if ((b2 & 128) == 0) {
                return i2;
            }
            if (i2 > 16777215) {
                throw new b("Value too large to fit in an int");
            }
            i = i2 << 7;
        }
        throw new a();
    }

    public static long c(ByteBuffer byteBuffer) throws a, b {
        int iPosition = byteBuffer.position();
        long j = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - iPosition >= 10) {
                throw new b("Data too long for a 64-bit int");
            }
            byte b2 = byteBuffer.get();
            long j2 = j + ((long) (b2 & 127));
            if ((b2 & 128) == 0) {
                if (j2 < 0) {
                    new Exception().printStackTrace();
                }
                return j2;
            }
            if (j2 > 72057594037927935L) {
                throw new b("Value too large to fit in an int");
            }
            j = j2 << 7;
        }
        throw new a();
    }
}
