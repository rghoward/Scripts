package io.intercom.android.sdk.survey.ui.components;

import defpackage.aj1;
import defpackage.ap5;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.d3a;
import defpackage.d94;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.g51;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw0;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.r56;
import defpackage.rd7;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xv9;
import defpackage.yi1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class QuestionComponentKt {
    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:126:0x0187  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0222  */
    /* JADX WARN: Code duplicated, block: B:158:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x022f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:166:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0278  */
    /* JADX WARN: Code duplicated, block: B:171:0x0308  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: QuestionComponent-lzVJ5Jw, reason: not valid java name */
    public static final void m453QuestionComponentlzVJ5Jw(ox6 ox6Var, ox6 ox6Var2, final QuestionState questionState, SurveyUiColors surveyUiColors, final oh4<? super String, g2b> oh4Var, long j, float f, ob4 ob4Var, long j2, oh4<? super AnswerClickData, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6VarI;
        int i4;
        SurveyUiColors surveyUiColors2;
        int i5;
        long jA;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        jt1.a.C0187a c0187a;
        ox6.a aVar;
        ox6 ox6Var3;
        ob4 ob4Var2;
        long jB;
        int i15;
        SurveyUiColors surveyUiColors3;
        final long j3;
        long j4;
        ox6 ox6Var4;
        ox6 ox6Var5;
        final ob4 ob4Var3;
        oh4<? super AnswerClickData, g2b> oh4Var3;
        Object objF;
        int i16;
        boolean z;
        boolean z2;
        Object objF2;
        final xv9 xv9Var;
        final d94 d94Var;
        boolean zJ;
        Object objF3;
        final ox6 ox6Var6;
        bj4 bj4Var;
        final SurveyUiColors surveyUiColors4;
        final ox6 ox6Var7;
        final long j5;
        final ob4 ob4Var4;
        final long j6;
        final oh4<? super AnswerClickData, g2b> oh4Var4;
        final float f3;
        xj8 xj8VarW;
        int i17;
        questionState.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(435304450);
        int i18 = i2 & 1;
        if (i18 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i19 = i2 & 2;
        if (i19 == 0) {
            if ((i & 48) == 0) {
                ox6VarI = ox6Var2;
                i3 |= bj4VarO.J(ox6VarI) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (bj4VarO.j(questionState)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    surveyUiColors2 = surveyUiColors;
                    int i20 = bj4VarO.J(surveyUiColors2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                    i3 |= i20;
                } else {
                    surveyUiColors2 = surveyUiColors;
                }
                i3 |= i20;
            } else {
                surveyUiColors2 = surveyUiColors;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                jA = j;
                if ((i2 & 32) == 0 || !bj4VarO.i(jA)) {
                    i17 = 65536;
                } else {
                    i17 = 131072;
                }
                i3 |= i17;
            } else {
                jA = j;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((i & 1572864) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (bj4VarO.J(ob4Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (bj4VarO.i(j2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 512;
                if (i12 != 0) {
                    if ((i & 805306368) == 0) {
                        if (bj4VarO.j(oh4Var2)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 306783379) == 306783378 || !bj4VarO.r()) {
                        bj4VarO.v0();
                        i14 = i & 1;
                        c0187a = jt1.a.a;
                        if (i14 != 0 || bj4VarO.c0()) {
                            aVar = ox6.a.t;
                            if (i18 != 0) {
                                ox6Var3 = aVar;
                            } else {
                                ox6Var3 = ox6Var;
                            }
                            if (i19 != 0) {
                                ox6VarI = eo7.i(aVar, 16.0f);
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                surveyUiColors2 = questionState.getSurveyUiColors();
                            }
                            if ((i2 & 32) != 0) {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                i3 &= -458753;
                            }
                            if (i6 != 0) {
                                f2 = 1.0f;
                            }
                            if (i8 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if (i10 != 0) {
                                jB = cka.b(16);
                            } else {
                                jB = j2;
                            }
                            if (i12 != 0) {
                                bj4VarO.K(-1352076741);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new r56(2);
                                    bj4VarO.C(objF);
                                }
                                oh4<? super AnswerClickData, g2b> oh4Var5 = (oh4) objF;
                                bj4VarO.U(false);
                                ox6 ox6Var8 = ox6VarI;
                                ob4Var3 = ob4Var2;
                                oh4Var3 = oh4Var5;
                                ox6Var4 = ox6Var8;
                                i15 = i3;
                                surveyUiColors3 = surveyUiColors2;
                                j3 = jB;
                                j4 = jA;
                                ox6Var5 = ox6Var3;
                            } else {
                                i15 = i3;
                                surveyUiColors3 = surveyUiColors2;
                                j3 = jB;
                                j4 = jA;
                                ox6Var4 = ox6VarI;
                                ox6Var5 = ox6Var3;
                                ob4Var3 = ob4Var2;
                                oh4Var3 = oh4Var2;
                            }
                        } else {
                            bj4VarO.u();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            oh4Var3 = oh4Var2;
                            ox6Var4 = ox6VarI;
                            j4 = jA;
                            ox6Var5 = ox6Var;
                            ob4Var3 = ob4Var;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = j2;
                        }
                        bj4VarO.V();
                        final oh4<? super AnswerClickData, g2b> oh4Var6 = oh4Var3;
                        bj4VarO.K(-1352075009);
                        boolean zJ2 = bj4VarO.j(questionState);
                        i16 = i15 & 57344;
                        final ox6 ox6Var9 = ox6Var4;
                        if (i16 == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = zJ2 | z;
                        objF2 = bj4VarO.f();
                        if (z2 || objF2 == c0187a) {
                            objF2 = new oh4() { // from class: jg8
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        final oh4 oh4Var7 = (oh4) objF2;
                        bj4VarO.U(false);
                        xv9Var = (xv9) bj4VarO.F(qu1.q);
                        final SurveyUiColors surveyUiColors5 = surveyUiColors3;
                        d94Var = (d94) bj4VarO.F(qu1.i);
                        long j7 = j4;
                        bj4VarO.K(-1352059966);
                        zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                        objF3 = bj4VarO.f();
                        if (zJ || objF3 == c0187a) {
                            objF3 = new oh4() { // from class: kg8
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        final oh4 oh4Var8 = (oh4) objF3;
                        bj4VarO.U(false);
                        final fr1 fr1VarB = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                            public final void invoke(jt1 jt1Var2, int i21) {
                                if ((i21 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                                StringProvider description = questionState.getQuestionModel().getDescription();
                                boolean zIsRequired = questionState.getQuestionModel().isRequired();
                                ValidationError validationError = questionState.getValidationError();
                                ob4 ob4Var5 = ob4Var3;
                                long j8 = j3;
                                SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                                SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                                QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j8, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                        long j8 = j3;
                        g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j7, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                            public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                                jt1 jt1Var3 = jt1Var2;
                                bj1Var.getClass();
                                if ((i21 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                final QuestionState questionState2 = questionState;
                                ox6 ox6Var10 = ox6Var9;
                                oh4<Answer, g2b> oh4Var9 = oh4Var7;
                                SurveyUiColors surveyUiColors6 = surveyUiColors5;
                                ci4<jt1, Integer, g2b> ci4Var = fr1VarB;
                                oh4<ap5, g2b> oh4Var10 = oh4Var8;
                                oh4<AnswerClickData, g2b> oh4Var11 = oh4Var6;
                                final ob4 ob4Var5 = ob4Var3;
                                final long j9 = j3;
                                aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                                int iHashCode = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY = jt1Var3.y();
                                ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                                rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(jt1Var3, bt1.a.h);
                                rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                                if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                    jt1Var3.K(1477468483);
                                    DropDownQuestionKt.DropDownQuestion(ox6Var10, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, surveyUiColors6, ci4Var, jt1Var3, 196608, 0);
                                    jt1Var3.B();
                                } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                                    jt1Var3.K(1477907970);
                                    ShortTextQuestionKt.ShortTextQuestion(ox6Var10, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, surveyUiColors6, questionState2.getValidationError(), oh4Var10, ci4Var, jt1Var3, 12582912, 0);
                                    jt1Var3 = jt1Var3;
                                    jt1Var3.B();
                                } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                                    jt1Var3.K(1478470403);
                                    LongTextQuestionKt.LongTextQuestion(ox6Var10, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, surveyUiColors6, questionState2.getValidationError(), oh4Var10, ci4Var, jt1Var2, 12582912, 0);
                                    jt1Var3 = jt1Var2;
                                    jt1Var3.B();
                                } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                                    jt1Var3.K(1479033177);
                                    NumericRatingQuestionKt.NumericRatingQuestion(ox6Var10, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, surveyUiColors6, ci4Var, jt1Var3, 196608, 0);
                                    jt1Var3.B();
                                } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                    jt1Var3.K(1479481499);
                                    SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var10, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, surveyUiColors6, ci4Var, jt1Var3, 196608, 0);
                                    jt1Var3.B();
                                } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                                    jt1Var3.K(1479930007);
                                    MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var10, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, surveyUiColors6, ci4Var, jt1Var3, 196608, 0);
                                    jt1Var3.B();
                                } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                                    jt1Var3.K(1480376314);
                                    DatePickerQuestionKt.DatePickerQuestion(ox6Var10, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, ci4Var, jt1Var2, 24576, 0);
                                    jt1Var3 = jt1Var2;
                                    jt1Var3.B();
                                } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                                    jt1Var3.K(1480765519);
                                    UploadFileQuestionKt.UploadFileQuestion(ox6Var10, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var9, oh4Var11, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                        public final void invoke(jt1 jt1Var4, int i22) {
                                            if ((i22 & 3) == 2 && jt1Var4.r()) {
                                                jt1Var4.u();
                                            } else {
                                                UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j9, jt1Var4, 0);
                                            }
                                        }

                                        @Override // defpackage.ci4
                                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                            invoke(jt1Var4, num.intValue());
                                            return g2b.a;
                                        }
                                    }, jt1Var3), jt1Var3, 196608, 0);
                                    jt1Var3.B();
                                } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                                    jt1Var3.K(1481357340);
                                    jt1Var3.B();
                                } else {
                                    jt1Var3.K(1481416395);
                                    jt1Var3.B();
                                }
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                                invoke(bj1Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, 196608, 16);
                        ox6Var6 = ox6Var9;
                        bj4Var = bj4VarO;
                        surveyUiColors4 = surveyUiColors5;
                        ox6Var7 = ox6Var5;
                        j5 = j7;
                        ob4Var4 = ob4Var3;
                        j6 = j8;
                        oh4Var4 = oh4Var6;
                    } else {
                        bj4VarO.u();
                        ox6Var7 = ox6Var;
                        j6 = j2;
                        bj4Var = bj4VarO;
                        ox6Var6 = ox6VarI;
                        surveyUiColors4 = surveyUiColors2;
                        j5 = jA;
                        ob4Var4 = ob4Var;
                        oh4Var4 = oh4Var2;
                    }
                    f3 = f2;
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: lg8
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 805306368;
                if ((i3 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    i14 = i & 1;
                    c0187a = jt1.a.a;
                    if (i14 != 0) {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var9 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var10 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var9;
                            ox6Var4 = ox6Var10;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    } else {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var10 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var11 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var10;
                            ox6Var4 = ox6Var11;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    }
                    bj4VarO.V();
                    final oh4<? super AnswerClickData, g2b> oh4Var11 = oh4Var3;
                    bj4VarO.K(-1352075009);
                    boolean zJ3 = bj4VarO.j(questionState);
                    i16 = i15 & 57344;
                    final ox6 ox6Var12 = ox6Var4;
                    if (i16 == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ3 | z;
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    final oh4<? super Answer, g2b> oh4Var12 = (oh4) objF2;
                    bj4VarO.U(false);
                    xv9Var = (xv9) bj4VarO.F(qu1.q);
                    final SurveyUiColors surveyUiColors6 = surveyUiColors3;
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    long j9 = j4;
                    bj4VarO.K(-1352059966);
                    zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    final oh4<? super ap5, g2b> oh4Var13 = (oh4) objF3;
                    bj4VarO.U(false);
                    final ci4<? super jt1, ? super Integer, g2b> fr1VarB2 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                        public final void invoke(jt1 jt1Var2, int i21) {
                            if ((i21 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                            StringProvider description = questionState.getQuestionModel().getDescription();
                            boolean zIsRequired = questionState.getQuestionModel().isRequired();
                            ValidationError validationError = questionState.getValidationError();
                            ob4 ob4Var5 = ob4Var3;
                            long j10 = j3;
                            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                            QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j10, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    long j10 = j3;
                    g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j9, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                        public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                            jt1 jt1Var3 = jt1Var2;
                            bj1Var.getClass();
                            if ((i21 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            final QuestionState questionState2 = questionState;
                            ox6 ox6Var13 = ox6Var12;
                            oh4<Answer, g2b> oh4Var14 = oh4Var12;
                            SurveyUiColors surveyUiColors7 = surveyUiColors6;
                            ci4<jt1, Integer, g2b> ci4Var = fr1VarB2;
                            oh4<ap5, g2b> oh4Var15 = oh4Var13;
                            oh4<AnswerClickData, g2b> oh4Var16 = oh4Var11;
                            final ob4 ob4Var5 = ob4Var3;
                            final long j11 = j3;
                            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                            if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                jt1Var3.K(1477468483);
                                DropDownQuestionKt.DropDownQuestion(ox6Var13, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, surveyUiColors7, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                                jt1Var3.K(1477907970);
                                ShortTextQuestionKt.ShortTextQuestion(ox6Var13, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, surveyUiColors7, questionState2.getValidationError(), oh4Var15, ci4Var, jt1Var3, 12582912, 0);
                                jt1Var3 = jt1Var3;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                                jt1Var3.K(1478470403);
                                LongTextQuestionKt.LongTextQuestion(ox6Var13, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, surveyUiColors7, questionState2.getValidationError(), oh4Var15, ci4Var, jt1Var2, 12582912, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                                jt1Var3.K(1479033177);
                                NumericRatingQuestionKt.NumericRatingQuestion(ox6Var13, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, surveyUiColors7, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                jt1Var3.K(1479481499);
                                SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var13, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, surveyUiColors7, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                                jt1Var3.K(1479930007);
                                MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var13, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, surveyUiColors7, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                                jt1Var3.K(1480376314);
                                DatePickerQuestionKt.DatePickerQuestion(ox6Var13, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, ci4Var, jt1Var2, 24576, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                                jt1Var3.K(1480765519);
                                UploadFileQuestionKt.UploadFileQuestion(ox6Var13, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var14, oh4Var16, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                    public final void invoke(jt1 jt1Var4, int i22) {
                                        if ((i22 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j11, jt1Var4, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                                jt1Var3.K(1481357340);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(1481416395);
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                            invoke(bj1Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 196608, 16);
                    ox6Var6 = ox6Var12;
                    bj4Var = bj4VarO;
                    surveyUiColors4 = surveyUiColors6;
                    ox6Var7 = ox6Var5;
                    j5 = j9;
                    ob4Var4 = ob4Var3;
                    j6 = j10;
                    oh4Var4 = oh4Var11;
                } else {
                    bj4VarO.v0();
                    i14 = i & 1;
                    c0187a = jt1.a.a;
                    if (i14 != 0) {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var14 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var13 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var14;
                            ox6Var4 = ox6Var13;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    } else {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var15 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var14 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var15;
                            ox6Var4 = ox6Var14;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    }
                    bj4VarO.V();
                    final oh4<? super AnswerClickData, g2b> oh4Var16 = oh4Var3;
                    bj4VarO.K(-1352075009);
                    boolean zJ4 = bj4VarO.j(questionState);
                    i16 = i15 & 57344;
                    final ox6 ox6Var15 = ox6Var4;
                    if (i16 == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ4 | z;
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    final oh4<? super Answer, g2b> oh4Var17 = (oh4) objF2;
                    bj4VarO.U(false);
                    xv9Var = (xv9) bj4VarO.F(qu1.q);
                    final SurveyUiColors surveyUiColors7 = surveyUiColors3;
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    long j11 = j4;
                    bj4VarO.K(-1352059966);
                    zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    final oh4<? super ap5, g2b> oh4Var18 = (oh4) objF3;
                    bj4VarO.U(false);
                    final ci4<? super jt1, ? super Integer, g2b> fr1VarB3 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                        public final void invoke(jt1 jt1Var2, int i21) {
                            if ((i21 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                            StringProvider description = questionState.getQuestionModel().getDescription();
                            boolean zIsRequired = questionState.getQuestionModel().isRequired();
                            ValidationError validationError = questionState.getValidationError();
                            ob4 ob4Var5 = ob4Var3;
                            long j12 = j3;
                            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                            QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j12, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    long j12 = j3;
                    g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j11, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                        public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                            jt1 jt1Var3 = jt1Var2;
                            bj1Var.getClass();
                            if ((i21 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            final QuestionState questionState2 = questionState;
                            ox6 ox6Var16 = ox6Var15;
                            oh4<Answer, g2b> oh4Var19 = oh4Var17;
                            SurveyUiColors surveyUiColors8 = surveyUiColors7;
                            ci4<jt1, Integer, g2b> ci4Var = fr1VarB3;
                            oh4<ap5, g2b> oh4Var110 = oh4Var18;
                            oh4<AnswerClickData, g2b> oh4Var111 = oh4Var16;
                            final ob4 ob4Var5 = ob4Var3;
                            final long j13 = j3;
                            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                            if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                jt1Var3.K(1477468483);
                                DropDownQuestionKt.DropDownQuestion(ox6Var16, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, surveyUiColors8, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                                jt1Var3.K(1477907970);
                                ShortTextQuestionKt.ShortTextQuestion(ox6Var16, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, surveyUiColors8, questionState2.getValidationError(), oh4Var110, ci4Var, jt1Var3, 12582912, 0);
                                jt1Var3 = jt1Var3;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                                jt1Var3.K(1478470403);
                                LongTextQuestionKt.LongTextQuestion(ox6Var16, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, surveyUiColors8, questionState2.getValidationError(), oh4Var110, ci4Var, jt1Var2, 12582912, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                                jt1Var3.K(1479033177);
                                NumericRatingQuestionKt.NumericRatingQuestion(ox6Var16, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, surveyUiColors8, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                jt1Var3.K(1479481499);
                                SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var16, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, surveyUiColors8, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                                jt1Var3.K(1479930007);
                                MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var16, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, surveyUiColors8, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                                jt1Var3.K(1480376314);
                                DatePickerQuestionKt.DatePickerQuestion(ox6Var16, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, ci4Var, jt1Var2, 24576, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                                jt1Var3.K(1480765519);
                                UploadFileQuestionKt.UploadFileQuestion(ox6Var16, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var19, oh4Var111, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                    public final void invoke(jt1 jt1Var4, int i22) {
                                        if ((i22 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j13, jt1Var4, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                                jt1Var3.K(1481357340);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(1481416395);
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                            invoke(bj1Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 196608, 16);
                    ox6Var6 = ox6Var15;
                    bj4Var = bj4VarO;
                    surveyUiColors4 = surveyUiColors7;
                    ox6Var7 = ox6Var5;
                    j5 = j11;
                    ob4Var4 = ob4Var3;
                    j6 = j12;
                    oh4Var4 = oh4Var16;
                }
                f3 = f2;
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lg8
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            f2 = f;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (bj4VarO.J(ob4Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i2 & 256;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.i(j2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            i12 = i2 & 512;
            if (i12 != 0) {
                if ((i & 805306368) == 0) {
                    if (bj4VarO.j(oh4Var2)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i3 |= i13;
                }
                if ((i3 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    i14 = i & 1;
                    c0187a = jt1.a.a;
                    if (i14 != 0) {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var19 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var16 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var19;
                            ox6Var4 = ox6Var16;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    } else {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var110 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var17 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var110;
                            ox6Var4 = ox6Var17;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    }
                    bj4VarO.V();
                    final oh4<? super AnswerClickData, g2b> oh4Var111 = oh4Var3;
                    bj4VarO.K(-1352075009);
                    boolean zJ5 = bj4VarO.j(questionState);
                    i16 = i15 & 57344;
                    final ox6 ox6Var18 = ox6Var4;
                    if (i16 == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ5 | z;
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    final oh4<? super Answer, g2b> oh4Var112 = (oh4) objF2;
                    bj4VarO.U(false);
                    xv9Var = (xv9) bj4VarO.F(qu1.q);
                    final SurveyUiColors surveyUiColors8 = surveyUiColors3;
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    long j13 = j4;
                    bj4VarO.K(-1352059966);
                    zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    final oh4<? super ap5, g2b> oh4Var113 = (oh4) objF3;
                    bj4VarO.U(false);
                    final ci4<? super jt1, ? super Integer, g2b> fr1VarB4 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                        public final void invoke(jt1 jt1Var2, int i21) {
                            if ((i21 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                            StringProvider description = questionState.getQuestionModel().getDescription();
                            boolean zIsRequired = questionState.getQuestionModel().isRequired();
                            ValidationError validationError = questionState.getValidationError();
                            ob4 ob4Var5 = ob4Var3;
                            long j14 = j3;
                            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                            QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j14, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    long j14 = j3;
                    g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j13, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                        public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                            jt1 jt1Var3 = jt1Var2;
                            bj1Var.getClass();
                            if ((i21 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            final QuestionState questionState2 = questionState;
                            ox6 ox6Var19 = ox6Var18;
                            oh4<Answer, g2b> oh4Var114 = oh4Var112;
                            SurveyUiColors surveyUiColors9 = surveyUiColors8;
                            ci4<jt1, Integer, g2b> ci4Var = fr1VarB4;
                            oh4<ap5, g2b> oh4Var115 = oh4Var113;
                            oh4<AnswerClickData, g2b> oh4Var116 = oh4Var111;
                            final ob4 ob4Var5 = ob4Var3;
                            final long j15 = j3;
                            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                            if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                jt1Var3.K(1477468483);
                                DropDownQuestionKt.DropDownQuestion(ox6Var19, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, surveyUiColors9, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                                jt1Var3.K(1477907970);
                                ShortTextQuestionKt.ShortTextQuestion(ox6Var19, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, surveyUiColors9, questionState2.getValidationError(), oh4Var115, ci4Var, jt1Var3, 12582912, 0);
                                jt1Var3 = jt1Var3;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                                jt1Var3.K(1478470403);
                                LongTextQuestionKt.LongTextQuestion(ox6Var19, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, surveyUiColors9, questionState2.getValidationError(), oh4Var115, ci4Var, jt1Var2, 12582912, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                                jt1Var3.K(1479033177);
                                NumericRatingQuestionKt.NumericRatingQuestion(ox6Var19, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, surveyUiColors9, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                jt1Var3.K(1479481499);
                                SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var19, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, surveyUiColors9, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                                jt1Var3.K(1479930007);
                                MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var19, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, surveyUiColors9, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                                jt1Var3.K(1480376314);
                                DatePickerQuestionKt.DatePickerQuestion(ox6Var19, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, ci4Var, jt1Var2, 24576, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                                jt1Var3.K(1480765519);
                                UploadFileQuestionKt.UploadFileQuestion(ox6Var19, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var114, oh4Var116, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                    public final void invoke(jt1 jt1Var4, int i22) {
                                        if ((i22 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j15, jt1Var4, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                                jt1Var3.K(1481357340);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(1481416395);
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                            invoke(bj1Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 196608, 16);
                    ox6Var6 = ox6Var18;
                    bj4Var = bj4VarO;
                    surveyUiColors4 = surveyUiColors8;
                    ox6Var7 = ox6Var5;
                    j5 = j13;
                    ob4Var4 = ob4Var3;
                    j6 = j14;
                    oh4Var4 = oh4Var111;
                } else {
                    bj4VarO.v0();
                    i14 = i & 1;
                    c0187a = jt1.a.a;
                    if (i14 != 0) {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var114 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var19 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var114;
                            ox6Var4 = ox6Var19;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    } else {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var115 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var110 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var115;
                            ox6Var4 = ox6Var110;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    }
                    bj4VarO.V();
                    final oh4<? super AnswerClickData, g2b> oh4Var116 = oh4Var3;
                    bj4VarO.K(-1352075009);
                    boolean zJ6 = bj4VarO.j(questionState);
                    i16 = i15 & 57344;
                    final ox6 ox6Var111 = ox6Var4;
                    if (i16 == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ6 | z;
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    final oh4<? super Answer, g2b> oh4Var117 = (oh4) objF2;
                    bj4VarO.U(false);
                    xv9Var = (xv9) bj4VarO.F(qu1.q);
                    final SurveyUiColors surveyUiColors9 = surveyUiColors3;
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    long j15 = j4;
                    bj4VarO.K(-1352059966);
                    zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    final oh4<? super ap5, g2b> oh4Var118 = (oh4) objF3;
                    bj4VarO.U(false);
                    final ci4<? super jt1, ? super Integer, g2b> fr1VarB5 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                        public final void invoke(jt1 jt1Var2, int i21) {
                            if ((i21 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                            StringProvider description = questionState.getQuestionModel().getDescription();
                            boolean zIsRequired = questionState.getQuestionModel().isRequired();
                            ValidationError validationError = questionState.getValidationError();
                            ob4 ob4Var5 = ob4Var3;
                            long j16 = j3;
                            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                            QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j16, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    long j16 = j3;
                    g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j15, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                        public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                            jt1 jt1Var3 = jt1Var2;
                            bj1Var.getClass();
                            if ((i21 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            final QuestionState questionState2 = questionState;
                            ox6 ox6Var112 = ox6Var111;
                            oh4<Answer, g2b> oh4Var119 = oh4Var117;
                            SurveyUiColors surveyUiColors10 = surveyUiColors9;
                            ci4<jt1, Integer, g2b> ci4Var = fr1VarB5;
                            oh4<ap5, g2b> oh4Var1110 = oh4Var118;
                            oh4<AnswerClickData, g2b> oh4Var1111 = oh4Var116;
                            final ob4 ob4Var5 = ob4Var3;
                            final long j17 = j3;
                            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                            if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                jt1Var3.K(1477468483);
                                DropDownQuestionKt.DropDownQuestion(ox6Var112, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, surveyUiColors10, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                                jt1Var3.K(1477907970);
                                ShortTextQuestionKt.ShortTextQuestion(ox6Var112, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, surveyUiColors10, questionState2.getValidationError(), oh4Var1110, ci4Var, jt1Var3, 12582912, 0);
                                jt1Var3 = jt1Var3;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                                jt1Var3.K(1478470403);
                                LongTextQuestionKt.LongTextQuestion(ox6Var112, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, surveyUiColors10, questionState2.getValidationError(), oh4Var1110, ci4Var, jt1Var2, 12582912, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                                jt1Var3.K(1479033177);
                                NumericRatingQuestionKt.NumericRatingQuestion(ox6Var112, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, surveyUiColors10, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                jt1Var3.K(1479481499);
                                SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var112, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, surveyUiColors10, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                                jt1Var3.K(1479930007);
                                MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var112, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, surveyUiColors10, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                                jt1Var3.K(1480376314);
                                DatePickerQuestionKt.DatePickerQuestion(ox6Var112, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, ci4Var, jt1Var2, 24576, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                                jt1Var3.K(1480765519);
                                UploadFileQuestionKt.UploadFileQuestion(ox6Var112, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var119, oh4Var1111, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                    public final void invoke(jt1 jt1Var4, int i22) {
                                        if ((i22 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j17, jt1Var4, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                                jt1Var3.K(1481357340);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(1481416395);
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                            invoke(bj1Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 196608, 16);
                    ox6Var6 = ox6Var111;
                    bj4Var = bj4VarO;
                    surveyUiColors4 = surveyUiColors9;
                    ox6Var7 = ox6Var5;
                    j5 = j15;
                    ob4Var4 = ob4Var3;
                    j6 = j16;
                    oh4Var4 = oh4Var116;
                }
                f3 = f2;
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lg8
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) == 306783378) {
                bj4VarO.v0();
                i14 = i & 1;
                c0187a = jt1.a.a;
                if (i14 != 0) {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var119 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var112 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var119;
                        ox6Var4 = ox6Var112;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                } else {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var1110 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var113 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var1110;
                        ox6Var4 = ox6Var113;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                }
                bj4VarO.V();
                final oh4<? super AnswerClickData, g2b> oh4Var1111 = oh4Var3;
                bj4VarO.K(-1352075009);
                boolean zJ7 = bj4VarO.j(questionState);
                i16 = i15 & 57344;
                final ox6 ox6Var114 = ox6Var4;
                if (i16 == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ7 | z;
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                final oh4<? super Answer, g2b> oh4Var1112 = (oh4) objF2;
                bj4VarO.U(false);
                xv9Var = (xv9) bj4VarO.F(qu1.q);
                final SurveyUiColors surveyUiColors10 = surveyUiColors3;
                d94Var = (d94) bj4VarO.F(qu1.i);
                long j17 = j4;
                bj4VarO.K(-1352059966);
                zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                final oh4<? super ap5, g2b> oh4Var1113 = (oh4) objF3;
                bj4VarO.U(false);
                final ci4<? super jt1, ? super Integer, g2b> fr1VarB6 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                    public final void invoke(jt1 jt1Var2, int i21) {
                        if ((i21 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                        StringProvider description = questionState.getQuestionModel().getDescription();
                        boolean zIsRequired = questionState.getQuestionModel().isRequired();
                        ValidationError validationError = questionState.getValidationError();
                        ob4 ob4Var5 = ob4Var3;
                        long j18 = j3;
                        SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                        SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                        QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j18, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                long j18 = j3;
                g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j17, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                        jt1 jt1Var3 = jt1Var2;
                        bj1Var.getClass();
                        if ((i21 & 17) == 16 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        final QuestionState questionState2 = questionState;
                        ox6 ox6Var115 = ox6Var114;
                        oh4<Answer, g2b> oh4Var1114 = oh4Var1112;
                        SurveyUiColors surveyUiColors11 = surveyUiColors10;
                        ci4<jt1, Integer, g2b> ci4Var = fr1VarB6;
                        oh4<ap5, g2b> oh4Var1115 = oh4Var1113;
                        oh4<AnswerClickData, g2b> oh4Var1116 = oh4Var1111;
                        final ob4 ob4Var5 = ob4Var3;
                        final long j19 = j3;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var3, bt1.a.h);
                        rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                        SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                        if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                            jt1Var3.K(1477468483);
                            DropDownQuestionKt.DropDownQuestion(ox6Var115, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, surveyUiColors11, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                            jt1Var3.K(1477907970);
                            ShortTextQuestionKt.ShortTextQuestion(ox6Var115, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, surveyUiColors11, questionState2.getValidationError(), oh4Var1115, ci4Var, jt1Var3, 12582912, 0);
                            jt1Var3 = jt1Var3;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                            jt1Var3.K(1478470403);
                            LongTextQuestionKt.LongTextQuestion(ox6Var115, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, surveyUiColors11, questionState2.getValidationError(), oh4Var1115, ci4Var, jt1Var2, 12582912, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                            jt1Var3.K(1479033177);
                            NumericRatingQuestionKt.NumericRatingQuestion(ox6Var115, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, surveyUiColors11, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            jt1Var3.K(1479481499);
                            SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var115, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, surveyUiColors11, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                            jt1Var3.K(1479930007);
                            MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var115, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, surveyUiColors11, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                            jt1Var3.K(1480376314);
                            DatePickerQuestionKt.DatePickerQuestion(ox6Var115, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, ci4Var, jt1Var2, 24576, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                            jt1Var3.K(1480765519);
                            UploadFileQuestionKt.UploadFileQuestion(ox6Var115, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1114, oh4Var1116, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                public final void invoke(jt1 jt1Var4, int i22) {
                                    if ((i22 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j19, jt1Var4, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                            jt1Var3.K(1481357340);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(1481416395);
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 196608, 16);
                ox6Var6 = ox6Var114;
                bj4Var = bj4VarO;
                surveyUiColors4 = surveyUiColors10;
                ox6Var7 = ox6Var5;
                j5 = j17;
                ob4Var4 = ob4Var3;
                j6 = j18;
                oh4Var4 = oh4Var1111;
            } else {
                bj4VarO.v0();
                i14 = i & 1;
                c0187a = jt1.a.a;
                if (i14 != 0) {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var1114 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var115 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var1114;
                        ox6Var4 = ox6Var115;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                } else {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var1115 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var116 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var1115;
                        ox6Var4 = ox6Var116;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                }
                bj4VarO.V();
                final oh4<? super AnswerClickData, g2b> oh4Var1116 = oh4Var3;
                bj4VarO.K(-1352075009);
                boolean zJ8 = bj4VarO.j(questionState);
                i16 = i15 & 57344;
                final ox6 ox6Var117 = ox6Var4;
                if (i16 == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ8 | z;
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                final oh4<? super Answer, g2b> oh4Var1117 = (oh4) objF2;
                bj4VarO.U(false);
                xv9Var = (xv9) bj4VarO.F(qu1.q);
                final SurveyUiColors surveyUiColors11 = surveyUiColors3;
                d94Var = (d94) bj4VarO.F(qu1.i);
                long j19 = j4;
                bj4VarO.K(-1352059966);
                zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                final oh4<? super ap5, g2b> oh4Var1118 = (oh4) objF3;
                bj4VarO.U(false);
                final ci4<? super jt1, ? super Integer, g2b> fr1VarB7 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                    public final void invoke(jt1 jt1Var2, int i21) {
                        if ((i21 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                        StringProvider description = questionState.getQuestionModel().getDescription();
                        boolean zIsRequired = questionState.getQuestionModel().isRequired();
                        ValidationError validationError = questionState.getValidationError();
                        ob4 ob4Var5 = ob4Var3;
                        long j110 = j3;
                        SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                        SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                        QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j110, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                long j110 = j3;
                g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j19, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                        jt1 jt1Var3 = jt1Var2;
                        bj1Var.getClass();
                        if ((i21 & 17) == 16 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        final QuestionState questionState2 = questionState;
                        ox6 ox6Var118 = ox6Var117;
                        oh4<Answer, g2b> oh4Var1119 = oh4Var1117;
                        SurveyUiColors surveyUiColors12 = surveyUiColors11;
                        ci4<jt1, Integer, g2b> ci4Var = fr1VarB7;
                        oh4<ap5, g2b> oh4Var11110 = oh4Var1118;
                        oh4<AnswerClickData, g2b> oh4Var11111 = oh4Var1116;
                        final ob4 ob4Var5 = ob4Var3;
                        final long j111 = j3;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var3, bt1.a.h);
                        rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                        SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                        if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                            jt1Var3.K(1477468483);
                            DropDownQuestionKt.DropDownQuestion(ox6Var118, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, surveyUiColors12, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                            jt1Var3.K(1477907970);
                            ShortTextQuestionKt.ShortTextQuestion(ox6Var118, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, surveyUiColors12, questionState2.getValidationError(), oh4Var11110, ci4Var, jt1Var3, 12582912, 0);
                            jt1Var3 = jt1Var3;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                            jt1Var3.K(1478470403);
                            LongTextQuestionKt.LongTextQuestion(ox6Var118, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, surveyUiColors12, questionState2.getValidationError(), oh4Var11110, ci4Var, jt1Var2, 12582912, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                            jt1Var3.K(1479033177);
                            NumericRatingQuestionKt.NumericRatingQuestion(ox6Var118, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, surveyUiColors12, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            jt1Var3.K(1479481499);
                            SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var118, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, surveyUiColors12, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                            jt1Var3.K(1479930007);
                            MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var118, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, surveyUiColors12, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                            jt1Var3.K(1480376314);
                            DatePickerQuestionKt.DatePickerQuestion(ox6Var118, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, ci4Var, jt1Var2, 24576, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                            jt1Var3.K(1480765519);
                            UploadFileQuestionKt.UploadFileQuestion(ox6Var118, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1119, oh4Var11111, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                public final void invoke(jt1 jt1Var4, int i22) {
                                    if ((i22 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j111, jt1Var4, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                            jt1Var3.K(1481357340);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(1481416395);
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 196608, 16);
                ox6Var6 = ox6Var117;
                bj4Var = bj4VarO;
                surveyUiColors4 = surveyUiColors11;
                ox6Var7 = ox6Var5;
                j5 = j19;
                ob4Var4 = ob4Var3;
                j6 = j110;
                oh4Var4 = oh4Var1116;
            }
            f3 = f2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lg8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6VarI = ox6Var2;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (bj4VarO.j(questionState)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                surveyUiColors2 = surveyUiColors;
                if (bj4VarO.J(surveyUiColors2)) {
                }
                i3 |= i20;
            } else {
                surveyUiColors2 = surveyUiColors;
            }
            i3 |= i20;
        } else {
            surveyUiColors2 = surveyUiColors;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (bj4VarO.j(oh4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i) == 0) {
            jA = j;
            if ((i2 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i3 |= i17;
        } else {
            jA = j;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((i & 1572864) == 0) {
                f2 = f;
                if (bj4VarO.g(f2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (bj4VarO.J(ob4Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            i10 = i2 & 256;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (bj4VarO.i(j2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            i12 = i2 & 512;
            if (i12 != 0) {
                if ((i & 805306368) == 0) {
                    if (bj4VarO.j(oh4Var2)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i3 |= i13;
                }
                if ((i3 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    i14 = i & 1;
                    c0187a = jt1.a.a;
                    if (i14 != 0) {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var1119 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var118 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var1119;
                            ox6Var4 = ox6Var118;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    } else {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var11110 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var119 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var11110;
                            ox6Var4 = ox6Var119;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    }
                    bj4VarO.V();
                    final oh4<? super AnswerClickData, g2b> oh4Var11111 = oh4Var3;
                    bj4VarO.K(-1352075009);
                    boolean zJ9 = bj4VarO.j(questionState);
                    i16 = i15 & 57344;
                    final ox6 ox6Var1110 = ox6Var4;
                    if (i16 == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ9 | z;
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    final oh4<? super Answer, g2b> oh4Var11112 = (oh4) objF2;
                    bj4VarO.U(false);
                    xv9Var = (xv9) bj4VarO.F(qu1.q);
                    final SurveyUiColors surveyUiColors12 = surveyUiColors3;
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    long j111 = j4;
                    bj4VarO.K(-1352059966);
                    zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    final oh4<? super ap5, g2b> oh4Var11113 = (oh4) objF3;
                    bj4VarO.U(false);
                    final ci4<? super jt1, ? super Integer, g2b> fr1VarB8 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                        public final void invoke(jt1 jt1Var2, int i21) {
                            if ((i21 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                            StringProvider description = questionState.getQuestionModel().getDescription();
                            boolean zIsRequired = questionState.getQuestionModel().isRequired();
                            ValidationError validationError = questionState.getValidationError();
                            ob4 ob4Var5 = ob4Var3;
                            long j112 = j3;
                            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                            QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j112, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    long j112 = j3;
                    g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j111, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                        public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                            jt1 jt1Var3 = jt1Var2;
                            bj1Var.getClass();
                            if ((i21 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            final QuestionState questionState2 = questionState;
                            ox6 ox6Var1111 = ox6Var1110;
                            oh4<Answer, g2b> oh4Var11114 = oh4Var11112;
                            SurveyUiColors surveyUiColors13 = surveyUiColors12;
                            ci4<jt1, Integer, g2b> ci4Var = fr1VarB8;
                            oh4<ap5, g2b> oh4Var11115 = oh4Var11113;
                            oh4<AnswerClickData, g2b> oh4Var11116 = oh4Var11111;
                            final ob4 ob4Var5 = ob4Var3;
                            final long j113 = j3;
                            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                            if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                jt1Var3.K(1477468483);
                                DropDownQuestionKt.DropDownQuestion(ox6Var1111, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, surveyUiColors13, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                                jt1Var3.K(1477907970);
                                ShortTextQuestionKt.ShortTextQuestion(ox6Var1111, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, surveyUiColors13, questionState2.getValidationError(), oh4Var11115, ci4Var, jt1Var3, 12582912, 0);
                                jt1Var3 = jt1Var3;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                                jt1Var3.K(1478470403);
                                LongTextQuestionKt.LongTextQuestion(ox6Var1111, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, surveyUiColors13, questionState2.getValidationError(), oh4Var11115, ci4Var, jt1Var2, 12582912, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                                jt1Var3.K(1479033177);
                                NumericRatingQuestionKt.NumericRatingQuestion(ox6Var1111, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, surveyUiColors13, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                jt1Var3.K(1479481499);
                                SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var1111, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, surveyUiColors13, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                                jt1Var3.K(1479930007);
                                MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var1111, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, surveyUiColors13, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                                jt1Var3.K(1480376314);
                                DatePickerQuestionKt.DatePickerQuestion(ox6Var1111, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, ci4Var, jt1Var2, 24576, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                                jt1Var3.K(1480765519);
                                UploadFileQuestionKt.UploadFileQuestion(ox6Var1111, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11114, oh4Var11116, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                    public final void invoke(jt1 jt1Var4, int i22) {
                                        if ((i22 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j113, jt1Var4, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                                jt1Var3.K(1481357340);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(1481416395);
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                            invoke(bj1Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 196608, 16);
                    ox6Var6 = ox6Var1110;
                    bj4Var = bj4VarO;
                    surveyUiColors4 = surveyUiColors12;
                    ox6Var7 = ox6Var5;
                    j5 = j111;
                    ob4Var4 = ob4Var3;
                    j6 = j112;
                    oh4Var4 = oh4Var11111;
                } else {
                    bj4VarO.v0();
                    i14 = i & 1;
                    c0187a = jt1.a.a;
                    if (i14 != 0) {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var11114 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var1111 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var11114;
                            ox6Var4 = ox6Var1111;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    } else {
                        aVar = ox6.a.t;
                        if (i18 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var;
                        }
                        if (i19 != 0) {
                            ox6VarI = eo7.i(aVar, 16.0f);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            surveyUiColors2 = questionState.getSurveyUiColors();
                        }
                        if ((i2 & 32) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            f2 = 1.0f;
                        }
                        if (i8 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if (i10 != 0) {
                            jB = cka.b(16);
                        } else {
                            jB = j2;
                        }
                        if (i12 != 0) {
                            bj4VarO.K(-1352076741);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new r56(2);
                                bj4VarO.C(objF);
                            }
                            oh4<? super AnswerClickData, g2b> oh4Var11115 = (oh4) objF;
                            bj4VarO.U(false);
                            ox6 ox6Var1112 = ox6VarI;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var11115;
                            ox6Var4 = ox6Var1112;
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var5 = ox6Var3;
                        } else {
                            i15 = i3;
                            surveyUiColors3 = surveyUiColors2;
                            j3 = jB;
                            j4 = jA;
                            ox6Var4 = ox6VarI;
                            ox6Var5 = ox6Var3;
                            ob4Var3 = ob4Var2;
                            oh4Var3 = oh4Var2;
                        }
                    }
                    bj4VarO.V();
                    final oh4<? super AnswerClickData, g2b> oh4Var11116 = oh4Var3;
                    bj4VarO.K(-1352075009);
                    boolean zJ10 = bj4VarO.j(questionState);
                    i16 = i15 & 57344;
                    final ox6 ox6Var1113 = ox6Var4;
                    if (i16 == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = zJ10 | z;
                    objF2 = bj4VarO.f();
                    if (z2) {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: jg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    final oh4<? super Answer, g2b> oh4Var11117 = (oh4) objF2;
                    bj4VarO.U(false);
                    xv9Var = (xv9) bj4VarO.F(qu1.q);
                    final SurveyUiColors surveyUiColors13 = surveyUiColors3;
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    long j113 = j4;
                    bj4VarO.K(-1352059966);
                    zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: kg8
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    final oh4<? super ap5, g2b> oh4Var11118 = (oh4) objF3;
                    bj4VarO.U(false);
                    final ci4<? super jt1, ? super Integer, g2b> fr1VarB9 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                        public final void invoke(jt1 jt1Var2, int i21) {
                            if ((i21 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                            StringProvider description = questionState.getQuestionModel().getDescription();
                            boolean zIsRequired = questionState.getQuestionModel().isRequired();
                            ValidationError validationError = questionState.getValidationError();
                            ob4 ob4Var5 = ob4Var3;
                            long j114 = j3;
                            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                            SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                            QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j114, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    long j114 = j3;
                    g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j113, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                        public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                            jt1 jt1Var3 = jt1Var2;
                            bj1Var.getClass();
                            if ((i21 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            final QuestionState questionState2 = questionState;
                            ox6 ox6Var1114 = ox6Var1113;
                            oh4<Answer, g2b> oh4Var11119 = oh4Var11117;
                            SurveyUiColors surveyUiColors14 = surveyUiColors13;
                            ci4<jt1, Integer, g2b> ci4Var = fr1VarB9;
                            oh4<ap5, g2b> oh4Var111110 = oh4Var11118;
                            oh4<AnswerClickData, g2b> oh4Var111111 = oh4Var11116;
                            final ob4 ob4Var5 = ob4Var3;
                            final long j115 = j3;
                            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                            if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                jt1Var3.K(1477468483);
                                DropDownQuestionKt.DropDownQuestion(ox6Var1114, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, surveyUiColors14, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                                jt1Var3.K(1477907970);
                                ShortTextQuestionKt.ShortTextQuestion(ox6Var1114, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, surveyUiColors14, questionState2.getValidationError(), oh4Var111110, ci4Var, jt1Var3, 12582912, 0);
                                jt1Var3 = jt1Var3;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                                jt1Var3.K(1478470403);
                                LongTextQuestionKt.LongTextQuestion(ox6Var1114, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, surveyUiColors14, questionState2.getValidationError(), oh4Var111110, ci4Var, jt1Var2, 12582912, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                                jt1Var3.K(1479033177);
                                NumericRatingQuestionKt.NumericRatingQuestion(ox6Var1114, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, surveyUiColors14, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                jt1Var3.K(1479481499);
                                SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var1114, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, surveyUiColors14, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                                jt1Var3.K(1479930007);
                                MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var1114, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, surveyUiColors14, ci4Var, jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                                jt1Var3.K(1480376314);
                                DatePickerQuestionKt.DatePickerQuestion(ox6Var1114, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, ci4Var, jt1Var2, 24576, 0);
                                jt1Var3 = jt1Var2;
                                jt1Var3.B();
                            } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                                jt1Var3.K(1480765519);
                                UploadFileQuestionKt.UploadFileQuestion(ox6Var1114, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11119, oh4Var111111, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                    public final void invoke(jt1 jt1Var4, int i22) {
                                        if ((i22 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j115, jt1Var4, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 196608, 0);
                                jt1Var3.B();
                            } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                                jt1Var3.K(1481357340);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(1481416395);
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                            invoke(bj1Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 196608, 16);
                    ox6Var6 = ox6Var1113;
                    bj4Var = bj4VarO;
                    surveyUiColors4 = surveyUiColors13;
                    ox6Var7 = ox6Var5;
                    j5 = j113;
                    ob4Var4 = ob4Var3;
                    j6 = j114;
                    oh4Var4 = oh4Var11116;
                }
                f3 = f2;
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lg8
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) == 306783378) {
                bj4VarO.v0();
                i14 = i & 1;
                c0187a = jt1.a.a;
                if (i14 != 0) {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var11119 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var1114 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var11119;
                        ox6Var4 = ox6Var1114;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                } else {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var111110 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var1115 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var111110;
                        ox6Var4 = ox6Var1115;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                }
                bj4VarO.V();
                final oh4<? super AnswerClickData, g2b> oh4Var111111 = oh4Var3;
                bj4VarO.K(-1352075009);
                boolean zJ11 = bj4VarO.j(questionState);
                i16 = i15 & 57344;
                final ox6 ox6Var1116 = ox6Var4;
                if (i16 == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ11 | z;
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                final oh4<? super Answer, g2b> oh4Var111112 = (oh4) objF2;
                bj4VarO.U(false);
                xv9Var = (xv9) bj4VarO.F(qu1.q);
                final SurveyUiColors surveyUiColors14 = surveyUiColors3;
                d94Var = (d94) bj4VarO.F(qu1.i);
                long j115 = j4;
                bj4VarO.K(-1352059966);
                zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                final oh4<? super ap5, g2b> oh4Var111113 = (oh4) objF3;
                bj4VarO.U(false);
                final ci4<? super jt1, ? super Integer, g2b> fr1VarB10 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                    public final void invoke(jt1 jt1Var2, int i21) {
                        if ((i21 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                        StringProvider description = questionState.getQuestionModel().getDescription();
                        boolean zIsRequired = questionState.getQuestionModel().isRequired();
                        ValidationError validationError = questionState.getValidationError();
                        ob4 ob4Var5 = ob4Var3;
                        long j116 = j3;
                        SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                        SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                        QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j116, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                long j116 = j3;
                g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j115, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                        jt1 jt1Var3 = jt1Var2;
                        bj1Var.getClass();
                        if ((i21 & 17) == 16 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        final QuestionState questionState2 = questionState;
                        ox6 ox6Var1117 = ox6Var1116;
                        oh4<Answer, g2b> oh4Var111114 = oh4Var111112;
                        SurveyUiColors surveyUiColors15 = surveyUiColors14;
                        ci4<jt1, Integer, g2b> ci4Var = fr1VarB10;
                        oh4<ap5, g2b> oh4Var111115 = oh4Var111113;
                        oh4<AnswerClickData, g2b> oh4Var111116 = oh4Var111111;
                        final ob4 ob4Var5 = ob4Var3;
                        final long j117 = j3;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var3, bt1.a.h);
                        rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                        SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                        if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                            jt1Var3.K(1477468483);
                            DropDownQuestionKt.DropDownQuestion(ox6Var1117, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, surveyUiColors15, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                            jt1Var3.K(1477907970);
                            ShortTextQuestionKt.ShortTextQuestion(ox6Var1117, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, surveyUiColors15, questionState2.getValidationError(), oh4Var111115, ci4Var, jt1Var3, 12582912, 0);
                            jt1Var3 = jt1Var3;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                            jt1Var3.K(1478470403);
                            LongTextQuestionKt.LongTextQuestion(ox6Var1117, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, surveyUiColors15, questionState2.getValidationError(), oh4Var111115, ci4Var, jt1Var2, 12582912, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                            jt1Var3.K(1479033177);
                            NumericRatingQuestionKt.NumericRatingQuestion(ox6Var1117, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, surveyUiColors15, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            jt1Var3.K(1479481499);
                            SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var1117, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, surveyUiColors15, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                            jt1Var3.K(1479930007);
                            MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var1117, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, surveyUiColors15, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                            jt1Var3.K(1480376314);
                            DatePickerQuestionKt.DatePickerQuestion(ox6Var1117, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, ci4Var, jt1Var2, 24576, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                            jt1Var3.K(1480765519);
                            UploadFileQuestionKt.UploadFileQuestion(ox6Var1117, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111114, oh4Var111116, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                public final void invoke(jt1 jt1Var4, int i22) {
                                    if ((i22 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j117, jt1Var4, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                            jt1Var3.K(1481357340);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(1481416395);
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 196608, 16);
                ox6Var6 = ox6Var1116;
                bj4Var = bj4VarO;
                surveyUiColors4 = surveyUiColors14;
                ox6Var7 = ox6Var5;
                j5 = j115;
                ob4Var4 = ob4Var3;
                j6 = j116;
                oh4Var4 = oh4Var111111;
            } else {
                bj4VarO.v0();
                i14 = i & 1;
                c0187a = jt1.a.a;
                if (i14 != 0) {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var111114 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var1117 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var111114;
                        ox6Var4 = ox6Var1117;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                } else {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var111115 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var1118 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var111115;
                        ox6Var4 = ox6Var1118;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                }
                bj4VarO.V();
                final oh4<? super AnswerClickData, g2b> oh4Var111116 = oh4Var3;
                bj4VarO.K(-1352075009);
                boolean zJ12 = bj4VarO.j(questionState);
                i16 = i15 & 57344;
                final ox6 ox6Var1119 = ox6Var4;
                if (i16 == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ12 | z;
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                final oh4<? super Answer, g2b> oh4Var111117 = (oh4) objF2;
                bj4VarO.U(false);
                xv9Var = (xv9) bj4VarO.F(qu1.q);
                final SurveyUiColors surveyUiColors15 = surveyUiColors3;
                d94Var = (d94) bj4VarO.F(qu1.i);
                long j117 = j4;
                bj4VarO.K(-1352059966);
                zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                final oh4<? super ap5, g2b> oh4Var111118 = (oh4) objF3;
                bj4VarO.U(false);
                final ci4<? super jt1, ? super Integer, g2b> fr1VarB11 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                    public final void invoke(jt1 jt1Var2, int i21) {
                        if ((i21 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                        StringProvider description = questionState.getQuestionModel().getDescription();
                        boolean zIsRequired = questionState.getQuestionModel().isRequired();
                        ValidationError validationError = questionState.getValidationError();
                        ob4 ob4Var5 = ob4Var3;
                        long j118 = j3;
                        SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                        SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                        QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j118, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                long j118 = j3;
                g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j117, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                        jt1 jt1Var3 = jt1Var2;
                        bj1Var.getClass();
                        if ((i21 & 17) == 16 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        final QuestionState questionState2 = questionState;
                        ox6 ox6Var11110 = ox6Var1119;
                        oh4<Answer, g2b> oh4Var111119 = oh4Var111117;
                        SurveyUiColors surveyUiColors16 = surveyUiColors15;
                        ci4<jt1, Integer, g2b> ci4Var = fr1VarB11;
                        oh4<ap5, g2b> oh4Var1111110 = oh4Var111118;
                        oh4<AnswerClickData, g2b> oh4Var1111111 = oh4Var111116;
                        final ob4 ob4Var5 = ob4Var3;
                        final long j119 = j3;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var3, bt1.a.h);
                        rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                        SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                        if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                            jt1Var3.K(1477468483);
                            DropDownQuestionKt.DropDownQuestion(ox6Var11110, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, surveyUiColors16, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                            jt1Var3.K(1477907970);
                            ShortTextQuestionKt.ShortTextQuestion(ox6Var11110, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, surveyUiColors16, questionState2.getValidationError(), oh4Var1111110, ci4Var, jt1Var3, 12582912, 0);
                            jt1Var3 = jt1Var3;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                            jt1Var3.K(1478470403);
                            LongTextQuestionKt.LongTextQuestion(ox6Var11110, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, surveyUiColors16, questionState2.getValidationError(), oh4Var1111110, ci4Var, jt1Var2, 12582912, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                            jt1Var3.K(1479033177);
                            NumericRatingQuestionKt.NumericRatingQuestion(ox6Var11110, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, surveyUiColors16, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            jt1Var3.K(1479481499);
                            SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var11110, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, surveyUiColors16, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                            jt1Var3.K(1479930007);
                            MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var11110, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, surveyUiColors16, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                            jt1Var3.K(1480376314);
                            DatePickerQuestionKt.DatePickerQuestion(ox6Var11110, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, ci4Var, jt1Var2, 24576, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                            jt1Var3.K(1480765519);
                            UploadFileQuestionKt.UploadFileQuestion(ox6Var11110, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var111119, oh4Var1111111, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                public final void invoke(jt1 jt1Var4, int i22) {
                                    if ((i22 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j119, jt1Var4, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                            jt1Var3.K(1481357340);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(1481416395);
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 196608, 16);
                ox6Var6 = ox6Var1119;
                bj4Var = bj4VarO;
                surveyUiColors4 = surveyUiColors15;
                ox6Var7 = ox6Var5;
                j5 = j117;
                ob4Var4 = ob4Var3;
                j6 = j118;
                oh4Var4 = oh4Var111116;
            }
            f3 = f2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lg8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        f2 = f;
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (bj4VarO.J(ob4Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        i10 = i2 & 256;
        if (i10 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (bj4VarO.i(j2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i3 |= i11;
        }
        i12 = i2 & 512;
        if (i12 != 0) {
            if ((i & 805306368) == 0) {
                if (bj4VarO.j(oh4Var2)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i3 |= i13;
            }
            if ((i3 & 306783379) == 306783378) {
                bj4VarO.v0();
                i14 = i & 1;
                c0187a = jt1.a.a;
                if (i14 != 0) {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var111119 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var11110 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var111119;
                        ox6Var4 = ox6Var11110;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                } else {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var1111110 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var11111 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var1111110;
                        ox6Var4 = ox6Var11111;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                }
                bj4VarO.V();
                final oh4<? super AnswerClickData, g2b> oh4Var1111111 = oh4Var3;
                bj4VarO.K(-1352075009);
                boolean zJ13 = bj4VarO.j(questionState);
                i16 = i15 & 57344;
                final ox6 ox6Var11112 = ox6Var4;
                if (i16 == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ13 | z;
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                final oh4<? super Answer, g2b> oh4Var1111112 = (oh4) objF2;
                bj4VarO.U(false);
                xv9Var = (xv9) bj4VarO.F(qu1.q);
                final SurveyUiColors surveyUiColors16 = surveyUiColors3;
                d94Var = (d94) bj4VarO.F(qu1.i);
                long j119 = j4;
                bj4VarO.K(-1352059966);
                zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                final oh4<? super ap5, g2b> oh4Var1111113 = (oh4) objF3;
                bj4VarO.U(false);
                final ci4<? super jt1, ? super Integer, g2b> fr1VarB12 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                    public final void invoke(jt1 jt1Var2, int i21) {
                        if ((i21 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                        StringProvider description = questionState.getQuestionModel().getDescription();
                        boolean zIsRequired = questionState.getQuestionModel().isRequired();
                        ValidationError validationError = questionState.getValidationError();
                        ob4 ob4Var5 = ob4Var3;
                        long j1110 = j3;
                        SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                        SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                        QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j1110, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                long j1110 = j3;
                g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j119, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                        jt1 jt1Var3 = jt1Var2;
                        bj1Var.getClass();
                        if ((i21 & 17) == 16 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        final QuestionState questionState2 = questionState;
                        ox6 ox6Var11113 = ox6Var11112;
                        oh4<Answer, g2b> oh4Var1111114 = oh4Var1111112;
                        SurveyUiColors surveyUiColors17 = surveyUiColors16;
                        ci4<jt1, Integer, g2b> ci4Var = fr1VarB12;
                        oh4<ap5, g2b> oh4Var1111115 = oh4Var1111113;
                        oh4<AnswerClickData, g2b> oh4Var1111116 = oh4Var1111111;
                        final ob4 ob4Var5 = ob4Var3;
                        final long j1111 = j3;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var3, bt1.a.h);
                        rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                        SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                        if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                            jt1Var3.K(1477468483);
                            DropDownQuestionKt.DropDownQuestion(ox6Var11113, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, surveyUiColors17, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                            jt1Var3.K(1477907970);
                            ShortTextQuestionKt.ShortTextQuestion(ox6Var11113, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, surveyUiColors17, questionState2.getValidationError(), oh4Var1111115, ci4Var, jt1Var3, 12582912, 0);
                            jt1Var3 = jt1Var3;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                            jt1Var3.K(1478470403);
                            LongTextQuestionKt.LongTextQuestion(ox6Var11113, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, surveyUiColors17, questionState2.getValidationError(), oh4Var1111115, ci4Var, jt1Var2, 12582912, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                            jt1Var3.K(1479033177);
                            NumericRatingQuestionKt.NumericRatingQuestion(ox6Var11113, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, surveyUiColors17, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            jt1Var3.K(1479481499);
                            SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var11113, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, surveyUiColors17, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                            jt1Var3.K(1479930007);
                            MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var11113, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, surveyUiColors17, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                            jt1Var3.K(1480376314);
                            DatePickerQuestionKt.DatePickerQuestion(ox6Var11113, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, ci4Var, jt1Var2, 24576, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                            jt1Var3.K(1480765519);
                            UploadFileQuestionKt.UploadFileQuestion(ox6Var11113, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111114, oh4Var1111116, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                public final void invoke(jt1 jt1Var4, int i22) {
                                    if ((i22 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j1111, jt1Var4, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                            jt1Var3.K(1481357340);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(1481416395);
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 196608, 16);
                ox6Var6 = ox6Var11112;
                bj4Var = bj4VarO;
                surveyUiColors4 = surveyUiColors16;
                ox6Var7 = ox6Var5;
                j5 = j119;
                ob4Var4 = ob4Var3;
                j6 = j1110;
                oh4Var4 = oh4Var1111111;
            } else {
                bj4VarO.v0();
                i14 = i & 1;
                c0187a = jt1.a.a;
                if (i14 != 0) {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var1111114 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var11113 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var1111114;
                        ox6Var4 = ox6Var11113;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                } else {
                    aVar = ox6.a.t;
                    if (i18 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var;
                    }
                    if (i19 != 0) {
                        ox6VarI = eo7.i(aVar, 16.0f);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        surveyUiColors2 = questionState.getSurveyUiColors();
                    }
                    if ((i2 & 32) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                    if (i8 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if (i10 != 0) {
                        jB = cka.b(16);
                    } else {
                        jB = j2;
                    }
                    if (i12 != 0) {
                        bj4VarO.K(-1352076741);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new r56(2);
                            bj4VarO.C(objF);
                        }
                        oh4<? super AnswerClickData, g2b> oh4Var1111115 = (oh4) objF;
                        bj4VarO.U(false);
                        ox6 ox6Var11114 = ox6VarI;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var1111115;
                        ox6Var4 = ox6Var11114;
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var5 = ox6Var3;
                    } else {
                        i15 = i3;
                        surveyUiColors3 = surveyUiColors2;
                        j3 = jB;
                        j4 = jA;
                        ox6Var4 = ox6VarI;
                        ox6Var5 = ox6Var3;
                        ob4Var3 = ob4Var2;
                        oh4Var3 = oh4Var2;
                    }
                }
                bj4VarO.V();
                final oh4<? super AnswerClickData, g2b> oh4Var1111116 = oh4Var3;
                bj4VarO.K(-1352075009);
                boolean zJ14 = bj4VarO.j(questionState);
                i16 = i15 & 57344;
                final ox6 ox6Var11115 = ox6Var4;
                if (i16 == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ14 | z;
                objF2 = bj4VarO.f();
                if (z2) {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: jg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                final oh4<? super Answer, g2b> oh4Var1111117 = (oh4) objF2;
                bj4VarO.U(false);
                xv9Var = (xv9) bj4VarO.F(qu1.q);
                final SurveyUiColors surveyUiColors17 = surveyUiColors3;
                d94Var = (d94) bj4VarO.F(qu1.i);
                long j1111 = j4;
                bj4VarO.K(-1352059966);
                zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: kg8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                final oh4<? super ap5, g2b> oh4Var1111118 = (oh4) objF3;
                bj4VarO.U(false);
                final ci4<? super jt1, ? super Integer, g2b> fr1VarB13 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                    public final void invoke(jt1 jt1Var2, int i21) {
                        if ((i21 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                        StringProvider description = questionState.getQuestionModel().getDescription();
                        boolean zIsRequired = questionState.getQuestionModel().isRequired();
                        ValidationError validationError = questionState.getValidationError();
                        ob4 ob4Var5 = ob4Var3;
                        long j1112 = j3;
                        SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                        SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                        QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j1112, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                long j1112 = j3;
                g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j1111, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                        jt1 jt1Var3 = jt1Var2;
                        bj1Var.getClass();
                        if ((i21 & 17) == 16 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        final QuestionState questionState2 = questionState;
                        ox6 ox6Var11116 = ox6Var11115;
                        oh4<Answer, g2b> oh4Var1111119 = oh4Var1111117;
                        SurveyUiColors surveyUiColors18 = surveyUiColors17;
                        ci4<jt1, Integer, g2b> ci4Var = fr1VarB13;
                        oh4<ap5, g2b> oh4Var11111110 = oh4Var1111118;
                        oh4<AnswerClickData, g2b> oh4Var11111111 = oh4Var1111116;
                        final ob4 ob4Var5 = ob4Var3;
                        final long j1113 = j3;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var3, bt1.a.h);
                        rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                        SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                        if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                            jt1Var3.K(1477468483);
                            DropDownQuestionKt.DropDownQuestion(ox6Var11116, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, surveyUiColors18, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                            jt1Var3.K(1477907970);
                            ShortTextQuestionKt.ShortTextQuestion(ox6Var11116, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, surveyUiColors18, questionState2.getValidationError(), oh4Var11111110, ci4Var, jt1Var3, 12582912, 0);
                            jt1Var3 = jt1Var3;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                            jt1Var3.K(1478470403);
                            LongTextQuestionKt.LongTextQuestion(ox6Var11116, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, surveyUiColors18, questionState2.getValidationError(), oh4Var11111110, ci4Var, jt1Var2, 12582912, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                            jt1Var3.K(1479033177);
                            NumericRatingQuestionKt.NumericRatingQuestion(ox6Var11116, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, surveyUiColors18, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            jt1Var3.K(1479481499);
                            SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var11116, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, surveyUiColors18, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                            jt1Var3.K(1479930007);
                            MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var11116, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, surveyUiColors18, ci4Var, jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                            jt1Var3.K(1480376314);
                            DatePickerQuestionKt.DatePickerQuestion(ox6Var11116, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, ci4Var, jt1Var2, 24576, 0);
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                        } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                            jt1Var3.K(1480765519);
                            UploadFileQuestionKt.UploadFileQuestion(ox6Var11116, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var1111119, oh4Var11111111, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                                public final void invoke(jt1 jt1Var4, int i22) {
                                    if ((i22 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j1113, jt1Var4, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 196608, 0);
                            jt1Var3.B();
                        } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                            jt1Var3.K(1481357340);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(1481416395);
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 196608, 16);
                ox6Var6 = ox6Var11115;
                bj4Var = bj4VarO;
                surveyUiColors4 = surveyUiColors17;
                ox6Var7 = ox6Var5;
                j5 = j1111;
                ob4Var4 = ob4Var3;
                j6 = j1112;
                oh4Var4 = oh4Var1111116;
            }
            f3 = f2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lg8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 805306368;
        if ((i3 & 306783379) == 306783378) {
            bj4VarO.v0();
            i14 = i & 1;
            c0187a = jt1.a.a;
            if (i14 != 0) {
                aVar = ox6.a.t;
                if (i18 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var;
                }
                if (i19 != 0) {
                    ox6VarI = eo7.i(aVar, 16.0f);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    surveyUiColors2 = questionState.getSurveyUiColors();
                }
                if ((i2 & 32) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if (i10 != 0) {
                    jB = cka.b(16);
                } else {
                    jB = j2;
                }
                if (i12 != 0) {
                    bj4VarO.K(-1352076741);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new r56(2);
                        bj4VarO.C(objF);
                    }
                    oh4<? super AnswerClickData, g2b> oh4Var1111119 = (oh4) objF;
                    bj4VarO.U(false);
                    ox6 ox6Var11116 = ox6VarI;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var1111119;
                    ox6Var4 = ox6Var11116;
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var5 = ox6Var3;
                } else {
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var4 = ox6VarI;
                    ox6Var5 = ox6Var3;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var2;
                }
            } else {
                aVar = ox6.a.t;
                if (i18 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var;
                }
                if (i19 != 0) {
                    ox6VarI = eo7.i(aVar, 16.0f);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    surveyUiColors2 = questionState.getSurveyUiColors();
                }
                if ((i2 & 32) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if (i10 != 0) {
                    jB = cka.b(16);
                } else {
                    jB = j2;
                }
                if (i12 != 0) {
                    bj4VarO.K(-1352076741);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new r56(2);
                        bj4VarO.C(objF);
                    }
                    oh4<? super AnswerClickData, g2b> oh4Var11111110 = (oh4) objF;
                    bj4VarO.U(false);
                    ox6 ox6Var11117 = ox6VarI;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var11111110;
                    ox6Var4 = ox6Var11117;
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var5 = ox6Var3;
                } else {
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var4 = ox6VarI;
                    ox6Var5 = ox6Var3;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var2;
                }
            }
            bj4VarO.V();
            final oh4<? super AnswerClickData, g2b> oh4Var11111111 = oh4Var3;
            bj4VarO.K(-1352075009);
            boolean zJ15 = bj4VarO.j(questionState);
            i16 = i15 & 57344;
            final ox6 ox6Var11118 = ox6Var4;
            if (i16 == 16384) {
                z = true;
            } else {
                z = false;
            }
            z2 = zJ15 | z;
            objF2 = bj4VarO.f();
            if (z2) {
                objF2 = new oh4() { // from class: jg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: jg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            final oh4<? super Answer, g2b> oh4Var11111112 = (oh4) objF2;
            bj4VarO.U(false);
            xv9Var = (xv9) bj4VarO.F(qu1.q);
            final SurveyUiColors surveyUiColors18 = surveyUiColors3;
            d94Var = (d94) bj4VarO.F(qu1.i);
            long j1113 = j4;
            bj4VarO.K(-1352059966);
            zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
            objF3 = bj4VarO.f();
            if (zJ) {
                objF3 = new oh4() { // from class: kg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new oh4() { // from class: kg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                    }
                };
                bj4VarO.C(objF3);
            }
            final oh4<? super ap5, g2b> oh4Var11111113 = (oh4) objF3;
            bj4VarO.U(false);
            final ci4<? super jt1, ? super Integer, g2b> fr1VarB14 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                public final void invoke(jt1 jt1Var2, int i21) {
                    if ((i21 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                    StringProvider description = questionState.getQuestionModel().getDescription();
                    boolean zIsRequired = questionState.getQuestionModel().isRequired();
                    ValidationError validationError = questionState.getValidationError();
                    ob4 ob4Var5 = ob4Var3;
                    long j1114 = j3;
                    SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                    SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                    QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j1114, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            long j1114 = j3;
            g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j1113, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                    jt1 jt1Var3 = jt1Var2;
                    bj1Var.getClass();
                    if ((i21 & 17) == 16 && jt1Var3.r()) {
                        jt1Var3.u();
                        return;
                    }
                    final QuestionState questionState2 = questionState;
                    ox6 ox6Var11119 = ox6Var11118;
                    oh4<Answer, g2b> oh4Var11111114 = oh4Var11111112;
                    SurveyUiColors surveyUiColors19 = surveyUiColors18;
                    ci4<jt1, Integer, g2b> ci4Var = fr1VarB14;
                    oh4<ap5, g2b> oh4Var11111115 = oh4Var11111113;
                    oh4<AnswerClickData, g2b> oh4Var11111116 = oh4Var11111111;
                    final ob4 ob4Var5 = ob4Var3;
                    final long j1115 = j3;
                    aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                    int iHashCode = Long.hashCode(jt1Var3.v());
                    kw7 kw7VarY = jt1Var3.y();
                    ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var3.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var3.q();
                    if (jt1Var3.l()) {
                        jt1Var3.k(aVar2);
                    } else {
                        jt1Var3.z();
                    }
                    rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var3, bt1.a.h);
                    rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                    SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                    if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                        jt1Var3.K(1477468483);
                        DropDownQuestionKt.DropDownQuestion(ox6Var11119, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, surveyUiColors19, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                        jt1Var3.K(1477907970);
                        ShortTextQuestionKt.ShortTextQuestion(ox6Var11119, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, surveyUiColors19, questionState2.getValidationError(), oh4Var11111115, ci4Var, jt1Var3, 12582912, 0);
                        jt1Var3 = jt1Var3;
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                        jt1Var3.K(1478470403);
                        LongTextQuestionKt.LongTextQuestion(ox6Var11119, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, surveyUiColors19, questionState2.getValidationError(), oh4Var11111115, ci4Var, jt1Var2, 12582912, 0);
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                        jt1Var3.K(1479033177);
                        NumericRatingQuestionKt.NumericRatingQuestion(ox6Var11119, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, surveyUiColors19, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        jt1Var3.K(1479481499);
                        SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var11119, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, surveyUiColors19, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                        jt1Var3.K(1479930007);
                        MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var11119, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, surveyUiColors19, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                        jt1Var3.K(1480376314);
                        DatePickerQuestionKt.DatePickerQuestion(ox6Var11119, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, ci4Var, jt1Var2, 24576, 0);
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                        jt1Var3.K(1480765519);
                        UploadFileQuestionKt.UploadFileQuestion(ox6Var11119, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111114, oh4Var11111116, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                            public final void invoke(jt1 jt1Var4, int i22) {
                                if ((i22 & 3) == 2 && jt1Var4.r()) {
                                    jt1Var4.u();
                                } else {
                                    UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j1115, jt1Var4, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                invoke(jt1Var4, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var3), jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                        jt1Var3.K(1481357340);
                        jt1Var3.B();
                    } else {
                        jt1Var3.K(1481416395);
                        jt1Var3.B();
                    }
                    jt1Var3.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 196608, 16);
            ox6Var6 = ox6Var11118;
            bj4Var = bj4VarO;
            surveyUiColors4 = surveyUiColors18;
            ox6Var7 = ox6Var5;
            j5 = j1113;
            ob4Var4 = ob4Var3;
            j6 = j1114;
            oh4Var4 = oh4Var11111111;
        } else {
            bj4VarO.v0();
            i14 = i & 1;
            c0187a = jt1.a.a;
            if (i14 != 0) {
                aVar = ox6.a.t;
                if (i18 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var;
                }
                if (i19 != 0) {
                    ox6VarI = eo7.i(aVar, 16.0f);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    surveyUiColors2 = questionState.getSurveyUiColors();
                }
                if ((i2 & 32) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if (i10 != 0) {
                    jB = cka.b(16);
                } else {
                    jB = j2;
                }
                if (i12 != 0) {
                    bj4VarO.K(-1352076741);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new r56(2);
                        bj4VarO.C(objF);
                    }
                    oh4<? super AnswerClickData, g2b> oh4Var11111114 = (oh4) objF;
                    bj4VarO.U(false);
                    ox6 ox6Var11119 = ox6VarI;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var11111114;
                    ox6Var4 = ox6Var11119;
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var5 = ox6Var3;
                } else {
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var4 = ox6VarI;
                    ox6Var5 = ox6Var3;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var2;
                }
            } else {
                aVar = ox6.a.t;
                if (i18 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var;
                }
                if (i19 != 0) {
                    ox6VarI = eo7.i(aVar, 16.0f);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    surveyUiColors2 = questionState.getSurveyUiColors();
                }
                if ((i2 & 32) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
                if (i8 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if (i10 != 0) {
                    jB = cka.b(16);
                } else {
                    jB = j2;
                }
                if (i12 != 0) {
                    bj4VarO.K(-1352076741);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new r56(2);
                        bj4VarO.C(objF);
                    }
                    oh4<? super AnswerClickData, g2b> oh4Var11111115 = (oh4) objF;
                    bj4VarO.U(false);
                    ox6 ox6Var111110 = ox6VarI;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var11111115;
                    ox6Var4 = ox6Var111110;
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var5 = ox6Var3;
                } else {
                    i15 = i3;
                    surveyUiColors3 = surveyUiColors2;
                    j3 = jB;
                    j4 = jA;
                    ox6Var4 = ox6VarI;
                    ox6Var5 = ox6Var3;
                    ob4Var3 = ob4Var2;
                    oh4Var3 = oh4Var2;
                }
            }
            bj4VarO.V();
            final oh4<? super AnswerClickData, g2b> oh4Var11111116 = oh4Var3;
            bj4VarO.K(-1352075009);
            boolean zJ16 = bj4VarO.j(questionState);
            i16 = i15 & 57344;
            final ox6 ox6Var111111 = ox6Var4;
            if (i16 == 16384) {
                z = true;
            } else {
                z = false;
            }
            z2 = zJ16 | z;
            objF2 = bj4VarO.f();
            if (z2) {
                objF2 = new oh4() { // from class: jg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: jg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(questionState, oh4Var, (Answer) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            final oh4<? super Answer, g2b> oh4Var11111117 = (oh4) objF2;
            bj4VarO.U(false);
            xv9Var = (xv9) bj4VarO.F(qu1.q);
            final SurveyUiColors surveyUiColors19 = surveyUiColors3;
            d94Var = (d94) bj4VarO.F(qu1.i);
            long j1115 = j4;
            bj4VarO.K(-1352059966);
            zJ = bj4VarO.j(questionState) | (i16 == 16384) | bj4VarO.J(xv9Var) | bj4VarO.j(d94Var);
            objF3 = bj4VarO.f();
            if (zJ) {
                objF3 = new oh4() { // from class: kg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new oh4() { // from class: kg8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(questionState, oh4Var, xv9Var, d94Var, (ap5) obj);
                    }
                };
                bj4VarO.C(objF3);
            }
            final oh4<? super ap5, g2b> oh4Var11111118 = (oh4) objF3;
            bj4VarO.U(false);
            final ci4<? super jt1, ? super Integer, g2b> fr1VarB15 = gr1.b(1322549775, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
                public final void invoke(jt1 jt1Var2, int i21) {
                    if ((i21 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                    StringProvider description = questionState.getQuestionModel().getDescription();
                    boolean zIsRequired = questionState.getQuestionModel().isRequired();
                    ValidationError validationError = questionState.getValidationError();
                    ob4 ob4Var5 = ob4Var3;
                    long j1116 = j3;
                    SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                    SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                    QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, ob4Var5, j1116, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, jt1Var2, StringProvider.$stable << 3, 64);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            long j1116 = j3;
            g51.b(kw0.a(ox6Var5, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j1115, 0L, bj4VarO, (i15 >> 15) & 14, 14), d3a.d(f2, 62), null, gr1.b(2001737844, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i21) {
                    jt1 jt1Var3 = jt1Var2;
                    bj1Var.getClass();
                    if ((i21 & 17) == 16 && jt1Var3.r()) {
                        jt1Var3.u();
                        return;
                    }
                    final QuestionState questionState2 = questionState;
                    ox6 ox6Var111112 = ox6Var111111;
                    oh4<Answer, g2b> oh4Var11111119 = oh4Var11111117;
                    SurveyUiColors surveyUiColors110 = surveyUiColors19;
                    ci4<jt1, Integer, g2b> ci4Var = fr1VarB15;
                    oh4<ap5, g2b> oh4Var111111110 = oh4Var11111118;
                    oh4<AnswerClickData, g2b> oh4Var111111111 = oh4Var11111116;
                    final ob4 ob4Var5 = ob4Var3;
                    final long j1117 = j3;
                    aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                    int iHashCode = Long.hashCode(jt1Var3.v());
                    kw7 kw7VarY = jt1Var3.y();
                    ox6 ox6VarC = it1.c(jt1Var3, ox6.a.t);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var3.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var3.q();
                    if (jt1Var3.l()) {
                        jt1Var3.k(aVar2);
                    } else {
                        jt1Var3.z();
                    }
                    rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var3, bt1.a.h);
                    rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                    SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                    if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                        jt1Var3.K(1477468483);
                        DropDownQuestionKt.DropDownQuestion(ox6Var111112, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, surveyUiColors110, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                        jt1Var3.K(1477907970);
                        ShortTextQuestionKt.ShortTextQuestion(ox6Var111112, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, surveyUiColors110, questionState2.getValidationError(), oh4Var111111110, ci4Var, jt1Var3, 12582912, 0);
                        jt1Var3 = jt1Var3;
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                        jt1Var3.K(1478470403);
                        LongTextQuestionKt.LongTextQuestion(ox6Var111112, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, surveyUiColors110, questionState2.getValidationError(), oh4Var111111110, ci4Var, jt1Var2, 12582912, 0);
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                        jt1Var3.K(1479033177);
                        NumericRatingQuestionKt.NumericRatingQuestion(ox6Var111112, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, surveyUiColors110, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        jt1Var3.K(1479481499);
                        SingleChoiceQuestionKt.SingleChoiceQuestion(ox6Var111112, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, surveyUiColors110, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                        jt1Var3.K(1479930007);
                        MultipleChoiceQuestionKt.MultipleChoiceQuestion(ox6Var111112, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, surveyUiColors110, ci4Var, jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                        jt1Var3.K(1480376314);
                        DatePickerQuestionKt.DatePickerQuestion(ox6Var111112, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, ci4Var, jt1Var2, 24576, 0);
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                    } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                        jt1Var3.K(1480765519);
                        UploadFileQuestionKt.UploadFileQuestion(ox6Var111112, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), oh4Var11111119, oh4Var111111111, gr1.b(-1590070470, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                            public final void invoke(jt1 jt1Var4, int i22) {
                                if ((i22 & 3) == 2 && jt1Var4.r()) {
                                    jt1Var4.u();
                                } else {
                                    UploadFileQuestionHeaderKt.m492UploadFileQuestionHeaderINMd_9Y(questionState2, ob4Var5, j1117, jt1Var4, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                invoke(jt1Var4, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var3), jt1Var3, 196608, 0);
                        jt1Var3.B();
                    } else if (xj5.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                        jt1Var3.K(1481357340);
                        jt1Var3.B();
                    } else {
                        jt1Var3.K(1481416395);
                        jt1Var3.B();
                    }
                    jt1Var3.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 196608, 16);
            ox6Var6 = ox6Var111111;
            bj4Var = bj4VarO;
            surveyUiColors4 = surveyUiColors19;
            ox6Var7 = ox6Var5;
            j5 = j1115;
            ob4Var4 = ob4Var3;
            j6 = j1116;
            oh4Var4 = oh4Var11111116;
        }
        f3 = f2;
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lg8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$6(ox6Var7, ox6Var6, questionState, surveyUiColors4, oh4Var, j5, f3, ob4Var4, j6, oh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b QuestionComponent_lzVJ5Jw$lambda$1$lambda$0(AnswerClickData answerClickData) {
        answerClickData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b QuestionComponent_lzVJ5Jw$lambda$3$lambda$2(QuestionState questionState, oh4 oh4Var, Answer answer) {
        answer.getClass();
        questionState.setAnswer(answer);
        if (!(questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getQuestionModel() instanceof SurveyData.Step.Question.LongTextQuestionModel)) {
            questionState.validate();
        }
        oh4Var.invoke(questionState.getQuestionModel().getId());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b QuestionComponent_lzVJ5Jw$lambda$5$lambda$4(QuestionState questionState, oh4 oh4Var, xv9 xv9Var, d94 d94Var, ap5 ap5Var) {
        ap5Var.getClass();
        questionState.validate();
        oh4Var.invoke(questionState.getQuestionModel().getId());
        if (questionState.getValidationError() instanceof ValidationError.NoValidationError) {
            if (xv9Var != null) {
                xv9Var.a();
            }
            d94Var.w(false);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b QuestionComponent_lzVJ5Jw$lambda$6(ox6 ox6Var, ox6 ox6Var2, QuestionState questionState, SurveyUiColors surveyUiColors, oh4 oh4Var, long j, float f, ob4 ob4Var, long j2, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        m453QuestionComponentlzVJ5Jw(ox6Var, ox6Var2, questionState, surveyUiColors, oh4Var, j, f, ob4Var, j2, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
