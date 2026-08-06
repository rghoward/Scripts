package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w17 extends ln4 implements Serializable {
    public static final /* synthetic */ int x = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends v2 {
        public long d;
        public long e;
        public int f;

        @Override // defpackage.v2
        public final void b(ByteBuffer byteBuffer) {
            long j = byteBuffer.getLong();
            long j2 = byteBuffer.getLong();
            long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.d;
            this.d = jRotateLeft;
            long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
            long j3 = this.e;
            this.d = ((jRotateLeft2 + j3) * 5) + 1390208809;
            long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
            this.e = jRotateLeft3;
            this.e = ((Long.rotateLeft(jRotateLeft3, 31) + this.d) * 5) + 944331445;
            this.f += 16;
        }
    }

    static {
        int i = zt4.a;
    }

    public w17() {
        super(false);
    }

    public final boolean equals(Object obj) {
        return obj instanceof w17;
    }

    public final int hashCode() {
        return w17.class.hashCode();
    }

    @Override // defpackage.ln4
    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
