package defpackage;

import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sn5 extends zw3 {
    public final RandomAccessFile w;

    public sn5(RandomAccessFile randomAccessFile) {
        this.w = randomAccessFile;
    }

    @Override // defpackage.zw3
    public final synchronized void h() {
        this.w.close();
    }

    @Override // defpackage.zw3
    public final synchronized int k(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.w.seek(j);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.w.read(bArr, i, i2 - i3);
            if (i4 == -1) {
                if (i3 != 0) {
                    break;
                }
                return -1;
            }
            i3 += i4;
        }
        return i3;
    }

    @Override // defpackage.zw3
    public final synchronized long m() {
        return this.w.length();
    }
}
