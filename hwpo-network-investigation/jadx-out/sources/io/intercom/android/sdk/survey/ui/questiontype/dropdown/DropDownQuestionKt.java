package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d94;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.f52;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kp;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.p83;
import defpackage.q83;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.uma;
import defpackage.we1;
import defpackage.wja;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DropDownQuestionKt {
    private static final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel;

    static {
        String string = UUID.randomUUID().toString();
        string.getClass();
        dropDownQuestionModel = new SurveyData.Step.Question.DropDownQuestionModel(string, ws0.h(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Is this a preview?")), true, ws0.i("Option A", "Option B", "Option C"), "Please Select", null, 32, null);
    }

    public static final void ColoredDropDownSelectedQuestionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-2103500414);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m477getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new p83(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ColoredDropDownSelectedQuestionPreview$lambda$14(int i, jt1 jt1Var, int i2) {
        ColoredDropDownSelectedQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x0165  */
    /* JADX WARN: Code duplicated, block: B:104:0x0168  */
    /* JADX WARN: Code duplicated, block: B:107:0x019b  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0251  */
    /* JADX WARN: Code duplicated, block: B:121:0x0258  */
    /* JADX WARN: Code duplicated, block: B:122:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0289  */
    /* JADX WARN: Code duplicated, block: B:126:0x0295  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:140:0x0304  */
    /* JADX WARN: Code duplicated, block: B:143:0x039b  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:155:0x0404  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void DropDownQuestion(ox6 ox6Var, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, oh4<? super Answer, g2b> oh4Var, SurveyUiColors surveyUiColors, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, int i, int i2) {
        ox6 ox6Var2;
        int i3;
        Answer answer2;
        int i4;
        SurveyUiColors surveyUiColors2;
        int i5;
        int i6;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        int i7;
        ox6.a aVar;
        Answer answer3;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM474getLambda1$intercom_sdk_base_release;
        Object objF;
        jt1.a.C0187a c0187a;
        h37 h37Var;
        boolean z;
        boolean z2;
        long jA;
        boolean z3;
        long j;
        long jD;
        long j2;
        IntercomTheme intercomTheme;
        int i8;
        int i9;
        long jB;
        uh1 uh1VarM406getDropDownSelectedColorQN2ZGVo;
        Answer answer4;
        long j3;
        d94 d94Var;
        long j4;
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
        c30.k kVar;
        sp0.a aVar3;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        aj1 aj1VarA2;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        qr5.a aVar4;
        Object objF2;
        h37 h37Var2;
        boolean z4;
        ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        ny8 ny8VarA;
        int iHashCode4;
        kw7 kw7VarP4;
        ox6 ox6VarC4;
        String placeholder;
        final h37 h37Var3;
        Object objF3;
        SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel3;
        ci4<? super jt1, ? super Integer, g2b> ci4Var4;
        xj8 xj8VarW;
        oh4<? super Answer, g2b> oh4Var2 = oh4Var;
        dropDownQuestionModel2.getClass();
        oh4Var2.getClass();
        surveyUiColors.getClass();
        bj4 bj4VarO = jt1Var.o(1475245134);
        j1b j1bVar = bj4VarO.a;
        int i10 = i2 & 1;
        if (i10 != 0) {
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
            i3 |= bj4VarO.j(dropDownQuestionModel2) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                answer2 = answer;
                i3 |= bj4VarO.J(answer2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(oh4Var2)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    surveyUiColors2 = surveyUiColors;
                    if (bj4VarO.J(surveyUiColors2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        ci4Var2 = ci4Var;
                        if (bj4VarO.j(ci4Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                        aVar = ox6.a.t;
                        if (i10 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i11 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i6 != 0) {
                            ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        bj4VarO.K(1842846242);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        h37Var = (h37) objF;
                        z = false;
                        bj4VarO.U(false);
                        if (DropDownQuestion$lambda$1(h37Var) && (answer3 instanceof Answer.NoAnswer)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        bj4VarO.K(1842850020);
                        if (z2) {
                            jA = surveyUiColors2.m404getButton0d7_KjU();
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            z = false;
                        }
                        z3 = z2;
                        j = jA;
                        bj4VarO.U(z);
                        if (z3) {
                            jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jD = u7d.d(4285756278L);
                        }
                        j2 = jD;
                        intercomTheme = IntercomTheme.INSTANCE;
                        i8 = IntercomTheme.$stable;
                        i9 = i3;
                        jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                        uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                        answer4 = answer3;
                        if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                            j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                        } else {
                            j3 = j2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
                        j4 = j3;
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6Var2);
                        bt1.c.getClass();
                        ox6Var3 = ox6Var2;
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
                        kVar = c30.c;
                        aVar3 = di.a.m;
                        aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                        ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        ox6 ox6VarA = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                        aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarA);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            aVar4 = aVar2;
                            bj4VarO.k(aVar4);
                        } else {
                            aVar4 = aVar2;
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        ox6 ox6VarC5 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                        bj4VarO.K(-585752368);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            h37Var2 = h37Var;
                            z4 = false;
                            objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                            bj4VarO.C(objF2);
                        } else {
                            h37Var2 = h37Var;
                            z4 = false;
                        }
                        bj4VarO.U(z4);
                        ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                        ox6 ox6VarC6 = we1.c(ox6VarC5, z4, null, (mh4) objF2, 15);
                        ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                        iHashCode4 = Long.hashCode(bj4VarO.T);
                        kw7VarP4 = bj4VarO.P();
                        ox6VarC4 = it1.c(bj4VarO, ox6VarC6);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar4);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP4);
                        l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC4);
                        bj4VarO.K(602811226);
                        if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                            placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = dropDownQuestionModel2.getPlaceholder();
                        }
                        bj4VarO.U(false);
                        if (answer4 instanceof Answer.SingleAnswer) {
                            placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                        }
                        h37Var3 = h37Var2;
                        mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                        m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                        bj4VarO.U(true);
                        boolean zDropDownQuestion$lambda$1 = DropDownQuestion$lambda$1(h37Var3);
                        ox6 ox6VarC7 = ir9.c(aVar, 0.8f);
                        long jA2 = kk.a(intercomTheme, bj4VarO, i8);
                        b72 b72Var = intercomTheme.getShapes(bj4VarO, i8).b;
                        bj4VarO.K(-585710671);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new mh4() { // from class: r83
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        dropDownQuestionModel3 = dropDownQuestionModel2;
                        oh4Var2 = oh4Var;
                        kp.a(zDropDownQuestion$lambda$1, (mh4) objF3, ox6VarC7, 0L, null, null, b72Var, jA2, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(true);
                        bj4VarO.U(true);
                        ci4Var4 = ci4Var3;
                        answer2 = answer4;
                        ox6Var2 = ox6Var3;
                    } else {
                        bj4VarO.u();
                        dropDownQuestionModel3 = dropDownQuestionModel2;
                        ci4Var4 = ci4Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i10 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i11 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i6 != 0) {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    bj4VarO.K(1842846242);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    z = false;
                    bj4VarO.U(false);
                    if (DropDownQuestion$lambda$1(h37Var)) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    bj4VarO.K(1842850020);
                    if (z2) {
                        jA = surveyUiColors2.m404getButton0d7_KjU();
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        z = false;
                    }
                    z3 = z2;
                    j = jA;
                    bj4VarO.U(z);
                    if (z3) {
                        jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jD = u7d.d(4285756278L);
                    }
                    j2 = jD;
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    i9 = i3;
                    jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                    uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                    answer4 = answer3;
                    if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                        j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                    } else {
                        j3 = j2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    j4 = j3;
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
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
                    kVar = c30.c;
                    aVar3 = di.a.m;
                    aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                    ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ox6 ox6VarA2 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                    aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarA2);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        aVar4 = aVar2;
                        bj4VarO.k(aVar4);
                    } else {
                        aVar4 = aVar2;
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    ox6 ox6VarC8 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                    bj4VarO.K(-585752368);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        h37Var2 = h37Var;
                        z4 = false;
                        objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                        bj4VarO.C(objF2);
                    } else {
                        h37Var2 = h37Var;
                        z4 = false;
                    }
                    bj4VarO.U(z4);
                    ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                    ox6 ox6VarC9 = we1.c(ox6VarC8, z4, null, (mh4) objF2, 15);
                    ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                    iHashCode4 = Long.hashCode(bj4VarO.T);
                    kw7VarP4 = bj4VarO.P();
                    ox6VarC4 = it1.c(bj4VarO, ox6VarC9);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar4);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC4);
                    bj4VarO.K(602811226);
                    if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = dropDownQuestionModel2.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    if (answer4 instanceof Answer.SingleAnswer) {
                        placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                    }
                    h37Var3 = h37Var2;
                    mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                    m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                    bj4VarO.U(true);
                    boolean zDropDownQuestion$lambda$2 = DropDownQuestion$lambda$1(h37Var3);
                    ox6 ox6VarC10 = ir9.c(aVar, 0.8f);
                    long jA3 = kk.a(intercomTheme, bj4VarO, i8);
                    b72 b72Var2 = intercomTheme.getShapes(bj4VarO, i8).b;
                    bj4VarO.K(-585710671);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new mh4() { // from class: r83
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    dropDownQuestionModel3 = dropDownQuestionModel2;
                    oh4Var2 = oh4Var;
                    kp.a(zDropDownQuestion$lambda$2, (mh4) objF3, ox6VarC10, 0L, null, null, b72Var2, jA3, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    ci4Var4 = ci4Var3;
                    answer2 = answer4;
                    ox6Var2 = ox6Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i10 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i11 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i6 != 0) {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    bj4VarO.K(1842846242);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    z = false;
                    bj4VarO.U(false);
                    if (DropDownQuestion$lambda$1(h37Var)) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    bj4VarO.K(1842850020);
                    if (z2) {
                        jA = surveyUiColors2.m404getButton0d7_KjU();
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        z = false;
                    }
                    z3 = z2;
                    j = jA;
                    bj4VarO.U(z);
                    if (z3) {
                        jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jD = u7d.d(4285756278L);
                    }
                    j2 = jD;
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    i9 = i3;
                    jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                    uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                    answer4 = answer3;
                    if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                        j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                    } else {
                        j3 = j2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    j4 = j3;
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
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
                    kVar = c30.c;
                    aVar3 = di.a.m;
                    aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                    ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ox6 ox6VarA3 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                    aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarA3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        aVar4 = aVar2;
                        bj4VarO.k(aVar4);
                    } else {
                        aVar4 = aVar2;
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    ox6 ox6VarC11 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                    bj4VarO.K(-585752368);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        h37Var2 = h37Var;
                        z4 = false;
                        objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                        bj4VarO.C(objF2);
                    } else {
                        h37Var2 = h37Var;
                        z4 = false;
                    }
                    bj4VarO.U(z4);
                    ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                    ox6 ox6VarC12 = we1.c(ox6VarC11, z4, null, (mh4) objF2, 15);
                    ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                    iHashCode4 = Long.hashCode(bj4VarO.T);
                    kw7VarP4 = bj4VarO.P();
                    ox6VarC4 = it1.c(bj4VarO, ox6VarC12);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar4);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC4);
                    bj4VarO.K(602811226);
                    if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = dropDownQuestionModel2.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    if (answer4 instanceof Answer.SingleAnswer) {
                        placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                    }
                    h37Var3 = h37Var2;
                    mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                    m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                    bj4VarO.U(true);
                    boolean zDropDownQuestion$lambda$3 = DropDownQuestion$lambda$1(h37Var3);
                    ox6 ox6VarC13 = ir9.c(aVar, 0.8f);
                    long jA4 = kk.a(intercomTheme, bj4VarO, i8);
                    b72 b72Var3 = intercomTheme.getShapes(bj4VarO, i8).b;
                    bj4VarO.K(-585710671);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new mh4() { // from class: r83
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    dropDownQuestionModel3 = dropDownQuestionModel2;
                    oh4Var2 = oh4Var;
                    kp.a(zDropDownQuestion$lambda$3, (mh4) objF3, ox6VarC13, 0L, null, null, b72Var3, jA4, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    ci4Var4 = ci4Var3;
                    answer2 = answer4;
                    ox6Var2 = ox6Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
                }
            }
            i3 |= 24576;
            surveyUiColors2 = surveyUiColors;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i10 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i11 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i6 != 0) {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    bj4VarO.K(1842846242);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    z = false;
                    bj4VarO.U(false);
                    if (DropDownQuestion$lambda$1(h37Var)) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    bj4VarO.K(1842850020);
                    if (z2) {
                        jA = surveyUiColors2.m404getButton0d7_KjU();
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        z = false;
                    }
                    z3 = z2;
                    j = jA;
                    bj4VarO.U(z);
                    if (z3) {
                        jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jD = u7d.d(4285756278L);
                    }
                    j2 = jD;
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    i9 = i3;
                    jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                    uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                    answer4 = answer3;
                    if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                        j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                    } else {
                        j3 = j2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    j4 = j3;
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
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
                    kVar = c30.c;
                    aVar3 = di.a.m;
                    aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                    ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ox6 ox6VarA4 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                    aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarA4);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        aVar4 = aVar2;
                        bj4VarO.k(aVar4);
                    } else {
                        aVar4 = aVar2;
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    ox6 ox6VarC14 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                    bj4VarO.K(-585752368);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        h37Var2 = h37Var;
                        z4 = false;
                        objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                        bj4VarO.C(objF2);
                    } else {
                        h37Var2 = h37Var;
                        z4 = false;
                    }
                    bj4VarO.U(z4);
                    ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                    ox6 ox6VarC15 = we1.c(ox6VarC14, z4, null, (mh4) objF2, 15);
                    ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                    iHashCode4 = Long.hashCode(bj4VarO.T);
                    kw7VarP4 = bj4VarO.P();
                    ox6VarC4 = it1.c(bj4VarO, ox6VarC15);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar4);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC4);
                    bj4VarO.K(602811226);
                    if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = dropDownQuestionModel2.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    if (answer4 instanceof Answer.SingleAnswer) {
                        placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                    }
                    h37Var3 = h37Var2;
                    mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                    m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                    bj4VarO.U(true);
                    boolean zDropDownQuestion$lambda$4 = DropDownQuestion$lambda$1(h37Var3);
                    ox6 ox6VarC16 = ir9.c(aVar, 0.8f);
                    long jA5 = kk.a(intercomTheme, bj4VarO, i8);
                    b72 b72Var4 = intercomTheme.getShapes(bj4VarO, i8).b;
                    bj4VarO.K(-585710671);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new mh4() { // from class: r83
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    dropDownQuestionModel3 = dropDownQuestionModel2;
                    oh4Var2 = oh4Var;
                    kp.a(zDropDownQuestion$lambda$4, (mh4) objF3, ox6VarC16, 0L, null, null, b72Var4, jA5, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    ci4Var4 = ci4Var3;
                    answer2 = answer4;
                    ox6Var2 = ox6Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i10 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i11 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i6 != 0) {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    bj4VarO.K(1842846242);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    z = false;
                    bj4VarO.U(false);
                    if (DropDownQuestion$lambda$1(h37Var)) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    bj4VarO.K(1842850020);
                    if (z2) {
                        jA = surveyUiColors2.m404getButton0d7_KjU();
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        z = false;
                    }
                    z3 = z2;
                    j = jA;
                    bj4VarO.U(z);
                    if (z3) {
                        jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jD = u7d.d(4285756278L);
                    }
                    j2 = jD;
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    i9 = i3;
                    jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                    uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                    answer4 = answer3;
                    if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                        j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                    } else {
                        j3 = j2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    j4 = j3;
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
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
                    kVar = c30.c;
                    aVar3 = di.a.m;
                    aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                    ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ox6 ox6VarA5 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                    aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarA5);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        aVar4 = aVar2;
                        bj4VarO.k(aVar4);
                    } else {
                        aVar4 = aVar2;
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    ox6 ox6VarC17 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                    bj4VarO.K(-585752368);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        h37Var2 = h37Var;
                        z4 = false;
                        objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                        bj4VarO.C(objF2);
                    } else {
                        h37Var2 = h37Var;
                        z4 = false;
                    }
                    bj4VarO.U(z4);
                    ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                    ox6 ox6VarC18 = we1.c(ox6VarC17, z4, null, (mh4) objF2, 15);
                    ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                    iHashCode4 = Long.hashCode(bj4VarO.T);
                    kw7VarP4 = bj4VarO.P();
                    ox6VarC4 = it1.c(bj4VarO, ox6VarC18);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar4);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC4);
                    bj4VarO.K(602811226);
                    if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = dropDownQuestionModel2.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    if (answer4 instanceof Answer.SingleAnswer) {
                        placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                    }
                    h37Var3 = h37Var2;
                    mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                    m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                    bj4VarO.U(true);
                    boolean zDropDownQuestion$lambda$5 = DropDownQuestion$lambda$1(h37Var3);
                    ox6 ox6VarC19 = ir9.c(aVar, 0.8f);
                    long jA6 = kk.a(intercomTheme, bj4VarO, i8);
                    b72 b72Var5 = intercomTheme.getShapes(bj4VarO, i8).b;
                    bj4VarO.K(-585710671);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new mh4() { // from class: r83
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    dropDownQuestionModel3 = dropDownQuestionModel2;
                    oh4Var2 = oh4Var;
                    kp.a(zDropDownQuestion$lambda$5, (mh4) objF3, ox6VarC19, 0L, null, null, b72Var5, jA6, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    ci4Var4 = ci4Var3;
                    answer2 = answer4;
                    ox6Var2 = ox6Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i10 != 0) {
                    ox6Var2 = aVar;
                }
                if (i11 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i6 != 0) {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                bj4VarO.K(1842846242);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                z = false;
                bj4VarO.U(false);
                if (DropDownQuestion$lambda$1(h37Var)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                bj4VarO.K(1842850020);
                if (z2) {
                    jA = surveyUiColors2.m404getButton0d7_KjU();
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    z = false;
                }
                z3 = z2;
                j = jA;
                bj4VarO.U(z);
                if (z3) {
                    jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jD = u7d.d(4285756278L);
                }
                j2 = jD;
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                i9 = i3;
                jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                answer4 = answer3;
                if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                    j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                } else {
                    j3 = j2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
                j4 = j3;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
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
                kVar = c30.c;
                aVar3 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarA6 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarA6);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar4 = aVar2;
                    bj4VarO.k(aVar4);
                } else {
                    aVar4 = aVar2;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                ox6 ox6VarC110 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                bj4VarO.K(-585752368);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    h37Var2 = h37Var;
                    z4 = false;
                    objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                    bj4VarO.C(objF2);
                } else {
                    h37Var2 = h37Var;
                    z4 = false;
                }
                bj4VarO.U(z4);
                ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                ox6 ox6VarC111 = we1.c(ox6VarC110, z4, null, (mh4) objF2, 15);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode4 = Long.hashCode(bj4VarO.T);
                kw7VarP4 = bj4VarO.P();
                ox6VarC4 = it1.c(bj4VarO, ox6VarC111);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar4);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                bj4VarO.K(602811226);
                if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = dropDownQuestionModel2.getPlaceholder();
                }
                bj4VarO.U(false);
                if (answer4 instanceof Answer.SingleAnswer) {
                    placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                }
                h37Var3 = h37Var2;
                mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                bj4VarO.U(true);
                boolean zDropDownQuestion$lambda$6 = DropDownQuestion$lambda$1(h37Var3);
                ox6 ox6VarC112 = ir9.c(aVar, 0.8f);
                long jA7 = kk.a(intercomTheme, bj4VarO, i8);
                b72 b72Var6 = intercomTheme.getShapes(bj4VarO, i8).b;
                bj4VarO.K(-585710671);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new mh4() { // from class: r83
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                dropDownQuestionModel3 = dropDownQuestionModel2;
                oh4Var2 = oh4Var;
                kp.a(zDropDownQuestion$lambda$6, (mh4) objF3, ox6VarC112, 0L, null, null, b72Var6, jA7, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ci4Var4 = ci4Var3;
                answer2 = answer4;
                ox6Var2 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i10 != 0) {
                    ox6Var2 = aVar;
                }
                if (i11 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i6 != 0) {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                bj4VarO.K(1842846242);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                z = false;
                bj4VarO.U(false);
                if (DropDownQuestion$lambda$1(h37Var)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                bj4VarO.K(1842850020);
                if (z2) {
                    jA = surveyUiColors2.m404getButton0d7_KjU();
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    z = false;
                }
                z3 = z2;
                j = jA;
                bj4VarO.U(z);
                if (z3) {
                    jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jD = u7d.d(4285756278L);
                }
                j2 = jD;
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                i9 = i3;
                jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                answer4 = answer3;
                if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                    j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                } else {
                    j3 = j2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
                j4 = j3;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
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
                kVar = c30.c;
                aVar3 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarA7 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarA7);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar4 = aVar2;
                    bj4VarO.k(aVar4);
                } else {
                    aVar4 = aVar2;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                ox6 ox6VarC113 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                bj4VarO.K(-585752368);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    h37Var2 = h37Var;
                    z4 = false;
                    objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                    bj4VarO.C(objF2);
                } else {
                    h37Var2 = h37Var;
                    z4 = false;
                }
                bj4VarO.U(z4);
                ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                ox6 ox6VarC114 = we1.c(ox6VarC113, z4, null, (mh4) objF2, 15);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode4 = Long.hashCode(bj4VarO.T);
                kw7VarP4 = bj4VarO.P();
                ox6VarC4 = it1.c(bj4VarO, ox6VarC114);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar4);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                bj4VarO.K(602811226);
                if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = dropDownQuestionModel2.getPlaceholder();
                }
                bj4VarO.U(false);
                if (answer4 instanceof Answer.SingleAnswer) {
                    placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                }
                h37Var3 = h37Var2;
                mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                bj4VarO.U(true);
                boolean zDropDownQuestion$lambda$7 = DropDownQuestion$lambda$1(h37Var3);
                ox6 ox6VarC115 = ir9.c(aVar, 0.8f);
                long jA8 = kk.a(intercomTheme, bj4VarO, i8);
                b72 b72Var7 = intercomTheme.getShapes(bj4VarO, i8).b;
                bj4VarO.K(-585710671);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new mh4() { // from class: r83
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                dropDownQuestionModel3 = dropDownQuestionModel2;
                oh4Var2 = oh4Var;
                kp.a(zDropDownQuestion$lambda$7, (mh4) objF3, ox6VarC115, 0L, null, null, b72Var7, jA8, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ci4Var4 = ci4Var3;
                answer2 = answer4;
                ox6Var2 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
            }
        }
        i3 |= 384;
        answer2 = answer;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bj4VarO.j(oh4Var2)) {
                i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i2 & 16) != 0) {
            if ((i & 24576) == 0) {
                surveyUiColors2 = surveyUiColors;
                if (bj4VarO.J(surveyUiColors2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i10 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i11 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i6 != 0) {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    bj4VarO.K(1842846242);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    z = false;
                    bj4VarO.U(false);
                    if (DropDownQuestion$lambda$1(h37Var)) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    bj4VarO.K(1842850020);
                    if (z2) {
                        jA = surveyUiColors2.m404getButton0d7_KjU();
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        z = false;
                    }
                    z3 = z2;
                    j = jA;
                    bj4VarO.U(z);
                    if (z3) {
                        jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jD = u7d.d(4285756278L);
                    }
                    j2 = jD;
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    i9 = i3;
                    jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                    uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                    answer4 = answer3;
                    if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                        j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                    } else {
                        j3 = j2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    j4 = j3;
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
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
                    kVar = c30.c;
                    aVar3 = di.a.m;
                    aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                    ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ox6 ox6VarA8 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                    aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarA8);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        aVar4 = aVar2;
                        bj4VarO.k(aVar4);
                    } else {
                        aVar4 = aVar2;
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    ox6 ox6VarC116 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                    bj4VarO.K(-585752368);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        h37Var2 = h37Var;
                        z4 = false;
                        objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                        bj4VarO.C(objF2);
                    } else {
                        h37Var2 = h37Var;
                        z4 = false;
                    }
                    bj4VarO.U(z4);
                    ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                    ox6 ox6VarC117 = we1.c(ox6VarC116, z4, null, (mh4) objF2, 15);
                    ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                    iHashCode4 = Long.hashCode(bj4VarO.T);
                    kw7VarP4 = bj4VarO.P();
                    ox6VarC4 = it1.c(bj4VarO, ox6VarC117);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar4);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC4);
                    bj4VarO.K(602811226);
                    if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = dropDownQuestionModel2.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    if (answer4 instanceof Answer.SingleAnswer) {
                        placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                    }
                    h37Var3 = h37Var2;
                    mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                    m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                    bj4VarO.U(true);
                    boolean zDropDownQuestion$lambda$8 = DropDownQuestion$lambda$1(h37Var3);
                    ox6 ox6VarC118 = ir9.c(aVar, 0.8f);
                    long jA9 = kk.a(intercomTheme, bj4VarO, i8);
                    b72 b72Var8 = intercomTheme.getShapes(bj4VarO, i8).b;
                    bj4VarO.K(-585710671);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new mh4() { // from class: r83
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    dropDownQuestionModel3 = dropDownQuestionModel2;
                    oh4Var2 = oh4Var;
                    kp.a(zDropDownQuestion$lambda$8, (mh4) objF3, ox6VarC118, 0L, null, null, b72Var8, jA9, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    ci4Var4 = ci4Var3;
                    answer2 = answer4;
                    ox6Var2 = ox6Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i10 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i11 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i6 != 0) {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    bj4VarO.K(1842846242);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    z = false;
                    bj4VarO.U(false);
                    if (DropDownQuestion$lambda$1(h37Var)) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    bj4VarO.K(1842850020);
                    if (z2) {
                        jA = surveyUiColors2.m404getButton0d7_KjU();
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        z = false;
                    }
                    z3 = z2;
                    j = jA;
                    bj4VarO.U(z);
                    if (z3) {
                        jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jD = u7d.d(4285756278L);
                    }
                    j2 = jD;
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    i9 = i3;
                    jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                    uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                    answer4 = answer3;
                    if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                        j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                    } else {
                        j3 = j2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
                    j4 = j3;
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
                    bt1.c.getClass();
                    ox6Var3 = ox6Var2;
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
                    kVar = c30.c;
                    aVar3 = di.a.m;
                    aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                    ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ox6 ox6VarA9 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                    aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarA9);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        aVar4 = aVar2;
                        bj4VarO.k(aVar4);
                    } else {
                        aVar4 = aVar2;
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    ox6 ox6VarC119 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                    bj4VarO.K(-585752368);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        h37Var2 = h37Var;
                        z4 = false;
                        objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                        bj4VarO.C(objF2);
                    } else {
                        h37Var2 = h37Var;
                        z4 = false;
                    }
                    bj4VarO.U(z4);
                    ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                    ox6 ox6VarC1110 = we1.c(ox6VarC119, z4, null, (mh4) objF2, 15);
                    ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                    iHashCode4 = Long.hashCode(bj4VarO.T);
                    kw7VarP4 = bj4VarO.P();
                    ox6VarC4 = it1.c(bj4VarO, ox6VarC1110);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar4);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC4);
                    bj4VarO.K(602811226);
                    if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                        placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = dropDownQuestionModel2.getPlaceholder();
                    }
                    bj4VarO.U(false);
                    if (answer4 instanceof Answer.SingleAnswer) {
                        placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                    }
                    h37Var3 = h37Var2;
                    mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                    m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                    bj4VarO.U(true);
                    boolean zDropDownQuestion$lambda$9 = DropDownQuestion$lambda$1(h37Var3);
                    ox6 ox6VarC1111 = ir9.c(aVar, 0.8f);
                    long jA10 = kk.a(intercomTheme, bj4VarO, i8);
                    b72 b72Var9 = intercomTheme.getShapes(bj4VarO, i8).b;
                    bj4VarO.K(-585710671);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new mh4() { // from class: r83
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    dropDownQuestionModel3 = dropDownQuestionModel2;
                    oh4Var2 = oh4Var;
                    kp.a(zDropDownQuestion$lambda$9, (mh4) objF3, ox6VarC1111, 0L, null, null, b72Var9, jA10, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    ci4Var4 = ci4Var3;
                    answer2 = answer4;
                    ox6Var2 = ox6Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i10 != 0) {
                    ox6Var2 = aVar;
                }
                if (i11 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i6 != 0) {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                bj4VarO.K(1842846242);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                z = false;
                bj4VarO.U(false);
                if (DropDownQuestion$lambda$1(h37Var)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                bj4VarO.K(1842850020);
                if (z2) {
                    jA = surveyUiColors2.m404getButton0d7_KjU();
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    z = false;
                }
                z3 = z2;
                j = jA;
                bj4VarO.U(z);
                if (z3) {
                    jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jD = u7d.d(4285756278L);
                }
                j2 = jD;
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                i9 = i3;
                jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                answer4 = answer3;
                if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                    j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                } else {
                    j3 = j2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
                j4 = j3;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
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
                kVar = c30.c;
                aVar3 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarA10 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarA10);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar4 = aVar2;
                    bj4VarO.k(aVar4);
                } else {
                    aVar4 = aVar2;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                ox6 ox6VarC1112 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                bj4VarO.K(-585752368);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    h37Var2 = h37Var;
                    z4 = false;
                    objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                    bj4VarO.C(objF2);
                } else {
                    h37Var2 = h37Var;
                    z4 = false;
                }
                bj4VarO.U(z4);
                ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                ox6 ox6VarC1113 = we1.c(ox6VarC1112, z4, null, (mh4) objF2, 15);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode4 = Long.hashCode(bj4VarO.T);
                kw7VarP4 = bj4VarO.P();
                ox6VarC4 = it1.c(bj4VarO, ox6VarC1113);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar4);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                bj4VarO.K(602811226);
                if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = dropDownQuestionModel2.getPlaceholder();
                }
                bj4VarO.U(false);
                if (answer4 instanceof Answer.SingleAnswer) {
                    placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                }
                h37Var3 = h37Var2;
                mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                bj4VarO.U(true);
                boolean zDropDownQuestion$lambda$10 = DropDownQuestion$lambda$1(h37Var3);
                ox6 ox6VarC1114 = ir9.c(aVar, 0.8f);
                long jA11 = kk.a(intercomTheme, bj4VarO, i8);
                b72 b72Var10 = intercomTheme.getShapes(bj4VarO, i8).b;
                bj4VarO.K(-585710671);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new mh4() { // from class: r83
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                dropDownQuestionModel3 = dropDownQuestionModel2;
                oh4Var2 = oh4Var;
                kp.a(zDropDownQuestion$lambda$10, (mh4) objF3, ox6VarC1114, 0L, null, null, b72Var10, jA11, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ci4Var4 = ci4Var3;
                answer2 = answer4;
                ox6Var2 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i10 != 0) {
                    ox6Var2 = aVar;
                }
                if (i11 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i6 != 0) {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                bj4VarO.K(1842846242);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                z = false;
                bj4VarO.U(false);
                if (DropDownQuestion$lambda$1(h37Var)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                bj4VarO.K(1842850020);
                if (z2) {
                    jA = surveyUiColors2.m404getButton0d7_KjU();
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    z = false;
                }
                z3 = z2;
                j = jA;
                bj4VarO.U(z);
                if (z3) {
                    jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jD = u7d.d(4285756278L);
                }
                j2 = jD;
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                i9 = i3;
                jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                answer4 = answer3;
                if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                    j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                } else {
                    j3 = j2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
                j4 = j3;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
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
                kVar = c30.c;
                aVar3 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarA11 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarA11);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar4 = aVar2;
                    bj4VarO.k(aVar4);
                } else {
                    aVar4 = aVar2;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                ox6 ox6VarC1115 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                bj4VarO.K(-585752368);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    h37Var2 = h37Var;
                    z4 = false;
                    objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                    bj4VarO.C(objF2);
                } else {
                    h37Var2 = h37Var;
                    z4 = false;
                }
                bj4VarO.U(z4);
                ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                ox6 ox6VarC1116 = we1.c(ox6VarC1115, z4, null, (mh4) objF2, 15);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode4 = Long.hashCode(bj4VarO.T);
                kw7VarP4 = bj4VarO.P();
                ox6VarC4 = it1.c(bj4VarO, ox6VarC1116);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar4);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                bj4VarO.K(602811226);
                if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = dropDownQuestionModel2.getPlaceholder();
                }
                bj4VarO.U(false);
                if (answer4 instanceof Answer.SingleAnswer) {
                    placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                }
                h37Var3 = h37Var2;
                mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                bj4VarO.U(true);
                boolean zDropDownQuestion$lambda$11 = DropDownQuestion$lambda$1(h37Var3);
                ox6 ox6VarC1117 = ir9.c(aVar, 0.8f);
                long jA12 = kk.a(intercomTheme, bj4VarO, i8);
                b72 b72Var11 = intercomTheme.getShapes(bj4VarO, i8).b;
                bj4VarO.K(-585710671);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new mh4() { // from class: r83
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                dropDownQuestionModel3 = dropDownQuestionModel2;
                oh4Var2 = oh4Var;
                kp.a(zDropDownQuestion$lambda$11, (mh4) objF3, ox6VarC1117, 0L, null, null, b72Var11, jA12, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ci4Var4 = ci4Var3;
                answer2 = answer4;
                ox6Var2 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
            }
        }
        i3 |= 24576;
        surveyUiColors2 = surveyUiColors;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i10 != 0) {
                    ox6Var2 = aVar;
                }
                if (i11 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i6 != 0) {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                bj4VarO.K(1842846242);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                z = false;
                bj4VarO.U(false);
                if (DropDownQuestion$lambda$1(h37Var)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                bj4VarO.K(1842850020);
                if (z2) {
                    jA = surveyUiColors2.m404getButton0d7_KjU();
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    z = false;
                }
                z3 = z2;
                j = jA;
                bj4VarO.U(z);
                if (z3) {
                    jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jD = u7d.d(4285756278L);
                }
                j2 = jD;
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                i9 = i3;
                jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                answer4 = answer3;
                if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                    j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                } else {
                    j3 = j2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
                j4 = j3;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
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
                kVar = c30.c;
                aVar3 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarA12 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarA12);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar4 = aVar2;
                    bj4VarO.k(aVar4);
                } else {
                    aVar4 = aVar2;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                ox6 ox6VarC1118 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                bj4VarO.K(-585752368);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    h37Var2 = h37Var;
                    z4 = false;
                    objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                    bj4VarO.C(objF2);
                } else {
                    h37Var2 = h37Var;
                    z4 = false;
                }
                bj4VarO.U(z4);
                ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                ox6 ox6VarC1119 = we1.c(ox6VarC1118, z4, null, (mh4) objF2, 15);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode4 = Long.hashCode(bj4VarO.T);
                kw7VarP4 = bj4VarO.P();
                ox6VarC4 = it1.c(bj4VarO, ox6VarC1119);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar4);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                bj4VarO.K(602811226);
                if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = dropDownQuestionModel2.getPlaceholder();
                }
                bj4VarO.U(false);
                if (answer4 instanceof Answer.SingleAnswer) {
                    placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                }
                h37Var3 = h37Var2;
                mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                bj4VarO.U(true);
                boolean zDropDownQuestion$lambda$12 = DropDownQuestion$lambda$1(h37Var3);
                ox6 ox6VarC11110 = ir9.c(aVar, 0.8f);
                long jA13 = kk.a(intercomTheme, bj4VarO, i8);
                b72 b72Var12 = intercomTheme.getShapes(bj4VarO, i8).b;
                bj4VarO.K(-585710671);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new mh4() { // from class: r83
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                dropDownQuestionModel3 = dropDownQuestionModel2;
                oh4Var2 = oh4Var;
                kp.a(zDropDownQuestion$lambda$12, (mh4) objF3, ox6VarC11110, 0L, null, null, b72Var12, jA13, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ci4Var4 = ci4Var3;
                answer2 = answer4;
                ox6Var2 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i10 != 0) {
                    ox6Var2 = aVar;
                }
                if (i11 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i6 != 0) {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                bj4VarO.K(1842846242);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                z = false;
                bj4VarO.U(false);
                if (DropDownQuestion$lambda$1(h37Var)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                bj4VarO.K(1842850020);
                if (z2) {
                    jA = surveyUiColors2.m404getButton0d7_KjU();
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    z = false;
                }
                z3 = z2;
                j = jA;
                bj4VarO.U(z);
                if (z3) {
                    jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jD = u7d.d(4285756278L);
                }
                j2 = jD;
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                i9 = i3;
                jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
                uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
                answer4 = answer3;
                if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                    j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
                } else {
                    j3 = j2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
                j4 = j3;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
                bt1.c.getClass();
                ox6Var3 = ox6Var2;
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
                kVar = c30.c;
                aVar3 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
                ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarA13 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
                aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarA13);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar4 = aVar2;
                    bj4VarO.k(aVar4);
                } else {
                    aVar4 = aVar2;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                ox6 ox6VarC11111 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
                bj4VarO.K(-585752368);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    h37Var2 = h37Var;
                    z4 = false;
                    objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                    bj4VarO.C(objF2);
                } else {
                    h37Var2 = h37Var;
                    z4 = false;
                }
                bj4VarO.U(z4);
                ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
                ox6 ox6VarC11112 = we1.c(ox6VarC11111, z4, null, (mh4) objF2, 15);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode4 = Long.hashCode(bj4VarO.T);
                kw7VarP4 = bj4VarO.P();
                ox6VarC4 = it1.c(bj4VarO, ox6VarC11112);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar4);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                bj4VarO.K(602811226);
                if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                    placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = dropDownQuestionModel2.getPlaceholder();
                }
                bj4VarO.U(false);
                if (answer4 instanceof Answer.SingleAnswer) {
                    placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
                }
                h37Var3 = h37Var2;
                mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
                m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
                bj4VarO.U(true);
                boolean zDropDownQuestion$lambda$13 = DropDownQuestion$lambda$1(h37Var3);
                ox6 ox6VarC11113 = ir9.c(aVar, 0.8f);
                long jA14 = kk.a(intercomTheme, bj4VarO, i8);
                b72 b72Var13 = intercomTheme.getShapes(bj4VarO, i8).b;
                bj4VarO.K(-585710671);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new mh4() { // from class: r83
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                dropDownQuestionModel3 = dropDownQuestionModel2;
                oh4Var2 = oh4Var;
                kp.a(zDropDownQuestion$lambda$13, (mh4) objF3, ox6VarC11113, 0L, null, null, b72Var13, jA14, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ci4Var4 = ci4Var3;
                answer2 = answer4;
                ox6Var2 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
            }
        }
        i3 |= 196608;
        ci4Var2 = ci4Var;
        if ((74899 & i3) == 74898) {
            aVar = ox6.a.t;
            if (i10 != 0) {
                ox6Var2 = aVar;
            }
            if (i11 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i6 != 0) {
                ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            bj4VarO.K(1842846242);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            z = false;
            bj4VarO.U(false);
            if (DropDownQuestion$lambda$1(h37Var)) {
                z2 = true;
            } else {
                z2 = true;
            }
            bj4VarO.K(1842850020);
            if (z2) {
                jA = surveyUiColors2.m404getButton0d7_KjU();
            } else {
                jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                z = false;
            }
            z3 = z2;
            j = jA;
            bj4VarO.U(z);
            if (z3) {
                jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
            } else {
                jD = u7d.d(4285756278L);
            }
            j2 = jD;
            intercomTheme = IntercomTheme.INSTANCE;
            i8 = IntercomTheme.$stable;
            i9 = i3;
            jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
            uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
            answer4 = answer3;
            if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
            } else {
                j3 = j2;
            }
            d94Var = (d94) bj4VarO.F(qu1.i);
            j4 = j3;
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            ox6Var3 = ox6Var2;
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
            kVar = c30.c;
            aVar3 = di.a.m;
            aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
            ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            ox6 ox6VarA14 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
            aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, ox6VarA14);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                aVar4 = aVar2;
                bj4VarO.k(aVar4);
            } else {
                aVar4 = aVar2;
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            ox6 ox6VarC11114 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
            bj4VarO.K(-585752368);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                h37Var2 = h37Var;
                z4 = false;
                objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                bj4VarO.C(objF2);
            } else {
                h37Var2 = h37Var;
                z4 = false;
            }
            bj4VarO.U(z4);
            ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
            ox6 ox6VarC11115 = we1.c(ox6VarC11114, z4, null, (mh4) objF2, 15);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            iHashCode4 = Long.hashCode(bj4VarO.T);
            kw7VarP4 = bj4VarO.P();
            ox6VarC4 = it1.c(bj4VarO, ox6VarC11115);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar4);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP4);
            l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC4);
            bj4VarO.K(602811226);
            if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = dropDownQuestionModel2.getPlaceholder();
            }
            bj4VarO.U(false);
            if (answer4 instanceof Answer.SingleAnswer) {
                placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
            }
            h37Var3 = h37Var2;
            mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
            m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
            bj4VarO.U(true);
            boolean zDropDownQuestion$lambda$14 = DropDownQuestion$lambda$1(h37Var3);
            ox6 ox6VarC11116 = ir9.c(aVar, 0.8f);
            long jA15 = kk.a(intercomTheme, bj4VarO, i8);
            b72 b72Var14 = intercomTheme.getShapes(bj4VarO, i8).b;
            bj4VarO.K(-585710671);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new mh4() { // from class: r83
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            dropDownQuestionModel3 = dropDownQuestionModel2;
            oh4Var2 = oh4Var;
            kp.a(zDropDownQuestion$lambda$14, (mh4) objF3, ox6VarC11116, 0L, null, null, b72Var14, jA15, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            bj4VarO.U(true);
            bj4VarO.U(true);
            ci4Var4 = ci4Var3;
            answer2 = answer4;
            ox6Var2 = ox6Var3;
        } else {
            aVar = ox6.a.t;
            if (i10 != 0) {
                ox6Var2 = aVar;
            }
            if (i11 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i6 != 0) {
                ci4VarM474getLambda1$intercom_sdk_base_release = ComposableSingletons$DropDownQuestionKt.INSTANCE.m474getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM474getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            bj4VarO.K(1842846242);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            z = false;
            bj4VarO.U(false);
            if (DropDownQuestion$lambda$1(h37Var)) {
                z2 = true;
            } else {
                z2 = true;
            }
            bj4VarO.K(1842850020);
            if (z2) {
                jA = surveyUiColors2.m404getButton0d7_KjU();
            } else {
                jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                z = false;
            }
            z3 = z2;
            j = jA;
            bj4VarO.U(z);
            if (z3) {
                jD = ColorExtensionsKt.m833generateTextColor8_81llA(surveyUiColors2.m404getButton0d7_KjU());
            } else {
                jD = u7d.d(4285756278L);
            }
            j2 = jD;
            intercomTheme = IntercomTheme.INSTANCE;
            i8 = IntercomTheme.$stable;
            i9 = i3;
            jB = uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i8).getText().m824getDefault0d7_KjU());
            uh1VarM406getDropDownSelectedColorQN2ZGVo = surveyUiColors2.m406getDropDownSelectedColorQN2ZGVo();
            answer4 = answer3;
            if (uh1VarM406getDropDownSelectedColorQN2ZGVo != null) {
                j3 = uh1VarM406getDropDownSelectedColorQN2ZGVo.a;
            } else {
                j3 = j2;
            }
            d94Var = (d94) bj4VarO.F(qu1.i);
            j4 = j3;
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
            bt1.c.getClass();
            ox6Var3 = ox6Var2;
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
            kVar = c30.c;
            aVar3 = di.a.m;
            aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
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
            ci4VarM474getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i9 >> 15) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            ox6 ox6VarA15 = uma.a(ns0.a(ir9.c(aVar, 1.0f), 1.0f, jB, intercomTheme.getShapes(bj4VarO, i8).b), intercomTheme.getShapes(bj4VarO, i8).b);
            aj1VarA2 = yi1.a(kVar, aVar3, bj4VarO, 0);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, ox6VarA15);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                aVar4 = aVar2;
                bj4VarO.k(aVar4);
            } else {
                aVar4 = aVar2;
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            ox6 ox6VarC11117 = gi0.c(ir9.c(aVar, 1.0f), j, al8.a);
            bj4VarO.K(-585752368);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                h37Var2 = h37Var;
                z4 = false;
                objF2 = new q83(0 == true ? 1 : 0, h37Var2);
                bj4VarO.C(objF2);
            } else {
                h37Var2 = h37Var;
                z4 = false;
            }
            bj4VarO.U(z4);
            ci4Var3 = ci4VarM474getLambda1$intercom_sdk_base_release;
            ox6 ox6VarC11118 = we1.c(ox6VarC11117, z4, null, (mh4) objF2, 15);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            iHashCode4 = Long.hashCode(bj4VarO.T);
            kw7VarP4 = bj4VarO.P();
            ox6VarC4 = it1.c(bj4VarO, ox6VarC11118);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar4);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP4);
            l02.a(iHashCode4, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC4);
            bj4VarO.K(602811226);
            if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                placeholder = nr1.f(bj4VarO, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = dropDownQuestionModel2.getPlaceholder();
            }
            bj4VarO.U(false);
            if (answer4 instanceof Answer.SingleAnswer) {
                placeholder = ((Answer.SingleAnswer) answer4).getAnswer();
            }
            h37Var3 = h37Var2;
            mia.b(placeholder, ir9.q(eo7.i(aVar, 16.0f)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), j2, 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 131068);
            m65.b(is7.a(R.drawable.intercom_ic_down_arrow, bj4VarO, 0), nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_choose_one), eo7.i(aVar, 16.0f), j4, bj4VarO, 392, 0);
            bj4VarO.U(true);
            boolean zDropDownQuestion$lambda$15 = DropDownQuestion$lambda$1(h37Var3);
            ox6 ox6VarC11119 = ir9.c(aVar, 0.8f);
            long jA16 = kk.a(intercomTheme, bj4VarO, i8);
            b72 b72Var15 = intercomTheme.getShapes(bj4VarO, i8).b;
            bj4VarO.K(-585710671);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new mh4() { // from class: r83
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return DropDownQuestionKt.DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37Var3);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            dropDownQuestionModel3 = dropDownQuestionModel2;
            oh4Var2 = oh4Var;
            kp.a(zDropDownQuestion$lambda$15, (mh4) objF3, ox6VarC11119, 0L, null, null, b72Var15, jA16, 8.0f, gr1.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94Var, dropDownQuestionModel3, oh4Var2, h37Var3), bj4VarO), bj4VarO, 805306800);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            bj4VarO.U(true);
            bj4VarO.U(true);
            ci4Var4 = ci4Var3;
            answer2 = answer4;
            ox6Var2 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new f52(ox6Var2, dropDownQuestionModel3, answer2, oh4Var2, surveyUiColors, ci4Var4, i, i2);
        }
    }

    private static final boolean DropDownQuestion$lambda$1(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(h37 h37Var) {
        DropDownQuestion$lambda$2(h37Var, true);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(h37 h37Var) {
        DropDownQuestion$lambda$2(h37Var, false);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DropDownQuestion$lambda$11(ox6 ox6Var, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, oh4 oh4Var, SurveyUiColors surveyUiColors, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        DropDownQuestion(ox6Var, dropDownQuestionModel2, answer, oh4Var, surveyUiColors, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DropDownQuestion$lambda$2(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    public static final void DropDownQuestionPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(281876673);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m475getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: n83
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DropDownQuestionKt.DropDownQuestionPreview$lambda$12(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DropDownQuestionPreview$lambda$12(int i, jt1 jt1Var, int i2) {
        DropDownQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void DropDownSelectedQuestionPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-891294020);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m476getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: o83
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DropDownQuestionKt.DropDownSelectedQuestionPreview$lambda$13(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DropDownSelectedQuestionPreview$lambda$13(int i, jt1 jt1Var, int i2) {
        DropDownSelectedQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
