package io.intercom.android.sdk.survey.ui.questiontype;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aa0;
import defpackage.aj1;
import defpackage.al8;
import defpackage.au3;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d94;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fg5;
import defpackage.g0b;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hf3;
import defpackage.ioa;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j0b;
import defpackage.j1b;
import defpackage.joa;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.kk;
import defpackage.kk2;
import defpackage.ko7;
import defpackage.koa;
import defpackage.kw7;
import defpackage.l02;
import defpackage.lj2;
import defpackage.loa;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml1;
import defpackage.ml5;
import defpackage.mm8;
import defpackage.nr1;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ph2;
import defpackage.qk2;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.rk2;
import defpackage.tk2;
import defpackage.uh1;
import defpackage.ul9;
import defpackage.uma;
import defpackage.v2a;
import defpackage.v5a;
import defpackage.we1;
import defpackage.wl9;
import defpackage.wn;
import defpackage.xa6;
import defpackage.xh2;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.xna;
import defpackage.yi1;
import defpackage.z2a;
import defpackage.zq;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DatePickerQuestionKt {
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    private static final void ComposeDatePickerDialog(final Answer answer, final oh4<? super Answer, g2b> oh4Var, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        long jCurrentTimeMillis;
        final mh4<g2b> mh4Var2;
        bj4 bj4VarO = jt1Var.o(-307045537);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(answer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            mh4Var2 = mh4Var;
        } else {
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() > 0) {
                    jCurrentTimeMillis = dateTimeAnswer.getDate();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            final Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            ko7 ko7Var = lj2.a;
            final fg5 fg5Var = ph2.b;
            final ph2.a aVar = ph2.c;
            bj4VarO.K(2088426481);
            final Locale locale = ((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            bj4VarO.B();
            Object[] objArr = new Object[0];
            au3 au3VarB = xa6.b(new rk2(), new oh4() { // from class: sk2
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    List list = (List) obj;
                    Long l = (Long) list.get(0);
                    Long l2 = (Long) list.get(1);
                    Object obj2 = list.get(2);
                    obj2.getClass();
                    int iIntValue = ((Integer) obj2).intValue();
                    Object obj3 = list.get(3);
                    obj3.getClass();
                    fg5 fg5Var2 = new fg5(iIntValue, ((Integer) obj3).intValue(), 1);
                    Object obj4 = list.get(4);
                    obj4.getClass();
                    return new tk2(l, l2, fg5Var2, ((Integer) obj4).intValue(), aVar, locale);
                }
            });
            boolean zJ = bj4VarO.J(lValueOf) | bj4VarO.J(lValueOf) | bj4VarO.j(fg5Var) | bj4VarO.h(0) | bj4VarO.J(aVar) | bj4VarO.j(locale);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                mh4 mh4Var3 = new mh4() { // from class: xi2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new tk2(lValueOf, lValueOf, fg5Var, 0, aVar, locale);
                    }
                };
                bj4VarO.C(mh4Var3);
                objF = mh4Var3;
            }
            final tk2 tk2Var = (tk2) mm8.e(objArr, au3VarB, (mh4) objF, bj4VarO, 0);
            tk2Var.d.setValue(aVar);
            mh4Var2 = mh4Var;
            xh2.a(mh4Var2, gr1.b(308986865, new AnonymousClass1(tk2Var, answer, oh4Var, mh4Var), bj4VarO), null, gr1.b(1712856051, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeDatePickerDialog.2
                public final void invoke(jt1 jt1Var2, int i3) {
                    if ((i3 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        jz0.c(mh4Var, null, false, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m460getLambda3$intercom_sdk_base_release(), jt1Var2, 805306368, 510);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, gr1.b(-725444728, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeDatePickerDialog.3
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i3) {
                    bj1Var.getClass();
                    if ((i3 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        lj2.b(tk2Var, eo7.i(ox6.a.t, 16.0f), null, null, null, null, false, null, jt1Var2, 48);
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i2 >> 6) & 14) | 100666416);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jk2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.ComposeDatePickerDialog$lambda$14(answer, oh4Var, mh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ComposeDatePickerDialog$lambda$14(Answer answer, oh4 oh4Var, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        ComposeDatePickerDialog(answer, oh4Var, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void ComposeTimePickerDialog(final Answer answer, final oh4<? super Answer, g2b> oh4Var, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        final mh4<g2b> mh4Var2;
        Object obj = 0;
        bj4 bj4VarO = jt1Var.o(-1295396418);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(answer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            mh4Var2 = mh4Var;
        } else {
            List<String> localTime = getLocalTime(answer);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = localTime.iterator();
            while (it.hasNext()) {
                Integer numF = v2a.f((String) it.next());
                if (numF != null) {
                    arrayList.add(numF);
                }
            }
            final int iIntValue = ((Number) (arrayList.size() > 0 ? arrayList.get(0) : obj)).intValue();
            final int iIntValue2 = ((Number) (1 < arrayList.size() ? arrayList.get(1) : 0)).intValue();
            float f = xna.a;
            Object[] objArr = new Object[0];
            au3 au3Var = new au3(new joa(), new koa());
            boolean zH = bj4VarO.h(iIntValue) | bj4VarO.h(iIntValue2);
            Object objF = bj4VarO.f();
            if (zH || objF == jt1.a.a) {
                objF = new mh4() { // from class: gna
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return new loa(iIntValue, true, iIntValue2);
                    }
                };
                bj4VarO.C(objF);
            }
            final loa loaVar = (loa) mm8.e(objArr, au3Var, (mh4) objF, bj4VarO, 0);
            mh4Var2 = mh4Var;
            wn.a(mh4Var2, null, gr1.b(-1529528875, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.ComposeTimePickerDialog.1
                public final void invoke(jt1 jt1Var2, int i3) {
                    if ((i3 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        v5a.a(ir9.c(ox6.a.t, 1.0f), ((ul9) jt1Var2.F(wl9.a)).e, 0L, 0L, 6.0f, 0.0f, null, gr1.b(-1066676752, new C01731(loaVar, mh4Var, answer, oh4Var), jt1Var2), jt1Var2, 12607494, 108);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }

                /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeTimePickerDialog$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class C01731 implements ci4<jt1, Integer, g2b> {
                    final /* synthetic */ Answer $answer;
                    final /* synthetic */ oh4<Answer, g2b> $onAnswer;
                    final /* synthetic */ mh4<g2b> $onDismiss;
                    final /* synthetic */ ioa $timePickerState;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C01731(ioa ioaVar, mh4<g2b> mh4Var, Answer answer, oh4<? super Answer, g2b> oh4Var) {
                        this.$timePickerState = ioaVar;
                        this.$onDismiss = mh4Var;
                        this.$answer = answer;
                        this.$onAnswer = oh4Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final g2b invoke$lambda$3$lambda$2$lambda$1$lambda$0(ioa ioaVar, Answer answer, oh4 oh4Var) {
                        List utcTime = DatePickerQuestionKt.getUtcTime(ioaVar.g(), ioaVar.c());
                        oh4Var.invoke(answer instanceof Answer.DateTimeAnswer ? Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, 0L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)), 1, null) : new Answer.DateTimeAnswer(-1L, Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1))));
                        return g2b.a;
                    }

                    public final void invoke(jt1 jt1Var, int i) {
                        if ((i & 3) == 2 && jt1Var.r()) {
                            jt1Var.u();
                            return;
                        }
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarI = eo7.i(aVar, 24.0f);
                        final ioa ioaVar = this.$timePickerState;
                        mh4<g2b> mh4Var = this.$onDismiss;
                        final Answer answer = this.$answer;
                        final oh4<Answer, g2b> oh4Var = this.$onAnswer;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var, 48);
                        int iHashCode = Long.hashCode(jt1Var.v());
                        kw7 kw7VarY = jt1Var.y();
                        ox6 ox6VarC = it1.c(jt1Var, ox6VarI);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var.q();
                        if (jt1Var.l()) {
                            jt1Var.k(aVar2);
                        } else {
                            jt1Var.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var, cVar, aj1VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar = bt1.a.g;
                        rd7.d(jt1Var, bVar, numValueOf);
                        bt1.a.C0034a c0034a = bt1.a.h;
                        rd7.c(jt1Var, c0034a);
                        bt1.a.d dVar = bt1.a.d;
                        rd7.d(jt1Var, dVar, ox6VarC);
                        mia.b("Select time", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((g0b) jt1Var.F(j0b.a)).n, jt1Var, 6, 0, 131070);
                        b47.b(jt1Var, ir9.d(aVar, 24.0f));
                        xna.j(ioaVar, null, null, 0, jt1Var, 0);
                        b47.b(jt1Var, ir9.d(aVar, 24.0f));
                        ox6 ox6VarC2 = ir9.c(aVar, 1.0f);
                        ny8 ny8VarA = ly8.a(c30.b, di.a.j, jt1Var, 6);
                        int iHashCode2 = Long.hashCode(jt1Var.v());
                        kw7 kw7VarY2 = jt1Var.y();
                        ox6 ox6VarC3 = it1.c(jt1Var, ox6VarC2);
                        if (jt1Var.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var.q();
                        if (jt1Var.l()) {
                            jt1Var.k(aVar2);
                        } else {
                            jt1Var.z();
                        }
                        rd7.d(jt1Var, cVar, ny8VarA);
                        rd7.d(jt1Var, eVar, kw7VarY2);
                        g3.c(iHashCode2, jt1Var, bVar, jt1Var, c0034a);
                        rd7.d(jt1Var, dVar, ox6VarC3);
                        ComposableSingletons$DatePickerQuestionKt composableSingletons$DatePickerQuestionKt = ComposableSingletons$DatePickerQuestionKt.INSTANCE;
                        jz0.c(mh4Var, null, false, null, null, null, composableSingletons$DatePickerQuestionKt.m461getLambda4$intercom_sdk_base_release(), jt1Var, 805306368, 510);
                        b47.b(jt1Var, ir9.n(aVar, 8.0f));
                        jt1Var.K(1567839311);
                        boolean zJ = jt1Var.j(ioaVar) | jt1Var.J(answer) | jt1Var.J(oh4Var);
                        Object objF = jt1Var.f();
                        if (zJ || objF == jt1.a.a) {
                            objF = new mh4() { // from class: io.intercom.android.sdk.survey.ui.questiontype.c
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return DatePickerQuestionKt.C04011.C01731.invoke$lambda$3$lambda$2$lambda$1$lambda$0(ioaVar, answer, oh4Var);
                                }
                            };
                            jt1Var.C(objF);
                        }
                        jt1Var.B();
                        jz0.c((mh4) objF, null, false, null, null, null, composableSingletons$DatePickerQuestionKt.m462getLambda5$intercom_sdk_base_release(), jt1Var, 805306368, 510);
                        jt1Var.I();
                        jt1Var.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                        invoke(jt1Var, num.intValue());
                        return g2b.a;
                    }
                }
            }, bj4VarO), bj4VarO, ((i2 >> 6) & 14) | 384, 2);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gk2
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue3 = ((Integer) obj3).intValue();
                    return DatePickerQuestionKt.ComposeTimePickerDialog$lambda$29(answer, oh4Var, mh4Var2, i, (jt1) obj2, iIntValue3);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ComposeTimePickerDialog$lambda$29(Answer answer, oh4 oh4Var, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        ComposeTimePickerDialog(answer, oh4Var, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
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
    private static final void DatePicker(final ox6 ox6Var, final Answer answer, final oh4<? super Answer, g2b> oh4Var, jt1 jt1Var, final int i) {
        int i2;
        String timeInMillisAsDate;
        final h37 h37Var;
        bj4 bj4VarO = jt1Var.o(2133326452);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(answer) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final d94 d94Var = (d94) bj4VarO.F(qu1.i);
            bj4VarO.K(995395826);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            final h37 h37Var2 = (h37) objF;
            bj4VarO.U(false);
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (dateTimeAnswer.getDate() != -1) {
                    timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(dateTimeAnswer.getDate(), "dd - MM - YYYY");
                } else {
                    timeInMillisAsDate = "DD - MM - YYYY";
                }
            } else {
                timeInMillisAsDate = "DD - MM - YYYY";
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            String str = timeInMillisAsDate;
            ox6 ox6VarC = gi0.c(uma.a(ns0.a(ox6Var, 1.0f, uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i3).getText().m824getDefault0d7_KjU()), intercomTheme.getShapes(bj4VarO, i3).b), intercomTheme.getShapes(bj4VarO, i3).b), kk.a(intercomTheme, bj4VarO, i3), al8.a);
            bj4VarO.K(995415631);
            boolean zJ = bj4VarO.j(d94Var);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new mh4() { // from class: lk2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return DatePickerQuestionKt.DatePicker$lambda$7$lambda$6(d94Var, h37Var2);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarC2 = we1.c(ox6VarC, false, null, (mh4) objF2, 15);
            ny8 ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarC2);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC3);
            str.getClass();
            ox6.a aVar2 = ox6.a.t;
            mia.b(str, ir9.q(eo7.i(aVar2, 16.0f)), uh1.b(contentAlpha(!str.equals("DD - MM - YYYY"), bj4VarO, 0), gh5.a(intercomTheme, bj4VarO, i3)), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i3).getType04(), bj4VarO, 48, 0, 131064);
            bj4VarO = bj4VarO;
            m65.b(is7.a(R.drawable.intercom_ic_pick_date, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_choose_the_date), eo7.i(aVar2, 16.0f), intercomTheme.getColors(bj4VarO, i3).m751getAction0d7_KjU(), bj4VarO, 392, 0);
            bj4VarO.U(true);
            if (DatePicker$lambda$4(h37Var2)) {
                bj4VarO.K(995445687);
                boolean z = (i2 & 896) == 256;
                Object objF3 = bj4VarO.f();
                if (z || objF3 == c0187a) {
                    h37Var = h37Var2;
                    objF3 = new oh4() { // from class: mk2
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return DatePickerQuestionKt.DatePicker$lambda$10$lambda$9(oh4Var, h37Var, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    h37Var = h37Var2;
                }
                oh4 oh4Var2 = (oh4) objF3;
                Object objB = aa0.b(bj4VarO, false, 995449738);
                if (objB == c0187a) {
                    objB = new zq(2, h37Var);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ComposeDatePickerDialog(answer, oh4Var2, (mh4) objB, bj4VarO, ((i2 >> 3) & 14) | 384);
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: nk2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.DatePicker$lambda$13(ox6Var, answer, oh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DatePicker$lambda$10$lambda$9(oh4 oh4Var, h37 h37Var, Answer answer) {
        answer.getClass();
        oh4Var.invoke(answer);
        DatePicker$lambda$5(h37Var, false);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DatePicker$lambda$12$lambda$11(h37 h37Var) {
        DatePicker$lambda$5(h37Var, false);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DatePicker$lambda$13(ox6 ox6Var, Answer answer, oh4 oh4Var, int i, jt1 jt1Var, int i2) {
        DatePicker(ox6Var, answer, oh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final boolean DatePicker$lambda$4(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    private static final void DatePicker$lambda$5(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DatePicker$lambda$7$lambda$6(d94 d94Var, h37 h37Var) {
        d94Var.w(false);
        DatePicker$lambda$5(h37Var, true);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x013b  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:76:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void DatePickerQuestion(ox6 ox6Var, final SurveyData.Step.Question.DatePickerQuestionModel datePickerQuestionModel, Answer answer, final oh4<? super Answer, g2b> oh4Var, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        Answer answer2;
        int i4;
        int i5;
        ci4<? super jt1, ? super Integer, g2b> ci4VarM458getLambda1$intercom_sdk_base_release;
        int i6;
        ox6.a aVar;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        ox6 ox6Var3;
        int i7;
        ny8 ny8VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        final ox6 ox6Var4;
        final Answer answer3;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        xj8 xj8VarW;
        datePickerQuestionModel.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1725209962);
        j1b j1bVar = bj4VarO.a;
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                answer2 = answer;
                i3 |= bj4VarO.J(answer2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    ci4VarM458getLambda1$intercom_sdk_base_release = ci4Var;
                    if (bj4VarO.j(ci4VarM458getLambda1$intercom_sdk_base_release)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9347) == 9346 || !bj4VarO.r()) {
                    aVar = ox6.a.t;
                    if (i8 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i9 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i5 != 0) {
                        ci4VarM458getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m458getLambda1$intercom_sdk_base_release();
                    }
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ci4VarM458getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i3 >> 12) & 14));
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                    ox6Var3 = ox6Var2;
                    i7 = i3;
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC3);
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
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    int i10 = i7 >> 3;
                    int i11 = (i10 & 896) | (i10 & 112) | 6;
                    DatePicker(ir9.c(aVar, 0.5f), answer2, oh4Var, bj4VarO, i11);
                    b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                    TimePicker(ir9.c(aVar, 1.0f), answer2, oh4Var, bj4VarO, i11);
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.u();
                    ox6Var4 = ox6Var2;
                }
                answer3 = answer2;
                ci4Var2 = ci4VarM458getLambda1$intercom_sdk_base_release;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ik2
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return DatePickerQuestionKt.DatePickerQuestion$lambda$2(ox6Var4, datePickerQuestionModel, answer3, oh4Var, ci4Var2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            ci4VarM458getLambda1$intercom_sdk_base_release = ci4Var;
            if ((i3 & 9347) == 9346) {
                aVar = ox6.a.t;
                if (i8 != 0) {
                    ox6Var2 = aVar;
                }
                if (i9 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i5 != 0) {
                    ci4VarM458getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m458getLambda1$intercom_sdk_base_release();
                }
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf2);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ci4VarM458getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i3 >> 12) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarC4 = ir9.c(aVar, 1.0f);
                ox6Var3 = ox6Var2;
                i7 = i3;
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC4);
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
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                int i12 = i7 >> 3;
                int i13 = (i12 & 896) | (i12 & 112) | 6;
                DatePicker(ir9.c(aVar, 0.5f), answer2, oh4Var, bj4VarO, i13);
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                TimePicker(ir9.c(aVar, 1.0f), answer2, oh4Var, bj4VarO, i13);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i8 != 0) {
                    ox6Var2 = aVar;
                }
                if (i9 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i5 != 0) {
                    ci4VarM458getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m458getLambda1$intercom_sdk_base_release();
                }
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf3);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ci4VarM458getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i3 >> 12) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarC5 = ir9.c(aVar, 1.0f);
                ox6Var3 = ox6Var2;
                i7 = i3;
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC5);
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
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                int i14 = i7 >> 3;
                int i15 = (i14 & 896) | (i14 & 112) | 6;
                DatePicker(ir9.c(aVar, 0.5f), answer2, oh4Var, bj4VarO, i15);
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                TimePicker(ir9.c(aVar, 1.0f), answer2, oh4Var, bj4VarO, i15);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
            }
            answer3 = answer2;
            ci4Var2 = ci4VarM458getLambda1$intercom_sdk_base_release;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ik2
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return DatePickerQuestionKt.DatePickerQuestion$lambda$2(ox6Var4, datePickerQuestionModel, answer3, oh4Var, ci4Var2, i, i2, (jt1) obj, iIntValue);
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
                i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                ci4VarM458getLambda1$intercom_sdk_base_release = ci4Var;
                if (bj4VarO.j(ci4VarM458getLambda1$intercom_sdk_base_release)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9347) == 9346) {
                aVar = ox6.a.t;
                if (i8 != 0) {
                    ox6Var2 = aVar;
                }
                if (i9 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i5 != 0) {
                    ci4VarM458getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m458getLambda1$intercom_sdk_base_release();
                }
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf4);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ci4VarM458getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i3 >> 12) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarC6 = ir9.c(aVar, 1.0f);
                ox6Var3 = ox6Var2;
                i7 = i3;
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC6);
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
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                int i16 = i7 >> 3;
                int i17 = (i16 & 896) | (i16 & 112) | 6;
                DatePicker(ir9.c(aVar, 0.5f), answer2, oh4Var, bj4VarO, i17);
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                TimePicker(ir9.c(aVar, 1.0f), answer2, oh4Var, bj4VarO, i17);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i8 != 0) {
                    ox6Var2 = aVar;
                }
                if (i9 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i5 != 0) {
                    ci4VarM458getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m458getLambda1$intercom_sdk_base_release();
                }
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf5 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf5);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ci4VarM458getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i3 >> 12) & 14));
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ox6 ox6VarC7 = ir9.c(aVar, 1.0f);
                ox6Var3 = ox6Var2;
                i7 = i3;
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC7);
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
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                int i18 = i7 >> 3;
                int i19 = (i18 & 896) | (i18 & 112) | 6;
                DatePicker(ir9.c(aVar, 0.5f), answer2, oh4Var, bj4VarO, i19);
                b47.b(bj4VarO, ir9.n(aVar, 16.0f));
                TimePicker(ir9.c(aVar, 1.0f), answer2, oh4Var, bj4VarO, i19);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
            }
            answer3 = answer2;
            ci4Var2 = ci4VarM458getLambda1$intercom_sdk_base_release;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ik2
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return DatePickerQuestionKt.DatePickerQuestion$lambda$2(ox6Var4, datePickerQuestionModel, answer3, oh4Var, ci4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ci4VarM458getLambda1$intercom_sdk_base_release = ci4Var;
        if ((i3 & 9347) == 9346) {
            aVar = ox6.a.t;
            if (i8 != 0) {
                ox6Var2 = aVar;
            }
            if (i9 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i5 != 0) {
                ci4VarM458getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m458getLambda1$intercom_sdk_base_release();
            }
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf6 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf6);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ci4VarM458getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i3 >> 12) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            ox6 ox6VarC8 = ir9.c(aVar, 1.0f);
            ox6Var3 = ox6Var2;
            i7 = i3;
            ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC8);
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
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            int i110 = i7 >> 3;
            int i111 = (i110 & 896) | (i110 & 112) | 6;
            DatePicker(ir9.c(aVar, 0.5f), answer2, oh4Var, bj4VarO, i111);
            b47.b(bj4VarO, ir9.n(aVar, 16.0f));
            TimePicker(ir9.c(aVar, 1.0f), answer2, oh4Var, bj4VarO, i111);
            bj4VarO.U(true);
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
        } else {
            aVar = ox6.a.t;
            if (i8 != 0) {
                ox6Var2 = aVar;
            }
            if (i9 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i5 != 0) {
                ci4VarM458getLambda1$intercom_sdk_base_release = ComposableSingletons$DatePickerQuestionKt.INSTANCE.m458getLambda1$intercom_sdk_base_release();
            }
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf7 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf7);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ci4VarM458getLambda1$intercom_sdk_base_release.invoke(bj4VarO, Integer.valueOf((i3 >> 12) & 14));
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            ox6 ox6VarC9 = ir9.c(aVar, 1.0f);
            ox6Var3 = ox6Var2;
            i7 = i3;
            ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC9);
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
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            int i112 = i7 >> 3;
            int i113 = (i112 & 896) | (i112 & 112) | 6;
            DatePicker(ir9.c(aVar, 0.5f), answer2, oh4Var, bj4VarO, i113);
            b47.b(bj4VarO, ir9.n(aVar, 16.0f));
            TimePicker(ir9.c(aVar, 1.0f), answer2, oh4Var, bj4VarO, i113);
            bj4VarO.U(true);
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
        }
        answer3 = answer2;
        ci4Var2 = ci4VarM458getLambda1$intercom_sdk_base_release;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ik2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.DatePickerQuestion$lambda$2(ox6Var4, datePickerQuestionModel, answer3, oh4Var, ci4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DatePickerQuestion$lambda$2(ox6 ox6Var, SurveyData.Step.Question.DatePickerQuestionModel datePickerQuestionModel, Answer answer, oh4 oh4Var, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        DatePickerQuestion(ox6Var, datePickerQuestionModel, answer, oh4Var, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void DatePickerQuestionPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1652233850);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m464getLambda7$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kk2(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DatePickerQuestionPreview$lambda$30(int i, jt1 jt1Var, int i2) {
        DatePickerQuestionPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
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
    private static final void TimePicker(final ox6 ox6Var, Answer answer, oh4<? super Answer, g2b> oh4Var, jt1 jt1Var, final int i) {
        int i2;
        String localTime;
        final h37 h37Var;
        final Answer answer2;
        final oh4<? super Answer, g2b> oh4Var2;
        bj4 bj4VarO = jt1Var.o(1270472949);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(answer) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            oh4Var2 = oh4Var;
            answer2 = answer;
        } else {
            final d94 d94Var = (d94) bj4VarO.F(qu1.i);
            bj4VarO.K(-1349246543);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37 h37Var2 = (h37) objF;
            bj4VarO.U(false);
            if (answer instanceof Answer.DateTimeAnswer) {
                Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
                if (z2a.w(dateTimeAnswer.getLocalTime())) {
                    localTime = "HH:MM";
                } else {
                    localTime = dateTimeAnswer.getLocalTime();
                }
            } else {
                localTime = "HH:MM";
            }
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            ox6 ox6VarC = gi0.c(uma.a(ns0.a(ox6Var, 1.0f, uh1.b(0.1f, intercomTheme.getColors(bj4VarO, i3).getText().m824getDefault0d7_KjU()), intercomTheme.getShapes(bj4VarO, i3).b), intercomTheme.getShapes(bj4VarO, i3).b), kk.a(intercomTheme, bj4VarO, i3), al8.a);
            bj4VarO.K(-1349228050);
            boolean zJ = bj4VarO.j(d94Var);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a) {
                h37Var = h37Var2;
                objF2 = new mh4() { // from class: ok2
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return DatePickerQuestionKt.TimePicker$lambda$19$lambda$18(d94Var, h37Var);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                h37Var = h37Var2;
            }
            bj4VarO.U(false);
            ox6 ox6VarC2 = we1.c(ox6VarC, false, null, (mh4) objF2, 15);
            ny8 ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarC2);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC3);
            ox6.a aVar2 = ox6.a.t;
            final h37 h37Var3 = h37Var;
            mia.b(localTime, ir9.q(eo7.i(aVar2, 16.0f)), uh1.b(contentAlpha(!xj5.a(localTime, "HH:MM"), bj4VarO, 0), gh5.a(intercomTheme, bj4VarO, i3)), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i3).getType04(), bj4VarO, 48, 0, 131064);
            bj4VarO = bj4VarO;
            m65.b(is7.a(R.drawable.intercom_ic_pick_time, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_choose_the_date), eo7.i(aVar2, 16.0f), intercomTheme.getColors(bj4VarO, i3).m751getAction0d7_KjU(), bj4VarO, 392, 0);
            int i4 = 1;
            bj4VarO.U(true);
            if (TimePicker$lambda$16(h37Var3)) {
                bj4VarO.K(-1349197994);
                boolean z = (i2 & 896) == 256;
                Object objF3 = bj4VarO.f();
                if (z || objF3 == c0187a) {
                    oh4Var2 = oh4Var;
                    objF3 = new oh4() { // from class: pk2
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return DatePickerQuestionKt.TimePicker$lambda$22$lambda$21(oh4Var2, h37Var3, (Answer) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    oh4Var2 = oh4Var;
                }
                oh4 oh4Var3 = (oh4) objF3;
                Object objB = aa0.b(bj4VarO, false, -1349193943);
                if (objB == c0187a) {
                    objB = new ml1(i4, h37Var3);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                answer2 = answer;
                ComposeTimePickerDialog(answer2, oh4Var3, (mh4) objB, bj4VarO, ((i2 >> 3) & 14) | 384);
            } else {
                answer2 = answer;
                oh4Var2 = oh4Var;
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hk2
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return DatePickerQuestionKt.TimePicker$lambda$25(ox6Var, answer2, oh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean TimePicker$lambda$16(h37<Boolean> h37Var) {
        return h37Var.getValue().booleanValue();
    }

    private static final void TimePicker$lambda$17(h37<Boolean> h37Var, boolean z) {
        h37Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TimePicker$lambda$19$lambda$18(d94 d94Var, h37 h37Var) {
        d94Var.w(false);
        TimePicker$lambda$17(h37Var, true);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TimePicker$lambda$22$lambda$21(oh4 oh4Var, h37 h37Var, Answer answer) {
        answer.getClass();
        oh4Var.invoke(answer);
        TimePicker$lambda$17(h37Var, false);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TimePicker$lambda$24$lambda$23(h37 h37Var) {
        TimePicker$lambda$17(h37Var, false);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TimePicker$lambda$25(ox6 ox6Var, Answer answer, oh4 oh4Var, int i, jt1 jt1Var, int i2) {
        TimePicker(ox6Var, answer, oh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final float contentAlpha(boolean z, jt1 jt1Var, int i) {
        jt1Var.K(2064501839);
        float f = z ? 1.0f : 0.6f;
        jt1Var.B();
        return f;
    }

    private static final List<String> getLocalTime(Answer answer) {
        return answer instanceof Answer.DateTimeAnswer ? z2a.I(((Answer.DateTimeAnswer) answer).getLocalTime(), new String[]{":"}, 6) : hf3.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getUtcTime(int i, int i2) {
        String toUtcTime = TimeFormatter.formatToUtcTime(i, i2);
        toUtcTime.getClass();
        return z2a.I(toUtcTime, new String[]{":"}, 6);
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt$ComposeDatePickerDialog$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ qk2 $datePickerState;
        final /* synthetic */ oh4<Answer, g2b> $onAnswer;
        final /* synthetic */ mh4<g2b> $onDismiss;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(qk2 qk2Var, Answer answer, oh4<? super Answer, g2b> oh4Var, mh4<g2b> mh4Var) {
            this.$datePickerState = qk2Var;
            this.$answer = answer;
            this.$onAnswer = oh4Var;
            this.$onDismiss = mh4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(qk2 qk2Var, Answer answer, oh4 oh4Var, mh4 mh4Var) {
            Answer.DateTimeAnswer dateTimeAnswer;
            Long lF = qk2Var.f();
            if (lF != null) {
                if (answer instanceof Answer.DateTimeAnswer) {
                    dateTimeAnswer = Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, lF.longValue(), 0, 0, 6, null);
                } else {
                    long jCurrentTimeMillis = Injector.get().getTimeProvider().currentTimeMillis();
                    List utcTime = DatePickerQuestionKt.getUtcTime(TimeFormatter.getHour(jCurrentTimeMillis), TimeFormatter.getMinute(jCurrentTimeMillis));
                    dateTimeAnswer = new Answer.DateTimeAnswer(lF.longValue(), Integer.parseInt((String) utcTime.get(0)), Integer.parseInt((String) utcTime.get(1)));
                }
                oh4Var.invoke(dateTimeAnswer);
            } else {
                mh4Var.invoke();
            }
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            jt1Var.K(312998685);
            boolean zJ = jt1Var.J(this.$datePickerState) | jt1Var.J(this.$answer) | jt1Var.J(this.$onAnswer) | jt1Var.J(this.$onDismiss);
            final qk2 qk2Var = this.$datePickerState;
            final Answer answer = this.$answer;
            final oh4<Answer, g2b> oh4Var = this.$onAnswer;
            final mh4<g2b> mh4Var = this.$onDismiss;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: io.intercom.android.sdk.survey.ui.questiontype.b
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return DatePickerQuestionKt.AnonymousClass1.invoke$lambda$1$lambda$0(qk2Var, answer, oh4Var, mh4Var);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            jz0.c((mh4) objF, null, false, null, null, null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m459getLambda2$intercom_sdk_base_release(), jt1Var, 805306368, 510);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
