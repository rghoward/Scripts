package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final int[] a = {96000, 88200, 64000, 48000, AudioConstants.AUDIO_SAMPLE_RATE, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static int a(ot7 ot7Var) throws ut7 {
        int iG = ot7Var.g(4);
        if (iG == 15) {
            if (ot7Var.b() >= 24) {
                return ot7Var.g(24);
            }
            throw ut7.a(null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return a[iG];
        }
        throw ut7.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static a b(ot7 ot7Var, boolean z) {
        int iG = ot7Var.g(5);
        if (iG == 31) {
            iG = ot7Var.g(6) + 32;
        }
        int iA = a(ot7Var);
        int iG2 = ot7Var.g(4);
        String strA = pp2.a(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iA = a(ot7Var);
            int iG3 = ot7Var.g(5);
            if (iG3 == 31) {
                iG3 = ot7Var.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = ot7Var.g(4);
            }
        }
        if (z) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ut7.c("Unsupported audio object type: " + iG);
                }
            }
            if (ot7Var.f()) {
                md6.g("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (ot7Var.f()) {
                ot7Var.o(14);
            }
            boolean zF = ot7Var.f();
            if (iG2 == 0) {
                e44.b();
                return null;
            }
            if (iG == 6 || iG == 20) {
                ot7Var.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    ot7Var.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    ot7Var.o(3);
                }
                ot7Var.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case InboxPagingSource.PAGE_SIZE /* 20 */:
                case 21:
                case 22:
                case 23:
                    int iG4 = ot7Var.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw ut7.c("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i = b[iG2];
        if (i != -1) {
            return new a(iA, i, strA);
        }
        throw ut7.a(null, null);
    }
}
