package io.intercom.android.sdk.tickets.create.model;

import defpackage.g2b;
import defpackage.ph1;
import defpackage.u;
import defpackage.xj5;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketViewModelKt {
    public static final String EmailId = "-1";

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object formatAnswerForServer(QuestionState questionState) {
        Answer answer = questionState.getAnswer();
        if (answer instanceof Answer.DateTimeAnswer) {
            return ((Answer.DateTimeAnswer) answer).getAnswer();
        }
        if (answer instanceof Answer.MultipleAnswer) {
            return ((Answer.MultipleAnswer) answer).m457getAnswers().toString();
        }
        if (xj5.a(answer, Answer.NoAnswer.InitialNoAnswer.INSTANCE) || xj5.a(answer, Answer.NoAnswer.ResetNoAnswer.INSTANCE)) {
            return g2b.a;
        }
        if (answer instanceof Answer.SingleAnswer) {
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                return Boolean.valueOf(Boolean.parseBoolean(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
                return ((Answer.SingleAnswer) answer).getAnswer();
            }
            int i = WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getValidationType().ordinal()];
            if (i == 1) {
                return Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (i != 2) {
                return i != 3 ? ((Answer.SingleAnswer) answer).getAnswer() : Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
            }
            return Float.valueOf(Float.parseFloat(((Answer.SingleAnswer) answer).getAnswer()));
        }
        if (!(answer instanceof Answer.MediaAnswer)) {
            u.b();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
        ArrayList arrayList2 = new ArrayList(ph1.n(mediaItems, 10));
        Iterator<T> it = mediaItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus());
        }
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            Answer.MediaAnswer.FileUploadStatus fileUploadStatus = (Answer.MediaAnswer.FileUploadStatus) obj;
            if (fileUploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                arrayList.add(Long.valueOf(((Answer.MediaAnswer.FileUploadStatus.Success) fileUploadStatus).getId()));
            }
        }
        return arrayList;
    }
}
