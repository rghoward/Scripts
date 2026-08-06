package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p44 extends eh1<float[]> {
    public static float[] b(String str) {
        str.getClass();
        return new float[]{m77.FloatType.parseValue(str).floatValue()};
    }

    @Override // defpackage.eh1
    public final float[] a() {
        return new float[0];
    }

    @Override // defpackage.m77
    public final Object get(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || wx.c(bundle, str)) {
            return null;
        }
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        xx.e(str);
        throw null;
    }

    @Override // defpackage.m77
    public final String getName() {
        return "float[]";
    }

    @Override // defpackage.m77
    public final Object parseValue(String str, Object obj) {
        float[] fArr = (float[]) obj;
        str.getClass();
        float[] fArrB = b(str);
        if (fArr == null) {
            return fArrB;
        }
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(fArrB, 0, fArrCopyOf, length, 1);
        return fArrCopyOf;
    }

    @Override // defpackage.m77
    public final void put(Bundle bundle, String str, Object obj) {
        float[] fArr = (float[]) obj;
        bundle.getClass();
        str.getClass();
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.m77
    public final boolean valueEquals(Object obj, Object obj2) {
        Float[] fArr;
        float[] fArr2 = (float[]) obj;
        float[] fArr3 = (float[]) obj2;
        Float[] fArr4 = null;
        if (fArr2 != null) {
            fArr = new Float[fArr2.length];
            int length = fArr2.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Float.valueOf(fArr2[i]);
            }
        } else {
            fArr = null;
        }
        if (fArr3 != null) {
            fArr4 = new Float[fArr3.length];
            int length2 = fArr3.length;
            for (int i2 = 0; i2 < length2; i2++) {
                fArr4[i2] = Float.valueOf(fArr3[i2]);
            }
        }
        return gz3.c(fArr, fArr4);
    }

    @Override // defpackage.m77
    public final /* bridge */ /* synthetic */ Object parseValue(String str) {
        return b(str);
    }
}
