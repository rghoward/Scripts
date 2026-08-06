package io.intercom.android.sdk.survey.ui.questiontype.text;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.ac4;
import defpackage.aj1;
import defpackage.ap5;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c15;
import defpackage.c30;
import defpackage.c33;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.dp0;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.fw0;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.jw0;
import defpackage.jy3;
import defpackage.kw0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.lt6;
import defpackage.m78;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy0;
import defpackage.p84;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.t72;
import defpackage.uh1;
import defpackage.v94;
import defpackage.vp0;
import defpackage.wd3;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ShortTextQuestionKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ShortTextAnsweredPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1590545552);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m499getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lt6(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextAnsweredPreview$lambda$12(int i, jt1 jt1Var, int i2) {
        ShortTextAnsweredPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ShortTextDisabledPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1539795729);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m501getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tn9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ShortTextQuestionKt.ShortTextDisabledPreview$lambda$14(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextDisabledPreview$lambda$14(int i, jt1 jt1Var, int i2) {
        ShortTextDisabledPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ShortTextPhoneNumberPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-38271892);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m500getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jy3(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextPhoneNumberPreview$lambda$13(int i, jt1 jt1Var, int i2) {
        ShortTextPhoneNumberPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ShortTextPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2147193389);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m498getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new vp0(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextPreview$lambda$11(int i, jt1 jt1Var, int i2) {
        ShortTextPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0138  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    /* JADX WARN: Code duplicated, block: B:115:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:127:0x021d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0221  */
    /* JADX WARN: Code duplicated, block: B:131:0x0256  */
    /* JADX WARN: Code duplicated, block: B:133:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x025b  */
    /* JADX WARN: Code duplicated, block: B:136:0x025e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0263  */
    /* JADX WARN: Code duplicated, block: B:139:0x0266  */
    /* JADX WARN: Code duplicated, block: B:141:0x026a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0270  */
    /* JADX WARN: Code duplicated, block: B:145:0x0278  */
    /* JADX WARN: Code duplicated, block: B:148:0x0286  */
    /* JADX WARN: Code duplicated, block: B:150:0x0294  */
    /* JADX WARN: Code duplicated, block: B:153:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x0302  */
    /* JADX WARN: Code duplicated, block: B:170:0x031a  */
    /* JADX WARN: Code duplicated, block: B:173:0x032a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0335  */
    /* JADX WARN: Code duplicated, block: B:181:0x0347  */
    /* JADX WARN: Code duplicated, block: B:182:0x0349  */
    /* JADX WARN: Code duplicated, block: B:185:0x0350 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0356  */
    /* JADX WARN: Code duplicated, block: B:191:0x0396  */
    /* JADX WARN: Code duplicated, block: B:195:0x039e  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:201:0x0419  */
    /* JADX WARN: Code duplicated, block: B:205:0x0472  */
    /* JADX WARN: Code duplicated, block: B:207:0x0483  */
    /* JADX WARN: Code duplicated, block: B:209:0x0487  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX WARN: Instruction removed from duplicated block: B:159:0x02d2, please report this as an issue */
    public static final void ShortTextQuestion(ox6 ox6Var, final SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel, Answer answer, oh4<? super Answer, g2b> oh4Var, final SurveyUiColors surveyUiColors, final ValidationError validationError, oh4<? super ap5, g2b> oh4Var2, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        int i4;
        Answer answer2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        oh4<? super ap5, g2b> oh4Var3;
        int i10;
        int i11;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM497getLambda1$intercom_sdk_base_release;
        int i12;
        ox6.a aVar;
        Answer answer3;
        jt1.a.C0187a c0187a;
        int i13;
        oh4<? super ap5, g2b> oh4Var4;
        Object objF;
        final fw0 fw0Var;
        Object objF2;
        final t72 t72Var;
        ox6 ox6Var3;
        boolean zJ;
        Object objF3;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        aj1 aj1VarA;
        Answer answer4;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        int i14;
        int i15;
        String answer5;
        String placeholder;
        fr1 fr1VarB;
        uh1 uh1Var;
        boolean z;
        boolean z2;
        Object objF4;
        final oh4<? super Answer, g2b> oh4Var5;
        final oh4<? super ap5, g2b> oh4Var6;
        bj4 bj4Var;
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType;
        Integer characterLimit;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        final ox6 ox6Var4;
        final Answer answer6;
        Locale localeCompat;
        final CountryAreaCode countryAreaCodeFromLocale;
        int i16;
        Object objF5;
        xj8 xj8VarW;
        shortTextQuestionModel.getClass();
        oh4Var.getClass();
        surveyUiColors.getClass();
        validationError.getClass();
        bj4 bj4VarO = jt1Var.o(13974558);
        j1b j1bVar = bj4VarO.a;
        int i17 = i2 & 1;
        if (i17 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(shortTextQuestionModel) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    answer2 = answer;
                    if (bj4VarO.J(answer2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (bj4VarO.j(oh4Var)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        if (bj4VarO.J(surveyUiColors)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.J(validationError)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 64;
                    if (i9 != 0) {
                        i3 |= 1572864;
                        oh4Var3 = oh4Var2;
                    } else {
                        oh4Var3 = oh4Var2;
                        if ((i & 1572864) == 0) {
                            if (bj4VarO.j(oh4Var3)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        i3 |= 12582912;
                        ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                    } else {
                        ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                        if ((i & 12582912) == 0) {
                            if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i3 |= i12;
                        }
                    }
                    if ((i3 & 4793491) == 4793490 || !bj4VarO.r()) {
                        aVar = ox6.a.t;
                        if (i17 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 1;
                        if (i9 != 0) {
                            bj4VarO.K(-1483115004);
                            objF5 = bj4VarO.f();
                            if (objF5 == c0187a) {
                                objF5 = new dp0(i13);
                                bj4VarO.C(objF5);
                            }
                            oh4Var3 = (oh4) objF5;
                            bj4VarO.U(false);
                        }
                        oh4Var4 = oh4Var3;
                        if (i11 != 0) {
                            ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                        }
                        bj4VarO.K(-1483112089);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new jw0();
                            bj4VarO.C(objF);
                        }
                        fw0Var = (fw0) objF;
                        bj4VarO.U(false);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            c33 c33Var = wd3.a;
                            objF2 = m78.a(bj4VarO.x(), bj4VarO);
                        }
                        t72Var = (t72) objF2;
                        ox6 ox6VarA = kw0.a(ox6Var2, fw0Var);
                        ox6Var3 = ox6Var2;
                        bj4VarO.K(-1483104376);
                        zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                        objF3 = bj4VarO.f();
                        if (zJ || objF3 == c0187a) {
                            objF3 = new oh4() { // from class: qn9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarB = p84.b(ox6VarA, (oh4) objF3);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarB);
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
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        answer4 = answer3;
                        ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
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
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                        if (i14 == 1) {
                            i15 = 3;
                        } else {
                            if (i14 == 2) {
                                i16 = 6;
                            } else if (i14 == 3) {
                                i16 = 4;
                            } else if (i14 != 4) {
                                i15 = 1;
                            } else {
                                i15 = 3;
                            }
                            i15 = i16;
                        }
                        if (answer4 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        bj4VarO.K(1720965522);
                        if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = shortTextQuestionModel.getPlaceholder();
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(1720974793);
                        if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                            PhoneNumberValidator.loadCountryAreaCodes(context);
                            localeCompat = UtilsKt.getLocaleCompat(context);
                            if (answer4 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                            }
                            if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                public final void invoke(jt1 jt1Var2, int i18) {
                                    if ((i18 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO);
                            placeholder = "+1 123 456 7890";
                        } else {
                            fr1VarB = null;
                        }
                        String str = answer5;
                        bj4VarO.U(false);
                        if ((validationError instanceof ValidationError.ValidationStringError) || (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) || ((ValidationError.ValidationStringError) validationError).getStringRes() == R.string.intercom_surveys_required_response) {
                            uh1Var = null;
                        } else {
                            uh1Var = new uh1(uh1.f);
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        if (shortTextQuestionModel.getEnabled() || !(validationError instanceof ValidationError.NoValidationError) || (answer4 instanceof Answer.NoAnswer)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolean enabled = shortTextQuestionModel.getEnabled();
                        bj4VarO.K(1721007965);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF4 = bj4VarO.f();
                        if (!z2 || objF4 == c0187a) {
                            oh4Var5 = oh4Var;
                            objF4 = new oh4() { // from class: rn9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                        } else {
                            oh4Var5 = oh4Var;
                        }
                        bj4VarO.U(false);
                        TextInputPillKt.m507TextInputPillg5ZjG94(str, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        validationType = shortTextQuestionModel.getValidationType();
                        bj4Var.K(1721044754);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION || validationType == SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT) {
                            characterLimit = shortTextQuestionModel.getCharacterLimit();
                            if (characterLimit != null) {
                                int iIntValue = characterLimit.intValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append(answer4.getLength());
                                sb.append('/');
                                sb.append(iIntValue);
                                mia.b(sb.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                                g2b g2bVar = g2b.a;
                            }
                        } else {
                            g2b g2bVar2 = g2b.a;
                        }
                        bj4Var.U(false);
                        bj4Var.K(1721063955);
                        if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strF = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i18 = IntercomTheme.$stable;
                            mia.b(strF, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme, bj4Var, i18), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i18).getType04(), bj4Var, 48, 0, 131064);
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var2;
                        ox6Var4 = ox6Var3;
                        answer6 = answer4;
                    } else {
                        bj4VarO.u();
                        ci4Var3 = ci4VarM497getLambda1$intercom_sdk_base_release;
                        oh4Var5 = oh4Var;
                        ox6Var4 = ox6Var2;
                        answer6 = answer2;
                        oh4Var6 = oh4Var3;
                        bj4Var = bj4VarO;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4<? super Answer, g2b> oh4Var7 = oh4Var5;
                        xj8VarW.d = new ci4() { // from class: sn9
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var7, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue2);
                            }
                        };
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(validationError)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                    i3 |= 1572864;
                    oh4Var3 = oh4Var2;
                } else {
                    oh4Var3 = oh4Var2;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(oh4Var3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= 12582912;
                    ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                } else {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                }
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 1;
                    if (i9 != 0) {
                        bj4VarO.K(-1483115004);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new dp0(i13);
                            bj4VarO.C(objF5);
                        }
                        oh4Var3 = (oh4) objF5;
                        bj4VarO.U(false);
                    }
                    oh4Var4 = oh4Var3;
                    if (i11 != 0) {
                        ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                    }
                    bj4VarO.K(-1483112089);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new jw0();
                        bj4VarO.C(objF);
                    }
                    fw0Var = (fw0) objF;
                    bj4VarO.U(false);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        c33 c33Var2 = wd3.a;
                        objF2 = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF2;
                    ox6 ox6VarA2 = kw0.a(ox6Var2, fw0Var);
                    ox6Var3 = ox6Var2;
                    bj4VarO.K(-1483104376);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB2 = p84.b(ox6VarA2, (oh4) objF3);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarB2);
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
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf2);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    answer4 = answer3;
                    ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                    if (i14 == 1) {
                        i15 = 3;
                    } else {
                        if (i14 == 2) {
                            i16 = 6;
                        } else if (i14 == 3) {
                            i16 = 4;
                        } else if (i14 != 4) {
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        i15 = i16;
                    }
                    if (answer4 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    bj4VarO.K(1720965522);
                    if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = shortTextQuestionModel.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(1720974793);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context2 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        PhoneNumberValidator.loadCountryAreaCodes(context2);
                        localeCompat = UtilsKt.getLocaleCompat(context2);
                        if (answer4 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            public final void invoke(jt1 jt1Var2, int i19) {
                                if ((i19 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                        placeholder = "+1 123 456 7890";
                    } else {
                        fr1VarB = null;
                    }
                    String str2 = answer5;
                    bj4VarO.U(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    if (shortTextQuestionModel.getEnabled()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    boolean enabled2 = shortTextQuestionModel.getEnabled();
                    bj4VarO.K(1721007965);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF4 = bj4VarO.f();
                    if (z2) {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    TextInputPillKt.m507TextInputPillg5ZjG94(str2, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA2, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled2, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    validationType = shortTextQuestionModel.getValidationType();
                    bj4Var.K(1721044754);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue2 = characterLimit.intValue();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(answer4.getLength());
                            sb2.append('/');
                            sb2.append(iIntValue2);
                            mia.b(sb2.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar3 = g2b.a;
                        }
                    } else {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue3 = characterLimit.intValue();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(answer4.getLength());
                            sb3.append('/');
                            sb3.append(iIntValue3);
                            mia.b(sb3.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar4 = g2b.a;
                        }
                    }
                    bj4Var.U(false);
                    bj4Var.K(1721063955);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strF2 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i19 = IntercomTheme.$stable;
                        mia.b(strF2, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme2, bj4Var, i19), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(bj4Var, i19).getType04(), bj4Var, 48, 0, 131064);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var2;
                    ox6Var4 = ox6Var3;
                    answer6 = answer4;
                } else {
                    aVar = ox6.a.t;
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 1;
                    if (i9 != 0) {
                        bj4VarO.K(-1483115004);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new dp0(i13);
                            bj4VarO.C(objF5);
                        }
                        oh4Var3 = (oh4) objF5;
                        bj4VarO.U(false);
                    }
                    oh4Var4 = oh4Var3;
                    if (i11 != 0) {
                        ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                    }
                    bj4VarO.K(-1483112089);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new jw0();
                        bj4VarO.C(objF);
                    }
                    fw0Var = (fw0) objF;
                    bj4VarO.U(false);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        c33 c33Var3 = wd3.a;
                        objF2 = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF2;
                    ox6 ox6VarA3 = kw0.a(ox6Var2, fw0Var);
                    ox6Var3 = ox6Var2;
                    bj4VarO.K(-1483104376);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB3 = p84.b(ox6VarA3, (oh4) objF3);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarB3);
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
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf3 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf3);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    answer4 = answer3;
                    ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                    if (i14 == 1) {
                        i15 = 3;
                    } else {
                        if (i14 == 2) {
                            i16 = 6;
                        } else if (i14 == 3) {
                            i16 = 4;
                        } else if (i14 != 4) {
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        i15 = i16;
                    }
                    if (answer4 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    bj4VarO.K(1720965522);
                    if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = shortTextQuestionModel.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(1720974793);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context3 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        PhoneNumberValidator.loadCountryAreaCodes(context3);
                        localeCompat = UtilsKt.getLocaleCompat(context3);
                        if (answer4 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            public final void invoke(jt1 jt1Var2, int i110) {
                                if ((i110 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                        placeholder = "+1 123 456 7890";
                    } else {
                        fr1VarB = null;
                    }
                    String str3 = answer5;
                    bj4VarO.U(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA3 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    if (shortTextQuestionModel.getEnabled()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    boolean enabled3 = shortTextQuestionModel.getEnabled();
                    bj4VarO.K(1721007965);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF4 = bj4VarO.f();
                    if (z2) {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    TextInputPillKt.m507TextInputPillg5ZjG94(str3, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA3, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled3, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    validationType = shortTextQuestionModel.getValidationType();
                    bj4Var.K(1721044754);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue4 = characterLimit.intValue();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(answer4.getLength());
                            sb4.append('/');
                            sb4.append(iIntValue4);
                            mia.b(sb4.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar5 = g2b.a;
                        }
                    } else {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue5 = characterLimit.intValue();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(answer4.getLength());
                            sb5.append('/');
                            sb5.append(iIntValue5);
                            mia.b(sb5.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar6 = g2b.a;
                        }
                    }
                    bj4Var.U(false);
                    bj4Var.K(1721063955);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strF3 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i110 = IntercomTheme.$stable;
                        mia.b(strF3, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme3, bj4Var, i110), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(bj4Var, i110).getType04(), bj4Var, 48, 0, 131064);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var2;
                    ox6Var4 = ox6Var3;
                    answer6 = answer4;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var8 = oh4Var5;
                    xj8VarW.d = new ci4() { // from class: sn9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue6 = ((Integer) obj2).intValue();
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var8, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue6);
                        }
                    };
                }
            }
            i3 |= 384;
            answer2 = answer;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.J(surveyUiColors)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(validationError)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                    i3 |= 1572864;
                    oh4Var3 = oh4Var2;
                } else {
                    oh4Var3 = oh4Var2;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(oh4Var3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= 12582912;
                    ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                } else {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                }
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 1;
                    if (i9 != 0) {
                        bj4VarO.K(-1483115004);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new dp0(i13);
                            bj4VarO.C(objF5);
                        }
                        oh4Var3 = (oh4) objF5;
                        bj4VarO.U(false);
                    }
                    oh4Var4 = oh4Var3;
                    if (i11 != 0) {
                        ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                    }
                    bj4VarO.K(-1483112089);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new jw0();
                        bj4VarO.C(objF);
                    }
                    fw0Var = (fw0) objF;
                    bj4VarO.U(false);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        c33 c33Var4 = wd3.a;
                        objF2 = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF2;
                    ox6 ox6VarA4 = kw0.a(ox6Var2, fw0Var);
                    ox6Var3 = ox6Var2;
                    bj4VarO.K(-1483104376);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB4 = p84.b(ox6VarA4, (oh4) objF3);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarB4);
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
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf4 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf4);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    answer4 = answer3;
                    ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                    if (i14 == 1) {
                        i15 = 3;
                    } else {
                        if (i14 == 2) {
                            i16 = 6;
                        } else if (i14 == 3) {
                            i16 = 4;
                        } else if (i14 != 4) {
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        i15 = i16;
                    }
                    if (answer4 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    bj4VarO.K(1720965522);
                    if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = shortTextQuestionModel.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(1720974793);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context4 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        PhoneNumberValidator.loadCountryAreaCodes(context4);
                        localeCompat = UtilsKt.getLocaleCompat(context4);
                        if (answer4 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            public final void invoke(jt1 jt1Var2, int i111) {
                                if ((i111 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                        placeholder = "+1 123 456 7890";
                    } else {
                        fr1VarB = null;
                    }
                    String str4 = answer5;
                    bj4VarO.U(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA4 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    if (shortTextQuestionModel.getEnabled()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    boolean enabled4 = shortTextQuestionModel.getEnabled();
                    bj4VarO.K(1721007965);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF4 = bj4VarO.f();
                    if (z2) {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    TextInputPillKt.m507TextInputPillg5ZjG94(str4, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA4, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled4, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    validationType = shortTextQuestionModel.getValidationType();
                    bj4Var.K(1721044754);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue6 = characterLimit.intValue();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(answer4.getLength());
                            sb6.append('/');
                            sb6.append(iIntValue6);
                            mia.b(sb6.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar7 = g2b.a;
                        }
                    } else {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue7 = characterLimit.intValue();
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(answer4.getLength());
                            sb7.append('/');
                            sb7.append(iIntValue7);
                            mia.b(sb7.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar8 = g2b.a;
                        }
                    }
                    bj4Var.U(false);
                    bj4Var.K(1721063955);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strF4 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i111 = IntercomTheme.$stable;
                        mia.b(strF4, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme4, bj4Var, i111), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme4.getTypography(bj4Var, i111).getType04(), bj4Var, 48, 0, 131064);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var2;
                    ox6Var4 = ox6Var3;
                    answer6 = answer4;
                } else {
                    aVar = ox6.a.t;
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 1;
                    if (i9 != 0) {
                        bj4VarO.K(-1483115004);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new dp0(i13);
                            bj4VarO.C(objF5);
                        }
                        oh4Var3 = (oh4) objF5;
                        bj4VarO.U(false);
                    }
                    oh4Var4 = oh4Var3;
                    if (i11 != 0) {
                        ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                    }
                    bj4VarO.K(-1483112089);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new jw0();
                        bj4VarO.C(objF);
                    }
                    fw0Var = (fw0) objF;
                    bj4VarO.U(false);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        c33 c33Var5 = wd3.a;
                        objF2 = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF2;
                    ox6 ox6VarA5 = kw0.a(ox6Var2, fw0Var);
                    ox6Var3 = ox6Var2;
                    bj4VarO.K(-1483104376);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB5 = p84.b(ox6VarA5, (oh4) objF3);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarB5);
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
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf5);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    answer4 = answer3;
                    ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                    if (i14 == 1) {
                        i15 = 3;
                    } else {
                        if (i14 == 2) {
                            i16 = 6;
                        } else if (i14 == 3) {
                            i16 = 4;
                        } else if (i14 != 4) {
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        i15 = i16;
                    }
                    if (answer4 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    bj4VarO.K(1720965522);
                    if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = shortTextQuestionModel.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(1720974793);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context5 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        PhoneNumberValidator.loadCountryAreaCodes(context5);
                        localeCompat = UtilsKt.getLocaleCompat(context5);
                        if (answer4 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            public final void invoke(jt1 jt1Var2, int i112) {
                                if ((i112 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                        placeholder = "+1 123 456 7890";
                    } else {
                        fr1VarB = null;
                    }
                    String str5 = answer5;
                    bj4VarO.U(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA5 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    if (shortTextQuestionModel.getEnabled()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    boolean enabled5 = shortTextQuestionModel.getEnabled();
                    bj4VarO.K(1721007965);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF4 = bj4VarO.f();
                    if (z2) {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    TextInputPillKt.m507TextInputPillg5ZjG94(str5, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA5, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled5, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    validationType = shortTextQuestionModel.getValidationType();
                    bj4Var.K(1721044754);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue8 = characterLimit.intValue();
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(answer4.getLength());
                            sb8.append('/');
                            sb8.append(iIntValue8);
                            mia.b(sb8.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar9 = g2b.a;
                        }
                    } else {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue9 = characterLimit.intValue();
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(answer4.getLength());
                            sb9.append('/');
                            sb9.append(iIntValue9);
                            mia.b(sb9.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar10 = g2b.a;
                        }
                    }
                    bj4Var.U(false);
                    bj4Var.K(1721063955);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strF5 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i112 = IntercomTheme.$stable;
                        mia.b(strF5, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme5, bj4Var, i112), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme5.getTypography(bj4Var, i112).getType04(), bj4Var, 48, 0, 131064);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var2;
                    ox6Var4 = ox6Var3;
                    answer6 = answer4;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var9 = oh4Var5;
                    xj8VarW.d = new ci4() { // from class: sn9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue10 = ((Integer) obj2).intValue();
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var9, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue10);
                        }
                    };
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(validationError)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                i3 |= 1572864;
                oh4Var3 = oh4Var2;
            } else {
                oh4Var3 = oh4Var2;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(oh4Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i3 |= 12582912;
                ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
            } else {
                ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
            }
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i17 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 1;
                if (i9 != 0) {
                    bj4VarO.K(-1483115004);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new dp0(i13);
                        bj4VarO.C(objF5);
                    }
                    oh4Var3 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                oh4Var4 = oh4Var3;
                if (i11 != 0) {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                }
                bj4VarO.K(-1483112089);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw0();
                    bj4VarO.C(objF);
                }
                fw0Var = (fw0) objF;
                bj4VarO.U(false);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var6 = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                ox6 ox6VarA6 = kw0.a(ox6Var2, fw0Var);
                ox6Var3 = ox6Var2;
                bj4VarO.K(-1483104376);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarB6 = p84.b(ox6VarA6, (oh4) objF3);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB6);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf6 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf6);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                answer4 = answer3;
                ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                if (i14 == 1) {
                    i15 = 3;
                } else {
                    if (i14 == 2) {
                        i16 = 6;
                    } else if (i14 == 3) {
                        i16 = 4;
                    } else if (i14 != 4) {
                        i15 = 1;
                    } else {
                        i15 = 3;
                    }
                    i15 = i16;
                }
                if (answer4 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                bj4VarO.K(1720965522);
                if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = shortTextQuestionModel.getPlaceholder();
                }
                bj4VarO.U(false);
                bj4VarO.K(1720974793);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context6 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    PhoneNumberValidator.loadCountryAreaCodes(context6);
                    localeCompat = UtilsKt.getLocaleCompat(context6);
                    if (answer4 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        public final void invoke(jt1 jt1Var2, int i113) {
                            if ((i113 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    placeholder = "+1 123 456 7890";
                } else {
                    fr1VarB = null;
                }
                String str6 = answer5;
                bj4VarO.U(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA6 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                if (shortTextQuestionModel.getEnabled()) {
                    z = false;
                } else {
                    z = false;
                }
                boolean enabled6 = shortTextQuestionModel.getEnabled();
                bj4VarO.K(1721007965);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF4 = bj4VarO.f();
                if (z2) {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                TextInputPillKt.m507TextInputPillg5ZjG94(str6, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA6, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled6, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                validationType = shortTextQuestionModel.getValidationType();
                bj4Var.K(1721044754);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue10 = characterLimit.intValue();
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(answer4.getLength());
                        sb10.append('/');
                        sb10.append(iIntValue10);
                        mia.b(sb10.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar11 = g2b.a;
                    }
                } else {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue11 = characterLimit.intValue();
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(answer4.getLength());
                        sb11.append('/');
                        sb11.append(iIntValue11);
                        mia.b(sb11.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar12 = g2b.a;
                    }
                }
                bj4Var.U(false);
                bj4Var.K(1721063955);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strF6 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    int i113 = IntercomTheme.$stable;
                    mia.b(strF6, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme6, bj4Var, i113), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme6.getTypography(bj4Var, i113).getType04(), bj4Var, 48, 0, 131064);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var2;
                ox6Var4 = ox6Var3;
                answer6 = answer4;
            } else {
                aVar = ox6.a.t;
                if (i17 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 1;
                if (i9 != 0) {
                    bj4VarO.K(-1483115004);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new dp0(i13);
                        bj4VarO.C(objF5);
                    }
                    oh4Var3 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                oh4Var4 = oh4Var3;
                if (i11 != 0) {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                }
                bj4VarO.K(-1483112089);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw0();
                    bj4VarO.C(objF);
                }
                fw0Var = (fw0) objF;
                bj4VarO.U(false);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var7 = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                ox6 ox6VarA7 = kw0.a(ox6Var2, fw0Var);
                ox6Var3 = ox6Var2;
                bj4VarO.K(-1483104376);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarB7 = p84.b(ox6VarA7, (oh4) objF3);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB7);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf7 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf7);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                answer4 = answer3;
                ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                if (i14 == 1) {
                    i15 = 3;
                } else {
                    if (i14 == 2) {
                        i16 = 6;
                    } else if (i14 == 3) {
                        i16 = 4;
                    } else if (i14 != 4) {
                        i15 = 1;
                    } else {
                        i15 = 3;
                    }
                    i15 = i16;
                }
                if (answer4 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                bj4VarO.K(1720965522);
                if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = shortTextQuestionModel.getPlaceholder();
                }
                bj4VarO.U(false);
                bj4VarO.K(1720974793);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context7 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    PhoneNumberValidator.loadCountryAreaCodes(context7);
                    localeCompat = UtilsKt.getLocaleCompat(context7);
                    if (answer4 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        public final void invoke(jt1 jt1Var2, int i114) {
                            if ((i114 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    placeholder = "+1 123 456 7890";
                } else {
                    fr1VarB = null;
                }
                String str7 = answer5;
                bj4VarO.U(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA7 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                if (shortTextQuestionModel.getEnabled()) {
                    z = false;
                } else {
                    z = false;
                }
                boolean enabled7 = shortTextQuestionModel.getEnabled();
                bj4VarO.K(1721007965);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF4 = bj4VarO.f();
                if (z2) {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                TextInputPillKt.m507TextInputPillg5ZjG94(str7, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA7, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled7, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                validationType = shortTextQuestionModel.getValidationType();
                bj4Var.K(1721044754);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue12 = characterLimit.intValue();
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append(answer4.getLength());
                        sb12.append('/');
                        sb12.append(iIntValue12);
                        mia.b(sb12.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar13 = g2b.a;
                    }
                } else {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue13 = characterLimit.intValue();
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(answer4.getLength());
                        sb13.append('/');
                        sb13.append(iIntValue13);
                        mia.b(sb13.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar14 = g2b.a;
                    }
                }
                bj4Var.U(false);
                bj4Var.K(1721063955);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strF7 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                    int i114 = IntercomTheme.$stable;
                    mia.b(strF7, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme7, bj4Var, i114), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme7.getTypography(bj4Var, i114).getType04(), bj4Var, 48, 0, 131064);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var2;
                ox6Var4 = ox6Var3;
                answer6 = answer4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var10 = oh4Var5;
                xj8VarW.d = new ci4() { // from class: sn9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue14 = ((Integer) obj2).intValue();
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var10, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue14);
                    }
                };
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                answer2 = answer;
                if (bj4VarO.J(answer2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.J(surveyUiColors)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(validationError)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 64;
                if (i9 != 0) {
                    i3 |= 1572864;
                    oh4Var3 = oh4Var2;
                } else {
                    oh4Var3 = oh4Var2;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.j(oh4Var3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= 12582912;
                    ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                } else {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                }
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 1;
                    if (i9 != 0) {
                        bj4VarO.K(-1483115004);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new dp0(i13);
                            bj4VarO.C(objF5);
                        }
                        oh4Var3 = (oh4) objF5;
                        bj4VarO.U(false);
                    }
                    oh4Var4 = oh4Var3;
                    if (i11 != 0) {
                        ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                    }
                    bj4VarO.K(-1483112089);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new jw0();
                        bj4VarO.C(objF);
                    }
                    fw0Var = (fw0) objF;
                    bj4VarO.U(false);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        c33 c33Var8 = wd3.a;
                        objF2 = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF2;
                    ox6 ox6VarA8 = kw0.a(ox6Var2, fw0Var);
                    ox6Var3 = ox6Var2;
                    bj4VarO.K(-1483104376);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB8 = p84.b(ox6VarA8, (oh4) objF3);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarB8);
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
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf8 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf8);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    answer4 = answer3;
                    ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                    if (i14 == 1) {
                        i15 = 3;
                    } else {
                        if (i14 == 2) {
                            i16 = 6;
                        } else if (i14 == 3) {
                            i16 = 4;
                        } else if (i14 != 4) {
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        i15 = i16;
                    }
                    if (answer4 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    bj4VarO.K(1720965522);
                    if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = shortTextQuestionModel.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(1720974793);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context8 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        PhoneNumberValidator.loadCountryAreaCodes(context8);
                        localeCompat = UtilsKt.getLocaleCompat(context8);
                        if (answer4 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            public final void invoke(jt1 jt1Var2, int i115) {
                                if ((i115 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                        placeholder = "+1 123 456 7890";
                    } else {
                        fr1VarB = null;
                    }
                    String str8 = answer5;
                    bj4VarO.U(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA8 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    if (shortTextQuestionModel.getEnabled()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    boolean enabled8 = shortTextQuestionModel.getEnabled();
                    bj4VarO.K(1721007965);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF4 = bj4VarO.f();
                    if (z2) {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    TextInputPillKt.m507TextInputPillg5ZjG94(str8, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA8, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled8, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    validationType = shortTextQuestionModel.getValidationType();
                    bj4Var.K(1721044754);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue14 = characterLimit.intValue();
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(answer4.getLength());
                            sb14.append('/');
                            sb14.append(iIntValue14);
                            mia.b(sb14.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar15 = g2b.a;
                        }
                    } else {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue15 = characterLimit.intValue();
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append(answer4.getLength());
                            sb15.append('/');
                            sb15.append(iIntValue15);
                            mia.b(sb15.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar16 = g2b.a;
                        }
                    }
                    bj4Var.U(false);
                    bj4Var.K(1721063955);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strF8 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i115 = IntercomTheme.$stable;
                        mia.b(strF8, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme8, bj4Var, i115), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme8.getTypography(bj4Var, i115).getType04(), bj4Var, 48, 0, 131064);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var2;
                    ox6Var4 = ox6Var3;
                    answer6 = answer4;
                } else {
                    aVar = ox6.a.t;
                    if (i17 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 1;
                    if (i9 != 0) {
                        bj4VarO.K(-1483115004);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new dp0(i13);
                            bj4VarO.C(objF5);
                        }
                        oh4Var3 = (oh4) objF5;
                        bj4VarO.U(false);
                    }
                    oh4Var4 = oh4Var3;
                    if (i11 != 0) {
                        ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                    }
                    bj4VarO.K(-1483112089);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new jw0();
                        bj4VarO.C(objF);
                    }
                    fw0Var = (fw0) objF;
                    bj4VarO.U(false);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        c33 c33Var9 = wd3.a;
                        objF2 = m78.a(bj4VarO.x(), bj4VarO);
                    }
                    t72Var = (t72) objF2;
                    ox6 ox6VarA9 = kw0.a(ox6Var2, fw0Var);
                    ox6Var3 = ox6Var2;
                    bj4VarO.K(-1483104376);
                    zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: qn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarB9 = p84.b(ox6VarA9, (oh4) objF3);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarB9);
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
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf9 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf9);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    answer4 = answer3;
                    ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                    if (i14 == 1) {
                        i15 = 3;
                    } else {
                        if (i14 == 2) {
                            i16 = 6;
                        } else if (i14 == 3) {
                            i16 = 4;
                        } else if (i14 != 4) {
                            i15 = 1;
                        } else {
                            i15 = 3;
                        }
                        i15 = i16;
                    }
                    if (answer4 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    bj4VarO.K(1720965522);
                    if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = shortTextQuestionModel.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(1720974793);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context9 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        PhoneNumberValidator.loadCountryAreaCodes(context9);
                        localeCompat = UtilsKt.getLocaleCompat(context9);
                        if (answer4 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            public final void invoke(jt1 jt1Var2, int i116) {
                                if ((i116 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                        placeholder = "+1 123 456 7890";
                    } else {
                        fr1VarB = null;
                    }
                    String str9 = answer5;
                    bj4VarO.U(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA9 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    if (shortTextQuestionModel.getEnabled()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    boolean enabled9 = shortTextQuestionModel.getEnabled();
                    bj4VarO.K(1721007965);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF4 = bj4VarO.f();
                    if (z2) {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    } else {
                        oh4Var5 = oh4Var;
                        objF4 = new oh4() { // from class: rn9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    TextInputPillKt.m507TextInputPillg5ZjG94(str9, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA9, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled9, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    validationType = shortTextQuestionModel.getValidationType();
                    bj4Var.K(1721044754);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue16 = characterLimit.intValue();
                            StringBuilder sb16 = new StringBuilder();
                            sb16.append(answer4.getLength());
                            sb16.append('/');
                            sb16.append(iIntValue16);
                            mia.b(sb16.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar17 = g2b.a;
                        }
                    } else {
                        characterLimit = shortTextQuestionModel.getCharacterLimit();
                        if (characterLimit != null) {
                            int iIntValue17 = characterLimit.intValue();
                            StringBuilder sb17 = new StringBuilder();
                            sb17.append(answer4.getLength());
                            sb17.append('/');
                            sb17.append(iIntValue17);
                            mia.b(sb17.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                            g2b g2bVar18 = g2b.a;
                        }
                    }
                    bj4Var.U(false);
                    bj4Var.K(1721063955);
                    if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strF9 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i116 = IntercomTheme.$stable;
                        mia.b(strF9, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme9, bj4Var, i116), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme9.getTypography(bj4Var, i116).getType04(), bj4Var, 48, 0, 131064);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var2;
                    ox6Var4 = ox6Var3;
                    answer6 = answer4;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var11 = oh4Var5;
                    xj8VarW.d = new ci4() { // from class: sn9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue18 = ((Integer) obj2).intValue();
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var11, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue18);
                        }
                    };
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(validationError)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                i3 |= 1572864;
                oh4Var3 = oh4Var2;
            } else {
                oh4Var3 = oh4Var2;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(oh4Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i3 |= 12582912;
                ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
            } else {
                ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
            }
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i17 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 1;
                if (i9 != 0) {
                    bj4VarO.K(-1483115004);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new dp0(i13);
                        bj4VarO.C(objF5);
                    }
                    oh4Var3 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                oh4Var4 = oh4Var3;
                if (i11 != 0) {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                }
                bj4VarO.K(-1483112089);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw0();
                    bj4VarO.C(objF);
                }
                fw0Var = (fw0) objF;
                bj4VarO.U(false);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var10 = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                ox6 ox6VarA10 = kw0.a(ox6Var2, fw0Var);
                ox6Var3 = ox6Var2;
                bj4VarO.K(-1483104376);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarB10 = p84.b(ox6VarA10, (oh4) objF3);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB10);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf10 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf10);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                answer4 = answer3;
                ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                if (i14 == 1) {
                    i15 = 3;
                } else {
                    if (i14 == 2) {
                        i16 = 6;
                    } else if (i14 == 3) {
                        i16 = 4;
                    } else if (i14 != 4) {
                        i15 = 1;
                    } else {
                        i15 = 3;
                    }
                    i15 = i16;
                }
                if (answer4 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                bj4VarO.K(1720965522);
                if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = shortTextQuestionModel.getPlaceholder();
                }
                bj4VarO.U(false);
                bj4VarO.K(1720974793);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context10 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    PhoneNumberValidator.loadCountryAreaCodes(context10);
                    localeCompat = UtilsKt.getLocaleCompat(context10);
                    if (answer4 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        public final void invoke(jt1 jt1Var2, int i117) {
                            if ((i117 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    placeholder = "+1 123 456 7890";
                } else {
                    fr1VarB = null;
                }
                String str10 = answer5;
                bj4VarO.U(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA10 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                if (shortTextQuestionModel.getEnabled()) {
                    z = false;
                } else {
                    z = false;
                }
                boolean enabled10 = shortTextQuestionModel.getEnabled();
                bj4VarO.K(1721007965);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF4 = bj4VarO.f();
                if (z2) {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                TextInputPillKt.m507TextInputPillg5ZjG94(str10, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA10, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled10, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                validationType = shortTextQuestionModel.getValidationType();
                bj4Var.K(1721044754);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue18 = characterLimit.intValue();
                        StringBuilder sb18 = new StringBuilder();
                        sb18.append(answer4.getLength());
                        sb18.append('/');
                        sb18.append(iIntValue18);
                        mia.b(sb18.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar19 = g2b.a;
                    }
                } else {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue19 = characterLimit.intValue();
                        StringBuilder sb19 = new StringBuilder();
                        sb19.append(answer4.getLength());
                        sb19.append('/');
                        sb19.append(iIntValue19);
                        mia.b(sb19.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar110 = g2b.a;
                    }
                }
                bj4Var.U(false);
                bj4Var.K(1721063955);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strF10 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                    int i117 = IntercomTheme.$stable;
                    mia.b(strF10, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme10, bj4Var, i117), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme10.getTypography(bj4Var, i117).getType04(), bj4Var, 48, 0, 131064);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var2;
                ox6Var4 = ox6Var3;
                answer6 = answer4;
            } else {
                aVar = ox6.a.t;
                if (i17 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 1;
                if (i9 != 0) {
                    bj4VarO.K(-1483115004);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new dp0(i13);
                        bj4VarO.C(objF5);
                    }
                    oh4Var3 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                oh4Var4 = oh4Var3;
                if (i11 != 0) {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                }
                bj4VarO.K(-1483112089);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw0();
                    bj4VarO.C(objF);
                }
                fw0Var = (fw0) objF;
                bj4VarO.U(false);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var11 = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                ox6 ox6VarA11 = kw0.a(ox6Var2, fw0Var);
                ox6Var3 = ox6Var2;
                bj4VarO.K(-1483104376);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarB11 = p84.b(ox6VarA11, (oh4) objF3);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB11);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf11 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf11);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                answer4 = answer3;
                ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                if (i14 == 1) {
                    i15 = 3;
                } else {
                    if (i14 == 2) {
                        i16 = 6;
                    } else if (i14 == 3) {
                        i16 = 4;
                    } else if (i14 != 4) {
                        i15 = 1;
                    } else {
                        i15 = 3;
                    }
                    i15 = i16;
                }
                if (answer4 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                bj4VarO.K(1720965522);
                if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = shortTextQuestionModel.getPlaceholder();
                }
                bj4VarO.U(false);
                bj4VarO.K(1720974793);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context11 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    PhoneNumberValidator.loadCountryAreaCodes(context11);
                    localeCompat = UtilsKt.getLocaleCompat(context11);
                    if (answer4 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        public final void invoke(jt1 jt1Var2, int i118) {
                            if ((i118 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    placeholder = "+1 123 456 7890";
                } else {
                    fr1VarB = null;
                }
                String str11 = answer5;
                bj4VarO.U(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA11 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                if (shortTextQuestionModel.getEnabled()) {
                    z = false;
                } else {
                    z = false;
                }
                boolean enabled11 = shortTextQuestionModel.getEnabled();
                bj4VarO.K(1721007965);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF4 = bj4VarO.f();
                if (z2) {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                TextInputPillKt.m507TextInputPillg5ZjG94(str11, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled11, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                validationType = shortTextQuestionModel.getValidationType();
                bj4Var.K(1721044754);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue110 = characterLimit.intValue();
                        StringBuilder sb110 = new StringBuilder();
                        sb110.append(answer4.getLength());
                        sb110.append('/');
                        sb110.append(iIntValue110);
                        mia.b(sb110.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar111 = g2b.a;
                    }
                } else {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue111 = characterLimit.intValue();
                        StringBuilder sb111 = new StringBuilder();
                        sb111.append(answer4.getLength());
                        sb111.append('/');
                        sb111.append(iIntValue111);
                        mia.b(sb111.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar112 = g2b.a;
                    }
                }
                bj4Var.U(false);
                bj4Var.K(1721063955);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strF11 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i118 = IntercomTheme.$stable;
                    mia.b(strF11, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme11, bj4Var, i118), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme11.getTypography(bj4Var, i118).getType04(), bj4Var, 48, 0, 131064);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var2;
                ox6Var4 = ox6Var3;
                answer6 = answer4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var12 = oh4Var5;
                xj8VarW.d = new ci4() { // from class: sn9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue112 = ((Integer) obj2).intValue();
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var12, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue112);
                    }
                };
            }
        }
        i3 |= 384;
        answer2 = answer;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bj4VarO.j(oh4Var)) {
                i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 16) != 0) {
            if ((i & 24576) == 0) {
                if (bj4VarO.J(surveyUiColors)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(validationError)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            i9 = i2 & 64;
            if (i9 != 0) {
                i3 |= 1572864;
                oh4Var3 = oh4Var2;
            } else {
                oh4Var3 = oh4Var2;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.j(oh4Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i3 |= 12582912;
                ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
            } else {
                ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
            }
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i17 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 1;
                if (i9 != 0) {
                    bj4VarO.K(-1483115004);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new dp0(i13);
                        bj4VarO.C(objF5);
                    }
                    oh4Var3 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                oh4Var4 = oh4Var3;
                if (i11 != 0) {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                }
                bj4VarO.K(-1483112089);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw0();
                    bj4VarO.C(objF);
                }
                fw0Var = (fw0) objF;
                bj4VarO.U(false);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var12 = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                ox6 ox6VarA12 = kw0.a(ox6Var2, fw0Var);
                ox6Var3 = ox6Var2;
                bj4VarO.K(-1483104376);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarB12 = p84.b(ox6VarA12, (oh4) objF3);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB12);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf12 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf12);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                answer4 = answer3;
                ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                if (i14 == 1) {
                    i15 = 3;
                } else {
                    if (i14 == 2) {
                        i16 = 6;
                    } else if (i14 == 3) {
                        i16 = 4;
                    } else if (i14 != 4) {
                        i15 = 1;
                    } else {
                        i15 = 3;
                    }
                    i15 = i16;
                }
                if (answer4 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                bj4VarO.K(1720965522);
                if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = shortTextQuestionModel.getPlaceholder();
                }
                bj4VarO.U(false);
                bj4VarO.K(1720974793);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context12 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    PhoneNumberValidator.loadCountryAreaCodes(context12);
                    localeCompat = UtilsKt.getLocaleCompat(context12);
                    if (answer4 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        public final void invoke(jt1 jt1Var2, int i119) {
                            if ((i119 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    placeholder = "+1 123 456 7890";
                } else {
                    fr1VarB = null;
                }
                String str12 = answer5;
                bj4VarO.U(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA12 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                if (shortTextQuestionModel.getEnabled()) {
                    z = false;
                } else {
                    z = false;
                }
                boolean enabled12 = shortTextQuestionModel.getEnabled();
                bj4VarO.K(1721007965);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF4 = bj4VarO.f();
                if (z2) {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                TextInputPillKt.m507TextInputPillg5ZjG94(str12, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA12, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled12, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                validationType = shortTextQuestionModel.getValidationType();
                bj4Var.K(1721044754);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue112 = characterLimit.intValue();
                        StringBuilder sb112 = new StringBuilder();
                        sb112.append(answer4.getLength());
                        sb112.append('/');
                        sb112.append(iIntValue112);
                        mia.b(sb112.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar113 = g2b.a;
                    }
                } else {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue113 = characterLimit.intValue();
                        StringBuilder sb113 = new StringBuilder();
                        sb113.append(answer4.getLength());
                        sb113.append('/');
                        sb113.append(iIntValue113);
                        mia.b(sb113.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar114 = g2b.a;
                    }
                }
                bj4Var.U(false);
                bj4Var.K(1721063955);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strF12 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i119 = IntercomTheme.$stable;
                    mia.b(strF12, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme12, bj4Var, i119), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme12.getTypography(bj4Var, i119).getType04(), bj4Var, 48, 0, 131064);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var2;
                ox6Var4 = ox6Var3;
                answer6 = answer4;
            } else {
                aVar = ox6.a.t;
                if (i17 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 1;
                if (i9 != 0) {
                    bj4VarO.K(-1483115004);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new dp0(i13);
                        bj4VarO.C(objF5);
                    }
                    oh4Var3 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                oh4Var4 = oh4Var3;
                if (i11 != 0) {
                    ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
                }
                bj4VarO.K(-1483112089);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new jw0();
                    bj4VarO.C(objF);
                }
                fw0Var = (fw0) objF;
                bj4VarO.U(false);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var13 = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                ox6 ox6VarA13 = kw0.a(ox6Var2, fw0Var);
                ox6Var3 = ox6Var2;
                bj4VarO.K(-1483104376);
                zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: qn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                ox6 ox6VarB13 = p84.b(ox6VarA13, (oh4) objF3);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB13);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf13 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf13);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                answer4 = answer3;
                ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
                if (i14 == 1) {
                    i15 = 3;
                } else {
                    if (i14 == 2) {
                        i16 = 6;
                    } else if (i14 == 3) {
                        i16 = 4;
                    } else if (i14 != 4) {
                        i15 = 1;
                    } else {
                        i15 = 3;
                    }
                    i15 = i16;
                }
                if (answer4 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                bj4VarO.K(1720965522);
                if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = shortTextQuestionModel.getPlaceholder();
                }
                bj4VarO.U(false);
                bj4VarO.K(1720974793);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context13 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    PhoneNumberValidator.loadCountryAreaCodes(context13);
                    localeCompat = UtilsKt.getLocaleCompat(context13);
                    if (answer4 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        public final void invoke(jt1 jt1Var2, int i1110) {
                            if ((i1110 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    placeholder = "+1 123 456 7890";
                } else {
                    fr1VarB = null;
                }
                String str13 = answer5;
                bj4VarO.U(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA13 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                if (shortTextQuestionModel.getEnabled()) {
                    z = false;
                } else {
                    z = false;
                }
                boolean enabled13 = shortTextQuestionModel.getEnabled();
                bj4VarO.K(1721007965);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF4 = bj4VarO.f();
                if (z2) {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                } else {
                    oh4Var5 = oh4Var;
                    objF4 = new oh4() { // from class: rn9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                TextInputPillKt.m507TextInputPillg5ZjG94(str13, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA13, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled13, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                validationType = shortTextQuestionModel.getValidationType();
                bj4Var.K(1721044754);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue114 = characterLimit.intValue();
                        StringBuilder sb114 = new StringBuilder();
                        sb114.append(answer4.getLength());
                        sb114.append('/');
                        sb114.append(iIntValue114);
                        mia.b(sb114.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar115 = g2b.a;
                    }
                } else {
                    characterLimit = shortTextQuestionModel.getCharacterLimit();
                    if (characterLimit != null) {
                        int iIntValue115 = characterLimit.intValue();
                        StringBuilder sb115 = new StringBuilder();
                        sb115.append(answer4.getLength());
                        sb115.append('/');
                        sb115.append(iIntValue115);
                        mia.b(sb115.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                        g2b g2bVar116 = g2b.a;
                    }
                }
                bj4Var.U(false);
                bj4Var.K(1721063955);
                if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strF13 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i1110 = IntercomTheme.$stable;
                    mia.b(strF13, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme13, bj4Var, i1110), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme13.getTypography(bj4Var, i1110).getType04(), bj4Var, 48, 0, 131064);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var2;
                ox6Var4 = ox6Var3;
                answer6 = answer4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var13 = oh4Var5;
                xj8VarW.d = new ci4() { // from class: sn9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue116 = ((Integer) obj2).intValue();
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var13, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue116);
                    }
                };
            }
        }
        i3 |= 24576;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (bj4VarO.J(validationError)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
            oh4Var3 = oh4Var2;
        } else {
            oh4Var3 = oh4Var2;
            if ((i & 1572864) == 0) {
                if (bj4VarO.j(oh4Var3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
        }
        i11 = i2 & 128;
        if (i11 != 0) {
            i3 |= 12582912;
            ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
        } else {
            ci4VarM497getLambda1$intercom_sdk_base_release = ci4Var;
            if ((i & 12582912) == 0) {
                if (bj4VarO.j(ci4VarM497getLambda1$intercom_sdk_base_release)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i3 |= i12;
            }
        }
        if ((i3 & 4793491) == 4793490) {
            aVar = ox6.a.t;
            if (i17 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            c0187a = jt1.a.a;
            i13 = 1;
            if (i9 != 0) {
                bj4VarO.K(-1483115004);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new dp0(i13);
                    bj4VarO.C(objF5);
                }
                oh4Var3 = (oh4) objF5;
                bj4VarO.U(false);
            }
            oh4Var4 = oh4Var3;
            if (i11 != 0) {
                ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
            }
            bj4VarO.K(-1483112089);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = new jw0();
                bj4VarO.C(objF);
            }
            fw0Var = (fw0) objF;
            bj4VarO.U(false);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                c33 c33Var14 = wd3.a;
                objF2 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF2;
            ox6 ox6VarA14 = kw0.a(ox6Var2, fw0Var);
            ox6Var3 = ox6Var2;
            bj4VarO.K(-1483104376);
            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
            objF3 = bj4VarO.f();
            if (zJ) {
                objF3 = new oh4() { // from class: qn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new oh4() { // from class: qn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            ox6 ox6VarB14 = p84.b(ox6VarA14, (oh4) objF3);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarB14);
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
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf14 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf14);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            answer4 = answer3;
            ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
            if (i14 == 1) {
                i15 = 3;
            } else {
                if (i14 == 2) {
                    i16 = 6;
                } else if (i14 == 3) {
                    i16 = 4;
                } else if (i14 != 4) {
                    i15 = 1;
                } else {
                    i15 = 3;
                }
                i15 = i16;
            }
            if (answer4 instanceof Answer.SingleAnswer) {
                answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
            } else {
                answer5 = BuildConfig.FLAVOR;
            }
            bj4VarO.K(1720965522);
            if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = shortTextQuestionModel.getPlaceholder();
            }
            bj4VarO.U(false);
            bj4VarO.K(1720974793);
            if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                Context context14 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                PhoneNumberValidator.loadCountryAreaCodes(context14);
                localeCompat = UtilsKt.getLocaleCompat(context14);
                if (answer4 instanceof Answer.NoAnswer) {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                } else {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                }
                if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                    answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                }
                fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                    public final void invoke(jt1 jt1Var2, int i1111) {
                        if ((i1111 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                placeholder = "+1 123 456 7890";
            } else {
                fr1VarB = null;
            }
            String str14 = answer5;
            bj4VarO.U(false);
            if (validationError instanceof ValidationError.ValidationStringError) {
                uh1Var = null;
            } else {
                uh1Var = null;
            }
            long jM836getAccessibleColorOnWhiteBackground8_81llA14 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
            if (shortTextQuestionModel.getEnabled()) {
                z = false;
            } else {
                z = false;
            }
            boolean enabled14 = shortTextQuestionModel.getEnabled();
            bj4VarO.K(1721007965);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objF4 = bj4VarO.f();
            if (z2) {
                oh4Var5 = oh4Var;
                objF4 = new oh4() { // from class: rn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                    }
                };
                bj4VarO.C(objF4);
            } else {
                oh4Var5 = oh4Var;
                objF4 = new oh4() { // from class: rn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                    }
                };
                bj4VarO.C(objF4);
            }
            bj4VarO.U(false);
            TextInputPillKt.m507TextInputPillg5ZjG94(str14, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA14, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled14, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
            oh4Var6 = oh4Var4;
            bj4Var = bj4VarO;
            validationType = shortTextQuestionModel.getValidationType();
            bj4Var.K(1721044754);
            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                characterLimit = shortTextQuestionModel.getCharacterLimit();
                if (characterLimit != null) {
                    int iIntValue116 = characterLimit.intValue();
                    StringBuilder sb116 = new StringBuilder();
                    sb116.append(answer4.getLength());
                    sb116.append('/');
                    sb116.append(iIntValue116);
                    mia.b(sb116.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                    g2b g2bVar117 = g2b.a;
                }
            } else {
                characterLimit = shortTextQuestionModel.getCharacterLimit();
                if (characterLimit != null) {
                    int iIntValue117 = characterLimit.intValue();
                    StringBuilder sb117 = new StringBuilder();
                    sb117.append(answer4.getLength());
                    sb117.append('/');
                    sb117.append(iIntValue117);
                    mia.b(sb117.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                    g2b g2bVar118 = g2b.a;
                }
            }
            bj4Var.U(false);
            bj4Var.K(1721063955);
            if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                String strF14 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                int i1111 = IntercomTheme.$stable;
                mia.b(strF14, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme14, bj4Var, i1111), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme14.getTypography(bj4Var, i1111).getType04(), bj4Var, 48, 0, 131064);
            }
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.U(true);
            ci4Var3 = ci4Var2;
            ox6Var4 = ox6Var3;
            answer6 = answer4;
        } else {
            aVar = ox6.a.t;
            if (i17 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            c0187a = jt1.a.a;
            i13 = 1;
            if (i9 != 0) {
                bj4VarO.K(-1483115004);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new dp0(i13);
                    bj4VarO.C(objF5);
                }
                oh4Var3 = (oh4) objF5;
                bj4VarO.U(false);
            }
            oh4Var4 = oh4Var3;
            if (i11 != 0) {
                ci4VarM497getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m497getLambda1$intercom_sdk_base_release();
            }
            bj4VarO.K(-1483112089);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = new jw0();
                bj4VarO.C(objF);
            }
            fw0Var = (fw0) objF;
            bj4VarO.U(false);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                c33 c33Var15 = wd3.a;
                objF2 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF2;
            ox6 ox6VarA15 = kw0.a(ox6Var2, fw0Var);
            ox6Var3 = ox6Var2;
            bj4VarO.K(-1483104376);
            zJ = bj4VarO.j(t72Var) | bj4VarO.j(fw0Var);
            objF3 = bj4VarO.f();
            if (zJ) {
                objF3 = new oh4() { // from class: qn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new oh4() { // from class: qn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$4$lambda$3(t72Var, fw0Var, (v94) obj);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            ox6 ox6VarB15 = p84.b(ox6VarA15, (oh4) objF3);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarB15);
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
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf15 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf15);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            answer4 = answer3;
            ci4Var2 = ci4VarM497getLambda1$intercom_sdk_base_release;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4Var2.invoke(bj4VarO, Integer.valueOf((i3 >> 21) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            i14 = WhenMappings.$EnumSwitchMapping$0[shortTextQuestionModel.getValidationType().ordinal()];
            if (i14 == 1) {
                i15 = 3;
            } else {
                if (i14 == 2) {
                    i16 = 6;
                } else if (i14 == 3) {
                    i16 = 4;
                } else if (i14 != 4) {
                    i15 = 1;
                } else {
                    i15 = 3;
                }
                i15 = i16;
            }
            if (answer4 instanceof Answer.SingleAnswer) {
                answer5 = ((Answer.SingleAnswer) answer4).getAnswer();
            } else {
                answer5 = BuildConfig.FLAVOR;
            }
            bj4VarO.K(1720965522);
            if (shortTextQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = nr1.f(bj4VarO, shortTextQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = shortTextQuestionModel.getPlaceholder();
            }
            bj4VarO.U(false);
            bj4VarO.K(1720974793);
            if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                Context context15 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                PhoneNumberValidator.loadCountryAreaCodes(context15);
                localeCompat = UtilsKt.getLocaleCompat(context15);
                if (answer4 instanceof Answer.NoAnswer) {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer5));
                } else {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                }
                if (answer4 instanceof Answer.NoAnswer.InitialNoAnswer) {
                    answer5 = "+" + countryAreaCodeFromLocale.getDialCode();
                }
                fr1VarB = gr1.b(854302399, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                    public final void invoke(jt1 jt1Var2, int i1112) {
                        if ((i1112 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(countryAreaCodeFromLocale.getEmoji(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                placeholder = "+1 123 456 7890";
            } else {
                fr1VarB = null;
            }
            String str15 = answer5;
            bj4VarO.U(false);
            if (validationError instanceof ValidationError.ValidationStringError) {
                uh1Var = null;
            } else {
                uh1Var = null;
            }
            long jM836getAccessibleColorOnWhiteBackground8_81llA15 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
            if (shortTextQuestionModel.getEnabled()) {
                z = false;
            } else {
                z = false;
            }
            boolean enabled15 = shortTextQuestionModel.getEnabled();
            bj4VarO.K(1721007965);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objF4 = bj4VarO.f();
            if (z2) {
                oh4Var5 = oh4Var;
                objF4 = new oh4() { // from class: rn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                    }
                };
                bj4VarO.C(objF4);
            } else {
                oh4Var5 = oh4Var;
                objF4 = new oh4() { // from class: rn9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4Var5, (String) obj);
                    }
                };
                bj4VarO.C(objF4);
            }
            bj4VarO.U(false);
            TextInputPillKt.m507TextInputPillg5ZjG94(str15, placeholder, (oh4) objF4, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA15, 0, true, oh4Var4, i15, 6, z, fr1VarB, enabled15, 0.0f, bj4VarO, ((i3 << 3) & 29360128) | 806879232, 0, 8224);
            oh4Var6 = oh4Var4;
            bj4Var = bj4VarO;
            validationType = shortTextQuestionModel.getValidationType();
            bj4Var.K(1721044754);
            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                characterLimit = shortTextQuestionModel.getCharacterLimit();
                if (characterLimit != null) {
                    int iIntValue118 = characterLimit.intValue();
                    StringBuilder sb118 = new StringBuilder();
                    sb118.append(answer4.getLength());
                    sb118.append('/');
                    sb118.append(iIntValue118);
                    mia.b(sb118.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                    g2b g2bVar119 = g2b.a;
                }
            } else {
                characterLimit = shortTextQuestionModel.getCharacterLimit();
                if (characterLimit != null) {
                    int iIntValue119 = characterLimit.intValue();
                    StringBuilder sb119 = new StringBuilder();
                    sb119.append(answer4.getLength());
                    sb119.append('/');
                    sb119.append(iIntValue119);
                    mia.b(sb119.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable), cka.b(12), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24576, 0, 262120);
                    g2b g2bVar1110 = g2b.a;
                }
            }
            bj4Var.U(false);
            bj4Var.K(1721063955);
            if (shortTextQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                String strF15 = nr1.f(bj4Var, R.string.intercom_tickets_email_copy);
                IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                int i1112 = IntercomTheme.$stable;
                mia.b(strF15, eo7.m(aVar, 0.0f, 4.0f, 0.0f, 0.0f, 13), ac4.b(intercomTheme15, bj4Var, i1112), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme15.getTypography(bj4Var, i1112).getType04(), bj4Var, 48, 0, 131064);
            }
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.U(true);
            ci4Var3 = ci4Var2;
            ox6Var4 = ox6Var3;
            answer6 = answer4;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final oh4 oh4Var14 = oh4Var5;
            xj8VarW.d = new ci4() { // from class: sn9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue1110 = ((Integer) obj2).intValue();
                    return ShortTextQuestionKt.ShortTextQuestion$lambda$10(ox6Var4, shortTextQuestionModel, answer6, oh4Var14, surveyUiColors, validationError, oh4Var6, ci4Var3, i, i2, (jt1) obj, iIntValue1110);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextQuestion$lambda$1$lambda$0(ap5 ap5Var) {
        ap5Var.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextQuestion$lambda$10(ox6 ox6Var, SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel, Answer answer, oh4 oh4Var, SurveyUiColors surveyUiColors, ValidationError validationError, oh4 oh4Var2, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        ShortTextQuestion(ox6Var, shortTextQuestionModel, answer, oh4Var, surveyUiColors, validationError, oh4Var2, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextQuestion$lambda$4$lambda$3(t72 t72Var, fw0 fw0Var, v94 v94Var) {
        v94Var.getClass();
        if (v94Var.e()) {
            oy0.d(t72Var, null, null, new ShortTextQuestionKt$ShortTextQuestion$2$1$1(fw0Var, null), 3);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ShortTextQuestion$lambda$9$lambda$8$lambda$6$lambda$5(oh4 oh4Var, String str) {
        str.getClass();
        if (str.length() > 0) {
            oh4Var.invoke(new Answer.SingleAnswer(str));
        } else {
            oh4Var.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        }
        return g2b.a;
    }
}
