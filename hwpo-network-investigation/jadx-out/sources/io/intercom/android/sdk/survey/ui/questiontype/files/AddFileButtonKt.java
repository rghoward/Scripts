package io.intercom.android.sdk.survey.ui.questiontype.files;

import defpackage.a30;
import defpackage.ay8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.hb;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.uma;
import defpackage.v5a;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.questiontype.files.AddFileButtonKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AddFileButtonKt {
    public static final void AddFileButton(ox6 ox6Var, final int i, jt1 jt1Var, final int i2, final int i3) {
        final ox6 ox6Var2;
        int i4;
        bj4 bj4VarO = jt1Var.o(533336753);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            ox6Var2 = ox6Var;
        } else if ((i2 & 6) == 0) {
            ox6Var2 = ox6Var;
            i4 = i2 | (bj4VarO.J(ox6Var2) ? 4 : 2);
        } else {
            ox6Var2 = ox6Var;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= bj4VarO.h(i) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i5 != 0 ? aVar : ox6Var;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i6 = IntercomTheme.$stable;
            ox6 ox6VarI = eo7.i(uma.a(gi0.c(ox6Var3, uh1.b(0.06f, intercomTheme.getColors(bj4VarO, i6).getText().m824getDefault0d7_KjU()), intercomTheme.getShapes(bj4VarO, i6).b), ay8.a(2)), 8.0f);
            ny8 ny8VarA = ly8.a(new c30.h(3.0f, true, new a30()), di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarI);
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
            mia.b(nr1.f(bj4VarO, i), aVar, gh5.a(intercomTheme, bj4VarO, i6), 0L, ob4.A, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i6).getType04Point5(), bj4VarO, 1572912, 0, 131000);
            bj4VarO = bj4VarO;
            m65.b(is7.a(R.drawable.intercom_ic_plus, bj4VarO, 0), "Add", ir9.j(aVar, 16.0f), intercomTheme.getColors(bj4VarO, i6).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ib
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AddFileButtonKt.AddFileButton$lambda$1(ox6Var2, i, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AddFileButton$lambda$1(ox6 ox6Var, int i, int i2, int i3, jt1 jt1Var, int i4) {
        AddFileButton(ox6Var, i, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void AddFileButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-126735215);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AddFileButtonKt.INSTANCE.m478getLambda1$intercom_sdk_base_release(), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hb(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AddFileButtonPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        AddFileButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
