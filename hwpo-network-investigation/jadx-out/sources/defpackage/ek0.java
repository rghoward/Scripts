package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ek0 {
    public static final c a;
    public static final b b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends d {
        public final char[] f;

        public b(a aVar) {
            super(aVar, (Character) null);
            this.f = new char[512];
            char[] cArr = aVar.b;
            xl7.g(cArr.length == 16);
            for (int i = 0; i < 256; i++) {
                char[] cArr2 = this.f;
                cArr2[i] = cArr[i >>> 4];
                cArr2[i | 256] = cArr[i & 15];
            }
        }

        @Override // ek0.d, defpackage.ek0
        public final void b(StringBuilder sb, byte[] bArr, int i) {
            xl7.p(0, i, bArr.length);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = bArr[i2] & MessagePack.Code.EXT_TIMESTAMP;
                char[] cArr = this.f;
                sb.append(cArr[i3]);
                sb.append(cArr[i3 | 256]);
            }
        }

        @Override // ek0.d
        public final ek0 d(a aVar, Character ch) {
            return new b(aVar);
        }
    }

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        a = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        b = new b(new a("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public final String a(byte[] bArr) {
        int length = bArr.length;
        xl7.p(0, length, bArr.length);
        a aVar = ((d) this).c;
        int i = aVar.e;
        int i2 = aVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(xf5.b(length, i2) * i);
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            sx0.a(e);
            return null;
        }
    }

    public abstract void b(StringBuilder sb, byte[] bArr, int i);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends d {
        public c(String str, String str2) {
            this(new a(str, str2.toCharArray()), (Character) '=');
        }

        @Override // ek0.d, defpackage.ek0
        public final void b(StringBuilder sb, byte[] bArr, int i) {
            int i2 = 0;
            xl7.p(0, i, bArr.length);
            for (int i3 = i; i3 >= 3; i3 -= 3) {
                int i4 = i2 + 2;
                int i5 = ((bArr[i2 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | ((bArr[i2] & MessagePack.Code.EXT_TIMESTAMP) << 16);
                i2 += 3;
                int i6 = i5 | (bArr[i4] & MessagePack.Code.EXT_TIMESTAMP);
                a aVar = this.c;
                char[] cArr = aVar.b;
                char[] cArr2 = aVar.b;
                sb.append(cArr[i6 >>> 18]);
                sb.append(cArr2[(i6 >>> 12) & 63]);
                sb.append(cArr2[(i6 >>> 6) & 63]);
                sb.append(cArr2[i6 & 63]);
            }
            if (i2 < i) {
                c(sb, bArr, i2, i - i2);
            }
        }

        @Override // ek0.d
        public final ek0 d(a aVar, Character ch) {
            return new c(aVar, ch);
        }

        public c(a aVar, Character ch) {
            super(aVar, ch);
            xl7.g(aVar.b.length == 64);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends ek0 {
        public final a c;
        public final Character d;
        public volatile ek0 e;

        /* JADX WARN: Code duplicated, block: B:9:0x0017  */
        public d(a aVar, Character ch) {
            boolean z;
            this.c = aVar;
            if (ch != null) {
                char cCharValue = ch.charValue();
                byte[] bArr = aVar.g;
                if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            xl7.i(z, "Padding character %s was already in alphabet", ch);
            this.d = ch;
        }

        @Override // defpackage.ek0
        public void b(StringBuilder sb, byte[] bArr, int i) {
            int i2 = 0;
            xl7.p(0, i, bArr.length);
            while (i2 < i) {
                a aVar = this.c;
                c(sb, bArr, i2, Math.min(aVar.f, i - i2));
                i2 += aVar.f;
            }
        }

        public final void c(StringBuilder sb, byte[] bArr, int i, int i2) {
            xl7.p(i, i + i2, bArr.length);
            a aVar = this.c;
            int i3 = aVar.f;
            int i4 = aVar.d;
            int i5 = 0;
            xl7.g(i2 <= i3);
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | ((long) (bArr[i + i6] & MessagePack.Code.EXT_TIMESTAMP))) << 8;
            }
            int i7 = ((i2 + 1) * 8) - i4;
            while (i5 < i2 * 8) {
                sb.append(aVar.b[((int) (j >>> (i7 - i5))) & aVar.c]);
                i5 += i4;
            }
            Character ch = this.d;
            if (ch != null) {
                while (i5 < aVar.f * 8) {
                    sb.append(ch.charValue());
                    i5 += i4;
                }
            }
        }

        public ek0 d(a aVar, Character ch) {
            return new d(aVar, ch);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.c.equals(dVar.c) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.d) ^ this.c.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            a aVar = this.c;
            sb.append(aVar);
            if (8 % aVar.d != 0) {
                Character ch = this.d;
                if (ch == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(ch);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public d(String str, String str2) {
            this(new a(str, str2.toCharArray()), (Character) '=');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final char[] b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;
        public final boolean h;

        public a(String str, char[] cArr, byte[] bArr, boolean z) {
            this.a = str;
            cArr.getClass();
            this.b = cArr;
            try {
                int length = cArr.length;
                RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                int iC = xf5.c(length);
                this.d = iC;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iC);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.e = i;
                this.f = iC >> iNumberOfTrailingZeros;
                this.c = cArr.length - 1;
                this.g = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f; i2++) {
                    int i3 = this.d;
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    zArr[xf5.b(i2 * 8, i3)] = true;
                }
                this.h = z;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.h == aVar.h && Arrays.equals(this.b, aVar.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
        }

        public final String toString() {
            return this.a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                if (c < 128) {
                    if (bArr[c] == -1) {
                        bArr[c] = (byte) i;
                    } else {
                        z90.a(p2a.a("Duplicate character: %s", Character.valueOf(c)));
                        throw null;
                    }
                } else {
                    z90.a(p2a.a("Non-ASCII character: %s", Character.valueOf(c)));
                    throw null;
                }
            }
            this(str, cArr, bArr, false);
        }
    }
}
