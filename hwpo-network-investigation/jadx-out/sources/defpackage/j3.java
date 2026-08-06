package defpackage;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, AudioConstants.AUDIO_FILE_BUFFER_SIZE};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public int e;
        public int f;
        public int g;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static void a(int i, pt7 pt7Var) {
        pt7Var.J(7);
        byte[] bArr = pt7Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static b b(ot7 ot7Var) {
        int i;
        int i2;
        int iG = ot7Var.g(16);
        int iG2 = ot7Var.g(16);
        if (iG2 == 65535) {
            iG2 = ot7Var.g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iG2 + i;
        if (iG == 44097) {
            i3 += 2;
        }
        if (ot7Var.g(2) == 3) {
            do {
                ot7Var.g(2);
            } while (ot7Var.f());
        }
        int iG3 = ot7Var.g(10);
        if (ot7Var.f() && ot7Var.g(3) > 0) {
            ot7Var.o(2);
        }
        int i4 = ot7Var.f() ? 48000 : 44100;
        int iG4 = ot7Var.g(4);
        int[] iArr = a;
        if (i4 == 44100 && iG4 == 13) {
            i2 = iArr[iG4];
        } else if (i4 != 48000 || iG4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iG4];
            int i6 = iG3 % 5;
            if (i6 == 1) {
                if (iG4 != 3 || iG4 == 8) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    if (iG4 != 3) {
                    }
                    i2 = i5 + 1;
                } else if (i6 == 4 && (iG4 == 3 || iG4 == 8 || iG4 == 11)) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            } else if (iG4 == 8 || iG4 == 11) {
                i2 = i5 + 1;
            } else {
                i2 = i5;
            }
        }
        return new b(i4, i3, i2);
    }

    public static void c(ot7 ot7Var, a aVar) throws ut7 {
        int iG = ot7Var.g(5);
        ot7Var.o(2);
        if (ot7Var.f()) {
            ot7Var.o(5);
        }
        if (iG >= 7 && iG <= 10) {
            ot7Var.n();
        }
        if (ot7Var.f()) {
            int iG2 = ot7Var.g(3);
            if (aVar.b == -1 && iG >= 0 && iG <= 15 && (iG2 == 0 || iG2 == 1)) {
                aVar.b = iG;
            }
            if (ot7Var.f()) {
                e(ot7Var);
            }
        }
    }

    public static void d(ot7 ot7Var, a aVar) throws ut7 {
        ot7Var.o(2);
        boolean zF = ot7Var.f();
        int iG = ot7Var.g(8);
        for (int i = 0; i < iG; i++) {
            ot7Var.o(2);
            if (ot7Var.f()) {
                ot7Var.o(5);
            }
            if (zF) {
                ot7Var.o(24);
            } else {
                if (ot7Var.f()) {
                    if (!ot7Var.f()) {
                        ot7Var.o(4);
                    }
                    aVar.c = ot7Var.g(6) + 1;
                }
                ot7Var.o(4);
            }
        }
        if (ot7Var.f()) {
            ot7Var.o(3);
            if (ot7Var.f()) {
                e(ot7Var);
            }
        }
    }

    public static void e(ot7 ot7Var) throws ut7 {
        int iG = ot7Var.g(6);
        if (iG < 2 || iG > 42) {
            throw ut7.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iG)));
        }
        ot7Var.o(iG * 8);
    }
}
