package defpackage;

import java.util.ArrayDeque;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vq2 {
    public final byte[] a = new byte[8];
    public final ArrayDeque<a> b = new ArrayDeque<>();
    public final mcb c = new mcb();
    public al6.a d;
    public int e;
    public int f;
    public long g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public final long a(ks3 ks3Var, int i) {
        byte[] bArr = this.a;
        ks3Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & MessagePack.Code.EXT_TIMESTAMP));
        }
        return j;
    }
}
