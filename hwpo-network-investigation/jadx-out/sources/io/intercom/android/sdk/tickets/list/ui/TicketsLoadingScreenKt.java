package io.intercom.android.sdk.tickets.list.ui;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.ox6;
import defpackage.p12;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsLoadingScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsLoadingScreenKt {
    public static final void TicketsLoadingScreen(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(2079268510);
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
            LoadingScreenKt.LoadingScreen(ox6Var, R.drawable.intercom_inbox_loading_state, bj4VarO, i3 & 14, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: nma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketsLoadingScreenKt.TicketsLoadingScreen$lambda$0(ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsLoadingScreen$lambda$0(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        TicketsLoadingScreen(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void TicketsLoadingScreenPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-880557955);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsLoadingScreenKt.INSTANCE.m546getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new p12(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsLoadingScreenPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        TicketsLoadingScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
