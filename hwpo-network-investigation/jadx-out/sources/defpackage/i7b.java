package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i7b {
    public static final yd6 f = ae6.e(i7b.class);
    public IOException b;
    public final ByteBuffer d;
    public ByteBuffer e;
    public short a = 0;
    public Integer c = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final byte a;
        public final int b;
        public final int c;

        public a(byte b, int i, int i2) {
            this.a = b;
            this.b = i;
            this.c = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public i7b(ByteBuffer byteBuffer) {
        this.d = byteBuffer.duplicate();
    }

    public final Byte a() {
        if (this.a != 0) {
            return null;
        }
        IOException iOException = this.b;
        if (iOException != null) {
            throw iOException;
        }
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer.hasRemaining()) {
            return Byte.valueOf(byteBuffer.get());
        }
        this.a = (short) -2;
        return null;
    }

    public final Integer b(String str) {
        if (this.a != 0) {
            return null;
        }
        IOException iOException = this.b;
        if (iOException != null) {
            throw iOException;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.mark();
        try {
            return Integer.valueOf(kcb.b(byteBuffer));
        } catch (kcb.a unused) {
            byteBuffer.reset();
            this.a = (short) -2;
            return null;
        } catch (kcb.b unused2) {
            byteBuffer.reset();
            IOException iOException2 = new IOException(sk0.c("Expected ", str, "; found invalid variable-length integer"));
            this.b = iOException2;
            throw iOException2;
        }
    }

    public final a c(long j, byte b2, String str, String str2) {
        Integer numB = b("source segment length");
        if (numB == null) {
            return null;
        }
        if (numB.intValue() > j) {
            IOException iOException = new IOException(String.format("Source segment length (%d) is larger than %s (%d)", numB, str2, Long.valueOf(j)));
            this.b = iOException;
            throw iOException;
        }
        Integer numB2 = b("source segment position");
        if (numB2 == null) {
            return null;
        }
        if (numB2.intValue() >= j && numB.intValue() > 0) {
            IOException iOException2 = new IOException(String.format("Source segment position (%d) is past %s (%d)", numB2, str, Long.valueOf(j)));
            this.b = iOException2;
            throw iOException2;
        }
        if (numB.intValue() + numB2.intValue() <= j) {
            return new a(b2, numB.intValue(), numB2.intValue());
        }
        IOException iOException3 = new IOException("Source segment end position ({}) is past {} ({})");
        this.b = iOException3;
        throw iOException3;
    }
}
