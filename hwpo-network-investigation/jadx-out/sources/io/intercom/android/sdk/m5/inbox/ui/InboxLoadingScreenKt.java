package io.intercom.android.sdk.m5.inbox.ui;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.x30;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxLoadingScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxLoadingScreenKt {
    @IntercomPreviews
    public static final void HomeLoadingContentPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1591477138);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            InboxLoadingScreen(bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new x30(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeLoadingContentPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        HomeLoadingContentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void InboxLoadingScreen(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1280547936);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            LoadingScreenKt.LoadingScreen(null, R.drawable.intercom_inbox_loading_state, bj4VarO, 0, 1);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ba5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxLoadingScreenKt.InboxLoadingScreen$lambda$0(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxLoadingScreen$lambda$0(int i, jt1 jt1Var, int i2) {
        InboxLoadingScreen(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
