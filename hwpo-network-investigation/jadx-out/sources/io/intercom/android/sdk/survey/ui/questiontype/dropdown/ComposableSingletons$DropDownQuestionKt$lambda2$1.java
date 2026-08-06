package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$DropDownQuestionKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$DropDownQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$DropDownQuestionKt$lambda2$1();

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
        SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel = DropDownQuestionKt.dropDownQuestionModel;
        jt1Var.K(-254442635);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new a();
            jt1Var.C(objF);
        }
        jt1Var.B();
        DropDownQuestionKt.DropDownQuestion(null, dropDownQuestionModel, null, (oh4) objF, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, jt1Var, 3072, 37);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
