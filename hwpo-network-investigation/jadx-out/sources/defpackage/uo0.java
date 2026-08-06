package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uo0 {
    public static final Object a(pj5 pj5Var) {
        Object objG = pj5Var.g();
        ar5 ar5Var = objG instanceof ar5 ? (ar5) objG : null;
        if (ar5Var != null) {
            return ar5Var.U();
        }
        return null;
    }

    public static final int b(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final vn0 c(ao0 ao0Var) {
        ao0Var.getClass();
        int i = ao0Var.a;
        String str = ao0Var.b;
        Double d = ao0Var.d;
        double dDoubleValue = d != null ? d.doubleValue() : -1.0d;
        String str2 = ao0Var.f;
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        return new vn0(i, str, dDoubleValue, null, str2, ao0Var.e, ao0Var.c, d == null);
    }
}
