package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class nn2 extends vx0 {
    public final int A;
    public id4 u;
    public final cc2 v = new cc2();
    public ByteBuffer w;
    public boolean x;
    public long y;
    public ByteBuffer z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends IllegalStateException {
    }

    static {
        cp6.a("media3.decoder");
    }

    public nn2(int i) {
        this.A = i;
    }

    public void j() {
        this.t = 0;
        ByteBuffer byteBuffer = this.w;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.z;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.x = false;
    }

    public final ByteBuffer k(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.w;
        throw new a(a30.b("Buffer too small (", " < ", ")", byteBuffer == null ? 0 : byteBuffer.capacity(), i));
    }

    public final void l(int i) {
        ByteBuffer byteBuffer = this.w;
        if (byteBuffer == null) {
            this.w = k(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.w = byteBuffer;
            return;
        }
        ByteBuffer byteBufferK = k(i2);
        byteBufferK.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferK.put(byteBuffer);
        }
        this.w = byteBufferK;
    }

    public final void m() {
        ByteBuffer byteBuffer = this.w;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.z;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
