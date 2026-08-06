package io.intercom.android.sdk.survey.ui.questiontype.text;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ux1;
import defpackage.ws0;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.UUID;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt$lambda-5$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ShortTextQuestionKt$lambda5$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ShortTextQuestionKt$lambda5$1 INSTANCE = new ComposableSingletons$ShortTextQuestionKt$lambda5$1();

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
        SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = new SurveyData.Step.Question.ShortTextQuestionModel(string, ws0.h(new Block.Builder().withText("Is this a preview?").withType(BlockType.PARAGRAPH.getSerializedName())), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, null, null, 384, null);
        SurveyUiColors surveyUiColorsA = ux1.a(null, null, 3, null);
        ValidationError.NoValidationError noValidationError = ValidationError.NoValidationError.INSTANCE;
        Answer.SingleAnswer singleAnswer = new Answer.SingleAnswer("Answer");
        jt1Var.K(-878192312);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new d();
            jt1Var.C(objF);
        }
        jt1Var.B();
        ShortTextQuestionKt.ShortTextQuestion(null, shortTextQuestionModel, singleAnswer, (oh4) objF, surveyUiColorsA, noValidationError, null, null, jt1Var, 199680, 193);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
