package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aa0;
import defpackage.ae8;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.c91;
import defpackage.ci4;
import defpackage.cka;
import defpackage.d73;
import defpackage.di;
import defpackage.ed7;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.i6a;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.k6a;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.u;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.ul4;
import defpackage.ux1;
import defpackage.we1;
import defpackage.xa2;
import defpackage.xj8;
import defpackage.xt;
import defpackage.xv;
import defpackage.yi1;
import defpackage.yz9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyTopBarComponentKt {
    public static final void NoTopBar(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1502798722);
        int i2 = 1;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            TopBarState.NoTopBarState noTopBarState = new TopBarState.NoTopBarState(true, ux1.a(null, null, 3, null), new ProgressBarState(false, 0.0f, 3, null));
            bj4VarO.K(-86743009);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new i6a();
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            SurveyTopBar(noTopBarState, (mh4) objF, null, bj4VarO, 48, 4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new xa2(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NoTopBar$lambda$15(int i, jt1 jt1Var, int i2) {
        NoTopBar(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SurveyAvatarBar(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1511683997);
        int i2 = 0;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Avatar avatarBuild = new Avatar.Builder().withInitials("VR").build();
            avatarBuild.getClass();
            TopBarState.SenderTopBarState senderTopBarState = new TopBarState.SenderTopBarState(avatarBuild, "Vinesh", SurveyComponentKt.getEmptyAppConfig(), false, ux1.a(null, null, 3, null), null, 32, null);
            bj4VarO.K(-263655356);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new ed7(1);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            SurveyTopBar(senderTopBarState, (mh4) objF, null, bj4VarO, 48, 4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new k6a(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyAvatarBar$lambda$12(int i, jt1 jt1Var, int i2) {
        SurveyAvatarBar(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x033c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0348  */
    /* JADX WARN: Code duplicated, block: B:107:0x0355  */
    /* JADX WARN: Code duplicated, block: B:109:0x035a  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x016b  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0200  */
    /* JADX WARN: Code duplicated, block: B:72:0x021e  */
    /* JADX WARN: Code duplicated, block: B:75:0x025d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0286  */
    /* JADX WARN: Code duplicated, block: B:79:0x028f  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:94:0x02fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:98:0x0312  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    public static final void SurveyTopBar(final TopBarState topBarState, final mh4<g2b> mh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        sp0.b bVar2;
        ny8 ny8VarA;
        ox6 ox6Var4;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        bj4 bj4Var;
        String str;
        ?? r0;
        ?? r4;
        bj4 bj4Var2;
        ProgressBarState progressBarState;
        final ox6 ox6Var5;
        yz9 yz9VarB;
        long jC;
        SurveyUiColors surveyUiColors;
        long jM404getButton0d7_KjU;
        boolean zJ;
        Object objF;
        Object obj;
        Object objB;
        TopBarState.SenderTopBarState senderTopBarState;
        CharSequence charSequence;
        ny8 ny8VarA2;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        bj4 bj4Var3;
        xj8 xj8VarW;
        topBarState.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-295801747);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(topBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                ox6 ox6VarC4 = ir9.c(eo7.k(aVar, 16.0f, 0.0f, 2), 1.0f);
                c30.f fVar = c30.f;
                bVar2 = di.a.k;
                ny8VarA = ly8.a(fVar, bVar2, bj4VarO, 54);
                ox6Var4 = ox6Var3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC4);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (topBarState instanceof TopBarState.SenderTopBarState) {
                    bj4VarO.K(359789399);
                    senderTopBarState = (TopBarState.SenderTopBarState) topBarState;
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_teammate_from_company).put("name", senderTopBarState.getSenderName()).put("company", senderTopBarState.getAppConfig().getName()).format();
                    ny8VarA2 = ly8.a(c30.a, bVar2, bj4VarO, 48);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    CircularAvatarComponentKt.m451CircularAvataraMcp0Q(senderTopBarState.getAvatar(), u7d.c(senderTopBarState.getAppConfig().getSecondaryColor()), 0.0f, bj4VarO, 0, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    r4 = 1;
                    str = null;
                    r0 = 0;
                    mia.b(charSequence.toString(), null, senderTopBarState.getSurveyUiColors().m407getOnBackground0d7_KjU(), cka.b(14), ob4.y, 0L, null, 0L, 2, false, 1, 0, null, null, bj4VarO, 1597440, 24960, 241578);
                    bj4 bj4Var4 = bj4VarO;
                    bj4Var4.U(true);
                    bj4Var4.U(false);
                    bj4Var2 = bj4Var4;
                } else {
                    bj4Var = bj4VarO;
                    str = null;
                    r0 = 0;
                    r4 = 1;
                    if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                        bj4Var.K(1535625002);
                        bj4Var.U(false);
                        u.b();
                        return;
                    } else {
                        bj4Var.K(360834719);
                        b47.b(bj4Var, ir9.n(aVar, 1.0f));
                        bj4Var.U(false);
                        bj4Var2 = bj4Var;
                    }
                }
                bj4Var2.K(1535664197);
                if (topBarState.getShowDismissButton()) {
                    m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, bj4Var2, r0), nr1.f(bj4Var2, R.string.intercom_dismiss), we1.c(aVar, r0, str, mh4Var, 15), topBarState.getSurveyUiColors().m407getOnBackground0d7_KjU(), bj4Var2, 8, 0);
                }
                bj4Var2.U(r0);
                bj4Var2.U(r4);
                bj4Var2.K(-1116807584);
                progressBarState = topBarState.getProgressBarState();
                bj4Var2.K(-1116806075);
                if (progressBarState.isVisible()) {
                    b47.b(bj4Var2, ir9.d(aVar, 16.0f));
                    yz9VarB = xt.b(progressBarState.getProgress(), xv.c(200, r0, null, 6), bj4Var2, 48);
                    if (ColorExtensionsKt.m839isDarkColor8_81llA(topBarState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                        jC = u7d.c(1728053247);
                    } else {
                        jC = u7d.c(1291845632);
                    }
                    long j = jC;
                    surveyUiColors = topBarState.getSurveyUiColors();
                    if (!uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU()) && ColorExtensionsKt.m841isWhite8_81llA(surveyUiColors.m403getBackground0d7_KjU())) {
                        jM404getButton0d7_KjU = u7d.d(3439329279L);
                    } else if (uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU()) || !ColorExtensionsKt.m837isBlack8_81llA(surveyUiColors.m403getBackground0d7_KjU())) {
                        jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                    } else {
                        jM404getButton0d7_KjU = u7d.d(2147483648L);
                    }
                    long j2 = jM404getButton0d7_KjU;
                    ox6 ox6VarC5 = ir9.c(aVar, 1.0f);
                    bj4Var2.K(1535712593);
                    zJ = bj4Var2.J(yz9VarB);
                    objF = bj4Var2.f();
                    obj = jt1.a.a;
                    if (zJ || objF == obj) {
                        objF = new ul4(r4, yz9VarB);
                        bj4Var2.C(objF);
                    }
                    mh4 mh4Var2 = (mh4) objF;
                    objB = aa0.b(bj4Var2, r0, 1535720630);
                    if (objB == obj) {
                        objB = new c91(2);
                        bj4Var2.C(objB);
                    }
                    bj4Var2.U(r0);
                    ae8.b(mh4Var2, ox6VarC5, j2, j, 2, 0.0f, (oh4) objB, bj4Var2, 1769520);
                }
                bj4Var2.U(r0);
                g2b g2bVar = g2b.a;
                bj4Var2.U(r0);
                bj4Var2.U(r4);
                ox6Var5 = ox6Var4;
                bj4Var3 = bj4Var2;
            } else {
                bj4VarO.u();
                ox6Var5 = ox6Var2;
                bj4Var3 = bj4VarO;
            }
            xj8VarW = bj4Var3.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: j6a
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return SurveyTopBarComponentKt.SurveyTopBar$lambda$9(topBarState, mh4Var, ox6Var5, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            ox6 ox6VarC6 = ir9.c(eo7.k(aVar, 16.0f, 0.0f, 2), 1.0f);
            c30.f fVar2 = c30.f;
            bVar2 = di.a.k;
            ny8VarA = ly8.a(fVar2, bVar2, bj4VarO, 54);
            ox6Var4 = ox6Var3;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC6);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            if (topBarState instanceof TopBarState.SenderTopBarState) {
                bj4VarO.K(359789399);
                senderTopBarState = (TopBarState.SenderTopBarState) topBarState;
                charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_teammate_from_company).put("name", senderTopBarState.getSenderName()).put("company", senderTopBarState.getAppConfig().getName()).format();
                ny8VarA2 = ly8.a(c30.a, bVar2, bj4VarO, 48);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                CircularAvatarComponentKt.m451CircularAvataraMcp0Q(senderTopBarState.getAvatar(), u7d.c(senderTopBarState.getAppConfig().getSecondaryColor()), 0.0f, bj4VarO, 0, 4);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                r4 = 1;
                str = null;
                r0 = 0;
                mia.b(charSequence.toString(), null, senderTopBarState.getSurveyUiColors().m407getOnBackground0d7_KjU(), cka.b(14), ob4.y, 0L, null, 0L, 2, false, 1, 0, null, null, bj4VarO, 1597440, 24960, 241578);
                bj4 bj4Var5 = bj4VarO;
                bj4Var5.U(true);
                bj4Var5.U(false);
                bj4Var2 = bj4Var5;
            } else {
                bj4Var = bj4VarO;
                str = null;
                r0 = 0;
                r4 = 1;
                if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                    bj4Var.K(1535625002);
                    bj4Var.U(false);
                    u.b();
                    return;
                } else {
                    bj4Var.K(360834719);
                    b47.b(bj4Var, ir9.n(aVar, 1.0f));
                    bj4Var.U(false);
                    bj4Var2 = bj4Var;
                }
            }
            bj4Var2.K(1535664197);
            if (topBarState.getShowDismissButton()) {
                m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, bj4Var2, r0), nr1.f(bj4Var2, R.string.intercom_dismiss), we1.c(aVar, r0, str, mh4Var, 15), topBarState.getSurveyUiColors().m407getOnBackground0d7_KjU(), bj4Var2, 8, 0);
            }
            bj4Var2.U(r0);
            bj4Var2.U(r4);
            bj4Var2.K(-1116807584);
            progressBarState = topBarState.getProgressBarState();
            bj4Var2.K(-1116806075);
            if (progressBarState.isVisible()) {
                b47.b(bj4Var2, ir9.d(aVar, 16.0f));
                yz9VarB = xt.b(progressBarState.getProgress(), xv.c(200, r0, null, 6), bj4Var2, 48);
                if (ColorExtensionsKt.m839isDarkColor8_81llA(topBarState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                    jC = u7d.c(1728053247);
                } else {
                    jC = u7d.c(1291845632);
                }
                long j3 = jC;
                surveyUiColors = topBarState.getSurveyUiColors();
                if (!uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU())) {
                    if (uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU())) {
                        jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                    } else {
                        jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                    }
                } else if (uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU())) {
                    jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                } else {
                    jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                }
                long j4 = jM404getButton0d7_KjU;
                ox6 ox6VarC7 = ir9.c(aVar, 1.0f);
                bj4Var2.K(1535712593);
                zJ = bj4Var2.J(yz9VarB);
                objF = bj4Var2.f();
                obj = jt1.a.a;
                if (zJ) {
                    objF = new ul4(r4, yz9VarB);
                    bj4Var2.C(objF);
                } else {
                    objF = new ul4(r4, yz9VarB);
                    bj4Var2.C(objF);
                }
                mh4 mh4Var3 = (mh4) objF;
                objB = aa0.b(bj4Var2, r0, 1535720630);
                if (objB == obj) {
                    objB = new c91(2);
                    bj4Var2.C(objB);
                }
                bj4Var2.U(r0);
                ae8.b(mh4Var3, ox6VarC7, j4, j3, 2, 0.0f, (oh4) objB, bj4Var2, 1769520);
            }
            bj4Var2.U(r0);
            g2b g2bVar2 = g2b.a;
            bj4Var2.U(r0);
            bj4Var2.U(r4);
            ox6Var5 = ox6Var4;
            bj4Var3 = bj4Var2;
        } else {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            ox6 ox6VarC8 = ir9.c(eo7.k(aVar, 16.0f, 0.0f, 2), 1.0f);
            c30.f fVar3 = c30.f;
            bVar2 = di.a.k;
            ny8VarA = ly8.a(fVar3, bVar2, bj4VarO, 54);
            ox6Var4 = ox6Var3;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC8);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            if (topBarState instanceof TopBarState.SenderTopBarState) {
                bj4VarO.K(359789399);
                senderTopBarState = (TopBarState.SenderTopBarState) topBarState;
                charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_teammate_from_company).put("name", senderTopBarState.getSenderName()).put("company", senderTopBarState.getAppConfig().getName()).format();
                ny8VarA2 = ly8.a(c30.a, bVar2, bj4VarO, 48);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                CircularAvatarComponentKt.m451CircularAvataraMcp0Q(senderTopBarState.getAvatar(), u7d.c(senderTopBarState.getAppConfig().getSecondaryColor()), 0.0f, bj4VarO, 0, 4);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                r4 = 1;
                str = null;
                r0 = 0;
                mia.b(charSequence.toString(), null, senderTopBarState.getSurveyUiColors().m407getOnBackground0d7_KjU(), cka.b(14), ob4.y, 0L, null, 0L, 2, false, 1, 0, null, null, bj4VarO, 1597440, 24960, 241578);
                bj4 bj4Var6 = bj4VarO;
                bj4Var6.U(true);
                bj4Var6.U(false);
                bj4Var2 = bj4Var6;
            } else {
                bj4Var = bj4VarO;
                str = null;
                r0 = 0;
                r4 = 1;
                if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                    bj4Var.K(1535625002);
                    bj4Var.U(false);
                    u.b();
                    return;
                } else {
                    bj4Var.K(360834719);
                    b47.b(bj4Var, ir9.n(aVar, 1.0f));
                    bj4Var.U(false);
                    bj4Var2 = bj4Var;
                }
            }
            bj4Var2.K(1535664197);
            if (topBarState.getShowDismissButton()) {
                m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, bj4Var2, r0), nr1.f(bj4Var2, R.string.intercom_dismiss), we1.c(aVar, r0, str, mh4Var, 15), topBarState.getSurveyUiColors().m407getOnBackground0d7_KjU(), bj4Var2, 8, 0);
            }
            bj4Var2.U(r0);
            bj4Var2.U(r4);
            bj4Var2.K(-1116807584);
            progressBarState = topBarState.getProgressBarState();
            bj4Var2.K(-1116806075);
            if (progressBarState.isVisible()) {
                b47.b(bj4Var2, ir9.d(aVar, 16.0f));
                yz9VarB = xt.b(progressBarState.getProgress(), xv.c(200, r0, null, 6), bj4Var2, 48);
                if (ColorExtensionsKt.m839isDarkColor8_81llA(topBarState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                    jC = u7d.c(1728053247);
                } else {
                    jC = u7d.c(1291845632);
                }
                long j5 = jC;
                surveyUiColors = topBarState.getSurveyUiColors();
                if (!uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU())) {
                    if (uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU())) {
                        jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                    } else {
                        jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                    }
                } else if (uh1.c(surveyUiColors.m403getBackground0d7_KjU(), surveyUiColors.m404getButton0d7_KjU())) {
                    jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                } else {
                    jM404getButton0d7_KjU = surveyUiColors.m404getButton0d7_KjU();
                }
                long j6 = jM404getButton0d7_KjU;
                ox6 ox6VarC9 = ir9.c(aVar, 1.0f);
                bj4Var2.K(1535712593);
                zJ = bj4Var2.J(yz9VarB);
                objF = bj4Var2.f();
                obj = jt1.a.a;
                if (zJ) {
                    objF = new ul4(r4, yz9VarB);
                    bj4Var2.C(objF);
                } else {
                    objF = new ul4(r4, yz9VarB);
                    bj4Var2.C(objF);
                }
                mh4 mh4Var4 = (mh4) objF;
                objB = aa0.b(bj4Var2, r0, 1535720630);
                if (objB == obj) {
                    objB = new c91(2);
                    bj4Var2.C(objB);
                }
                bj4Var2.U(r0);
                ae8.b(mh4Var4, ox6VarC9, j6, j5, 2, 0.0f, (oh4) objB, bj4Var2, 1769520);
            }
            bj4Var2.U(r0);
            g2b g2bVar3 = g2b.a;
            bj4Var2.U(r0);
            bj4Var2.U(r4);
            ox6Var5 = ox6Var4;
            bj4Var3 = bj4Var2;
        }
        xj8VarW = bj4Var3.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: j6a
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return SurveyTopBarComponentKt.SurveyTopBar$lambda$9(topBarState, mh4Var, ox6Var5, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SurveyTopBar$lambda$8$lambda$7$lambda$4$lambda$3(yz9 yz9Var) {
        return ((Number) yz9Var.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyTopBar$lambda$8$lambda$7$lambda$6$lambda$5(d73 d73Var) {
        d73Var.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyTopBar$lambda$9(TopBarState topBarState, mh4 mh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        SurveyTopBar(topBarState, mh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
