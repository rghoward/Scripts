package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d7b extends c7b {
    public final int b(int i, short s, ByteBuffer byteBuffer) throws IOException {
        int i2;
        if (i < 0) {
            aa0.c(pp2.a(i, "DecodeAddress was passed a negative value for here_address: "));
            return 0;
        }
        if (byteBuffer.remaining() == 0) {
            return -2;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        int[] iArr = this.b;
        short length = (short) (iArr.length + 2);
        int[] iArr2 = this.c;
        if (s < length || s > a()) {
            try {
                int iB = kcb.b(byteBufferDuplicate);
                if (s == 0) {
                    i2 = iB;
                } else if (s == 1) {
                    i2 = i - iB;
                } else {
                    if (s < 2 || s >= ((short) (iArr.length + 2))) {
                        StringBuilder sbB = t43.b(s, "Invalid mode value (", ") passed to DecodeAddress; maximum mode value = ");
                        sbB.append((int) a());
                        throw new IllegalArgumentException(sbB.toString());
                    }
                    i2 = iArr[s - 2] + iB;
                }
            } catch (kcb.a unused) {
                return -2;
            } catch (kcb.b unused2) {
                o03.a("Found invalid variable-length integer as encoded address value");
                return 0;
            }
        } else {
            i2 = iArr2[((s - ((short) (iArr.length + 2))) * 256) + ((short) (byteBufferDuplicate.get() & MessagePack.Code.EXT_TIMESTAMP))];
        }
        if (i2 < 0) {
            o03.a(pk.d(i2, "Decoded address ", " is invalid"));
            return 0;
        }
        if (i2 >= i) {
            throw new IOException(String.format("Decoded address (%d) is beyond location in target file (%d)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
        if (iArr.length > 0) {
            int i3 = this.a;
            iArr[i3] = i2;
            this.a = (i3 + 1) % iArr.length;
        }
        if (iArr2.length > 0) {
            iArr2[i2 % iArr2.length] = i2;
        }
        byteBuffer.position(byteBufferDuplicate.position());
        return i2;
    }
}
