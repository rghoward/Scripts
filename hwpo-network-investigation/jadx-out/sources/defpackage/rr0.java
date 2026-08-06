package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rr0 extends eh1<boolean[]> {
    public static boolean[] b(String str) {
        str.getClass();
        return new boolean[]{m77.BoolType.parseValue(str).booleanValue()};
    }

    @Override // defpackage.eh1
    public final boolean[] a() {
        return new boolean[0];
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "boolean[]";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        str.getClass();
        boolean[] zArrB = b(str);
        if (zArr == null) {
            return zArrB;
        }
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(zArrB, 0, zArrCopyOf, length, 1);
        return zArrCopyOf;
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        bundle.getClass();
        str.getClass();
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        Boolean[] boolArr;
        boolean[] zArr = (boolean[]) obj;
        boolean[] zArr2 = (boolean[]) obj2;
        Boolean[] boolArr2 = null;
        if (zArr != null) {
            boolArr = new Boolean[zArr.length];
            int length = zArr.length;
            for (int i = 0; i < length; i++) {
                boolArr[i] = Boolean.valueOf(zArr[i]);
            }
        } else {
            boolArr = null;
        }
        if (zArr2 != null) {
            boolArr2 = new Boolean[zArr2.length];
            int length2 = zArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                boolArr2[i2] = Boolean.valueOf(zArr2[i2]);
            }
        }
        return gz3.c(boolArr, boolArr2);
    }

    @Override // defpackage.m77
    public final /* bridge */ /* synthetic */ Object parseValue(String str) {
        return b(str);
    }
}
