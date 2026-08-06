package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class g01 implements Serializable, Comparable<g01> {
    public static final g01 w = new g01(new byte[0]);
    public final byte[] t;
    public transient int u;
    public transient String v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
        public static g01 a(String str) {
            int i;
            char cCharAt;
            str.getClass();
            byte[] bArr = defpackage.a.a;
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length--;
            }
            int i2 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 >= length) {
                    int i7 = i4 % 4;
                    if (i7 != 1) {
                        if (i7 == 2) {
                            bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                            i6++;
                        } else if (i7 == 3) {
                            int i8 = i5 << 6;
                            int i9 = i6 + 1;
                            bArrCopyOf[i6] = (byte) (i8 >> 16);
                            i6 += 2;
                            bArrCopyOf[i9] = (byte) (i8 >> 8);
                        }
                        if (i6 != i2) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new g01(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i3);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                    i = 62;
                } else {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                    } else {
                        i = 63;
                    }
                    i3++;
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    bArrCopyOf[i6] = (byte) (i5 >> 16);
                    int i10 = i6 + 2;
                    bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                    i6 += 3;
                    bArrCopyOf[i10] = (byte) i5;
                }
                i3++;
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new g01(bArrCopyOf);
            }
            return null;
        }

        public static g01 b(String str) {
            if (str.length() % 2 != 0) {
                ca0.a("Unexpected hex string: ".concat(str));
                return null;
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (gz3.b(str.charAt(i2 + 1)) + (gz3.b(str.charAt(i2)) << 4));
            }
            return new g01(bArr);
        }

        public static g01 c(String str) {
            str.getClass();
            byte[] bytes = str.getBytes(ua1.b);
            bytes.getClass();
            g01 g01Var = new g01(bytes);
            g01Var.v = str;
            return g01Var;
        }

        public static g01 d(byte[] bArr) {
            g01 g01Var = g01.w;
            tx0.b bVar = t.a;
            int length = bArr.length;
            t.b(bArr.length, 0L, length);
            return new g01(gz3.j(bArr, 0, length));
        }
    }

    public g01(byte[] bArr) {
        bArr.getClass();
        this.t = bArr;
    }

    public static int j(g01 g01Var, g01 g01Var2) {
        g01Var.getClass();
        g01Var2.getClass();
        return g01Var.i(g01Var2.k(), 0);
    }

    public static int n(g01 g01Var, g01 g01Var2) {
        int i = t.b;
        g01Var.getClass();
        g01Var2.getClass();
        return g01Var.m(g01Var2.k(), i);
    }

    public static g01 t(g01 g01Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = t.b;
        }
        return g01Var.s(i, i2);
    }

    public String a() {
        byte[] bArr = defpackage.a.a;
        byte[] bArr2 = this.t;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & MessagePack.Code.EXT_TIMESTAMP) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & MessagePack.Code.EXT_TIMESTAMP) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & MessagePack.Code.EXT_TIMESTAMP) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & MessagePack.Code.EXT_TIMESTAMP) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & MessagePack.Code.EXT_TIMESTAMP) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & MessagePack.Code.EXT_TIMESTAMP) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, ua1.b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(g01 g01Var) {
        g01Var.getClass();
        int iG = g();
        int iG2 = g01Var.g();
        int iMin = Math.min(iG, iG2);
        for (int i = 0; i < iMin; i++) {
            int iL = l(i) & MessagePack.Code.EXT_TIMESTAMP;
            int iL2 = g01Var.l(i) & MessagePack.Code.EXT_TIMESTAMP;
            if (iL != iL2) {
                return iL < iL2 ? -1 : 1;
            }
        }
        if (iG == iG2) {
            return 0;
        }
        return iG < iG2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g01) {
            g01 g01Var = (g01) obj;
            int iG = g01Var.g();
            byte[] bArr = this.t;
            if (iG == bArr.length && g01Var.p(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public g01 f(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.t, 0, g());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new g01(bArrDigest);
    }

    public int g() {
        return this.t.length;
    }

    public String h() {
        byte[] bArr = this.t;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = d.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i = this.u;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.t);
        this.u = iHashCode;
        return iHashCode;
    }

    public int i(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.t;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!t.a(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] k() {
        return this.t;
    }

    public byte l(int i) {
        return this.t[i];
    }

    public int m(byte[] bArr, int i) {
        bArr.getClass();
        if (i == t.b) {
            i = g();
        }
        byte[] bArr2 = this.t;
        for (int iMin = Math.min(i, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (t.a(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean o(int i, g01 g01Var, int i2) {
        g01Var.getClass();
        return g01Var.p(0, this.t, i, i2);
    }

    public boolean p(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.t;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && t.a(i, i2, i3, bArr2, bArr);
    }

    public String r(Charset charset) {
        charset.getClass();
        return new String(this.t, charset);
    }

    public g01 s(int i, int i2) {
        if (i2 == t.b) {
            i2 = g();
        }
        if (i < 0) {
            z90.a("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.t;
        if (i2 > bArr.length) {
            ca0.a(e44.a(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new g01(gz3.j(bArr, i, i2));
        }
        z90.a("endIndex < beginIndex");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x01bf A[EDGE_INSN: B:180:0x01bf->B:181:0x01c0 BREAK  A[LOOP:0: B:7:0x000e->B:248:0x000e]] */
    public String toString() {
        byte b;
        int i;
        g01 g01Var = this;
        byte[] bArr = g01Var.t;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & MessagePack.Code.NIL) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & MessagePack.Code.NIL) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & MessagePack.Code.NIL) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    g2b g2bVar = g2b.a;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & MessagePack.Code.NIL) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & MessagePack.Code.NIL) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                g2b g2bVar2 = g2b.a;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & MessagePack.Code.NIL) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            g2b g2bVar3 = g2b.a;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        } else {
                            g2b g2bVar4 = g2b.a;
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strW = g01Var.w();
            String strL = w2a.l(w2a.l(w2a.l(strW.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strW.length()) {
                return eca.a(']', "[text=", strL);
            }
            return "[size=" + bArr.length + " text=" + strL + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + g01Var.h() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        int iG = 64 == t.b ? g01Var.g() : 64;
        if (iG > bArr.length) {
            ca0.a(e44.a(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (iG < 0) {
            z90.a("endIndex < beginIndex");
            return null;
        }
        if (iG != bArr.length) {
            g01Var = new g01(gz3.j(bArr, 0, iG));
        }
        sb.append(g01Var.h());
        sb.append("…]");
        return sb.toString();
    }

    public g01 u() {
        int i = 0;
        while (true) {
            byte[] bArr = this.t;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new g01(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] v() {
        byte[] bArr = this.t;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String w() {
        String str = this.v;
        if (str != null) {
            return str;
        }
        byte[] bArrK = k();
        bArrK.getClass();
        String str2 = new String(bArrK, ua1.b);
        this.v = str2;
        return str2;
    }

    public void x(tx0 tx0Var, int i) {
        tx0Var.m884write(this.t, 0, i);
    }
}
