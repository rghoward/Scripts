package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tf8 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final apa a = new apa(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final pt7 b = new pt7();

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }

    public static long c(pt7 pt7Var) {
        int i = pt7Var.b;
        if (pt7Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        pt7Var.k(bArr, 0, 9);
        pt7Var.M(i);
        byte b = bArr[0];
        if ((b & MessagePack.Code.BIN8) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(ks3 ks3Var) {
        byte[] bArr = n6b.b;
        pt7 pt7Var = this.b;
        pt7Var.getClass();
        pt7Var.K(bArr, bArr.length);
        this.c = true;
        ks3Var.l();
    }
}
