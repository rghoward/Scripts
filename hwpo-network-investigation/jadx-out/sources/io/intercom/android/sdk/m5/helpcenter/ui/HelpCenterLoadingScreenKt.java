package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import defpackage.bj4;
import defpackage.ft;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.lx0;
import defpackage.mn9;
import defpackage.mx0;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterLoadingScreenKt {
    public static final void HelpCenterLoadingScreen(ox6 ox6Var, jt1 jt1Var, int i, int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(581033983);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            final long jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
            ox6 ox6VarH = ox6Var.H(ir9.c);
            bj4VarO.K(1093772747);
            boolean zI = bj4VarO.i(jA);
            Object objF = bj4VarO.f();
            if (zI || objF == jt1.a.a) {
                objF = new oh4() { // from class: rv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$2$lambda$1(jA, (Context) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ft.b((oh4) objF, ox6VarH, null, bj4VarO, 0, 4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lx0(ox6Var, i, i2, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mn9 HelpCenterLoadingScreen$lambda$2$lambda$1(long j, Context context) {
        context.getClass();
        mn9 mn9VarBuildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        mn9VarBuildLoadingContainer.addView(LoadingComponentKt.m452buildLoadingContentbw27NRU(context, j, R.drawable.intercom_help_center_loading_state));
        return mn9VarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterLoadingScreen$lambda$3(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        HelpCenterLoadingScreen(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void HomeLoadingContentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-192893266);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m306getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mx0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeLoadingContentPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        HomeLoadingContentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
