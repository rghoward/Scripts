package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class he6 extends eh1<long[]> {
    public static long[] b(String str) {
        str.getClass();
        return new long[]{m77.LongType.parseValue(str).longValue()};
    }

    @Override // defpackage.eh1
    public final long[] a() {
        return new long[0];
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "long[]";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        long[] jArr = (long[]) obj;
        str.getClass();
        long[] jArrB = b(str);
        if (jArr == null) {
            return jArrB;
        }
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrB, 0, jArrCopyOf, length, 1);
        return jArrCopyOf;
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        long[] jArr = (long[]) obj;
        bundle.getClass();
        str.getClass();
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        Long[] lArr;
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        Long[] lArr2 = null;
        if (jArr != null) {
            lArr = new Long[jArr.length];
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                lArr[i] = Long.valueOf(jArr[i]);
            }
        } else {
            lArr = null;
        }
        if (jArr2 != null) {
            lArr2 = new Long[jArr2.length];
            int length2 = jArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                lArr2[i2] = Long.valueOf(jArr2[i2]);
            }
        }
        return gz3.c(lArr, lArr2);
    }

    @Override // defpackage.m77
    public final /* bridge */ /* synthetic */ Object parseValue(String str) {
        return b(str);
    }
}
