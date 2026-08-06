package io.intercom.android.sdk.m5.components;

import defpackage.aj1;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sh;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.m5.components.HomeCardScaffoldKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeCardScaffoldKt {
    public static final void HomeCardScaffold(ox6 ox6Var, final String str, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        str.getClass();
        ci4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1721620037);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            IntercomCardKt.IntercomCard(ox6Var2, null, gr1.b(1218435015, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.HomeCardScaffoldKt.HomeCardScaffold.1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i5) {
                    bj1Var.getClass();
                    if ((i5 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarM = eo7.m(aVar, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    String str2 = str;
                    ci4<jt1, Integer, g2b> ci4Var2 = ci4Var;
                    aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC = it1.c(jt1Var2, ox6VarM);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar2);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    mia.b(str2, eo7.k(eo7.m(aVar, 0.0f, 16.0f, 0.0f, 6.0f, 5), 20.0f, 0.0f, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04SemiBold(), jt1Var2, 48, 0, 131068);
                    sh.a(ci4Var2, jt1Var2, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i3 & 14) | 384, 2);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final ox6 ox6Var3 = ox6Var;
            xj8VarW.d = new ci4() { // from class: sz4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeCardScaffoldKt.HomeCardScaffold$lambda$0(ox6Var3, str, ci4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeCardScaffold$lambda$0(ox6 ox6Var, String str, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        HomeCardScaffold(ox6Var, str, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void HomeCardScaffoldPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1294989986);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeCardScaffoldKt.INSTANCE.m51getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rz4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeCardScaffoldKt.HomeCardScaffoldPreview$lambda$1(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeCardScaffoldPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        HomeCardScaffoldPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
