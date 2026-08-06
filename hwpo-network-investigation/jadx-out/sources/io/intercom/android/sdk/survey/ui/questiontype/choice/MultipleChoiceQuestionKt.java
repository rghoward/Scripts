package io.intercom.android.sdk.survey.ui.questiontype.choice;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kk2;
import defpackage.kw7;
import defpackage.l02;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ob4;
import defpackage.of3;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u17;
import defpackage.u30;
import defpackage.uh1;
import defpackage.ux1;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MultipleChoiceQuestionKt {
    /* JADX WARN: Code duplicated, block: B:100:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01da  */
    /* JADX WARN: Code duplicated, block: B:111:0x01de  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x020f  */
    /* JADX WARN: Code duplicated, block: B:130:0x025d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0261  */
    /* JADX WARN: Code duplicated, block: B:135:0x0272  */
    /* JADX WARN: Code duplicated, block: B:138:0x0282  */
    /* JADX WARN: Code duplicated, block: B:139:0x028b  */
    /* JADX WARN: Code duplicated, block: B:142:0x029c  */
    /* JADX WARN: Code duplicated, block: B:143:0x029e  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02df  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0300  */
    /* JADX WARN: Code duplicated, block: B:172:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x030a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0336  */
    /* JADX WARN: Code duplicated, block: B:178:0x0347  */
    /* JADX WARN: Code duplicated, block: B:182:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:186:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:188:0x0242 A[EDGE_INSN: B:188:0x0242->B:128:0x0242 BREAK  A[LOOP:0: B:95:0x0185->B:127:0x0219], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:86:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0150  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0191  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18 */
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
    public static final void MultipleChoiceQuestion(ox6 ox6Var, final SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, final oh4<? super Answer, g2b> oh4Var, final SurveyUiColors surveyUiColors, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        int i4;
        Answer answer2;
        int i5;
        int i6;
        SurveyUiColors surveyUiColors2;
        int i7;
        int i8;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        int i9;
        ox6.a aVar;
        final Answer answer3;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM470getLambda1$intercom_sdk_base_release;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        ox6 ox6Var3;
        bt1.a.d dVar;
        aj1 aj1VarA;
        int i10;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        int i11;
        Iterator<T> it;
        boolean zHasNext;
        Object obj;
        int i12;
        ox6.a aVar3;
        bj4 bj4Var;
        ?? r1;
        bj4 bj4Var2;
        bj4 bj4Var3;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        final ox6 ox6Var4;
        final Answer answer4;
        boolean z;
        final boolean z2;
        long jA;
        float f;
        ob4 ob4Var;
        String string;
        int i13;
        boolean z3;
        int i14;
        boolean z4;
        boolean z5;
        Object objF;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objF2;
        final String str;
        boolean zContains;
        long jA2;
        float f2;
        ob4 ob4Var2;
        int i15;
        boolean z9;
        boolean z10;
        boolean zJ;
        Object objF3;
        bj4 bj4Var4;
        xj8 xj8VarW;
        multipleChoiceQuestionModel.getClass();
        oh4Var.getClass();
        surveyUiColors.getClass();
        bj4 bj4VarO = jt1Var.o(928787358);
        j1b j1bVar = bj4VarO.a;
        int i16 = i2 & 1;
        if (i16 != 0) {
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
                i3 |= bj4VarO.j(multipleChoiceQuestionModel) ? 32 : 16;
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
                        surveyUiColors2 = surveyUiColors;
                        if (bj4VarO.J(surveyUiColors2)) {
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
                            if (i16 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                            } else {
                                answer3 = answer2;
                            }
                            if (i8 != 0) {
                                ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                            } else {
                                ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                            ox6Var3 = ox6Var2;
                            dVar = bt1.a.d;
                            rd7.d(bj4VarO, dVar, ox6VarC);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            i10 = i3;
                            iHashCode2 = Long.hashCode(bj4VarO.T);
                            kw7VarP2 = bj4VarO.P();
                            ox6VarC2 = it1.c(bj4VarO, aVar);
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            i11 = i10;
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar2);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, cVar, aj1VarA);
                            rd7.d(bj4VarO, eVar, kw7VarP2);
                            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                            rd7.d(bj4VarO, dVar, ox6VarC2);
                            ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                            bj4VarO.K(1187769307);
                            it = multipleChoiceQuestionModel.getOptions().iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                obj = jt1.a.a;
                                if (!zHasNext) {
                                    break;
                                }
                                str = (String) it.next();
                                if (answer3 instanceof Answer.MultipleAnswer) {
                                    zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                                } else {
                                    zContains = false;
                                }
                                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                                bj4VarO.K(1187778355);
                                if (zContains) {
                                    jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                                } else {
                                    jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                }
                                bj4VarO.U(false);
                                ox6.a aVar4 = aVar;
                                long jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                                if (zContains) {
                                    f2 = 2.0f;
                                } else {
                                    f2 = 1.0f;
                                }
                                if (zContains) {
                                    ob4Var2 = ob4.B;
                                } else {
                                    ob4Var2 = ob4.y;
                                }
                                bj4VarO.K(-1655251130);
                                i15 = i11;
                                if ((i15 & 896) == 256) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if ((i15 & 7168) == 2048) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                zJ = z9 | z10 | bj4VarO.J(str);
                                objF3 = bj4VarO.f();
                                if (zJ || objF3 == obj) {
                                    objF3 = new oh4() { // from class: p17
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj2) {
                                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                        }
                                    };
                                    bj4VarO.C(objF3);
                                }
                                bj4VarO.U(false);
                                bj4 bj4Var5 = bj4VarO;
                                ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA, f2, jA2, ob4Var2, 0L, bj4Var5, 0, 128);
                                surveyUiColors2 = surveyUiColors;
                                ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                                aVar = aVar4;
                                i11 = i15;
                                bj4VarO = bj4Var5;
                            }
                            i12 = i11;
                            ci4<? super jt1, ? super Integer, g2b> ci4Var4 = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar3 = aVar;
                            bj4Var = bj4VarO;
                            bj4Var.U(false);
                            bj4Var.K(1187812082);
                            if (multipleChoiceQuestionModel.getIncludeOther()) {
                                z = answer3 instanceof Answer.MultipleAnswer;
                                if (z || xj5.a(((Answer.MultipleAnswer) answer3).getOtherAnswer(), Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                                bj4Var.K(1187840506);
                                if (z2) {
                                    jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                                } else {
                                    jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                                }
                                bj4Var.U(false);
                                long jM834getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                                if (z2) {
                                    f = 2.0f;
                                } else {
                                    f = 1.0f;
                                }
                                if (z2) {
                                    ob4Var = ob4.B;
                                } else {
                                    ob4Var = ob4.y;
                                }
                                if (z) {
                                    string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                                } else {
                                    string = BuildConfig.FLAVOR;
                                }
                                bj4Var.K(1187859908);
                                boolean zC = bj4Var.c(z2);
                                i13 = i12 & 896;
                                if (i13 == 256) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                boolean z11 = zC | z3;
                                i14 = i12 & 7168;
                                if (i14 == 2048) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z5 = z11 | z4;
                                objF = bj4Var.f();
                                if (z5 || objF == obj) {
                                    objF = new mh4() { // from class: q17
                                        @Override // defpackage.mh4
                                        public final Object invoke() {
                                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                        }
                                    };
                                    bj4Var.C(objF);
                                }
                                mh4 mh4Var = (mh4) objF;
                                bj4Var.U(false);
                                bj4Var.K(1187870848);
                                if (i13 == 256) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (i14 == 2048) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z8 = z6 | z7;
                                objF2 = bj4Var.f();
                                if (z8 || objF2 == obj) {
                                    objF2 = new oh4() { // from class: r17
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj2) {
                                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                        }
                                    };
                                    bj4Var.C(objF2);
                                }
                                bj4Var.U(false);
                                int i17 = (i12 >> 9) & 112;
                                String str2 = string;
                                r1 = 1;
                                OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str2, mh4Var, (oh4) objF2, jM834getAccessibleBorderColor8_81llA2, f, jA, ob4Var, 0L, bj4Var, i17, 512);
                                bj4Var2 = bj4Var;
                            } else {
                                r1 = 1;
                                bj4Var2 = bj4Var;
                            }
                            bj4Var2.U(false);
                            bj4Var2.K(1187882794);
                            bj4Var3 = bj4Var2;
                            if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                                Phrase phraseFrom = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                                phraseFrom.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                                bj4 bj4Var6 = bj4Var2;
                                mia.b(phraseFrom.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var6, 1597872, 0, 130984);
                                bj4Var3 = bj4Var6;
                            }
                            bj4Var3.U(false);
                            b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                            bj4Var3.U(r1);
                            bj4Var3.U(r1);
                            ci4Var3 = ci4Var4;
                            ox6Var4 = ox6Var3;
                            answer4 = answer3;
                            bj4Var4 = bj4Var3;
                        } else {
                            bj4VarO.u();
                            bj4Var4 = bj4VarO;
                            ox6Var4 = ox6Var2;
                            answer4 = answer2;
                            ci4Var3 = ci4Var2;
                        }
                        xj8VarW = bj4Var4.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: s17
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj2, Object obj3) {
                                    int iIntValue = ((Integer) obj3).intValue();
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    ci4Var2 = ci4Var;
                    if ((74899 & i3) == 74898) {
                        aVar = ox6.a.t;
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar5 = aVar;
                            long jM834getAccessibleBorderColor8_81llA3 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var7 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA3, f2, jA2, ob4Var2, 0L, bj4Var7, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar5;
                            i11 = i15;
                            bj4VarO = bj4Var7;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var5 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA4 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC2 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z12 = zC2 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z12 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var2 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i18 = (i12 >> 9) & 112;
                            String str3 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str3, mh4Var2, (oh4) objF2, jM834getAccessibleBorderColor8_81llA4, f, jA, ob4Var, 0L, bj4Var, i18, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom2 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom2.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var8 = bj4Var2;
                            mia.b(phraseFrom2.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var8, 1597872, 0, 130984);
                            bj4Var3 = bj4Var8;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var5;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar6 = aVar;
                            long jM834getAccessibleBorderColor8_81llA5 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var9 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA5, f2, jA2, ob4Var2, 0L, bj4Var9, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar6;
                            i11 = i15;
                            bj4VarO = bj4Var9;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var6 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA6 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC3 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z13 = zC3 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z13 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var3 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i19 = (i12 >> 9) & 112;
                            String str4 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str4, mh4Var3, (oh4) objF2, jM834getAccessibleBorderColor8_81llA6, f, jA, ob4Var, 0L, bj4Var, i19, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom3 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom3.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var10 = bj4Var2;
                            mia.b(phraseFrom3.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var10, 1597872, 0, 130984);
                            bj4Var3 = bj4Var10;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var6;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    }
                    xj8VarW = bj4Var4.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: s17
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                surveyUiColors2 = surveyUiColors;
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
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar7 = aVar;
                            long jM834getAccessibleBorderColor8_81llA7 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var11 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA7, f2, jA2, ob4Var2, 0L, bj4Var11, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar7;
                            i11 = i15;
                            bj4VarO = bj4Var11;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var7 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA8 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC4 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z14 = zC4 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z14 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var4 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i110 = (i12 >> 9) & 112;
                            String str5 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str5, mh4Var4, (oh4) objF2, jM834getAccessibleBorderColor8_81llA8, f, jA, ob4Var, 0L, bj4Var, i110, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom4 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom4.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var12 = bj4Var2;
                            mia.b(phraseFrom4.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var12, 1597872, 0, 130984);
                            bj4Var3 = bj4Var12;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var7;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar8 = aVar;
                            long jM834getAccessibleBorderColor8_81llA9 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var13 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA9, f2, jA2, ob4Var2, 0L, bj4Var13, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar8;
                            i11 = i15;
                            bj4VarO = bj4Var13;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var8 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA10 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC5 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z15 = zC5 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z15 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var5 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i111 = (i12 >> 9) & 112;
                            String str6 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str6, mh4Var5, (oh4) objF2, jM834getAccessibleBorderColor8_81llA10, f, jA, ob4Var, 0L, bj4Var, i111, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom5 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom5.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var14 = bj4Var2;
                            mia.b(phraseFrom5.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var14, 1597872, 0, 130984);
                            bj4Var3 = bj4Var14;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var8;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    }
                    xj8VarW = bj4Var4.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: s17
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar9 = aVar;
                        long jM834getAccessibleBorderColor8_81llA11 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var15 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA11, f2, jA2, ob4Var2, 0L, bj4Var15, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar9;
                        i11 = i15;
                        bj4VarO = bj4Var15;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var9 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA12 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC6 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z16 = zC6 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z16 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var6 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i112 = (i12 >> 9) & 112;
                        String str7 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str7, mh4Var6, (oh4) objF2, jM834getAccessibleBorderColor8_81llA12, f, jA, ob4Var, 0L, bj4Var, i112, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom6 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom6.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var16 = bj4Var2;
                        mia.b(phraseFrom6.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var16, 1597872, 0, 130984);
                        bj4Var3 = bj4Var16;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var9;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar10 = aVar;
                        long jM834getAccessibleBorderColor8_81llA13 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var17 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA13, f2, jA2, ob4Var2, 0L, bj4Var17, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar10;
                        i11 = i15;
                        bj4VarO = bj4Var17;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var10 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA14 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC7 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z17 = zC7 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z17 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var7 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i113 = (i12 >> 9) & 112;
                        String str8 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str8, mh4Var7, (oh4) objF2, jM834getAccessibleBorderColor8_81llA14, f, jA, ob4Var, 0L, bj4Var, i113, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom7 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom7.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var18 = bj4Var2;
                        mia.b(phraseFrom7.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var18, 1597872, 0, 130984);
                        bj4Var3 = bj4Var18;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var10;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                }
                xj8VarW = bj4Var4.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: s17
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
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
                    surveyUiColors2 = surveyUiColors;
                    if (bj4VarO.J(surveyUiColors2)) {
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
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar11 = aVar;
                            long jM834getAccessibleBorderColor8_81llA15 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var19 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA15, f2, jA2, ob4Var2, 0L, bj4Var19, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar11;
                            i11 = i15;
                            bj4VarO = bj4Var19;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var11 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA16 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC8 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z18 = zC8 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z18 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var8 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i114 = (i12 >> 9) & 112;
                            String str9 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str9, mh4Var8, (oh4) objF2, jM834getAccessibleBorderColor8_81llA16, f, jA, ob4Var, 0L, bj4Var, i114, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom8 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom8.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var110 = bj4Var2;
                            mia.b(phraseFrom8.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var110, 1597872, 0, 130984);
                            bj4Var3 = bj4Var110;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var11;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar12 = aVar;
                            long jM834getAccessibleBorderColor8_81llA17 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var111 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA17, f2, jA2, ob4Var2, 0L, bj4Var111, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar12;
                            i11 = i15;
                            bj4VarO = bj4Var111;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var12 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA18 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC9 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z19 = zC9 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z19 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var9 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i115 = (i12 >> 9) & 112;
                            String str10 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str10, mh4Var9, (oh4) objF2, jM834getAccessibleBorderColor8_81llA18, f, jA, ob4Var, 0L, bj4Var, i115, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom9 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom9.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var112 = bj4Var2;
                            mia.b(phraseFrom9.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var112, 1597872, 0, 130984);
                            bj4Var3 = bj4Var112;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var12;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    }
                    xj8VarW = bj4Var4.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: s17
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar13 = aVar;
                        long jM834getAccessibleBorderColor8_81llA19 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var113 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA19, f2, jA2, ob4Var2, 0L, bj4Var113, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar13;
                        i11 = i15;
                        bj4VarO = bj4Var113;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var13 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA110 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC10 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z110 = zC10 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z110 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var10 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i116 = (i12 >> 9) & 112;
                        String str11 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str11, mh4Var10, (oh4) objF2, jM834getAccessibleBorderColor8_81llA110, f, jA, ob4Var, 0L, bj4Var, i116, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom10 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom10.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var114 = bj4Var2;
                        mia.b(phraseFrom10.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var114, 1597872, 0, 130984);
                        bj4Var3 = bj4Var114;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var13;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar14 = aVar;
                        long jM834getAccessibleBorderColor8_81llA111 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var115 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA111, f2, jA2, ob4Var2, 0L, bj4Var115, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar14;
                        i11 = i15;
                        bj4VarO = bj4Var115;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var14 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA112 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC11 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z111 = zC11 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z111 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var11 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i117 = (i12 >> 9) & 112;
                        String str12 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str12, mh4Var11, (oh4) objF2, jM834getAccessibleBorderColor8_81llA112, f, jA, ob4Var, 0L, bj4Var, i117, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom11 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom11.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var116 = bj4Var2;
                        mia.b(phraseFrom11.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var116, 1597872, 0, 130984);
                        bj4Var3 = bj4Var116;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var14;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                }
                xj8VarW = bj4Var4.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: s17
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            surveyUiColors2 = surveyUiColors;
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
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar15 = aVar;
                        long jM834getAccessibleBorderColor8_81llA113 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var117 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA113, f2, jA2, ob4Var2, 0L, bj4Var117, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar15;
                        i11 = i15;
                        bj4VarO = bj4Var117;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var15 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA114 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC12 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z112 = zC12 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z112 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var12 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i118 = (i12 >> 9) & 112;
                        String str13 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str13, mh4Var12, (oh4) objF2, jM834getAccessibleBorderColor8_81llA114, f, jA, ob4Var, 0L, bj4Var, i118, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom12 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom12.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var118 = bj4Var2;
                        mia.b(phraseFrom12.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var118, 1597872, 0, 130984);
                        bj4Var3 = bj4Var118;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var15;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar16 = aVar;
                        long jM834getAccessibleBorderColor8_81llA115 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var119 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA115, f2, jA2, ob4Var2, 0L, bj4Var119, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar16;
                        i11 = i15;
                        bj4VarO = bj4Var119;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var16 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA116 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC13 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z113 = zC13 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z113 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var13 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i119 = (i12 >> 9) & 112;
                        String str14 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str14, mh4Var13, (oh4) objF2, jM834getAccessibleBorderColor8_81llA116, f, jA, ob4Var, 0L, bj4Var, i119, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom13 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom13.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var1110 = bj4Var2;
                        mia.b(phraseFrom13.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1110, 1597872, 0, 130984);
                        bj4Var3 = bj4Var1110;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var16;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                }
                xj8VarW = bj4Var4.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: s17
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar17 = aVar;
                    long jM834getAccessibleBorderColor8_81llA117 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var1111 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA117, f2, jA2, ob4Var2, 0L, bj4Var1111, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar17;
                    i11 = i15;
                    bj4VarO = bj4Var1111;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var17 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA118 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC14 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z114 = zC14 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z114 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var14 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i1110 = (i12 >> 9) & 112;
                    String str15 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str15, mh4Var14, (oh4) objF2, jM834getAccessibleBorderColor8_81llA118, f, jA, ob4Var, 0L, bj4Var, i1110, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom14 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom14.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var1112 = bj4Var2;
                    mia.b(phraseFrom14.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1112, 1597872, 0, 130984);
                    bj4Var3 = bj4Var1112;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var17;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar18 = aVar;
                    long jM834getAccessibleBorderColor8_81llA119 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var1113 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA119, f2, jA2, ob4Var2, 0L, bj4Var1113, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar18;
                    i11 = i15;
                    bj4VarO = bj4Var1113;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var18 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA1110 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC15 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z115 = zC15 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z115 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var15 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i1111 = (i12 >> 9) & 112;
                    String str16 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str16, mh4Var15, (oh4) objF2, jM834getAccessibleBorderColor8_81llA1110, f, jA, ob4Var, 0L, bj4Var, i1111, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom15 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom15.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var1114 = bj4Var2;
                    mia.b(phraseFrom15.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1114, 1597872, 0, 130984);
                    bj4Var3 = bj4Var1114;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var18;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            }
            xj8VarW = bj4Var4.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: s17
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
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
                    surveyUiColors2 = surveyUiColors;
                    if (bj4VarO.J(surveyUiColors2)) {
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
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar19 = aVar;
                            long jM834getAccessibleBorderColor8_81llA1111 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var1115 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA1111, f2, jA2, ob4Var2, 0L, bj4Var1115, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar19;
                            i11 = i15;
                            bj4VarO = bj4Var1115;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var19 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA1112 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC16 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z116 = zC16 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z116 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var16 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i1112 = (i12 >> 9) & 112;
                            String str17 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str17, mh4Var16, (oh4) objF2, jM834getAccessibleBorderColor8_81llA1112, f, jA, ob4Var, 0L, bj4Var, i1112, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom16 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom16.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var1116 = bj4Var2;
                            mia.b(phraseFrom16.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1116, 1597872, 0, 130984);
                            bj4Var3 = bj4Var1116;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var19;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    } else {
                        aVar = ox6.a.t;
                        if (i16 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i8 != 0) {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                        } else {
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                        ox6Var3 = ox6Var2;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        i10 = i3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        i11 = i10;
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                        bj4VarO.K(1187769307);
                        it = multipleChoiceQuestionModel.getOptions().iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            obj = jt1.a.a;
                            if (!zHasNext) {
                                break;
                                break;
                            }
                            str = (String) it.next();
                            if (answer3 instanceof Answer.MultipleAnswer) {
                                zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                            } else {
                                zContains = false;
                            }
                            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                            bj4VarO.K(1187778355);
                            if (zContains) {
                                jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                            } else {
                                jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            }
                            bj4VarO.U(false);
                            ox6.a aVar110 = aVar;
                            long jM834getAccessibleBorderColor8_81llA1113 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                            if (zContains) {
                                f2 = 2.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            if (zContains) {
                                ob4Var2 = ob4.B;
                            } else {
                                ob4Var2 = ob4.y;
                            }
                            bj4VarO.K(-1655251130);
                            i15 = i11;
                            if ((i15 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i15 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zJ = z9 | z10 | bj4VarO.J(str);
                            objF3 = bj4VarO.f();
                            if (zJ) {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            } else {
                                objF3 = new oh4() { // from class: p17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                    }
                                };
                                bj4VarO.C(objF3);
                            }
                            bj4VarO.U(false);
                            bj4 bj4Var1117 = bj4VarO;
                            ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA1113, f2, jA2, ob4Var2, 0L, bj4Var1117, 0, 128);
                            surveyUiColors2 = surveyUiColors;
                            ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                            aVar = aVar110;
                            i11 = i15;
                            bj4VarO = bj4Var1117;
                        }
                        i12 = i11;
                        ci4<? super jt1, ? super Integer, g2b> ci4Var110 = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar3 = aVar;
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.K(1187812082);
                        if (multipleChoiceQuestionModel.getIncludeOther()) {
                            z = answer3 instanceof Answer.MultipleAnswer;
                            if (z) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                            bj4Var.K(1187840506);
                            if (z2) {
                                jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                            } else {
                                jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                            }
                            bj4Var.U(false);
                            long jM834getAccessibleBorderColor8_81llA1114 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                            if (z2) {
                                f = 2.0f;
                            } else {
                                f = 1.0f;
                            }
                            if (z2) {
                                ob4Var = ob4.B;
                            } else {
                                ob4Var = ob4.y;
                            }
                            if (z) {
                                string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                            } else {
                                string = BuildConfig.FLAVOR;
                            }
                            bj4Var.K(1187859908);
                            boolean zC17 = bj4Var.c(z2);
                            i13 = i12 & 896;
                            if (i13 == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z117 = zC17 | z3;
                            i14 = i12 & 7168;
                            if (i14 == 2048) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z117 | z4;
                            objF = bj4Var.f();
                            if (z5) {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            } else {
                                objF = new mh4() { // from class: q17
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                    }
                                };
                                bj4Var.C(objF);
                            }
                            mh4 mh4Var17 = (mh4) objF;
                            bj4Var.U(false);
                            bj4Var.K(1187870848);
                            if (i13 == 256) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (i14 == 2048) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z6 | z7;
                            objF2 = bj4Var.f();
                            if (z8) {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            } else {
                                objF2 = new oh4() { // from class: r17
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj2) {
                                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                    }
                                };
                                bj4Var.C(objF2);
                            }
                            bj4Var.U(false);
                            int i1113 = (i12 >> 9) & 112;
                            String str18 = string;
                            r1 = 1;
                            OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str18, mh4Var17, (oh4) objF2, jM834getAccessibleBorderColor8_81llA1114, f, jA, ob4Var, 0L, bj4Var, i1113, 512);
                            bj4Var2 = bj4Var;
                        } else {
                            r1 = 1;
                            bj4Var2 = bj4Var;
                        }
                        bj4Var2.U(false);
                        bj4Var2.K(1187882794);
                        bj4Var3 = bj4Var2;
                        if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                            Phrase phraseFrom17 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                            phraseFrom17.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                            bj4 bj4Var1118 = bj4Var2;
                            mia.b(phraseFrom17.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1118, 1597872, 0, 130984);
                            bj4Var3 = bj4Var1118;
                        }
                        bj4Var3.U(false);
                        b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                        bj4Var3.U(r1);
                        bj4Var3.U(r1);
                        ci4Var3 = ci4Var110;
                        ox6Var4 = ox6Var3;
                        answer4 = answer3;
                        bj4Var4 = bj4Var3;
                    }
                    xj8VarW = bj4Var4.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: s17
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                ci4Var2 = ci4Var;
                if ((74899 & i3) == 74898) {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar111 = aVar;
                        long jM834getAccessibleBorderColor8_81llA1115 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var1119 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA1115, f2, jA2, ob4Var2, 0L, bj4Var1119, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar111;
                        i11 = i15;
                        bj4VarO = bj4Var1119;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var111 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA1116 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC18 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z118 = zC18 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z118 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var18 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i1114 = (i12 >> 9) & 112;
                        String str19 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str19, mh4Var18, (oh4) objF2, jM834getAccessibleBorderColor8_81llA1116, f, jA, ob4Var, 0L, bj4Var, i1114, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom18 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom18.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var11110 = bj4Var2;
                        mia.b(phraseFrom18.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var11110, 1597872, 0, 130984);
                        bj4Var3 = bj4Var11110;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var111;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar112 = aVar;
                        long jM834getAccessibleBorderColor8_81llA1117 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11111 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA1117, f2, jA2, ob4Var2, 0L, bj4Var11111, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar112;
                        i11 = i15;
                        bj4VarO = bj4Var11111;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var112 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA1118 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC19 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z119 = zC19 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z119 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var19 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i1115 = (i12 >> 9) & 112;
                        String str110 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str110, mh4Var19, (oh4) objF2, jM834getAccessibleBorderColor8_81llA1118, f, jA, ob4Var, 0L, bj4Var, i1115, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom19 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom19.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var11112 = bj4Var2;
                        mia.b(phraseFrom19.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var11112, 1597872, 0, 130984);
                        bj4Var3 = bj4Var11112;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var112;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                }
                xj8VarW = bj4Var4.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: s17
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            surveyUiColors2 = surveyUiColors;
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
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar113 = aVar;
                        long jM834getAccessibleBorderColor8_81llA1119 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11113 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA1119, f2, jA2, ob4Var2, 0L, bj4Var11113, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar113;
                        i11 = i15;
                        bj4VarO = bj4Var11113;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var113 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA11110 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC110 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z1110 = zC110 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z1110 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var110 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i1116 = (i12 >> 9) & 112;
                        String str111 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str111, mh4Var110, (oh4) objF2, jM834getAccessibleBorderColor8_81llA11110, f, jA, ob4Var, 0L, bj4Var, i1116, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom110 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom110.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var11114 = bj4Var2;
                        mia.b(phraseFrom110.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var11114, 1597872, 0, 130984);
                        bj4Var3 = bj4Var11114;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var113;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar114 = aVar;
                        long jM834getAccessibleBorderColor8_81llA11111 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var11115 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA11111, f2, jA2, ob4Var2, 0L, bj4Var11115, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar114;
                        i11 = i15;
                        bj4VarO = bj4Var11115;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var114 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA11112 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC111 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z1111 = zC111 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z1111 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var111 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i1117 = (i12 >> 9) & 112;
                        String str112 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str112, mh4Var111, (oh4) objF2, jM834getAccessibleBorderColor8_81llA11112, f, jA, ob4Var, 0L, bj4Var, i1117, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom111 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom111.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var11116 = bj4Var2;
                        mia.b(phraseFrom111.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var11116, 1597872, 0, 130984);
                        bj4Var3 = bj4Var11116;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var114;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                }
                xj8VarW = bj4Var4.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: s17
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar115 = aVar;
                    long jM834getAccessibleBorderColor8_81llA11113 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var11117 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA11113, f2, jA2, ob4Var2, 0L, bj4Var11117, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar115;
                    i11 = i15;
                    bj4VarO = bj4Var11117;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var115 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA11114 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC112 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z1112 = zC112 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z1112 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var112 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i1118 = (i12 >> 9) & 112;
                    String str113 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str113, mh4Var112, (oh4) objF2, jM834getAccessibleBorderColor8_81llA11114, f, jA, ob4Var, 0L, bj4Var, i1118, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom112 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom112.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var11118 = bj4Var2;
                    mia.b(phraseFrom112.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var11118, 1597872, 0, 130984);
                    bj4Var3 = bj4Var11118;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var115;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar116 = aVar;
                    long jM834getAccessibleBorderColor8_81llA11115 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var11119 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA11115, f2, jA2, ob4Var2, 0L, bj4Var11119, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar116;
                    i11 = i15;
                    bj4VarO = bj4Var11119;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var116 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA11116 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC113 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z1113 = zC113 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z1113 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var113 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i1119 = (i12 >> 9) & 112;
                    String str114 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str114, mh4Var113, (oh4) objF2, jM834getAccessibleBorderColor8_81llA11116, f, jA, ob4Var, 0L, bj4Var, i1119, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom113 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom113.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var111110 = bj4Var2;
                    mia.b(phraseFrom113.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var111110, 1597872, 0, 130984);
                    bj4Var3 = bj4Var111110;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var116;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            }
            xj8VarW = bj4Var4.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: s17
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
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
                surveyUiColors2 = surveyUiColors;
                if (bj4VarO.J(surveyUiColors2)) {
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
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar117 = aVar;
                        long jM834getAccessibleBorderColor8_81llA11117 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var111111 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA11117, f2, jA2, ob4Var2, 0L, bj4Var111111, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar117;
                        i11 = i15;
                        bj4VarO = bj4Var111111;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var117 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA11118 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC114 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z1114 = zC114 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z1114 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var114 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i11110 = (i12 >> 9) & 112;
                        String str115 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str115, mh4Var114, (oh4) objF2, jM834getAccessibleBorderColor8_81llA11118, f, jA, ob4Var, 0L, bj4Var, i11110, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom114 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom114.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var111112 = bj4Var2;
                        mia.b(phraseFrom114.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var111112, 1597872, 0, 130984);
                        bj4Var3 = bj4Var111112;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var117;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i8 != 0) {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                    } else {
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                    ox6Var3 = ox6Var2;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    i10 = i3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    i11 = i10;
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                    bj4VarO.K(1187769307);
                    it = multipleChoiceQuestionModel.getOptions().iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        obj = jt1.a.a;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        str = (String) it.next();
                        if (answer3 instanceof Answer.MultipleAnswer) {
                            zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                        } else {
                            zContains = false;
                        }
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        bj4VarO.K(1187778355);
                        if (zContains) {
                            jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                        } else {
                            jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        }
                        bj4VarO.U(false);
                        ox6.a aVar118 = aVar;
                        long jM834getAccessibleBorderColor8_81llA11119 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                        if (zContains) {
                            f2 = 2.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (zContains) {
                            ob4Var2 = ob4.B;
                        } else {
                            ob4Var2 = ob4.y;
                        }
                        bj4VarO.K(-1655251130);
                        i15 = i11;
                        if ((i15 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ = z9 | z10 | bj4VarO.J(str);
                        objF3 = bj4VarO.f();
                        if (zJ) {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            objF3 = new oh4() { // from class: p17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        bj4 bj4Var111113 = bj4VarO;
                        ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA11119, f2, jA2, ob4Var2, 0L, bj4Var111113, 0, 128);
                        surveyUiColors2 = surveyUiColors;
                        ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                        aVar = aVar118;
                        i11 = i15;
                        bj4VarO = bj4Var111113;
                    }
                    i12 = i11;
                    ci4<? super jt1, ? super Integer, g2b> ci4Var118 = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar3 = aVar;
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.K(1187812082);
                    if (multipleChoiceQuestionModel.getIncludeOther()) {
                        z = answer3 instanceof Answer.MultipleAnswer;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                        bj4Var.K(1187840506);
                        if (z2) {
                            jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                        } else {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                        }
                        bj4Var.U(false);
                        long jM834getAccessibleBorderColor8_81llA111110 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                        if (z2) {
                            f = 2.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (z2) {
                            ob4Var = ob4.B;
                        } else {
                            ob4Var = ob4.y;
                        }
                        if (z) {
                            string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                        } else {
                            string = BuildConfig.FLAVOR;
                        }
                        bj4Var.K(1187859908);
                        boolean zC115 = bj4Var.c(z2);
                        i13 = i12 & 896;
                        if (i13 == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z1115 = zC115 | z3;
                        i14 = i12 & 7168;
                        if (i14 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = z1115 | z4;
                        objF = bj4Var.f();
                        if (z5) {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        } else {
                            objF = new mh4() { // from class: q17
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                                }
                            };
                            bj4Var.C(objF);
                        }
                        mh4 mh4Var115 = (mh4) objF;
                        bj4Var.U(false);
                        bj4Var.K(1187870848);
                        if (i13 == 256) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i14 == 2048) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = z6 | z7;
                        objF2 = bj4Var.f();
                        if (z8) {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        } else {
                            objF2 = new oh4() { // from class: r17
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                                }
                            };
                            bj4Var.C(objF2);
                        }
                        bj4Var.U(false);
                        int i11111 = (i12 >> 9) & 112;
                        String str116 = string;
                        r1 = 1;
                        OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str116, mh4Var115, (oh4) objF2, jM834getAccessibleBorderColor8_81llA111110, f, jA, ob4Var, 0L, bj4Var, i11111, 512);
                        bj4Var2 = bj4Var;
                    } else {
                        r1 = 1;
                        bj4Var2 = bj4Var;
                    }
                    bj4Var2.U(false);
                    bj4Var2.K(1187882794);
                    bj4Var3 = bj4Var2;
                    if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                        Phrase phraseFrom115 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                        phraseFrom115.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                        bj4 bj4Var111114 = bj4Var2;
                        mia.b(phraseFrom115.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var111114, 1597872, 0, 130984);
                        bj4Var3 = bj4Var111114;
                    }
                    bj4Var3.U(false);
                    b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                    bj4Var3.U(r1);
                    bj4Var3.U(r1);
                    ci4Var3 = ci4Var118;
                    ox6Var4 = ox6Var3;
                    answer4 = answer3;
                    bj4Var4 = bj4Var3;
                }
                xj8VarW = bj4Var4.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: s17
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ci4Var2 = ci4Var;
            if ((74899 & i3) == 74898) {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar119 = aVar;
                    long jM834getAccessibleBorderColor8_81llA111111 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var111115 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA111111, f2, jA2, ob4Var2, 0L, bj4Var111115, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar119;
                    i11 = i15;
                    bj4VarO = bj4Var111115;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var119 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA111112 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC116 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z1116 = zC116 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z1116 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var116 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i11112 = (i12 >> 9) & 112;
                    String str117 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str117, mh4Var116, (oh4) objF2, jM834getAccessibleBorderColor8_81llA111112, f, jA, ob4Var, 0L, bj4Var, i11112, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom116 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom116.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var111116 = bj4Var2;
                    mia.b(phraseFrom116.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var111116, 1597872, 0, 130984);
                    bj4Var3 = bj4Var111116;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var119;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar1110 = aVar;
                    long jM834getAccessibleBorderColor8_81llA111113 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var111117 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA111113, f2, jA2, ob4Var2, 0L, bj4Var111117, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar1110;
                    i11 = i15;
                    bj4VarO = bj4Var111117;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1110 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA111114 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC117 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z1117 = zC117 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z1117 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var117 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i11113 = (i12 >> 9) & 112;
                    String str118 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str118, mh4Var117, (oh4) objF2, jM834getAccessibleBorderColor8_81llA111114, f, jA, ob4Var, 0L, bj4Var, i11113, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom117 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom117.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var111118 = bj4Var2;
                    mia.b(phraseFrom117.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var111118, 1597872, 0, 130984);
                    bj4Var3 = bj4Var111118;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var1110;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            }
            xj8VarW = bj4Var4.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: s17
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        surveyUiColors2 = surveyUiColors;
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
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar1111 = aVar;
                    long jM834getAccessibleBorderColor8_81llA111115 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var111119 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA111115, f2, jA2, ob4Var2, 0L, bj4Var111119, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar1111;
                    i11 = i15;
                    bj4VarO = bj4Var111119;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1111 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA111116 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC118 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z1118 = zC118 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z1118 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var118 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i11114 = (i12 >> 9) & 112;
                    String str119 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str119, mh4Var118, (oh4) objF2, jM834getAccessibleBorderColor8_81llA111116, f, jA, ob4Var, 0L, bj4Var, i11114, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom118 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom118.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var1111110 = bj4Var2;
                    mia.b(phraseFrom118.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1111110, 1597872, 0, 130984);
                    bj4Var3 = bj4Var1111110;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var1111;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            } else {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i8 != 0) {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
                } else {
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
                ox6Var3 = ox6Var2;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                i10 = i3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                i11 = i10;
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
                bj4VarO.K(1187769307);
                it = multipleChoiceQuestionModel.getOptions().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    obj = jt1.a.a;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    str = (String) it.next();
                    if (answer3 instanceof Answer.MultipleAnswer) {
                        zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                    } else {
                        zContains = false;
                    }
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    bj4VarO.K(1187778355);
                    if (zContains) {
                        jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                    } else {
                        jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    }
                    bj4VarO.U(false);
                    ox6.a aVar1112 = aVar;
                    long jM834getAccessibleBorderColor8_81llA111117 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                    if (zContains) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (zContains) {
                        ob4Var2 = ob4.B;
                    } else {
                        ob4Var2 = ob4.y;
                    }
                    bj4VarO.K(-1655251130);
                    i15 = i11;
                    if ((i15 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ = z9 | z10 | bj4VarO.J(str);
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new oh4() { // from class: p17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var1111111 = bj4VarO;
                    ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA111117, f2, jA2, ob4Var2, 0L, bj4Var1111111, 0, 128);
                    surveyUiColors2 = surveyUiColors;
                    ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                    aVar = aVar1112;
                    i11 = i15;
                    bj4VarO = bj4Var1111111;
                }
                i12 = i11;
                ci4<? super jt1, ? super Integer, g2b> ci4Var1112 = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar3 = aVar;
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.K(1187812082);
                if (multipleChoiceQuestionModel.getIncludeOther()) {
                    z = answer3 instanceof Answer.MultipleAnswer;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                    bj4Var.K(1187840506);
                    if (z2) {
                        jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                    } else {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                    }
                    bj4Var.U(false);
                    long jM834getAccessibleBorderColor8_81llA111118 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                    if (z2) {
                        f = 2.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z2) {
                        ob4Var = ob4.B;
                    } else {
                        ob4Var = ob4.y;
                    }
                    if (z) {
                        string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                    } else {
                        string = BuildConfig.FLAVOR;
                    }
                    bj4Var.K(1187859908);
                    boolean zC119 = bj4Var.c(z2);
                    i13 = i12 & 896;
                    if (i13 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z1119 = zC119 | z3;
                    i14 = i12 & 7168;
                    if (i14 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z1119 | z4;
                    objF = bj4Var.f();
                    if (z5) {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    } else {
                        objF = new mh4() { // from class: q17
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                            }
                        };
                        bj4Var.C(objF);
                    }
                    mh4 mh4Var119 = (mh4) objF;
                    bj4Var.U(false);
                    bj4Var.K(1187870848);
                    if (i13 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i14 == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z6 | z7;
                    objF2 = bj4Var.f();
                    if (z8) {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: r17
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj2) {
                                return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                            }
                        };
                        bj4Var.C(objF2);
                    }
                    bj4Var.U(false);
                    int i11115 = (i12 >> 9) & 112;
                    String str1110 = string;
                    r1 = 1;
                    OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str1110, mh4Var119, (oh4) objF2, jM834getAccessibleBorderColor8_81llA111118, f, jA, ob4Var, 0L, bj4Var, i11115, 512);
                    bj4Var2 = bj4Var;
                } else {
                    r1 = 1;
                    bj4Var2 = bj4Var;
                }
                bj4Var2.U(false);
                bj4Var2.K(1187882794);
                bj4Var3 = bj4Var2;
                if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                    Phrase phraseFrom119 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                    phraseFrom119.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                    bj4 bj4Var1111112 = bj4Var2;
                    mia.b(phraseFrom119.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1111112, 1597872, 0, 130984);
                    bj4Var3 = bj4Var1111112;
                }
                bj4Var3.U(false);
                b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
                bj4Var3.U(r1);
                bj4Var3.U(r1);
                ci4Var3 = ci4Var1112;
                ox6Var4 = ox6Var3;
                answer4 = answer3;
                bj4Var4 = bj4Var3;
            }
            xj8VarW = bj4Var4.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: s17
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ci4Var2 = ci4Var;
        if ((74899 & i3) == 74898) {
            aVar = ox6.a.t;
            if (i16 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
            ox6Var3 = ox6Var2;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            i10 = i3;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            i11 = i10;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
            bj4VarO.K(1187769307);
            it = multipleChoiceQuestionModel.getOptions().iterator();
            while (true) {
                zHasNext = it.hasNext();
                obj = jt1.a.a;
                if (!zHasNext) {
                    break;
                    break;
                }
                str = (String) it.next();
                if (answer3 instanceof Answer.MultipleAnswer) {
                    zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                } else {
                    zContains = false;
                }
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(1187778355);
                if (zContains) {
                    jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                }
                bj4VarO.U(false);
                ox6.a aVar1113 = aVar;
                long jM834getAccessibleBorderColor8_81llA111119 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                if (zContains) {
                    f2 = 2.0f;
                } else {
                    f2 = 1.0f;
                }
                if (zContains) {
                    ob4Var2 = ob4.B;
                } else {
                    ob4Var2 = ob4.y;
                }
                bj4VarO.K(-1655251130);
                i15 = i11;
                if ((i15 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ = z9 | z10 | bj4VarO.J(str);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: p17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: p17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                bj4 bj4Var1111113 = bj4VarO;
                ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA111119, f2, jA2, ob4Var2, 0L, bj4Var1111113, 0, 128);
                surveyUiColors2 = surveyUiColors;
                ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar = aVar1113;
                i11 = i15;
                bj4VarO = bj4Var1111113;
            }
            i12 = i11;
            ci4<? super jt1, ? super Integer, g2b> ci4Var1113 = ci4VarM470getLambda1$intercom_sdk_base_release;
            aVar3 = aVar;
            bj4Var = bj4VarO;
            bj4Var.U(false);
            bj4Var.K(1187812082);
            if (multipleChoiceQuestionModel.getIncludeOther()) {
                z = answer3 instanceof Answer.MultipleAnswer;
                if (z) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                bj4Var.K(1187840506);
                if (z2) {
                    jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                }
                bj4Var.U(false);
                long jM834getAccessibleBorderColor8_81llA1111110 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                if (z2) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                if (z2) {
                    ob4Var = ob4.B;
                } else {
                    ob4Var = ob4.y;
                }
                if (z) {
                    string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                } else {
                    string = BuildConfig.FLAVOR;
                }
                bj4Var.K(1187859908);
                boolean zC1110 = bj4Var.c(z2);
                i13 = i12 & 896;
                if (i13 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z11110 = zC1110 | z3;
                i14 = i12 & 7168;
                if (i14 == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z11110 | z4;
                objF = bj4Var.f();
                if (z5) {
                    objF = new mh4() { // from class: q17
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                        }
                    };
                    bj4Var.C(objF);
                } else {
                    objF = new mh4() { // from class: q17
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                        }
                    };
                    bj4Var.C(objF);
                }
                mh4 mh4Var1110 = (mh4) objF;
                bj4Var.U(false);
                bj4Var.K(1187870848);
                if (i13 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i14 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objF2 = bj4Var.f();
                if (z8) {
                    objF2 = new oh4() { // from class: r17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                        }
                    };
                    bj4Var.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: r17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                        }
                    };
                    bj4Var.C(objF2);
                }
                bj4Var.U(false);
                int i11116 = (i12 >> 9) & 112;
                String str1111 = string;
                r1 = 1;
                OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str1111, mh4Var1110, (oh4) objF2, jM834getAccessibleBorderColor8_81llA1111110, f, jA, ob4Var, 0L, bj4Var, i11116, 512);
                bj4Var2 = bj4Var;
            } else {
                r1 = 1;
                bj4Var2 = bj4Var;
            }
            bj4Var2.U(false);
            bj4Var2.K(1187882794);
            bj4Var3 = bj4Var2;
            if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                Phrase phraseFrom1110 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                phraseFrom1110.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                bj4 bj4Var1111114 = bj4Var2;
                mia.b(phraseFrom1110.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1111114, 1597872, 0, 130984);
                bj4Var3 = bj4Var1111114;
            }
            bj4Var3.U(false);
            b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
            bj4Var3.U(r1);
            bj4Var3.U(r1);
            ci4Var3 = ci4Var1113;
            ox6Var4 = ox6Var3;
            answer4 = answer3;
            bj4Var4 = bj4Var3;
        } else {
            aVar = ox6.a.t;
            if (i16 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i8 != 0) {
                ci4VarM470getLambda1$intercom_sdk_base_release = ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m470getLambda1$intercom_sdk_base_release();
            } else {
                ci4VarM470getLambda1$intercom_sdk_base_release = ci4Var2;
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
            ox6Var3 = ox6Var2;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            i10 = i3;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            i11 = i10;
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            ci4VarM470getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i11 >> 15) & 14));
            bj4VarO.K(1187769307);
            it = multipleChoiceQuestionModel.getOptions().iterator();
            while (true) {
                zHasNext = it.hasNext();
                obj = jt1.a.a;
                if (!zHasNext) {
                    break;
                    break;
                }
                str = (String) it.next();
                if (answer3 instanceof Answer.MultipleAnswer) {
                    zContains = ((Answer.MultipleAnswer) answer3).m457getAnswers().contains(str);
                } else {
                    zContains = false;
                }
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                bj4VarO.K(1187778355);
                if (zContains) {
                    jA2 = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m404getButton0d7_KjU());
                } else {
                    jA2 = kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                }
                bj4VarO.U(false);
                ox6.a aVar1114 = aVar;
                long jM834getAccessibleBorderColor8_81llA1111111 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA2);
                if (zContains) {
                    f2 = 2.0f;
                } else {
                    f2 = 1.0f;
                }
                if (zContains) {
                    ob4Var2 = ob4.B;
                } else {
                    ob4Var2 = ob4.y;
                }
                bj4VarO.K(-1655251130);
                i15 = i11;
                if ((i15 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i15 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ = z9 | z10 | bj4VarO.J(str);
                objF3 = bj4VarO.f();
                if (zJ) {
                    objF3 = new oh4() { // from class: p17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new oh4() { // from class: p17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer3, oh4Var, str, (String) obj2);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                bj4 bj4Var1111115 = bj4VarO;
                ChoicePillKt.m465ChoicePillUdaoDFU(zContains, (oh4) objF3, str, jM834getAccessibleBorderColor8_81llA1111111, f2, jA2, ob4Var2, 0L, bj4Var1111115, 0, 128);
                surveyUiColors2 = surveyUiColors;
                ci4VarM470getLambda1$intercom_sdk_base_release = ci4VarM470getLambda1$intercom_sdk_base_release;
                aVar = aVar1114;
                i11 = i15;
                bj4VarO = bj4Var1111115;
            }
            i12 = i11;
            ci4<? super jt1, ? super Integer, g2b> ci4Var1114 = ci4VarM470getLambda1$intercom_sdk_base_release;
            aVar3 = aVar;
            bj4Var = bj4VarO;
            bj4Var.U(false);
            bj4Var.K(1187812082);
            if (multipleChoiceQuestionModel.getIncludeOther()) {
                z = answer3 instanceof Answer.MultipleAnswer;
                if (z) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                b47.b(bj4Var, ir9.d(aVar3, 8.0f));
                bj4Var.K(1187840506);
                if (z2) {
                    jA = ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m404getButton0d7_KjU());
                } else {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4Var, IntercomTheme.$stable);
                }
                bj4Var.U(false);
                long jM834getAccessibleBorderColor8_81llA1111112 = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(jA);
                if (z2) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                if (z2) {
                    ob4Var = ob4.B;
                } else {
                    ob4Var = ob4.y;
                }
                if (z) {
                    string = ((Answer.MultipleAnswer) answer3).getOtherAnswer().toString();
                } else {
                    string = BuildConfig.FLAVOR;
                }
                bj4Var.K(1187859908);
                boolean zC1111 = bj4Var.c(z2);
                i13 = i12 & 896;
                if (i13 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z11111 = zC1111 | z3;
                i14 = i12 & 7168;
                if (i14 == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z11111 | z4;
                objF = bj4Var.f();
                if (z5) {
                    objF = new mh4() { // from class: q17
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                        }
                    };
                    bj4Var.C(objF);
                } else {
                    objF = new mh4() { // from class: q17
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z2, answer3, oh4Var);
                        }
                    };
                    bj4Var.C(objF);
                }
                mh4 mh4Var1111 = (mh4) objF;
                bj4Var.U(false);
                bj4Var.K(1187870848);
                if (i13 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i14 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z6 | z7;
                objF2 = bj4Var.f();
                if (z8) {
                    objF2 = new oh4() { // from class: r17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                        }
                    };
                    bj4Var.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: r17
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer3, oh4Var, (String) obj2);
                        }
                    };
                    bj4Var.C(objF2);
                }
                bj4Var.U(false);
                int i11117 = (i12 >> 9) & 112;
                String str1112 = string;
                r1 = 1;
                OtherOptionKt.m473OtherOptionYCJL08c(z2, surveyUiColors, str1112, mh4Var1111, (oh4) objF2, jM834getAccessibleBorderColor8_81llA1111112, f, jA, ob4Var, 0L, bj4Var, i11117, 512);
                bj4Var2 = bj4Var;
            } else {
                r1 = 1;
                bj4Var2 = bj4Var;
            }
            bj4Var2.U(false);
            bj4Var2.K(1187882794);
            bj4Var3 = bj4Var2;
            if (multipleChoiceQuestionModel.getMinSelection() > r1) {
                Phrase phraseFrom1111 = Phrase.from((Context) bj4Var2.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_surveys_multi_select_too_few_responses);
                phraseFrom1111.put("response_count", multipleChoiceQuestionModel.getMinSelection());
                bj4 bj4Var1111116 = bj4Var2;
                mia.b(phraseFrom1111.format().toString(), eo7.m(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), uh1.c, cka.b(11), ob4.y, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4Var2, IntercomTheme.$stable).getType05(), bj4Var1111116, 1597872, 0, 130984);
                bj4Var3 = bj4Var1111116;
            }
            bj4Var3.U(false);
            b47.b(bj4Var3, ir9.d(aVar3, 8.0f));
            bj4Var3.U(r1);
            bj4Var3.U(r1);
            ci4Var3 = ci4Var1114;
            ox6Var4 = ox6Var3;
            answer4 = answer3;
            bj4Var4 = bj4Var3;
        }
        xj8VarW = bj4Var4.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: s17
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(ox6Var4, multipleChoiceQuestionModel, answer4, oh4Var, surveyUiColors, ci4Var3, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(Answer answer, oh4 oh4Var, String str, String str2) {
        str2.getClass();
        if (answer instanceof Answer.MultipleAnswer) {
            oh4Var.invoke(((Answer.MultipleAnswer) answer).copyWithAnswerToggled(str));
        } else {
            Set setSingleton = Collections.singleton(str);
            setSingleton.getClass();
            oh4Var.invoke(new Answer.MultipleAnswer(setSingleton, null, 2, 0 == true ? 1 : 0));
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(boolean z, Answer answer, oh4 oh4Var) {
        if (z) {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, oh4Var, Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE);
        } else {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, oh4Var, Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Answer answer, oh4 oh4Var, String str) {
        str.getClass();
        MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, oh4Var, new Answer.MultipleAnswer.OtherAnswer.SelectedWithText(str));
        return g2b.a;
    }

    private static final void MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(Answer answer, oh4<? super Answer, g2b> oh4Var, Answer.MultipleAnswer.OtherAnswer otherAnswer) {
        if (answer instanceof Answer.MultipleAnswer) {
            oh4Var.invoke(((Answer.MultipleAnswer) answer).copyWithOther(otherAnswer));
        } else {
            oh4Var.invoke(new Answer.MultipleAnswer(of3.t, otherAnswer));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MultipleChoiceQuestion$lambda$9(ox6 ox6Var, SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, oh4 oh4Var, SurveyUiColors surveyUiColors, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        MultipleChoiceQuestion(ox6Var, multipleChoiceQuestionModel, answer, oh4Var, surveyUiColors, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void MultipleChoiceQuestionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1537454351);
        int i2 = 0;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            PreviewQuestion(ux1.a(null, null, 3, null), bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new u17(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MultipleChoiceQuestionPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        MultipleChoiceQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void MultipleChoiceQuestionPreviewDark(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(756027931);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            PreviewQuestion(SurveyUiColors.m396copyqa9m3tE$default(ux1.a(null, null, 3, null), 0L, 0L, uh1.h, 0L, null, 27, null), bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kk2(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MultipleChoiceQuestionPreviewDark$lambda$11(int i, jt1 jt1Var, int i2) {
        MultipleChoiceQuestionPreviewDark(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void PreviewQuestion(final SurveyUiColors surveyUiColors, jt1 jt1Var, final int i) {
        int i2;
        surveyUiColors.getClass();
        bj4 bj4VarO = jt1Var.o(-1753720526);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(surveyUiColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-245477028, new AnonymousClass1(surveyUiColors), bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: t17
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MultipleChoiceQuestionKt.PreviewQuestion$lambda$12(surveyUiColors, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewQuestion$lambda$12(SurveyUiColors surveyUiColors, int i, jt1 jt1Var, int i2) {
        PreviewQuestion(surveyUiColors, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$PreviewQuestion$1, reason: invalid class name */
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
            SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel = new SurveyData.Step.Question.MultipleChoiceQuestionModel(string, ws0.h(new Block.Builder().withText("Question Title")), true, ws0.i("Option A", "Option B", "Option C", "Option D", "Option E"), true, 2, 3);
            Answer.MultipleAnswer multipleAnswer = new Answer.MultipleAnswer(u30.F(new String[]{"Option B", "Option D"}), Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE);
            jt1Var.K(70981782);
            Object objF = jt1Var.f();
            if (objF == jt1.a.a) {
                objF = new c();
                jt1Var.C(objF);
            }
            jt1Var.B();
            MultipleChoiceQuestionKt.MultipleChoiceQuestion(null, multipleChoiceQuestionModel, multipleAnswer, (oh4) objF, this.$surveyUiColors, null, jt1Var, 3072, 33);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
