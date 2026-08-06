package io.intercom.android.sdk.tickets.create.model;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.js7;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xm2;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerUpdated$1$2", f = "CreateTicketViewModel.kt", l = {}, m = "invokeSuspend")
public final class CreateTicketViewModel$onAnswerUpdated$1$2 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTicketViewModel$onAnswerUpdated$1$2(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, r02<? super CreateTicketViewModel$onAnswerUpdated$1$2> r02Var) {
        super(2, r02Var);
        this.$content = content;
        this.this$0 = createTicketViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new CreateTicketViewModel$onAnswerUpdated$1$2(this.$content, this.this$0, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((CreateTicketViewModel$onAnswerUpdated$1$2) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, qq2] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        int i;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4;
        boolean z = false;
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        List<QuestionState> questions = this.$content.getQuestions();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : questions) {
            if (((QuestionState) obj2).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList3.add(obj2);
            }
        }
        CreateTicketViewModel createTicketViewModel = this.this$0;
        int size = arrayList3.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj3 = arrayList3.get(i5);
            int i6 = i5 + 1;
            QuestionState questionState = (QuestionState) obj3;
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            questionModel.getClass();
            SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = (SurveyData.Step.Question.UploadFileQuestionModel) questionModel;
            Answer answer = questionState.getAnswer();
            if (answer instanceof Answer.MediaAnswer) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                int i7 = 0;
                ?? r2 = z;
                for (Object obj4 : mediaAnswer.getMediaItems()) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        ws0.m();
                        throw null;
                    }
                    Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj4;
                    if (i7 >= uploadFileQuestionModel.getMaxSelection()) {
                        arrayList2 = arrayList3;
                        i3 = size;
                        i4 = i6;
                        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(ws0.i(new StringProvider.StringRes(R.string.intercom_upload_failed, r2, 2, r2), new StringProvider.StringRes(R.string.intercom_upload_max_files_allowed, ws0.h(new js7("limit", String.valueOf(uploadFileQuestionModel.getMaxSelection()))))))));
                    } else {
                        arrayList2 = arrayList3;
                        i3 = size;
                        i4 = i6;
                        if (createTicketViewModel.isUnsupportedFileType(mediaItem.getData(), uploadFileQuestionModel.getSupportedFileType())) {
                            mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.UnsupportedFileType(ws0.h(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null)))));
                        } else if (xj5.a(mediaItem.getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.None.INSTANCE)) {
                            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                        } else if (createTicketViewModel.canRetryFileLimitExceededError(mediaItem, i7, uploadFileQuestionModel.getMaxSelection())) {
                            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                        }
                    }
                    i7 = i8;
                    arrayList3 = arrayList2;
                    size = i3;
                    i6 = i4;
                    r2 = 0;
                }
                arrayList = arrayList3;
                i = size;
                i2 = i6;
                createTicketViewModel.compressAndUploadFileAttachments(mediaAnswer.getMediaItems());
                questionState.validate();
            } else {
                arrayList = arrayList3;
                i = size;
                i2 = i6;
            }
            arrayList3 = arrayList;
            size = i;
            i5 = i2;
            z = false;
        }
        this.this$0.updateCtaState();
        return g2b.a;
    }
}
