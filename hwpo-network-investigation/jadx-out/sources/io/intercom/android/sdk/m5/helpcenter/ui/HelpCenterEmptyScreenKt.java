package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterEmptyScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterEmptyScreenKt {
    public static final void HelpCenterEmptyScreen(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-123597347);
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
            ox6.a aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var = aVar;
            }
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            EmptyStateKt.EmptyState(nr1.f(bj4VarO, R.string.intercom_no_articles_to_display), ox6Var.H(ir9.c), null, Integer.valueOf(R.drawable.intercom_help_centre_icon), null, bj4VarO, 0, 20);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterEmptyScreenKt.HelpCenterEmptyScreen$lambda$1(ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterEmptyScreen$lambda$1(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        HelpCenterEmptyScreen(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void InboxEmptyScreenPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1897399468);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterEmptyScreenKt.INSTANCE.m302getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterEmptyScreenKt.InboxEmptyScreenPreview$lambda$2(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InboxEmptyScreenPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        InboxEmptyScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
