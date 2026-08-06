package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class htb extends Adler32 {
    public volatile int a;

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final long getValue() {
        int value = (int) super.getValue();
        int i = ((65535 & value) - 1) % 65521;
        int i2 = ((value >>> 16) - this.a) % 65521;
        if (i2 < 0) {
            i2 += 65521;
        }
        if (i < 0) {
            i += 65521;
        }
        return ((long) ((i2 << 16) | i)) & 4294967295L;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void reset() {
        super.reset();
        this.a = 0;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AudioConstants.AUDIO_FILE_BUFFER_SIZE];
        while (true) {
            int iMin = Math.min(AudioConstants.AUDIO_FILE_BUFFER_SIZE, byteBuffer.remaining());
            if (iMin <= 0) {
                return;
            }
            byteBuffer.get(bArr, 0, iMin);
            update(bArr, 0, iMin);
        }
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
        this.a = (int) ((((long) this.a) + ((long) i2)) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(byte[] bArr) {
        super.update(bArr);
        this.a = (int) ((((long) this.a) + ((long) bArr.length)) % 65521);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public final void update(int i) {
        super.update(i);
        this.a = (int) ((((long) this.a) + 1) % 65521);
    }
}
