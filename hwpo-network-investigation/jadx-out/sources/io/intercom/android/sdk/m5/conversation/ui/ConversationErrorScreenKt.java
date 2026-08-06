package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ox6;
import defpackage.xj8;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.ui.ConversationErrorScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationErrorScreenKt {
    public static final void ConversationErrorScreen(final ConversationUiState.Error error, final mh4<g2b> mh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        error.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1804211412);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(error) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            IntercomErrorScreenKt.IntercomErrorScreen(error.getShowCta() ? new ErrorState.WithCTA(0, 0, null, 0, mh4Var, 15, null) : new ErrorState.WithoutCTA(0, 0, null, 7, null), ox6Var, bj4VarO, (i3 >> 3) & 112, 0);
        }
        final ox6 ox6Var2 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: u12
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationErrorScreenKt.ConversationErrorScreen$lambda$0(error, mh4Var, ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationErrorScreen$lambda$0(ConversationUiState.Error error, mh4 mh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        ConversationErrorScreen(error, mh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ConversationErrorScreenPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1551706949);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationErrorScreenKt.INSTANCE.m113getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: t12
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationErrorScreenKt.ConversationErrorScreenPreview$lambda$1(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationErrorScreenPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        ConversationErrorScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
