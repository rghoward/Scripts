package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class um implements ViewTranslationCallback {
    public static final um a = new um();

    public final boolean onClearTranslation(View view) {
        mh4 mh4Var;
        view.getClass();
        bn contentCaptureManager$ui = ((cm) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.y = bn.a.t;
        zf5<xb9> zf5VarC = contentCaptureManager$ui.c();
        Object[] objArr = zf5VarC.c;
        long[] jArr = zf5VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        c37<gc9<?>, Object> c37Var = ((xb9) objArr[(i << 3) + i3]).a.d.t;
                        Object objD = c37Var.d(ac9.E);
                        if (objD == null) {
                            objD = null;
                        }
                        if (objD != null) {
                            Object objD2 = c37Var.d(kb9.n);
                            k3 k3Var = (k3) (objD2 != null ? objD2 : null);
                            if (k3Var != null && (mh4Var = (mh4) k3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        oh4 oh4Var;
        view.getClass();
        bn contentCaptureManager$ui = ((cm) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.y = bn.a.t;
        zf5<xb9> zf5VarC = contentCaptureManager$ui.c();
        Object[] objArr = zf5VarC.c;
        long[] jArr = zf5VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        c37<gc9<?>, Object> c37Var = ((xb9) objArr[(i << 3) + i3]).a.d.t;
                        Object objD = c37Var.d(ac9.E);
                        if (objD == null) {
                            objD = null;
                        }
                        if (xj5.a(objD, Boolean.TRUE)) {
                            Object objD2 = c37Var.d(kb9.m);
                            k3 k3Var = (k3) (objD2 != null ? objD2 : null);
                            if (k3Var != null && (oh4Var = (oh4) k3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        oh4 oh4Var;
        view.getClass();
        bn contentCaptureManager$ui = ((cm) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.y = bn.a.u;
        zf5<xb9> zf5VarC = contentCaptureManager$ui.c();
        Object[] objArr = zf5VarC.c;
        long[] jArr = zf5VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        c37<gc9<?>, Object> c37Var = ((xb9) objArr[(i << 3) + i3]).a.d.t;
                        Object objD = c37Var.d(ac9.E);
                        if (objD == null) {
                            objD = null;
                        }
                        if (xj5.a(objD, Boolean.FALSE)) {
                            Object objD2 = c37Var.d(kb9.m);
                            k3 k3Var = (k3) (objD2 != null ? objD2 : null);
                            if (k3Var != null && (oh4Var = (oh4) k3Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
