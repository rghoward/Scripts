package io.intercom.android.sdk.survey.ui.questiontype.text;

import com.intercom.twig.BuildConfig;
import defpackage.af6;
import defpackage.aj1;
import defpackage.ap5;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c15;
import defpackage.c30;
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
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.q60;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.ux1;
import defpackage.ws0;
import defpackage.xe6;
import defpackage.xj8;
import defpackage.ye6;
import defpackage.yi1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LongTextQuestionKt {
    public static final void LongTextPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-479343201);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            String string = UUID.randomUUID().toString();
            string.getClass();
            SurveyData.Step.Question.LongTextQuestionModel longTextQuestionModel = new SurveyData.Step.Question.LongTextQuestionModel(string, ws0.h(new Block.Builder().withText("Is this a preview?")), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 2000, 0.0f, 0, null, 448, null);
            bj4VarO.K(1067245044);
            Object objF = bj4VarO.f();
            int i2 = 0;
            if (objF == jt1.a.a) {
                objF = new af6(i2);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            LongTextQuestion(null, longTextQuestionModel, null, (oh4) objF, ux1.a(null, null, 3, null), ValidationError.NoValidationError.INSTANCE, null, null, bj4VarO, 199680, 197);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new q60(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LongTextPreview$lambda$8$lambda$7(Answer answer) {
        answer.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LongTextPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        LongTextPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0175  */
    /* JADX WARN: Code duplicated, block: B:114:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:129:0x0214  */
    /* JADX WARN: Code duplicated, block: B:131:0x021d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0224  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:140:0x0252  */
    /* JADX WARN: Code duplicated, block: B:141:0x0254  */
    /* JADX WARN: Code duplicated, block: B:144:0x025b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0264  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:155:0x0316  */
    /* JADX WARN: Code duplicated, block: B:157:0x0329  */
    /* JADX WARN: Code duplicated, block: B:159:0x032d  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LongTextQuestion(ox6 ox6Var, final SurveyData.Step.Question.LongTextQuestionModel longTextQuestionModel, Answer answer, oh4<? super Answer, g2b> oh4Var, final SurveyUiColors surveyUiColors, final ValidationError validationError, oh4<? super ap5, g2b> oh4Var2, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
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
        int i12;
        ox6.a aVar;
        Answer answer3;
        jt1.a.C0187a c0187a;
        int i13;
        oh4<? super ap5, g2b> oh4Var4;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM496getLambda1$intercom_sdk_base_release;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        ox6 ox6Var3;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        aj1 aj1VarA;
        int i14;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        String placeholder;
        String answer4;
        uh1 uh1Var;
        boolean z;
        Object objF;
        oh4<? super Answer, g2b> oh4Var5;
        boolean z2;
        final oh4<? super ap5, g2b> oh4Var6;
        bj4 bj4Var;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        final Answer answer5;
        Object objF2;
        xj8 xj8VarW;
        longTextQuestionModel.getClass();
        oh4Var.getClass();
        surveyUiColors.getClass();
        validationError.getClass();
        bj4 bj4VarO = jt1Var.o(977241530);
        j1b j1bVar = bj4VarO.a;
        int i15 = i2 & 1;
        if (i15 != 0) {
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
                i3 |= bj4VarO.J(longTextQuestionModel) ? 32 : 16;
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
                        if ((1572864 & i) == 0) {
                            oh4Var3 = oh4Var2;
                            if (bj4VarO.j(oh4Var3)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i3 |= i10;
                        }
                        i11 = i2 & 128;
                        if (i11 != 0) {
                            if ((i & 12582912) == 0) {
                                if (bj4VarO.j(ci4Var)) {
                                    i12 = 8388608;
                                } else {
                                    i12 = 4194304;
                                }
                                i3 |= i12;
                            }
                            if ((i3 & 4793491) == 4793490 || !bj4VarO.r()) {
                                aVar = ox6.a.t;
                                if (i15 != 0) {
                                    ox6Var2 = aVar;
                                }
                                if (i4 != 0) {
                                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                                } else {
                                    answer3 = answer2;
                                }
                                c0187a = jt1.a.a;
                                i13 = 0;
                                if (i9 != 0) {
                                    bj4VarO.K(-652200194);
                                    objF2 = bj4VarO.f();
                                    if (objF2 == c0187a) {
                                        objF2 = new xe6(i13);
                                        bj4VarO.C(objF2);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var4 = (oh4) objF2;
                                } else {
                                    oh4Var4 = oh4Var3;
                                }
                                if (i11 != 0) {
                                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                                } else {
                                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                                }
                                fl6VarD = dv0.d(di.a.a, false);
                                iHashCode = Long.hashCode(bj4VarO.T);
                                kw7VarP = bj4VarO.P();
                                ox6VarC = it1.c(bj4VarO, ox6Var2);
                                bt1.c.getClass();
                                ox6Var3 = ox6Var2;
                                aVar2 = bt1.a.b;
                                if (j1bVar == 0) {
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
                                i14 = i3;
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
                                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                                bj4VarO.K(-497967796);
                                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                                } else {
                                    placeholder = longTextQuestionModel.getPlaceholder();
                                }
                                String str = placeholder;
                                bj4VarO.U(false);
                                if (answer3 instanceof Answer.SingleAnswer) {
                                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                                } else {
                                    answer4 = BuildConfig.FLAVOR;
                                }
                                String str2 = answer4;
                                if ((validationError instanceof ValidationError.ValidationStringError) || (answer3 instanceof Answer.NoAnswer.InitialNoAnswer)) {
                                    uh1Var = null;
                                } else {
                                    uh1Var = new uh1(uh1.f);
                                }
                                long jM836getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                                int maxLine = longTextQuestionModel.getMaxLine();
                                float fM450getMinHeightD9Ej5fM = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                                bj4VarO.K(-497955273);
                                if ((i14 & 7168) == 2048) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                objF = bj4VarO.f();
                                if (!z || objF == c0187a) {
                                    oh4Var5 = oh4Var;
                                    z2 = false;
                                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                    bj4VarO.C(objF);
                                } else {
                                    oh4Var5 = oh4Var;
                                    z2 = false;
                                }
                                bj4VarO.U(z2);
                                ci4<? super jt1, ? super Integer, g2b> ci4Var3 = ci4VarM496getLambda1$intercom_sdk_base_release;
                                TextInputPillKt.m507TextInputPillg5ZjG94(str2, str, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA, maxLine, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                                oh4Var6 = oh4Var4;
                                bj4Var = bj4VarO;
                                bj4Var.K(-497931568);
                                if (longTextQuestionModel.getCharacterLimit() != null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(answer3.getLength());
                                    sb.append('/');
                                    sb.append(longTextQuestionModel.getCharacterLimit());
                                    mia.b(sb.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                                }
                                bj4Var.U(z2);
                                bj4Var.U(true);
                                bj4Var.U(true);
                                ci4Var2 = ci4Var3;
                                answer5 = answer3;
                            } else {
                                bj4VarO.u();
                                ci4Var2 = ci4Var;
                                bj4Var = bj4VarO;
                                ox6Var3 = ox6Var2;
                                oh4Var5 = oh4Var;
                                answer5 = answer2;
                                oh4Var6 = oh4Var3;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                final oh4<? super Answer, g2b> oh4Var7 = oh4Var5;
                                final ox6 ox6Var4 = ox6Var3;
                                xj8VarW.d = new ci4() { // from class: ze6
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var4, longTextQuestionModel, answer5, oh4Var7, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 12582912;
                        if ((i3 & 4793491) == 4793490) {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str3 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str4 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine2 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM2 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var4 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str4, str3, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA2, maxLine2, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM2, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(answer3.getLength());
                                sb2.append('/');
                                sb2.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb2.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var4;
                            answer5 = answer3;
                        } else {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str5 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str6 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA3 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine3 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM3 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var5 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str6, str5, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA3, maxLine3, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM3, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(answer3.getLength());
                                sb3.append('/');
                                sb3.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb3.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var5;
                            answer5 = answer3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            final oh4 oh4Var8 = oh4Var5;
                            final ox6 ox6Var5 = ox6Var3;
                            xj8VarW.d = new ci4() { // from class: ze6
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var5, longTextQuestionModel, answer5, oh4Var8, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var3 = oh4Var2;
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        if ((i & 12582912) == 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i3 |= i12;
                        }
                        if ((i3 & 4793491) == 4793490) {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str7 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str8 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA4 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine4 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM4 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var6 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str8, str7, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA4, maxLine4, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM4, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(answer3.getLength());
                                sb4.append('/');
                                sb4.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb4.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var6;
                            answer5 = answer3;
                        } else {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str9 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str10 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA5 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine5 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM5 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var7 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str10, str9, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA5, maxLine5, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM5, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(answer3.getLength());
                                sb5.append('/');
                                sb5.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb5.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var7;
                            answer5 = answer3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            final oh4 oh4Var9 = oh4Var5;
                            final ox6 ox6Var6 = ox6Var3;
                            xj8VarW.d = new ci4() { // from class: ze6
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var6, longTextQuestionModel, answer5, oh4Var9, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str11 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str12 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA6 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine6 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM6 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var8 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str12, str11, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA6, maxLine6, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM6, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(answer3.getLength());
                            sb6.append('/');
                            sb6.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb6.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var8;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str13 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str14 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA7 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine7 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM7 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var9 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str14, str13, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA7, maxLine7, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM7, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(answer3.getLength());
                            sb7.append('/');
                            sb7.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb7.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var9;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var10 = oh4Var5;
                        final ox6 ox6Var7 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var7, longTextQuestionModel, answer5, oh4Var10, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
                    if ((1572864 & i) == 0) {
                        oh4Var3 = oh4Var2;
                        if (bj4VarO.j(oh4Var3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        if ((i & 12582912) == 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i3 |= i12;
                        }
                        if ((i3 & 4793491) == 4793490) {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str15 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str16 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA8 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine8 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM8 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var10 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str16, str15, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA8, maxLine8, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM8, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(answer3.getLength());
                                sb8.append('/');
                                sb8.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb8.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var10;
                            answer5 = answer3;
                        } else {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str17 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str18 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA9 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine9 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM9 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var11 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str18, str17, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA9, maxLine9, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM9, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(answer3.getLength());
                                sb9.append('/');
                                sb9.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb9.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var11;
                            answer5 = answer3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            final oh4 oh4Var11 = oh4Var5;
                            final ox6 ox6Var8 = ox6Var3;
                            xj8VarW.d = new ci4() { // from class: ze6
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var8, longTextQuestionModel, answer5, oh4Var11, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str19 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str110 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA10 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine10 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM10 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var12 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str110, str19, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA10, maxLine10, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM10, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(answer3.getLength());
                            sb10.append('/');
                            sb10.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb10.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var12;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str111 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str112 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA11 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine11 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM11 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var13 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str112, str111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11, maxLine11, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(answer3.getLength());
                            sb11.append('/');
                            sb11.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb11.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var13;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var12 = oh4Var5;
                        final ox6 ox6Var9 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var9, longTextQuestionModel, answer5, oh4Var12, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var3 = oh4Var2;
                i11 = i2 & 128;
                if (i11 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str113 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str114 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA12 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine12 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM12 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var14 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str114, str113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA12, maxLine12, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM12, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(answer3.getLength());
                            sb12.append('/');
                            sb12.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb12.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var14;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str115 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str116 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA13 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine13 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM13 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var15 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str116, str115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA13, maxLine13, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM13, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(answer3.getLength());
                            sb13.append('/');
                            sb13.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb13.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var15;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var13 = oh4Var5;
                        final ox6 ox6Var10 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var10, longTextQuestionModel, answer5, oh4Var13, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str117 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str118 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA14 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine14 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM14 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var16 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str118, str117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA14, maxLine14, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM14, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append(answer3.getLength());
                        sb14.append('/');
                        sb14.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb14.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var16;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str119 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str1110 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA15 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine15 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM15 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var17 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str1110, str119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA15, maxLine15, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM15, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append(answer3.getLength());
                        sb15.append('/');
                        sb15.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb15.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var17;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var14 = oh4Var5;
                    final ox6 ox6Var11 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var11, longTextQuestionModel, answer5, oh4Var14, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
                    if ((1572864 & i) == 0) {
                        oh4Var3 = oh4Var2;
                        if (bj4VarO.j(oh4Var3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        if ((i & 12582912) == 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i3 |= i12;
                        }
                        if ((i3 & 4793491) == 4793490) {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str1111 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str1112 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA16 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine16 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM16 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var18 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str1112, str1111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA16, maxLine16, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM16, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb16 = new StringBuilder();
                                sb16.append(answer3.getLength());
                                sb16.append('/');
                                sb16.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb16.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var18;
                            answer5 = answer3;
                        } else {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str1113 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str1114 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA17 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine17 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM17 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var19 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str1114, str1113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA17, maxLine17, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM17, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb17 = new StringBuilder();
                                sb17.append(answer3.getLength());
                                sb17.append('/');
                                sb17.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb17.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var19;
                            answer5 = answer3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            final oh4 oh4Var15 = oh4Var5;
                            final ox6 ox6Var12 = ox6Var3;
                            xj8VarW.d = new ci4() { // from class: ze6
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var12, longTextQuestionModel, answer5, oh4Var15, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str1115 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str1116 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA18 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine18 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM18 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var110 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str1116, str1115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA18, maxLine18, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM18, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb18 = new StringBuilder();
                            sb18.append(answer3.getLength());
                            sb18.append('/');
                            sb18.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb18.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var110;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str1117 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str1118 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA19 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine19 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM19 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var111 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str1118, str1117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA19, maxLine19, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM19, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb19 = new StringBuilder();
                            sb19.append(answer3.getLength());
                            sb19.append('/');
                            sb19.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb19.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var111;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var16 = oh4Var5;
                        final ox6 ox6Var13 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var13, longTextQuestionModel, answer5, oh4Var16, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var3 = oh4Var2;
                i11 = i2 & 128;
                if (i11 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str1119 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str11110 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA110 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine110 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM110 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var112 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str11110, str1119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA110, maxLine110, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM110, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb110 = new StringBuilder();
                            sb110.append(answer3.getLength());
                            sb110.append('/');
                            sb110.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb110.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var112;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str11111 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str11112 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA111 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine111 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM111 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var113 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str11112, str11111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111, maxLine111, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb111 = new StringBuilder();
                            sb111.append(answer3.getLength());
                            sb111.append('/');
                            sb111.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb111.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var113;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var17 = oh4Var5;
                        final ox6 ox6Var14 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var14, longTextQuestionModel, answer5, oh4Var17, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str11113 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11114 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA112 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine112 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM112 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var114 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11114, str11113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA112, maxLine112, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM112, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb112 = new StringBuilder();
                        sb112.append(answer3.getLength());
                        sb112.append('/');
                        sb112.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb112.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var114;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str11115 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11116 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA113 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine113 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM113 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var115 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11116, str11115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA113, maxLine113, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM113, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb113 = new StringBuilder();
                        sb113.append(answer3.getLength());
                        sb113.append('/');
                        sb113.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb113.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var115;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var18 = oh4Var5;
                    final ox6 ox6Var15 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var15, longTextQuestionModel, answer5, oh4Var18, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
                if ((1572864 & i) == 0) {
                    oh4Var3 = oh4Var2;
                    if (bj4VarO.j(oh4Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str11117 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str11118 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA114 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine114 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM114 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var116 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str11118, str11117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA114, maxLine114, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM114, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb114 = new StringBuilder();
                            sb114.append(answer3.getLength());
                            sb114.append('/');
                            sb114.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb114.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var116;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str11119 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str111110 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA115 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine115 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM115 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var117 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str111110, str11119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA115, maxLine115, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM115, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb115 = new StringBuilder();
                            sb115.append(answer3.getLength());
                            sb115.append('/');
                            sb115.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb115.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var117;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var19 = oh4Var5;
                        final ox6 ox6Var16 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var16, longTextQuestionModel, answer5, oh4Var19, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111111 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111112 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA116 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine116 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM116 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var118 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111112, str111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA116, maxLine116, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM116, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb116 = new StringBuilder();
                        sb116.append(answer3.getLength());
                        sb116.append('/');
                        sb116.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb116.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var118;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111113 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111114 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA117 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine117 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM117 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var119 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111114, str111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA117, maxLine117, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM117, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb117 = new StringBuilder();
                        sb117.append(answer3.getLength());
                        sb117.append('/');
                        sb117.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb117.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var119;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var110 = oh4Var5;
                    final ox6 ox6Var17 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var17, longTextQuestionModel, answer5, oh4Var110, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var3 = oh4Var2;
            i11 = i2 & 128;
            if (i11 != 0) {
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111115 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111116 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA118 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine118 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM118 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var1110 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111116, str111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA118, maxLine118, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM118, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb118 = new StringBuilder();
                        sb118.append(answer3.getLength());
                        sb118.append('/');
                        sb118.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb118.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var1110;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111117 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111118 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA119 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine119 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM119 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var1111 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111118, str111117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA119, maxLine119, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM119, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb119 = new StringBuilder();
                        sb119.append(answer3.getLength());
                        sb119.append('/');
                        sb119.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb119.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var1111;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var111 = oh4Var5;
                    final ox6 ox6Var18 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var18, longTextQuestionModel, answer5, oh4Var111, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str111119 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str1111110 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA1110 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine1110 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM1110 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var1112 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str1111110, str111119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1110, maxLine1110, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1110, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb1110 = new StringBuilder();
                    sb1110.append(answer3.getLength());
                    sb1110.append('/');
                    sb1110.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb1110.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var1112;
                answer5 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str1111111 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str1111112 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA1111 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine1111 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM1111 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var1113 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str1111112, str1111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1111, maxLine1111, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1111, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb1111 = new StringBuilder();
                    sb1111.append(answer3.getLength());
                    sb1111.append('/');
                    sb1111.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb1111.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var1113;
                answer5 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var112 = oh4Var5;
                final ox6 ox6Var19 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: ze6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var19, longTextQuestionModel, answer5, oh4Var112, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
                    if ((1572864 & i) == 0) {
                        oh4Var3 = oh4Var2;
                        if (bj4VarO.j(oh4Var3)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        if ((i & 12582912) == 0) {
                            if (bj4VarO.j(ci4Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i3 |= i12;
                        }
                        if ((i3 & 4793491) == 4793490) {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            Integer numValueOf1112 = Integer.valueOf(iHashCode);
                            bVar = bt1.a.g;
                            rd7.d(bj4VarO, bVar, numValueOf1112);
                            c0034a = bt1.a.h;
                            rd7.c(bj4VarO, c0034a);
                            dVar = bt1.a.d;
                            rd7.d(bj4VarO, dVar, ox6VarC);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str1111113 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str1111114 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA1112 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine1112 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM1112 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var1114 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str1111114, str1111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1112, maxLine1112, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1112, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb1112 = new StringBuilder();
                                sb1112.append(answer3.getLength());
                                sb1112.append('/');
                                sb1112.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb1112.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var1114;
                            answer5 = answer3;
                        } else {
                            aVar = ox6.a.t;
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            c0187a = jt1.a.a;
                            i13 = 0;
                            if (i9 != 0) {
                                bj4VarO.K(-652200194);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new xe6(i13);
                                    bj4VarO.C(objF2);
                                }
                                bj4VarO.U(false);
                                oh4Var4 = (oh4) objF2;
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                            if (i11 != 0) {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                            }
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6Var2);
                            bt1.c.getClass();
                            ox6Var3 = ox6Var2;
                            aVar2 = bt1.a.b;
                            if (j1bVar == 0) {
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
                            Integer numValueOf1113 = Integer.valueOf(iHashCode);
                            bVar = bt1.a.g;
                            rd7.d(bj4VarO, bVar, numValueOf1113);
                            c0034a = bt1.a.h;
                            rd7.c(bj4VarO, c0034a);
                            dVar = bt1.a.d;
                            rd7.d(bj4VarO, dVar, ox6VarC);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            i14 = i3;
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
                            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(-497967796);
                            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = longTextQuestionModel.getPlaceholder();
                            }
                            String str1111115 = placeholder;
                            bj4VarO.U(false);
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer4 = BuildConfig.FLAVOR;
                            }
                            String str1111116 = answer4;
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                uh1Var = null;
                            } else {
                                uh1Var = null;
                            }
                            long jM836getAccessibleColorOnWhiteBackground8_81llA1113 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            int maxLine1113 = longTextQuestionModel.getMaxLine();
                            float fM450getMinHeightD9Ej5fM1113 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                            bj4VarO.K(-497955273);
                            if ((i14 & 7168) == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF = bj4VarO.f();
                            if (z) {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            } else {
                                oh4Var5 = oh4Var;
                                z2 = false;
                                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(z2);
                            ci4<? super jt1, ? super Integer, g2b> ci4Var1115 = ci4VarM496getLambda1$intercom_sdk_base_release;
                            TextInputPillKt.m507TextInputPillg5ZjG94(str1111116, str1111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1113, maxLine1113, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1113, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                            oh4Var6 = oh4Var4;
                            bj4Var = bj4VarO;
                            bj4Var.K(-497931568);
                            if (longTextQuestionModel.getCharacterLimit() != null) {
                                StringBuilder sb1113 = new StringBuilder();
                                sb1113.append(answer3.getLength());
                                sb1113.append('/');
                                sb1113.append(longTextQuestionModel.getCharacterLimit());
                                mia.b(sb1113.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                            }
                            bj4Var.U(z2);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var2 = ci4Var1115;
                            answer5 = answer3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            final oh4 oh4Var113 = oh4Var5;
                            final ox6 ox6Var110 = ox6Var3;
                            xj8VarW.d = new ci4() { // from class: ze6
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var110, longTextQuestionModel, answer5, oh4Var113, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf1114 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf1114);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str1111117 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str1111118 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA1114 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine1114 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM1114 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var1116 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str1111118, str1111117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1114, maxLine1114, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1114, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb1114 = new StringBuilder();
                            sb1114.append(answer3.getLength());
                            sb1114.append('/');
                            sb1114.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb1114.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var1116;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf1115 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf1115);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str1111119 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str11111110 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA1115 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine1115 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM1115 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var1117 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str11111110, str1111119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1115, maxLine1115, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1115, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb1115 = new StringBuilder();
                            sb1115.append(answer3.getLength());
                            sb1115.append('/');
                            sb1115.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb1115.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var1117;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var114 = oh4Var5;
                        final ox6 ox6Var111 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var111, longTextQuestionModel, answer5, oh4Var114, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var3 = oh4Var2;
                i11 = i2 & 128;
                if (i11 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf1116 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf1116);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str11111111 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str11111112 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA1116 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine1116 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM1116 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var1118 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str11111112, str11111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1116, maxLine1116, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1116, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb1116 = new StringBuilder();
                            sb1116.append(answer3.getLength());
                            sb1116.append('/');
                            sb1116.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb1116.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var1118;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf1117 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf1117);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str11111113 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str11111114 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA1117 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine1117 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM1117 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var1119 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str11111114, str11111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1117, maxLine1117, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1117, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb1117 = new StringBuilder();
                            sb1117.append(answer3.getLength());
                            sb1117.append('/');
                            sb1117.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb1117.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var1119;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var115 = oh4Var5;
                        final ox6 ox6Var112 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var112, longTextQuestionModel, answer5, oh4Var115, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf1118 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf1118);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str11111115 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11111116 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA1118 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine1118 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM1118 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11110 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11111116, str11111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1118, maxLine1118, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1118, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb1118 = new StringBuilder();
                        sb1118.append(answer3.getLength());
                        sb1118.append('/');
                        sb1118.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb1118.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var11110;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf1119 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf1119);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str11111117 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11111118 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA1119 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine1119 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM1119 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11111 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11111118, str11111117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1119, maxLine1119, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1119, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb1119 = new StringBuilder();
                        sb1119.append(answer3.getLength());
                        sb1119.append('/');
                        sb1119.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb1119.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var11111;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var116 = oh4Var5;
                    final ox6 ox6Var113 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var113, longTextQuestionModel, answer5, oh4Var116, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
                if ((1572864 & i) == 0) {
                    oh4Var3 = oh4Var2;
                    if (bj4VarO.j(oh4Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf11110 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf11110);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str11111119 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str111111110 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA11110 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine11110 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM11110 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var11112 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str111111110, str11111119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11110, maxLine11110, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11110, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb11110 = new StringBuilder();
                            sb11110.append(answer3.getLength());
                            sb11110.append('/');
                            sb11110.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb11110.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var11112;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf11111 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf11111);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str111111111 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str111111112 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA11111 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine11111 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM11111 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var11113 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str111111112, str111111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11111, maxLine11111, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11111, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb11111 = new StringBuilder();
                            sb11111.append(answer3.getLength());
                            sb11111.append('/');
                            sb11111.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb11111.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var11113;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var117 = oh4Var5;
                        final ox6 ox6Var114 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var114, longTextQuestionModel, answer5, oh4Var117, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf11112 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf11112);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111111113 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111111114 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA11112 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine11112 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM11112 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11114 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111111114, str111111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11112, maxLine11112, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11112, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb11112 = new StringBuilder();
                        sb11112.append(answer3.getLength());
                        sb11112.append('/');
                        sb11112.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb11112.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var11114;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf11113 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf11113);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111111115 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111111116 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA11113 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine11113 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM11113 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11115 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111111116, str111111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11113, maxLine11113, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11113, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb11113 = new StringBuilder();
                        sb11113.append(answer3.getLength());
                        sb11113.append('/');
                        sb11113.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb11113.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var11115;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var118 = oh4Var5;
                    final ox6 ox6Var115 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var115, longTextQuestionModel, answer5, oh4Var118, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var3 = oh4Var2;
            i11 = i2 & 128;
            if (i11 != 0) {
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf11114 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf11114);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111111117 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111111118 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA11114 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine11114 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM11114 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11116 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111111118, str111111117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11114, maxLine11114, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11114, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb11114 = new StringBuilder();
                        sb11114.append(answer3.getLength());
                        sb11114.append('/');
                        sb11114.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb11114.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var11116;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf11115 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf11115);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111111119 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str1111111110 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA11115 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine11115 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM11115 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var11117 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str1111111110, str111111119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11115, maxLine11115, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11115, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb11115 = new StringBuilder();
                        sb11115.append(answer3.getLength());
                        sb11115.append('/');
                        sb11115.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb11115.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var11117;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var119 = oh4Var5;
                    final ox6 ox6Var116 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var116, longTextQuestionModel, answer5, oh4Var119, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf11116 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf11116);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str1111111111 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str1111111112 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA11116 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine11116 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM11116 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var11118 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str1111111112, str1111111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11116, maxLine11116, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11116, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb11116 = new StringBuilder();
                    sb11116.append(answer3.getLength());
                    sb11116.append('/');
                    sb11116.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb11116.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var11118;
                answer5 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf11117 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf11117);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str1111111113 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str1111111114 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA11117 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine11117 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM11117 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var11119 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str1111111114, str1111111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11117, maxLine11117, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11117, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb11117 = new StringBuilder();
                    sb11117.append(answer3.getLength());
                    sb11117.append('/');
                    sb11117.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb11117.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var11119;
                answer5 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var1110 = oh4Var5;
                final ox6 ox6Var117 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: ze6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var117, longTextQuestionModel, answer5, oh4Var1110, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
                if ((1572864 & i) == 0) {
                    oh4Var3 = oh4Var2;
                    if (bj4VarO.j(oh4Var3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    if ((i & 12582912) == 0) {
                        if (bj4VarO.j(ci4Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i3 |= i12;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf11118 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf11118);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str1111111115 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str1111111116 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA11118 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine11118 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM11118 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var111110 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str1111111116, str1111111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11118, maxLine11118, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11118, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb11118 = new StringBuilder();
                            sb11118.append(answer3.getLength());
                            sb11118.append('/');
                            sb11118.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb11118.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var111110;
                        answer5 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        c0187a = jt1.a.a;
                        i13 = 0;
                        if (i9 != 0) {
                            bj4VarO.K(-652200194);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new xe6(i13);
                                bj4VarO.C(objF2);
                            }
                            bj4VarO.U(false);
                            oh4Var4 = (oh4) objF2;
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        if (i11 != 0) {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                        }
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
                        aVar2 = bt1.a.b;
                        if (j1bVar == 0) {
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
                        Integer numValueOf11119 = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf11119);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i14 = i3;
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
                        ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(-497967796);
                        if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = longTextQuestionModel.getPlaceholder();
                        }
                        String str1111111117 = placeholder;
                        bj4VarO.U(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = BuildConfig.FLAVOR;
                        }
                        String str1111111118 = answer4;
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            uh1Var = null;
                        } else {
                            uh1Var = null;
                        }
                        long jM836getAccessibleColorOnWhiteBackground8_81llA11119 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        int maxLine11119 = longTextQuestionModel.getMaxLine();
                        float fM450getMinHeightD9Ej5fM11119 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                        bj4VarO.K(-497955273);
                        if ((i14 & 7168) == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF = bj4VarO.f();
                        if (z) {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        } else {
                            oh4Var5 = oh4Var;
                            z2 = false;
                            objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(z2);
                        ci4<? super jt1, ? super Integer, g2b> ci4Var111111 = ci4VarM496getLambda1$intercom_sdk_base_release;
                        TextInputPillKt.m507TextInputPillg5ZjG94(str1111111118, str1111111117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA11119, maxLine11119, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM11119, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                        oh4Var6 = oh4Var4;
                        bj4Var = bj4VarO;
                        bj4Var.K(-497931568);
                        if (longTextQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb11119 = new StringBuilder();
                            sb11119.append(answer3.getLength());
                            sb11119.append('/');
                            sb11119.append(longTextQuestionModel.getCharacterLimit());
                            mia.b(sb11119.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                        }
                        bj4Var.U(z2);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var2 = ci4Var111111;
                        answer5 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var1111 = oh4Var5;
                        final ox6 ox6Var118 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: ze6
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var118, longTextQuestionModel, answer5, oh4Var1111, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf111110 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf111110);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str1111111119 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11111111110 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA111110 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine111110 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM111110 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111112 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11111111110, str1111111119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111110, maxLine111110, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111110, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb111110 = new StringBuilder();
                        sb111110.append(answer3.getLength());
                        sb111110.append('/');
                        sb111110.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb111110.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var111112;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf111111 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf111111);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str11111111111 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11111111112 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA111111 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine111111 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM111111 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111113 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11111111112, str11111111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111111, maxLine111111, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111111, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb111111 = new StringBuilder();
                        sb111111.append(answer3.getLength());
                        sb111111.append('/');
                        sb111111.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb111111.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var111113;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var1112 = oh4Var5;
                    final ox6 ox6Var119 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var119, longTextQuestionModel, answer5, oh4Var1112, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var3 = oh4Var2;
            i11 = i2 & 128;
            if (i11 != 0) {
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf111112 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf111112);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str11111111113 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11111111114 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA111112 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine111112 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM111112 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111114 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11111111114, str11111111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111112, maxLine111112, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111112, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb111112 = new StringBuilder();
                        sb111112.append(answer3.getLength());
                        sb111112.append('/');
                        sb111112.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb111112.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var111114;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf111113 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf111113);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str11111111115 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str11111111116 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA111113 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine111113 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM111113 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111115 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str11111111116, str11111111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111113, maxLine111113, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111113, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb111113 = new StringBuilder();
                        sb111113.append(answer3.getLength());
                        sb111113.append('/');
                        sb111113.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb111113.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var111115;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var1113 = oh4Var5;
                    final ox6 ox6Var1110 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var1110, longTextQuestionModel, answer5, oh4Var1113, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf111114 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf111114);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str11111111117 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str11111111118 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA111114 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine111114 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM111114 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var111116 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str11111111118, str11111111117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111114, maxLine111114, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111114, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb111114 = new StringBuilder();
                    sb111114.append(answer3.getLength());
                    sb111114.append('/');
                    sb111114.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb111114.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var111116;
                answer5 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf111115 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf111115);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str11111111119 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str111111111110 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA111115 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine111115 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM111115 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var111117 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str111111111110, str11111111119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111115, maxLine111115, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111115, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb111115 = new StringBuilder();
                    sb111115.append(answer3.getLength());
                    sb111115.append('/');
                    sb111115.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb111115.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var111117;
                answer5 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var1114 = oh4Var5;
                final ox6 ox6Var1111 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: ze6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var1111, longTextQuestionModel, answer5, oh4Var1114, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
            if ((1572864 & i) == 0) {
                oh4Var3 = oh4Var2;
                if (bj4VarO.j(oh4Var3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                if ((i & 12582912) == 0) {
                    if (bj4VarO.j(ci4Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i3 |= i12;
                }
                if ((i3 & 4793491) == 4793490) {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf111116 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf111116);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111111111111 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111111111112 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA111116 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine111116 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM111116 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111118 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111111111112, str111111111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111116, maxLine111116, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111116, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb111116 = new StringBuilder();
                        sb111116.append(answer3.getLength());
                        sb111116.append('/');
                        sb111116.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb111116.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var111118;
                    answer5 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    c0187a = jt1.a.a;
                    i13 = 0;
                    if (i9 != 0) {
                        bj4VarO.K(-652200194);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new xe6(i13);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        oh4Var4 = (oh4) objF2;
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                    if (i11 != 0) {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                    }
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
                    aVar2 = bt1.a.b;
                    if (j1bVar == 0) {
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
                    Integer numValueOf111117 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf111117);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i14 = i3;
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
                    ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(-497967796);
                    if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = longTextQuestionModel.getPlaceholder();
                    }
                    String str111111111113 = placeholder;
                    bj4VarO.U(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = BuildConfig.FLAVOR;
                    }
                    String str111111111114 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        uh1Var = null;
                    } else {
                        uh1Var = null;
                    }
                    long jM836getAccessibleColorOnWhiteBackground8_81llA111117 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    int maxLine111117 = longTextQuestionModel.getMaxLine();
                    float fM450getMinHeightD9Ej5fM111117 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                    bj4VarO.K(-497955273);
                    if ((i14 & 7168) == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (z) {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    } else {
                        oh4Var5 = oh4Var;
                        z2 = false;
                        objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(z2);
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111119 = ci4VarM496getLambda1$intercom_sdk_base_release;
                    TextInputPillKt.m507TextInputPillg5ZjG94(str111111111114, str111111111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111117, maxLine111117, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111117, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                    oh4Var6 = oh4Var4;
                    bj4Var = bj4VarO;
                    bj4Var.K(-497931568);
                    if (longTextQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb111117 = new StringBuilder();
                        sb111117.append(answer3.getLength());
                        sb111117.append('/');
                        sb111117.append(longTextQuestionModel.getCharacterLimit());
                        mia.b(sb111117.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                    }
                    bj4Var.U(z2);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var2 = ci4Var111119;
                    answer5 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var1115 = oh4Var5;
                    final ox6 ox6Var1112 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: ze6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var1112, longTextQuestionModel, answer5, oh4Var1115, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf111118 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf111118);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str111111111115 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str111111111116 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA111118 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine111118 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM111118 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111110 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str111111111116, str111111111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111118, maxLine111118, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111118, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb111118 = new StringBuilder();
                    sb111118.append(answer3.getLength());
                    sb111118.append('/');
                    sb111118.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb111118.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var1111110;
                answer5 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf111119 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf111119);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str111111111117 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str111111111118 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA111119 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine111119 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM111119 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111111 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str111111111118, str111111111117, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA111119, maxLine111119, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM111119, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb111119 = new StringBuilder();
                    sb111119.append(answer3.getLength());
                    sb111119.append('/');
                    sb111119.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb111119.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var1111111;
                answer5 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var1116 = oh4Var5;
                final ox6 ox6Var1113 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: ze6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var1113, longTextQuestionModel, answer5, oh4Var1116, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        oh4Var3 = oh4Var2;
        i11 = i2 & 128;
        if (i11 != 0) {
            if ((i & 12582912) == 0) {
                if (bj4VarO.j(ci4Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i3 |= i12;
            }
            if ((i3 & 4793491) == 4793490) {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf1111110 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf1111110);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str111111111119 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str1111111111110 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA1111110 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine1111110 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM1111110 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111112 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str1111111111110, str111111111119, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1111110, maxLine1111110, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1111110, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb1111110 = new StringBuilder();
                    sb1111110.append(answer3.getLength());
                    sb1111110.append('/');
                    sb1111110.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb1111110.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var1111112;
                answer5 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                c0187a = jt1.a.a;
                i13 = 0;
                if (i9 != 0) {
                    bj4VarO.K(-652200194);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xe6(i13);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    oh4Var4 = (oh4) objF2;
                } else {
                    oh4Var4 = oh4Var3;
                }
                if (i11 != 0) {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
                }
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
                aVar2 = bt1.a.b;
                if (j1bVar == 0) {
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
                Integer numValueOf1111111 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf1111111);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i14 = i3;
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
                ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(-497967796);
                if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = longTextQuestionModel.getPlaceholder();
                }
                String str1111111111111 = placeholder;
                bj4VarO.U(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = BuildConfig.FLAVOR;
                }
                String str1111111111112 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    uh1Var = null;
                } else {
                    uh1Var = null;
                }
                long jM836getAccessibleColorOnWhiteBackground8_81llA1111111 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                int maxLine1111111 = longTextQuestionModel.getMaxLine();
                float fM450getMinHeightD9Ej5fM1111111 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
                bj4VarO.K(-497955273);
                if ((i14 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                } else {
                    oh4Var5 = oh4Var;
                    z2 = false;
                    objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111113 = ci4VarM496getLambda1$intercom_sdk_base_release;
                TextInputPillKt.m507TextInputPillg5ZjG94(str1111111111112, str1111111111111, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1111111, maxLine1111111, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1111111, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
                oh4Var6 = oh4Var4;
                bj4Var = bj4VarO;
                bj4Var.K(-497931568);
                if (longTextQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb1111111 = new StringBuilder();
                    sb1111111.append(answer3.getLength());
                    sb1111111.append('/');
                    sb1111111.append(longTextQuestionModel.getCharacterLimit());
                    mia.b(sb1111111.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
                }
                bj4Var.U(z2);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var2 = ci4Var1111113;
                answer5 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var1117 = oh4Var5;
                final ox6 ox6Var1114 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: ze6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var1114, longTextQuestionModel, answer5, oh4Var1117, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 12582912;
        if ((i3 & 4793491) == 4793490) {
            aVar = ox6.a.t;
            if (i15 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            c0187a = jt1.a.a;
            i13 = 0;
            if (i9 != 0) {
                bj4VarO.K(-652200194);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new xe6(i13);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                oh4Var4 = (oh4) objF2;
            } else {
                oh4Var4 = oh4Var3;
            }
            if (i11 != 0) {
                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
            }
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            ox6Var3 = ox6Var2;
            aVar2 = bt1.a.b;
            if (j1bVar == 0) {
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
            Integer numValueOf1111112 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf1111112);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            i14 = i3;
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
            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            bj4VarO.K(-497967796);
            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = longTextQuestionModel.getPlaceholder();
            }
            String str1111111111113 = placeholder;
            bj4VarO.U(false);
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = BuildConfig.FLAVOR;
            }
            String str1111111111114 = answer4;
            if (validationError instanceof ValidationError.ValidationStringError) {
                uh1Var = null;
            } else {
                uh1Var = null;
            }
            long jM836getAccessibleColorOnWhiteBackground8_81llA1111112 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
            int maxLine1111112 = longTextQuestionModel.getMaxLine();
            float fM450getMinHeightD9Ej5fM1111112 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
            bj4VarO.K(-497955273);
            if ((i14 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            objF = bj4VarO.f();
            if (z) {
                oh4Var5 = oh4Var;
                z2 = false;
                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                bj4VarO.C(objF);
            } else {
                oh4Var5 = oh4Var;
                z2 = false;
                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                bj4VarO.C(objF);
            }
            bj4VarO.U(z2);
            ci4<? super jt1, ? super Integer, g2b> ci4Var1111114 = ci4VarM496getLambda1$intercom_sdk_base_release;
            TextInputPillKt.m507TextInputPillg5ZjG94(str1111111111114, str1111111111113, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1111112, maxLine1111112, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1111112, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
            oh4Var6 = oh4Var4;
            bj4Var = bj4VarO;
            bj4Var.K(-497931568);
            if (longTextQuestionModel.getCharacterLimit() != null) {
                StringBuilder sb1111112 = new StringBuilder();
                sb1111112.append(answer3.getLength());
                sb1111112.append('/');
                sb1111112.append(longTextQuestionModel.getCharacterLimit());
                mia.b(sb1111112.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
            }
            bj4Var.U(z2);
            bj4Var.U(true);
            bj4Var.U(true);
            ci4Var2 = ci4Var1111114;
            answer5 = answer3;
        } else {
            aVar = ox6.a.t;
            if (i15 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            c0187a = jt1.a.a;
            i13 = 0;
            if (i9 != 0) {
                bj4VarO.K(-652200194);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new xe6(i13);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                oh4Var4 = (oh4) objF2;
            } else {
                oh4Var4 = oh4Var3;
            }
            if (i11 != 0) {
                ci4VarM496getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m496getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM496getLambda1$intercom_sdk_base_release = ci4Var;
            }
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            ox6Var3 = ox6Var2;
            aVar2 = bt1.a.b;
            if (j1bVar == 0) {
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
            Integer numValueOf1111113 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf1111113);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            i14 = i3;
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
            ci4VarM496getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i14 >> 21) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            bj4VarO.K(-497967796);
            if (longTextQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = nr1.f(bj4VarO, longTextQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = longTextQuestionModel.getPlaceholder();
            }
            String str1111111111115 = placeholder;
            bj4VarO.U(false);
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = BuildConfig.FLAVOR;
            }
            String str1111111111116 = answer4;
            if (validationError instanceof ValidationError.ValidationStringError) {
                uh1Var = null;
            } else {
                uh1Var = null;
            }
            long jM836getAccessibleColorOnWhiteBackground8_81llA1111113 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
            int maxLine1111113 = longTextQuestionModel.getMaxLine();
            float fM450getMinHeightD9Ej5fM1111113 = longTextQuestionModel.m450getMinHeightD9Ej5fM();
            bj4VarO.K(-497955273);
            if ((i14 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            objF = bj4VarO.f();
            if (z) {
                oh4Var5 = oh4Var;
                z2 = false;
                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                bj4VarO.C(objF);
            } else {
                oh4Var5 = oh4Var;
                z2 = false;
                objF = new ye6(0 == true ? 1 : 0, oh4Var5);
                bj4VarO.C(objF);
            }
            bj4VarO.U(z2);
            ci4<? super jt1, ? super Integer, g2b> ci4Var1111115 = ci4VarM496getLambda1$intercom_sdk_base_release;
            TextInputPillKt.m507TextInputPillg5ZjG94(str1111111111116, str1111111111115, (oh4) objF, uh1Var, jM836getAccessibleColorOnWhiteBackground8_81llA1111113, maxLine1111113, false, oh4Var4, 0, 1, false, null, false, fM450getMinHeightD9Ej5fM1111113, bj4VarO, ((i14 << 3) & 29360128) | 805306368, 6, 6464);
            oh4Var6 = oh4Var4;
            bj4Var = bj4VarO;
            bj4Var.K(-497931568);
            if (longTextQuestionModel.getCharacterLimit() != null) {
                StringBuilder sb1111113 = new StringBuilder();
                sb1111113.append(answer3.getLength());
                sb1111113.append('/');
                sb1111113.append(longTextQuestionModel.getCharacterLimit());
                mia.b(sb1111113.toString(), eo7.m(new c15(di.a.o), 0.0f, 4.0f, 0.0f, 0.0f, 13), u7d.d(4285756278L), cka.b(14), null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4Var, 24960, 0, 262120);
            }
            bj4Var.U(z2);
            bj4Var.U(true);
            bj4Var.U(true);
            ci4Var2 = ci4Var1111115;
            answer5 = answer3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final oh4 oh4Var1118 = oh4Var5;
            final ox6 ox6Var1115 = ox6Var3;
            xj8VarW.d = new ci4() { // from class: ze6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LongTextQuestionKt.LongTextQuestion$lambda$6(ox6Var1115, longTextQuestionModel, answer5, oh4Var1118, surveyUiColors, validationError, oh4Var6, ci4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LongTextQuestion$lambda$1$lambda$0(ap5 ap5Var) {
        ap5Var.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LongTextQuestion$lambda$5$lambda$4$lambda$3$lambda$2(oh4 oh4Var, String str) {
        str.getClass();
        if (str.length() > 0) {
            oh4Var.invoke(new Answer.SingleAnswer(str));
        } else {
            oh4Var.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LongTextQuestion$lambda$6(ox6 ox6Var, SurveyData.Step.Question.LongTextQuestionModel longTextQuestionModel, Answer answer, oh4 oh4Var, SurveyUiColors surveyUiColors, ValidationError validationError, oh4 oh4Var2, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        LongTextQuestion(ox6Var, longTextQuestionModel, answer, oh4Var, surveyUiColors, validationError, oh4Var2, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
