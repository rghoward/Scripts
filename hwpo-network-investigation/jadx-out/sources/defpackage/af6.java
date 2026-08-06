package defpackage;

import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class af6 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ af6(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return LongTextQuestionKt.LongTextPreview$lambda$8$lambda$7((Answer) obj);
            default:
                int i = rj7.F;
                return Boolean.valueOf(((tj7) obj).b);
        }
    }
}
