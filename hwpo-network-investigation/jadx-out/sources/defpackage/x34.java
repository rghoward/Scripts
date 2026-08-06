package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x34 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final su6 l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public x34(byte[] bArr, int i) {
        ot7 ot7Var = new ot7(bArr, bArr.length);
        ot7Var.m(i * 8);
        this.a = ot7Var.g(16);
        this.b = ot7Var.g(16);
        this.c = ot7Var.g(24);
        this.d = ot7Var.g(24);
        int iG = ot7Var.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = ot7Var.g(3) + 1;
        int iG2 = ot7Var.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = ot7Var.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case AudioConstants.AUDIO_SAMPLE_RATE /* 44100 */:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final id4 c(byte[] bArr, su6 su6Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        su6 su6Var2 = this.l;
        if (su6Var2 != null) {
            su6Var = su6Var2.b(su6Var);
        }
        id4.a aVar = new id4.a();
        aVar.n = fv6.n("audio/flac");
        aVar.o = i;
        aVar.F = this.g;
        aVar.G = this.e;
        String str = n6b.a;
        aVar.H = n6b.z(this.h, ByteOrder.LITTLE_ENDIAN);
        aVar.q = Collections.singletonList(bArr);
        aVar.k = su6Var;
        return new id4(aVar);
    }

    public x34(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, su6 su6Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = su6Var;
    }
}
