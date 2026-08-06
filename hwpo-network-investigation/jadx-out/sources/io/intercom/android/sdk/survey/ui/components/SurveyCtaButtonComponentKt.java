package io.intercom.android.sdk.survey.ui.components;

import defpackage.aj1;
import defpackage.ay8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cz0;
import defpackage.di;
import defpackage.dv0;
import defpackage.e6a;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.f6a;
import defpackage.fl6;
import defpackage.fs6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gs6;
import defpackage.gz3;
import defpackage.hf3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.js7;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.ko7;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.ux1;
import defpackage.v46;
import defpackage.vs0;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.yy0;
import defpackage.zx8;
import defpackage.zy0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyCtaButtonComponentKt {
    public static final void DarkButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-41399177);
        int i2 = 0;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6.a.t);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            SurveyCtaButtonComponent(null, "Submit", null, null, null, ux1.a(null, "#222222", 1, null), bj4VarO, 48, 29);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new e6a(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DarkButtonPreview$lambda$12(int i, jt1 jt1Var, int i2) {
        DarkButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void LightButtonPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1401512691);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6.a.t);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            SurveyCtaButtonComponent(null, "Submit", null, null, null, ux1.a(null, null, 3, null), bj4VarO, 48, 29);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: g6a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SurveyCtaButtonComponentKt.LightButtonPreview$lambda$10(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LightButtonPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        LightButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SecondaryCtaPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1826494403);
        int i2 = 0;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6.a.t);
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
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            SurveyCtaButtonComponent(null, "Submit", ws0.h(new SurveyState.Content.SecondaryCta("Open website", "https://www.google.com", true)), null, null, ux1.a(null, null, 3, null), bj4VarO, 48, 25);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new f6a(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SecondaryCtaPreview$lambda$14(int i, jt1 jt1Var, int i2) {
        SecondaryCtaPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0196  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x0255  */
    /* JADX WARN: Code duplicated, block: B:116:0x026d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0294  */
    /* JADX WARN: Code duplicated, block: B:120:0x0296  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x0302  */
    /* JADX WARN: Code duplicated, block: B:130:0x030c  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0162  */
    /* JADX WARN: Code duplicated, block: B:96:0x0166  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void SurveyCtaButtonComponent(ox6 ox6Var, final String str, List<SurveyState.Content.SecondaryCta> list, mh4<g2b> mh4Var, oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var, final SurveyUiColors surveyUiColors, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        List<SurveyState.Content.SecondaryCta> list2;
        int i4;
        mh4<g2b> mh4Var2;
        int i5;
        int i6;
        oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var2;
        int i7;
        int i8;
        ox6.a aVar;
        List<SurveyState.Content.SecondaryCta> list3;
        jt1.a.C0187a c0187a;
        int i9;
        mh4<g2b> mh4Var3;
        oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var3;
        vs0 vs0VarB;
        zx8 zx8VarB;
        ox6 ox6VarD;
        aj1 aj1VarA;
        jt1.a.C0187a c0187a2;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        cz0 cz0VarB;
        List<SurveyState.Content.SecondaryCta> list4;
        vs0 vs0Var;
        js7 js7Var;
        vs0 vs0Var2;
        boolean z;
        bj4 bj4Var;
        final oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var4;
        final mh4<g2b> mh4Var4;
        final ox6 ox6Var3;
        final List<SurveyState.Content.SecondaryCta> list5;
        jt1.a.C0187a c0187a3;
        boolean z2;
        boolean zJ;
        Object objF;
        jt1.a.C0187a c0187a4;
        int i10;
        Object objF2;
        Object objF3;
        xj8 xj8VarW;
        str.getClass();
        surveyUiColors.getClass();
        bj4 bj4VarO = jt1Var.o(-1455595547);
        int i11 = i2 & 1;
        int i12 = 2;
        if (i11 != 0) {
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
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                list2 = list;
                i3 |= bj4VarO.j(list2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.J(surveyUiColors)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i13 != 0) {
                            list3 = hf3.t;
                        } else {
                            list3 = list2;
                        }
                        c0187a = jt1.a.a;
                        i9 = 1;
                        if (i4 != 0) {
                            bj4VarO.K(49453589);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new v46(i9);
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            mh4Var3 = (mh4) objF3;
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(49456021);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new fs6(i12);
                                bj4VarO.C(objF2);
                            }
                            oh4Var3 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                        zx8VarB = ay8.b(8.0f);
                        ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        c0187a2 = c0187a;
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        cz0VarB = null;
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(1171126918);
                        for (final SurveyState.Content.SecondaryCta secondaryCta : list3) {
                            ko7 ko7Var = zy0.a;
                            ox6.a aVar3 = aVar;
                            c0187a3 = c0187a2;
                            bj4 bj4Var2 = bj4VarO;
                            List<SurveyState.Content.SecondaryCta> list6 = list3;
                            ox6 ox6Var4 = ox6Var2;
                            yy0 yy0VarA = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var2, 14);
                            bj4Var2.K(1934484526);
                            if ((57344 & i3) == 16384) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zJ = z2 | bj4Var2.J(secondaryCta);
                            objF = bj4Var2.f();
                            if (zJ) {
                                c0187a4 = c0187a3;
                            } else {
                                c0187a4 = c0187a3;
                                if (objF != c0187a4) {
                                    i10 = 1;
                                }
                                bj4Var2.U(false);
                                vs0 vs0Var3 = vs0VarB;
                                int i14 = i10;
                                zx8 zx8Var = zx8VarB;
                                jt1.a.C0187a c0187a5 = c0187a4;
                                ox6 ox6Var5 = ox6VarD;
                                jz0.a((mh4) objF, ox6Var5, false, zx8Var, yy0VarA, null, vs0Var3, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i15) {
                                        oy8Var.getClass();
                                        if ((i15 & 17) == 16 && jt1Var2.r()) {
                                            jt1Var2.u();
                                            return;
                                        }
                                        SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                                        kw7 kw7VarY = jt1Var2.y();
                                        ox6.a aVar4 = ox6.a.t;
                                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar4);
                                        bt1.c.getClass();
                                        qr5.a aVar5 = bt1.a.b;
                                        if (jt1Var2.s() == null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        jt1Var2.q();
                                        if (jt1Var2.l()) {
                                            jt1Var2.k(aVar5);
                                        } else {
                                            jt1Var2.z();
                                        }
                                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                        rd7.c(jt1Var2, bt1.a.h);
                                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                        jt1Var2.K(410193571);
                                        if (secondaryCta2.isExternalUrl()) {
                                            m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar4, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                        }
                                        jt1Var2.B();
                                        mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                        jt1Var2.I();
                                    }

                                    @Override // defpackage.ei4
                                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                        invoke(oy8Var, jt1Var2, num.intValue());
                                        return g2b.a;
                                    }
                                }, bj4Var2), bj4Var2, 805306416, 420);
                                b47.b(bj4Var2, ir9.d(aVar3, 8.0f));
                                i9 = i14;
                                aVar = aVar3;
                                bj4VarO = bj4Var2;
                                ox6VarD = ox6Var5;
                                ox6Var2 = ox6Var4;
                                list3 = list6;
                                zx8VarB = zx8Var;
                                c0187a2 = c0187a5;
                                vs0VarB = vs0Var3;
                            }
                            i10 = 1;
                            objF = new gs6(i10, oh4Var3, secondaryCta);
                            bj4Var2.C(objF);
                            bj4Var2.U(false);
                            vs0 vs0Var4 = vs0VarB;
                            int i15 = i10;
                            zx8 zx8Var2 = zx8VarB;
                            jt1.a.C0187a c0187a6 = c0187a4;
                            ox6 ox6Var6 = ox6VarD;
                            jz0.a((mh4) objF, ox6Var6, false, zx8Var2, yy0VarA, null, vs0Var4, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i16) {
                                    oy8Var.getClass();
                                    if ((i16 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
                                    ox6.a aVar4 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar4);
                                    bt1.c.getClass();
                                    qr5.a aVar5 = bt1.a.b;
                                    if (jt1Var2.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var2.q();
                                    if (jt1Var2.l()) {
                                        jt1Var2.k(aVar5);
                                    } else {
                                        jt1Var2.z();
                                    }
                                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                    rd7.c(jt1Var2, bt1.a.h);
                                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                    jt1Var2.K(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar4, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                    jt1Var2.B();
                                    mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                    jt1Var2.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var2), bj4Var2, 805306416, 420);
                            b47.b(bj4Var2, ir9.d(aVar3, 8.0f));
                            i9 = i15;
                            aVar = aVar3;
                            bj4VarO = bj4Var2;
                            ox6VarD = ox6Var6;
                            ox6Var2 = ox6Var4;
                            list3 = list6;
                            zx8VarB = zx8Var2;
                            c0187a2 = c0187a6;
                            vs0VarB = vs0Var4;
                        }
                        bj4 bj4Var3 = bj4VarO;
                        list4 = list3;
                        ox6 ox6Var7 = ox6Var2;
                        vs0Var = vs0VarB;
                        zx8 zx8Var3 = zx8VarB;
                        ox6 ox6Var8 = ox6VarD;
                        bj4Var3.U(false);
                        if (list4.isEmpty()) {
                            js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                        } else {
                            js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                        }
                        long j = ((uh1) js7Var.t).a;
                        final long j2 = ((uh1) js7Var.u).a;
                        if (list4.isEmpty()) {
                            vs0Var2 = vs0Var;
                        } else {
                            vs0Var2 = null;
                        }
                        bj4Var3.K(1171174724);
                        if (list4.isEmpty()) {
                            z = false;
                            cz0VarB = zy0.b(0);
                        } else {
                            z = false;
                        }
                        bj4Var3.U(z);
                        yy0 yy0VarA2 = zy0.a(j, 0L, 0L, 0L, bj4Var3, 14);
                        mh4<g2b> mh4Var5 = mh4Var3;
                        jz0.a(mh4Var5, ox6Var8, false, zx8Var3, yy0VarA2, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i16) {
                                oy8Var.getClass();
                                if ((i16 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(str, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                }
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var3), bj4Var3, ((i3 >> 9) & 14) | 805306416, 388);
                        bj4Var = bj4Var3;
                        bj4Var.U(true);
                        oh4Var4 = oh4Var3;
                        mh4Var4 = mh4Var5;
                        ox6Var3 = ox6Var7;
                        list5 = list4;
                    } else {
                        bj4VarO.u();
                        bj4Var = bj4VarO;
                        ox6Var3 = ox6Var2;
                        list5 = list2;
                        mh4Var4 = mh4Var2;
                        oh4Var4 = oh4Var2;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: h6a
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                oh4Var2 = oh4Var;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(surveyUiColors)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i9 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(49453589);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v46(i9);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        mh4Var3 = (mh4) objF3;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(49456021);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new fs6(i12);
                            bj4VarO.C(objF2);
                        }
                        oh4Var3 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                    zx8VarB = ay8.b(8.0f);
                    ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    c0187a2 = c0187a;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    cz0VarB = null;
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1171126918);
                    while (r23.hasNext()) {
                        ko7 ko7Var2 = zy0.a;
                        ox6.a aVar4 = aVar;
                        c0187a3 = c0187a2;
                        bj4 bj4Var4 = bj4VarO;
                        List<SurveyState.Content.SecondaryCta> list7 = list3;
                        ox6 ox6Var9 = ox6Var2;
                        yy0 yy0VarA3 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var4, 14);
                        bj4Var4.K(1934484526);
                        if ((57344 & i3) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zJ = z2 | bj4Var4.J(secondaryCta);
                        objF = bj4Var4.f();
                        if (zJ) {
                            c0187a4 = c0187a3;
                            if (objF != c0187a4) {
                                i10 = 1;
                            }
                            bj4Var4.U(false);
                            vs0 vs0Var5 = vs0VarB;
                            int i16 = i10;
                            zx8 zx8Var4 = zx8VarB;
                            jt1.a.C0187a c0187a7 = c0187a4;
                            ox6 ox6Var10 = ox6VarD;
                            jz0.a((mh4) objF, ox6Var10, false, zx8Var4, yy0VarA3, null, vs0Var5, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i17) {
                                    oy8Var.getClass();
                                    if ((i17 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
                                    ox6.a aVar5 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar5);
                                    bt1.c.getClass();
                                    qr5.a aVar6 = bt1.a.b;
                                    if (jt1Var2.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var2.q();
                                    if (jt1Var2.l()) {
                                        jt1Var2.k(aVar6);
                                    } else {
                                        jt1Var2.z();
                                    }
                                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                    rd7.c(jt1Var2, bt1.a.h);
                                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                    jt1Var2.K(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar5, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                    jt1Var2.B();
                                    mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                    jt1Var2.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var4), bj4Var4, 805306416, 420);
                            b47.b(bj4Var4, ir9.d(aVar4, 8.0f));
                            i9 = i16;
                            aVar = aVar4;
                            bj4VarO = bj4Var4;
                            ox6VarD = ox6Var10;
                            ox6Var2 = ox6Var9;
                            list3 = list7;
                            zx8VarB = zx8Var4;
                            c0187a2 = c0187a7;
                            vs0VarB = vs0Var5;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        i10 = 1;
                        objF = new gs6(i10, oh4Var3, secondaryCta);
                        bj4Var4.C(objF);
                        bj4Var4.U(false);
                        vs0 vs0Var6 = vs0VarB;
                        int i17 = i10;
                        zx8 zx8Var5 = zx8VarB;
                        jt1.a.C0187a c0187a8 = c0187a4;
                        ox6 ox6Var11 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var11, false, zx8Var5, yy0VarA3, null, vs0Var6, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i18) {
                                oy8Var.getClass();
                                if ((i18 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar5 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar5);
                                bt1.c.getClass();
                                qr5.a aVar6 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar6);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar5, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var4), bj4Var4, 805306416, 420);
                        b47.b(bj4Var4, ir9.d(aVar4, 8.0f));
                        i9 = i17;
                        aVar = aVar4;
                        bj4VarO = bj4Var4;
                        ox6VarD = ox6Var11;
                        ox6Var2 = ox6Var9;
                        list3 = list7;
                        zx8VarB = zx8Var5;
                        c0187a2 = c0187a8;
                        vs0VarB = vs0Var6;
                    }
                    bj4 bj4Var5 = bj4VarO;
                    list4 = list3;
                    ox6 ox6Var12 = ox6Var2;
                    vs0Var = vs0VarB;
                    zx8 zx8Var6 = zx8VarB;
                    ox6 ox6Var13 = ox6VarD;
                    bj4Var5.U(false);
                    if (list4.isEmpty()) {
                        js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                    } else {
                        js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                    }
                    long j3 = ((uh1) js7Var.t).a;
                    final long j4 = ((uh1) js7Var.u).a;
                    if (list4.isEmpty()) {
                        vs0Var2 = vs0Var;
                    } else {
                        vs0Var2 = null;
                    }
                    bj4Var5.K(1171174724);
                    if (list4.isEmpty()) {
                        z = false;
                        cz0VarB = zy0.b(0);
                    } else {
                        z = false;
                    }
                    bj4Var5.U(z);
                    yy0 yy0VarA4 = zy0.a(j3, 0L, 0L, 0L, bj4Var5, 14);
                    mh4<g2b> mh4Var6 = mh4Var3;
                    jz0.a(mh4Var6, ox6Var13, false, zx8Var6, yy0VarA4, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i18) {
                            oy8Var.getClass();
                            if ((i18 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var5), bj4Var5, ((i3 >> 9) & 14) | 805306416, 388);
                    bj4Var = bj4Var5;
                    bj4Var.U(true);
                    oh4Var4 = oh4Var3;
                    mh4Var4 = mh4Var6;
                    ox6Var3 = ox6Var12;
                    list5 = list4;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i9 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(49453589);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v46(i9);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        mh4Var3 = (mh4) objF3;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(49456021);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new fs6(i12);
                            bj4VarO.C(objF2);
                        }
                        oh4Var3 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                    zx8VarB = ay8.b(8.0f);
                    ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    c0187a2 = c0187a;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    cz0VarB = null;
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1171126918);
                    while (r23.hasNext()) {
                        ko7 ko7Var3 = zy0.a;
                        ox6.a aVar5 = aVar;
                        c0187a3 = c0187a2;
                        bj4 bj4Var6 = bj4VarO;
                        List<SurveyState.Content.SecondaryCta> list8 = list3;
                        ox6 ox6Var14 = ox6Var2;
                        yy0 yy0VarA5 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var6, 14);
                        bj4Var6.K(1934484526);
                        if ((57344 & i3) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zJ = z2 | bj4Var6.J(secondaryCta);
                        objF = bj4Var6.f();
                        if (zJ) {
                            c0187a4 = c0187a3;
                            if (objF != c0187a4) {
                                i10 = 1;
                            }
                            bj4Var6.U(false);
                            vs0 vs0Var7 = vs0VarB;
                            int i18 = i10;
                            zx8 zx8Var7 = zx8VarB;
                            jt1.a.C0187a c0187a9 = c0187a4;
                            ox6 ox6Var15 = ox6VarD;
                            jz0.a((mh4) objF, ox6Var15, false, zx8Var7, yy0VarA5, null, vs0Var7, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i19) {
                                    oy8Var.getClass();
                                    if ((i19 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
                                    ox6.a aVar6 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar6);
                                    bt1.c.getClass();
                                    qr5.a aVar7 = bt1.a.b;
                                    if (jt1Var2.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var2.q();
                                    if (jt1Var2.l()) {
                                        jt1Var2.k(aVar7);
                                    } else {
                                        jt1Var2.z();
                                    }
                                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                    rd7.c(jt1Var2, bt1.a.h);
                                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                    jt1Var2.K(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar6, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                    jt1Var2.B();
                                    mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                    jt1Var2.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var6), bj4Var6, 805306416, 420);
                            b47.b(bj4Var6, ir9.d(aVar5, 8.0f));
                            i9 = i18;
                            aVar = aVar5;
                            bj4VarO = bj4Var6;
                            ox6VarD = ox6Var15;
                            ox6Var2 = ox6Var14;
                            list3 = list8;
                            zx8VarB = zx8Var7;
                            c0187a2 = c0187a9;
                            vs0VarB = vs0Var7;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        i10 = 1;
                        objF = new gs6(i10, oh4Var3, secondaryCta);
                        bj4Var6.C(objF);
                        bj4Var6.U(false);
                        vs0 vs0Var8 = vs0VarB;
                        int i19 = i10;
                        zx8 zx8Var8 = zx8VarB;
                        jt1.a.C0187a c0187a10 = c0187a4;
                        ox6 ox6Var16 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var16, false, zx8Var8, yy0VarA5, null, vs0Var8, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i110) {
                                oy8Var.getClass();
                                if ((i110 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar6 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar6);
                                bt1.c.getClass();
                                qr5.a aVar7 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar7);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar6, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var6), bj4Var6, 805306416, 420);
                        b47.b(bj4Var6, ir9.d(aVar5, 8.0f));
                        i9 = i19;
                        aVar = aVar5;
                        bj4VarO = bj4Var6;
                        ox6VarD = ox6Var16;
                        ox6Var2 = ox6Var14;
                        list3 = list8;
                        zx8VarB = zx8Var8;
                        c0187a2 = c0187a10;
                        vs0VarB = vs0Var8;
                    }
                    bj4 bj4Var7 = bj4VarO;
                    list4 = list3;
                    ox6 ox6Var17 = ox6Var2;
                    vs0Var = vs0VarB;
                    zx8 zx8Var9 = zx8VarB;
                    ox6 ox6Var18 = ox6VarD;
                    bj4Var7.U(false);
                    if (list4.isEmpty()) {
                        js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                    } else {
                        js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                    }
                    long j5 = ((uh1) js7Var.t).a;
                    final long j6 = ((uh1) js7Var.u).a;
                    if (list4.isEmpty()) {
                        vs0Var2 = vs0Var;
                    } else {
                        vs0Var2 = null;
                    }
                    bj4Var7.K(1171174724);
                    if (list4.isEmpty()) {
                        z = false;
                        cz0VarB = zy0.b(0);
                    } else {
                        z = false;
                    }
                    bj4Var7.U(z);
                    yy0 yy0VarA6 = zy0.a(j5, 0L, 0L, 0L, bj4Var7, 14);
                    mh4<g2b> mh4Var7 = mh4Var3;
                    jz0.a(mh4Var7, ox6Var18, false, zx8Var9, yy0VarA6, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i110) {
                            oy8Var.getClass();
                            if ((i110 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str, null, j6, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var7), bj4Var7, ((i3 >> 9) & 14) | 805306416, 388);
                    bj4Var = bj4Var7;
                    bj4Var.U(true);
                    oh4Var4 = oh4Var3;
                    mh4Var4 = mh4Var7;
                    ox6Var3 = ox6Var17;
                    list5 = list4;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: h6a
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            mh4Var2 = mh4Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(surveyUiColors)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i9 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(49453589);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v46(i9);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        mh4Var3 = (mh4) objF3;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(49456021);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new fs6(i12);
                            bj4VarO.C(objF2);
                        }
                        oh4Var3 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                    zx8VarB = ay8.b(8.0f);
                    ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    c0187a2 = c0187a;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    cz0VarB = null;
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1171126918);
                    while (r23.hasNext()) {
                        ko7 ko7Var4 = zy0.a;
                        ox6.a aVar6 = aVar;
                        c0187a3 = c0187a2;
                        bj4 bj4Var8 = bj4VarO;
                        List<SurveyState.Content.SecondaryCta> list9 = list3;
                        ox6 ox6Var19 = ox6Var2;
                        yy0 yy0VarA7 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var8, 14);
                        bj4Var8.K(1934484526);
                        if ((57344 & i3) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zJ = z2 | bj4Var8.J(secondaryCta);
                        objF = bj4Var8.f();
                        if (zJ) {
                            c0187a4 = c0187a3;
                            if (objF != c0187a4) {
                                i10 = 1;
                            }
                            bj4Var8.U(false);
                            vs0 vs0Var9 = vs0VarB;
                            int i110 = i10;
                            zx8 zx8Var10 = zx8VarB;
                            jt1.a.C0187a c0187a11 = c0187a4;
                            ox6 ox6Var110 = ox6VarD;
                            jz0.a((mh4) objF, ox6Var110, false, zx8Var10, yy0VarA7, null, vs0Var9, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i111) {
                                    oy8Var.getClass();
                                    if ((i111 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
                                    ox6.a aVar7 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar7);
                                    bt1.c.getClass();
                                    qr5.a aVar8 = bt1.a.b;
                                    if (jt1Var2.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var2.q();
                                    if (jt1Var2.l()) {
                                        jt1Var2.k(aVar8);
                                    } else {
                                        jt1Var2.z();
                                    }
                                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                    rd7.c(jt1Var2, bt1.a.h);
                                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                    jt1Var2.K(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar7, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                    jt1Var2.B();
                                    mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                    jt1Var2.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var8), bj4Var8, 805306416, 420);
                            b47.b(bj4Var8, ir9.d(aVar6, 8.0f));
                            i9 = i110;
                            aVar = aVar6;
                            bj4VarO = bj4Var8;
                            ox6VarD = ox6Var110;
                            ox6Var2 = ox6Var19;
                            list3 = list9;
                            zx8VarB = zx8Var10;
                            c0187a2 = c0187a11;
                            vs0VarB = vs0Var9;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        i10 = 1;
                        objF = new gs6(i10, oh4Var3, secondaryCta);
                        bj4Var8.C(objF);
                        bj4Var8.U(false);
                        vs0 vs0Var10 = vs0VarB;
                        int i111 = i10;
                        zx8 zx8Var11 = zx8VarB;
                        jt1.a.C0187a c0187a12 = c0187a4;
                        ox6 ox6Var111 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var111, false, zx8Var11, yy0VarA7, null, vs0Var10, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i112) {
                                oy8Var.getClass();
                                if ((i112 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar7 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar7);
                                bt1.c.getClass();
                                qr5.a aVar8 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar8);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar7, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var8), bj4Var8, 805306416, 420);
                        b47.b(bj4Var8, ir9.d(aVar6, 8.0f));
                        i9 = i111;
                        aVar = aVar6;
                        bj4VarO = bj4Var8;
                        ox6VarD = ox6Var111;
                        ox6Var2 = ox6Var19;
                        list3 = list9;
                        zx8VarB = zx8Var11;
                        c0187a2 = c0187a12;
                        vs0VarB = vs0Var10;
                    }
                    bj4 bj4Var9 = bj4VarO;
                    list4 = list3;
                    ox6 ox6Var112 = ox6Var2;
                    vs0Var = vs0VarB;
                    zx8 zx8Var12 = zx8VarB;
                    ox6 ox6Var113 = ox6VarD;
                    bj4Var9.U(false);
                    if (list4.isEmpty()) {
                        js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                    } else {
                        js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                    }
                    long j7 = ((uh1) js7Var.t).a;
                    final long j8 = ((uh1) js7Var.u).a;
                    if (list4.isEmpty()) {
                        vs0Var2 = vs0Var;
                    } else {
                        vs0Var2 = null;
                    }
                    bj4Var9.K(1171174724);
                    if (list4.isEmpty()) {
                        z = false;
                        cz0VarB = zy0.b(0);
                    } else {
                        z = false;
                    }
                    bj4Var9.U(z);
                    yy0 yy0VarA8 = zy0.a(j7, 0L, 0L, 0L, bj4Var9, 14);
                    mh4<g2b> mh4Var8 = mh4Var3;
                    jz0.a(mh4Var8, ox6Var113, false, zx8Var12, yy0VarA8, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i112) {
                            oy8Var.getClass();
                            if ((i112 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str, null, j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var9), bj4Var9, ((i3 >> 9) & 14) | 805306416, 388);
                    bj4Var = bj4Var9;
                    bj4Var.U(true);
                    oh4Var4 = oh4Var3;
                    mh4Var4 = mh4Var8;
                    ox6Var3 = ox6Var112;
                    list5 = list4;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i9 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(49453589);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v46(i9);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        mh4Var3 = (mh4) objF3;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(49456021);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new fs6(i12);
                            bj4VarO.C(objF2);
                        }
                        oh4Var3 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                    zx8VarB = ay8.b(8.0f);
                    ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    c0187a2 = c0187a;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    cz0VarB = null;
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1171126918);
                    while (r23.hasNext()) {
                        ko7 ko7Var5 = zy0.a;
                        ox6.a aVar7 = aVar;
                        c0187a3 = c0187a2;
                        bj4 bj4Var10 = bj4VarO;
                        List<SurveyState.Content.SecondaryCta> list10 = list3;
                        ox6 ox6Var114 = ox6Var2;
                        yy0 yy0VarA9 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var10, 14);
                        bj4Var10.K(1934484526);
                        if ((57344 & i3) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zJ = z2 | bj4Var10.J(secondaryCta);
                        objF = bj4Var10.f();
                        if (zJ) {
                            c0187a4 = c0187a3;
                            if (objF != c0187a4) {
                                i10 = 1;
                            }
                            bj4Var10.U(false);
                            vs0 vs0Var11 = vs0VarB;
                            int i112 = i10;
                            zx8 zx8Var13 = zx8VarB;
                            jt1.a.C0187a c0187a13 = c0187a4;
                            ox6 ox6Var115 = ox6VarD;
                            jz0.a((mh4) objF, ox6Var115, false, zx8Var13, yy0VarA9, null, vs0Var11, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i113) {
                                    oy8Var.getClass();
                                    if ((i113 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
                                    ox6.a aVar8 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar8);
                                    bt1.c.getClass();
                                    qr5.a aVar9 = bt1.a.b;
                                    if (jt1Var2.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var2.q();
                                    if (jt1Var2.l()) {
                                        jt1Var2.k(aVar9);
                                    } else {
                                        jt1Var2.z();
                                    }
                                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                    rd7.c(jt1Var2, bt1.a.h);
                                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                    jt1Var2.K(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar8, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                    jt1Var2.B();
                                    mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                    jt1Var2.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var10), bj4Var10, 805306416, 420);
                            b47.b(bj4Var10, ir9.d(aVar7, 8.0f));
                            i9 = i112;
                            aVar = aVar7;
                            bj4VarO = bj4Var10;
                            ox6VarD = ox6Var115;
                            ox6Var2 = ox6Var114;
                            list3 = list10;
                            zx8VarB = zx8Var13;
                            c0187a2 = c0187a13;
                            vs0VarB = vs0Var11;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        i10 = 1;
                        objF = new gs6(i10, oh4Var3, secondaryCta);
                        bj4Var10.C(objF);
                        bj4Var10.U(false);
                        vs0 vs0Var12 = vs0VarB;
                        int i113 = i10;
                        zx8 zx8Var14 = zx8VarB;
                        jt1.a.C0187a c0187a14 = c0187a4;
                        ox6 ox6Var116 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var116, false, zx8Var14, yy0VarA9, null, vs0Var12, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i114) {
                                oy8Var.getClass();
                                if ((i114 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar8 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar8);
                                bt1.c.getClass();
                                qr5.a aVar9 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar9);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar8, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var10), bj4Var10, 805306416, 420);
                        b47.b(bj4Var10, ir9.d(aVar7, 8.0f));
                        i9 = i113;
                        aVar = aVar7;
                        bj4VarO = bj4Var10;
                        ox6VarD = ox6Var116;
                        ox6Var2 = ox6Var114;
                        list3 = list10;
                        zx8VarB = zx8Var14;
                        c0187a2 = c0187a14;
                        vs0VarB = vs0Var12;
                    }
                    bj4 bj4Var11 = bj4VarO;
                    list4 = list3;
                    ox6 ox6Var117 = ox6Var2;
                    vs0Var = vs0VarB;
                    zx8 zx8Var15 = zx8VarB;
                    ox6 ox6Var118 = ox6VarD;
                    bj4Var11.U(false);
                    if (list4.isEmpty()) {
                        js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                    } else {
                        js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                    }
                    long j9 = ((uh1) js7Var.t).a;
                    final long j10 = ((uh1) js7Var.u).a;
                    if (list4.isEmpty()) {
                        vs0Var2 = vs0Var;
                    } else {
                        vs0Var2 = null;
                    }
                    bj4Var11.K(1171174724);
                    if (list4.isEmpty()) {
                        z = false;
                        cz0VarB = zy0.b(0);
                    } else {
                        z = false;
                    }
                    bj4Var11.U(z);
                    yy0 yy0VarA10 = zy0.a(j9, 0L, 0L, 0L, bj4Var11, 14);
                    mh4<g2b> mh4Var9 = mh4Var3;
                    jz0.a(mh4Var9, ox6Var118, false, zx8Var15, yy0VarA10, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i114) {
                            oy8Var.getClass();
                            if ((i114 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str, null, j10, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var11), bj4Var11, ((i3 >> 9) & 14) | 805306416, 388);
                    bj4Var = bj4Var11;
                    bj4Var.U(true);
                    oh4Var4 = oh4Var3;
                    mh4Var4 = mh4Var9;
                    ox6Var3 = ox6Var117;
                    list5 = list4;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: h6a
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var2 = oh4Var;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(surveyUiColors)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i9 = 1;
                if (i4 != 0) {
                    bj4VarO.K(49453589);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v46(i9);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    mh4Var3 = (mh4) objF3;
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    bj4VarO.K(49456021);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i12);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                zx8VarB = ay8.b(8.0f);
                ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                c0187a2 = c0187a;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                cz0VarB = null;
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1171126918);
                while (r23.hasNext()) {
                    ko7 ko7Var6 = zy0.a;
                    ox6.a aVar8 = aVar;
                    c0187a3 = c0187a2;
                    bj4 bj4Var12 = bj4VarO;
                    List<SurveyState.Content.SecondaryCta> list11 = list3;
                    ox6 ox6Var119 = ox6Var2;
                    yy0 yy0VarA11 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var12, 14);
                    bj4Var12.K(1934484526);
                    if ((57344 & i3) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zJ = z2 | bj4Var12.J(secondaryCta);
                    objF = bj4Var12.f();
                    if (zJ) {
                        c0187a4 = c0187a3;
                        if (objF != c0187a4) {
                            i10 = 1;
                        }
                        bj4Var12.U(false);
                        vs0 vs0Var13 = vs0VarB;
                        int i114 = i10;
                        zx8 zx8Var16 = zx8VarB;
                        jt1.a.C0187a c0187a15 = c0187a4;
                        ox6 ox6Var1110 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var1110, false, zx8Var16, yy0VarA11, null, vs0Var13, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i115) {
                                oy8Var.getClass();
                                if ((i115 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar9 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar9);
                                bt1.c.getClass();
                                qr5.a aVar10 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar10);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar9, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var12), bj4Var12, 805306416, 420);
                        b47.b(bj4Var12, ir9.d(aVar8, 8.0f));
                        i9 = i114;
                        aVar = aVar8;
                        bj4VarO = bj4Var12;
                        ox6VarD = ox6Var1110;
                        ox6Var2 = ox6Var119;
                        list3 = list11;
                        zx8VarB = zx8Var16;
                        c0187a2 = c0187a15;
                        vs0VarB = vs0Var13;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    i10 = 1;
                    objF = new gs6(i10, oh4Var3, secondaryCta);
                    bj4Var12.C(objF);
                    bj4Var12.U(false);
                    vs0 vs0Var14 = vs0VarB;
                    int i115 = i10;
                    zx8 zx8Var17 = zx8VarB;
                    jt1.a.C0187a c0187a16 = c0187a4;
                    ox6 ox6Var1111 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var1111, false, zx8Var17, yy0VarA11, null, vs0Var14, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i116) {
                            oy8Var.getClass();
                            if ((i116 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar9 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar9);
                            bt1.c.getClass();
                            qr5.a aVar10 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar10);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar9, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var12), bj4Var12, 805306416, 420);
                    b47.b(bj4Var12, ir9.d(aVar8, 8.0f));
                    i9 = i115;
                    aVar = aVar8;
                    bj4VarO = bj4Var12;
                    ox6VarD = ox6Var1111;
                    ox6Var2 = ox6Var119;
                    list3 = list11;
                    zx8VarB = zx8Var17;
                    c0187a2 = c0187a16;
                    vs0VarB = vs0Var14;
                }
                bj4 bj4Var13 = bj4VarO;
                list4 = list3;
                ox6 ox6Var1112 = ox6Var2;
                vs0Var = vs0VarB;
                zx8 zx8Var18 = zx8VarB;
                ox6 ox6Var1113 = ox6VarD;
                bj4Var13.U(false);
                if (list4.isEmpty()) {
                    js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                } else {
                    js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                }
                long j11 = ((uh1) js7Var.t).a;
                final long j12 = ((uh1) js7Var.u).a;
                if (list4.isEmpty()) {
                    vs0Var2 = vs0Var;
                } else {
                    vs0Var2 = null;
                }
                bj4Var13.K(1171174724);
                if (list4.isEmpty()) {
                    z = false;
                    cz0VarB = zy0.b(0);
                } else {
                    z = false;
                }
                bj4Var13.U(z);
                yy0 yy0VarA12 = zy0.a(j11, 0L, 0L, 0L, bj4Var13, 14);
                mh4<g2b> mh4Var10 = mh4Var3;
                jz0.a(mh4Var10, ox6Var1113, false, zx8Var18, yy0VarA12, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i116) {
                        oy8Var.getClass();
                        if ((i116 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str, null, j12, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var13), bj4Var13, ((i3 >> 9) & 14) | 805306416, 388);
                bj4Var = bj4Var13;
                bj4Var.U(true);
                oh4Var4 = oh4Var3;
                mh4Var4 = mh4Var10;
                ox6Var3 = ox6Var1112;
                list5 = list4;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i9 = 1;
                if (i4 != 0) {
                    bj4VarO.K(49453589);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v46(i9);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    mh4Var3 = (mh4) objF3;
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    bj4VarO.K(49456021);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i12);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                zx8VarB = ay8.b(8.0f);
                ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                c0187a2 = c0187a;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                cz0VarB = null;
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1171126918);
                while (r23.hasNext()) {
                    ko7 ko7Var7 = zy0.a;
                    ox6.a aVar9 = aVar;
                    c0187a3 = c0187a2;
                    bj4 bj4Var14 = bj4VarO;
                    List<SurveyState.Content.SecondaryCta> list12 = list3;
                    ox6 ox6Var1114 = ox6Var2;
                    yy0 yy0VarA13 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var14, 14);
                    bj4Var14.K(1934484526);
                    if ((57344 & i3) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zJ = z2 | bj4Var14.J(secondaryCta);
                    objF = bj4Var14.f();
                    if (zJ) {
                        c0187a4 = c0187a3;
                        if (objF != c0187a4) {
                            i10 = 1;
                        }
                        bj4Var14.U(false);
                        vs0 vs0Var15 = vs0VarB;
                        int i116 = i10;
                        zx8 zx8Var19 = zx8VarB;
                        jt1.a.C0187a c0187a17 = c0187a4;
                        ox6 ox6Var1115 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var1115, false, zx8Var19, yy0VarA13, null, vs0Var15, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i117) {
                                oy8Var.getClass();
                                if ((i117 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar10 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar10);
                                bt1.c.getClass();
                                qr5.a aVar11 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar11);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar10, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var14), bj4Var14, 805306416, 420);
                        b47.b(bj4Var14, ir9.d(aVar9, 8.0f));
                        i9 = i116;
                        aVar = aVar9;
                        bj4VarO = bj4Var14;
                        ox6VarD = ox6Var1115;
                        ox6Var2 = ox6Var1114;
                        list3 = list12;
                        zx8VarB = zx8Var19;
                        c0187a2 = c0187a17;
                        vs0VarB = vs0Var15;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    i10 = 1;
                    objF = new gs6(i10, oh4Var3, secondaryCta);
                    bj4Var14.C(objF);
                    bj4Var14.U(false);
                    vs0 vs0Var16 = vs0VarB;
                    int i117 = i10;
                    zx8 zx8Var110 = zx8VarB;
                    jt1.a.C0187a c0187a18 = c0187a4;
                    ox6 ox6Var1116 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var1116, false, zx8Var110, yy0VarA13, null, vs0Var16, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i118) {
                            oy8Var.getClass();
                            if ((i118 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar10 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar10);
                            bt1.c.getClass();
                            qr5.a aVar11 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar11);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar10, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var14), bj4Var14, 805306416, 420);
                    b47.b(bj4Var14, ir9.d(aVar9, 8.0f));
                    i9 = i117;
                    aVar = aVar9;
                    bj4VarO = bj4Var14;
                    ox6VarD = ox6Var1116;
                    ox6Var2 = ox6Var1114;
                    list3 = list12;
                    zx8VarB = zx8Var110;
                    c0187a2 = c0187a18;
                    vs0VarB = vs0Var16;
                }
                bj4 bj4Var15 = bj4VarO;
                list4 = list3;
                ox6 ox6Var1117 = ox6Var2;
                vs0Var = vs0VarB;
                zx8 zx8Var111 = zx8VarB;
                ox6 ox6Var1118 = ox6VarD;
                bj4Var15.U(false);
                if (list4.isEmpty()) {
                    js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                } else {
                    js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                }
                long j13 = ((uh1) js7Var.t).a;
                final long j14 = ((uh1) js7Var.u).a;
                if (list4.isEmpty()) {
                    vs0Var2 = vs0Var;
                } else {
                    vs0Var2 = null;
                }
                bj4Var15.K(1171174724);
                if (list4.isEmpty()) {
                    z = false;
                    cz0VarB = zy0.b(0);
                } else {
                    z = false;
                }
                bj4Var15.U(z);
                yy0 yy0VarA14 = zy0.a(j13, 0L, 0L, 0L, bj4Var15, 14);
                mh4<g2b> mh4Var11 = mh4Var3;
                jz0.a(mh4Var11, ox6Var1118, false, zx8Var111, yy0VarA14, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i118) {
                        oy8Var.getClass();
                        if ((i118 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str, null, j14, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var15), bj4Var15, ((i3 >> 9) & 14) | 805306416, 388);
                bj4Var = bj4Var15;
                bj4Var.U(true);
                oh4Var4 = oh4Var3;
                mh4Var4 = mh4Var11;
                ox6Var3 = ox6Var1117;
                list5 = list4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: h6a
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        list2 = list;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                mh4Var2 = mh4Var;
                if (bj4VarO.j(mh4Var2)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(surveyUiColors)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i9 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(49453589);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v46(i9);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        mh4Var3 = (mh4) objF3;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(49456021);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new fs6(i12);
                            bj4VarO.C(objF2);
                        }
                        oh4Var3 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                    zx8VarB = ay8.b(8.0f);
                    ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    c0187a2 = c0187a;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    cz0VarB = null;
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1171126918);
                    while (r23.hasNext()) {
                        ko7 ko7Var8 = zy0.a;
                        ox6.a aVar10 = aVar;
                        c0187a3 = c0187a2;
                        bj4 bj4Var16 = bj4VarO;
                        List<SurveyState.Content.SecondaryCta> list13 = list3;
                        ox6 ox6Var1119 = ox6Var2;
                        yy0 yy0VarA15 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var16, 14);
                        bj4Var16.K(1934484526);
                        if ((57344 & i3) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zJ = z2 | bj4Var16.J(secondaryCta);
                        objF = bj4Var16.f();
                        if (zJ) {
                            c0187a4 = c0187a3;
                            if (objF != c0187a4) {
                                i10 = 1;
                            }
                            bj4Var16.U(false);
                            vs0 vs0Var17 = vs0VarB;
                            int i118 = i10;
                            zx8 zx8Var112 = zx8VarB;
                            jt1.a.C0187a c0187a19 = c0187a4;
                            ox6 ox6Var11110 = ox6VarD;
                            jz0.a((mh4) objF, ox6Var11110, false, zx8Var112, yy0VarA15, null, vs0Var17, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i119) {
                                    oy8Var.getClass();
                                    if ((i119 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
                                    ox6.a aVar11 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar11);
                                    bt1.c.getClass();
                                    qr5.a aVar12 = bt1.a.b;
                                    if (jt1Var2.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var2.q();
                                    if (jt1Var2.l()) {
                                        jt1Var2.k(aVar12);
                                    } else {
                                        jt1Var2.z();
                                    }
                                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                    rd7.c(jt1Var2, bt1.a.h);
                                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                    jt1Var2.K(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar11, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                    jt1Var2.B();
                                    mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                    jt1Var2.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var16), bj4Var16, 805306416, 420);
                            b47.b(bj4Var16, ir9.d(aVar10, 8.0f));
                            i9 = i118;
                            aVar = aVar10;
                            bj4VarO = bj4Var16;
                            ox6VarD = ox6Var11110;
                            ox6Var2 = ox6Var1119;
                            list3 = list13;
                            zx8VarB = zx8Var112;
                            c0187a2 = c0187a19;
                            vs0VarB = vs0Var17;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        i10 = 1;
                        objF = new gs6(i10, oh4Var3, secondaryCta);
                        bj4Var16.C(objF);
                        bj4Var16.U(false);
                        vs0 vs0Var18 = vs0VarB;
                        int i119 = i10;
                        zx8 zx8Var113 = zx8VarB;
                        jt1.a.C0187a c0187a110 = c0187a4;
                        ox6 ox6Var11111 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var11111, false, zx8Var113, yy0VarA15, null, vs0Var18, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1110) {
                                oy8Var.getClass();
                                if ((i1110 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar11 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar11);
                                bt1.c.getClass();
                                qr5.a aVar12 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar12);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar11, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var16), bj4Var16, 805306416, 420);
                        b47.b(bj4Var16, ir9.d(aVar10, 8.0f));
                        i9 = i119;
                        aVar = aVar10;
                        bj4VarO = bj4Var16;
                        ox6VarD = ox6Var11111;
                        ox6Var2 = ox6Var1119;
                        list3 = list13;
                        zx8VarB = zx8Var113;
                        c0187a2 = c0187a110;
                        vs0VarB = vs0Var18;
                    }
                    bj4 bj4Var17 = bj4VarO;
                    list4 = list3;
                    ox6 ox6Var11112 = ox6Var2;
                    vs0Var = vs0VarB;
                    zx8 zx8Var114 = zx8VarB;
                    ox6 ox6Var11113 = ox6VarD;
                    bj4Var17.U(false);
                    if (list4.isEmpty()) {
                        js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                    } else {
                        js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                    }
                    long j15 = ((uh1) js7Var.t).a;
                    final long j16 = ((uh1) js7Var.u).a;
                    if (list4.isEmpty()) {
                        vs0Var2 = vs0Var;
                    } else {
                        vs0Var2 = null;
                    }
                    bj4Var17.K(1171174724);
                    if (list4.isEmpty()) {
                        z = false;
                        cz0VarB = zy0.b(0);
                    } else {
                        z = false;
                    }
                    bj4Var17.U(z);
                    yy0 yy0VarA16 = zy0.a(j15, 0L, 0L, 0L, bj4Var17, 14);
                    mh4<g2b> mh4Var12 = mh4Var3;
                    jz0.a(mh4Var12, ox6Var11113, false, zx8Var114, yy0VarA16, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1110) {
                            oy8Var.getClass();
                            if ((i1110 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str, null, j16, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var17), bj4Var17, ((i3 >> 9) & 14) | 805306416, 388);
                    bj4Var = bj4Var17;
                    bj4Var.U(true);
                    oh4Var4 = oh4Var3;
                    mh4Var4 = mh4Var12;
                    ox6Var3 = ox6Var11112;
                    list5 = list4;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i13 != 0) {
                        list3 = hf3.t;
                    } else {
                        list3 = list2;
                    }
                    c0187a = jt1.a.a;
                    i9 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(49453589);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new v46(i9);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        mh4Var3 = (mh4) objF3;
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(49456021);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new fs6(i12);
                            bj4VarO.C(objF2);
                        }
                        oh4Var3 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                    zx8VarB = ay8.b(8.0f);
                    ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    c0187a2 = c0187a;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    cz0VarB = null;
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(1171126918);
                    while (r23.hasNext()) {
                        ko7 ko7Var9 = zy0.a;
                        ox6.a aVar11 = aVar;
                        c0187a3 = c0187a2;
                        bj4 bj4Var18 = bj4VarO;
                        List<SurveyState.Content.SecondaryCta> list14 = list3;
                        ox6 ox6Var11114 = ox6Var2;
                        yy0 yy0VarA17 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var18, 14);
                        bj4Var18.K(1934484526);
                        if ((57344 & i3) == 16384) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zJ = z2 | bj4Var18.J(secondaryCta);
                        objF = bj4Var18.f();
                        if (zJ) {
                            c0187a4 = c0187a3;
                            if (objF != c0187a4) {
                                i10 = 1;
                            }
                            bj4Var18.U(false);
                            vs0 vs0Var19 = vs0VarB;
                            int i1110 = i10;
                            zx8 zx8Var115 = zx8VarB;
                            jt1.a.C0187a c0187a111 = c0187a4;
                            ox6 ox6Var11115 = ox6VarD;
                            jz0.a((mh4) objF, ox6Var11115, false, zx8Var115, yy0VarA17, null, vs0Var19, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111) {
                                    oy8Var.getClass();
                                    if ((i1111 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
                                    ox6.a aVar12 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar12);
                                    bt1.c.getClass();
                                    qr5.a aVar13 = bt1.a.b;
                                    if (jt1Var2.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var2.q();
                                    if (jt1Var2.l()) {
                                        jt1Var2.k(aVar13);
                                    } else {
                                        jt1Var2.z();
                                    }
                                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                    rd7.c(jt1Var2, bt1.a.h);
                                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                    jt1Var2.K(410193571);
                                    if (secondaryCta2.isExternalUrl()) {
                                        m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar12, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                    }
                                    jt1Var2.B();
                                    mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                    jt1Var2.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4Var18), bj4Var18, 805306416, 420);
                            b47.b(bj4Var18, ir9.d(aVar11, 8.0f));
                            i9 = i1110;
                            aVar = aVar11;
                            bj4VarO = bj4Var18;
                            ox6VarD = ox6Var11115;
                            ox6Var2 = ox6Var11114;
                            list3 = list14;
                            zx8VarB = zx8Var115;
                            c0187a2 = c0187a111;
                            vs0VarB = vs0Var19;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        i10 = 1;
                        objF = new gs6(i10, oh4Var3, secondaryCta);
                        bj4Var18.C(objF);
                        bj4Var18.U(false);
                        vs0 vs0Var110 = vs0VarB;
                        int i1111 = i10;
                        zx8 zx8Var116 = zx8VarB;
                        jt1.a.C0187a c0187a112 = c0187a4;
                        ox6 ox6Var11116 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var11116, false, zx8Var116, yy0VarA17, null, vs0Var110, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1112) {
                                oy8Var.getClass();
                                if ((i1112 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar12 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar12);
                                bt1.c.getClass();
                                qr5.a aVar13 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar13);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar12, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var18), bj4Var18, 805306416, 420);
                        b47.b(bj4Var18, ir9.d(aVar11, 8.0f));
                        i9 = i1111;
                        aVar = aVar11;
                        bj4VarO = bj4Var18;
                        ox6VarD = ox6Var11116;
                        ox6Var2 = ox6Var11114;
                        list3 = list14;
                        zx8VarB = zx8Var116;
                        c0187a2 = c0187a112;
                        vs0VarB = vs0Var110;
                    }
                    bj4 bj4Var19 = bj4VarO;
                    list4 = list3;
                    ox6 ox6Var11117 = ox6Var2;
                    vs0Var = vs0VarB;
                    zx8 zx8Var117 = zx8VarB;
                    ox6 ox6Var11118 = ox6VarD;
                    bj4Var19.U(false);
                    if (list4.isEmpty()) {
                        js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                    } else {
                        js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                    }
                    long j17 = ((uh1) js7Var.t).a;
                    final long j18 = ((uh1) js7Var.u).a;
                    if (list4.isEmpty()) {
                        vs0Var2 = vs0Var;
                    } else {
                        vs0Var2 = null;
                    }
                    bj4Var19.K(1171174724);
                    if (list4.isEmpty()) {
                        z = false;
                        cz0VarB = zy0.b(0);
                    } else {
                        z = false;
                    }
                    bj4Var19.U(z);
                    yy0 yy0VarA18 = zy0.a(j17, 0L, 0L, 0L, bj4Var19, 14);
                    mh4<g2b> mh4Var13 = mh4Var3;
                    jz0.a(mh4Var13, ox6Var11118, false, zx8Var117, yy0VarA18, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1112) {
                            oy8Var.getClass();
                            if ((i1112 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(str, null, j18, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var19), bj4Var19, ((i3 >> 9) & 14) | 805306416, 388);
                    bj4Var = bj4Var19;
                    bj4Var.U(true);
                    oh4Var4 = oh4Var3;
                    mh4Var4 = mh4Var13;
                    ox6Var3 = ox6Var11117;
                    list5 = list4;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: h6a
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var2 = oh4Var;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(surveyUiColors)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i9 = 1;
                if (i4 != 0) {
                    bj4VarO.K(49453589);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v46(i9);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    mh4Var3 = (mh4) objF3;
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    bj4VarO.K(49456021);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i12);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                zx8VarB = ay8.b(8.0f);
                ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                c0187a2 = c0187a;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                cz0VarB = null;
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1171126918);
                while (r23.hasNext()) {
                    ko7 ko7Var10 = zy0.a;
                    ox6.a aVar12 = aVar;
                    c0187a3 = c0187a2;
                    bj4 bj4Var110 = bj4VarO;
                    List<SurveyState.Content.SecondaryCta> list15 = list3;
                    ox6 ox6Var11119 = ox6Var2;
                    yy0 yy0VarA19 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var110, 14);
                    bj4Var110.K(1934484526);
                    if ((57344 & i3) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zJ = z2 | bj4Var110.J(secondaryCta);
                    objF = bj4Var110.f();
                    if (zJ) {
                        c0187a4 = c0187a3;
                        if (objF != c0187a4) {
                            i10 = 1;
                        }
                        bj4Var110.U(false);
                        vs0 vs0Var111 = vs0VarB;
                        int i1112 = i10;
                        zx8 zx8Var118 = zx8VarB;
                        jt1.a.C0187a c0187a113 = c0187a4;
                        ox6 ox6Var111110 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var111110, false, zx8Var118, yy0VarA19, null, vs0Var111, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1113) {
                                oy8Var.getClass();
                                if ((i1113 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar13 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar13);
                                bt1.c.getClass();
                                qr5.a aVar14 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar14);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar13, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var110), bj4Var110, 805306416, 420);
                        b47.b(bj4Var110, ir9.d(aVar12, 8.0f));
                        i9 = i1112;
                        aVar = aVar12;
                        bj4VarO = bj4Var110;
                        ox6VarD = ox6Var111110;
                        ox6Var2 = ox6Var11119;
                        list3 = list15;
                        zx8VarB = zx8Var118;
                        c0187a2 = c0187a113;
                        vs0VarB = vs0Var111;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    i10 = 1;
                    objF = new gs6(i10, oh4Var3, secondaryCta);
                    bj4Var110.C(objF);
                    bj4Var110.U(false);
                    vs0 vs0Var112 = vs0VarB;
                    int i1113 = i10;
                    zx8 zx8Var119 = zx8VarB;
                    jt1.a.C0187a c0187a114 = c0187a4;
                    ox6 ox6Var111111 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var111111, false, zx8Var119, yy0VarA19, null, vs0Var112, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1114) {
                            oy8Var.getClass();
                            if ((i1114 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar13 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar13);
                            bt1.c.getClass();
                            qr5.a aVar14 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar14);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar13, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var110), bj4Var110, 805306416, 420);
                    b47.b(bj4Var110, ir9.d(aVar12, 8.0f));
                    i9 = i1113;
                    aVar = aVar12;
                    bj4VarO = bj4Var110;
                    ox6VarD = ox6Var111111;
                    ox6Var2 = ox6Var11119;
                    list3 = list15;
                    zx8VarB = zx8Var119;
                    c0187a2 = c0187a114;
                    vs0VarB = vs0Var112;
                }
                bj4 bj4Var111 = bj4VarO;
                list4 = list3;
                ox6 ox6Var111112 = ox6Var2;
                vs0Var = vs0VarB;
                zx8 zx8Var1110 = zx8VarB;
                ox6 ox6Var111113 = ox6VarD;
                bj4Var111.U(false);
                if (list4.isEmpty()) {
                    js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                } else {
                    js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                }
                long j19 = ((uh1) js7Var.t).a;
                final long j110 = ((uh1) js7Var.u).a;
                if (list4.isEmpty()) {
                    vs0Var2 = vs0Var;
                } else {
                    vs0Var2 = null;
                }
                bj4Var111.K(1171174724);
                if (list4.isEmpty()) {
                    z = false;
                    cz0VarB = zy0.b(0);
                } else {
                    z = false;
                }
                bj4Var111.U(z);
                yy0 yy0VarA110 = zy0.a(j19, 0L, 0L, 0L, bj4Var111, 14);
                mh4<g2b> mh4Var14 = mh4Var3;
                jz0.a(mh4Var14, ox6Var111113, false, zx8Var1110, yy0VarA110, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1114) {
                        oy8Var.getClass();
                        if ((i1114 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str, null, j110, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var111), bj4Var111, ((i3 >> 9) & 14) | 805306416, 388);
                bj4Var = bj4Var111;
                bj4Var.U(true);
                oh4Var4 = oh4Var3;
                mh4Var4 = mh4Var14;
                ox6Var3 = ox6Var111112;
                list5 = list4;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i9 = 1;
                if (i4 != 0) {
                    bj4VarO.K(49453589);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v46(i9);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    mh4Var3 = (mh4) objF3;
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    bj4VarO.K(49456021);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i12);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                zx8VarB = ay8.b(8.0f);
                ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                c0187a2 = c0187a;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                cz0VarB = null;
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1171126918);
                while (r23.hasNext()) {
                    ko7 ko7Var11 = zy0.a;
                    ox6.a aVar13 = aVar;
                    c0187a3 = c0187a2;
                    bj4 bj4Var112 = bj4VarO;
                    List<SurveyState.Content.SecondaryCta> list16 = list3;
                    ox6 ox6Var111114 = ox6Var2;
                    yy0 yy0VarA111 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var112, 14);
                    bj4Var112.K(1934484526);
                    if ((57344 & i3) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zJ = z2 | bj4Var112.J(secondaryCta);
                    objF = bj4Var112.f();
                    if (zJ) {
                        c0187a4 = c0187a3;
                        if (objF != c0187a4) {
                            i10 = 1;
                        }
                        bj4Var112.U(false);
                        vs0 vs0Var113 = vs0VarB;
                        int i1114 = i10;
                        zx8 zx8Var1111 = zx8VarB;
                        jt1.a.C0187a c0187a115 = c0187a4;
                        ox6 ox6Var111115 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var111115, false, zx8Var1111, yy0VarA111, null, vs0Var113, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1115) {
                                oy8Var.getClass();
                                if ((i1115 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar14 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar14);
                                bt1.c.getClass();
                                qr5.a aVar15 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar15);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar14, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var112), bj4Var112, 805306416, 420);
                        b47.b(bj4Var112, ir9.d(aVar13, 8.0f));
                        i9 = i1114;
                        aVar = aVar13;
                        bj4VarO = bj4Var112;
                        ox6VarD = ox6Var111115;
                        ox6Var2 = ox6Var111114;
                        list3 = list16;
                        zx8VarB = zx8Var1111;
                        c0187a2 = c0187a115;
                        vs0VarB = vs0Var113;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    i10 = 1;
                    objF = new gs6(i10, oh4Var3, secondaryCta);
                    bj4Var112.C(objF);
                    bj4Var112.U(false);
                    vs0 vs0Var114 = vs0VarB;
                    int i1115 = i10;
                    zx8 zx8Var1112 = zx8VarB;
                    jt1.a.C0187a c0187a116 = c0187a4;
                    ox6 ox6Var111116 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var111116, false, zx8Var1112, yy0VarA111, null, vs0Var114, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1116) {
                            oy8Var.getClass();
                            if ((i1116 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar14 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar14);
                            bt1.c.getClass();
                            qr5.a aVar15 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar15);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar14, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var112), bj4Var112, 805306416, 420);
                    b47.b(bj4Var112, ir9.d(aVar13, 8.0f));
                    i9 = i1115;
                    aVar = aVar13;
                    bj4VarO = bj4Var112;
                    ox6VarD = ox6Var111116;
                    ox6Var2 = ox6Var111114;
                    list3 = list16;
                    zx8VarB = zx8Var1112;
                    c0187a2 = c0187a116;
                    vs0VarB = vs0Var114;
                }
                bj4 bj4Var113 = bj4VarO;
                list4 = list3;
                ox6 ox6Var111117 = ox6Var2;
                vs0Var = vs0VarB;
                zx8 zx8Var1113 = zx8VarB;
                ox6 ox6Var111118 = ox6VarD;
                bj4Var113.U(false);
                if (list4.isEmpty()) {
                    js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                } else {
                    js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                }
                long j111 = ((uh1) js7Var.t).a;
                final long j112 = ((uh1) js7Var.u).a;
                if (list4.isEmpty()) {
                    vs0Var2 = vs0Var;
                } else {
                    vs0Var2 = null;
                }
                bj4Var113.K(1171174724);
                if (list4.isEmpty()) {
                    z = false;
                    cz0VarB = zy0.b(0);
                } else {
                    z = false;
                }
                bj4Var113.U(z);
                yy0 yy0VarA112 = zy0.a(j111, 0L, 0L, 0L, bj4Var113, 14);
                mh4<g2b> mh4Var15 = mh4Var3;
                jz0.a(mh4Var15, ox6Var111118, false, zx8Var1113, yy0VarA112, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1116) {
                        oy8Var.getClass();
                        if ((i1116 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str, null, j112, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var113), bj4Var113, ((i3 >> 9) & 14) | 805306416, 388);
                bj4Var = bj4Var113;
                bj4Var.U(true);
                oh4Var4 = oh4Var3;
                mh4Var4 = mh4Var15;
                ox6Var3 = ox6Var111117;
                list5 = list4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: h6a
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        mh4Var2 = mh4Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(surveyUiColors)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i9 = 1;
                if (i4 != 0) {
                    bj4VarO.K(49453589);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v46(i9);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    mh4Var3 = (mh4) objF3;
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    bj4VarO.K(49456021);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i12);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                zx8VarB = ay8.b(8.0f);
                ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                c0187a2 = c0187a;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                cz0VarB = null;
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1171126918);
                while (r23.hasNext()) {
                    ko7 ko7Var12 = zy0.a;
                    ox6.a aVar14 = aVar;
                    c0187a3 = c0187a2;
                    bj4 bj4Var114 = bj4VarO;
                    List<SurveyState.Content.SecondaryCta> list17 = list3;
                    ox6 ox6Var111119 = ox6Var2;
                    yy0 yy0VarA113 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var114, 14);
                    bj4Var114.K(1934484526);
                    if ((57344 & i3) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zJ = z2 | bj4Var114.J(secondaryCta);
                    objF = bj4Var114.f();
                    if (zJ) {
                        c0187a4 = c0187a3;
                        if (objF != c0187a4) {
                            i10 = 1;
                        }
                        bj4Var114.U(false);
                        vs0 vs0Var115 = vs0VarB;
                        int i1116 = i10;
                        zx8 zx8Var1114 = zx8VarB;
                        jt1.a.C0187a c0187a117 = c0187a4;
                        ox6 ox6Var1111110 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var1111110, false, zx8Var1114, yy0VarA113, null, vs0Var115, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1117) {
                                oy8Var.getClass();
                                if ((i1117 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar15 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar15);
                                bt1.c.getClass();
                                qr5.a aVar16 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar16);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar15, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var114), bj4Var114, 805306416, 420);
                        b47.b(bj4Var114, ir9.d(aVar14, 8.0f));
                        i9 = i1116;
                        aVar = aVar14;
                        bj4VarO = bj4Var114;
                        ox6VarD = ox6Var1111110;
                        ox6Var2 = ox6Var111119;
                        list3 = list17;
                        zx8VarB = zx8Var1114;
                        c0187a2 = c0187a117;
                        vs0VarB = vs0Var115;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    i10 = 1;
                    objF = new gs6(i10, oh4Var3, secondaryCta);
                    bj4Var114.C(objF);
                    bj4Var114.U(false);
                    vs0 vs0Var116 = vs0VarB;
                    int i1117 = i10;
                    zx8 zx8Var1115 = zx8VarB;
                    jt1.a.C0187a c0187a118 = c0187a4;
                    ox6 ox6Var1111111 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var1111111, false, zx8Var1115, yy0VarA113, null, vs0Var116, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1118) {
                            oy8Var.getClass();
                            if ((i1118 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar15 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar15);
                            bt1.c.getClass();
                            qr5.a aVar16 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar16);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar15, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var114), bj4Var114, 805306416, 420);
                    b47.b(bj4Var114, ir9.d(aVar14, 8.0f));
                    i9 = i1117;
                    aVar = aVar14;
                    bj4VarO = bj4Var114;
                    ox6VarD = ox6Var1111111;
                    ox6Var2 = ox6Var111119;
                    list3 = list17;
                    zx8VarB = zx8Var1115;
                    c0187a2 = c0187a118;
                    vs0VarB = vs0Var116;
                }
                bj4 bj4Var115 = bj4VarO;
                list4 = list3;
                ox6 ox6Var1111112 = ox6Var2;
                vs0Var = vs0VarB;
                zx8 zx8Var1116 = zx8VarB;
                ox6 ox6Var1111113 = ox6VarD;
                bj4Var115.U(false);
                if (list4.isEmpty()) {
                    js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                } else {
                    js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                }
                long j113 = ((uh1) js7Var.t).a;
                final long j114 = ((uh1) js7Var.u).a;
                if (list4.isEmpty()) {
                    vs0Var2 = vs0Var;
                } else {
                    vs0Var2 = null;
                }
                bj4Var115.K(1171174724);
                if (list4.isEmpty()) {
                    z = false;
                    cz0VarB = zy0.b(0);
                } else {
                    z = false;
                }
                bj4Var115.U(z);
                yy0 yy0VarA114 = zy0.a(j113, 0L, 0L, 0L, bj4Var115, 14);
                mh4<g2b> mh4Var16 = mh4Var3;
                jz0.a(mh4Var16, ox6Var1111113, false, zx8Var1116, yy0VarA114, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1118) {
                        oy8Var.getClass();
                        if ((i1118 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str, null, j114, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var115), bj4Var115, ((i3 >> 9) & 14) | 805306416, 388);
                bj4Var = bj4Var115;
                bj4Var.U(true);
                oh4Var4 = oh4Var3;
                mh4Var4 = mh4Var16;
                ox6Var3 = ox6Var1111112;
                list5 = list4;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i13 != 0) {
                    list3 = hf3.t;
                } else {
                    list3 = list2;
                }
                c0187a = jt1.a.a;
                i9 = 1;
                if (i4 != 0) {
                    bj4VarO.K(49453589);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new v46(i9);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    mh4Var3 = (mh4) objF3;
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    bj4VarO.K(49456021);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new fs6(i12);
                        bj4VarO.C(objF2);
                    }
                    oh4Var3 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
                zx8VarB = ay8.b(8.0f);
                ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                c0187a2 = c0187a;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                cz0VarB = null;
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1171126918);
                while (r23.hasNext()) {
                    ko7 ko7Var13 = zy0.a;
                    ox6.a aVar15 = aVar;
                    c0187a3 = c0187a2;
                    bj4 bj4Var116 = bj4VarO;
                    List<SurveyState.Content.SecondaryCta> list18 = list3;
                    ox6 ox6Var1111114 = ox6Var2;
                    yy0 yy0VarA115 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var116, 14);
                    bj4Var116.K(1934484526);
                    if ((57344 & i3) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zJ = z2 | bj4Var116.J(secondaryCta);
                    objF = bj4Var116.f();
                    if (zJ) {
                        c0187a4 = c0187a3;
                        if (objF != c0187a4) {
                            i10 = 1;
                        }
                        bj4Var116.U(false);
                        vs0 vs0Var117 = vs0VarB;
                        int i1118 = i10;
                        zx8 zx8Var1117 = zx8VarB;
                        jt1.a.C0187a c0187a119 = c0187a4;
                        ox6 ox6Var1111115 = ox6VarD;
                        jz0.a((mh4) objF, ox6Var1111115, false, zx8Var1117, yy0VarA115, null, vs0Var117, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1119) {
                                oy8Var.getClass();
                                if ((i1119 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                                SurveyUiColors surveyUiColors2 = surveyUiColors;
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6.a aVar16 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar16);
                                bt1.c.getClass();
                                qr5.a aVar17 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar17);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                jt1Var2.K(410193571);
                                if (secondaryCta2.isExternalUrl()) {
                                    m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar16, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                                }
                                jt1Var2.B();
                                mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                                jt1Var2.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4Var116), bj4Var116, 805306416, 420);
                        b47.b(bj4Var116, ir9.d(aVar15, 8.0f));
                        i9 = i1118;
                        aVar = aVar15;
                        bj4VarO = bj4Var116;
                        ox6VarD = ox6Var1111115;
                        ox6Var2 = ox6Var1111114;
                        list3 = list18;
                        zx8VarB = zx8Var1117;
                        c0187a2 = c0187a119;
                        vs0VarB = vs0Var117;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    i10 = 1;
                    objF = new gs6(i10, oh4Var3, secondaryCta);
                    bj4Var116.C(objF);
                    bj4Var116.U(false);
                    vs0 vs0Var118 = vs0VarB;
                    int i1119 = i10;
                    zx8 zx8Var1118 = zx8VarB;
                    jt1.a.C0187a c0187a1110 = c0187a4;
                    ox6 ox6Var1111116 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var1111116, false, zx8Var1118, yy0VarA115, null, vs0Var118, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11110) {
                            oy8Var.getClass();
                            if ((i11110 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar16 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar16);
                            bt1.c.getClass();
                            qr5.a aVar17 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar17);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar16, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var116), bj4Var116, 805306416, 420);
                    b47.b(bj4Var116, ir9.d(aVar15, 8.0f));
                    i9 = i1119;
                    aVar = aVar15;
                    bj4VarO = bj4Var116;
                    ox6VarD = ox6Var1111116;
                    ox6Var2 = ox6Var1111114;
                    list3 = list18;
                    zx8VarB = zx8Var1118;
                    c0187a2 = c0187a1110;
                    vs0VarB = vs0Var118;
                }
                bj4 bj4Var117 = bj4VarO;
                list4 = list3;
                ox6 ox6Var1111117 = ox6Var2;
                vs0Var = vs0VarB;
                zx8 zx8Var1119 = zx8VarB;
                ox6 ox6Var1111118 = ox6VarD;
                bj4Var117.U(false);
                if (list4.isEmpty()) {
                    js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
                } else {
                    js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
                }
                long j115 = ((uh1) js7Var.t).a;
                final long j116 = ((uh1) js7Var.u).a;
                if (list4.isEmpty()) {
                    vs0Var2 = vs0Var;
                } else {
                    vs0Var2 = null;
                }
                bj4Var117.K(1171174724);
                if (list4.isEmpty()) {
                    z = false;
                    cz0VarB = zy0.b(0);
                } else {
                    z = false;
                }
                bj4Var117.U(z);
                yy0 yy0VarA116 = zy0.a(j115, 0L, 0L, 0L, bj4Var117, 14);
                mh4<g2b> mh4Var17 = mh4Var3;
                jz0.a(mh4Var17, ox6Var1111118, false, zx8Var1119, yy0VarA116, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11110) {
                        oy8Var.getClass();
                        if ((i11110 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(str, null, j116, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var117), bj4Var117, ((i3 >> 9) & 14) | 805306416, 388);
                bj4Var = bj4Var117;
                bj4Var.U(true);
                oh4Var4 = oh4Var3;
                mh4Var4 = mh4Var17;
                ox6Var3 = ox6Var1111117;
                list5 = list4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: h6a
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var2 = oh4Var;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (bj4VarO.J(surveyUiColors)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((74899 & i3) == 74898) {
            aVar = ox6.a.t;
            if (i11 != 0) {
                ox6Var2 = aVar;
            }
            if (i13 != 0) {
                list3 = hf3.t;
            } else {
                list3 = list2;
            }
            c0187a = jt1.a.a;
            i9 = 1;
            if (i4 != 0) {
                bj4VarO.K(49453589);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new v46(i9);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                mh4Var3 = (mh4) objF3;
            } else {
                mh4Var3 = mh4Var2;
            }
            if (i6 != 0) {
                bj4VarO.K(49456021);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new fs6(i12);
                    bj4VarO.C(objF2);
                }
                oh4Var3 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
            zx8VarB = ay8.b(8.0f);
            ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            c0187a2 = c0187a;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            cz0VarB = null;
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1171126918);
            while (r23.hasNext()) {
                ko7 ko7Var14 = zy0.a;
                ox6.a aVar16 = aVar;
                c0187a3 = c0187a2;
                bj4 bj4Var118 = bj4VarO;
                List<SurveyState.Content.SecondaryCta> list19 = list3;
                ox6 ox6Var1111119 = ox6Var2;
                yy0 yy0VarA117 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var118, 14);
                bj4Var118.K(1934484526);
                if ((57344 & i3) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zJ = z2 | bj4Var118.J(secondaryCta);
                objF = bj4Var118.f();
                if (zJ) {
                    c0187a4 = c0187a3;
                    if (objF != c0187a4) {
                        i10 = 1;
                    }
                    bj4Var118.U(false);
                    vs0 vs0Var119 = vs0VarB;
                    int i11110 = i10;
                    zx8 zx8Var11110 = zx8VarB;
                    jt1.a.C0187a c0187a1111 = c0187a4;
                    ox6 ox6Var11111110 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var11111110, false, zx8Var11110, yy0VarA117, null, vs0Var119, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11111) {
                            oy8Var.getClass();
                            if ((i11111 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar17 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar17);
                            bt1.c.getClass();
                            qr5.a aVar18 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar18);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar17, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var118), bj4Var118, 805306416, 420);
                    b47.b(bj4Var118, ir9.d(aVar16, 8.0f));
                    i9 = i11110;
                    aVar = aVar16;
                    bj4VarO = bj4Var118;
                    ox6VarD = ox6Var11111110;
                    ox6Var2 = ox6Var1111119;
                    list3 = list19;
                    zx8VarB = zx8Var11110;
                    c0187a2 = c0187a1111;
                    vs0VarB = vs0Var119;
                } else {
                    c0187a4 = c0187a3;
                }
                i10 = 1;
                objF = new gs6(i10, oh4Var3, secondaryCta);
                bj4Var118.C(objF);
                bj4Var118.U(false);
                vs0 vs0Var1110 = vs0VarB;
                int i11111 = i10;
                zx8 zx8Var11111 = zx8VarB;
                jt1.a.C0187a c0187a1112 = c0187a4;
                ox6 ox6Var11111111 = ox6VarD;
                jz0.a((mh4) objF, ox6Var11111111, false, zx8Var11111, yy0VarA117, null, vs0Var1110, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11112) {
                        oy8Var.getClass();
                        if ((i11112 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6.a aVar17 = ox6.a.t;
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar17);
                        bt1.c.getClass();
                        qr5.a aVar18 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar18);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        jt1Var2.K(410193571);
                        if (secondaryCta2.isExternalUrl()) {
                            m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar17, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                        }
                        jt1Var2.B();
                        mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var118), bj4Var118, 805306416, 420);
                b47.b(bj4Var118, ir9.d(aVar16, 8.0f));
                i9 = i11111;
                aVar = aVar16;
                bj4VarO = bj4Var118;
                ox6VarD = ox6Var11111111;
                ox6Var2 = ox6Var1111119;
                list3 = list19;
                zx8VarB = zx8Var11111;
                c0187a2 = c0187a1112;
                vs0VarB = vs0Var1110;
            }
            bj4 bj4Var119 = bj4VarO;
            list4 = list3;
            ox6 ox6Var11111112 = ox6Var2;
            vs0Var = vs0VarB;
            zx8 zx8Var11112 = zx8VarB;
            ox6 ox6Var11111113 = ox6VarD;
            bj4Var119.U(false);
            if (list4.isEmpty()) {
                js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
            } else {
                js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
            }
            long j117 = ((uh1) js7Var.t).a;
            final long j118 = ((uh1) js7Var.u).a;
            if (list4.isEmpty()) {
                vs0Var2 = vs0Var;
            } else {
                vs0Var2 = null;
            }
            bj4Var119.K(1171174724);
            if (list4.isEmpty()) {
                z = false;
                cz0VarB = zy0.b(0);
            } else {
                z = false;
            }
            bj4Var119.U(z);
            yy0 yy0VarA118 = zy0.a(j117, 0L, 0L, 0L, bj4Var119, 14);
            mh4<g2b> mh4Var18 = mh4Var3;
            jz0.a(mh4Var18, ox6Var11111113, false, zx8Var11112, yy0VarA118, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11112) {
                    oy8Var.getClass();
                    if ((i11112 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        mia.b(str, null, j118, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4Var119), bj4Var119, ((i3 >> 9) & 14) | 805306416, 388);
            bj4Var = bj4Var119;
            bj4Var.U(true);
            oh4Var4 = oh4Var3;
            mh4Var4 = mh4Var18;
            ox6Var3 = ox6Var11111112;
            list5 = list4;
        } else {
            aVar = ox6.a.t;
            if (i11 != 0) {
                ox6Var2 = aVar;
            }
            if (i13 != 0) {
                list3 = hf3.t;
            } else {
                list3 = list2;
            }
            c0187a = jt1.a.a;
            i9 = 1;
            if (i4 != 0) {
                bj4VarO.K(49453589);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new v46(i9);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                mh4Var3 = (mh4) objF3;
            } else {
                mh4Var3 = mh4Var2;
            }
            if (i6 != 0) {
                bj4VarO.K(49456021);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new fs6(i12);
                    bj4VarO.C(objF2);
                }
                oh4Var3 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            vs0VarB = ws0.b(1.0f, surveyUiColors.m405getButtonBorder0d7_KjU());
            zx8VarB = ay8.b(8.0f);
            ox6VarD = ir9.d(ir9.c(aVar, 1.0f), 56.0f);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            c0187a2 = c0187a;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            cz0VarB = null;
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1171126918);
            while (r23.hasNext()) {
                ko7 ko7Var15 = zy0.a;
                ox6.a aVar17 = aVar;
                c0187a3 = c0187a2;
                bj4 bj4Var1110 = bj4VarO;
                List<SurveyState.Content.SecondaryCta> list110 = list3;
                ox6 ox6Var11111114 = ox6Var2;
                yy0 yy0VarA119 = zy0.a(surveyUiColors.m404getButton0d7_KjU(), 0L, 0L, 0L, bj4Var1110, 14);
                bj4Var1110.K(1934484526);
                if ((57344 & i3) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zJ = z2 | bj4Var1110.J(secondaryCta);
                objF = bj4Var1110.f();
                if (zJ) {
                    c0187a4 = c0187a3;
                    if (objF != c0187a4) {
                        i10 = 1;
                    }
                    bj4Var1110.U(false);
                    vs0 vs0Var1111 = vs0VarB;
                    int i11112 = i10;
                    zx8 zx8Var11113 = zx8VarB;
                    jt1.a.C0187a c0187a1113 = c0187a4;
                    ox6 ox6Var11111115 = ox6VarD;
                    jz0.a((mh4) objF, ox6Var11111115, false, zx8Var11113, yy0VarA119, null, vs0Var1111, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11113) {
                            oy8Var.getClass();
                            if ((i11113 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                            SurveyUiColors surveyUiColors2 = surveyUiColors;
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar18 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar18);
                            bt1.c.getClass();
                            qr5.a aVar19 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar19);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            jt1Var2.K(410193571);
                            if (secondaryCta2.isExternalUrl()) {
                                m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar18, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                            }
                            jt1Var2.B();
                            mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4Var1110), bj4Var1110, 805306416, 420);
                    b47.b(bj4Var1110, ir9.d(aVar17, 8.0f));
                    i9 = i11112;
                    aVar = aVar17;
                    bj4VarO = bj4Var1110;
                    ox6VarD = ox6Var11111115;
                    ox6Var2 = ox6Var11111114;
                    list3 = list110;
                    zx8VarB = zx8Var11113;
                    c0187a2 = c0187a1113;
                    vs0VarB = vs0Var1111;
                } else {
                    c0187a4 = c0187a3;
                }
                i10 = 1;
                objF = new gs6(i10, oh4Var3, secondaryCta);
                bj4Var1110.C(objF);
                bj4Var1110.U(false);
                vs0 vs0Var1112 = vs0VarB;
                int i11113 = i10;
                zx8 zx8Var11114 = zx8VarB;
                jt1.a.C0187a c0187a1114 = c0187a4;
                ox6 ox6Var11111116 = ox6VarD;
                jz0.a((mh4) objF, ox6Var11111116, false, zx8Var11114, yy0VarA119, null, vs0Var1112, null, gr1.b(468620518, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11114) {
                        oy8Var.getClass();
                        if ((i11114 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        SurveyState.Content.SecondaryCta secondaryCta2 = secondaryCta;
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6.a aVar18 = ox6.a.t;
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar18);
                        bt1.c.getClass();
                        qr5.a aVar19 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar19);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        jt1Var2.K(410193571);
                        if (secondaryCta2.isExternalUrl()) {
                            m65.b(is7.a(R.drawable.intercom_open_help_center, jt1Var2, 0), null, ir9.j(eo7.k(aVar18, 4.0f, 0.0f, 2), 24.0f), surveyUiColors2.m408getOnButton0d7_KjU(), jt1Var2, 440, 0);
                        }
                        jt1Var2.B();
                        mia.b(secondaryCta2.getButtonText(), null, surveyUiColors2.m408getOnButton0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4Var1110), bj4Var1110, 805306416, 420);
                b47.b(bj4Var1110, ir9.d(aVar17, 8.0f));
                i9 = i11113;
                aVar = aVar17;
                bj4VarO = bj4Var1110;
                ox6VarD = ox6Var11111116;
                ox6Var2 = ox6Var11111114;
                list3 = list110;
                zx8VarB = zx8Var11114;
                c0187a2 = c0187a1114;
                vs0VarB = vs0Var1112;
            }
            bj4 bj4Var1111 = bj4VarO;
            list4 = list3;
            ox6 ox6Var11111117 = ox6Var2;
            vs0Var = vs0VarB;
            zx8 zx8Var11115 = zx8VarB;
            ox6 ox6Var11111118 = ox6VarD;
            bj4Var1111.U(false);
            if (list4.isEmpty()) {
                js7Var = new js7(new uh1(surveyUiColors.m404getButton0d7_KjU()), new uh1(surveyUiColors.m408getOnButton0d7_KjU()));
            } else {
                js7Var = new js7(new uh1(uh1.j), new uh1(surveyUiColors.m407getOnBackground0d7_KjU()));
            }
            long j119 = ((uh1) js7Var.t).a;
            final long j1110 = ((uh1) js7Var.u).a;
            if (list4.isEmpty()) {
                vs0Var2 = vs0Var;
            } else {
                vs0Var2 = null;
            }
            bj4Var1111.K(1171174724);
            if (list4.isEmpty()) {
                z = false;
                cz0VarB = zy0.b(0);
            } else {
                z = false;
            }
            bj4Var1111.U(z);
            yy0 yy0VarA1110 = zy0.a(j119, 0L, 0L, 0L, bj4Var1111, 14);
            mh4<g2b> mh4Var19 = mh4Var3;
            jz0.a(mh4Var19, ox6Var11111118, false, zx8Var11115, yy0VarA1110, cz0VarB, vs0Var2, null, gr1.b(767351755, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11114) {
                    oy8Var.getClass();
                    if ((i11114 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        mia.b(str, null, j1110, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4Var1111), bj4Var1111, ((i3 >> 9) & 14) | 805306416, 388);
            bj4Var = bj4Var1111;
            bj4Var.U(true);
            oh4Var4 = oh4Var3;
            mh4Var4 = mh4Var19;
            ox6Var3 = ox6Var11111117;
            list5 = list4;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: h6a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$8(ox6Var3, str, list5, mh4Var4, oh4Var4, surveyUiColors, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyCtaButtonComponent$lambda$3$lambda$2(SurveyState.Content.SecondaryCta secondaryCta) {
        secondaryCta.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyCtaButtonComponent$lambda$7$lambda$6$lambda$5$lambda$4(oh4 oh4Var, SurveyState.Content.SecondaryCta secondaryCta) {
        oh4Var.invoke(secondaryCta);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyCtaButtonComponent$lambda$8(ox6 ox6Var, String str, List list, mh4 mh4Var, oh4 oh4Var, SurveyUiColors surveyUiColors, int i, int i2, jt1 jt1Var, int i3) {
        SurveyCtaButtonComponent(ox6Var, str, list, mh4Var, oh4Var, surveyUiColors, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
