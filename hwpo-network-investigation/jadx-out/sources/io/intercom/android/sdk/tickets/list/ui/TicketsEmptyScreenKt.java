package io.intercom.android.sdk.tickets.list.ui;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.op4;
import defpackage.ox6;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.tickets.list.ui.TicketsEmptyScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsEmptyScreenKt {
    private static final void EmptyScreenPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1850741992);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsEmptyScreenKt.INSTANCE.m542getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new op4(i, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyScreenPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        EmptyScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void TicketsEmptyScreen(final EmptyState emptyState, final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        emptyState.getClass();
        bj4 bj4VarO = jt1Var.o(1360358580);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(emptyState) ? 4 : 2) | i;
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
            ox6 ox6Var2 = ox6Var;
            EmptyStateKt.EmptyState(emptyState.getTitle(), ox6Var2, emptyState.getText(), Integer.valueOf(R.drawable.intercom_ticket_detail_icon), null, bj4VarO, i3 & 112, 16);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketsEmptyScreenKt.TicketsEmptyScreen$lambda$0(emptyState, ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsEmptyScreen$lambda$0(EmptyState emptyState, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        TicketsEmptyScreen(emptyState, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
