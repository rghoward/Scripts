package io.intercom.android.sdk.survey.ui.components;

import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j70;
import defpackage.jt1;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.m70;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.ux1;
import defpackage.vaa;
import defpackage.wl3;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.ui.components.ErrorComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorComponentKt {
    public static final void ErrorStateWithCTA(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1921062712);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            SurveyUiColors surveyUiColorsA = ux1.a(null, null, 3, null);
            TopBarState.NoTopBarState noTopBarState = new TopBarState.NoTopBarState(true, ux1.a(null, null, 3, null), null, 4, null);
            bj4VarO.K(-737735323);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new wl3();
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            SurveyError(new SurveyState.Error.WithCTA(0, surveyUiColorsA, noTopBarState, (mh4) objF, 1, null), null, bj4VarO, 0, 2);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new m70(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ErrorStateWithCTA$lambda$4(int i, jt1 jt1Var, int i2) {
        ErrorStateWithCTA(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ErrorStateWithoutCTA(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1056362620);
        int i2 = 2;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            int i3 = 0;
            char c = 1 == true ? 1 : 0;
            SurveyError(new SurveyState.Error.WithoutCTA(i3, ux1.a(null, null, 3, null), new TopBarState.NoTopBarState(true, ux1.a(null, null, 3, null), null, 4, null), c, null), null, bj4VarO, 0, 2);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new j70(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ErrorStateWithoutCTA$lambda$5(int i, jt1 jt1Var, int i2) {
        ErrorStateWithoutCTA(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:48:0x015d  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void SurveyError(final SurveyState.Error error, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        kv0 kv0Var;
        xj8 xj8VarW;
        error.getClass();
        bj4 bj4VarO = jt1Var.o(805293226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bj4VarO.J(error) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                ox6 ox6VarH = ox6Var3.H(ir9.c);
                fl6VarD = dv0.d(di.a.e, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                String strF = nr1.f(bj4VarO, error.getMessageResId());
                long jM407getOnBackground0d7_KjU = error.getSurveyUiColors().m407getOnBackground0d7_KjU();
                long jB = cka.b(36);
                ob4 ob4Var = ob4.B;
                ox6 ox6VarJ = eo7.j(32.0f, 32.0f, aVar);
                sp0 sp0Var = di.a.b;
                kv0Var = kv0.a;
                ox6 ox6Var4 = ox6Var3;
                mia.b(strF, kv0Var.f(ox6VarJ, sp0Var), jM407getOnBackground0d7_KjU, jB, ob4Var, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, bj4VarO, 1597440, 0, 261032);
                bj4VarO = bj4VarO;
                bj4VarO.K(-803498879);
                if (error instanceof SurveyState.Error.WithCTA) {
                    SurveyState.Error.WithCTA withCTA = (SurveyState.Error.WithCTA) error;
                    SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(kv0Var.f(eo7.i(aVar, 16.0f), di.a.h), nr1.f(bj4VarO, R.string.intercom_retry), null, withCTA.getOnClick(), null, withCTA.getSurveyUiColors(), bj4VarO, 0, 20);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6Var2 = ox6Var4;
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vl3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ErrorComponentKt.SurveyError$lambda$1(error, ox6Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i3 & 19) == 18) {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarH2 = ox6Var3.H(ir9.c);
            fl6VarD = dv0.d(di.a.e, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            String strF2 = nr1.f(bj4VarO, error.getMessageResId());
            long jM407getOnBackground0d7_KjU2 = error.getSurveyUiColors().m407getOnBackground0d7_KjU();
            long jB2 = cka.b(36);
            ob4 ob4Var2 = ob4.B;
            ox6 ox6VarJ2 = eo7.j(32.0f, 32.0f, aVar);
            sp0 sp0Var2 = di.a.b;
            kv0Var = kv0.a;
            ox6 ox6Var5 = ox6Var3;
            mia.b(strF2, kv0Var.f(ox6VarJ2, sp0Var2), jM407getOnBackground0d7_KjU2, jB2, ob4Var2, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, bj4VarO, 1597440, 0, 261032);
            bj4VarO = bj4VarO;
            bj4VarO.K(-803498879);
            if (error instanceof SurveyState.Error.WithCTA) {
                SurveyState.Error.WithCTA withCTA2 = (SurveyState.Error.WithCTA) error;
                SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(kv0Var.f(eo7.i(aVar, 16.0f), di.a.h), nr1.f(bj4VarO, R.string.intercom_retry), null, withCTA2.getOnClick(), null, withCTA2.getSurveyUiColors(), bj4VarO, 0, 20);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var2 = ox6Var5;
        } else {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarH3 = ox6Var3.H(ir9.c);
            fl6VarD = dv0.d(di.a.e, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            String strF3 = nr1.f(bj4VarO, error.getMessageResId());
            long jM407getOnBackground0d7_KjU3 = error.getSurveyUiColors().m407getOnBackground0d7_KjU();
            long jB3 = cka.b(36);
            ob4 ob4Var3 = ob4.B;
            ox6 ox6VarJ3 = eo7.j(32.0f, 32.0f, aVar);
            sp0 sp0Var3 = di.a.b;
            kv0Var = kv0.a;
            ox6 ox6Var6 = ox6Var3;
            mia.b(strF3, kv0Var.f(ox6VarJ3, sp0Var3), jM407getOnBackground0d7_KjU3, jB3, ob4Var3, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, bj4VarO, 1597440, 0, 261032);
            bj4VarO = bj4VarO;
            bj4VarO.K(-803498879);
            if (error instanceof SurveyState.Error.WithCTA) {
                SurveyState.Error.WithCTA withCTA3 = (SurveyState.Error.WithCTA) error;
                SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(kv0Var.f(eo7.i(aVar, 16.0f), di.a.h), nr1.f(bj4VarO, R.string.intercom_retry), null, withCTA3.getOnClick(), null, withCTA3.getSurveyUiColors(), bj4VarO, 0, 20);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var2 = ox6Var6;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vl3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ErrorComponentKt.SurveyError$lambda$1(error, ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyError$lambda$1(SurveyState.Error error, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        SurveyError(error, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
