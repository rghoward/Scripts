package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.ox6;
import defpackage.xj8;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterErrorScreenKt {
    public static final void HelpCenterErrorScreen(final ErrorState errorState, final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        errorState.getClass();
        bj4 bj4VarO = jt1Var.o(-1476576134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(errorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            IntercomErrorScreenKt.IntercomErrorScreen(errorState, ox6Var, bj4VarO, i3 & 126, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ov4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterErrorScreenKt.HelpCenterErrorScreen$lambda$0(errorState, ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterErrorScreen$lambda$0(ErrorState errorState, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        HelpCenterErrorScreen(errorState, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void HelpCenterErrorScreenWithCTAPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1313793298);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterErrorScreenKt.INSTANCE.m303getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: pv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterErrorScreenKt.HelpCenterErrorScreenWithCTAPreview$lambda$1(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterErrorScreenWithCTAPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        HelpCenterErrorScreenWithCTAPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void HelpCenterErrorScreenWithoutCTAPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1385533872);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterErrorScreenKt.INSTANCE.m304getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: nv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterErrorScreenKt.HelpCenterErrorScreenWithoutCTAPreview$lambda$2(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterErrorScreenWithoutCTAPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        HelpCenterErrorScreenWithoutCTAPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
