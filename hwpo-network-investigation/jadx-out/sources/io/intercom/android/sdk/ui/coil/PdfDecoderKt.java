package io.intercom.android.sdk.ui.coil;

import defpackage.br9;
import defpackage.mh4;
import defpackage.s03;
import defpackage.s39;
import defpackage.u;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdfDecoderKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[s39.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final int heightPx(br9 br9Var, s39 s39Var, mh4<Integer> mh4Var) {
        return xj5.a(br9Var, br9.c) ? mh4Var.invoke().intValue() : toPx(br9Var.b, s39Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toPx(s03 s03Var, s39 s39Var) {
        if (s03Var instanceof s03.a) {
            return ((s03.a) s03Var).a;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[s39Var.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        u.b();
        return 0;
    }

    private static final int widthPx(br9 br9Var, s39 s39Var, mh4<Integer> mh4Var) {
        return xj5.a(br9Var, br9.c) ? mh4Var.invoke().intValue() : toPx(br9Var.a, s39Var);
    }
}
