package io.intercom.android.sdk.m5.components;

import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.r12;
import defpackage.raa;
import defpackage.rd7;
import defpackage.th1;
import defpackage.wja;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TeamPresenceRowKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceRowKt {
    public static final void TeamPresenceRow(ox6 ox6Var, final List<AvatarWrapper> list, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        list.getClass();
        bj4 bj4VarO = jt1Var.o(1370953565);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6 ox6Var3 = i4 != 0 ? ox6.a.t : ox6Var2;
            ox6 ox6VarA = raa.a(eo7.j(16.0f, 12.0f, ox6Var3), "team_presence_row");
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarA);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            mia.b(nr1.f(bj4VarO, R.string.intercom_the_team_can_help_if_needed), new qs5(true, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), ColorExtensionsKt.toComposeColor$default("#757575", 0.0f, 1, null), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 0, 0, 131068);
            bj4VarO = bj4VarO;
            AvatarGroupKt.m19AvatarGroupJ8mCjc(th1.O(3, list), null, 24.0f, 0L, bj4VarO, 384, 10);
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: maa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamPresenceRowKt.TeamPresenceRow$lambda$1(ox6Var2, list, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceRow$lambda$1(ox6 ox6Var, List list, int i, int i2, jt1 jt1Var, int i3) {
        TeamPresenceRow(ox6Var, list, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void TeamPresenceRowPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1211328616);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceRowKt.INSTANCE.m75getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new r12(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceRowPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        TeamPresenceRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
