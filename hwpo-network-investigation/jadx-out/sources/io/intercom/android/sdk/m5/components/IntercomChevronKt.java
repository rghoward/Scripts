package io.intercom.android.sdk.m5.components;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import defpackage.ox6;
import defpackage.qu1;
import defpackage.tq5;
import defpackage.ux8;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomChevronKt {
    public static final void IntercomChevron(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(467059601);
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
            m65.b(is7.a(R.drawable.intercom_chevron, bj4VarO, 0), null, ux8.a(ox6Var, bj4VarO.F(qu1.n) == tq5.u ? 180.0f : 0.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU(), bj4VarO, 56, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ph5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomChevronKt.IntercomChevron$lambda$0(ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomChevron$lambda$0(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        IntercomChevron(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
