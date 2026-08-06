package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ikb {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, MessagePack.Code.INT64, 17, -122, 68, MessagePack.Code.EXT16, MessagePack.Code.NEVER_USED, MessagePack.Code.FLOAT32, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(ks3 ks3Var, pt7 pt7Var) {
            ks3Var.n(pt7Var.a, 0, 8);
            pt7Var.M(0);
            return new a(pt7Var.m(), pt7Var.q());
        }
    }

    public static boolean a(ks3 ks3Var) {
        pt7 pt7Var = new pt7(8);
        int i = a.a(ks3Var, pt7Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ks3Var.n(pt7Var.a, 0, 4);
        pt7Var.M(0);
        int iM = pt7Var.m();
        if (iM == 1463899717) {
            return true;
        }
        md6.d("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static a b(int i, ks3 ks3Var, pt7 pt7Var) throws ut7 {
        a aVarA = a.a(ks3Var, pt7Var);
        while (true) {
            int i2 = aVarA.a;
            if (i2 == i) {
                return aVarA;
            }
            d80.a(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = aVarA.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ut7.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            ks3Var.m((int) j2);
            aVarA = a.a(ks3Var, pt7Var);
        }
    }
}
