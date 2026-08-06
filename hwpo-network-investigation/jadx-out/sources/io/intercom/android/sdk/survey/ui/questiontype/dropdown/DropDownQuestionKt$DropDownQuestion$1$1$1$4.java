package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import com.intercom.twig.BuildConfig;
import defpackage.bj1;
import defpackage.ci4;
import defpackage.d94;
import defpackage.ei4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.h37;
import defpackage.jt1;
import defpackage.kp;
import defpackage.mh4;
import defpackage.mia;
import defpackage.oh4;
import defpackage.wd3;
import defpackage.ws0;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DropDownQuestionKt$DropDownQuestion$1$1$1$4 implements ei4<bj1, jt1, Integer, g2b> {
    final /* synthetic */ SurveyData.Step.Question.DropDownQuestionModel $dropDownQuestionModel;
    final /* synthetic */ h37<Boolean> $expanded$delegate;
    final /* synthetic */ d94 $focusManager;
    final /* synthetic */ oh4<Answer, g2b> $onAnswer;

    /* JADX WARN: Multi-variable type inference failed */
    public DropDownQuestionKt$DropDownQuestion$1$1$1$4(d94 d94Var, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel, oh4<? super Answer, g2b> oh4Var, h37<Boolean> h37Var) {
        this.$focusManager = d94Var;
        this.$dropDownQuestionModel = dropDownQuestionModel;
        this.$onAnswer = oh4Var;
        this.$expanded$delegate = h37Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$3$lambda$2$lambda$1(oh4 oh4Var, String str, h37 h37Var) {
        oh4Var.invoke(new Answer.SingleAnswer(str));
        DropDownQuestionKt.DropDownQuestion$lambda$2(h37Var, false);
        return g2b.a;
    }

    public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
        bj1Var.getClass();
        if ((i & 17) == 16 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(602855941);
        boolean zJ = jt1Var.j(this.$focusManager);
        d94 d94Var = this.$focusManager;
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zJ || objF == obj) {
            objF = new DropDownQuestionKt$DropDownQuestion$1$1$1$4$1$1(d94Var, null);
            jt1Var.C(objF);
        }
        jt1Var.B();
        wd3.d(jt1Var, (ci4) objF, BuildConfig.FLAVOR);
        List<String> options = this.$dropDownQuestionModel.getOptions();
        final oh4<Answer, g2b> oh4Var = this.$onAnswer;
        final h37<Boolean> h37Var = this.$expanded$delegate;
        int i2 = 0;
        for (Object obj2 : options) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ws0.m();
                throw null;
            }
            final String str = (String) obj2;
            fr1 fr1VarB = gr1.b(-864903633, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$2$1
                public final void invoke(jt1 jt1Var2, int i4) {
                    if ((i4 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        mia.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, jt1Var);
            jt1Var.K(55713806);
            boolean zJ2 = jt1Var.J(oh4Var) | jt1Var.J(str);
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == obj) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.d
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return DropDownQuestionKt$DropDownQuestion$1$1$1$4.invoke$lambda$3$lambda$2$lambda$1(oh4Var, str, h37Var);
                    }
                };
                jt1Var.C(objF2);
            }
            jt1Var.B();
            kp.b(fr1VarB, (mh4) objF2, null, false, null, null, jt1Var, 6);
            i2 = i3;
        }
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
        invoke(bj1Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
