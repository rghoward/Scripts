package defpackage;

import com.intercom.twig.BuildConfig;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j0c {
    public static int a(byte[] bArr, int i, i0c i0cVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return b(b, bArr, i2, i0cVar);
        }
        i0cVar.a = b;
        return i2;
    }

    public static int b(int i, byte[] bArr, int i2, i0c i0cVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            i0cVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i0cVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            i0cVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            i0cVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                i0cVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int c(byte[] bArr, int i, i0c i0cVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            i0cVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        i0cVar.b = j2;
        return i3;
    }

    public static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & MessagePack.Code.EXT_TIMESTAMP;
        int i3 = bArr[i + 1] & MessagePack.Code.EXT_TIMESTAMP;
        int i4 = bArr[i + 2] & MessagePack.Code.EXT_TIMESTAMP;
        return ((bArr[i + 3] & MessagePack.Code.EXT_TIMESTAMP) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long e(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int f(byte[] bArr, int i, i0c i0cVar) throws k2c {
        int iA = a(bArr, i, i0cVar);
        int i2 = i0cVar.a;
        if (i2 < 0) {
            ao2.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            i0cVar.c = BuildConfig.FLAVOR;
            return iA;
        }
        i0cVar.c = o4c.d(bArr, iA, i2);
        return iA + i2;
    }

    public static int g(byte[] bArr, int i, i0c i0cVar) throws k2c {
        int iA = a(bArr, i, i0cVar);
        int i2 = i0cVar.a;
        if (i2 < 0) {
            ao2.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iA) {
            ao2.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            i0cVar.c = p0c.u;
            return iA;
        }
        i0cVar.c = p0c.n(bArr, iA, i2);
        return iA + i2;
    }

    public static int h(Object obj, t3c t3cVar, byte[] bArr, int i, int i2, i0c i0cVar) throws k2c {
        int iB = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iB = b(i3, bArr, iB, i0cVar);
            i3 = i0cVar.a;
        }
        int i4 = iB;
        if (i3 < 0 || i3 > i2 - i4) {
            ao2.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = i0cVar.e + 1;
        i0cVar.e = i5;
        if (i5 >= 100) {
            ao2.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        t3cVar.g(obj, bArr, i4, i6, i0cVar);
        i0cVar.e--;
        i0cVar.c = obj;
        return i6;
    }

    public static int i(Object obj, t3c t3cVar, byte[] bArr, int i, int i2, int i3, i0c i0cVar) throws k2c {
        l3c l3cVar = (l3c) t3cVar;
        int i4 = i0cVar.e + 1;
        i0cVar.e = i4;
        if (i4 >= 100) {
            ao2.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iZ = l3cVar.z(obj, bArr, i, i2, i3, i0cVar);
        i0cVar.e--;
        i0cVar.c = obj;
        return iZ;
    }

    public static int j(int i, byte[] bArr, int i2, int i3, i2c i2cVar, i0c i0cVar) {
        v1c v1cVar = (v1c) i2cVar;
        int iA = a(bArr, i2, i0cVar);
        v1cVar.i(i0cVar.a);
        while (iA < i3) {
            int iA2 = a(bArr, iA, i0cVar);
            if (i != i0cVar.a) {
                break;
            }
            iA = a(bArr, iA2, i0cVar);
            v1cVar.i(i0cVar.a);
        }
        return iA;
    }

    public static int k(byte[] bArr, int i, i2c i2cVar, i0c i0cVar) throws k2c {
        v1c v1cVar = (v1c) i2cVar;
        int iA = a(bArr, i, i0cVar);
        int i2 = i0cVar.a + iA;
        while (iA < i2) {
            iA = a(bArr, iA, i0cVar);
            v1cVar.i(i0cVar.a);
        }
        if (iA == i2) {
            return iA;
        }
        ao2.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int l(t3c t3cVar, int i, byte[] bArr, int i2, int i3, i2c i2cVar, i0c i0cVar) throws k2c {
        u1c u1cVarA = t3cVar.a();
        t3c t3cVar2 = t3cVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        i0c i0cVar2 = i0cVar;
        int iH = h(u1cVarA, t3cVar2, bArr2, i2, i4, i0cVar2);
        t3cVar2.f(u1cVarA);
        i0cVar2.c = u1cVarA;
        i2cVar.add(u1cVarA);
        while (iH < i4) {
            i0c i0cVar3 = i0cVar2;
            int i5 = i4;
            int iA = a(bArr2, iH, i0cVar3);
            if (i != i0cVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            t3c t3cVar3 = t3cVar2;
            u1c u1cVarA2 = t3cVar3.a();
            iH = h(u1cVarA2, t3cVar3, bArr3, iA, i5, i0cVar3);
            t3cVar2 = t3cVar3;
            bArr2 = bArr3;
            i4 = i5;
            i0cVar2 = i0cVar3;
            t3cVar2.f(u1cVarA2);
            i0cVar2.c = u1cVarA2;
            i2cVar.add(u1cVarA2);
        }
        return iH;
    }

    public static int m(int i, byte[] bArr, int i2, int i3, g4c g4cVar, i0c i0cVar) throws k2c {
        if ((i >>> 3) == 0) {
            ao2.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iC = c(bArr, i2, i0cVar);
            g4cVar.d(i, Long.valueOf(i0cVar.b));
            return iC;
        }
        if (i4 == 1) {
            g4cVar.d(i, Long.valueOf(e(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iA = a(bArr, i2, i0cVar);
            int i5 = i0cVar.a;
            if (i5 < 0) {
                ao2.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iA) {
                ao2.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                g4cVar.d(i, p0c.u);
            } else {
                g4cVar.d(i, p0c.n(bArr, iA, i5));
            }
            return iA + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                g4cVar.d(i, Integer.valueOf(d(bArr, i2)));
                return i2 + 4;
            }
            ao2.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        g4c g4cVarA = g4c.a();
        int i7 = i0cVar.e + 1;
        i0cVar.e = i7;
        if (i7 >= 100) {
            ao2.b("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iA2 = a(bArr, i2, i0cVar);
            int i9 = i0cVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iA2;
                break;
            }
            i2 = m(i9, bArr, iA2, i3, g4cVarA, i0cVar);
            i8 = i9;
        }
        i0cVar.e--;
        if (i2 > i3 || i8 != i6) {
            ao2.b("Failed to parse the message.");
            return 0;
        }
        g4cVar.d(i, g4cVarA);
        return i2;
    }

    public static int n(int i, byte[] bArr, int i2, int i3, i0c i0cVar) throws k2c {
        if ((i >>> 3) == 0) {
            ao2.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return c(bArr, i2, i0cVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return a(bArr, i2, i0cVar) + i0cVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            ao2.b("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = a(bArr, i2, i0cVar);
            i6 = i0cVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = n(i6, bArr, i2, i3, i0cVar);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        ao2.b("Failed to parse the message.");
        return 0;
    }
}
