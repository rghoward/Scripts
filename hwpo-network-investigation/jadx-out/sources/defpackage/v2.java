package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v2 {
    public int a;
    public int b;
    public final Object c;

    public v2() {
        this.c = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
        this.a = 16;
        this.b = 16;
    }

    public void a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.b) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public abstract void b(ByteBuffer byteBuffer);

    public v2 c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = this.a - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= this.b) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    public v2(gyb gybVar) {
        this.a = 0;
        this.b = -1;
        qzb.a(gybVar, "context");
        this.c = gybVar;
    }
}
