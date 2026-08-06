package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gs6 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ oh4 u;
    public final /* synthetic */ Object v;

    public /* synthetic */ gs6(int i, oh4 oh4Var, Object obj) {
        this.t = i;
        this.u = oh4Var;
        this.v = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.v;
        oh4 oh4Var = this.u;
        switch (i) {
            case 0:
                return MergedConversationRowKt.MergedConversationRow$lambda$4$lambda$3$lambda$2(oh4Var, (String) obj);
            default:
                return SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$7$lambda$6$lambda$5$lambda$4(oh4Var, (SurveyState.Content.SecondaryCta) obj);
        }
    }
}
