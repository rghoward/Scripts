package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uz8 {
    public final ki a;
    public final int b;
    public final pt7 c;
    public a d;
    public a e;
    public a f;
    public long g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ki.a {
        public long a;
        public long b;
        public ji c;
        public a d;

        public a(int i, long j) {
            xl7.r(this.c == null);
            this.a = j;
            this.b = j + ((long) i);
        }
    }

    public uz8(ki kiVar) {
        this.a = kiVar;
        int iE = kiVar.e();
        this.b = iE;
        this.c = new pt7(32);
        a aVar = new a(iE, 0L);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public static a c(a aVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVar.b - j));
            ji jiVar = aVar.c;
            byteBuffer.put(jiVar.a, ((int) (j - aVar.a)) + jiVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a d(a aVar, long j, byte[] bArr, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVar.b - j));
            ji jiVar = aVar.c;
            System.arraycopy(jiVar.a, ((int) (j - aVar.a)) + jiVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, nn2 nn2Var, vz8.a aVar2, pt7 pt7Var) {
        if (nn2Var.i(1073741824)) {
            long j = aVar2.b;
            int iG = 1;
            pt7Var.J(1);
            a aVarD = d(aVar, j, pt7Var.a, 1);
            long j2 = j + 1;
            byte b = pt7Var.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            cc2 cc2Var = nn2Var.v;
            byte[] bArr = cc2Var.a;
            if (bArr == null) {
                cc2Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = d(aVarD, j2, cc2Var.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                pt7Var.J(2);
                aVar = d(aVar, j3, pt7Var.a, 2);
                j3 += 2;
                iG = pt7Var.G();
            }
            int[] iArr = cc2Var.d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = cc2Var.e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z) {
                int i2 = iG * 6;
                pt7Var.J(i2);
                aVar = d(aVar, j3, pt7Var.a, i2);
                j3 += (long) i2;
                pt7Var.M(0);
                for (int i3 = 0; i3 < iG; i3++) {
                    iArr[i3] = pt7Var.G();
                    iArr2[i3] = pt7Var.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.a - ((int) (j3 - aVar2.b));
            }
            hsa.a aVar3 = aVar2.c;
            String str = n6b.a;
            byte[] bArr2 = aVar3.b;
            byte[] bArr3 = cc2Var.a;
            int i4 = aVar3.a;
            int i5 = aVar3.c;
            int i6 = aVar3.d;
            cc2Var.f = iG;
            cc2Var.d = iArr;
            cc2Var.e = iArr2;
            cc2Var.b = bArr2;
            cc2Var.a = bArr3;
            cc2Var.c = i4;
            cc2Var.g = i5;
            cc2Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = cc2Var.i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            cc2.a aVar4 = cc2Var.j;
            aVar4.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = aVar4.b;
            pattern.set(i5, i6);
            aVar4.a.setPattern(pattern);
            long j4 = aVar2.b;
            int i7 = (int) (j3 - j4);
            aVar2.b = j4 + ((long) i7);
            aVar2.a -= i7;
        }
        if (!nn2Var.i(268435456)) {
            nn2Var.l(aVar2.a);
            return c(aVar, aVar2.b, nn2Var.w, aVar2.a);
        }
        pt7Var.J(4);
        a aVarD2 = d(aVar, aVar2.b, pt7Var.a, 4);
        int iD = pt7Var.D();
        aVar2.b += 4;
        aVar2.a -= 4;
        nn2Var.l(iD);
        a aVarC = c(aVarD2, aVar2.b, nn2Var.w, iD);
        aVar2.b += (long) iD;
        int i8 = aVar2.a - iD;
        aVar2.a = i8;
        ByteBuffer byteBuffer = nn2Var.z;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            nn2Var.z = ByteBuffer.allocate(i8);
        } else {
            nn2Var.z.clear();
        }
        return c(aVarC, aVar2.b, nn2Var.z, aVar2.a);
    }

    public final void a(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            this.a.b(aVar.c);
            a aVar2 = this.d;
            aVar2.c = null;
            a aVar3 = aVar2.d;
            aVar2.d = null;
            this.d = aVar3;
        }
        if (this.e.a < aVar.a) {
            this.e = aVar;
        }
    }

    public final int b(int i) {
        a aVar = this.f;
        if (aVar.c == null) {
            ji jiVarC = this.a.c();
            a aVar2 = new a(this.b, this.f.b);
            aVar.c = jiVarC;
            aVar.d = aVar2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
