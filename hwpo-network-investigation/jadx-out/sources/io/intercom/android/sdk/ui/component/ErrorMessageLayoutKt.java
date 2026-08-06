package io.intercom.android.sdk.ui.component;

import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ws0;
import defpackage.xj8;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorMessageLayoutKt {
    public static final void ErrorMessageLayout(ox6 ox6Var, final List<? extends StringProvider> list, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        list.getClass();
        bj4 bj4VarO = jt1Var.o(-1308212592);
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
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i4 != 0 ? aVar : ox6Var2;
            ox6 ox6VarM = eo7.m(ir9.c(ox6Var3, 1.0f), 0.0f, 4.0f, 0.0f, 4.0f, 5);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarM);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            m65.b(is7.a(R.drawable.intercom_ic_error, bj4VarO, 0), null, ir9.n(aVar, 16.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m766getError0d7_KjU(), bj4VarO, 440, 0);
            StringBuilder sb = new StringBuilder();
            bj4VarO.K(-1467578667);
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    ws0.m();
                    throw null;
                }
                sb.append(((StringProvider) obj).getText(bj4VarO, 0));
                if (i5 != list.size() - 1) {
                    sb.append(". ");
                }
                i5 = i6;
            }
            bj4VarO.U(false);
            String string = sb.toString();
            ox6 ox6VarM2 = eo7.m(ir9.c(aVar, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            mia.b(string, ox6VarM2, intercomTheme.getColors(bj4VarO, 6).m766getError0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, 48, 24960, 110584);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zl3
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return ErrorMessageLayoutKt.ErrorMessageLayout$lambda$2(ox6Var2, list, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ErrorMessageLayout$lambda$2(ox6 ox6Var, List list, int i, int i2, jt1 jt1Var, int i3) {
        ErrorMessageLayout(ox6Var, list, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
