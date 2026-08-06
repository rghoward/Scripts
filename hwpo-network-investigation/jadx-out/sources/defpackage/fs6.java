package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fs6 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ fs6(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return MergedConversationRowKt.MergedConversationRow$lambda$1$lambda$0((String) obj);
            case 1:
                lj9.a aVar = lj9.Companion;
                return ((xj9) obj).d;
            default:
                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$3$lambda$2((SurveyState.Content.SecondaryCta) obj);
        }
    }
}
