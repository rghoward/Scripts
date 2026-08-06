package defpackage;

import java.io.EOFException;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(ua1.b);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(tx0 tx0Var, g01 g01Var, long j, long j2, int i) {
        f99 f99Var;
        long j3 = j;
        long j4 = j2;
        tx0Var.getClass();
        g01Var.getClass();
        long j5 = i;
        t.b(g01Var.g(), 0L, j5);
        if (i <= 0) {
            z90.a("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            ca0.a(d43.b(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbB = ao3.b("fromIndex > toIndex: ", j3, " > ");
            sbB.append(j4);
            throw new IllegalArgumentException(sbB.toString().toString());
        }
        long j6 = tx0Var.u;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (f99Var = tx0Var.t) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                f99Var = f99Var.g;
                f99Var.getClass();
                j6 -= (long) (f99Var.c - f99Var.b);
            }
            byte[] bArrK = g01Var.k();
            byte b2 = bArrK[0];
            long jMin = Math.min(j4, (tx0Var.u - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = f99Var.a;
                int iMin = (int) Math.min(f99Var.c, (((long) f99Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) f99Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(f99Var, i2 + 1, bArrK, 1, i)) {
                        return ((long) (i2 - f99Var.b)) + j6;
                    }
                }
                j6 += (long) (f99Var.c - f99Var.b);
                f99Var = f99Var.f;
                f99Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (f99Var.c - f99Var.b));
            if (j8 > j3) {
                break;
            }
            f99Var = f99Var.f;
            f99Var.getClass();
            j7 = j8;
        }
        byte[] bArrK2 = g01Var.k();
        byte b3 = bArrK2[0];
        long jMin2 = Math.min(j4, (tx0Var.u - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = f99Var.a;
            int iMin2 = (int) Math.min(f99Var.c, (((long) f99Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) f99Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(f99Var, i3 + 1, bArrK2, 1, i)) {
                    return ((long) (i3 - f99Var.b)) + j7;
                }
            }
            j7 += (long) (f99Var.c - f99Var.b);
            f99Var = f99Var.f;
            f99Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(f99 f99Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = f99Var.c;
        byte[] bArr2 = f99Var.a;
        while (i2 < i3) {
            if (i == i4) {
                f99Var = f99Var.f;
                f99Var.getClass();
                byte[] bArr3 = f99Var.a;
                bArr2 = bArr3;
                i = f99Var.b;
                i4 = f99Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(tx0 tx0Var, long j) throws EOFException {
        tx0Var.getClass();
        if (j > 0) {
            long j2 = j - 1;
            if (tx0Var.u(j2) == 13) {
                String strL = tx0Var.L(j2, ua1.b);
                tx0Var.skip(2L);
                return strL;
            }
        }
        String strL2 = tx0Var.L(j, ua1.b);
        tx0Var.skip(1L);
        return strL2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[LOOP:0: B:8:0x001f->B:49:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3 A[SYNTHETIC] */
    public static final int d(tx0 tx0Var, yk7 yk7Var, boolean z) {
        int i;
        int i2;
        int i3;
        f99 f99Var;
        int i4;
        tx0Var.getClass();
        yk7Var.getClass();
        f99 f99Var2 = tx0Var.t;
        if (f99Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = f99Var2.a;
        int i5 = f99Var2.b;
        int i6 = f99Var2.c;
        int[] iArr = yk7Var.u;
        f99 f99Var3 = f99Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (f99Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & MessagePack.Code.EXT_TIMESTAMP;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            f99Var3 = f99Var3.f;
                            f99Var3.getClass();
                            int i16 = f99Var3.b;
                            byte[] bArr2 = f99Var3.a;
                            i2 = f99Var3.c;
                            if (f99Var3 == f99Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                f99Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & MessagePack.Code.EXT_TIMESTAMP) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        f99Var3.getClass();
                        f99 f99Var4 = f99Var3.f;
                        f99Var4.getClass();
                        i3 = f99Var4.b;
                        byte[] bArr3 = f99Var4.a;
                        i4 = f99Var4.c;
                        if (f99Var4 != f99Var2) {
                            f99Var = f99Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            f99Var = null;
                        }
                    } else {
                        f99Var = f99Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        f99Var3 = f99Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    f99Var3 = f99Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
