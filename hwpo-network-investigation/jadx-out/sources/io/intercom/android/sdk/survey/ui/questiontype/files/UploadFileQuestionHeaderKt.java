package io.intercom.android.sdk.survey.ui.questiontype.files;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hf3;
import defpackage.jt1;
import defpackage.ob4;
import defpackage.xj8;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadFileQuestionHeaderKt {
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX INFO: renamed from: UploadFileQuestionHeader-INMd_9Y, reason: not valid java name */
    public static final void m492UploadFileQuestionHeaderINMd_9Y(final QuestionState questionState, final ob4 ob4Var, final long j, jt1 jt1Var, final int i) {
        final List<StringProvider.StringRes> errorMessages;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        questionState.getClass();
        ob4Var.getClass();
        bj4 bj4VarO = jt1Var.o(43160084);
        int i2 = (i & 6) == 0 ? (bj4VarO.j(questionState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ob4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.i(j) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Answer answer = questionState.getAnswer();
            Object obj = null;
            Answer.MediaAnswer mediaAnswer = answer instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer : null;
            if (mediaAnswer == null || (mediaItems = mediaAnswer.getMediaItems()) == null) {
                errorMessages = hf3.t;
            } else {
                for (Object obj2 : mediaItems) {
                    if (((Answer.MediaAnswer.MediaItem) obj2).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                        obj = obj2;
                        break;
                    }
                }
                Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj;
                if (mediaItem != null) {
                    Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
                    uploadStatus.getClass();
                    errorMessages = ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError().getErrorMessages();
                    if (errorMessages == null) {
                        errorMessages = hf3.t;
                    }
                } else {
                    errorMessages = hf3.t;
                }
            }
            int i3 = i2 << 9;
            QuestionHeaderComponentKt.m454QuestionHeadern1tc1qA(questionState.getQuestionModel().getTitle(), questionState.getQuestionModel().getDescription(), questionState.getQuestionModel().isRequired(), questionState.getValidationError(), ob4Var, j, gr1.b(1052404026, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1
                public final void invoke(jt1 jt1Var2, int i4) {
                    if ((i4 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        ErrorMessageLayoutKt.ErrorMessageLayout(null, errorMessages, jt1Var2, 0, 1);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, bj4VarO, (StringProvider.$stable << 3) | 1572864 | (57344 & i3) | (i3 & 458752), 128);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f4b
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return UploadFileQuestionHeaderKt.UploadFileQuestionHeader_INMd_9Y$lambda$2(questionState, ob4Var, j, i, (jt1) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UploadFileQuestionHeader_INMd_9Y$lambda$2(QuestionState questionState, ob4 ob4Var, long j, int i, jt1 jt1Var, int i2) {
        m492UploadFileQuestionHeaderINMd_9Y(questionState, ob4Var, j, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
