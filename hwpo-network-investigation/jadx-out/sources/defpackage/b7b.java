package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class b7b implements KSerializer<y6b> {
    public static final b7b a = new b7b();
    public static final m98 b = new m98("kotlin.uuid.Uuid", j98.i.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        String strS = decoder.S();
        strS.getClass();
        int length = strS.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strS.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = gw4.b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                iw5.d(i, strS, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strS.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = gw4.b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                iw5.d(i2, strS, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new y6b(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strS.length() <= 64 ? strS : strS.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strS.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strS.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = gw4.b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                iw5.d(i, strS, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(8) != '-') {
                iw5.d(8, strS, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strS.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = gw4.b[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                iw5.d(i3, strS, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(13) != '-') {
                iw5.d(13, strS, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strS.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = gw4.b[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                iw5.d(i4, strS, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(18) != '-') {
                iw5.d(18, strS, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strS.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = gw4.b[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                iw5.d(i5, strS, "a hexadecimal digit");
                throw null;
            }
            if (strS.charAt(23) != '-') {
                iw5.d(23, strS, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strS.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = gw4.b[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                iw5.d(i6, strS, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new y6b(j22, j23);
            }
        }
        return y6b.v;
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        y6b y6bVar = (y6b) obj;
        y6bVar.getClass();
        encoder.D(y6bVar.toString());
    }
}
