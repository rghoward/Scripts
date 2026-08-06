package io.intercom.android.sdk.survey.ui.questiontype.choice;

import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d94;
import defpackage.di;
import defpackage.dv0;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.i2;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw7;
import defpackage.l02;
import defpackage.lg1;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.ux1;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z12;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleChoiceQuestionKt {
    /* JADX WARN: Code duplicated, block: B:100:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01df  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:113:0x020f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0212  */
    /* JADX WARN: Code duplicated, block: B:117:0x023b  */
    /* JADX WARN: Code duplicated, block: B:118:0x023e  */
    /* JADX WARN: Code duplicated, block: B:121:0x024d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0252  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:146:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:148:0x0304  */
    /* JADX WARN: Code duplicated, block: B:151:0x0313  */
    /* JADX WARN: Code duplicated, block: B:152:0x0315  */
    /* JADX WARN: Code duplicated, block: B:155:0x031c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0321  */
    /* JADX WARN: Code duplicated, block: B:162:0x0338  */
    /* JADX WARN: Code duplicated, block: B:163:0x033a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0343  */
    /* JADX WARN: Code duplicated, block: B:172:0x0376  */
    /* JADX WARN: Code duplicated, block: B:174:0x0389  */
    /* JADX WARN: Code duplicated, block: B:176:0x038d  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x014e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0179  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:96:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void SingleChoiceQuestion(ox6 ox6Var, final SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, final oh4<? super Answer, g2b> oh4Var, final SurveyUiColors surveyUiColors, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
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
        ci4<? super jt1, ? super Integer, g2b> ci4VarM472getLambda1$intercom_sdk_base_release;
        final d94 d94Var;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        ox6 ox6Var3;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        Object objF;
        jt1.a.C0187a c0187a;
        h37 h37Var;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        jt1.a.C0187a c0187a2;
        ox6 ox6VarC2;
        int i10;
        Iterator it;
        final h37 h37Var2;
        final oh4<? super Answer, g2b> oh4Var2;
        jt1.a.C0187a c0187a3;
        bj4 bj4Var;
        int i11;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        final Answer answer4;
        boolean zBooleanValue;
        long jA;
        float f;
        ob4 ob4Var;
        String answer5;
        int i12;
        boolean z;
        Object objF2;
        jt1.a.C0187a c0187a4;
        boolean z2;
        Object objF3;
        boolean z3;
        long jA2;
        ob4 ob4Var2;
        int i13;
        boolean z4;
        boolean zJ;
        Object objF4;
        jt1.a.C0187a c0187a5;
        final h37 h37Var3;
        ob4 ob4Var3;
        xj8 xj8VarW;
        singleChoiceQuestionModel.getClass();
        oh4Var.getClass();
        surveyUiColors.getClass();
        bj4 bj4VarO = jt1Var.o(-538592394);
        j1b j1bVar = bj4VarO.a;
        int i14 = i2 & 1;
        if (i14 != 0) {
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
                i3 |= bj4VarO.j(singleChoiceQuestionModel) ? 32 : 16;
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
                        if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                            aVar = ox6.a.t;
                            if (i14 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            if (i8 != 0) {
                                ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                            }
                            d94Var = (d94) bj4VarO.F(qu1.i);
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
                            ox6Var3 = ox6Var2;
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
                            bj4VarO.K(924114601);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                objF = bl7.i(Boolean.FALSE);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            h37Var = (h37) objF;
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode2 = Long.hashCode(bj4VarO.T);
                            kw7VarP2 = bj4VarO.P();
                            c0187a2 = c0187a;
                            ox6VarC2 = it1.c(bj4VarO, aVar);
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            i10 = i3;
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar2);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, cVar, aj1VarA);
                            rd7.d(bj4VarO, eVar, kw7VarP2);
                            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                            rd7.d(bj4VarO, dVar, ox6VarC2);
                            ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                            bj4VarO.K(891864023);
                            it = singleChoiceQuestionModel.getOptions().iterator();
                            while (it.hasNext()) {
                                final String str = (String) it.next();
                                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                                if ((answer3 instanceof Answer.SingleAnswer) || !xj5.a(((Answer.SingleAnswer) answer3).getAnswer(), str)) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                bj4VarO.K(891870283);
                                if (z3) {
                                    jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                                } else {
                                    jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                }
                                long j = jA2;
                                bj4VarO.U(false);
                                long jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                                if (z3) {
                                    ob4Var2 = ob4.B;
                                } else {
                                    ob4Var2 = ob4.y;
                                }
                                Iterator it2 = it;
                                long jB2 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j));
                                String translatedOption = getTranslatedOption(str, bj4VarO, 0);
                                bj4VarO.K(-201412627);
                                boolean zJ2 = bj4VarO.j(d94Var);
                                i13 = i10;
                                if ((i13 & 7168) == 2048) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                zJ = zJ2 | z4 | bj4VarO.J(str);
                                objF4 = bj4VarO.f();
                                if (zJ) {
                                    c0187a5 = c0187a2;
                                } else {
                                    c0187a5 = c0187a2;
                                    if (objF4 != c0187a5) {
                                        ob4 ob4Var4 = ob4Var2;
                                        h37Var3 = h37Var;
                                        ob4Var3 = ob4Var4;
                                    }
                                    bj4VarO.U(false);
                                    bj4 bj4Var2 = bj4VarO;
                                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption, jB, 1.0f, j, ob4Var3, jB2, bj4Var2, 24576, 0);
                                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                    h37Var = h37Var3;
                                    d94Var = d94Var;
                                    i10 = i13;
                                    bj4VarO = bj4Var2;
                                    it = it2;
                                    c0187a2 = c0187a5;
                                }
                                ob4 ob4Var5 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var5;
                                objF4 = new oh4() { // from class: vp9
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str, (String) obj);
                                    }
                                };
                                bj4VarO.C(objF4);
                                bj4VarO.U(false);
                                bj4 bj4Var3 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption, jB, 1.0f, j, ob4Var3, jB2, bj4Var3, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var3;
                                it = it2;
                                c0187a2 = c0187a5;
                            }
                            h37Var2 = h37Var;
                            oh4Var2 = oh4Var;
                            c0187a3 = c0187a2;
                            bj4Var = bj4VarO;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var4 = ci4VarM472getLambda1$intercom_sdk_base_release;
                            i11 = i10;
                            bj4Var.U(false);
                            bj4Var.K(891905967);
                            if (singleChoiceQuestionModel.getIncludeOther()) {
                                b47.b(bj4Var, ir9.d(aVar, 8.0f));
                                zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                                bj4Var.K(891911979);
                                if (zBooleanValue) {
                                    jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                                } else {
                                    jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                                }
                                long j2 = jA;
                                bj4Var.U(false);
                                long jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j2);
                                if (zBooleanValue) {
                                    f = 2.0f;
                                } else {
                                    f = 1.0f;
                                }
                                float f2 = f;
                                if (zBooleanValue) {
                                    ob4Var = ob4.B;
                                } else {
                                    ob4Var = ob4.y;
                                }
                                ob4 ob4Var6 = ob4Var;
                                if (answer3 instanceof Answer.SingleAnswer) {
                                    answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                                } else {
                                    answer5 = BuildConfig.FLAVOR;
                                }
                                String str2 = answer5;
                                bj4Var.K(891929777);
                                i12 = i11 & 7168;
                                if (i12 == 2048) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                objF2 = bj4Var.f();
                                if (z) {
                                    c0187a4 = c0187a3;
                                } else {
                                    c0187a4 = c0187a3;
                                    if (objF2 == c0187a4) {
                                    }
                                    mh4 mh4Var = (mh4) objF2;
                                    bj4Var.U(false);
                                    bj4Var.K(891936368);
                                    if (i12 == 2048) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    objF3 = bj4Var.f();
                                    if (z2 || objF3 == c0187a4) {
                                        objF3 = new i2(2, oh4Var2);
                                        bj4Var.C(objF3);
                                    }
                                    bj4Var.U(false);
                                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str2, mh4Var, (oh4) objF3, jM834getAccessibleBorderColor8_81llA, f2, j2, ob4Var6, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                    bj4Var = bj4Var;
                                }
                                objF2 = new mh4() { // from class: wp9
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                    }
                                };
                                bj4Var.C(objF2);
                                mh4 mh4Var2 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str2, mh4Var2, (oh4) objF3, jM834getAccessibleBorderColor8_81llA, f2, j2, ob4Var6, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            }
                            bj4Var.U(false);
                            bj4Var.U(true);
                            bj4Var.U(true);
                            ci4Var3 = ci4Var4;
                            answer4 = answer3;
                        } else {
                            bj4VarO.u();
                            bj4Var = bj4VarO;
                            oh4Var2 = oh4Var;
                            ox6Var3 = ox6Var2;
                            answer4 = answer2;
                            ci4Var3 = ci4Var2;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            final oh4<? super Answer, g2b> oh4Var3 = oh4Var2;
                            final ox6 ox6Var4 = ox6Var3;
                            xj8VarW.d = new ci4() { // from class: xp9
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var4, singleChoiceQuestionModel, answer4, oh4Var3, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    ci4Var2 = ci4Var;
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str3 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j3 = jA2;
                            bj4VarO.U(false);
                            long jB3 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it3 = it;
                            long jB4 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j3));
                            String translatedOption2 = getTranslatedOption(str3, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ3 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ3 | z4 | bj4VarO.J(str3);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var7 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var7;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var4 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption2, jB3, 1.0f, j3, ob4Var3, jB4, bj4Var4, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var4;
                                it = it3;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var8 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var8;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str3, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var5 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption2, jB3, 1.0f, j3, ob4Var3, jB4, bj4Var5, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var5;
                            it = it3;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var5 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j4 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j4);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f3 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var9 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str4 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var3 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str4, mh4Var3, (oh4) objF3, jM834getAccessibleBorderColor8_81llA2, f3, j4, ob4Var9, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var4 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str4, mh4Var4, (oh4) objF3, jM834getAccessibleBorderColor8_81llA2, f3, j4, ob4Var9, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var5;
                        answer4 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str5 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j5 = jA2;
                            bj4VarO.U(false);
                            long jB5 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it4 = it;
                            long jB6 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j5));
                            String translatedOption3 = getTranslatedOption(str5, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ4 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ4 | z4 | bj4VarO.J(str5);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var10 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var10;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var6 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption3, jB5, 1.0f, j5, ob4Var3, jB6, bj4Var6, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var6;
                                it = it4;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var11 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var11;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str5, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var7 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption3, jB5, 1.0f, j5, ob4Var3, jB6, bj4Var7, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var7;
                            it = it4;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var6 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j6 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA3 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j6);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f4 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var12 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str6 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var5 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str6, mh4Var5, (oh4) objF3, jM834getAccessibleBorderColor8_81llA3, f4, j6, ob4Var12, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var6 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str6, mh4Var6, (oh4) objF3, jM834getAccessibleBorderColor8_81llA3, f4, j6, ob4Var12, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var6;
                        answer4 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var4 = oh4Var2;
                        final ox6 ox6Var5 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: xp9
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var5, singleChoiceQuestionModel, answer4, oh4Var4, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
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
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str7 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j7 = jA2;
                            bj4VarO.U(false);
                            long jB7 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it5 = it;
                            long jB8 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j7));
                            String translatedOption4 = getTranslatedOption(str7, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ5 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ5 | z4 | bj4VarO.J(str7);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var13 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var13;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var8 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption4, jB7, 1.0f, j7, ob4Var3, jB8, bj4Var8, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var8;
                                it = it5;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var14 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var14;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str7, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var9 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption4, jB7, 1.0f, j7, ob4Var3, jB8, bj4Var9, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var9;
                            it = it5;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var7 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j8 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA4 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j8);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f5 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var15 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str8 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var7 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str8, mh4Var7, (oh4) objF3, jM834getAccessibleBorderColor8_81llA4, f5, j8, ob4Var15, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var8 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str8, mh4Var8, (oh4) objF3, jM834getAccessibleBorderColor8_81llA4, f5, j8, ob4Var15, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var7;
                        answer4 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str9 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j9 = jA2;
                            bj4VarO.U(false);
                            long jB9 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it6 = it;
                            long jB10 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j9));
                            String translatedOption5 = getTranslatedOption(str9, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ6 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ6 | z4 | bj4VarO.J(str9);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var16 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var16;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var10 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption5, jB9, 1.0f, j9, ob4Var3, jB10, bj4Var10, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var10;
                                it = it6;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var17 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var17;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str9, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var11 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption5, jB9, 1.0f, j9, ob4Var3, jB10, bj4Var11, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var11;
                            it = it6;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var8 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j10 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA5 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j10);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f6 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var18 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str10 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var9 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str10, mh4Var9, (oh4) objF3, jM834getAccessibleBorderColor8_81llA5, f6, j10, ob4Var18, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var10 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str10, mh4Var10, (oh4) objF3, jM834getAccessibleBorderColor8_81llA5, f6, j10, ob4Var18, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var8;
                        answer4 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var5 = oh4Var2;
                        final ox6 ox6Var6 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: xp9
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var6, singleChoiceQuestionModel, answer4, oh4Var5, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str11 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j11 = jA2;
                        bj4VarO.U(false);
                        long jB11 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it7 = it;
                        long jB12 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j11));
                        String translatedOption6 = getTranslatedOption(str11, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ7 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ7 | z4 | bj4VarO.J(str11);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var19 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var19;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var12 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption6, jB11, 1.0f, j11, ob4Var3, jB12, bj4Var12, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var12;
                            it = it7;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var110 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var110;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str11, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var13 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption6, jB11, 1.0f, j11, ob4Var3, jB12, bj4Var13, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var13;
                        it = it7;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var9 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j12 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA6 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j12);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f7 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var111 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str12 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var11 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str12, mh4Var11, (oh4) objF3, jM834getAccessibleBorderColor8_81llA6, f7, j12, ob4Var111, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var12 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str12, mh4Var12, (oh4) objF3, jM834getAccessibleBorderColor8_81llA6, f7, j12, ob4Var111, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var9;
                    answer4 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str13 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j13 = jA2;
                        bj4VarO.U(false);
                        long jB13 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it8 = it;
                        long jB14 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j13));
                        String translatedOption7 = getTranslatedOption(str13, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ8 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ8 | z4 | bj4VarO.J(str13);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var112 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var112;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var14 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption7, jB13, 1.0f, j13, ob4Var3, jB14, bj4Var14, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var14;
                            it = it8;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var113 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var113;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str13, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var15 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption7, jB13, 1.0f, j13, ob4Var3, jB14, bj4Var15, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var15;
                        it = it8;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var10 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j14 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA7 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j14);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f8 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var114 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str14 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var13 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str14, mh4Var13, (oh4) objF3, jM834getAccessibleBorderColor8_81llA7, f8, j14, ob4Var114, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var14 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str14, mh4Var14, (oh4) objF3, jM834getAccessibleBorderColor8_81llA7, f8, j14, ob4Var114, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var10;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var6 = oh4Var2;
                    final ox6 ox6Var7 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: xp9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var7, singleChoiceQuestionModel, answer4, oh4Var6, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
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
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str15 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j15 = jA2;
                            bj4VarO.U(false);
                            long jB15 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it9 = it;
                            long jB16 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j15));
                            String translatedOption8 = getTranslatedOption(str15, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ9 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ9 | z4 | bj4VarO.J(str15);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var115 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var115;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var16 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption8, jB15, 1.0f, j15, ob4Var3, jB16, bj4Var16, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var16;
                                it = it9;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var116 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var116;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str15, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var17 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption8, jB15, 1.0f, j15, ob4Var3, jB16, bj4Var17, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var17;
                            it = it9;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var11 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j16 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA8 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j16);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f9 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var117 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str16 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var15 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str16, mh4Var15, (oh4) objF3, jM834getAccessibleBorderColor8_81llA8, f9, j16, ob4Var117, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var16 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str16, mh4Var16, (oh4) objF3, jM834getAccessibleBorderColor8_81llA8, f9, j16, ob4Var117, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var11;
                        answer4 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str17 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j17 = jA2;
                            bj4VarO.U(false);
                            long jB17 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it10 = it;
                            long jB18 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j17));
                            String translatedOption9 = getTranslatedOption(str17, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ10 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ10 | z4 | bj4VarO.J(str17);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var118 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var118;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var18 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption9, jB17, 1.0f, j17, ob4Var3, jB18, bj4Var18, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var18;
                                it = it10;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var119 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var119;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str17, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var19 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption9, jB17, 1.0f, j17, ob4Var3, jB18, bj4Var19, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var19;
                            it = it10;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var12 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j18 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA9 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j18);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f10 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var1110 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str18 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var17 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str18, mh4Var17, (oh4) objF3, jM834getAccessibleBorderColor8_81llA9, f10, j18, ob4Var1110, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var18 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str18, mh4Var18, (oh4) objF3, jM834getAccessibleBorderColor8_81llA9, f10, j18, ob4Var1110, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var12;
                        answer4 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var7 = oh4Var2;
                        final ox6 ox6Var8 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: xp9
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var8, singleChoiceQuestionModel, answer4, oh4Var7, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str19 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j19 = jA2;
                        bj4VarO.U(false);
                        long jB19 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it11 = it;
                        long jB110 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j19));
                        String translatedOption10 = getTranslatedOption(str19, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ11 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ11 | z4 | bj4VarO.J(str19);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var1111 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var1111;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var110 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption10, jB19, 1.0f, j19, ob4Var3, jB110, bj4Var110, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var110;
                            it = it11;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var1112 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var1112;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str19, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var111 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption10, jB19, 1.0f, j19, ob4Var3, jB110, bj4Var111, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var111;
                        it = it11;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var13 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j110 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA10 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j110);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f11 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var1113 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str110 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var19 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str110, mh4Var19, (oh4) objF3, jM834getAccessibleBorderColor8_81llA10, f11, j110, ob4Var1113, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var110 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str110, mh4Var110, (oh4) objF3, jM834getAccessibleBorderColor8_81llA10, f11, j110, ob4Var1113, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var13;
                    answer4 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str111 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j111 = jA2;
                        bj4VarO.U(false);
                        long jB111 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it12 = it;
                        long jB112 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j111));
                        String translatedOption11 = getTranslatedOption(str111, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ12 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ12 | z4 | bj4VarO.J(str111);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var1114 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var1114;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var112 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption11, jB111, 1.0f, j111, ob4Var3, jB112, bj4Var112, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var112;
                            it = it12;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var1115 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var1115;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str111, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var113 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption11, jB111, 1.0f, j111, ob4Var3, jB112, bj4Var113, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var113;
                        it = it12;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var14 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j112 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA11 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j112);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f12 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var1116 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str112 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var111 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str112, mh4Var111, (oh4) objF3, jM834getAccessibleBorderColor8_81llA11, f12, j112, ob4Var1116, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var112 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str112, mh4Var112, (oh4) objF3, jM834getAccessibleBorderColor8_81llA11, f12, j112, ob4Var1116, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var14;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var8 = oh4Var2;
                    final ox6 ox6Var9 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: xp9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var9, singleChoiceQuestionModel, answer4, oh4Var8, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
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
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str113 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j113 = jA2;
                        bj4VarO.U(false);
                        long jB113 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it13 = it;
                        long jB114 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j113));
                        String translatedOption12 = getTranslatedOption(str113, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ13 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ13 | z4 | bj4VarO.J(str113);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var1117 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var1117;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var114 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption12, jB113, 1.0f, j113, ob4Var3, jB114, bj4Var114, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var114;
                            it = it13;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var1118 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var1118;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str113, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var115 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption12, jB113, 1.0f, j113, ob4Var3, jB114, bj4Var115, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var115;
                        it = it13;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var15 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j114 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA12 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j114);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f13 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var1119 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str114 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var113 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str114, mh4Var113, (oh4) objF3, jM834getAccessibleBorderColor8_81llA12, f13, j114, ob4Var1119, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var114 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str114, mh4Var114, (oh4) objF3, jM834getAccessibleBorderColor8_81llA12, f13, j114, ob4Var1119, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var15;
                    answer4 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str115 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j115 = jA2;
                        bj4VarO.U(false);
                        long jB115 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it14 = it;
                        long jB116 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j115));
                        String translatedOption13 = getTranslatedOption(str115, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ14 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ14 | z4 | bj4VarO.J(str115);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var11110 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var11110;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var116 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption13, jB115, 1.0f, j115, ob4Var3, jB116, bj4Var116, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var116;
                            it = it14;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var11111 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var11111;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str115, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var117 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption13, jB115, 1.0f, j115, ob4Var3, jB116, bj4Var117, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var117;
                        it = it14;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var16 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j116 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA13 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j116);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f14 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var11112 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str116 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var115 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str116, mh4Var115, (oh4) objF3, jM834getAccessibleBorderColor8_81llA13, f14, j116, ob4Var11112, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var116 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str116, mh4Var116, (oh4) objF3, jM834getAccessibleBorderColor8_81llA13, f14, j116, ob4Var11112, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var16;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var9 = oh4Var2;
                    final ox6 ox6Var10 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: xp9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var10, singleChoiceQuestionModel, answer4, oh4Var9, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str117 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j117 = jA2;
                    bj4VarO.U(false);
                    long jB117 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it15 = it;
                    long jB118 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j117));
                    String translatedOption14 = getTranslatedOption(str117, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ15 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ15 | z4 | bj4VarO.J(str117);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var11113 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var11113;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var118 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption14, jB117, 1.0f, j117, ob4Var3, jB118, bj4Var118, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var118;
                        it = it15;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var11114 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var11114;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str117, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var119 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption14, jB117, 1.0f, j117, ob4Var3, jB118, bj4Var119, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var119;
                    it = it15;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var17 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j118 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA14 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j118);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f15 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var11115 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str118 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var117 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str118, mh4Var117, (oh4) objF3, jM834getAccessibleBorderColor8_81llA14, f15, j118, ob4Var11115, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var118 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str118, mh4Var118, (oh4) objF3, jM834getAccessibleBorderColor8_81llA14, f15, j118, ob4Var11115, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var17;
                answer4 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str119 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j119 = jA2;
                    bj4VarO.U(false);
                    long jB119 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it16 = it;
                    long jB1110 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j119));
                    String translatedOption15 = getTranslatedOption(str119, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ16 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ16 | z4 | bj4VarO.J(str119);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var11116 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var11116;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var1110 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption15, jB119, 1.0f, j119, ob4Var3, jB1110, bj4Var1110, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var1110;
                        it = it16;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var11117 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var11117;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str119, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var1111 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption15, jB119, 1.0f, j119, ob4Var3, jB1110, bj4Var1111, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var1111;
                    it = it16;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var18 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j1110 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA15 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j1110);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f16 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var11118 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str1110 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var119 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1110, mh4Var119, (oh4) objF3, jM834getAccessibleBorderColor8_81llA15, f16, j1110, ob4Var11118, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var1110 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1110, mh4Var1110, (oh4) objF3, jM834getAccessibleBorderColor8_81llA15, f16, j1110, ob4Var11118, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var18;
                answer4 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var10 = oh4Var2;
                final ox6 ox6Var11 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: xp9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var11, singleChoiceQuestionModel, answer4, oh4Var10, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
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
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str1111 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j1111 = jA2;
                            bj4VarO.U(false);
                            long jB1111 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it17 = it;
                            long jB1112 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j1111));
                            String translatedOption16 = getTranslatedOption(str1111, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ17 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ17 | z4 | bj4VarO.J(str1111);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var11119 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var11119;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var1112 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption16, jB1111, 1.0f, j1111, ob4Var3, jB1112, bj4Var1112, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var1112;
                                it = it17;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var111110 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var111110;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str1111, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var1113 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption16, jB1111, 1.0f, j1111, ob4Var3, jB1112, bj4Var1113, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var1113;
                            it = it17;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var19 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j1112 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA16 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j1112);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f17 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var111111 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str1112 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var1111 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1112, mh4Var1111, (oh4) objF3, jM834getAccessibleBorderColor8_81llA16, f17, j1112, ob4Var111111, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var1112 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1112, mh4Var1112, (oh4) objF3, jM834getAccessibleBorderColor8_81llA16, f17, j1112, ob4Var111111, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var19;
                        answer4 = answer3;
                    } else {
                        aVar = ox6.a.t;
                        if (i14 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                        }
                        d94Var = (d94) bj4VarO.F(qu1.i);
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
                        ox6Var3 = ox6Var2;
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
                        bj4VarO.K(924114601);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            objF = bl7.i(Boolean.FALSE);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) objF;
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        c0187a2 = c0187a;
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i10 = i3;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                        bj4VarO.K(891864023);
                        it = singleChoiceQuestionModel.getOptions().iterator();
                        while (it.hasNext()) {
                            final String str1113 = (String) it.next();
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            if (answer3 instanceof Answer.SingleAnswer) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            bj4VarO.K(891870283);
                            if (z3) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            long j1113 = jA2;
                            bj4VarO.U(false);
                            long jB1113 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            if (z3) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            Iterator it18 = it;
                            long jB1114 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j1113));
                            String translatedOption17 = getTranslatedOption(str1113, bj4VarO, 0);
                            bj4VarO.K(-201412627);
                            boolean zJ18 = bj4VarO.j(d94Var);
                            i13 = i10;
                            if ((i13 & 7168) == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zJ = zJ18 | z4 | bj4VarO.J(str1113);
                            objF4 = bj4VarO.f();
                            if (zJ) {
                                c0187a5 = c0187a2;
                                if (objF4 != c0187a5) {
                                    ob4 ob4Var111112 = ob4Var2;
                                    h37Var3 = h37Var;
                                    ob4Var3 = ob4Var111112;
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var1114 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption17, jB1113, 1.0f, j1113, ob4Var3, jB1114, bj4Var1114, 24576, 0);
                                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                                h37Var = h37Var3;
                                d94Var = d94Var;
                                i10 = i13;
                                bj4VarO = bj4Var1114;
                                it = it18;
                                c0187a2 = c0187a5;
                            } else {
                                c0187a5 = c0187a2;
                            }
                            ob4 ob4Var111113 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var111113;
                            objF4 = new oh4() { // from class: vp9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str1113, (String) obj);
                                }
                            };
                            bj4VarO.C(objF4);
                            bj4VarO.U(false);
                            bj4 bj4Var1115 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption17, jB1113, 1.0f, j1113, ob4Var3, jB1114, bj4Var1115, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var1115;
                            it = it18;
                            c0187a2 = c0187a5;
                        }
                        h37Var2 = h37Var;
                        oh4Var2 = oh4Var;
                        c0187a3 = c0187a2;
                        bj4Var = bj4VarO;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var110 = ci4VarM472getLambda1$intercom_sdk_base_release;
                        i11 = i10;
                        bj4Var.U(false);
                        bj4Var.K(891905967);
                        if (singleChoiceQuestionModel.getIncludeOther()) {
                            b47.b(bj4Var, ir9.d(aVar, 8.0f));
                            zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                            bj4Var.K(891911979);
                            if (zBooleanValue) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            long j1114 = jA;
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA17 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j1114);
                            if (zBooleanValue) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            float f18 = f;
                            if (zBooleanValue) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            ob4 ob4Var111114 = ob4Var;
                            if (answer3 instanceof Answer.SingleAnswer) {
                                answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                            } else {
                                answer5 = BuildConfig.FLAVOR;
                            }
                            String str1114 = answer5;
                            bj4Var.K(891929777);
                            i12 = i11 & 7168;
                            if (i12 == 2048) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objF2 = bj4Var.f();
                            if (z) {
                                c0187a4 = c0187a3;
                                if (objF2 == c0187a4) {
                                }
                                mh4 mh4Var1113 = (mh4) objF2;
                                bj4Var.U(false);
                                bj4Var.K(891936368);
                                if (i12 == 2048) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objF3 = bj4Var.f();
                                if (z2) {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                } else {
                                    objF3 = new i2(2, oh4Var2);
                                    bj4Var.C(objF3);
                                }
                                bj4Var.U(false);
                                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1114, mh4Var1113, (oh4) objF3, jM834getAccessibleBorderColor8_81llA17, f18, j1114, ob4Var111114, 0L, bj4Var, (i11 >> 9) & 112, 512);
                                bj4Var = bj4Var;
                            } else {
                                c0187a4 = c0187a3;
                            }
                            objF2 = new mh4() { // from class: wp9
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                                }
                            };
                            bj4Var.C(objF2);
                            mh4 mh4Var1114 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1114, mh4Var1114, (oh4) objF3, jM834getAccessibleBorderColor8_81llA17, f18, j1114, ob4Var111114, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ci4Var3 = ci4Var110;
                        answer4 = answer3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4 oh4Var11 = oh4Var2;
                        final ox6 ox6Var12 = ox6Var3;
                        xj8VarW.d = new ci4() { // from class: xp9
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var12, singleChoiceQuestionModel, answer4, oh4Var11, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str1115 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j1115 = jA2;
                        bj4VarO.U(false);
                        long jB1115 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it19 = it;
                        long jB1116 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j1115));
                        String translatedOption18 = getTranslatedOption(str1115, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ19 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ19 | z4 | bj4VarO.J(str1115);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var111115 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var111115;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var1116 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption18, jB1115, 1.0f, j1115, ob4Var3, jB1116, bj4Var1116, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var1116;
                            it = it19;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var111116 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var111116;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str1115, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var1117 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption18, jB1115, 1.0f, j1115, ob4Var3, jB1116, bj4Var1117, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var1117;
                        it = it19;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j1116 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA18 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j1116);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f19 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var111117 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str1116 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var1115 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1116, mh4Var1115, (oh4) objF3, jM834getAccessibleBorderColor8_81llA18, f19, j1116, ob4Var111117, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var1116 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1116, mh4Var1116, (oh4) objF3, jM834getAccessibleBorderColor8_81llA18, f19, j1116, ob4Var111117, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var111;
                    answer4 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str1117 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j1117 = jA2;
                        bj4VarO.U(false);
                        long jB1117 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it110 = it;
                        long jB1118 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j1117));
                        String translatedOption19 = getTranslatedOption(str1117, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ110 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ110 | z4 | bj4VarO.J(str1117);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var111118 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var111118;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var1118 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption19, jB1117, 1.0f, j1117, ob4Var3, jB1118, bj4Var1118, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var1118;
                            it = it110;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var111119 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var111119;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str1117, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var1119 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption19, jB1117, 1.0f, j1117, ob4Var3, jB1118, bj4Var1119, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var1119;
                        it = it110;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var112 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j1118 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA19 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j1118);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f110 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var1111110 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str1118 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var1117 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1118, mh4Var1117, (oh4) objF3, jM834getAccessibleBorderColor8_81llA19, f110, j1118, ob4Var1111110, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var1118 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1118, mh4Var1118, (oh4) objF3, jM834getAccessibleBorderColor8_81llA19, f110, j1118, ob4Var1111110, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var112;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var12 = oh4Var2;
                    final ox6 ox6Var13 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: xp9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var13, singleChoiceQuestionModel, answer4, oh4Var12, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
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
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str1119 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j1119 = jA2;
                        bj4VarO.U(false);
                        long jB1119 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it111 = it;
                        long jB11110 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j1119));
                        String translatedOption110 = getTranslatedOption(str1119, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ111 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ111 | z4 | bj4VarO.J(str1119);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var1111111 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var1111111;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var11110 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption110, jB1119, 1.0f, j1119, ob4Var3, jB11110, bj4Var11110, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var11110;
                            it = it111;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var1111112 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var1111112;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str1119, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var11111 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption110, jB1119, 1.0f, j1119, ob4Var3, jB11110, bj4Var11111, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var11111;
                        it = it111;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var113 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j11110 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA110 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j11110);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f111 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var1111113 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str11110 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var1119 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11110, mh4Var1119, (oh4) objF3, jM834getAccessibleBorderColor8_81llA110, f111, j11110, ob4Var1111113, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var11110 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11110, mh4Var11110, (oh4) objF3, jM834getAccessibleBorderColor8_81llA110, f111, j11110, ob4Var1111113, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var113;
                    answer4 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str11111 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j11111 = jA2;
                        bj4VarO.U(false);
                        long jB11111 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it112 = it;
                        long jB11112 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j11111));
                        String translatedOption111 = getTranslatedOption(str11111, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ112 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ112 | z4 | bj4VarO.J(str11111);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var1111114 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var1111114;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var11112 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption111, jB11111, 1.0f, j11111, ob4Var3, jB11112, bj4Var11112, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var11112;
                            it = it112;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var1111115 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var1111115;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str11111, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var11113 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption111, jB11111, 1.0f, j11111, ob4Var3, jB11112, bj4Var11113, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var11113;
                        it = it112;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var114 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j11112 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA111 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j11112);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f112 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var1111116 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str11112 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var11111 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11112, mh4Var11111, (oh4) objF3, jM834getAccessibleBorderColor8_81llA111, f112, j11112, ob4Var1111116, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var11112 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11112, mh4Var11112, (oh4) objF3, jM834getAccessibleBorderColor8_81llA111, f112, j11112, ob4Var1111116, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var114;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var13 = oh4Var2;
                    final ox6 ox6Var14 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: xp9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var14, singleChoiceQuestionModel, answer4, oh4Var13, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str11113 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j11113 = jA2;
                    bj4VarO.U(false);
                    long jB11113 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it113 = it;
                    long jB11114 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j11113));
                    String translatedOption112 = getTranslatedOption(str11113, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ113 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ113 | z4 | bj4VarO.J(str11113);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var1111117 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var1111117;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11114 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption112, jB11113, 1.0f, j11113, ob4Var3, jB11114, bj4Var11114, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var11114;
                        it = it113;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var1111118 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var1111118;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str11113, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var11115 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption112, jB11113, 1.0f, j11113, ob4Var3, jB11114, bj4Var11115, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var11115;
                    it = it113;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var115 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j11114 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA112 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j11114);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f113 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var1111119 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str11114 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var11113 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11114, mh4Var11113, (oh4) objF3, jM834getAccessibleBorderColor8_81llA112, f113, j11114, ob4Var1111119, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var11114 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11114, mh4Var11114, (oh4) objF3, jM834getAccessibleBorderColor8_81llA112, f113, j11114, ob4Var1111119, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var115;
                answer4 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str11115 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j11115 = jA2;
                    bj4VarO.U(false);
                    long jB11115 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it114 = it;
                    long jB11116 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j11115));
                    String translatedOption113 = getTranslatedOption(str11115, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ114 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ114 | z4 | bj4VarO.J(str11115);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var11111110 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var11111110;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11116 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption113, jB11115, 1.0f, j11115, ob4Var3, jB11116, bj4Var11116, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var11116;
                        it = it114;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var11111111 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var11111111;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str11115, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var11117 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption113, jB11115, 1.0f, j11115, ob4Var3, jB11116, bj4Var11117, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var11117;
                    it = it114;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var116 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j11116 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA113 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j11116);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f114 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var11111112 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str11116 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var11115 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11116, mh4Var11115, (oh4) objF3, jM834getAccessibleBorderColor8_81llA113, f114, j11116, ob4Var11111112, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var11116 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11116, mh4Var11116, (oh4) objF3, jM834getAccessibleBorderColor8_81llA113, f114, j11116, ob4Var11111112, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var116;
                answer4 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var14 = oh4Var2;
                final ox6 ox6Var15 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: xp9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var15, singleChoiceQuestionModel, answer4, oh4Var14, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
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
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str11117 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j11117 = jA2;
                        bj4VarO.U(false);
                        long jB11117 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it115 = it;
                        long jB11118 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j11117));
                        String translatedOption114 = getTranslatedOption(str11117, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ115 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ115 | z4 | bj4VarO.J(str11117);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var11111113 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var11111113;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var11118 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption114, jB11117, 1.0f, j11117, ob4Var3, jB11118, bj4Var11118, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var11118;
                            it = it115;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var11111114 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var11111114;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str11117, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var11119 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption114, jB11117, 1.0f, j11117, ob4Var3, jB11118, bj4Var11119, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var11119;
                        it = it115;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var117 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j11118 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA114 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j11118);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f115 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var11111115 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str11118 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var11117 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11118, mh4Var11117, (oh4) objF3, jM834getAccessibleBorderColor8_81llA114, f115, j11118, ob4Var11111115, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var11118 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str11118, mh4Var11118, (oh4) objF3, jM834getAccessibleBorderColor8_81llA114, f115, j11118, ob4Var11111115, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var117;
                    answer4 = answer3;
                } else {
                    aVar = ox6.a.t;
                    if (i14 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                    }
                    d94Var = (d94) bj4VarO.F(qu1.i);
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
                    ox6Var3 = ox6Var2;
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
                    bj4VarO.K(924114601);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) objF;
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    c0187a2 = c0187a;
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i10 = i3;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                    bj4VarO.K(891864023);
                    it = singleChoiceQuestionModel.getOptions().iterator();
                    while (it.hasNext()) {
                        final String str11119 = (String) it.next();
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        if (answer3 instanceof Answer.SingleAnswer) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        bj4VarO.K(891870283);
                        if (z3) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        long j11119 = jA2;
                        bj4VarO.U(false);
                        long jB11119 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        if (z3) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        Iterator it116 = it;
                        long jB111110 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j11119));
                        String translatedOption115 = getTranslatedOption(str11119, bj4VarO, 0);
                        bj4VarO.K(-201412627);
                        boolean zJ116 = bj4VarO.j(d94Var);
                        i13 = i10;
                        if ((i13 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zJ = zJ116 | z4 | bj4VarO.J(str11119);
                        objF4 = bj4VarO.f();
                        if (zJ) {
                            c0187a5 = c0187a2;
                            if (objF4 != c0187a5) {
                                ob4 ob4Var11111116 = ob4Var2;
                                h37Var3 = h37Var;
                                ob4Var3 = ob4Var11111116;
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var111110 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption115, jB11119, 1.0f, j11119, ob4Var3, jB111110, bj4Var111110, 24576, 0);
                            ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                            h37Var = h37Var3;
                            d94Var = d94Var;
                            i10 = i13;
                            bj4VarO = bj4Var111110;
                            it = it116;
                            c0187a2 = c0187a5;
                        } else {
                            c0187a5 = c0187a2;
                        }
                        ob4 ob4Var11111117 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var11111117;
                        objF4 = new oh4() { // from class: vp9
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str11119, (String) obj);
                            }
                        };
                        bj4VarO.C(objF4);
                        bj4VarO.U(false);
                        bj4 bj4Var111111 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption115, jB11119, 1.0f, j11119, ob4Var3, jB111110, bj4Var111111, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var111111;
                        it = it116;
                        c0187a2 = c0187a5;
                    }
                    h37Var2 = h37Var;
                    oh4Var2 = oh4Var;
                    c0187a3 = c0187a2;
                    bj4Var = bj4VarO;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var118 = ci4VarM472getLambda1$intercom_sdk_base_release;
                    i11 = i10;
                    bj4Var.U(false);
                    bj4Var.K(891905967);
                    if (singleChoiceQuestionModel.getIncludeOther()) {
                        b47.b(bj4Var, ir9.d(aVar, 8.0f));
                        zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                        bj4Var.K(891911979);
                        if (zBooleanValue) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        long j111110 = jA;
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA115 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j111110);
                        if (zBooleanValue) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        float f116 = f;
                        if (zBooleanValue) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        ob4 ob4Var11111118 = ob4Var;
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer5 = BuildConfig.FLAVOR;
                        }
                        String str111110 = answer5;
                        bj4Var.K(891929777);
                        i12 = i11 & 7168;
                        if (i12 == 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objF2 = bj4Var.f();
                        if (z) {
                            c0187a4 = c0187a3;
                            if (objF2 == c0187a4) {
                            }
                            mh4 mh4Var11119 = (mh4) objF2;
                            bj4Var.U(false);
                            bj4Var.K(891936368);
                            if (i12 == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF3 = bj4Var.f();
                            if (z2) {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            } else {
                                objF3 = new i2(2, oh4Var2);
                                bj4Var.C(objF3);
                            }
                            bj4Var.U(false);
                            OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111110, mh4Var11119, (oh4) objF3, jM834getAccessibleBorderColor8_81llA115, f116, j111110, ob4Var11111118, 0L, bj4Var, (i11 >> 9) & 112, 512);
                            bj4Var = bj4Var;
                        } else {
                            c0187a4 = c0187a3;
                        }
                        objF2 = new mh4() { // from class: wp9
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                            }
                        };
                        bj4Var.C(objF2);
                        mh4 mh4Var111110 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111110, mh4Var111110, (oh4) objF3, jM834getAccessibleBorderColor8_81llA115, f116, j111110, ob4Var11111118, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ci4Var3 = ci4Var118;
                    answer4 = answer3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var15 = oh4Var2;
                    final ox6 ox6Var16 = ox6Var3;
                    xj8VarW.d = new ci4() { // from class: xp9
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var16, singleChoiceQuestionModel, answer4, oh4Var15, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str111111 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j111111 = jA2;
                    bj4VarO.U(false);
                    long jB111111 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it117 = it;
                    long jB111112 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j111111));
                    String translatedOption116 = getTranslatedOption(str111111, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ117 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ117 | z4 | bj4VarO.J(str111111);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var11111119 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var11111119;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var111112 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption116, jB111111, 1.0f, j111111, ob4Var3, jB111112, bj4Var111112, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var111112;
                        it = it117;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var111111110 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var111111110;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str111111, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var111113 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption116, jB111111, 1.0f, j111111, ob4Var3, jB111112, bj4Var111113, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var111113;
                    it = it117;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var119 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j111112 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA116 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j111112);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f117 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var111111111 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str111112 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var111111 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111112, mh4Var111111, (oh4) objF3, jM834getAccessibleBorderColor8_81llA116, f117, j111112, ob4Var111111111, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var111112 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111112, mh4Var111112, (oh4) objF3, jM834getAccessibleBorderColor8_81llA116, f117, j111112, ob4Var111111111, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var119;
                answer4 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str111113 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j111113 = jA2;
                    bj4VarO.U(false);
                    long jB111113 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it118 = it;
                    long jB111114 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j111113));
                    String translatedOption117 = getTranslatedOption(str111113, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ118 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ118 | z4 | bj4VarO.J(str111113);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var111111112 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var111111112;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var111114 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption117, jB111113, 1.0f, j111113, ob4Var3, jB111114, bj4Var111114, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var111114;
                        it = it118;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var111111113 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var111111113;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str111113, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var111115 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption117, jB111113, 1.0f, j111113, ob4Var3, jB111114, bj4Var111115, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var111115;
                    it = it118;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1110 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j111114 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA117 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j111114);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f118 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var111111114 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str111114 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var111113 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111114, mh4Var111113, (oh4) objF3, jM834getAccessibleBorderColor8_81llA117, f118, j111114, ob4Var111111114, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var111114 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111114, mh4Var111114, (oh4) objF3, jM834getAccessibleBorderColor8_81llA117, f118, j111114, ob4Var111111114, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var1110;
                answer4 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var16 = oh4Var2;
                final ox6 ox6Var17 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: xp9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var17, singleChoiceQuestionModel, answer4, oh4Var16, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
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
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str111115 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j111115 = jA2;
                    bj4VarO.U(false);
                    long jB111115 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it119 = it;
                    long jB111116 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j111115));
                    String translatedOption118 = getTranslatedOption(str111115, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ119 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ119 | z4 | bj4VarO.J(str111115);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var111111115 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var111111115;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var111116 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption118, jB111115, 1.0f, j111115, ob4Var3, jB111116, bj4Var111116, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var111116;
                        it = it119;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var111111116 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var111111116;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str111115, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var111117 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption118, jB111115, 1.0f, j111115, ob4Var3, jB111116, bj4Var111117, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var111117;
                    it = it119;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j111116 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA118 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j111116);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f119 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var111111117 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str111116 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var111115 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111116, mh4Var111115, (oh4) objF3, jM834getAccessibleBorderColor8_81llA118, f119, j111116, ob4Var111111117, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var111116 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111116, mh4Var111116, (oh4) objF3, jM834getAccessibleBorderColor8_81llA118, f119, j111116, ob4Var111111117, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var1111;
                answer4 = answer3;
            } else {
                aVar = ox6.a.t;
                if (i14 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
                }
                d94Var = (d94) bj4VarO.F(qu1.i);
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
                ox6Var3 = ox6Var2;
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
                bj4VarO.K(924114601);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) objF;
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                c0187a2 = c0187a;
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i10 = i3;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
                bj4VarO.K(891864023);
                it = singleChoiceQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    final String str111117 = (String) it.next();
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    if (answer3 instanceof Answer.SingleAnswer) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bj4VarO.K(891870283);
                    if (z3) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    long j111117 = jA2;
                    bj4VarO.U(false);
                    long jB111117 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    if (z3) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    Iterator it1110 = it;
                    long jB111118 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j111117));
                    String translatedOption119 = getTranslatedOption(str111117, bj4VarO, 0);
                    bj4VarO.K(-201412627);
                    boolean zJ1110 = bj4VarO.j(d94Var);
                    i13 = i10;
                    if ((i13 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zJ = zJ1110 | z4 | bj4VarO.J(str111117);
                    objF4 = bj4VarO.f();
                    if (zJ) {
                        c0187a5 = c0187a2;
                        if (objF4 != c0187a5) {
                            ob4 ob4Var111111118 = ob4Var2;
                            h37Var3 = h37Var;
                            ob4Var3 = ob4Var111111118;
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var111118 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption119, jB111117, 1.0f, j111117, ob4Var3, jB111118, bj4Var111118, 24576, 0);
                        ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                        h37Var = h37Var3;
                        d94Var = d94Var;
                        i10 = i13;
                        bj4VarO = bj4Var111118;
                        it = it1110;
                        c0187a2 = c0187a5;
                    } else {
                        c0187a5 = c0187a2;
                    }
                    ob4 ob4Var111111119 = ob4Var2;
                    h37Var3 = h37Var;
                    ob4Var3 = ob4Var111111119;
                    objF4 = new oh4() { // from class: vp9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str111117, (String) obj);
                        }
                    };
                    bj4VarO.C(objF4);
                    bj4VarO.U(false);
                    bj4 bj4Var111119 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption119, jB111117, 1.0f, j111117, ob4Var3, jB111118, bj4Var111119, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var111119;
                    it = it1110;
                    c0187a2 = c0187a5;
                }
                h37Var2 = h37Var;
                oh4Var2 = oh4Var;
                c0187a3 = c0187a2;
                bj4Var = bj4VarO;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1112 = ci4VarM472getLambda1$intercom_sdk_base_release;
                i11 = i10;
                bj4Var.U(false);
                bj4Var.K(891905967);
                if (singleChoiceQuestionModel.getIncludeOther()) {
                    b47.b(bj4Var, ir9.d(aVar, 8.0f));
                    zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                    bj4Var.K(891911979);
                    if (zBooleanValue) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    long j111118 = jA;
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA119 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j111118);
                    if (zBooleanValue) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    float f1110 = f;
                    if (zBooleanValue) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    ob4 ob4Var1111111110 = ob4Var;
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer5 = BuildConfig.FLAVOR;
                    }
                    String str111118 = answer5;
                    bj4Var.K(891929777);
                    i12 = i11 & 7168;
                    if (i12 == 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF2 = bj4Var.f();
                    if (z) {
                        c0187a4 = c0187a3;
                        if (objF2 == c0187a4) {
                        }
                        mh4 mh4Var111117 = (mh4) objF2;
                        bj4Var.U(false);
                        bj4Var.K(891936368);
                        if (i12 == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF3 = bj4Var.f();
                        if (z2) {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        } else {
                            objF3 = new i2(2, oh4Var2);
                            bj4Var.C(objF3);
                        }
                        bj4Var.U(false);
                        OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111118, mh4Var111117, (oh4) objF3, jM834getAccessibleBorderColor8_81llA119, f1110, j111118, ob4Var1111111110, 0L, bj4Var, (i11 >> 9) & 112, 512);
                        bj4Var = bj4Var;
                    } else {
                        c0187a4 = c0187a3;
                    }
                    objF2 = new mh4() { // from class: wp9
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                        }
                    };
                    bj4Var.C(objF2);
                    mh4 mh4Var111118 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str111118, mh4Var111118, (oh4) objF3, jM834getAccessibleBorderColor8_81llA119, f1110, j111118, ob4Var1111111110, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ci4Var3 = ci4Var1112;
                answer4 = answer3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var17 = oh4Var2;
                final ox6 ox6Var18 = ox6Var3;
                xj8VarW.d = new ci4() { // from class: xp9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var18, singleChoiceQuestionModel, answer4, oh4Var17, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ci4Var2 = ci4Var;
        if ((74899 & i3) == 74898) {
            aVar = ox6.a.t;
            if (i14 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            d94Var = (d94) bj4VarO.F(qu1.i);
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
            ox6Var3 = ox6Var2;
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
            bj4VarO.K(924114601);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) objF;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            c0187a2 = c0187a;
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            i10 = i3;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
            bj4VarO.K(891864023);
            it = singleChoiceQuestionModel.getOptions().iterator();
            while (it.hasNext()) {
                final String str111119 = (String) it.next();
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                if (answer3 instanceof Answer.SingleAnswer) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                bj4VarO.K(891870283);
                if (z3) {
                    jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                } else {
                    jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                }
                long j111119 = jA2;
                bj4VarO.U(false);
                long jB111119 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                if (z3) {
                    ob4Var2 = ob4.B;
                } else {
                    ob4Var2 = ob4.y;
                }
                Iterator it1111 = it;
                long jB1111110 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j111119));
                String translatedOption1110 = getTranslatedOption(str111119, bj4VarO, 0);
                bj4VarO.K(-201412627);
                boolean zJ1111 = bj4VarO.j(d94Var);
                i13 = i10;
                if ((i13 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = zJ1111 | z4 | bj4VarO.J(str111119);
                objF4 = bj4VarO.f();
                if (zJ) {
                    c0187a5 = c0187a2;
                    if (objF4 != c0187a5) {
                        ob4 ob4Var1111111111 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var1111111111;
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var1111110 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption1110, jB111119, 1.0f, j111119, ob4Var3, jB1111110, bj4Var1111110, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var1111110;
                    it = it1111;
                    c0187a2 = c0187a5;
                } else {
                    c0187a5 = c0187a2;
                }
                ob4 ob4Var1111111112 = ob4Var2;
                h37Var3 = h37Var;
                ob4Var3 = ob4Var1111111112;
                objF4 = new oh4() { // from class: vp9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str111119, (String) obj);
                    }
                };
                bj4VarO.C(objF4);
                bj4VarO.U(false);
                bj4 bj4Var1111111 = bj4VarO;
                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption1110, jB111119, 1.0f, j111119, ob4Var3, jB1111110, bj4Var1111111, 24576, 0);
                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                h37Var = h37Var3;
                d94Var = d94Var;
                i10 = i13;
                bj4VarO = bj4Var1111111;
                it = it1111;
                c0187a2 = c0187a5;
            }
            h37Var2 = h37Var;
            oh4Var2 = oh4Var;
            c0187a3 = c0187a2;
            bj4Var = bj4VarO;
            ci4<? super jt1, ? super Integer, g2b> ci4Var1113 = ci4VarM472getLambda1$intercom_sdk_base_release;
            i11 = i10;
            bj4Var.U(false);
            bj4Var.K(891905967);
            if (singleChoiceQuestionModel.getIncludeOther()) {
                b47.b(bj4Var, ir9.d(aVar, 8.0f));
                zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                bj4Var.K(891911979);
                if (zBooleanValue) {
                    jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                }
                long j1111110 = jA;
                bj4Var.U(false);
                long jM834getAccessibleBorderColor8_81llA1110 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j1111110);
                if (zBooleanValue) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                float f1111 = f;
                if (zBooleanValue) {
                    ob4Var = ob4.B;
                } else {
                    ob4Var = ob4.y;
                }
                ob4 ob4Var1111111113 = ob4Var;
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                String str1111110 = answer5;
                bj4Var.K(891929777);
                i12 = i11 & 7168;
                if (i12 == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4Var.f();
                if (z) {
                    c0187a4 = c0187a3;
                    if (objF2 == c0187a4) {
                    }
                    mh4 mh4Var111119 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1111110, mh4Var111119, (oh4) objF3, jM834getAccessibleBorderColor8_81llA1110, f1111, j1111110, ob4Var1111111113, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                } else {
                    c0187a4 = c0187a3;
                }
                objF2 = new mh4() { // from class: wp9
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                    }
                };
                bj4Var.C(objF2);
                mh4 mh4Var1111110 = (mh4) objF2;
                bj4Var.U(false);
                bj4Var.K(891936368);
                if (i12 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF3 = bj4Var.f();
                if (z2) {
                    objF3 = new i2(2, oh4Var2);
                    bj4Var.C(objF3);
                } else {
                    objF3 = new i2(2, oh4Var2);
                    bj4Var.C(objF3);
                }
                bj4Var.U(false);
                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1111110, mh4Var1111110, (oh4) objF3, jM834getAccessibleBorderColor8_81llA1110, f1111, j1111110, ob4Var1111111113, 0L, bj4Var, (i11 >> 9) & 112, 512);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.U(true);
            ci4Var3 = ci4Var1113;
            answer4 = answer3;
        } else {
            aVar = ox6.a.t;
            if (i14 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM472getLambda1$intercom_sdk_base_release = ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m472getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM472getLambda1$intercom_sdk_base_release = ci4Var2;
            }
            d94Var = (d94) bj4VarO.F(qu1.i);
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
            ox6Var3 = ox6Var2;
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
            bj4VarO.K(924114601);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) objF;
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            c0187a2 = c0187a;
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            i10 = i3;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM472getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i10 >> 15) & 14));
            bj4VarO.K(891864023);
            it = singleChoiceQuestionModel.getOptions().iterator();
            while (it.hasNext()) {
                final String str1111111 = (String) it.next();
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                if (answer3 instanceof Answer.SingleAnswer) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                bj4VarO.K(891870283);
                if (z3) {
                    jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                } else {
                    jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                }
                long j1111111 = jA2;
                bj4VarO.U(false);
                long jB1111111 = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                if (z3) {
                    ob4Var2 = ob4.B;
                } else {
                    ob4Var2 = ob4.y;
                }
                Iterator it1112 = it;
                long jB1111112 = uh1.b(DatePickerQuestionKt.contentAlpha(z3, bj4VarO, 0), ColorExtensionsKt.m833generateTextColor8_81llA(j1111111));
                String translatedOption1111 = getTranslatedOption(str1111111, bj4VarO, 0);
                bj4VarO.K(-201412627);
                boolean zJ1112 = bj4VarO.j(d94Var);
                i13 = i10;
                if ((i13 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = zJ1112 | z4 | bj4VarO.J(str1111111);
                objF4 = bj4VarO.f();
                if (zJ) {
                    c0187a5 = c0187a2;
                    if (objF4 != c0187a5) {
                        ob4 ob4Var1111111114 = ob4Var2;
                        h37Var3 = h37Var;
                        ob4Var3 = ob4Var1111111114;
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var1111112 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption1111, jB1111111, 1.0f, j1111111, ob4Var3, jB1111112, bj4Var1111112, 24576, 0);
                    ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                    h37Var = h37Var3;
                    d94Var = d94Var;
                    i10 = i13;
                    bj4VarO = bj4Var1111112;
                    it = it1112;
                    c0187a2 = c0187a5;
                } else {
                    c0187a5 = c0187a2;
                }
                ob4 ob4Var1111111115 = ob4Var2;
                h37Var3 = h37Var;
                ob4Var3 = ob4Var1111111115;
                objF4 = new oh4() { // from class: vp9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94Var, h37Var3, oh4Var, str1111111, (String) obj);
                    }
                };
                bj4VarO.C(objF4);
                bj4VarO.U(false);
                bj4 bj4Var1111113 = bj4VarO;
                ChoicePillKt.m465ChoicePillUdaoDFU(z3, (oh4) objF4, translatedOption1111, jB1111111, 1.0f, j1111111, ob4Var3, jB1111112, bj4Var1111113, 24576, 0);
                ci4VarM472getLambda1$intercom_sdk_base_release = ci4VarM472getLambda1$intercom_sdk_base_release;
                h37Var = h37Var3;
                d94Var = d94Var;
                i10 = i13;
                bj4VarO = bj4Var1111113;
                it = it1112;
                c0187a2 = c0187a5;
            }
            h37Var2 = h37Var;
            oh4Var2 = oh4Var;
            c0187a3 = c0187a2;
            bj4Var = bj4VarO;
            ci4<? super jt1, ? super Integer, g2b> ci4Var1114 = ci4VarM472getLambda1$intercom_sdk_base_release;
            i11 = i10;
            bj4Var.U(false);
            bj4Var.K(891905967);
            if (singleChoiceQuestionModel.getIncludeOther()) {
                b47.b(bj4Var, ir9.d(aVar, 8.0f));
                zBooleanValue = ((Boolean) h37Var2.getValue()).booleanValue();
                bj4Var.K(891911979);
                if (zBooleanValue) {
                    jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                }
                long j1111112 = jA;
                bj4Var.U(false);
                long jM834getAccessibleBorderColor8_81llA1111 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j1111112);
                if (zBooleanValue) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                float f1112 = f;
                if (zBooleanValue) {
                    ob4Var = ob4.B;
                } else {
                    ob4Var = ob4.y;
                }
                ob4 ob4Var1111111116 = ob4Var;
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer5 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer5 = BuildConfig.FLAVOR;
                }
                String str1111112 = answer5;
                bj4Var.K(891929777);
                i12 = i11 & 7168;
                if (i12 == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objF2 = bj4Var.f();
                if (z) {
                    c0187a4 = c0187a3;
                    if (objF2 == c0187a4) {
                    }
                    mh4 mh4Var1111111 = (mh4) objF2;
                    bj4Var.U(false);
                    bj4Var.K(891936368);
                    if (i12 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF3 = bj4Var.f();
                    if (z2) {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    } else {
                        objF3 = new i2(2, oh4Var2);
                        bj4Var.C(objF3);
                    }
                    bj4Var.U(false);
                    OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1111112, mh4Var1111111, (oh4) objF3, jM834getAccessibleBorderColor8_81llA1111, f1112, j1111112, ob4Var1111111116, 0L, bj4Var, (i11 >> 9) & 112, 512);
                    bj4Var = bj4Var;
                } else {
                    c0187a4 = c0187a3;
                }
                objF2 = new mh4() { // from class: wp9
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4Var2, h37Var2);
                    }
                };
                bj4Var.C(objF2);
                mh4 mh4Var1111112 = (mh4) objF2;
                bj4Var.U(false);
                bj4Var.K(891936368);
                if (i12 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objF3 = bj4Var.f();
                if (z2) {
                    objF3 = new i2(2, oh4Var2);
                    bj4Var.C(objF3);
                } else {
                    objF3 = new i2(2, oh4Var2);
                    bj4Var.C(objF3);
                }
                bj4Var.U(false);
                OtherOptionKt.m473OtherOptionYCJL08c(zBooleanValue, surveyUiColors, str1111112, mh4Var1111112, (oh4) objF3, jM834getAccessibleBorderColor8_81llA1111, f1112, j1111112, ob4Var1111111116, 0L, bj4Var, (i11 >> 9) & 112, 512);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.U(true);
            ci4Var3 = ci4Var1114;
            answer4 = answer3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final oh4 oh4Var18 = oh4Var2;
            final ox6 ox6Var19 = ox6Var3;
            xj8VarW.d = new ci4() { // from class: xp9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$10(ox6Var19, singleChoiceQuestionModel, answer4, oh4Var18, surveyUiColors, ci4Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleChoiceQuestion$lambda$10(ox6 ox6Var, SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, oh4 oh4Var, SurveyUiColors surveyUiColors, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        SingleChoiceQuestion(ox6Var, singleChoiceQuestionModel, answer, oh4Var, surveyUiColors, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleChoiceQuestion$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1(d94 d94Var, h37 h37Var, oh4 oh4Var, String str, String str2) {
        str2.getClass();
        d94Var.w(false);
        h37Var.setValue(Boolean.FALSE);
        oh4Var.invoke(new Answer.SingleAnswer(str));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b SingleChoiceQuestion$lambda$9$lambda$8$lambda$5$lambda$4(oh4 oh4Var, h37 h37Var) {
        oh4Var.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        h37Var.setValue(Boolean.valueOf(!((Boolean) h37Var.getValue()).booleanValue()));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleChoiceQuestion$lambda$9$lambda$8$lambda$7$lambda$6(oh4 oh4Var, String str) {
        str.getClass();
        oh4Var.invoke(new Answer.SingleAnswer(str));
        return g2b.a;
    }

    public static final void SingleChoiceQuestionPreview(final SurveyUiColors surveyUiColors, jt1 jt1Var, final int i) {
        int i2;
        surveyUiColors.getClass();
        bj4 bj4VarO = jt1Var.o(1547860655);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(surveyUiColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(1452787289, new AnonymousClass1(surveyUiColors), bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: up9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SingleChoiceQuestionKt.SingleChoiceQuestionPreview$lambda$13(surveyUiColors, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleChoiceQuestionPreview$lambda$13(SurveyUiColors surveyUiColors, int i, jt1 jt1Var, int i2) {
        SingleChoiceQuestionPreview(surveyUiColors, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SingleChoiceQuestionPreviewDark(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(567326043);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            SingleChoiceQuestionPreview(SurveyUiColors.m396copyqa9m3tE$default(ux1.a(null, null, 3, null), 0L, 0L, uh1.h, 0L, null, 27, null), bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new z12(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleChoiceQuestionPreviewDark$lambda$12(int i, jt1 jt1Var, int i2) {
        SingleChoiceQuestionPreviewDark(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SingleChoiceQuestionPreviewLight(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1626655857);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            SingleChoiceQuestionPreview(ux1.a(null, null, 3, null), bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lg1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleChoiceQuestionPreviewLight$lambda$11(int i, jt1 jt1Var, int i2) {
        SingleChoiceQuestionPreviewLight(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final String getTranslatedOption(String str, jt1 jt1Var, int i) {
        jt1Var.K(-1189227411);
        if (xj5.a(str, "true")) {
            jt1Var.K(-1210053781);
            str = nr1.f(jt1Var, R.string.intercom_attribute_collector_positive);
            jt1Var.B();
        } else if (xj5.a(str, "false")) {
            jt1Var.K(-1210051125);
            str = nr1.f(jt1Var, R.string.intercom_attribute_collector_negative);
            jt1Var.B();
        } else {
            jt1Var.K(-1210048618);
            jt1Var.B();
        }
        jt1Var.B();
        return str;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ SurveyUiColors $surveyUiColors;

        public AnonymousClass1(SurveyUiColors surveyUiColors) {
            this.$surveyUiColors = surveyUiColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(Answer answer) {
            answer.getClass();
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            String string = UUID.randomUUID().toString();
            string.getClass();
            SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel = new SurveyData.Step.Question.SingleChoiceQuestionModel(string, ws0.h(new Block.Builder().withText("Question title")), true, ws0.i("Option 1", "Option 2", "Option 3", "Option 4"), false);
            Answer.SingleAnswer singleAnswer = new Answer.SingleAnswer("Option 2");
            jt1Var.K(126566529);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new d();
                jt1Var.C(objF);
            }
            jt1Var.B();
            SingleChoiceQuestionKt.SingleChoiceQuestion(null, singleChoiceQuestionModel, singleAnswer, (oh4) objF, this.$surveyUiColors, null, jt1Var, 3072, 33);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
