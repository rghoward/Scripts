package io.intercom.android.sdk.survey.ui.questiontype;

import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.survey.ui.models.Answer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnswerClickData {
    public static final int $stable = 8;
    private final Answer.MediaAnswer.MediaItem clickedItem;
    private final String questionId;

    public AnswerClickData(Answer.MediaAnswer.MediaItem mediaItem, String str) {
        mediaItem.getClass();
        str.getClass();
        this.clickedItem = mediaItem;
        this.questionId = str;
    }

    public static /* synthetic */ AnswerClickData copy$default(AnswerClickData answerClickData, Answer.MediaAnswer.MediaItem mediaItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaItem = answerClickData.clickedItem;
        }
        if ((i & 2) != 0) {
            str = answerClickData.questionId;
        }
        return answerClickData.copy(mediaItem, str);
    }

    public final Answer.MediaAnswer.MediaItem component1() {
        return this.clickedItem;
    }

    public final String component2() {
        return this.questionId;
    }

    public final AnswerClickData copy(Answer.MediaAnswer.MediaItem mediaItem, String str) {
        mediaItem.getClass();
        str.getClass();
        return new AnswerClickData(mediaItem, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerClickData)) {
            return false;
        }
        AnswerClickData answerClickData = (AnswerClickData) obj;
        return xj5.a(this.clickedItem, answerClickData.clickedItem) && xj5.a(this.questionId, answerClickData.questionId);
    }

    public final Answer.MediaAnswer.MediaItem getClickedItem() {
        return this.clickedItem;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return this.questionId.hashCode() + (this.clickedItem.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnswerClickData(clickedItem=");
        sb.append(this.clickedItem);
        sb.append(", questionId=");
        return wu0.a(sb, this.questionId, ')');
    }
}
