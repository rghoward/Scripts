package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ca0;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.eg5;
import defpackage.eo7;
import defpackage.fg5;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gf3;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kc1;
import defpackage.kk;
import defpackage.kt6;
import defpackage.kw7;
import defpackage.l02;
import defpackage.lt6;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.pk;
import defpackage.qr5;
import defpackage.r02;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.tf5;
import defpackage.u;
import defpackage.u30;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xr9;
import defpackage.xs;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NumericRatingQuestionKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.UNSUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.STARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void EmojiRatingQuestionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1678291132);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI, new Answer.SingleAnswer("4"), bj4VarO, 438);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kc1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmojiRatingQuestionPreview$lambda$16(int i, jt1 jt1Var, int i2) {
        EmojiRatingQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void GeneratePreview(final int i, final int i2, final SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, final Answer answer, jt1 jt1Var, final int i3) {
        int i4;
        bj4 bj4VarO = jt1Var.o(-1397971036);
        if ((i3 & 6) == 0) {
            i4 = (bj4VarO.h(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bj4VarO.h(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bj4VarO.J(questionSubType) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bj4VarO.J(answer) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i4 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-2103292486, new AnonymousClass1(questionSubType, i, i2, answer), bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: be7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NumericRatingQuestionKt.GeneratePreview$lambda$17(i, i2, questionSubType, answer, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GeneratePreview$lambda$17(int i, int i2, SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, Answer answer, int i3, jt1 jt1Var, int i4) {
        GeneratePreview(i, i2, questionSubType, answer, jt1Var, gz3.s(i3 | 1));
        return g2b.a;
    }

    public static final void NPSQuestionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-752808306);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            GeneratePreview(0, 10, SurveyData.Step.Question.QuestionData.QuestionSubType.NPS, new Answer.SingleAnswer("4"), bj4VarO, 438);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kt6(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NPSQuestionPreview$lambda$14(int i, jt1 jt1Var, int i2) {
        NPSQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x032c  */
    /* JADX WARN: Code duplicated, block: B:153:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x056e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0597  */
    /* JADX WARN: Code duplicated, block: B:227:0x059e  */
    /* JADX WARN: Code duplicated, block: B:228:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:231:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:233:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0659  */
    /* JADX WARN: Code duplicated, block: B:238:0x065e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0675  */
    /* JADX WARN: Code duplicated, block: B:246:0x0691  */
    /* JADX WARN: Code duplicated, block: B:248:0x0696  */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0199  */
    /* JADX WARN: Code duplicated, block: B:98:0x019c  */
    /* JADX WARN: Instruction removed from duplicated block: B:233:0x05dc, please report this as an issue */
    public static final void NumericRatingQuestion(ox6 ox6Var, final SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, final oh4<? super Answer, g2b> oh4Var, final SurveyUiColors surveyUiColors, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        int i4;
        Answer answer2;
        int i5;
        int i6;
        int i7;
        int i8;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        int i9;
        ox6.a aVar;
        Answer answer3;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM493getLambda1$intercom_sdk_base_release;
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
        int iHashCode2;
        kw7 kw7VarP2;
        ox6.a aVar3;
        ox6 ox6VarC2;
        int i10;
        int i11;
        r02 r02Var;
        int iCeil;
        ArrayList arrayList;
        ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        ox6.a aVar4;
        int i12;
        boolean z;
        Answer answer4;
        boolean z2;
        final ox6 ox6Var3;
        final Answer answer5;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var4;
        ny8 ny8VarA;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        qr5.a aVar5;
        List listI;
        xj8 xj8VarW;
        numericRatingQuestionModel.getClass();
        oh4Var.getClass();
        surveyUiColors.getClass();
        bj4 bj4VarO = jt1Var.o(-1325570147);
        j1b j1bVar = bj4VarO.a;
        int i13 = i2 & 1;
        if (i13 != 0) {
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
                i3 |= bj4VarO.j(numericRatingQuestionModel) ? 32 : 16;
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
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            ci4Var2 = ci4Var;
                            if (bj4VarO.j(ci4Var2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 74899) == 74898 || !bj4VarO.r()) {
                            aVar = ox6.a.t;
                            if (i13 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            if (i8 != 0) {
                                ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                            ox6 ox6Var4 = ox6Var2;
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode2 = Long.hashCode(bj4VarO.T);
                            kw7VarP2 = bj4VarO.P();
                            aVar3 = aVar;
                            ox6VarC2 = it1.c(bj4VarO, aVar3);
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            int i14 = i3;
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar2);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, cVar, aj1VarA);
                            rd7.d(bj4VarO, eVar, kw7VarP2);
                            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                            rd7.d(bj4VarO, dVar, ox6VarC2);
                            ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 15) & 14));
                            b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                            i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                            jt1.a.C0187a c0187a = jt1.a.a;
                            sp0.b bVar2 = di.a.j;
                            if (i10 != 1) {
                                if (i10 != 2 || i10 == 3) {
                                    r02Var = null;
                                    i11 = 1;
                                } else if (i10 == 4) {
                                    bj4VarO.K(124699982);
                                    ox6 ox6VarC4 = ir9.c(aVar3, 1.0f);
                                    ny8 ny8VarA2 = ly8.a(c30.d, bVar2, bj4VarO, 6);
                                    int iHashCode4 = Long.hashCode(bj4VarO.T);
                                    kw7 kw7VarP4 = bj4VarO.P();
                                    ox6 ox6VarC5 = it1.c(bj4VarO, ox6VarC4);
                                    if (j1bVar == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4VarO.q();
                                    ci4<? super jt1, ? super Integer, g2b> ci4Var5 = ci4VarM493getLambda1$intercom_sdk_base_release;
                                    if (bj4VarO.S) {
                                        bj4VarO.k(aVar2);
                                    } else {
                                        bj4VarO.z();
                                    }
                                    rd7.d(bj4VarO, cVar, ny8VarA2);
                                    rd7.d(bj4VarO, eVar, kw7VarP4);
                                    l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                                    rd7.d(bj4VarO, dVar, ox6VarC5);
                                    bj4VarO.K(-1421319712);
                                    Iterator it = numericRatingQuestionModel.getOptions().iterator();
                                    while (it.hasNext()) {
                                        SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) it.next();
                                        ratingOption.getClass();
                                        final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption;
                                        boolean z3 = (answer3 instanceof Answer.SingleAnswer) && numericRatingOption.getValue() <= Integer.parseInt(((Answer.SingleAnswer) answer3).getAnswer());
                                        bj4VarO.K(-1421310379);
                                        long jM836getAccessibleColorOnWhiteBackground8_81llA = z3 ? ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU()) : kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                        bj4VarO.U(false);
                                        long jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jM836getAccessibleColorOnWhiteBackground8_81llA);
                                        float f = z3 ? 2.0f : 1.0f;
                                        ox6 ox6VarI = eo7.i(ir9.d(ir9.n(aVar3, 44.0f), 44.0f), 8.0f);
                                        bj4VarO.K(268698399);
                                        Iterator it2 = it;
                                        int i15 = i14;
                                        boolean zJ = bj4VarO.J(numericRatingOption) | ((i15 & 7168) == 2048);
                                        Object objF = bj4VarO.f();
                                        if (zJ || objF == c0187a) {
                                            objF = new mh4() { // from class: de7
                                                @Override // defpackage.mh4
                                                public final Object invoke() {
                                                    return NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(numericRatingOption, oh4Var);
                                                }
                                            };
                                            bj4VarO.C(objF);
                                        }
                                        bj4VarO.U(false);
                                        StarRatingKt.m495StarRatingtAjK0ZQ(we1.c(ox6VarI, false, null, (mh4) objF, 15), jM836getAccessibleColorOnWhiteBackground8_81llA, f, jM834getAccessibleBorderColor8_81llA, bj4VarO, 0, 0);
                                        i14 = i15;
                                        it = it2;
                                        aVar3 = aVar3;
                                    }
                                    bj4VarO.U(false);
                                    bj4VarO.U(true);
                                    bj4VarO.U(false);
                                    g2b g2bVar = g2b.a;
                                    z = true;
                                    ci4Var3 = ci4Var5;
                                    aVar4 = aVar3;
                                    i12 = 6;
                                    answer4 = answer3;
                                } else {
                                    if (i10 != 5) {
                                        bj4VarO.K(3944733);
                                        bj4VarO.U(false);
                                        u.b();
                                        return;
                                    }
                                    bj4VarO.K(126366697);
                                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options = numericRatingQuestionModel.getOptions();
                                    ArrayList arrayList2 = new ArrayList(ph1.n(options, 10));
                                    for (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption2 : options) {
                                        ratingOption2.getClass();
                                        arrayList2.add((SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) ratingOption2);
                                    }
                                    EmojiQuestionKt.EmojiQuestion(arrayList2, answer3, oh4Var, bj4VarO, (i14 >> 3) & 1008);
                                    bj4VarO.U(false);
                                    g2b g2bVar2 = g2b.a;
                                    answer4 = answer3;
                                    ci4Var3 = ci4VarM493getLambda1$intercom_sdk_base_release;
                                    aVar4 = aVar3;
                                    i12 = 6;
                                    z = true;
                                }
                                bj4VarO.K(4087227);
                                if ((z2a.w(numericRatingQuestionModel.getLowerLabel()) ^ z) && (z2a.w(numericRatingQuestionModel.getUpperLabel()) ^ z)) {
                                    ox6 ox6VarI2 = eo7.i(ir9.c(aVar4, 1.0f), 8.0f);
                                    ny8VarA = ly8.a(c30.f, bVar2, bj4VarO, i12);
                                    iHashCode3 = Long.hashCode(bj4VarO.T);
                                    kw7VarP3 = bj4VarO.P();
                                    ox6VarC3 = it1.c(bj4VarO, ox6VarI2);
                                    bt1.c.getClass();
                                    aVar5 = bt1.a.b;
                                    if (j1bVar != null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    bj4VarO.q();
                                    if (bj4VarO.S) {
                                        bj4VarO.k(aVar5);
                                    } else {
                                        bj4VarO.z();
                                    }
                                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                                    rd7.d(bj4VarO, bt1.a.e, kw7VarP3);
                                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode3));
                                    rd7.c(bj4VarO, bt1.a.h);
                                    rd7.d(bj4VarO, bt1.a.d, ox6VarC3);
                                    if (numericRatingQuestionModel.getQuestionSubType() == SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI) {
                                        listI = ws0.i(numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getUpperLabel());
                                    } else {
                                        listI = ws0.i(numericRatingQuestionModel.getScaleStart() + " - " + numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getScaleEnd() + " - " + numericRatingQuestionModel.getUpperLabel());
                                    }
                                    String str = (String) listI.get(0);
                                    String str2 = (String) listI.get(1);
                                    bj4 bj4Var = bj4VarO;
                                    mia.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 0, 0, 262142);
                                    mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 0, 0, 262142);
                                    bj4VarO = bj4Var;
                                    z2 = true;
                                    bj4VarO.U(true);
                                } else {
                                    z2 = true;
                                }
                                bj4VarO.U(false);
                                bj4VarO.U(z2);
                                bj4VarO.U(z2);
                                ox6Var3 = ox6Var4;
                                answer5 = answer4;
                                ci4Var4 = ci4Var3;
                            } else {
                                i11 = 1;
                                r02Var = null;
                            }
                            int i16 = 0;
                            bj4VarO.K(122317012);
                            double size = numericRatingQuestionModel.getOptions().size();
                            iCeil = (int) Math.ceil(size / ((double) ((int) Math.ceil(size / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                            List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options2 = numericRatingQuestionModel.getOptions();
                            options2.getClass();
                            if (iCeil > 0 || iCeil <= 0) {
                                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                                return;
                            }
                            if (options2 instanceof RandomAccess) {
                                int size2 = options2.size();
                                arrayList = new ArrayList((size2 / iCeil) + (size2 % iCeil == 0 ? 0 : i11));
                                int i17 = 0;
                                while (i17 >= 0 && i17 < size2) {
                                    int i18 = size2 - i17;
                                    if (iCeil <= i18) {
                                        i18 = iCeil;
                                    }
                                    ArrayList arrayList3 = new ArrayList(i18);
                                    for (int i19 = i16; i19 < i18; i19++) {
                                        arrayList3.add(options2.get(i19 + i17));
                                    }
                                    arrayList.add(arrayList3);
                                    i17 += iCeil;
                                    i16 = 0;
                                }
                            } else {
                                arrayList = new ArrayList();
                                Iterator<T> it3 = options2.iterator();
                                it3.getClass();
                                Iterator itB = !it3.hasNext() ? gf3.t : xs.b(new xr9(iCeil, iCeil, it3, r02Var));
                                while (itB.hasNext()) {
                                    arrayList.add((List) itB.next());
                                }
                            }
                            ArrayList arrayList4 = arrayList;
                            int size3 = arrayList4.size();
                            int i20 = 0;
                            while (i20 < size3) {
                                int i21 = i20 + 1;
                                List list = (List) arrayList4.get(i20);
                                ox6.a aVar6 = aVar3;
                                ox6 ox6VarC6 = ir9.c(aVar6, 1.0f);
                                ny8 ny8VarA3 = ly8.a(c30.a.b, bVar2, bj4VarO, 6);
                                int iHashCode5 = Long.hashCode(bj4VarO.T);
                                kw7 kw7VarP5 = bj4VarO.P();
                                ox6 ox6VarC7 = it1.c(bj4VarO, ox6VarC6);
                                bt1.c.getClass();
                                qr5.a aVar7 = bt1.a.b;
                                if (j1bVar == null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4VarO.q();
                                ArrayList arrayList5 = arrayList4;
                                if (bj4VarO.S) {
                                    bj4VarO.k(aVar7);
                                } else {
                                    bj4VarO.z();
                                }
                                rd7.d(bj4VarO, bt1.a.f, ny8VarA3);
                                rd7.d(bj4VarO, bt1.a.e, kw7VarP5);
                                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode5));
                                rd7.c(bj4VarO, bt1.a.h);
                                rd7.d(bj4VarO, bt1.a.d, ox6VarC7);
                                bj4VarO.K(268602154);
                                Iterator it4 = list.iterator();
                                while (it4.hasNext()) {
                                    SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption3 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) it4.next();
                                    ratingOption3.getClass();
                                    final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption2 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption3;
                                    boolean z4 = (answer3 instanceof Answer.SingleAnswer) && xj5.a(((Answer.SingleAnswer) answer3).getAnswer(), String.valueOf(numericRatingOption2.getValue()));
                                    bj4VarO.K(268611604);
                                    long jM836getAccessibleColorOnWhiteBackground8_81llA2 = z4 ? ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU()) : kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                    bj4VarO.U(false);
                                    long j = jM836getAccessibleColorOnWhiteBackground8_81llA2;
                                    long jM834getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j);
                                    float f2 = z4 ? 2.0f : 1.0f;
                                    ob4 ob4Var = z4 ? ob4.B : ob4.y;
                                    String strValueOf = String.valueOf(numericRatingOption2.getValue());
                                    Iterator it5 = it4;
                                    ox6 ox6VarI3 = eo7.i(aVar6, 4.0f);
                                    Answer answer6 = answer3;
                                    bj4VarO.K(-1805377731);
                                    int i22 = size3;
                                    boolean zJ2 = ((i14 & 7168) == 2048) | bj4VarO.J(numericRatingOption2);
                                    Object objF2 = bj4VarO.f();
                                    if (zJ2 || objF2 == c0187a) {
                                        objF2 = new mh4() { // from class: ce7
                                            @Override // defpackage.mh4
                                            public final Object invoke() {
                                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(oh4Var, numericRatingOption2);
                                            }
                                        };
                                        bj4VarO.C(objF2);
                                    }
                                    bj4VarO.U(false);
                                    bj4 bj4Var2 = bj4VarO;
                                    NumericRatingCellKt.m494NumericRatingCelljWvj134(strValueOf, we1.c(ox6VarI3, false, null, (mh4) objF2, 15), jM834getAccessibleBorderColor8_81llA2, f2, j, ob4Var, 0L, 0L, bj4Var2, 0, 192);
                                    aVar6 = aVar6;
                                    bj4VarO = bj4Var2;
                                    it4 = it5;
                                    size3 = i22;
                                    answer3 = answer6;
                                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4VarM493getLambda1$intercom_sdk_base_release;
                                }
                                bj4VarO.U(false);
                                bj4VarO.U(true);
                                i20 = i21;
                                arrayList4 = arrayList5;
                                answer3 = answer3;
                                ci4VarM493getLambda1$intercom_sdk_base_release = ci4VarM493getLambda1$intercom_sdk_base_release;
                                aVar3 = aVar6;
                                size3 = size3;
                            }
                            ci4Var3 = ci4VarM493getLambda1$intercom_sdk_base_release;
                            aVar4 = aVar3;
                            i12 = 6;
                            z = true;
                            answer4 = answer3;
                            bj4VarO.U(false);
                            g2b g2bVar3 = g2b.a;
                            bj4VarO.K(4087227);
                            if ((z2a.w(numericRatingQuestionModel.getLowerLabel()) ^ z) && (z2a.w(numericRatingQuestionModel.getUpperLabel()) ^ z)) {
                                ox6 ox6VarI4 = eo7.i(ir9.c(aVar4, 1.0f), 8.0f);
                                ny8VarA = ly8.a(c30.f, bVar2, bj4VarO, i12);
                                iHashCode3 = Long.hashCode(bj4VarO.T);
                                kw7VarP3 = bj4VarO.P();
                                ox6VarC3 = it1.c(bj4VarO, ox6VarI4);
                                bt1.c.getClass();
                                aVar5 = bt1.a.b;
                                if (j1bVar != null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4VarO.q();
                                if (bj4VarO.S) {
                                    bj4VarO.k(aVar5);
                                } else {
                                    bj4VarO.z();
                                }
                                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                                rd7.d(bj4VarO, bt1.a.e, kw7VarP3);
                                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode3));
                                rd7.c(bj4VarO, bt1.a.h);
                                rd7.d(bj4VarO, bt1.a.d, ox6VarC3);
                                if (numericRatingQuestionModel.getQuestionSubType() == SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI) {
                                    listI = ws0.i(numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getUpperLabel());
                                } else {
                                    listI = ws0.i(numericRatingQuestionModel.getScaleStart() + " - " + numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getScaleEnd() + " - " + numericRatingQuestionModel.getUpperLabel());
                                }
                                String str3 = (String) listI.get(0);
                                String str4 = (String) listI.get(1);
                                bj4 bj4Var3 = bj4VarO;
                                mia.b(str3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var3, 0, 0, 262142);
                                mia.b(str4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var3, 0, 0, 262142);
                                bj4VarO = bj4Var3;
                                z2 = true;
                                bj4VarO.U(true);
                            } else {
                                z2 = true;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(z2);
                            bj4VarO.U(z2);
                            ox6Var3 = ox6Var4;
                            answer5 = answer4;
                            ci4Var4 = ci4Var3;
                        } else {
                            bj4VarO.u();
                            ox6Var3 = ox6Var2;
                            answer5 = answer2;
                            ci4Var4 = ci4Var2;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ee7
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    ci4Var2 = ci4Var;
                    if ((i3 & 74899) == 74898) {
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                        ox6 ox6Var5 = ox6Var2;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        aVar3 = aVar;
                        ox6VarC2 = it1.c(bj4VarO, aVar3);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        int i110 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i110 >> 15) & 14));
                        b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                        i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                        jt1.a.C0187a c0187a2 = jt1.a.a;
                        sp0.b bVar3 = di.a.j;
                        if (i10 != 1) {
                            if (i10 != 2) {
                            }
                            r02Var = null;
                            i11 = 1;
                        } else {
                            i11 = 1;
                            r02Var = null;
                        }
                        int i111 = 0;
                        bj4VarO.K(122317012);
                        double size4 = numericRatingQuestionModel.getOptions().size();
                        iCeil = (int) Math.ceil(size4 / ((double) ((int) Math.ceil(size4 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                        List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options3 = numericRatingQuestionModel.getOptions();
                        options3.getClass();
                        if (iCeil > 0) {
                        }
                        ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                        return;
                    }
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    ox6 ox6Var6 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i112 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i112 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a3 = jt1.a.a;
                    sp0.b bVar4 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i113 = 0;
                    bj4VarO.K(122317012);
                    double size5 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size5 / ((double) ((int) Math.ceil(size5 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options4 = numericRatingQuestionModel.getOptions();
                    options4.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ee7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        ci4Var2 = ci4Var;
                        if (bj4VarO.j(ci4Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 74899) == 74898) {
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                        ox6 ox6Var7 = ox6Var2;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        aVar3 = aVar;
                        ox6VarC2 = it1.c(bj4VarO, aVar3);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        int i114 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i114 >> 15) & 14));
                        b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                        i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                        jt1.a.C0187a c0187a4 = jt1.a.a;
                        sp0.b bVar5 = di.a.j;
                        if (i10 != 1) {
                            if (i10 != 2) {
                            }
                            r02Var = null;
                            i11 = 1;
                        } else {
                            i11 = 1;
                            r02Var = null;
                        }
                        int i115 = 0;
                        bj4VarO.K(122317012);
                        double size6 = numericRatingQuestionModel.getOptions().size();
                        iCeil = (int) Math.ceil(size6 / ((double) ((int) Math.ceil(size6 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                        List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options5 = numericRatingQuestionModel.getOptions();
                        options5.getClass();
                        if (iCeil > 0) {
                        }
                        ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                        return;
                    }
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    ox6 ox6Var8 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i116 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i116 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a5 = jt1.a.a;
                    sp0.b bVar6 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i117 = 0;
                    bj4VarO.K(122317012);
                    double size7 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size7 / ((double) ((int) Math.ceil(size7 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options6 = numericRatingQuestionModel.getOptions();
                    options6.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ee7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((i3 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    ox6 ox6Var9 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i118 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i118 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a6 = jt1.a.a;
                    sp0.b bVar7 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i119 = 0;
                    bj4VarO.K(122317012);
                    double size8 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size8 / ((double) ((int) Math.ceil(size8 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options7 = numericRatingQuestionModel.getOptions();
                    options7.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                }
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                ox6 ox6Var10 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i1110 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1110 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a7 = jt1.a.a;
                sp0.b bVar8 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i1111 = 0;
                bj4VarO.K(122317012);
                double size9 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size9 / ((double) ((int) Math.ceil(size9 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options8 = numericRatingQuestionModel.getOptions();
                options8.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ee7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
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
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        ci4Var2 = ci4Var;
                        if (bj4VarO.j(ci4Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 74899) == 74898) {
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                        ox6 ox6Var11 = ox6Var2;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        aVar3 = aVar;
                        ox6VarC2 = it1.c(bj4VarO, aVar3);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        int i1112 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1112 >> 15) & 14));
                        b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                        i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                        jt1.a.C0187a c0187a8 = jt1.a.a;
                        sp0.b bVar9 = di.a.j;
                        if (i10 != 1) {
                            if (i10 != 2) {
                            }
                            r02Var = null;
                            i11 = 1;
                        } else {
                            i11 = 1;
                            r02Var = null;
                        }
                        int i1113 = 0;
                        bj4VarO.K(122317012);
                        double size10 = numericRatingQuestionModel.getOptions().size();
                        iCeil = (int) Math.ceil(size10 / ((double) ((int) Math.ceil(size10 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                        List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options9 = numericRatingQuestionModel.getOptions();
                        options9.getClass();
                        if (iCeil > 0) {
                        }
                        ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                        return;
                    }
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    ox6 ox6Var12 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i1114 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1114 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a9 = jt1.a.a;
                    sp0.b bVar10 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i1115 = 0;
                    bj4VarO.K(122317012);
                    double size11 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size11 / ((double) ((int) Math.ceil(size11 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options10 = numericRatingQuestionModel.getOptions();
                    options10.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ee7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((i3 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    ox6 ox6Var13 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i1116 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1116 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a10 = jt1.a.a;
                    sp0.b bVar11 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i1117 = 0;
                    bj4VarO.K(122317012);
                    double size12 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size12 / ((double) ((int) Math.ceil(size12 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options11 = numericRatingQuestionModel.getOptions();
                    options11.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                }
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                ox6 ox6Var14 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i1118 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1118 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a11 = jt1.a.a;
                sp0.b bVar12 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i1119 = 0;
                bj4VarO.K(122317012);
                double size13 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size13 / ((double) ((int) Math.ceil(size13 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options12 = numericRatingQuestionModel.getOptions();
                options12.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ee7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    ox6 ox6Var15 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i11110 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11110 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a12 = jt1.a.a;
                    sp0.b bVar13 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i11111 = 0;
                    bj4VarO.K(122317012);
                    double size14 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size14 / ((double) ((int) Math.ceil(size14 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options13 = numericRatingQuestionModel.getOptions();
                    options13.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                }
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                ox6 ox6Var16 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i11112 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11112 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a13 = jt1.a.a;
                sp0.b bVar14 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i11113 = 0;
                bj4VarO.K(122317012);
                double size15 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size15 / ((double) ((int) Math.ceil(size15 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options14 = numericRatingQuestionModel.getOptions();
                options14.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ee7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((i3 & 74899) == 74898) {
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                ox6 ox6Var17 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i11114 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11114 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a14 = jt1.a.a;
                sp0.b bVar15 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i11115 = 0;
                bj4VarO.K(122317012);
                double size16 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size16 / ((double) ((int) Math.ceil(size16 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options15 = numericRatingQuestionModel.getOptions();
                options15.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
            }
            aVar = ox6.a.t;
            if (i13 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            ox6 ox6Var18 = ox6Var2;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            aVar3 = aVar;
            ox6VarC2 = it1.c(bj4VarO, aVar3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            int i11116 = i3;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11116 >> 15) & 14));
            b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
            i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
            jt1.a.C0187a c0187a15 = jt1.a.a;
            sp0.b bVar16 = di.a.j;
            if (i10 != 1) {
                if (i10 != 2) {
                }
                r02Var = null;
                i11 = 1;
            } else {
                i11 = 1;
                r02Var = null;
            }
            int i11117 = 0;
            bj4VarO.K(122317012);
            double size17 = numericRatingQuestionModel.getOptions().size();
            iCeil = (int) Math.ceil(size17 / ((double) ((int) Math.ceil(size17 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
            List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options16 = numericRatingQuestionModel.getOptions();
            options16.getClass();
            if (iCeil > 0) {
            }
            ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
            return;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ee7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
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
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        ci4Var2 = ci4Var;
                        if (bj4VarO.j(ci4Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 74899) == 74898) {
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                        Integer numValueOf16 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf16);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        ox6 ox6Var19 = ox6Var2;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        aVar3 = aVar;
                        ox6VarC2 = it1.c(bj4VarO, aVar3);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        int i11118 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11118 >> 15) & 14));
                        b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                        i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                        jt1.a.C0187a c0187a16 = jt1.a.a;
                        sp0.b bVar17 = di.a.j;
                        if (i10 != 1) {
                            if (i10 != 2) {
                            }
                            r02Var = null;
                            i11 = 1;
                        } else {
                            i11 = 1;
                            r02Var = null;
                        }
                        int i11119 = 0;
                        bj4VarO.K(122317012);
                        double size18 = numericRatingQuestionModel.getOptions().size();
                        iCeil = (int) Math.ceil(size18 / ((double) ((int) Math.ceil(size18 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                        List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options17 = numericRatingQuestionModel.getOptions();
                        options17.getClass();
                        if (iCeil > 0) {
                        }
                        ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                        return;
                    }
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    Integer numValueOf17 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf17);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6Var110 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i111110 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i111110 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a17 = jt1.a.a;
                    sp0.b bVar18 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i111111 = 0;
                    bj4VarO.K(122317012);
                    double size19 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size19 / ((double) ((int) Math.ceil(size19 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options18 = numericRatingQuestionModel.getOptions();
                    options18.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ee7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((i3 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    Integer numValueOf18 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf18);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6Var111 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i111112 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i111112 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a18 = jt1.a.a;
                    sp0.b bVar19 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i111113 = 0;
                    bj4VarO.K(122317012);
                    double size110 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size110 / ((double) ((int) Math.ceil(size110 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options19 = numericRatingQuestionModel.getOptions();
                    options19.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                }
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                Integer numValueOf19 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf19);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6Var112 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i111114 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i111114 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a19 = jt1.a.a;
                sp0.b bVar110 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i111115 = 0;
                bj4VarO.K(122317012);
                double size111 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size111 / ((double) ((int) Math.ceil(size111 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options110 = numericRatingQuestionModel.getOptions();
                options110.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ee7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    Integer numValueOf110 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf110);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6Var113 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i111116 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i111116 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a110 = jt1.a.a;
                    sp0.b bVar111 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i111117 = 0;
                    bj4VarO.K(122317012);
                    double size112 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size112 / ((double) ((int) Math.ceil(size112 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options111 = numericRatingQuestionModel.getOptions();
                    options111.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                }
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                Integer numValueOf111 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf111);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6Var114 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i111118 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i111118 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a111 = jt1.a.a;
                sp0.b bVar112 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i111119 = 0;
                bj4VarO.K(122317012);
                double size113 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size113 / ((double) ((int) Math.ceil(size113 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options112 = numericRatingQuestionModel.getOptions();
                options112.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ee7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((i3 & 74899) == 74898) {
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                Integer numValueOf112 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf112);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6Var115 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i1111110 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1111110 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a112 = jt1.a.a;
                sp0.b bVar113 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i1111111 = 0;
                bj4VarO.K(122317012);
                double size114 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size114 / ((double) ((int) Math.ceil(size114 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options113 = numericRatingQuestionModel.getOptions();
                options113.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
            }
            aVar = ox6.a.t;
            if (i13 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            Integer numValueOf113 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf113);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6Var116 = ox6Var2;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            aVar3 = aVar;
            ox6VarC2 = it1.c(bj4VarO, aVar3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            int i1111112 = i3;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1111112 >> 15) & 14));
            b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
            i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
            jt1.a.C0187a c0187a113 = jt1.a.a;
            sp0.b bVar114 = di.a.j;
            if (i10 != 1) {
                if (i10 != 2) {
                }
                r02Var = null;
                i11 = 1;
            } else {
                i11 = 1;
                r02Var = null;
            }
            int i1111113 = 0;
            bj4VarO.K(122317012);
            double size115 = numericRatingQuestionModel.getOptions().size();
            iCeil = (int) Math.ceil(size115 / ((double) ((int) Math.ceil(size115 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
            List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options114 = numericRatingQuestionModel.getOptions();
            options114.getClass();
            if (iCeil > 0) {
            }
            ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
            return;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ee7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
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
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    Integer numValueOf114 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf114);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6Var117 = ox6Var2;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    aVar3 = aVar;
                    ox6VarC2 = it1.c(bj4VarO, aVar3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    int i1111114 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1111114 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                    i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                    jt1.a.C0187a c0187a114 = jt1.a.a;
                    sp0.b bVar115 = di.a.j;
                    if (i10 != 1) {
                        if (i10 != 2) {
                        }
                        r02Var = null;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        r02Var = null;
                    }
                    int i1111115 = 0;
                    bj4VarO.K(122317012);
                    double size116 = numericRatingQuestionModel.getOptions().size();
                    iCeil = (int) Math.ceil(size116 / ((double) ((int) Math.ceil(size116 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                    List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options115 = numericRatingQuestionModel.getOptions();
                    options115.getClass();
                    if (iCeil > 0) {
                    }
                    ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                    return;
                }
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                Integer numValueOf115 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf115);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6Var118 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i1111116 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1111116 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a115 = jt1.a.a;
                sp0.b bVar116 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i1111117 = 0;
                bj4VarO.K(122317012);
                double size117 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size117 / ((double) ((int) Math.ceil(size117 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options116 = numericRatingQuestionModel.getOptions();
                options116.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ee7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((i3 & 74899) == 74898) {
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                Integer numValueOf116 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf116);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6Var119 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i1111118 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i1111118 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a116 = jt1.a.a;
                sp0.b bVar117 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i1111119 = 0;
                bj4VarO.K(122317012);
                double size118 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size118 / ((double) ((int) Math.ceil(size118 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options117 = numericRatingQuestionModel.getOptions();
                options117.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
            }
            aVar = ox6.a.t;
            if (i13 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            Integer numValueOf117 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf117);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6Var1110 = ox6Var2;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            aVar3 = aVar;
            ox6VarC2 = it1.c(bj4VarO, aVar3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            int i11111110 = i3;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11111110 >> 15) & 14));
            b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
            i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
            jt1.a.C0187a c0187a117 = jt1.a.a;
            sp0.b bVar118 = di.a.j;
            if (i10 != 1) {
                if (i10 != 2) {
                }
                r02Var = null;
                i11 = 1;
            } else {
                i11 = 1;
                r02Var = null;
            }
            int i11111111 = 0;
            bj4VarO.K(122317012);
            double size119 = numericRatingQuestionModel.getOptions().size();
            iCeil = (int) Math.ceil(size119 / ((double) ((int) Math.ceil(size119 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
            List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options118 = numericRatingQuestionModel.getOptions();
            options118.getClass();
            if (iCeil > 0) {
            }
            ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
            return;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ee7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i3 & 74899) == 74898) {
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                Integer numValueOf118 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf118);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6Var1111 = ox6Var2;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                aVar3 = aVar;
                ox6VarC2 = it1.c(bj4VarO, aVar3);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                int i11111112 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11111112 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
                i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
                jt1.a.C0187a c0187a118 = jt1.a.a;
                sp0.b bVar119 = di.a.j;
                if (i10 != 1) {
                    if (i10 != 2) {
                    }
                    r02Var = null;
                    i11 = 1;
                } else {
                    i11 = 1;
                    r02Var = null;
                }
                int i11111113 = 0;
                bj4VarO.K(122317012);
                double size1110 = numericRatingQuestionModel.getOptions().size();
                iCeil = (int) Math.ceil(size1110 / ((double) ((int) Math.ceil(size1110 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options119 = numericRatingQuestionModel.getOptions();
                options119.getClass();
                if (iCeil > 0) {
                }
                ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
                return;
            }
            aVar = ox6.a.t;
            if (i13 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            Integer numValueOf119 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf119);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6Var1112 = ox6Var2;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            aVar3 = aVar;
            ox6VarC2 = it1.c(bj4VarO, aVar3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            int i11111114 = i3;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11111114 >> 15) & 14));
            b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
            i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
            jt1.a.C0187a c0187a119 = jt1.a.a;
            sp0.b bVar1110 = di.a.j;
            if (i10 != 1) {
                if (i10 != 2) {
                }
                r02Var = null;
                i11 = 1;
            } else {
                i11 = 1;
                r02Var = null;
            }
            int i11111115 = 0;
            bj4VarO.K(122317012);
            double size1111 = numericRatingQuestionModel.getOptions().size();
            iCeil = (int) Math.ceil(size1111 / ((double) ((int) Math.ceil(size1111 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
            List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options1110 = numericRatingQuestionModel.getOptions();
            options1110.getClass();
            if (iCeil > 0) {
            }
            ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
            return;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ee7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ci4Var2 = ci4Var;
        if ((i3 & 74899) == 74898) {
            aVar = ox6.a.t;
            if (i13 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            Integer numValueOf1110 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf1110);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6Var1113 = ox6Var2;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            aVar3 = aVar;
            ox6VarC2 = it1.c(bj4VarO, aVar3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            int i11111116 = i3;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11111116 >> 15) & 14));
            b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
            i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
            jt1.a.C0187a c0187a1110 = jt1.a.a;
            sp0.b bVar1111 = di.a.j;
            if (i10 != 1) {
                if (i10 != 2) {
                }
                r02Var = null;
                i11 = 1;
            } else {
                i11 = 1;
                r02Var = null;
            }
            int i11111117 = 0;
            bj4VarO.K(122317012);
            double size1112 = numericRatingQuestionModel.getOptions().size();
            iCeil = (int) Math.ceil(size1112 / ((double) ((int) Math.ceil(size1112 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
            List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options1111 = numericRatingQuestionModel.getOptions();
            options1111.getClass();
            if (iCeil > 0) {
            }
            ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
            return;
        }
        aVar = ox6.a.t;
        if (i13 != 0) {
            ox6Var2 = aVar;
        }
        if (i4 != 0) {
            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
        } else {
            answer3 = answer2;
        }
        if (i8 != 0) {
            ci4VarM493getLambda1$intercom_sdk_base_release = ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m493getLambda1$intercom_sdk_base_release();
        } else {
            ci4VarM493getLambda1$intercom_sdk_base_release = ci4Var2;
        }
        fl6VarD = dv0.d(di.a.a, false);
        iHashCode = Long.hashCode(bj4VarO.T);
        kw7VarP = bj4VarO.P();
        ox6VarC = it1.c(bj4VarO, ox6Var2);
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
        Integer numValueOf1111 = Integer.valueOf(iHashCode);
        bVar = bt1.a.g;
        rd7.d(bj4VarO, bVar, numValueOf1111);
        c0034a = bt1.a.h;
        rd7.c(bj4VarO, c0034a);
        dVar = bt1.a.d;
        rd7.d(bj4VarO, dVar, ox6VarC);
        ox6 ox6Var1114 = ox6Var2;
        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
        iHashCode2 = Long.hashCode(bj4VarO.T);
        kw7VarP2 = bj4VarO.P();
        aVar3 = aVar;
        ox6VarC2 = it1.c(bj4VarO, aVar3);
        if (j1bVar == null) {
            ml5.c();
            throw null;
        }
        bj4VarO.q();
        int i11111118 = i3;
        if (bj4VarO.S) {
            bj4VarO.k(aVar2);
        } else {
            bj4VarO.z();
        }
        rd7.d(bj4VarO, cVar, aj1VarA);
        rd7.d(bj4VarO, eVar, kw7VarP2);
        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
        rd7.d(bj4VarO, dVar, ox6VarC2);
        ci4VarM493getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11111118 >> 15) & 14));
        b47.b(bj4VarO, ir9.d(aVar3, 16.0f));
        i10 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
        jt1.a.C0187a c0187a1111 = jt1.a.a;
        sp0.b bVar1112 = di.a.j;
        if (i10 != 1) {
            if (i10 != 2) {
            }
            r02Var = null;
            i11 = 1;
        } else {
            i11 = 1;
            r02Var = null;
        }
        int i11111119 = 0;
        bj4VarO.K(122317012);
        double size1113 = numericRatingQuestionModel.getOptions().size();
        iCeil = (int) Math.ceil(size1113 / ((double) ((int) Math.ceil(size1113 / ((double) ((((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp - 60) / 60))))));
        List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options1112 = numericRatingQuestionModel.getOptions();
        options1112.getClass();
        if (iCeil > 0) {
        }
        ca0.a(pk.d(iCeil, "size ", " must be greater than zero."));
        return;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ee7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(ox6Var3, numericRatingQuestionModel, answer5, oh4Var, surveyUiColors, ci4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(oh4 oh4Var, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption) {
        oh4Var.invoke(new Answer.SingleAnswer(String.valueOf(numericRatingOption.getValue())));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption, oh4 oh4Var) {
        oh4Var.invoke(new Answer.SingleAnswer(String.valueOf(numericRatingOption.getValue())));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NumericRatingQuestion$lambda$13(ox6 ox6Var, SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, oh4 oh4Var, SurveyUiColors surveyUiColors, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        NumericRatingQuestion(ox6Var, numericRatingQuestionModel, answer, oh4Var, surveyUiColors, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void StarQuestionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1791167217);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.STARS, new Answer.MultipleAnswer(u30.F(new String[]{"1", "2"}), null, 2, 0 == true ? 1 : 0), bj4VarO, 438);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lt6(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b StarQuestionPreview$lambda$15(int i, jt1 jt1Var, int i2) {
        StarQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$GeneratePreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ int $end;
        final /* synthetic */ SurveyData.Step.Question.QuestionData.QuestionSubType $questionSubType;
        final /* synthetic */ int $start;

        /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$GeneratePreview$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
                try {
                    iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, int i, int i2, Answer answer) {
            this.$questionSubType = questionSubType;
            this.$start = i;
            this.$end = i2;
            this.$answer = answer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$2$lambda$1(Answer answer) {
            answer.getClass();
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            List listI;
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            String string = UUID.randomUUID().toString();
            string.getClass();
            List listH = ws0.h(new Block.Builder().withText("How cool is this preview?"));
            if (WhenMappings.$EnumSwitchMapping$0[this.$questionSubType.ordinal()] == 1) {
                listI = ws0.i(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(1, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😖"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(2, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😕"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(3, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😐"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(4, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😃"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(5, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩"));
            } else {
                fg5 fg5Var = new fg5(this.$start, this.$end, 1);
                ArrayList arrayList = new ArrayList(ph1.n(fg5Var, 10));
                Iterator<Integer> it = fg5Var.iterator();
                while (((eg5) it).v) {
                    arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((tf5) it).nextInt()));
                }
                listI = arrayList;
            }
            SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel = new SurveyData.Step.Question.NumericRatingQuestionModel(string, listH, true, listI, "Not likely", "Very likely", this.$start, this.$end, this.$questionSubType);
            Answer answer = this.$answer;
            jt1Var.K(2033387031);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new a();
                jt1Var.C(objF);
            }
            jt1Var.B();
            NumericRatingQuestionKt.NumericRatingQuestion(null, numericRatingQuestionModel, answer, (oh4) objF, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, jt1Var, 3072, 33);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
