package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.pn5;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.v33;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NewMessagesRowKt {
    public static final void NewMessagesRow(ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        bj4 bj4VarO = jt1Var.o(1974801002);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = i | (bj4VarO.J(ox6Var2) ? 4 : 2);
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i3 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i4 != 0 ? aVar : ox6Var2;
            ox6 ox6VarK = eo7.k(ir9.c(ox6Var3, 1.0f), 16.0f, 0.0f, 2);
            ny8 ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarK);
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
            ox6 ox6VarN = ir9.n(aVar, 36.0f);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i5 = IntercomTheme.$stable;
            v33.a(ox6VarN, 0.0f, intercomTheme.getColors(bj4VarO, i5).m756getBadge0d7_KjU(), bj4VarO, 6, 2);
            mia.b(nr1.f(bj4VarO, R.string.intercom_new), eo7.k(aVar, 8.0f, 0.0f, 2), intercomTheme.getColors(bj4VarO, i5).m756getBadge0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, 48, 0, 262136);
            bj4VarO = bj4VarO;
            v33.a(null, 0.0f, intercomTheme.getColors(bj4VarO, i5).m756getBadge0d7_KjU(), bj4VarO, 0, 3);
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: va7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewMessagesRowKt.NewMessagesRow$lambda$1(ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewMessagesRow$lambda$1(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        NewMessagesRow(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void NewMessagesRowPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2081615555);
        int i2 = 1;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            NewMessagesRow(null, bj4VarO, 0, 1);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new pn5(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NewMessagesRowPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        NewMessagesRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
