package defpackage;

import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 {
    public static Object a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            z90.a(pp2.a(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static int b(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int c(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iE = su0.e(obj);
        int i2 = iE & i;
        int iD = d(i2, obj3);
        if (iD != 0) {
            int i3 = ~i;
            int i4 = iE & i3;
            int i5 = -1;
            while (true) {
                int i6 = iD - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && e18.a(obj, objArr[i6]) && (objArr2 == null || e18.a(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        e(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = b(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iD = i9;
            }
        }
        return -1;
    }

    public static int d(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & MessagePack.Code.EXT_TIMESTAMP;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void e(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
