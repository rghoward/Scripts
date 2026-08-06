package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pf5 extends eh1<int[]> {
    public static int[] b(String str) {
        str.getClass();
        return new int[]{m77.IntType.parseValue(str).intValue()};
    }

    @Override // defpackage.eh1
    public final int[] a() {
        return new int[0];
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "integer[]";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        int[] iArr = (int[]) obj;
        str.getClass();
        int[] iArrB = b(str);
        if (iArr == null) {
            return iArrB;
        }
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        System.arraycopy(iArrB, 0, iArrCopyOf, length, 1);
        return iArrCopyOf;
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        int[] iArr = (int[]) obj;
        bundle.getClass();
        str.getClass();
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        Integer[] numArr;
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        Integer[] numArr2 = null;
        if (iArr != null) {
            numArr = new Integer[iArr.length];
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                numArr[i] = Integer.valueOf(iArr[i]);
            }
        } else {
            numArr = null;
        }
        if (iArr2 != null) {
            numArr2 = new Integer[iArr2.length];
            int length2 = iArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                numArr2[i2] = Integer.valueOf(iArr2[i2]);
            }
        }
        return gz3.c(numArr, numArr2);
    }

    @Override // defpackage.m77
    public final /* bridge */ /* synthetic */ Object parseValue(String str) {
        return b(str);
    }
}
