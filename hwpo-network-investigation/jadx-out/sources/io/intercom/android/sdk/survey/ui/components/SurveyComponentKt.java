package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.aj1;
import defpackage.b47;
import defpackage.b6a;
import defpackage.be8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c15;
import defpackage.c30;
import defpackage.c33;
import defpackage.c6a;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ec9;
import defpackage.eg;
import defpackage.eg5;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fg5;
import defpackage.fl6;
import defpackage.fnb;
import defpackage.fr1;
import defpackage.fx0;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h71;
import defpackage.h86;
import defpackage.hc9;
import defpackage.hf3;
import defpackage.hg;
import defpackage.hnb;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jg;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.m78;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.of3;
import defpackage.oh4;
import defpackage.ov0;
import defpackage.ox6;
import defpackage.pb9;
import defpackage.ph1;
import defpackage.pv0;
import defpackage.q39;
import defpackage.q69;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.t72;
import defpackage.tf5;
import defpackage.u;
import defpackage.uh1;
import defpackage.ux1;
import defpackage.w20;
import defpackage.wd3;
import defpackage.ws0;
import defpackage.x69;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xq6;
import defpackage.yi1;
import defpackage.zd8;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyComponentKt {
    private static final AppConfig emptyAppConfig;

    static {
        NexusConfig nexusConfig = new NexusConfig();
        AttachmentSettings attachmentSettings = AttachmentSettings.Companion.getDEFAULT();
        ConversationStateSyncSettings conversationStateSyncSettings = ConversationStateSyncSettings.Companion.getDEFAULT();
        of3 of3Var = of3.t;
        emptyAppConfig = new AppConfig(BuildConfig.FLAVOR, 0, 0, 0, false, false, false, 100, 1000L, 1000L, 1000L, 1000L, true, true, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, true, BuildConfig.FLAVOR, of3Var, of3Var, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, true, false, false, false, null, nexusConfig, attachmentSettings, true, conversationStateSyncSettings, false, true);
    }

    public static final void SimpleSurvey(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(126014647);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            SurveyUiColors surveyUiColorsA = ux1.a(null, null, 3, null);
            Block.Builder builderWithText = new Block.Builder().withText("<b>Step 1</b>");
            BlockType blockType = BlockType.HEADING;
            Block.Builder builderWithType = builderWithText.withType(blockType.getSerializedName());
            Block.Builder builderWithText2 = new Block.Builder().withText("Get tailored discounts to your inbox");
            BlockType blockType2 = BlockType.PARAGRAPH;
            hf3 hf3Var = hf3.t;
            SurveyData.Step step = new SurveyData.Step(ws0.i(builderWithType, builderWithText2.withType(blockType2.getSerializedName())), "preview-step", hf3Var, 1, null, null, 48, null);
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "AD");
            avatarCreate.getClass();
            int i2 = 1;
            TopBarState.SenderTopBarState senderTopBarState = new TopBarState.SenderTopBarState(avatarCreate, "Andy", emptyAppConfig, true, surveyUiColorsA, new ProgressBarState(true, 0.5f));
            List listI = ws0.i(new Block.Builder().withText("<b>Step 1</b>").withType(blockType.getSerializedName()), new Block.Builder().withText("Get tailored discounts to your inbox").withType(blockType2.getSerializedName()));
            String string = UUID.randomUUID().toString();
            string.getClass();
            QuestionState questionState = new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel(string, ws0.h(new Block.Builder().withText("Is this a preview?")), true, "Let us know", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, null, null, 448, null), surveyUiColorsA);
            String string2 = UUID.randomUUID().toString();
            string2.getClass();
            QuestionState questionState2 = new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel(string2, ws0.h(new Block.Builder().withText("Question Title")), true, ws0.i("Option A", "Option B", "Option C", "Option D"), false), ux1.a(null, null, 3, null));
            String string3 = UUID.randomUUID().toString();
            string3.getClass();
            List listH = ws0.h(new Block.Builder().withText("How would your rate your experience?"));
            SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType = SurveyData.Step.Question.QuestionData.QuestionSubType.STARS;
            fg5 fg5Var = new fg5(1, 5, 1);
            ArrayList arrayList = new ArrayList(ph1.n(fg5Var, 10));
            Iterator<Integer> it = fg5Var.iterator();
            while (((eg5) it).v) {
                arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((tf5) it).nextInt()));
            }
            SurveyState.Content content = new SurveyState.Content(step, listI, ws0.i(questionState, questionState2, new QuestionState(new SurveyData.Step.Question.NumericRatingQuestionModel(string3, listH, true, arrayList, "Poor", "Excellent", 1, 5, questionSubType), surveyUiColorsA)), hf3Var, new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button), surveyUiColorsA, senderTopBarState);
            bj4VarO.K(-688243060);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new be8(i2);
                bj4VarO.C(objF);
            }
            oh4 oh4Var = (oh4) objF;
            Object objB = aa0.b(bj4VarO, false, -688242356);
            if (objB == c0187a) {
                objB = new xq6(i2);
                bj4VarO.C(objB);
            }
            mh4 mh4Var = (mh4) objB;
            Object objB2 = aa0.b(bj4VarO, false, -688241396);
            if (objB2 == c0187a) {
                objB2 = new eg(2);
                bj4VarO.C(objB2);
            }
            bj4VarO.U(false);
            SurveyComponent(content, oh4Var, mh4Var, (oh4) objB2, null, bj4VarO, 3504, 16);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: a6a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SurveyComponentKt.SimpleSurvey$lambda$14(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SimpleSurvey$lambda$13$lambda$12(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SimpleSurvey$lambda$14(int i, jt1 jt1Var, int i2) {
        SimpleSurvey(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SimpleSurvey$lambda$9$lambda$8(t72 t72Var) {
        t72Var.getClass();
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0224  */
    /* JADX WARN: Code duplicated, block: B:89:0x022e  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void SurveyComponent(final SurveyState surveyState, final oh4<? super t72, g2b> oh4Var, final mh4<g2b> mh4Var, oh4<? super String, g2b> oh4Var2, oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var3, jt1 jt1Var, final int i, final int i2) {
        int i3;
        oh4<? super String, g2b> oh4Var4;
        int i4;
        oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var5;
        int i5;
        jt1.a.C0187a c0187a;
        int i6;
        final oh4<? super String, g2b> oh4Var6;
        final oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var7;
        List listI;
        ox6.a aVar;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bj4 bj4Var;
        final oh4<? super String, g2b> oh4Var8;
        final oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var9;
        Object objF;
        Object objF2;
        xj8 xj8VarW;
        surveyState.getClass();
        oh4Var.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(290100480);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(surveyState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                oh4Var4 = oh4Var2;
                i3 |= bj4VarO.j(oh4Var4) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var5 = oh4Var3;
                    if (bj4VarO.j(oh4Var5)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                    c0187a = jt1.a.a;
                    i6 = 1;
                    if (i7 != 0) {
                        bj4VarO.K(-1619621977);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new h71(i6);
                            bj4VarO.C(objF2);
                        }
                        oh4Var6 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(-1619619545);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new zd8(i6);
                            bj4VarO.C(objF);
                        }
                        oh4Var7 = (oh4) objF;
                        bj4VarO.U(false);
                    } else {
                        oh4Var7 = oh4Var5;
                    }
                    if (ColorExtensionsKt.m839isDarkColor8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                        listI = ws0.i(new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                    } else {
                        listI = ws0.i(new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                    }
                    h86 h86VarA = fx0.a.a(listI);
                    aVar = ox6.a.t;
                    ox6 ox6VarB = gi0.b(aVar, h86VarA);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarB);
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
                    WeakHashMap<View, fnb> weakHashMap = fnb.w;
                    ox6 ox6VarC2 = hnb.c(aVar, fnb.a.c(bj4VarO).b);
                    long j = uh1.j;
                    fr1 fr1VarB = gr1.b(-365860662, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                        public final void invoke(jt1 jt1Var2, int i8) {
                            if ((i8 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                SurveyTopBarComponentKt.SurveyTopBar(surveyState.getTopBarState(), mh4Var, w20.c(ox6.a.t, w20.c), jt1Var2, 0, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    fr1 fr1VarB2 = gr1.b(-1342576427, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                        public final void invoke(go7 go7Var, jt1 jt1Var2, int i8) {
                            go7Var.getClass();
                            if ((i8 & 6) == 0) {
                                i8 |= jt1Var2.J(go7Var) ? 4 : 2;
                            }
                            if ((i8 & 19) == 18 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            SurveyState surveyState2 = surveyState;
                            boolean z = surveyState2 instanceof SurveyState.Content;
                            ox6.a aVar3 = ox6.a.t;
                            if (z) {
                                jt1Var2.K(-509515994);
                                SurveyComponentKt.SurveyContent((SurveyState.Content) surveyState, oh4Var, oh4Var6, oh4Var7, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                                jt1Var2.B();
                                return;
                            }
                            if (surveyState2 instanceof SurveyState.Error) {
                                jt1Var2.K(-509504751);
                                ErrorComponentKt.SurveyError((SurveyState.Error) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                                jt1Var2.B();
                            } else if (surveyState2 instanceof SurveyState.Loading) {
                                jt1Var2.K(-509498669);
                                LoadingComponentKt.SurveyLoading((SurveyState.Loading) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                                jt1Var2.B();
                            } else if (xj5.a(surveyState2, SurveyState.Initial.INSTANCE)) {
                                jt1Var2.K(1385593533);
                                jt1Var2.B();
                            } else {
                                jt1Var2.K(-509517452);
                                jt1Var2.B();
                                u.b();
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                            invoke(go7Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var10 = oh4Var7;
                    q39.a(ox6VarC2, fr1VarB, null, null, null, 0, j, 0L, null, fr1VarB2, bj4VarO, 806879280, 444);
                    bj4Var = bj4VarO;
                    bj4Var.U(true);
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var10;
                } else {
                    bj4VarO.u();
                    oh4Var8 = oh4Var4;
                    oh4Var9 = oh4Var5;
                    bj4Var = bj4VarO;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: z5a
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SurveyComponentKt.SurveyComponent$lambda$5(surveyState, oh4Var, mh4Var, oh4Var8, oh4Var9, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var5 = oh4Var3;
            if ((i3 & 9363) == 9362) {
                c0187a = jt1.a.a;
                i6 = 1;
                if (i7 != 0) {
                    bj4VarO.K(-1619621977);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new h71(i6);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1619619545);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new zd8(i6);
                        bj4VarO.C(objF);
                    }
                    oh4Var7 = (oh4) objF;
                    bj4VarO.U(false);
                } else {
                    oh4Var7 = oh4Var5;
                }
                if (ColorExtensionsKt.m839isDarkColor8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                } else {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                }
                h86 h86VarA2 = fx0.a.a(listI);
                aVar = ox6.a.t;
                ox6 ox6VarB2 = gi0.b(aVar, h86VarA2);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB2);
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
                WeakHashMap<View, fnb> weakHashMap2 = fnb.w;
                ox6 ox6VarC3 = hnb.c(aVar, fnb.a.c(bj4VarO).b);
                long j2 = uh1.j;
                fr1 fr1VarB3 = gr1.b(-365860662, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    public final void invoke(jt1 jt1Var2, int i8) {
                        if ((i8 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(surveyState.getTopBarState(), mh4Var, w20.c(ox6.a.t, w20.c), jt1Var2, 0, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                fr1 fr1VarB4 = gr1.b(-1342576427, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    public final void invoke(go7 go7Var, jt1 jt1Var2, int i8) {
                        go7Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(go7Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        SurveyState surveyState2 = surveyState;
                        boolean z = surveyState2 instanceof SurveyState.Content;
                        ox6.a aVar3 = ox6.a.t;
                        if (z) {
                            jt1Var2.K(-509515994);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) surveyState, oh4Var, oh4Var6, oh4Var7, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                            return;
                        }
                        if (surveyState2 instanceof SurveyState.Error) {
                            jt1Var2.K(-509504751);
                            ErrorComponentKt.SurveyError((SurveyState.Error) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (surveyState2 instanceof SurveyState.Loading) {
                            jt1Var2.K(-509498669);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (xj5.a(surveyState2, SurveyState.Initial.INSTANCE)) {
                            jt1Var2.K(1385593533);
                            jt1Var2.B();
                        } else {
                            jt1Var2.K(-509517452);
                            jt1Var2.B();
                            u.b();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                        invoke(go7Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var11 = oh4Var7;
                q39.a(ox6VarC3, fr1VarB3, null, null, null, 0, j2, 0L, null, fr1VarB4, bj4VarO, 806879280, 444);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var11;
            } else {
                c0187a = jt1.a.a;
                i6 = 1;
                if (i7 != 0) {
                    bj4VarO.K(-1619621977);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new h71(i6);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1619619545);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new zd8(i6);
                        bj4VarO.C(objF);
                    }
                    oh4Var7 = (oh4) objF;
                    bj4VarO.U(false);
                } else {
                    oh4Var7 = oh4Var5;
                }
                if (ColorExtensionsKt.m839isDarkColor8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                } else {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                }
                h86 h86VarA3 = fx0.a.a(listI);
                aVar = ox6.a.t;
                ox6 ox6VarB3 = gi0.b(aVar, h86VarA3);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB3);
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
                WeakHashMap<View, fnb> weakHashMap3 = fnb.w;
                ox6 ox6VarC4 = hnb.c(aVar, fnb.a.c(bj4VarO).b);
                long j3 = uh1.j;
                fr1 fr1VarB5 = gr1.b(-365860662, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    public final void invoke(jt1 jt1Var2, int i8) {
                        if ((i8 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(surveyState.getTopBarState(), mh4Var, w20.c(ox6.a.t, w20.c), jt1Var2, 0, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                fr1 fr1VarB6 = gr1.b(-1342576427, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    public final void invoke(go7 go7Var, jt1 jt1Var2, int i8) {
                        go7Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(go7Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        SurveyState surveyState2 = surveyState;
                        boolean z = surveyState2 instanceof SurveyState.Content;
                        ox6.a aVar3 = ox6.a.t;
                        if (z) {
                            jt1Var2.K(-509515994);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) surveyState, oh4Var, oh4Var6, oh4Var7, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                            return;
                        }
                        if (surveyState2 instanceof SurveyState.Error) {
                            jt1Var2.K(-509504751);
                            ErrorComponentKt.SurveyError((SurveyState.Error) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (surveyState2 instanceof SurveyState.Loading) {
                            jt1Var2.K(-509498669);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (xj5.a(surveyState2, SurveyState.Initial.INSTANCE)) {
                            jt1Var2.K(1385593533);
                            jt1Var2.B();
                        } else {
                            jt1Var2.K(-509517452);
                            jt1Var2.B();
                            u.b();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                        invoke(go7Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var12 = oh4Var7;
                q39.a(ox6VarC4, fr1VarB5, null, null, null, 0, j3, 0L, null, fr1VarB6, bj4VarO, 806879280, 444);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var12;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: z5a
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyComponentKt.SurveyComponent$lambda$5(surveyState, oh4Var, mh4Var, oh4Var8, oh4Var9, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var4 = oh4Var2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                oh4Var5 = oh4Var3;
                if (bj4VarO.j(oh4Var5)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) == 9362) {
                c0187a = jt1.a.a;
                i6 = 1;
                if (i7 != 0) {
                    bj4VarO.K(-1619621977);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new h71(i6);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1619619545);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new zd8(i6);
                        bj4VarO.C(objF);
                    }
                    oh4Var7 = (oh4) objF;
                    bj4VarO.U(false);
                } else {
                    oh4Var7 = oh4Var5;
                }
                if (ColorExtensionsKt.m839isDarkColor8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                } else {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                }
                h86 h86VarA4 = fx0.a.a(listI);
                aVar = ox6.a.t;
                ox6 ox6VarB4 = gi0.b(aVar, h86VarA4);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB4);
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
                WeakHashMap<View, fnb> weakHashMap4 = fnb.w;
                ox6 ox6VarC5 = hnb.c(aVar, fnb.a.c(bj4VarO).b);
                long j4 = uh1.j;
                fr1 fr1VarB7 = gr1.b(-365860662, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    public final void invoke(jt1 jt1Var2, int i8) {
                        if ((i8 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(surveyState.getTopBarState(), mh4Var, w20.c(ox6.a.t, w20.c), jt1Var2, 0, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                fr1 fr1VarB8 = gr1.b(-1342576427, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    public final void invoke(go7 go7Var, jt1 jt1Var2, int i8) {
                        go7Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(go7Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        SurveyState surveyState2 = surveyState;
                        boolean z = surveyState2 instanceof SurveyState.Content;
                        ox6.a aVar3 = ox6.a.t;
                        if (z) {
                            jt1Var2.K(-509515994);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) surveyState, oh4Var, oh4Var6, oh4Var7, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                            return;
                        }
                        if (surveyState2 instanceof SurveyState.Error) {
                            jt1Var2.K(-509504751);
                            ErrorComponentKt.SurveyError((SurveyState.Error) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (surveyState2 instanceof SurveyState.Loading) {
                            jt1Var2.K(-509498669);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (xj5.a(surveyState2, SurveyState.Initial.INSTANCE)) {
                            jt1Var2.K(1385593533);
                            jt1Var2.B();
                        } else {
                            jt1Var2.K(-509517452);
                            jt1Var2.B();
                            u.b();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                        invoke(go7Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var13 = oh4Var7;
                q39.a(ox6VarC5, fr1VarB7, null, null, null, 0, j4, 0L, null, fr1VarB8, bj4VarO, 806879280, 444);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var13;
            } else {
                c0187a = jt1.a.a;
                i6 = 1;
                if (i7 != 0) {
                    bj4VarO.K(-1619621977);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new h71(i6);
                        bj4VarO.C(objF2);
                    }
                    oh4Var6 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var6 = oh4Var4;
                }
                if (i4 != 0) {
                    bj4VarO.K(-1619619545);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new zd8(i6);
                        bj4VarO.C(objF);
                    }
                    oh4Var7 = (oh4) objF;
                    bj4VarO.U(false);
                } else {
                    oh4Var7 = oh4Var5;
                }
                if (ColorExtensionsKt.m839isDarkColor8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                } else {
                    listI = ws0.i(new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
                }
                h86 h86VarA5 = fx0.a.a(listI);
                aVar = ox6.a.t;
                ox6 ox6VarB5 = gi0.b(aVar, h86VarA5);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB5);
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
                WeakHashMap<View, fnb> weakHashMap5 = fnb.w;
                ox6 ox6VarC6 = hnb.c(aVar, fnb.a.c(bj4VarO).b);
                long j5 = uh1.j;
                fr1 fr1VarB9 = gr1.b(-365860662, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                    public final void invoke(jt1 jt1Var2, int i8) {
                        if ((i8 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            SurveyTopBarComponentKt.SurveyTopBar(surveyState.getTopBarState(), mh4Var, w20.c(ox6.a.t, w20.c), jt1Var2, 0, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                fr1 fr1VarB10 = gr1.b(-1342576427, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                    public final void invoke(go7 go7Var, jt1 jt1Var2, int i8) {
                        go7Var.getClass();
                        if ((i8 & 6) == 0) {
                            i8 |= jt1Var2.J(go7Var) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        SurveyState surveyState2 = surveyState;
                        boolean z = surveyState2 instanceof SurveyState.Content;
                        ox6.a aVar3 = ox6.a.t;
                        if (z) {
                            jt1Var2.K(-509515994);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) surveyState, oh4Var, oh4Var6, oh4Var7, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                            return;
                        }
                        if (surveyState2 instanceof SurveyState.Error) {
                            jt1Var2.K(-509504751);
                            ErrorComponentKt.SurveyError((SurveyState.Error) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (surveyState2 instanceof SurveyState.Loading) {
                            jt1Var2.K(-509498669);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                            jt1Var2.B();
                        } else if (xj5.a(surveyState2, SurveyState.Initial.INSTANCE)) {
                            jt1Var2.K(1385593533);
                            jt1Var2.B();
                        } else {
                            jt1Var2.K(-509517452);
                            jt1Var2.B();
                            u.b();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                        invoke(go7Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var14 = oh4Var7;
                q39.a(ox6VarC6, fr1VarB9, null, null, null, 0, j5, 0L, null, fr1VarB10, bj4VarO, 806879280, 444);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var14;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: z5a
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyComponentKt.SurveyComponent$lambda$5(surveyState, oh4Var, mh4Var, oh4Var8, oh4Var9, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var5 = oh4Var3;
        if ((i3 & 9363) == 9362) {
            c0187a = jt1.a.a;
            i6 = 1;
            if (i7 != 0) {
                bj4VarO.K(-1619621977);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new h71(i6);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var6 = oh4Var4;
            }
            if (i4 != 0) {
                bj4VarO.K(-1619619545);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new zd8(i6);
                    bj4VarO.C(objF);
                }
                oh4Var7 = (oh4) objF;
                bj4VarO.U(false);
            } else {
                oh4Var7 = oh4Var5;
            }
            if (ColorExtensionsKt.m839isDarkColor8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                listI = ws0.i(new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
            } else {
                listI = ws0.i(new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
            }
            h86 h86VarA6 = fx0.a.a(listI);
            aVar = ox6.a.t;
            ox6 ox6VarB6 = gi0.b(aVar, h86VarA6);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarB6);
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
            WeakHashMap<View, fnb> weakHashMap6 = fnb.w;
            ox6 ox6VarC7 = hnb.c(aVar, fnb.a.c(bj4VarO).b);
            long j6 = uh1.j;
            fr1 fr1VarB11 = gr1.b(-365860662, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                public final void invoke(jt1 jt1Var2, int i8) {
                    if ((i8 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        SurveyTopBarComponentKt.SurveyTopBar(surveyState.getTopBarState(), mh4Var, w20.c(ox6.a.t, w20.c), jt1Var2, 0, 0);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            fr1 fr1VarB12 = gr1.b(-1342576427, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                public final void invoke(go7 go7Var, jt1 jt1Var2, int i8) {
                    go7Var.getClass();
                    if ((i8 & 6) == 0) {
                        i8 |= jt1Var2.J(go7Var) ? 4 : 2;
                    }
                    if ((i8 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    SurveyState surveyState2 = surveyState;
                    boolean z = surveyState2 instanceof SurveyState.Content;
                    ox6.a aVar3 = ox6.a.t;
                    if (z) {
                        jt1Var2.K(-509515994);
                        SurveyComponentKt.SurveyContent((SurveyState.Content) surveyState, oh4Var, oh4Var6, oh4Var7, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                        return;
                    }
                    if (surveyState2 instanceof SurveyState.Error) {
                        jt1Var2.K(-509504751);
                        ErrorComponentKt.SurveyError((SurveyState.Error) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (surveyState2 instanceof SurveyState.Loading) {
                        jt1Var2.K(-509498669);
                        LoadingComponentKt.SurveyLoading((SurveyState.Loading) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (xj5.a(surveyState2, SurveyState.Initial.INSTANCE)) {
                        jt1Var2.K(1385593533);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(-509517452);
                        jt1Var2.B();
                        u.b();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                    invoke(go7Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var15 = oh4Var7;
            q39.a(ox6VarC7, fr1VarB11, null, null, null, 0, j6, 0L, null, fr1VarB12, bj4VarO, 806879280, 444);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            oh4Var8 = oh4Var6;
            oh4Var9 = oh4Var15;
        } else {
            c0187a = jt1.a.a;
            i6 = 1;
            if (i7 != 0) {
                bj4VarO.K(-1619621977);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new h71(i6);
                    bj4VarO.C(objF2);
                }
                oh4Var6 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var6 = oh4Var4;
            }
            if (i4 != 0) {
                bj4VarO.K(-1619619545);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new zd8(i6);
                    bj4VarO.C(objF);
                }
                oh4Var7 = (oh4) objF;
                bj4VarO.U(false);
            } else {
                oh4Var7 = oh4Var5;
            }
            if (ColorExtensionsKt.m839isDarkColor8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())) {
                listI = ws0.i(new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m832darken8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
            } else {
                listI = ws0.i(new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(surveyState.getSurveyUiColors().m403getBackground0d7_KjU()), new uh1(ColorExtensionsKt.m842lighten8_81llA(surveyState.getSurveyUiColors().m403getBackground0d7_KjU())));
            }
            h86 h86VarA7 = fx0.a.a(listI);
            aVar = ox6.a.t;
            ox6 ox6VarB7 = gi0.b(aVar, h86VarA7);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarB7);
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
            WeakHashMap<View, fnb> weakHashMap7 = fnb.w;
            ox6 ox6VarC8 = hnb.c(aVar, fnb.a.c(bj4VarO).b);
            long j7 = uh1.j;
            fr1 fr1VarB13 = gr1.b(-365860662, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                public final void invoke(jt1 jt1Var2, int i8) {
                    if ((i8 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        SurveyTopBarComponentKt.SurveyTopBar(surveyState.getTopBarState(), mh4Var, w20.c(ox6.a.t, w20.c), jt1Var2, 0, 0);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            fr1 fr1VarB14 = gr1.b(-1342576427, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                public final void invoke(go7 go7Var, jt1 jt1Var2, int i8) {
                    go7Var.getClass();
                    if ((i8 & 6) == 0) {
                        i8 |= jt1Var2.J(go7Var) ? 4 : 2;
                    }
                    if ((i8 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    SurveyState surveyState2 = surveyState;
                    boolean z = surveyState2 instanceof SurveyState.Content;
                    ox6.a aVar3 = ox6.a.t;
                    if (z) {
                        jt1Var2.K(-509515994);
                        SurveyComponentKt.SurveyContent((SurveyState.Content) surveyState, oh4Var, oh4Var6, oh4Var7, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                        return;
                    }
                    if (surveyState2 instanceof SurveyState.Error) {
                        jt1Var2.K(-509504751);
                        ErrorComponentKt.SurveyError((SurveyState.Error) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (surveyState2 instanceof SurveyState.Loading) {
                        jt1Var2.K(-509498669);
                        LoadingComponentKt.SurveyLoading((SurveyState.Loading) surveyState, eo7.h(aVar3, go7Var), jt1Var2, 0, 0);
                        jt1Var2.B();
                    } else if (xj5.a(surveyState2, SurveyState.Initial.INSTANCE)) {
                        jt1Var2.K(1385593533);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(-509517452);
                        jt1Var2.B();
                        u.b();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                    invoke(go7Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var16 = oh4Var7;
            q39.a(ox6VarC8, fr1VarB13, null, null, null, 0, j7, 0L, null, fr1VarB14, bj4VarO, 806879280, 444);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            oh4Var8 = oh4Var6;
            oh4Var9 = oh4Var16;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: z5a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SurveyComponentKt.SurveyComponent$lambda$5(surveyState, oh4Var, mh4Var, oh4Var8, oh4Var9, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyComponent$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyComponent$lambda$3$lambda$2(SurveyState.Content.SecondaryCta secondaryCta) {
        secondaryCta.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyComponent$lambda$5(SurveyState surveyState, oh4 oh4Var, mh4 mh4Var, oh4 oh4Var2, oh4 oh4Var3, int i, int i2, jt1 jt1Var, int i3) {
        SurveyComponent(surveyState, oh4Var, mh4Var, oh4Var2, oh4Var3, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void SurveyContent(final SurveyState.Content content, final oh4<? super t72, g2b> oh4Var, final oh4<? super String, g2b> oh4Var2, final oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var3, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        SurveyState.Content content2;
        int i3;
        oh4<? super t72, g2b> oh4Var4;
        oh4<? super String, g2b> oh4Var5;
        oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var6;
        ox6 ox6Var2;
        ox6 ox6Var3;
        Object objF;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        content.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        oh4Var3.getClass();
        bj4 bj4VarO = jt1Var.o(433920899);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            content2 = content;
        } else {
            content2 = content;
            if ((i & 6) == 0) {
                i3 = (bj4VarO.j(content2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            oh4Var4 = oh4Var;
        } else {
            oh4Var4 = oh4Var;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.j(oh4Var4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            oh4Var5 = oh4Var2;
        } else {
            oh4Var5 = oh4Var2;
            if ((i & 384) == 0) {
                i3 |= bj4VarO.j(oh4Var5) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            oh4Var6 = oh4Var3;
        } else {
            oh4Var6 = oh4Var3;
            if ((i & 3072) == 0) {
                i3 |= bj4VarO.j(oh4Var6) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    c33 c33Var = wd3.a;
                    objF = m78.a(bj4VarO.x(), bj4VarO);
                }
                ov0.a(ox6Var3.H(ir9.c), null, false, gr1.b(-1844267539, new AnonymousClass1(content2, oh4Var4, (t72) objF, oh4Var6, oh4Var5), bj4VarO), bj4VarO, 3072, 6);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: y5a
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SurveyComponentKt.SurveyContent$lambda$6(content, oh4Var, oh4Var2, oh4Var3, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ox6Var2 = ox6Var;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                c33 c33Var2 = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            ov0.a(ox6Var3.H(ir9.c), null, false, gr1.b(-1844267539, new AnonymousClass1(content2, oh4Var4, (t72) objF, oh4Var6, oh4Var5), bj4VarO), bj4VarO, 3072, 6);
            ox6Var4 = ox6Var3;
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                c33 c33Var3 = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            ov0.a(ox6Var3.H(ir9.c), null, false, gr1.b(-1844267539, new AnonymousClass1(content2, oh4Var4, (t72) objF, oh4Var6, oh4Var5), bj4VarO), bj4VarO, 3072, 6);
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: y5a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SurveyComponentKt.SurveyContent$lambda$6(content, oh4Var, oh4Var2, oh4Var3, ox6Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyContent$lambda$6(SurveyState.Content content, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        SurveyContent(content, oh4Var, oh4Var2, oh4Var3, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void SurveyErrorState(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1165269984);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Avatar avatarCreate = Avatar.create(BuildConfig.FLAVOR, "AD");
            avatarCreate.getClass();
            TopBarState.SenderTopBarState senderTopBarState = new TopBarState.SenderTopBarState(avatarCreate, "Andy", emptyAppConfig, true, ux1.a(null, null, 3, null), null, 32, null);
            SurveyUiColors surveyUiColorsA = ux1.a(null, null, 3, null);
            bj4VarO.K(178647459);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new b6a();
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            SurveyState.Error.WithCTA withCTA = new SurveyState.Error.WithCTA(0, surveyUiColorsA, senderTopBarState, (mh4) objF, 1, null);
            bj4VarO.K(178648612);
            Object objF2 = bj4VarO.f();
            int i2 = 2;
            if (objF2 == c0187a) {
                objF2 = new hg(i2);
                bj4VarO.C(objF2);
            }
            oh4 oh4Var = (oh4) objF2;
            Object objB = aa0.b(bj4VarO, false, 178649348);
            if (objB == c0187a) {
                objB = new c6a();
                bj4VarO.C(objB);
            }
            mh4 mh4Var = (mh4) objB;
            Object objB2 = aa0.b(bj4VarO, false, 178650339);
            if (objB2 == c0187a) {
                objB2 = new jg(i2);
                bj4VarO.C(objB2);
            }
            bj4VarO.U(false);
            SurveyComponent(withCTA, oh4Var, mh4Var, (oh4) objB2, null, bj4VarO, 3504, 16);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d6a
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SurveyComponentKt.SurveyErrorState$lambda$23(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyErrorState$lambda$18$lambda$17(t72 t72Var) {
        t72Var.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyErrorState$lambda$22$lambda$21(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SurveyErrorState$lambda$23(int i, jt1 jt1Var, int i2) {
        SurveyErrorState(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final AppConfig getEmptyAppConfig() {
        return emptyAppConfig;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<pv0, jt1, Integer, g2b> {
        final /* synthetic */ t72 $coroutineScope;
        final /* synthetic */ oh4<String, g2b> $onAnswerUpdated;
        final /* synthetic */ oh4<t72, g2b> $onContinue;
        final /* synthetic */ oh4<SurveyState.Content.SecondaryCta, g2b> $onSecondaryCtaClicked;
        final /* synthetic */ SurveyState.Content $state;

        /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BlockAlignment.values().length];
                try {
                    iArr[BlockAlignment.CENTER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BlockAlignment.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SurveyState.Content content, oh4<? super t72, g2b> oh4Var, t72 t72Var, oh4<? super SurveyState.Content.SecondaryCta, g2b> oh4Var2, oh4<? super String, g2b> oh4Var3) {
            this.$state = content;
            this.$onContinue = oh4Var;
            this.$coroutineScope = t72Var;
            this.$onSecondaryCtaClicked = oh4Var2;
            this.$onAnswerUpdated = oh4Var3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$10$lambda$7$lambda$6$lambda$5$lambda$4(CharSequence charSequence, hc9 hc9Var) {
            hc9Var.getClass();
            ec9.b(charSequence.toString(), hc9Var);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$10$lambda$9$lambda$8(oh4 oh4Var, t72 t72Var) {
            oh4Var.invoke(t72Var);
            return g2b.a;
        }

        public final void invoke(pv0 pv0Var, jt1 jt1Var, int i) {
            pv0 pv0Var2;
            int i2;
            String strF;
            jt1.a.C0187a c0187a;
            char c;
            sp0.a aVar;
            jt1 jt1Var2 = jt1Var;
            pv0Var.getClass();
            if ((i & 6) == 0) {
                pv0Var2 = pv0Var;
                i2 = i | (jt1Var2.J(pv0Var2) ? 4 : 2);
            } else {
                pv0Var2 = pv0Var;
                i2 = i;
            }
            if ((i2 & 19) == 18 && jt1Var2.r()) {
                jt1Var2.u();
                return;
            }
            float fI = pv0Var2.i();
            x69 x69VarF = q69.f(jt1Var2);
            jt1Var2.K(1705502327);
            boolean zJ = jt1Var2.J(x69VarF);
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a2 = jt1.a.a;
            if (zJ || objF == c0187a2) {
                objF = new SurveyComponentKt$SurveyContent$1$1$1(x69VarF, null);
                jt1Var2.C(objF);
            }
            jt1Var2.B();
            wd3.d(jt1Var2, (ci4) objF, BuildConfig.FLAVOR);
            boolean z = false;
            ox6 ox6VarH = q69.h(eo7.k(ir9.c, 16.0f, 0.0f, 2), x69VarF, 12);
            SurveyState.Content content = this.$state;
            oh4<t72, g2b> oh4Var = this.$onContinue;
            t72 t72Var = this.$coroutineScope;
            oh4<SurveyState.Content.SecondaryCta, g2b> oh4Var2 = this.$onSecondaryCtaClicked;
            oh4<String, g2b> oh4Var3 = this.$onAnswerUpdated;
            c30.k kVar = c30.c;
            sp0.a aVar2 = di.a.m;
            aj1 aj1VarA = yi1.a(kVar, aVar2, jt1Var2, 0);
            int iHashCode = Long.hashCode(jt1Var2.v());
            kw7 kw7VarY = jt1Var2.y();
            ox6 ox6VarC = it1.c(jt1Var2, ox6VarH);
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
            rd7.d(jt1Var2, bt1.a.f, aj1VarA);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var2, bt1.a.h);
            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
            ox6.a aVar4 = ox6.a.t;
            b47.b(jt1Var2, ir9.d(aVar4, 16.0f));
            float f = fI - 96.0f;
            for (int i3 = 0; i3 < content.getSecondaryCtaActions().size(); i3++) {
                f -= 64.0f;
            }
            int i4 = 1;
            ox6 ox6VarB = ir9.b(aVar4, 0.0f, f, 1);
            aj1 aj1VarA2 = yi1.a(kVar, aVar2, jt1Var2, 0);
            int iHashCode2 = Long.hashCode(jt1Var2.v());
            kw7 kw7VarY2 = jt1Var2.y();
            ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarB);
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
            rd7.d(jt1Var2, bt1.a.f, aj1VarA2);
            rd7.d(jt1Var2, bt1.a.e, kw7VarY2);
            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
            rd7.c(jt1Var2, bt1.a.h);
            rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
            jt1Var2.K(412612297);
            List<Block.Builder> stepTitle = content.getStepTitle();
            ArrayList arrayList = new ArrayList(ph1.n(stepTitle, 10));
            Iterator<T> it = stepTitle.iterator();
            while (it.hasNext()) {
                arrayList.add(((Block.Builder) it.next()).build());
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                Block block = (Block) arrayList.get(i5);
                BlockAlignment align = block.getAlign();
                int i7 = align == null ? -1 : WhenMappings.$EnumSwitchMapping$0[align.ordinal()];
                if (i7 != i4) {
                    c = 2;
                    if (i7 != 2) {
                        aVar = aVar2;
                    } else {
                        aVar = di.a.o;
                    }
                    BlockViewKt.m426BlockViewOkTjGUA(new c15(aVar), new BlockRenderData(block, new uh1(content.getSurveyUiColors().m407getOnBackground0d7_KjU()), null, null, null, 28, null), false, null, false, null, ImageRenderType.WITH_MAX_SIZE, uh1.j, null, null, false, null, null, jt1Var, 14155776, 0, 7996);
                    jt1Var2 = jt1Var;
                    i5 = i6;
                    content = content;
                    size = size;
                    aVar2 = aVar2;
                    arrayList = arrayList;
                    oh4Var2 = oh4Var2;
                    oh4Var3 = oh4Var3;
                    oh4Var = oh4Var;
                    t72Var = t72Var;
                    aVar4 = aVar4;
                    c0187a2 = c0187a2;
                    i4 = 1;
                    z = false;
                } else {
                    c = 2;
                    aVar = di.a.n;
                }
                BlockViewKt.m426BlockViewOkTjGUA(new c15(aVar), new BlockRenderData(block, new uh1(content.getSurveyUiColors().m407getOnBackground0d7_KjU()), null, null, null, 28, null), false, null, false, null, ImageRenderType.WITH_MAX_SIZE, uh1.j, null, null, false, null, null, jt1Var, 14155776, 0, 7996);
                jt1Var2 = jt1Var;
                i5 = i6;
                content = content;
                size = size;
                aVar2 = aVar2;
                arrayList = arrayList;
                oh4Var2 = oh4Var2;
                oh4Var3 = oh4Var3;
                oh4Var = oh4Var;
                t72Var = t72Var;
                aVar4 = aVar4;
                c0187a2 = c0187a2;
                i4 = 1;
                z = false;
            }
            oh4<String, g2b> oh4Var4 = oh4Var3;
            SurveyState.Content content2 = content;
            jt1.a.C0187a c0187a3 = c0187a2;
            final oh4<t72, g2b> oh4Var5 = oh4Var;
            final t72 t72Var2 = t72Var;
            oh4<SurveyState.Content.SecondaryCta, g2b> oh4Var6 = oh4Var2;
            int i8 = 0;
            jt1Var2.B();
            ox6.a aVar6 = aVar4;
            b47.b(jt1Var2, ir9.d(aVar6, 8.0f));
            jt1Var2.K(412641470);
            for (Object obj : content2.getQuestions()) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    ws0.m();
                    throw null;
                }
                QuestionState questionState = (QuestionState) obj;
                final CharSequence charSequence = Phrase.from((Context) jt1Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_question_question_number_of_question_count).put("questioin_number", i9).put("question_count", content2.getQuestions().size()).format();
                jt1Var2.K(-1598208888);
                boolean zJ2 = jt1Var2.j(charSequence);
                Object objF2 = jt1Var2.f();
                if (zJ2) {
                    c0187a = c0187a3;
                } else {
                    c0187a = c0187a3;
                    if (objF2 == c0187a) {
                    }
                    jt1Var2.B();
                    i8 = i9;
                    QuestionComponentKt.m453QuestionComponentlzVJ5Jw(eo7.k(pb9.b(aVar6, true, (oh4) objF2), 0.0f, 8.0f, 1), null, questionState, null, oh4Var4, 0L, 0.0f, null, 0L, null, jt1Var2, 0, 1002);
                    aVar6 = aVar6;
                    c0187a3 = c0187a;
                }
                objF2 = new oh4() { // from class: io.intercom.android.sdk.survey.ui.components.a
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        return SurveyComponentKt.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6$lambda$5$lambda$4(charSequence, (hc9) obj2);
                    }
                };
                jt1Var2.C(objF2);
                jt1Var2.B();
                i8 = i9;
                QuestionComponentKt.m453QuestionComponentlzVJ5Jw(eo7.k(pb9.b(aVar6, true, (oh4) objF2), 0.0f, 8.0f, 1), null, questionState, null, oh4Var4, 0L, 0.0f, null, 0L, null, jt1Var2, 0, 1002);
                aVar6 = aVar6;
                c0187a3 = c0187a;
            }
            ox6.a aVar7 = aVar6;
            jt1.a.C0187a c0187a4 = c0187a3;
            jt1Var2.B();
            jt1Var2.I();
            b47.b(jt1Var2, ir9.d(aVar7, 8.0f));
            SurveyState.Content.PrimaryCta primaryCta = content2.getPrimaryCta();
            jt1Var2.K(-1140585494);
            if (primaryCta instanceof SurveyState.Content.PrimaryCta.Custom) {
                strF = ((SurveyState.Content.PrimaryCta.Custom) primaryCta).getText();
            } else {
                if (!(primaryCta instanceof SurveyState.Content.PrimaryCta.Fallback)) {
                    u.b();
                    return;
                }
                strF = nr1.f(jt1Var2, ((SurveyState.Content.PrimaryCta.Fallback) primaryCta).getFallbackTextRes());
            }
            String str = strF;
            jt1Var2.B();
            List<SurveyState.Content.SecondaryCta> secondaryCtaActions = content2.getSecondaryCtaActions();
            jt1Var2.K(-1140576995);
            boolean zJ3 = jt1Var2.J(oh4Var5) | jt1Var2.j(t72Var2);
            Object objF3 = jt1Var2.f();
            if (zJ3 || objF3 == c0187a4) {
                objF3 = new mh4() { // from class: io.intercom.android.sdk.survey.ui.components.b
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return SurveyComponentKt.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8(oh4Var5, t72Var2);
                    }
                };
                jt1Var2.C(objF3);
            }
            jt1Var2.B();
            SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(null, str, secondaryCtaActions, (mh4) objF3, oh4Var6, content2.getSurveyUiColors(), jt1Var2, 0, 1);
            b47.b(jt1Var2, ir9.d(aVar7, 16.0f));
            jt1Var2.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(pv0 pv0Var, jt1 jt1Var, Integer num) {
            invoke(pv0Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
