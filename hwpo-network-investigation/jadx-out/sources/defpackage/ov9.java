package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ov9 implements jac {
    public static final int[] t = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final /* synthetic */ ov9 u = new ov9();

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        z90.a(str);
    }

    public static void c(Object obj) {
        d(obj, "Argument must not be null");
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ac4.c(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] e(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static long f(double d) {
        xl7.f("not a normal value", h(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean g(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (t[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(double d) {
        return Math.getExponent(d) <= 1023;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x0177  */
    /* JADX WARN: Code duplicated, block: B:107:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static nv9 i(ks3 ks3Var, boolean z, boolean z2) {
        nv9 nv9Var;
        int i;
        long jT;
        int i2;
        long j;
        int i3;
        boolean z3;
        int[] iArr;
        long jA = ks3Var.a();
        long j2 = -1;
        int i4 = (jA > (-1L) ? 1 : (jA == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i4 != 0 && jA <= 4096) {
            j3 = jA;
        }
        int i5 = (int) j3;
        pt7 pt7Var = new pt7(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (true) {
            if (i7 < i5) {
                pt7Var.J(8);
                if (ks3Var.f(pt7Var.a, i6, 8, true)) {
                    long jB = pt7Var.B();
                    int iM = pt7Var.m();
                    if (jB == 1) {
                        j2 = j2;
                        ks3Var.n(pt7Var.a, 8, 8);
                        i2 = 16;
                        pt7Var.L(16);
                        jT = pt7Var.t();
                    } else {
                        j2 = j2;
                        if (jB == 0) {
                            long jA2 = ks3Var.a();
                            if (jA2 != j2) {
                                jB = (jA2 - ks3Var.g()) + 8;
                            }
                        }
                        jT = jB;
                        i2 = 8;
                    }
                    long j4 = i2;
                    if (jT < j4) {
                        nv9Var = null;
                        if (iM != 1718773093 || i2 != 8) {
                            return new g60(jT, iM, i2);
                        }
                        jT = j4;
                    } else {
                        nv9Var = null;
                    }
                    int i8 = i7 + i2;
                    if (iM == 1836019574 || iM == 1970628964) {
                        i5 += (int) jT;
                        if (i4 != 0 && i5 > jA) {
                            i5 = (int) jA;
                        }
                        if (iM == 1836019574) {
                            i7 = i8;
                            i6 = 0;
                        }
                    }
                    if (iM == 1953653099 || iM == 1835297121 || iM == 1835626086) {
                        j = jA;
                        i3 = 0;
                        i7 = i8;
                    } else if (iM == 1836019558 || iM == 1836475768) {
                        i = 1;
                    } else {
                        if (iM == 1835295092) {
                            z4 = true;
                        }
                        if (iM != 1937007212 || jT <= 1000000) {
                            j = jA;
                            if ((((long) i8) + jT) - j4 < i5) {
                                int i9 = (int) (jT - j4);
                                i7 = i8 + i9;
                                if (iM != 1718909296) {
                                    i3 = 0;
                                    if (i9 != 0) {
                                        ks3Var.h(i9);
                                    }
                                } else {
                                    if (i9 < 8) {
                                        return new g60(i9, iM, 8);
                                    }
                                    pt7Var.J(i9);
                                    i3 = 0;
                                    ks3Var.n(pt7Var.a, 0, i9);
                                    int iM2 = pt7Var.m();
                                    if (g(iM2, z2)) {
                                        z4 = true;
                                    }
                                    pt7Var.N(4);
                                    int iA = pt7Var.a() / 4;
                                    if (!z4 && iA > 0) {
                                        int[] iArr2 = new int[iA];
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= iA) {
                                                z3 = z4;
                                                iArr = iArr2;
                                                break;
                                            }
                                            int iM3 = pt7Var.m();
                                            iArr2[i10] = iM3;
                                            if (g(iM3, z2)) {
                                                z3 = true;
                                                iArr = iArr2;
                                                break;
                                            }
                                            i10++;
                                        }
                                    } else {
                                        z3 = z4;
                                        iArr = nv9Var;
                                    }
                                    if (!z3) {
                                        return new n3b(iArr, iM2);
                                    }
                                    z4 = z3;
                                }
                            }
                        }
                        i = 0;
                    }
                    i6 = i3;
                    jA = j;
                }
                if (!z4) {
                    return bb7.b;
                }
                if (z != i) {
                    return i != 0 ? la5.b : la5.c;
                }
                return nv9Var;
            }
            nv9Var = null;
            i = i6;
            if (!z4) {
                return bb7.b;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return nv9Var;
        }
    }

    public static boolean j(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().J());
    }
}
