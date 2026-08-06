package io.intercom.android.sdk.m5.components;

import android.content.Context;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ft;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.mn9;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.xj8;
import defpackage.zr0;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingScreenKt {
    public static final void LoadingScreen(final ox6 ox6Var, final int i, jt1 jt1Var, final int i2, final int i3) {
        int i4;
        bj4 bj4VarO = jt1Var.o(-1767045234);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (bj4VarO.J(ox6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= bj4VarO.h(i) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i5 != 0) {
                ox6Var = ox6.a.t;
            }
            final long jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
            ox6 ox6VarH = ox6Var.H(ir9.c);
            bj4VarO.K(1035114353);
            boolean zI = ((i4 & 112) == 32) | bj4VarO.i(jA);
            Object objF = bj4VarO.f();
            if (zI || objF == jt1.a.a) {
                objF = new oh4() { // from class: cc6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return LoadingScreenKt.LoadingScreen$lambda$2$lambda$1(jA, i, (Context) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ft.b((oh4) objF, ox6VarH, null, bj4VarO, 0, 4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dc6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LoadingScreenKt.LoadingScreen$lambda$3(ox6Var, i, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn9 LoadingScreen$lambda$2$lambda$1(long j, int i, Context context) {
        context.getClass();
        mn9 mn9VarBuildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        mn9VarBuildLoadingContainer.addView(LoadingComponentKt.m452buildLoadingContentbw27NRU(context, j, i));
        return mn9VarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LoadingScreen$lambda$3(ox6 ox6Var, int i, int i2, int i3, jt1 jt1Var, int i4) {
        LoadingScreen(ox6Var, i, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void LoadingScreenPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1596356708);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LoadingScreenKt.INSTANCE.m65getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zr0(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LoadingScreenPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        LoadingScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
