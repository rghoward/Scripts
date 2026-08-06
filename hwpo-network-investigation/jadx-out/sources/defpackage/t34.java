package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t34 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public long a;
    }

    public static boolean a(pt7 pt7Var, x34 x34Var, int i, a aVar) {
        long jB = pt7Var.B();
        long j = jB >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jB >> 12) & 15);
        int i3 = (int) ((jB >> 8) & 15);
        int i4 = (int) ((jB >> 4) & 15);
        int i5 = (int) ((jB >> 1) & 7);
        boolean z2 = (jB & 1) == 1;
        if (i4 <= 7) {
            if (i4 != x34Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || x34Var.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == x34Var.i) || z2) {
            return false;
        }
        try {
            long jH = pt7Var.H();
            if (!z) {
                jH *= (long) x34Var.b;
            }
            long j2 = x34Var.j;
            if (j2 != 0 && jH > j2) {
                return false;
            }
            aVar.a = jH;
            int iB = b(i2, pt7Var);
            long j3 = x34Var.j;
            boolean z3 = j3 == 0 || jH + ((long) iB) >= j3;
            if (iB == -1) {
                return false;
            }
            if ((!z3 && iB < x34Var.a) || iB > x34Var.b) {
                return false;
            }
            int i6 = x34Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != x34Var.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iG = pt7Var.G();
                    if (i3 == 14) {
                        iG *= 10;
                    }
                    if (iG != i6) {
                        return false;
                    }
                } else if (pt7Var.z() * 1000 != i6) {
                    return false;
                }
            }
            int iZ = pt7Var.z();
            int i7 = pt7Var.b;
            byte[] bArr = pt7Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = pt7Var.b; i10 < i8; i10++) {
                i9 = n6b.j[i9 ^ (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP)];
            }
            String str = n6b.a;
            if (iZ != i9) {
                return false;
            }
            if (pt7Var.a() != 0) {
                int iJ = pt7Var.j();
                if ((iJ & 128) != 0) {
                    return false;
                }
                int i11 = (iJ & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    md6.f("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i, pt7 pt7Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return pt7Var.z() + 1;
            case 7:
                return pt7Var.G() + 1;
            case 8:
            case 9:
            case 10:
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 12:
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case h4c.e /* 15 */:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
