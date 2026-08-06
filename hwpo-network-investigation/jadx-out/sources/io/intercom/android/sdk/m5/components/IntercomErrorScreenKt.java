package io.intercom.android.sdk.m5.components;

import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.v5a;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomErrorScreenKt {
    @IntercomPreviews
    public static final void ErrorScreenWithCTAPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-2005095861);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m61getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: uh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomErrorScreenKt.ErrorScreenWithCTAPreview$lambda$1(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ErrorScreenWithCTAPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        ErrorScreenWithCTAPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ErrorScreenWithoutCTAPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(753957761);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomErrorScreenKt.INSTANCE.m62getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: sh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomErrorScreenKt.ErrorScreenWithoutCTAPreview$lambda$2(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ErrorScreenWithoutCTAPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        ErrorScreenWithoutCTAPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static final void IntercomErrorScreen(final ErrorState errorState, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        final ox6 ox6Var3;
        xj8 xj8VarW;
        errorState.getClass();
        bj4 bj4VarO = jt1Var.o(-45428996);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(errorState) ? 4 : 2) | i;
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
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                v5a.a(ox6Var3.H(ir9.c), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(847888321, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                    public final void invoke(jt1 jt1Var2, int i5) {
                        ox6.a aVar;
                        if ((i5 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        ErrorState errorState2 = errorState;
                        fl6 fl6VarD = dv0.d(di.a.e, false);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6.a aVar2 = ox6.a.t;
                        ox6 ox6VarC = it1.c(jt1Var2, aVar2);
                        bt1.c.getClass();
                        qr5.a aVar3 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar3);
                        } else {
                            jt1Var2.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var2, cVar, fl6VarD);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var2, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar = bt1.a.g;
                        rd7.d(jt1Var2, bVar, numValueOf);
                        bt1.a.C0034a c0034a = bt1.a.h;
                        rd7.c(jt1Var2, c0034a);
                        bt1.a.d dVar = bt1.a.d;
                        rd7.d(jt1Var2, dVar, ox6VarC);
                        aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY2 = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar2);
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar3);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, cVar, aj1VarA);
                        rd7.d(jt1Var2, eVar, kw7VarY2);
                        g3.c(iHashCode2, jt1Var2, bVar, jt1Var2, c0034a);
                        rd7.d(jt1Var2, dVar, ox6VarC2);
                        m65.b(is7.a(errorState2.getIconId(), jt1Var2, 0), null, ir9.j(aVar2, 32.0f), 0L, jt1Var2, 440, 8);
                        b47.b(jt1Var2, ir9.d(aVar2, 16.0f));
                        String strF = nr1.f(jt1Var2, errorState2.getMessageResId());
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i6 = IntercomTheme.$stable;
                        mia.b(strF, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i6).getType03(), jt1Var2, 0, 0, 131070);
                        jt1 jt1Var3 = jt1Var2;
                        b47.b(jt1Var3, ir9.d(aVar2, 8.0f));
                        Integer additionalMessageResId = errorState2.getAdditionalMessageResId();
                        jt1Var3.K(1192536998);
                        if (additionalMessageResId == null) {
                            aVar = aVar2;
                        } else {
                            aVar = aVar2;
                            mia.b(nr1.f(jt1Var3, additionalMessageResId.intValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i6).getType04(), jt1Var2, 0, 0, 131070);
                            jt1Var3 = jt1Var2;
                        }
                        jt1Var3.B();
                        b47.b(jt1Var3, ir9.d(aVar, 16.0f));
                        jt1Var3.K(1192545587);
                        if (errorState2 instanceof ErrorState.WithCTA) {
                            ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState2;
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(nr1.f(jt1Var3, withCTA.getCtaResId()), null, null, withCTA.getOnCtaClick(), jt1Var3, 0, 6);
                        }
                        jt1Var2.B();
                        jt1Var2.I();
                        jt1Var2.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 12582912, 126);
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: th5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomErrorScreenKt.IntercomErrorScreen$lambda$0(errorState, ox6Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i3 & 19) == 18) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            v5a.a(ox6Var3.H(ir9.c), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(847888321, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                public final void invoke(jt1 jt1Var2, int i5) {
                    ox6.a aVar;
                    if ((i5 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ErrorState errorState2 = errorState;
                    fl6 fl6VarD = dv0.d(di.a.e, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6.a aVar2 = ox6.a.t;
                    ox6 ox6VarC = it1.c(jt1Var2, aVar2);
                    bt1.c.getClass();
                    qr5.a aVar3 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar3);
                    } else {
                        jt1Var2.z();
                    }
                    bt1.a.c cVar = bt1.a.f;
                    rd7.d(jt1Var2, cVar, fl6VarD);
                    bt1.a.e eVar = bt1.a.e;
                    rd7.d(jt1Var2, eVar, kw7VarY);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar = bt1.a.g;
                    rd7.d(jt1Var2, bVar, numValueOf);
                    bt1.a.C0034a c0034a = bt1.a.h;
                    rd7.c(jt1Var2, c0034a);
                    bt1.a.d dVar = bt1.a.d;
                    rd7.d(jt1Var2, dVar, ox6VarC);
                    aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY2 = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar2);
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar3);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, cVar, aj1VarA);
                    rd7.d(jt1Var2, eVar, kw7VarY2);
                    g3.c(iHashCode2, jt1Var2, bVar, jt1Var2, c0034a);
                    rd7.d(jt1Var2, dVar, ox6VarC2);
                    m65.b(is7.a(errorState2.getIconId(), jt1Var2, 0), null, ir9.j(aVar2, 32.0f), 0L, jt1Var2, 440, 8);
                    b47.b(jt1Var2, ir9.d(aVar2, 16.0f));
                    String strF = nr1.f(jt1Var2, errorState2.getMessageResId());
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i6 = IntercomTheme.$stable;
                    mia.b(strF, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i6).getType03(), jt1Var2, 0, 0, 131070);
                    jt1 jt1Var3 = jt1Var2;
                    b47.b(jt1Var3, ir9.d(aVar2, 8.0f));
                    Integer additionalMessageResId = errorState2.getAdditionalMessageResId();
                    jt1Var3.K(1192536998);
                    if (additionalMessageResId == null) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        mia.b(nr1.f(jt1Var3, additionalMessageResId.intValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i6).getType04(), jt1Var2, 0, 0, 131070);
                        jt1Var3 = jt1Var2;
                    }
                    jt1Var3.B();
                    b47.b(jt1Var3, ir9.d(aVar, 16.0f));
                    jt1Var3.K(1192545587);
                    if (errorState2 instanceof ErrorState.WithCTA) {
                        ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState2;
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(nr1.f(jt1Var3, withCTA.getCtaResId()), null, null, withCTA.getOnCtaClick(), jt1Var3, 0, 6);
                    }
                    jt1Var2.B();
                    jt1Var2.I();
                    jt1Var2.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 12582912, 126);
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            v5a.a(ox6Var3.H(ir9.c), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(847888321, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.IntercomErrorScreenKt.IntercomErrorScreen.1
                public final void invoke(jt1 jt1Var2, int i5) {
                    ox6.a aVar;
                    if ((i5 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ErrorState errorState2 = errorState;
                    fl6 fl6VarD = dv0.d(di.a.e, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6.a aVar2 = ox6.a.t;
                    ox6 ox6VarC = it1.c(jt1Var2, aVar2);
                    bt1.c.getClass();
                    qr5.a aVar3 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar3);
                    } else {
                        jt1Var2.z();
                    }
                    bt1.a.c cVar = bt1.a.f;
                    rd7.d(jt1Var2, cVar, fl6VarD);
                    bt1.a.e eVar = bt1.a.e;
                    rd7.d(jt1Var2, eVar, kw7VarY);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar = bt1.a.g;
                    rd7.d(jt1Var2, bVar, numValueOf);
                    bt1.a.C0034a c0034a = bt1.a.h;
                    rd7.c(jt1Var2, c0034a);
                    bt1.a.d dVar = bt1.a.d;
                    rd7.d(jt1Var2, dVar, ox6VarC);
                    aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY2 = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar2);
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar3);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, cVar, aj1VarA);
                    rd7.d(jt1Var2, eVar, kw7VarY2);
                    g3.c(iHashCode2, jt1Var2, bVar, jt1Var2, c0034a);
                    rd7.d(jt1Var2, dVar, ox6VarC2);
                    m65.b(is7.a(errorState2.getIconId(), jt1Var2, 0), null, ir9.j(aVar2, 32.0f), 0L, jt1Var2, 440, 8);
                    b47.b(jt1Var2, ir9.d(aVar2, 16.0f));
                    String strF = nr1.f(jt1Var2, errorState2.getMessageResId());
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i6 = IntercomTheme.$stable;
                    mia.b(strF, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i6).getType03(), jt1Var2, 0, 0, 131070);
                    jt1 jt1Var3 = jt1Var2;
                    b47.b(jt1Var3, ir9.d(aVar2, 8.0f));
                    Integer additionalMessageResId = errorState2.getAdditionalMessageResId();
                    jt1Var3.K(1192536998);
                    if (additionalMessageResId == null) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        mia.b(nr1.f(jt1Var3, additionalMessageResId.intValue()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i6).getType04(), jt1Var2, 0, 0, 131070);
                        jt1Var3 = jt1Var2;
                    }
                    jt1Var3.B();
                    b47.b(jt1Var3, ir9.d(aVar, 16.0f));
                    jt1Var3.K(1192545587);
                    if (errorState2 instanceof ErrorState.WithCTA) {
                        ErrorState.WithCTA withCTA = (ErrorState.WithCTA) errorState2;
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(nr1.f(jt1Var3, withCTA.getCtaResId()), null, null, withCTA.getOnCtaClick(), jt1Var3, 0, 6);
                    }
                    jt1Var2.B();
                    jt1Var2.I();
                    jt1Var2.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 12582912, 126);
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: th5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomErrorScreenKt.IntercomErrorScreen$lambda$0(errorState, ox6Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomErrorScreen$lambda$0(ErrorState errorState, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        IntercomErrorScreen(errorState, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
