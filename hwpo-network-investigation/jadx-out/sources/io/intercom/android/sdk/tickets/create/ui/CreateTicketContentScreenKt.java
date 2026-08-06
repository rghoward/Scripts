package io.intercom.android.sdk.tickets.create.ui;

import android.view.View;
import com.intercom.twig.BuildConfig;
import defpackage.ab2;
import defpackage.ae8;
import defpackage.aj1;
import defpackage.al8;
import defpackage.an0;
import defpackage.b47;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fnb;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hnb;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j84;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.kk;
import defpackage.ko7;
import defpackage.kw7;
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
import defpackage.oy8;
import defpackage.q39;
import defpackage.q69;
import defpackage.qq2;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.u;
import defpackage.uh1;
import defpackage.v94;
import defpackage.ws0;
import defpackage.xa2;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.ya2;
import defpackage.yi1;
import defpackage.za2;
import defpackage.zy0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketContentScreenKt {
    private static final List<QuestionState> questions;
    private static final SurveyUiColors surveyUiColors;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = uh1.l;
        SurveyUiColors surveyUiColors2 = new SurveyUiColors(uh1.b, uh1.e, uh1.i, uh1.h, null, 16, null);
        surveyUiColors = surveyUiColors2;
        List listH = ws0.h(new Block.Builder().withText("Email").withType("paragraph"));
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType = SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        qq2 qq2Var = null;
        questions = ws0.i(new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel("1", listH, false, "abc@example.com", validationType, null, false, null, 0 == true ? 1 : 0, 448, qq2Var), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.LongTextQuestionModel("2", ws0.h(new Block.Builder().withText("Multiline text").withType("paragraph")), true, "Enter text here...", validationType, null, 120.0f, 0, null, 384, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DropDownQuestionModel("3", ws0.h(new Block.Builder().withText("List attribute").withType("paragraph")), true, ws0.i("Option A", "Option B", "Option C"), "Please select...", 0 == true ? 1 : 0, 32, qq2Var), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel("4", ws0.h(new Block.Builder().withText("Boolean").withType("paragraph")), false, ws0.i("True", "False"), false), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", ws0.h(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", ws0.h(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2));
    }

    @IntercomPreviews
    private static final void CreateTicketContentErrorScreenPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1908579859);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m538getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ab2(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketContentErrorScreenPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        CreateTicketContentErrorScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:106:0x031c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0330  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:88:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0203  */
    /* JADX WARN: Code duplicated, block: B:95:0x0207  */
    /* JADX WARN: Code duplicated, block: B:99:0x029c  */
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
    public static final void CreateTicketContentScreen(ox6 ox6Var, final CreateTicketViewModel.CreateTicketFormUiState.Content content, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, final oh4<? super String, g2b> oh4Var, final oh4<? super AnswerClickData, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        mh4<g2b> mh4Var3;
        int i4;
        int i5;
        oh4<? super AnswerClickData, g2b> oh4Var3;
        int i6;
        ox6.a aVar;
        float f;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        boolean z;
        SurveyUiColors surveyUiColors2;
        boolean zJ;
        Object objF;
        final ox6 ox6Var3;
        xj8 xj8VarW;
        content.getClass();
        mh4Var.getClass();
        mh4Var2.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(-296750187);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= bj4VarO.j(content) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                mh4Var3 = mh4Var;
                i3 |= bj4VarO.j(mh4Var3) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    if (bj4VarO.j(mh4Var2)) {
                        i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i4 = 1024;
                    }
                    i3 |= i4;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        if (bj4VarO.j(oh4Var)) {
                            i5 = 16384;
                        } else {
                            i5 = 8192;
                        }
                        i3 |= i5;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 196608) == 0) {
                            oh4Var3 = oh4Var2;
                            if (bj4VarO.j(oh4Var3)) {
                                i6 = 131072;
                            } else {
                                i6 = 65536;
                            }
                            i3 |= i6;
                        }
                        if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                            aVar = ox6.a.t;
                            if (i7 != 0) {
                                ox6Var2 = aVar;
                            }
                            f = 16.0f;
                            ox6 ox6VarK = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarK);
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
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            bj4VarO.K(-210345289);
                            for (QuestionState questionState : content.getQuestions()) {
                                if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                    bj4VarO.K(-267720558);
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    int i8 = IntercomTheme.$stable;
                                    surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme, bj4VarO, i8), gh5.a(intercomTheme, bj4VarO, i8), intercomTheme.getColors(bj4VarO, i8).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i8).m769getOnAction0d7_KjU(), null, 16, null);
                                    bj4VarO.U(false);
                                } else {
                                    bj4VarO.K(-267315078);
                                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                                    int i9 = IntercomTheme.$stable;
                                    surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme2, bj4VarO, i9), gh5.a(intercomTheme2, bj4VarO, i9), kk.a(intercomTheme2, bj4VarO, i9), gh5.a(intercomTheme2, bj4VarO, i9), new uh1(intercomTheme2.getColors(bj4VarO, i9).m751getAction0d7_KjU()), null);
                                    bj4VarO.U(false);
                                }
                                SurveyUiColors surveyUiColors3 = surveyUiColors2;
                                bj4VarO.K(-978435731);
                                zJ = bj4VarO.j(questionState);
                                objF = bj4VarO.f();
                                if (zJ || objF == jt1.a.a) {
                                    objF = new an0(1, questionState);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var = bj4VarO;
                                QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors3, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                                oh4Var3 = oh4Var2;
                                aVar = aVar;
                                f = f;
                                bj4VarO = bj4Var;
                            }
                            float f2 = f;
                            ox6.a aVar3 = aVar;
                            bj4VarO.U(false);
                            b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                            ox6 ox6VarM = eo7.m(ir9.c(aVar3, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                            if (content.getEnableCta() || content.getShowCreatingTicketProgress()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i10) {
                                    oy8Var.getClass();
                                    if ((i10 & 17) == 16 && jt1Var2.r()) {
                                        jt1Var2.u();
                                        return;
                                    }
                                    boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                    ox6.a aVar4 = ox6.a.t;
                                    if (showCreatingTicketProgress) {
                                        jt1Var2.K(-265542591);
                                        ae8.a(ir9.j(aVar4, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                        jt1Var2.B();
                                        return;
                                    }
                                    jt1Var2.K(-265351104);
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                                    kw7 kw7VarY = jt1Var2.y();
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
                                    String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                    int i11 = IntercomTheme.$stable;
                                    mia.b(strF, null, intercomTheme3.getColors(jt1Var2, i11).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var2, i11).getType04(), jt1Var2, 0, 0, 131066);
                                    b47.b(jt1Var2, ir9.n(aVar4, 6.0f));
                                    m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar4, 16.0f), intercomTheme3.getColors(jt1Var2, i11).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                    jt1Var2.I();
                                    jt1Var2.B();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                    invoke(oy8Var, jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                            ox6 ox6VarD = ir9.d(eo7.m(ir9.c(aVar3, 1.0f), 0.0f, 8.0f, 0.0f, f2, 5), 48.0f);
                            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                            int i10 = IntercomTheme.$stable;
                            b72 b72Var = intercomTheme3.getShapes(bj4VarO, i10).b;
                            ko7 ko7Var = zy0.a;
                            bj4 bj4Var2 = bj4VarO;
                            jz0.c(mh4Var2, ox6VarD, false, b72Var, zy0.f(0L, gh5.a(intercomTheme3, bj4VarO, i10), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var2, ((i3 >> 9) & 14) | 805306416, 484);
                            bj4VarO = bj4Var2;
                            b47.b(bj4VarO, ir9.d(aVar3, f2));
                            bj4VarO.U(true);
                        } else {
                            bj4VarO.u();
                        }
                        ox6Var3 = ox6Var2;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: bb2
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    oh4Var3 = oh4Var2;
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK2 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK2);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                                int i11 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme4, bj4VarO, i11), gh5.a(intercomTheme4, bj4VarO, i11), intercomTheme4.getColors(bj4VarO, i11).m751getAction0d7_KjU(), intercomTheme4.getColors(bj4VarO, i11).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                                int i12 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme5, bj4VarO, i12), gh5.a(intercomTheme5, bj4VarO, i12), kk.a(intercomTheme5, bj4VarO, i12), gh5.a(intercomTheme5, bj4VarO, i12), new uh1(intercomTheme5.getColors(bj4VarO, i12).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors4 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var3 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors4, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var3, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var3;
                        }
                        float f3 = f;
                        ox6.a aVar4 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM2 = eo7.m(ir9.c(aVar4, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM2, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i13) {
                                oy8Var.getClass();
                                if ((i13 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar5 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar5, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
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
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme6.getColors(jt1Var2, i14).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme6.getTypography(jt1Var2, i14).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar5, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar5, 16.0f), intercomTheme6.getColors(jt1Var2, i14).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD2 = ir9.d(eo7.m(ir9.c(aVar4, 1.0f), 0.0f, 8.0f, 0.0f, f3, 5), 48.0f);
                        IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                        int i13 = IntercomTheme.$stable;
                        b72 b72Var2 = intercomTheme6.getShapes(bj4VarO, i13).b;
                        ko7 ko7Var2 = zy0.a;
                        bj4 bj4Var4 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD2, false, b72Var2, zy0.f(0L, gh5.a(intercomTheme6, bj4VarO, i13), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var4, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var4;
                        b47.b(bj4VarO, ir9.d(aVar4, f3));
                        bj4VarO.U(true);
                    } else {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK3 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK3);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme7, bj4VarO, i14), gh5.a(intercomTheme7, bj4VarO, i14), intercomTheme7.getColors(bj4VarO, i14).m751getAction0d7_KjU(), intercomTheme7.getColors(bj4VarO, i14).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                                int i15 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme8, bj4VarO, i15), gh5.a(intercomTheme8, bj4VarO, i15), kk.a(intercomTheme8, bj4VarO, i15), gh5.a(intercomTheme8, bj4VarO, i15), new uh1(intercomTheme8.getColors(bj4VarO, i15).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors5 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var5 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors5, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var5, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var5;
                        }
                        float f4 = f;
                        ox6.a aVar5 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM3 = eo7.m(ir9.c(aVar5, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM3, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i16) {
                                oy8Var.getClass();
                                if ((i16 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar6 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar6, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
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
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                                int i17 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme9.getColors(jt1Var2, i17).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme9.getTypography(jt1Var2, i17).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar6, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar6, 16.0f), intercomTheme9.getColors(jt1Var2, i17).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD3 = ir9.d(eo7.m(ir9.c(aVar5, 1.0f), 0.0f, 8.0f, 0.0f, f4, 5), 48.0f);
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i16 = IntercomTheme.$stable;
                        b72 b72Var3 = intercomTheme9.getShapes(bj4VarO, i16).b;
                        ko7 ko7Var3 = zy0.a;
                        bj4 bj4Var6 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD3, false, b72Var3, zy0.f(0L, gh5.a(intercomTheme9, bj4VarO, i16), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var6, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var6;
                        b47.b(bj4VarO, ir9.d(aVar5, f4));
                        bj4VarO.U(true);
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: bb2
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        oh4Var3 = oh4Var2;
                        if (bj4VarO.j(oh4Var3)) {
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                        i3 |= i6;
                    }
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK4 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK4);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                                int i17 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme10, bj4VarO, i17), gh5.a(intercomTheme10, bj4VarO, i17), intercomTheme10.getColors(bj4VarO, i17).m751getAction0d7_KjU(), intercomTheme10.getColors(bj4VarO, i17).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                                int i18 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11, bj4VarO, i18), gh5.a(intercomTheme11, bj4VarO, i18), kk.a(intercomTheme11, bj4VarO, i18), gh5.a(intercomTheme11, bj4VarO, i18), new uh1(intercomTheme11.getColors(bj4VarO, i18).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors6 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var7 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors6, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var7, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var7;
                        }
                        float f5 = f;
                        ox6.a aVar6 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM4 = eo7.m(ir9.c(aVar6, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM4, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i19) {
                                oy8Var.getClass();
                                if ((i19 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar7 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar7, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
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
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                                int i110 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme12.getColors(jt1Var2, i110).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme12.getTypography(jt1Var2, i110).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar7, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar7, 16.0f), intercomTheme12.getColors(jt1Var2, i110).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD4 = ir9.d(eo7.m(ir9.c(aVar6, 1.0f), 0.0f, 8.0f, 0.0f, f5, 5), 48.0f);
                        IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                        int i19 = IntercomTheme.$stable;
                        b72 b72Var4 = intercomTheme12.getShapes(bj4VarO, i19).b;
                        ko7 ko7Var4 = zy0.a;
                        bj4 bj4Var8 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD4, false, b72Var4, zy0.f(0L, gh5.a(intercomTheme12, bj4VarO, i19), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var8, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var8;
                        b47.b(bj4VarO, ir9.d(aVar6, f5));
                        bj4VarO.U(true);
                    } else {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK5 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK5);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                                int i110 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme13, bj4VarO, i110), gh5.a(intercomTheme13, bj4VarO, i110), intercomTheme13.getColors(bj4VarO, i110).m751getAction0d7_KjU(), intercomTheme13.getColors(bj4VarO, i110).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                                int i111 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme14, bj4VarO, i111), gh5.a(intercomTheme14, bj4VarO, i111), kk.a(intercomTheme14, bj4VarO, i111), gh5.a(intercomTheme14, bj4VarO, i111), new uh1(intercomTheme14.getColors(bj4VarO, i111).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors7 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var9 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors7, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var9, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var9;
                        }
                        float f6 = f;
                        ox6.a aVar7 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM5 = eo7.m(ir9.c(aVar7, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM5, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i112) {
                                oy8Var.getClass();
                                if ((i112 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar8 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar8, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
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
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                                int i113 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme15.getColors(jt1Var2, i113).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme15.getTypography(jt1Var2, i113).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar8, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar8, 16.0f), intercomTheme15.getColors(jt1Var2, i113).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD5 = ir9.d(eo7.m(ir9.c(aVar7, 1.0f), 0.0f, 8.0f, 0.0f, f6, 5), 48.0f);
                        IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                        int i112 = IntercomTheme.$stable;
                        b72 b72Var5 = intercomTheme15.getShapes(bj4VarO, i112).b;
                        ko7 ko7Var5 = zy0.a;
                        bj4 bj4Var10 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD5, false, b72Var5, zy0.f(0L, gh5.a(intercomTheme15, bj4VarO, i112), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var10, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var10;
                        b47.b(bj4VarO, ir9.d(aVar7, f6));
                        bj4VarO.U(true);
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: bb2
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var3 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK6 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK6);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                            int i113 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme16, bj4VarO, i113), gh5.a(intercomTheme16, bj4VarO, i113), intercomTheme16.getColors(bj4VarO, i113).m751getAction0d7_KjU(), intercomTheme16.getColors(bj4VarO, i113).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                            int i114 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme17, bj4VarO, i114), gh5.a(intercomTheme17, bj4VarO, i114), kk.a(intercomTheme17, bj4VarO, i114), gh5.a(intercomTheme17, bj4VarO, i114), new uh1(intercomTheme17.getColors(bj4VarO, i114).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors8 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors8, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var11, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var11;
                    }
                    float f7 = f;
                    ox6.a aVar8 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM6 = eo7.m(ir9.c(aVar8, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM6, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i115) {
                            oy8Var.getClass();
                            if ((i115 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar9 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar9, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
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
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                            int i116 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme18.getColors(jt1Var2, i116).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme18.getTypography(jt1Var2, i116).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar9, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar9, 16.0f), intercomTheme18.getColors(jt1Var2, i116).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD6 = ir9.d(eo7.m(ir9.c(aVar8, 1.0f), 0.0f, 8.0f, 0.0f, f7, 5), 48.0f);
                    IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                    int i115 = IntercomTheme.$stable;
                    b72 b72Var6 = intercomTheme18.getShapes(bj4VarO, i115).b;
                    ko7 ko7Var6 = zy0.a;
                    bj4 bj4Var12 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD6, false, b72Var6, zy0.f(0L, gh5.a(intercomTheme18, bj4VarO, i115), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var12, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var12;
                    b47.b(bj4VarO, ir9.d(aVar8, f7));
                    bj4VarO.U(true);
                } else {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK7 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK7);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                            int i116 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme19, bj4VarO, i116), gh5.a(intercomTheme19, bj4VarO, i116), intercomTheme19.getColors(bj4VarO, i116).m751getAction0d7_KjU(), intercomTheme19.getColors(bj4VarO, i116).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                            int i117 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme110, bj4VarO, i117), gh5.a(intercomTheme110, bj4VarO, i117), kk.a(intercomTheme110, bj4VarO, i117), gh5.a(intercomTheme110, bj4VarO, i117), new uh1(intercomTheme110.getColors(bj4VarO, i117).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors9 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var13 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors9, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var13, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var13;
                    }
                    float f8 = f;
                    ox6.a aVar9 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM7 = eo7.m(ir9.c(aVar9, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM7, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i118) {
                            oy8Var.getClass();
                            if ((i118 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar10 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar10, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
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
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                            int i119 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme111.getColors(jt1Var2, i119).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme111.getTypography(jt1Var2, i119).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar10, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar10, 16.0f), intercomTheme111.getColors(jt1Var2, i119).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD7 = ir9.d(eo7.m(ir9.c(aVar9, 1.0f), 0.0f, 8.0f, 0.0f, f8, 5), 48.0f);
                    IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                    int i118 = IntercomTheme.$stable;
                    b72 b72Var7 = intercomTheme111.getShapes(bj4VarO, i118).b;
                    ko7 ko7Var7 = zy0.a;
                    bj4 bj4Var14 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD7, false, b72Var7, zy0.f(0L, gh5.a(intercomTheme111, bj4VarO, i118), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var14, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var14;
                    b47.b(bj4VarO, ir9.d(aVar9, f8));
                    bj4VarO.U(true);
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: bb2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.j(oh4Var)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        oh4Var3 = oh4Var2;
                        if (bj4VarO.j(oh4Var3)) {
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                        i3 |= i6;
                    }
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK8 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK8);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                                int i119 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme112, bj4VarO, i119), gh5.a(intercomTheme112, bj4VarO, i119), intercomTheme112.getColors(bj4VarO, i119).m751getAction0d7_KjU(), intercomTheme112.getColors(bj4VarO, i119).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                                int i1110 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme113, bj4VarO, i1110), gh5.a(intercomTheme113, bj4VarO, i1110), kk.a(intercomTheme113, bj4VarO, i1110), gh5.a(intercomTheme113, bj4VarO, i1110), new uh1(intercomTheme113.getColors(bj4VarO, i1110).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors10 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var15 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors10, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var15, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var15;
                        }
                        float f9 = f;
                        ox6.a aVar10 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM8 = eo7.m(ir9.c(aVar10, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM8, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111) {
                                oy8Var.getClass();
                                if ((i1111 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar11 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar11, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
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
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                                int i1112 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme114.getColors(jt1Var2, i1112).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme114.getTypography(jt1Var2, i1112).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar11, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar11, 16.0f), intercomTheme114.getColors(jt1Var2, i1112).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD8 = ir9.d(eo7.m(ir9.c(aVar10, 1.0f), 0.0f, 8.0f, 0.0f, f9, 5), 48.0f);
                        IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                        int i1111 = IntercomTheme.$stable;
                        b72 b72Var8 = intercomTheme114.getShapes(bj4VarO, i1111).b;
                        ko7 ko7Var8 = zy0.a;
                        bj4 bj4Var16 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD8, false, b72Var8, zy0.f(0L, gh5.a(intercomTheme114, bj4VarO, i1111), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var16, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var16;
                        b47.b(bj4VarO, ir9.d(aVar10, f9));
                        bj4VarO.U(true);
                    } else {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK9 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK9);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                                int i1112 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme115, bj4VarO, i1112), gh5.a(intercomTheme115, bj4VarO, i1112), intercomTheme115.getColors(bj4VarO, i1112).m751getAction0d7_KjU(), intercomTheme115.getColors(bj4VarO, i1112).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                                int i1113 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme116, bj4VarO, i1113), gh5.a(intercomTheme116, bj4VarO, i1113), kk.a(intercomTheme116, bj4VarO, i1113), gh5.a(intercomTheme116, bj4VarO, i1113), new uh1(intercomTheme116.getColors(bj4VarO, i1113).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors11 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var17 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors11, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var17, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var17;
                        }
                        float f10 = f;
                        ox6.a aVar11 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM9 = eo7.m(ir9.c(aVar11, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM9, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1114) {
                                oy8Var.getClass();
                                if ((i1114 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar12 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar12, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
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
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                                int i1115 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme117.getColors(jt1Var2, i1115).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme117.getTypography(jt1Var2, i1115).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar12, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar12, 16.0f), intercomTheme117.getColors(jt1Var2, i1115).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD9 = ir9.d(eo7.m(ir9.c(aVar11, 1.0f), 0.0f, 8.0f, 0.0f, f10, 5), 48.0f);
                        IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                        int i1114 = IntercomTheme.$stable;
                        b72 b72Var9 = intercomTheme117.getShapes(bj4VarO, i1114).b;
                        ko7 ko7Var9 = zy0.a;
                        bj4 bj4Var18 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD9, false, b72Var9, zy0.f(0L, gh5.a(intercomTheme117, bj4VarO, i1114), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var18, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var18;
                        b47.b(bj4VarO, ir9.d(aVar11, f10));
                        bj4VarO.U(true);
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: bb2
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var3 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK10 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK10);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                            int i1115 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme118, bj4VarO, i1115), gh5.a(intercomTheme118, bj4VarO, i1115), intercomTheme118.getColors(bj4VarO, i1115).m751getAction0d7_KjU(), intercomTheme118.getColors(bj4VarO, i1115).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                            int i1116 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme119, bj4VarO, i1116), gh5.a(intercomTheme119, bj4VarO, i1116), kk.a(intercomTheme119, bj4VarO, i1116), gh5.a(intercomTheme119, bj4VarO, i1116), new uh1(intercomTheme119.getColors(bj4VarO, i1116).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors12 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var19 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors12, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var19, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var19;
                    }
                    float f11 = f;
                    ox6.a aVar12 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM10 = eo7.m(ir9.c(aVar12, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM10, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1117) {
                            oy8Var.getClass();
                            if ((i1117 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar13 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar13, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
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
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
                            int i1118 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme1110.getColors(jt1Var2, i1118).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1110.getTypography(jt1Var2, i1118).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar13, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar13, 16.0f), intercomTheme1110.getColors(jt1Var2, i1118).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD10 = ir9.d(eo7.m(ir9.c(aVar12, 1.0f), 0.0f, 8.0f, 0.0f, f11, 5), 48.0f);
                    IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
                    int i1117 = IntercomTheme.$stable;
                    b72 b72Var10 = intercomTheme1110.getShapes(bj4VarO, i1117).b;
                    ko7 ko7Var10 = zy0.a;
                    bj4 bj4Var110 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD10, false, b72Var10, zy0.f(0L, gh5.a(intercomTheme1110, bj4VarO, i1117), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var110, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var110;
                    b47.b(bj4VarO, ir9.d(aVar12, f11));
                    bj4VarO.U(true);
                } else {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK11 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK11);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme1111 = IntercomTheme.INSTANCE;
                            int i1118 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111, bj4VarO, i1118), gh5.a(intercomTheme1111, bj4VarO, i1118), intercomTheme1111.getColors(bj4VarO, i1118).m751getAction0d7_KjU(), intercomTheme1111.getColors(bj4VarO, i1118).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme1112 = IntercomTheme.INSTANCE;
                            int i1119 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1112, bj4VarO, i1119), gh5.a(intercomTheme1112, bj4VarO, i1119), kk.a(intercomTheme1112, bj4VarO, i1119), gh5.a(intercomTheme1112, bj4VarO, i1119), new uh1(intercomTheme1112.getColors(bj4VarO, i1119).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors13 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var111 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors13, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var111, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var111;
                    }
                    float f12 = f;
                    ox6.a aVar13 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM11 = eo7.m(ir9.c(aVar13, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM11, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11110) {
                            oy8Var.getClass();
                            if ((i11110 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar14 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar14, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
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
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme1113 = IntercomTheme.INSTANCE;
                            int i11111 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme1113.getColors(jt1Var2, i11111).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1113.getTypography(jt1Var2, i11111).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar14, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar14, 16.0f), intercomTheme1113.getColors(jt1Var2, i11111).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD11 = ir9.d(eo7.m(ir9.c(aVar13, 1.0f), 0.0f, 8.0f, 0.0f, f12, 5), 48.0f);
                    IntercomTheme intercomTheme1113 = IntercomTheme.INSTANCE;
                    int i11110 = IntercomTheme.$stable;
                    b72 b72Var11 = intercomTheme1113.getShapes(bj4VarO, i11110).b;
                    ko7 ko7Var11 = zy0.a;
                    bj4 bj4Var112 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD11, false, b72Var11, zy0.f(0L, gh5.a(intercomTheme1113, bj4VarO, i11110), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var112, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var112;
                    b47.b(bj4VarO, ir9.d(aVar13, f12));
                    bj4VarO.U(true);
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: bb2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    oh4Var3 = oh4Var2;
                    if (bj4VarO.j(oh4Var3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK12 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK12);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme1114 = IntercomTheme.INSTANCE;
                            int i11111 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1114, bj4VarO, i11111), gh5.a(intercomTheme1114, bj4VarO, i11111), intercomTheme1114.getColors(bj4VarO, i11111).m751getAction0d7_KjU(), intercomTheme1114.getColors(bj4VarO, i11111).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme1115 = IntercomTheme.INSTANCE;
                            int i11112 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1115, bj4VarO, i11112), gh5.a(intercomTheme1115, bj4VarO, i11112), kk.a(intercomTheme1115, bj4VarO, i11112), gh5.a(intercomTheme1115, bj4VarO, i11112), new uh1(intercomTheme1115.getColors(bj4VarO, i11112).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors14 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var113 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors14, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var113, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var113;
                    }
                    float f13 = f;
                    ox6.a aVar14 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM12 = eo7.m(ir9.c(aVar14, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM12, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11113) {
                            oy8Var.getClass();
                            if ((i11113 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar15 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar15, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
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
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme1116 = IntercomTheme.INSTANCE;
                            int i11114 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme1116.getColors(jt1Var2, i11114).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1116.getTypography(jt1Var2, i11114).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar15, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar15, 16.0f), intercomTheme1116.getColors(jt1Var2, i11114).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD12 = ir9.d(eo7.m(ir9.c(aVar14, 1.0f), 0.0f, 8.0f, 0.0f, f13, 5), 48.0f);
                    IntercomTheme intercomTheme1116 = IntercomTheme.INSTANCE;
                    int i11113 = IntercomTheme.$stable;
                    b72 b72Var12 = intercomTheme1116.getShapes(bj4VarO, i11113).b;
                    ko7 ko7Var12 = zy0.a;
                    bj4 bj4Var114 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD12, false, b72Var12, zy0.f(0L, gh5.a(intercomTheme1116, bj4VarO, i11113), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var114, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var114;
                    b47.b(bj4VarO, ir9.d(aVar14, f13));
                    bj4VarO.U(true);
                } else {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK13 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK13);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme1117 = IntercomTheme.INSTANCE;
                            int i11114 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1117, bj4VarO, i11114), gh5.a(intercomTheme1117, bj4VarO, i11114), intercomTheme1117.getColors(bj4VarO, i11114).m751getAction0d7_KjU(), intercomTheme1117.getColors(bj4VarO, i11114).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme1118 = IntercomTheme.INSTANCE;
                            int i11115 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1118, bj4VarO, i11115), gh5.a(intercomTheme1118, bj4VarO, i11115), kk.a(intercomTheme1118, bj4VarO, i11115), gh5.a(intercomTheme1118, bj4VarO, i11115), new uh1(intercomTheme1118.getColors(bj4VarO, i11115).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors15 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var115 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors15, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var115, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var115;
                    }
                    float f14 = f;
                    ox6.a aVar15 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM13 = eo7.m(ir9.c(aVar15, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM13, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11116) {
                            oy8Var.getClass();
                            if ((i11116 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar16 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar16, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
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
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme1119 = IntercomTheme.INSTANCE;
                            int i11117 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme1119.getColors(jt1Var2, i11117).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1119.getTypography(jt1Var2, i11117).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar16, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar16, 16.0f), intercomTheme1119.getColors(jt1Var2, i11117).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD13 = ir9.d(eo7.m(ir9.c(aVar15, 1.0f), 0.0f, 8.0f, 0.0f, f14, 5), 48.0f);
                    IntercomTheme intercomTheme1119 = IntercomTheme.INSTANCE;
                    int i11116 = IntercomTheme.$stable;
                    b72 b72Var13 = intercomTheme1119.getShapes(bj4VarO, i11116).b;
                    ko7 ko7Var13 = zy0.a;
                    bj4 bj4Var116 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD13, false, b72Var13, zy0.f(0L, gh5.a(intercomTheme1119, bj4VarO, i11116), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var116, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var116;
                    b47.b(bj4VarO, ir9.d(aVar15, f14));
                    bj4VarO.U(true);
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: bb2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var3 = oh4Var2;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK14 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK14);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme11110 = IntercomTheme.INSTANCE;
                        int i11117 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11110, bj4VarO, i11117), gh5.a(intercomTheme11110, bj4VarO, i11117), intercomTheme11110.getColors(bj4VarO, i11117).m751getAction0d7_KjU(), intercomTheme11110.getColors(bj4VarO, i11117).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme11111 = IntercomTheme.INSTANCE;
                        int i11118 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111, bj4VarO, i11118), gh5.a(intercomTheme11111, bj4VarO, i11118), kk.a(intercomTheme11111, bj4VarO, i11118), gh5.a(intercomTheme11111, bj4VarO, i11118), new uh1(intercomTheme11111.getColors(bj4VarO, i11118).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors16 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var117 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors16, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var117, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var117;
                }
                float f15 = f;
                ox6.a aVar16 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM14 = eo7.m(ir9.c(aVar16, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM14, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11119) {
                        oy8Var.getClass();
                        if ((i11119 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar17 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar17, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
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
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme11112 = IntercomTheme.INSTANCE;
                        int i111110 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme11112.getColors(jt1Var2, i111110).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme11112.getTypography(jt1Var2, i111110).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar17, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar17, 16.0f), intercomTheme11112.getColors(jt1Var2, i111110).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD14 = ir9.d(eo7.m(ir9.c(aVar16, 1.0f), 0.0f, 8.0f, 0.0f, f15, 5), 48.0f);
                IntercomTheme intercomTheme11112 = IntercomTheme.INSTANCE;
                int i11119 = IntercomTheme.$stable;
                b72 b72Var14 = intercomTheme11112.getShapes(bj4VarO, i11119).b;
                ko7 ko7Var14 = zy0.a;
                bj4 bj4Var118 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD14, false, b72Var14, zy0.f(0L, gh5.a(intercomTheme11112, bj4VarO, i11119), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var118, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var118;
                b47.b(bj4VarO, ir9.d(aVar16, f15));
                bj4VarO.U(true);
            } else {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK15 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK15);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme11113 = IntercomTheme.INSTANCE;
                        int i111110 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11113, bj4VarO, i111110), gh5.a(intercomTheme11113, bj4VarO, i111110), intercomTheme11113.getColors(bj4VarO, i111110).m751getAction0d7_KjU(), intercomTheme11113.getColors(bj4VarO, i111110).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme11114 = IntercomTheme.INSTANCE;
                        int i111111 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11114, bj4VarO, i111111), gh5.a(intercomTheme11114, bj4VarO, i111111), kk.a(intercomTheme11114, bj4VarO, i111111), gh5.a(intercomTheme11114, bj4VarO, i111111), new uh1(intercomTheme11114.getColors(bj4VarO, i111111).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors17 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var119 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors17, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var119, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var119;
                }
                float f16 = f;
                ox6.a aVar17 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM15 = eo7.m(ir9.c(aVar17, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM15, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i111112) {
                        oy8Var.getClass();
                        if ((i111112 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar18 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar18, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
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
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme11115 = IntercomTheme.INSTANCE;
                        int i111113 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme11115.getColors(jt1Var2, i111113).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme11115.getTypography(jt1Var2, i111113).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar18, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar18, 16.0f), intercomTheme11115.getColors(jt1Var2, i111113).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD15 = ir9.d(eo7.m(ir9.c(aVar17, 1.0f), 0.0f, 8.0f, 0.0f, f16, 5), 48.0f);
                IntercomTheme intercomTheme11115 = IntercomTheme.INSTANCE;
                int i111112 = IntercomTheme.$stable;
                b72 b72Var15 = intercomTheme11115.getShapes(bj4VarO, i111112).b;
                ko7 ko7Var15 = zy0.a;
                bj4 bj4Var1110 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD15, false, b72Var15, zy0.f(0L, gh5.a(intercomTheme11115, bj4VarO, i111112), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var1110, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var1110;
                b47.b(bj4VarO, ir9.d(aVar17, f16));
                bj4VarO.U(true);
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: bb2
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        mh4Var3 = mh4Var;
        if ((i2 & 8) != 0) {
            if ((i & 3072) == 0) {
                if (bj4VarO.j(mh4Var2)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.j(oh4Var)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        oh4Var3 = oh4Var2;
                        if (bj4VarO.j(oh4Var3)) {
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                        i3 |= i6;
                    }
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK16 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK16);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme11116 = IntercomTheme.INSTANCE;
                                int i111113 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11116, bj4VarO, i111113), gh5.a(intercomTheme11116, bj4VarO, i111113), intercomTheme11116.getColors(bj4VarO, i111113).m751getAction0d7_KjU(), intercomTheme11116.getColors(bj4VarO, i111113).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme11117 = IntercomTheme.INSTANCE;
                                int i111114 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11117, bj4VarO, i111114), gh5.a(intercomTheme11117, bj4VarO, i111114), kk.a(intercomTheme11117, bj4VarO, i111114), gh5.a(intercomTheme11117, bj4VarO, i111114), new uh1(intercomTheme11117.getColors(bj4VarO, i111114).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors18 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var1111 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors18, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var1111, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var1111;
                        }
                        float f17 = f;
                        ox6.a aVar18 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM16 = eo7.m(ir9.c(aVar18, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM16, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i111115) {
                                oy8Var.getClass();
                                if ((i111115 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar19 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar19, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar19);
                                bt1.c.getClass();
                                qr5.a aVar110 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar110);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme11118 = IntercomTheme.INSTANCE;
                                int i111116 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme11118.getColors(jt1Var2, i111116).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme11118.getTypography(jt1Var2, i111116).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar19, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar19, 16.0f), intercomTheme11118.getColors(jt1Var2, i111116).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD16 = ir9.d(eo7.m(ir9.c(aVar18, 1.0f), 0.0f, 8.0f, 0.0f, f17, 5), 48.0f);
                        IntercomTheme intercomTheme11118 = IntercomTheme.INSTANCE;
                        int i111115 = IntercomTheme.$stable;
                        b72 b72Var16 = intercomTheme11118.getShapes(bj4VarO, i111115).b;
                        ko7 ko7Var16 = zy0.a;
                        bj4 bj4Var1112 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD16, false, b72Var16, zy0.f(0L, gh5.a(intercomTheme11118, bj4VarO, i111115), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var1112, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var1112;
                        b47.b(bj4VarO, ir9.d(aVar18, f17));
                        bj4VarO.U(true);
                    } else {
                        aVar = ox6.a.t;
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        f = 16.0f;
                        ox6 ox6VarK17 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarK17);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.K(-210345289);
                        while (r0.hasNext()) {
                            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                                bj4VarO.K(-267720558);
                                IntercomTheme intercomTheme11119 = IntercomTheme.INSTANCE;
                                int i111116 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11119, bj4VarO, i111116), gh5.a(intercomTheme11119, bj4VarO, i111116), intercomTheme11119.getColors(bj4VarO, i111116).m751getAction0d7_KjU(), intercomTheme11119.getColors(bj4VarO, i111116).m769getOnAction0d7_KjU(), null, 16, null);
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(-267315078);
                                IntercomTheme intercomTheme111110 = IntercomTheme.INSTANCE;
                                int i111117 = IntercomTheme.$stable;
                                surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111110, bj4VarO, i111117), gh5.a(intercomTheme111110, bj4VarO, i111117), kk.a(intercomTheme111110, bj4VarO, i111117), gh5.a(intercomTheme111110, bj4VarO, i111117), new uh1(intercomTheme111110.getColors(bj4VarO, i111117).m751getAction0d7_KjU()), null);
                                bj4VarO.U(false);
                            }
                            SurveyUiColors surveyUiColors19 = surveyUiColors2;
                            bj4VarO.K(-978435731);
                            zJ = bj4VarO.j(questionState);
                            objF = bj4VarO.f();
                            if (zJ) {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            } else {
                                objF = new an0(1, questionState);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var1113 = bj4VarO;
                            QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors19, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var1113, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                            oh4Var3 = oh4Var2;
                            aVar = aVar;
                            f = f;
                            bj4VarO = bj4Var1113;
                        }
                        float f18 = f;
                        ox6.a aVar19 = aVar;
                        bj4VarO.U(false);
                        b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                        ox6 ox6VarM17 = eo7.m(ir9.c(aVar19, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                        if (content.getEnableCta()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM17, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i111118) {
                                oy8Var.getClass();
                                if ((i111118 & 17) == 16 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                                ox6.a aVar110 = ox6.a.t;
                                if (showCreatingTicketProgress) {
                                    jt1Var2.K(-265542591);
                                    ae8.a(ir9.j(aVar110, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(-265351104);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                                int iHashCode2 = Long.hashCode(jt1Var2.v());
                                kw7 kw7VarY = jt1Var2.y();
                                ox6 ox6VarC2 = it1.c(jt1Var2, aVar110);
                                bt1.c.getClass();
                                qr5.a aVar111 = bt1.a.b;
                                if (jt1Var2.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var2.q();
                                if (jt1Var2.l()) {
                                    jt1Var2.k(aVar111);
                                } else {
                                    jt1Var2.z();
                                }
                                rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                                rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                                rd7.c(jt1Var2, bt1.a.h);
                                rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                                String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                                IntercomTheme intercomTheme111111 = IntercomTheme.INSTANCE;
                                int i111119 = IntercomTheme.$stable;
                                mia.b(strF, null, intercomTheme111111.getColors(jt1Var2, i111119).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme111111.getTypography(jt1Var2, i111119).getType04(), jt1Var2, 0, 0, 131066);
                                b47.b(jt1Var2, ir9.n(aVar110, 6.0f));
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar110, 16.0f), intercomTheme111111.getColors(jt1Var2, i111119).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                                jt1Var2.I();
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                        ox6 ox6VarD17 = ir9.d(eo7.m(ir9.c(aVar19, 1.0f), 0.0f, 8.0f, 0.0f, f18, 5), 48.0f);
                        IntercomTheme intercomTheme111111 = IntercomTheme.INSTANCE;
                        int i111118 = IntercomTheme.$stable;
                        b72 b72Var17 = intercomTheme111111.getShapes(bj4VarO, i111118).b;
                        ko7 ko7Var17 = zy0.a;
                        bj4 bj4Var1114 = bj4VarO;
                        jz0.c(mh4Var2, ox6VarD17, false, b72Var17, zy0.f(0L, gh5.a(intercomTheme111111, bj4VarO, i111118), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var1114, ((i3 >> 9) & 14) | 805306416, 484);
                        bj4VarO = bj4Var1114;
                        b47.b(bj4VarO, ir9.d(aVar19, f18));
                        bj4VarO.U(true);
                    }
                    ox6Var3 = ox6Var2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: bb2
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                oh4Var3 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK18 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK18);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme111112 = IntercomTheme.INSTANCE;
                            int i111119 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111112, bj4VarO, i111119), gh5.a(intercomTheme111112, bj4VarO, i111119), intercomTheme111112.getColors(bj4VarO, i111119).m751getAction0d7_KjU(), intercomTheme111112.getColors(bj4VarO, i111119).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme111113 = IntercomTheme.INSTANCE;
                            int i1111110 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111113, bj4VarO, i1111110), gh5.a(intercomTheme111113, bj4VarO, i1111110), kk.a(intercomTheme111113, bj4VarO, i1111110), gh5.a(intercomTheme111113, bj4VarO, i1111110), new uh1(intercomTheme111113.getColors(bj4VarO, i1111110).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors110 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var1115 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors110, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var1115, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var1115;
                    }
                    float f19 = f;
                    ox6.a aVar110 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM18 = eo7.m(ir9.c(aVar110, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM18, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111111) {
                            oy8Var.getClass();
                            if ((i1111111 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar111 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar111, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar111);
                            bt1.c.getClass();
                            qr5.a aVar112 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar112);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme111114 = IntercomTheme.INSTANCE;
                            int i1111112 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme111114.getColors(jt1Var2, i1111112).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme111114.getTypography(jt1Var2, i1111112).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar111, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar111, 16.0f), intercomTheme111114.getColors(jt1Var2, i1111112).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD18 = ir9.d(eo7.m(ir9.c(aVar110, 1.0f), 0.0f, 8.0f, 0.0f, f19, 5), 48.0f);
                    IntercomTheme intercomTheme111114 = IntercomTheme.INSTANCE;
                    int i1111111 = IntercomTheme.$stable;
                    b72 b72Var18 = intercomTheme111114.getShapes(bj4VarO, i1111111).b;
                    ko7 ko7Var18 = zy0.a;
                    bj4 bj4Var1116 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD18, false, b72Var18, zy0.f(0L, gh5.a(intercomTheme111114, bj4VarO, i1111111), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var1116, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var1116;
                    b47.b(bj4VarO, ir9.d(aVar110, f19));
                    bj4VarO.U(true);
                } else {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK19 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK19);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme111115 = IntercomTheme.INSTANCE;
                            int i1111112 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111115, bj4VarO, i1111112), gh5.a(intercomTheme111115, bj4VarO, i1111112), intercomTheme111115.getColors(bj4VarO, i1111112).m751getAction0d7_KjU(), intercomTheme111115.getColors(bj4VarO, i1111112).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme111116 = IntercomTheme.INSTANCE;
                            int i1111113 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111116, bj4VarO, i1111113), gh5.a(intercomTheme111116, bj4VarO, i1111113), kk.a(intercomTheme111116, bj4VarO, i1111113), gh5.a(intercomTheme111116, bj4VarO, i1111113), new uh1(intercomTheme111116.getColors(bj4VarO, i1111113).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors111 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var1117 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors111, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var1117, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var1117;
                    }
                    float f110 = f;
                    ox6.a aVar111 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM19 = eo7.m(ir9.c(aVar111, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM19, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111114) {
                            oy8Var.getClass();
                            if ((i1111114 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar112 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar112, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar112);
                            bt1.c.getClass();
                            qr5.a aVar113 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar113);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme111117 = IntercomTheme.INSTANCE;
                            int i1111115 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme111117.getColors(jt1Var2, i1111115).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme111117.getTypography(jt1Var2, i1111115).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar112, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar112, 16.0f), intercomTheme111117.getColors(jt1Var2, i1111115).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD19 = ir9.d(eo7.m(ir9.c(aVar111, 1.0f), 0.0f, 8.0f, 0.0f, f110, 5), 48.0f);
                    IntercomTheme intercomTheme111117 = IntercomTheme.INSTANCE;
                    int i1111114 = IntercomTheme.$stable;
                    b72 b72Var19 = intercomTheme111117.getShapes(bj4VarO, i1111114).b;
                    ko7 ko7Var19 = zy0.a;
                    bj4 bj4Var1118 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD19, false, b72Var19, zy0.f(0L, gh5.a(intercomTheme111117, bj4VarO, i1111114), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var1118, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var1118;
                    b47.b(bj4VarO, ir9.d(aVar111, f110));
                    bj4VarO.U(true);
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: bb2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    oh4Var3 = oh4Var2;
                    if (bj4VarO.j(oh4Var3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK110 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK110);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme111118 = IntercomTheme.INSTANCE;
                            int i1111115 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111118, bj4VarO, i1111115), gh5.a(intercomTheme111118, bj4VarO, i1111115), intercomTheme111118.getColors(bj4VarO, i1111115).m751getAction0d7_KjU(), intercomTheme111118.getColors(bj4VarO, i1111115).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme111119 = IntercomTheme.INSTANCE;
                            int i1111116 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111119, bj4VarO, i1111116), gh5.a(intercomTheme111119, bj4VarO, i1111116), kk.a(intercomTheme111119, bj4VarO, i1111116), gh5.a(intercomTheme111119, bj4VarO, i1111116), new uh1(intercomTheme111119.getColors(bj4VarO, i1111116).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors112 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var1119 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors112, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var1119, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var1119;
                    }
                    float f111 = f;
                    ox6.a aVar112 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM110 = eo7.m(ir9.c(aVar112, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM110, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111117) {
                            oy8Var.getClass();
                            if ((i1111117 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar113 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar113, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar113);
                            bt1.c.getClass();
                            qr5.a aVar114 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar114);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme1111110 = IntercomTheme.INSTANCE;
                            int i1111118 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme1111110.getColors(jt1Var2, i1111118).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1111110.getTypography(jt1Var2, i1111118).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar113, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar113, 16.0f), intercomTheme1111110.getColors(jt1Var2, i1111118).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD110 = ir9.d(eo7.m(ir9.c(aVar112, 1.0f), 0.0f, 8.0f, 0.0f, f111, 5), 48.0f);
                    IntercomTheme intercomTheme1111110 = IntercomTheme.INSTANCE;
                    int i1111117 = IntercomTheme.$stable;
                    b72 b72Var110 = intercomTheme1111110.getShapes(bj4VarO, i1111117).b;
                    ko7 ko7Var110 = zy0.a;
                    bj4 bj4Var11110 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD110, false, b72Var110, zy0.f(0L, gh5.a(intercomTheme1111110, bj4VarO, i1111117), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var11110, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var11110;
                    b47.b(bj4VarO, ir9.d(aVar112, f111));
                    bj4VarO.U(true);
                } else {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK111 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK111);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme1111111 = IntercomTheme.INSTANCE;
                            int i1111118 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111111, bj4VarO, i1111118), gh5.a(intercomTheme1111111, bj4VarO, i1111118), intercomTheme1111111.getColors(bj4VarO, i1111118).m751getAction0d7_KjU(), intercomTheme1111111.getColors(bj4VarO, i1111118).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme1111112 = IntercomTheme.INSTANCE;
                            int i1111119 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111112, bj4VarO, i1111119), gh5.a(intercomTheme1111112, bj4VarO, i1111119), kk.a(intercomTheme1111112, bj4VarO, i1111119), gh5.a(intercomTheme1111112, bj4VarO, i1111119), new uh1(intercomTheme1111112.getColors(bj4VarO, i1111119).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors113 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11111 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors113, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var11111, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var11111;
                    }
                    float f112 = f;
                    ox6.a aVar113 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM111 = eo7.m(ir9.c(aVar113, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM111, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11111110) {
                            oy8Var.getClass();
                            if ((i11111110 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar114 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar114, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar114);
                            bt1.c.getClass();
                            qr5.a aVar115 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar115);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme1111113 = IntercomTheme.INSTANCE;
                            int i11111111 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme1111113.getColors(jt1Var2, i11111111).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1111113.getTypography(jt1Var2, i11111111).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar114, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar114, 16.0f), intercomTheme1111113.getColors(jt1Var2, i11111111).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD111 = ir9.d(eo7.m(ir9.c(aVar113, 1.0f), 0.0f, 8.0f, 0.0f, f112, 5), 48.0f);
                    IntercomTheme intercomTheme1111113 = IntercomTheme.INSTANCE;
                    int i11111110 = IntercomTheme.$stable;
                    b72 b72Var111 = intercomTheme1111113.getShapes(bj4VarO, i11111110).b;
                    ko7 ko7Var111 = zy0.a;
                    bj4 bj4Var11112 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD111, false, b72Var111, zy0.f(0L, gh5.a(intercomTheme1111113, bj4VarO, i11111110), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var11112, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var11112;
                    b47.b(bj4VarO, ir9.d(aVar113, f112));
                    bj4VarO.U(true);
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: bb2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var3 = oh4Var2;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK112 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK112);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme1111114 = IntercomTheme.INSTANCE;
                        int i11111111 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111114, bj4VarO, i11111111), gh5.a(intercomTheme1111114, bj4VarO, i11111111), intercomTheme1111114.getColors(bj4VarO, i11111111).m751getAction0d7_KjU(), intercomTheme1111114.getColors(bj4VarO, i11111111).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme1111115 = IntercomTheme.INSTANCE;
                        int i11111112 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111115, bj4VarO, i11111112), gh5.a(intercomTheme1111115, bj4VarO, i11111112), kk.a(intercomTheme1111115, bj4VarO, i11111112), gh5.a(intercomTheme1111115, bj4VarO, i11111112), new uh1(intercomTheme1111115.getColors(bj4VarO, i11111112).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors114 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var11113 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors114, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var11113, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var11113;
                }
                float f113 = f;
                ox6.a aVar114 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM112 = eo7.m(ir9.c(aVar114, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM112, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11111113) {
                        oy8Var.getClass();
                        if ((i11111113 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar115 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar115, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar115);
                        bt1.c.getClass();
                        qr5.a aVar116 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar116);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme1111116 = IntercomTheme.INSTANCE;
                        int i11111114 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme1111116.getColors(jt1Var2, i11111114).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1111116.getTypography(jt1Var2, i11111114).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar115, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar115, 16.0f), intercomTheme1111116.getColors(jt1Var2, i11111114).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD112 = ir9.d(eo7.m(ir9.c(aVar114, 1.0f), 0.0f, 8.0f, 0.0f, f113, 5), 48.0f);
                IntercomTheme intercomTheme1111116 = IntercomTheme.INSTANCE;
                int i11111113 = IntercomTheme.$stable;
                b72 b72Var112 = intercomTheme1111116.getShapes(bj4VarO, i11111113).b;
                ko7 ko7Var112 = zy0.a;
                bj4 bj4Var11114 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD112, false, b72Var112, zy0.f(0L, gh5.a(intercomTheme1111116, bj4VarO, i11111113), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var11114, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var11114;
                b47.b(bj4VarO, ir9.d(aVar114, f113));
                bj4VarO.U(true);
            } else {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK113 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK113);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme1111117 = IntercomTheme.INSTANCE;
                        int i11111114 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111117, bj4VarO, i11111114), gh5.a(intercomTheme1111117, bj4VarO, i11111114), intercomTheme1111117.getColors(bj4VarO, i11111114).m751getAction0d7_KjU(), intercomTheme1111117.getColors(bj4VarO, i11111114).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme1111118 = IntercomTheme.INSTANCE;
                        int i11111115 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111118, bj4VarO, i11111115), gh5.a(intercomTheme1111118, bj4VarO, i11111115), kk.a(intercomTheme1111118, bj4VarO, i11111115), gh5.a(intercomTheme1111118, bj4VarO, i11111115), new uh1(intercomTheme1111118.getColors(bj4VarO, i11111115).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors115 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var11115 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors115, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var11115, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var11115;
                }
                float f114 = f;
                ox6.a aVar115 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM113 = eo7.m(ir9.c(aVar115, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM113, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11111116) {
                        oy8Var.getClass();
                        if ((i11111116 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar116 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar116, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar116);
                        bt1.c.getClass();
                        qr5.a aVar117 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar117);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme1111119 = IntercomTheme.INSTANCE;
                        int i11111117 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme1111119.getColors(jt1Var2, i11111117).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1111119.getTypography(jt1Var2, i11111117).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar116, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar116, 16.0f), intercomTheme1111119.getColors(jt1Var2, i11111117).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD113 = ir9.d(eo7.m(ir9.c(aVar115, 1.0f), 0.0f, 8.0f, 0.0f, f114, 5), 48.0f);
                IntercomTheme intercomTheme1111119 = IntercomTheme.INSTANCE;
                int i11111116 = IntercomTheme.$stable;
                b72 b72Var113 = intercomTheme1111119.getShapes(bj4VarO, i11111116).b;
                ko7 ko7Var113 = zy0.a;
                bj4 bj4Var11116 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD113, false, b72Var113, zy0.f(0L, gh5.a(intercomTheme1111119, bj4VarO, i11111116), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var11116, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var11116;
                b47.b(bj4VarO, ir9.d(aVar115, f114));
                bj4VarO.U(true);
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: bb2
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        if ((i2 & 16) != 0) {
            if ((i & 24576) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    oh4Var3 = oh4Var2;
                    if (bj4VarO.j(oh4Var3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK114 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK114);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme11111110 = IntercomTheme.INSTANCE;
                            int i11111117 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111110, bj4VarO, i11111117), gh5.a(intercomTheme11111110, bj4VarO, i11111117), intercomTheme11111110.getColors(bj4VarO, i11111117).m751getAction0d7_KjU(), intercomTheme11111110.getColors(bj4VarO, i11111117).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme11111111 = IntercomTheme.INSTANCE;
                            int i11111118 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111111, bj4VarO, i11111118), gh5.a(intercomTheme11111111, bj4VarO, i11111118), kk.a(intercomTheme11111111, bj4VarO, i11111118), gh5.a(intercomTheme11111111, bj4VarO, i11111118), new uh1(intercomTheme11111111.getColors(bj4VarO, i11111118).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors116 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11117 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors116, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var11117, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var11117;
                    }
                    float f115 = f;
                    ox6.a aVar116 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM114 = eo7.m(ir9.c(aVar116, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM114, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11111119) {
                            oy8Var.getClass();
                            if ((i11111119 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar117 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar117, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar117);
                            bt1.c.getClass();
                            qr5.a aVar118 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar118);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme11111112 = IntercomTheme.INSTANCE;
                            int i111111110 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme11111112.getColors(jt1Var2, i111111110).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme11111112.getTypography(jt1Var2, i111111110).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar117, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar117, 16.0f), intercomTheme11111112.getColors(jt1Var2, i111111110).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD114 = ir9.d(eo7.m(ir9.c(aVar116, 1.0f), 0.0f, 8.0f, 0.0f, f115, 5), 48.0f);
                    IntercomTheme intercomTheme11111112 = IntercomTheme.INSTANCE;
                    int i11111119 = IntercomTheme.$stable;
                    b72 b72Var114 = intercomTheme11111112.getShapes(bj4VarO, i11111119).b;
                    ko7 ko7Var114 = zy0.a;
                    bj4 bj4Var11118 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD114, false, b72Var114, zy0.f(0L, gh5.a(intercomTheme11111112, bj4VarO, i11111119), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var11118, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var11118;
                    b47.b(bj4VarO, ir9.d(aVar116, f115));
                    bj4VarO.U(true);
                } else {
                    aVar = ox6.a.t;
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    f = 16.0f;
                    ox6 ox6VarK115 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK115);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.K(-210345289);
                    while (r0.hasNext()) {
                        if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                            bj4VarO.K(-267720558);
                            IntercomTheme intercomTheme11111113 = IntercomTheme.INSTANCE;
                            int i111111110 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111113, bj4VarO, i111111110), gh5.a(intercomTheme11111113, bj4VarO, i111111110), intercomTheme11111113.getColors(bj4VarO, i111111110).m751getAction0d7_KjU(), intercomTheme11111113.getColors(bj4VarO, i111111110).m769getOnAction0d7_KjU(), null, 16, null);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-267315078);
                            IntercomTheme intercomTheme11111114 = IntercomTheme.INSTANCE;
                            int i111111111 = IntercomTheme.$stable;
                            surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111114, bj4VarO, i111111111), gh5.a(intercomTheme11111114, bj4VarO, i111111111), kk.a(intercomTheme11111114, bj4VarO, i111111111), gh5.a(intercomTheme11111114, bj4VarO, i111111111), new uh1(intercomTheme11111114.getColors(bj4VarO, i111111111).m751getAction0d7_KjU()), null);
                            bj4VarO.U(false);
                        }
                        SurveyUiColors surveyUiColors117 = surveyUiColors2;
                        bj4VarO.K(-978435731);
                        zJ = bj4VarO.j(questionState);
                        objF = bj4VarO.f();
                        if (zJ) {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        } else {
                            objF = new an0(1, questionState);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11119 = bj4VarO;
                        QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors117, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var11119, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                        oh4Var3 = oh4Var2;
                        aVar = aVar;
                        f = f;
                        bj4VarO = bj4Var11119;
                    }
                    float f116 = f;
                    ox6.a aVar117 = aVar;
                    bj4VarO.U(false);
                    b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                    ox6 ox6VarM115 = eo7.m(ir9.c(aVar117, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    if (content.getEnableCta()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM115, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i111111112) {
                            oy8Var.getClass();
                            if ((i111111112 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                            ox6.a aVar118 = ox6.a.t;
                            if (showCreatingTicketProgress) {
                                jt1Var2.K(-265542591);
                                ae8.a(ir9.j(aVar118, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-265351104);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode2 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC2 = it1.c(jt1Var2, aVar118);
                            bt1.c.getClass();
                            qr5.a aVar119 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar119);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                            String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                            IntercomTheme intercomTheme11111115 = IntercomTheme.INSTANCE;
                            int i111111113 = IntercomTheme.$stable;
                            mia.b(strF, null, intercomTheme11111115.getColors(jt1Var2, i111111113).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme11111115.getTypography(jt1Var2, i111111113).getType04(), jt1Var2, 0, 0, 131066);
                            b47.b(jt1Var2, ir9.n(aVar118, 6.0f));
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar118, 16.0f), intercomTheme11111115.getColors(jt1Var2, i111111113).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                            jt1Var2.I();
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                    ox6 ox6VarD115 = ir9.d(eo7.m(ir9.c(aVar117, 1.0f), 0.0f, 8.0f, 0.0f, f116, 5), 48.0f);
                    IntercomTheme intercomTheme11111115 = IntercomTheme.INSTANCE;
                    int i111111112 = IntercomTheme.$stable;
                    b72 b72Var115 = intercomTheme11111115.getShapes(bj4VarO, i111111112).b;
                    ko7 ko7Var115 = zy0.a;
                    bj4 bj4Var111110 = bj4VarO;
                    jz0.c(mh4Var2, ox6VarD115, false, b72Var115, zy0.f(0L, gh5.a(intercomTheme11111115, bj4VarO, i111111112), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var111110, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4Var111110;
                    b47.b(bj4VarO, ir9.d(aVar117, f116));
                    bj4VarO.U(true);
                }
                ox6Var3 = ox6Var2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: bb2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            oh4Var3 = oh4Var2;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK116 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK116);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme11111116 = IntercomTheme.INSTANCE;
                        int i111111113 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111116, bj4VarO, i111111113), gh5.a(intercomTheme11111116, bj4VarO, i111111113), intercomTheme11111116.getColors(bj4VarO, i111111113).m751getAction0d7_KjU(), intercomTheme11111116.getColors(bj4VarO, i111111113).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme11111117 = IntercomTheme.INSTANCE;
                        int i111111114 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111117, bj4VarO, i111111114), gh5.a(intercomTheme11111117, bj4VarO, i111111114), kk.a(intercomTheme11111117, bj4VarO, i111111114), gh5.a(intercomTheme11111117, bj4VarO, i111111114), new uh1(intercomTheme11111117.getColors(bj4VarO, i111111114).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors118 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var111111 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors118, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var111111, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var111111;
                }
                float f117 = f;
                ox6.a aVar118 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM116 = eo7.m(ir9.c(aVar118, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM116, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i111111115) {
                        oy8Var.getClass();
                        if ((i111111115 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar119 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar119, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar119);
                        bt1.c.getClass();
                        qr5.a aVar1110 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar1110);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme11111118 = IntercomTheme.INSTANCE;
                        int i111111116 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme11111118.getColors(jt1Var2, i111111116).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme11111118.getTypography(jt1Var2, i111111116).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar119, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar119, 16.0f), intercomTheme11111118.getColors(jt1Var2, i111111116).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD116 = ir9.d(eo7.m(ir9.c(aVar118, 1.0f), 0.0f, 8.0f, 0.0f, f117, 5), 48.0f);
                IntercomTheme intercomTheme11111118 = IntercomTheme.INSTANCE;
                int i111111115 = IntercomTheme.$stable;
                b72 b72Var116 = intercomTheme11111118.getShapes(bj4VarO, i111111115).b;
                ko7 ko7Var116 = zy0.a;
                bj4 bj4Var111112 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD116, false, b72Var116, zy0.f(0L, gh5.a(intercomTheme11111118, bj4VarO, i111111115), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var111112, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var111112;
                b47.b(bj4VarO, ir9.d(aVar118, f117));
                bj4VarO.U(true);
            } else {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK117 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK117);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme11111119 = IntercomTheme.INSTANCE;
                        int i111111116 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme11111119, bj4VarO, i111111116), gh5.a(intercomTheme11111119, bj4VarO, i111111116), intercomTheme11111119.getColors(bj4VarO, i111111116).m751getAction0d7_KjU(), intercomTheme11111119.getColors(bj4VarO, i111111116).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme111111110 = IntercomTheme.INSTANCE;
                        int i111111117 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111111110, bj4VarO, i111111117), gh5.a(intercomTheme111111110, bj4VarO, i111111117), kk.a(intercomTheme111111110, bj4VarO, i111111117), gh5.a(intercomTheme111111110, bj4VarO, i111111117), new uh1(intercomTheme111111110.getColors(bj4VarO, i111111117).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors119 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var111113 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors119, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var111113, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var111113;
                }
                float f118 = f;
                ox6.a aVar119 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM117 = eo7.m(ir9.c(aVar119, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM117, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i111111118) {
                        oy8Var.getClass();
                        if ((i111111118 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar1110 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar1110, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar1110);
                        bt1.c.getClass();
                        qr5.a aVar1111 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar1111);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme111111111 = IntercomTheme.INSTANCE;
                        int i111111119 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme111111111.getColors(jt1Var2, i111111119).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme111111111.getTypography(jt1Var2, i111111119).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar1110, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar1110, 16.0f), intercomTheme111111111.getColors(jt1Var2, i111111119).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD117 = ir9.d(eo7.m(ir9.c(aVar119, 1.0f), 0.0f, 8.0f, 0.0f, f118, 5), 48.0f);
                IntercomTheme intercomTheme111111111 = IntercomTheme.INSTANCE;
                int i111111118 = IntercomTheme.$stable;
                b72 b72Var117 = intercomTheme111111111.getShapes(bj4VarO, i111111118).b;
                ko7 ko7Var117 = zy0.a;
                bj4 bj4Var111114 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD117, false, b72Var117, zy0.f(0L, gh5.a(intercomTheme111111111, bj4VarO, i111111118), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var111114, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var111114;
                b47.b(bj4VarO, ir9.d(aVar119, f118));
                bj4VarO.U(true);
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: bb2
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        if ((i2 & 32) != 0) {
            if ((i & 196608) == 0) {
                oh4Var3 = oh4Var2;
                if (bj4VarO.j(oh4Var3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK118 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK118);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme111111112 = IntercomTheme.INSTANCE;
                        int i111111119 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111111112, bj4VarO, i111111119), gh5.a(intercomTheme111111112, bj4VarO, i111111119), intercomTheme111111112.getColors(bj4VarO, i111111119).m751getAction0d7_KjU(), intercomTheme111111112.getColors(bj4VarO, i111111119).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme111111113 = IntercomTheme.INSTANCE;
                        int i1111111110 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111111113, bj4VarO, i1111111110), gh5.a(intercomTheme111111113, bj4VarO, i1111111110), kk.a(intercomTheme111111113, bj4VarO, i1111111110), gh5.a(intercomTheme111111113, bj4VarO, i1111111110), new uh1(intercomTheme111111113.getColors(bj4VarO, i1111111110).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors1110 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var111115 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors1110, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var111115, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var111115;
                }
                float f119 = f;
                ox6.a aVar1110 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM118 = eo7.m(ir9.c(aVar1110, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM118, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111111111) {
                        oy8Var.getClass();
                        if ((i1111111111 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar1111 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar1111, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar1111);
                        bt1.c.getClass();
                        qr5.a aVar1112 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar1112);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme111111114 = IntercomTheme.INSTANCE;
                        int i1111111112 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme111111114.getColors(jt1Var2, i1111111112).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme111111114.getTypography(jt1Var2, i1111111112).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar1111, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar1111, 16.0f), intercomTheme111111114.getColors(jt1Var2, i1111111112).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD118 = ir9.d(eo7.m(ir9.c(aVar1110, 1.0f), 0.0f, 8.0f, 0.0f, f119, 5), 48.0f);
                IntercomTheme intercomTheme111111114 = IntercomTheme.INSTANCE;
                int i1111111111 = IntercomTheme.$stable;
                b72 b72Var118 = intercomTheme111111114.getShapes(bj4VarO, i1111111111).b;
                ko7 ko7Var118 = zy0.a;
                bj4 bj4Var111116 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD118, false, b72Var118, zy0.f(0L, gh5.a(intercomTheme111111114, bj4VarO, i1111111111), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var111116, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var111116;
                b47.b(bj4VarO, ir9.d(aVar1110, f119));
                bj4VarO.U(true);
            } else {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                f = 16.0f;
                ox6 ox6VarK119 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK119);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.K(-210345289);
                while (r0.hasNext()) {
                    if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                        bj4VarO.K(-267720558);
                        IntercomTheme intercomTheme111111115 = IntercomTheme.INSTANCE;
                        int i1111111112 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111111115, bj4VarO, i1111111112), gh5.a(intercomTheme111111115, bj4VarO, i1111111112), intercomTheme111111115.getColors(bj4VarO, i1111111112).m751getAction0d7_KjU(), intercomTheme111111115.getColors(bj4VarO, i1111111112).m769getOnAction0d7_KjU(), null, 16, null);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-267315078);
                        IntercomTheme intercomTheme111111116 = IntercomTheme.INSTANCE;
                        int i1111111113 = IntercomTheme.$stable;
                        surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111111116, bj4VarO, i1111111113), gh5.a(intercomTheme111111116, bj4VarO, i1111111113), kk.a(intercomTheme111111116, bj4VarO, i1111111113), gh5.a(intercomTheme111111116, bj4VarO, i1111111113), new uh1(intercomTheme111111116.getColors(bj4VarO, i1111111113).m751getAction0d7_KjU()), null);
                        bj4VarO.U(false);
                    }
                    SurveyUiColors surveyUiColors1111 = surveyUiColors2;
                    bj4VarO.K(-978435731);
                    zJ = bj4VarO.j(questionState);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    } else {
                        objF = new an0(1, questionState);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var111117 = bj4VarO;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors1111, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var111117, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                    oh4Var3 = oh4Var2;
                    aVar = aVar;
                    f = f;
                    bj4VarO = bj4Var111117;
                }
                float f1110 = f;
                ox6.a aVar1111 = aVar;
                bj4VarO.U(false);
                b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
                ox6 ox6VarM119 = eo7.m(ir9.c(aVar1111, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                if (content.getEnableCta()) {
                    z = false;
                } else {
                    z = false;
                }
                IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM119, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111111114) {
                        oy8Var.getClass();
                        if ((i1111111114 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                        ox6.a aVar1112 = ox6.a.t;
                        if (showCreatingTicketProgress) {
                            jt1Var2.K(-265542591);
                            ae8.a(ir9.j(aVar1112, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-265351104);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, aVar1112);
                        bt1.c.getClass();
                        qr5.a aVar1113 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar1113);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                        IntercomTheme intercomTheme111111117 = IntercomTheme.INSTANCE;
                        int i1111111115 = IntercomTheme.$stable;
                        mia.b(strF, null, intercomTheme111111117.getColors(jt1Var2, i1111111115).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme111111117.getTypography(jt1Var2, i1111111115).getType04(), jt1Var2, 0, 0, 131066);
                        b47.b(jt1Var2, ir9.n(aVar1112, 6.0f));
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar1112, 16.0f), intercomTheme111111117.getColors(jt1Var2, i1111111115).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                        jt1Var2.I();
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
                ox6 ox6VarD119 = ir9.d(eo7.m(ir9.c(aVar1111, 1.0f), 0.0f, 8.0f, 0.0f, f1110, 5), 48.0f);
                IntercomTheme intercomTheme111111117 = IntercomTheme.INSTANCE;
                int i1111111114 = IntercomTheme.$stable;
                b72 b72Var119 = intercomTheme111111117.getShapes(bj4VarO, i1111111114).b;
                ko7 ko7Var119 = zy0.a;
                bj4 bj4Var111118 = bj4VarO;
                jz0.c(mh4Var2, ox6VarD119, false, b72Var119, zy0.f(0L, gh5.a(intercomTheme111111117, bj4VarO, i1111111114), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var111118, ((i3 >> 9) & 14) | 805306416, 484);
                bj4VarO = bj4Var111118;
                b47.b(bj4VarO, ir9.d(aVar1111, f1110));
                bj4VarO.U(true);
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: bb2
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        oh4Var3 = oh4Var2;
        if ((74899 & i3) == 74898) {
            aVar = ox6.a.t;
            if (i7 != 0) {
                ox6Var2 = aVar;
            }
            f = 16.0f;
            ox6 ox6VarK1110 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK1110);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            bj4VarO.K(-210345289);
            while (r0.hasNext()) {
                if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                    bj4VarO.K(-267720558);
                    IntercomTheme intercomTheme111111118 = IntercomTheme.INSTANCE;
                    int i1111111115 = IntercomTheme.$stable;
                    surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111111118, bj4VarO, i1111111115), gh5.a(intercomTheme111111118, bj4VarO, i1111111115), intercomTheme111111118.getColors(bj4VarO, i1111111115).m751getAction0d7_KjU(), intercomTheme111111118.getColors(bj4VarO, i1111111115).m769getOnAction0d7_KjU(), null, 16, null);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-267315078);
                    IntercomTheme intercomTheme111111119 = IntercomTheme.INSTANCE;
                    int i1111111116 = IntercomTheme.$stable;
                    surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme111111119, bj4VarO, i1111111116), gh5.a(intercomTheme111111119, bj4VarO, i1111111116), kk.a(intercomTheme111111119, bj4VarO, i1111111116), gh5.a(intercomTheme111111119, bj4VarO, i1111111116), new uh1(intercomTheme111111119.getColors(bj4VarO, i1111111116).m751getAction0d7_KjU()), null);
                    bj4VarO.U(false);
                }
                SurveyUiColors surveyUiColors1112 = surveyUiColors2;
                bj4VarO.K(-978435731);
                zJ = bj4VarO.j(questionState);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new an0(1, questionState);
                    bj4VarO.C(objF);
                } else {
                    objF = new an0(1, questionState);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4 bj4Var111119 = bj4VarO;
                QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors1112, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var111119, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                oh4Var3 = oh4Var2;
                aVar = aVar;
                f = f;
                bj4VarO = bj4Var111119;
            }
            float f1111 = f;
            ox6.a aVar1112 = aVar;
            bj4VarO.U(false);
            b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
            ox6 ox6VarM1110 = eo7.m(ir9.c(aVar1112, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
            if (content.getEnableCta()) {
                z = false;
            } else {
                z = false;
            }
            IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM1110, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i1111111117) {
                    oy8Var.getClass();
                    if ((i1111111117 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                    ox6.a aVar1113 = ox6.a.t;
                    if (showCreatingTicketProgress) {
                        jt1Var2.K(-265542591);
                        ae8.a(ir9.j(aVar1113, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(-265351104);
                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar1113);
                    bt1.c.getClass();
                    qr5.a aVar1114 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar1114);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                    String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                    IntercomTheme intercomTheme1111111110 = IntercomTheme.INSTANCE;
                    int i1111111118 = IntercomTheme.$stable;
                    mia.b(strF, null, intercomTheme1111111110.getColors(jt1Var2, i1111111118).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1111111110.getTypography(jt1Var2, i1111111118).getType04(), jt1Var2, 0, 0, 131066);
                    b47.b(jt1Var2, ir9.n(aVar1113, 6.0f));
                    m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar1113, 16.0f), intercomTheme1111111110.getColors(jt1Var2, i1111111118).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                    jt1Var2.I();
                    jt1Var2.B();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
            ox6 ox6VarD1110 = ir9.d(eo7.m(ir9.c(aVar1112, 1.0f), 0.0f, 8.0f, 0.0f, f1111, 5), 48.0f);
            IntercomTheme intercomTheme1111111110 = IntercomTheme.INSTANCE;
            int i1111111117 = IntercomTheme.$stable;
            b72 b72Var1110 = intercomTheme1111111110.getShapes(bj4VarO, i1111111117).b;
            ko7 ko7Var1110 = zy0.a;
            bj4 bj4Var1111110 = bj4VarO;
            jz0.c(mh4Var2, ox6VarD1110, false, b72Var1110, zy0.f(0L, gh5.a(intercomTheme1111111110, bj4VarO, i1111111117), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var1111110, ((i3 >> 9) & 14) | 805306416, 484);
            bj4VarO = bj4Var1111110;
            b47.b(bj4VarO, ir9.d(aVar1112, f1111));
            bj4VarO.U(true);
        } else {
            aVar = ox6.a.t;
            if (i7 != 0) {
                ox6Var2 = aVar;
            }
            f = 16.0f;
            ox6 ox6VarK1111 = eo7.k(gi0.c(q69.h(ox6Var2.H(ir9.c), q69.f(bj4VarO), 12), kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a), 16.0f, 0.0f, 2);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK1111);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            bj4VarO.K(-210345289);
            while (r0.hasNext()) {
                if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                    bj4VarO.K(-267720558);
                    IntercomTheme intercomTheme1111111111 = IntercomTheme.INSTANCE;
                    int i1111111118 = IntercomTheme.$stable;
                    surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111111111, bj4VarO, i1111111118), gh5.a(intercomTheme1111111111, bj4VarO, i1111111118), intercomTheme1111111111.getColors(bj4VarO, i1111111118).m751getAction0d7_KjU(), intercomTheme1111111111.getColors(bj4VarO, i1111111118).m769getOnAction0d7_KjU(), null, 16, null);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-267315078);
                    IntercomTheme intercomTheme1111111112 = IntercomTheme.INSTANCE;
                    int i1111111119 = IntercomTheme.$stable;
                    surveyUiColors2 = new SurveyUiColors(kk.a(intercomTheme1111111112, bj4VarO, i1111111119), gh5.a(intercomTheme1111111112, bj4VarO, i1111111119), kk.a(intercomTheme1111111112, bj4VarO, i1111111119), gh5.a(intercomTheme1111111112, bj4VarO, i1111111119), new uh1(intercomTheme1111111112.getColors(bj4VarO, i1111111119).m751getAction0d7_KjU()), null);
                    bj4VarO.U(false);
                }
                SurveyUiColors surveyUiColors1113 = surveyUiColors2;
                bj4VarO.K(-978435731);
                zJ = bj4VarO.j(questionState);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new an0(1, questionState);
                    bj4VarO.C(objF);
                } else {
                    objF = new an0(1, questionState);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4 bj4Var1111111 = bj4VarO;
                QuestionComponentKt.m453QuestionComponentlzVJ5Jw(j84.c(aVar, (oh4) objF), eo7.m(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), questionState, surveyUiColors1113, oh4Var, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), 0.0f, ob4.A, cka.b(16), oh4Var3, bj4Var1111111, (57344 & i3) | 114819120 | ((i3 << 12) & 1879048192), 0);
                oh4Var3 = oh4Var2;
                aVar = aVar;
                f = f;
                bj4VarO = bj4Var1111111;
            }
            float f1112 = f;
            ox6.a aVar1113 = aVar;
            bj4VarO.U(false);
            b47.b(bj4VarO, ox6Var2.H(new qs5(true, 1.0f)));
            ox6 ox6VarM1111 = eo7.m(ir9.c(aVar1113, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
            if (content.getEnableCta()) {
                z = false;
            } else {
                z = false;
            }
            IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(mh4Var3, ox6VarM1111, z, gr1.b(-964987781, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i11111111110) {
                    oy8Var.getClass();
                    if ((i11111111110 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    boolean showCreatingTicketProgress = content.getShowCreatingTicketProgress();
                    ox6.a aVar1114 = ox6.a.t;
                    if (showCreatingTicketProgress) {
                        jt1Var2.K(-265542591);
                        ae8.a(ir9.j(aVar1114, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, jt1Var2, 390, 58);
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(-265351104);
                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, aVar1114);
                    bt1.c.getClass();
                    qr5.a aVar1115 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar1115);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                    String strF = nr1.f(jt1Var2, R.string.intercom_tickets_create_ticket);
                    IntercomTheme intercomTheme1111111113 = IntercomTheme.INSTANCE;
                    int i11111111111 = IntercomTheme.$stable;
                    mia.b(strF, null, intercomTheme1111111113.getColors(jt1Var2, i11111111111).m769getOnAction0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme1111111113.getTypography(jt1Var2, i11111111111).getType04(), jt1Var2, 0, 0, 131066);
                    b47.b(jt1Var2, ir9.n(aVar1114, 6.0f));
                    m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, ir9.j(aVar1114, 16.0f), intercomTheme1111111113.getColors(jt1Var2, i11111111111).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                    jt1Var2.I();
                    jt1Var2.B();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i3 >> 6) & 14) | 3120, 0);
            ox6 ox6VarD1111 = ir9.d(eo7.m(ir9.c(aVar1113, 1.0f), 0.0f, 8.0f, 0.0f, f1112, 5), 48.0f);
            IntercomTheme intercomTheme1111111113 = IntercomTheme.INSTANCE;
            int i11111111110 = IntercomTheme.$stable;
            b72 b72Var1111 = intercomTheme1111111113.getShapes(bj4VarO, i11111111110).b;
            ko7 ko7Var1111 = zy0.a;
            bj4 bj4Var1111112 = bj4VarO;
            jz0.c(mh4Var2, ox6VarD1111, false, b72Var1111, zy0.f(0L, gh5.a(intercomTheme1111111113, bj4VarO, i11111111110), bj4VarO, 13), null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m534getLambda1$intercom_sdk_base_release(), bj4Var1111112, ((i3 >> 9) & 14) | 805306416, 484);
            bj4VarO = bj4Var1111112;
            b47.b(bj4VarO, ir9.d(aVar1113, f1112));
            bj4VarO.U(true);
        }
        ox6Var3 = ox6Var2;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bb2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$5(ox6Var3, content, mh4Var, mh4Var2, oh4Var, oh4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketContentScreen$lambda$4$lambda$3$lambda$2$lambda$1(QuestionState questionState, v94 v94Var) {
        v94Var.getClass();
        if ((questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getAnswer() instanceof Answer.NoAnswer.InitialNoAnswer) && !v94Var.a()) {
            questionState.validate();
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketContentScreen$lambda$5(ox6 ox6Var, CreateTicketViewModel.CreateTicketFormUiState.Content content, mh4 mh4Var, mh4 mh4Var2, oh4 oh4Var, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        CreateTicketContentScreen(ox6Var, content, mh4Var, mh4Var2, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void CreateTicketContentScreenPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1070922859);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m535getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new za2(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketContentScreenPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        CreateTicketContentScreenPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void CreateTicketErrorPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-627794766);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m537getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new xa2(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketErrorPreview$lambda$8(int i, jt1 jt1Var, int i2) {
        CreateTicketErrorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void CreateTicketLoadingPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1078617214);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m536getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ya2(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketLoadingPreview$lambda$7(int i, jt1 jt1Var, int i2) {
        CreateTicketLoadingPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void CreateTicketScreen(final CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, final mh4<g2b> mh4Var3, final oh4<? super String, g2b> oh4Var, final oh4<? super AnswerClickData, g2b> oh4Var2, jt1 jt1Var, final int i) {
        int i2;
        final mh4<g2b> mh4Var4;
        final mh4<g2b> mh4Var5;
        final oh4<? super String, g2b> oh4Var3;
        final oh4<? super AnswerClickData, g2b> oh4Var4;
        bj4 bj4Var;
        createTicketFormUiState.getClass();
        mh4Var.getClass();
        mh4Var2.getClass();
        mh4Var3.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(-2129527205);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(createTicketFormUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            mh4Var4 = mh4Var2;
            i2 |= bj4VarO.j(mh4Var4) ? 256 : 128;
        } else {
            mh4Var4 = mh4Var2;
        }
        if ((i & 3072) == 0) {
            mh4Var5 = mh4Var3;
            i2 |= bj4VarO.j(mh4Var5) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        } else {
            mh4Var5 = mh4Var3;
        }
        if ((i & 24576) == 0) {
            oh4Var3 = oh4Var;
            i2 |= bj4VarO.j(oh4Var3) ? 16384 : 8192;
        } else {
            oh4Var3 = oh4Var;
        }
        if ((196608 & i) == 0) {
            oh4Var4 = oh4Var2;
            i2 |= bj4VarO.j(oh4Var4) ? 131072 : 65536;
        } else {
            oh4Var4 = oh4Var2;
        }
        if ((i2 & 74899) == 74898 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            ox6 ox6VarC = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            bj4Var = bj4VarO;
            q39.a(hnb.c(ox6VarC, fnb.a.c(bj4VarO).b), gr1.b(-2106967777, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt.CreateTicketScreen.1
                public final void invoke(jt1 jt1Var2, int i3) {
                    if ((i3 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState2 = createTicketFormUiState;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, createTicketFormUiState2 instanceof CreateTicketViewModel.CreateTicketFormUiState.Content ? ((CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState2).getTitle() : BuildConfig.FLAVOR, null, null, null, mh4Var, null, false, 0L, 0L, 0L, null, null, jt1Var2, 0, 0, 8157);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(426563690, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt.CreateTicketScreen.2
                public final void invoke(go7 go7Var, jt1 jt1Var2, int i3) {
                    go7Var.getClass();
                    if ((i3 & 6) == 0) {
                        i3 |= jt1Var2.J(go7Var) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState2 = createTicketFormUiState;
                    if (xj5.a(createTicketFormUiState2, CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE)) {
                        jt1Var2.K(-1277614038);
                        jt1Var2.B();
                        return;
                    }
                    boolean z = createTicketFormUiState2 instanceof CreateTicketViewModel.CreateTicketFormUiState.Content;
                    ox6.a aVar = ox6.a.t;
                    if (z) {
                        jt1Var2.K(-1277573614);
                        CreateTicketContentScreenKt.CreateTicketContentScreen(eo7.h(aVar, go7Var), (CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState, mh4Var4, mh4Var5, oh4Var3, oh4Var4, jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (createTicketFormUiState2 instanceof CreateTicketViewModel.CreateTicketFormUiState.Error) {
                        jt1Var2.K(-1277134623);
                        IntercomErrorScreenKt.IntercomErrorScreen(((CreateTicketViewModel.CreateTicketFormUiState.Error) createTicketFormUiState).getErrorState(), eo7.h(aVar, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (xj5.a(createTicketFormUiState2, CreateTicketViewModel.CreateTicketFormUiState.Loading.INSTANCE)) {
                        jt1Var2.K(97356182);
                        LoadingScreenKt.LoadingScreen(eo7.h(aVar, go7Var), R.drawable.intercom_content_loading, jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(97332167);
                        jt1Var2.B();
                        u.b();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                    invoke(go7Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, 805306416, 508);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wa2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CreateTicketContentScreenKt.CreateTicketScreen$lambda$0(createTicketFormUiState, mh4Var, mh4Var2, mh4Var3, oh4Var, oh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CreateTicketScreen$lambda$0(CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, oh4 oh4Var, oh4 oh4Var2, int i, jt1 jt1Var, int i2) {
        CreateTicketScreen(createTicketFormUiState, mh4Var, mh4Var2, mh4Var3, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
