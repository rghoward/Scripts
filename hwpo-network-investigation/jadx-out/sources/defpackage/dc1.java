package defpackage;

import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dc1 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ dc1(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                return UploadFileQuestionKt.UploadFileQuestion$lambda$1$lambda$0((AnswerClickData) obj);
            default:
                return ((fnb) obj).f;
        }
    }
}
