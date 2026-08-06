package defpackage;

import io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.UploadErrorDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class it6 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    public /* synthetic */ it6(int i, int i2) {
        this.t = i2;
        this.u = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        jt1 jt1Var = (jt1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = this.u;
        switch (i) {
            case 0:
                return MessageComposerKt.TextComposerWithInitialTextPreview$lambda$77(i2, jt1Var, iIntValue);
            case 1:
                return NumericRatingCellKt.EmptyCell$lambda$2(i2, jt1Var, iIntValue);
            case 2:
                return ReactionsComponentKt.ReactionsComponentPreview$lambda$15(i2, jt1Var, iIntValue);
            case 3:
                return TicketProgressBannerKt.TicketProgressRowLongTextPreview$lambda$2(i2, jt1Var, iIntValue);
            default:
                return UploadErrorDialogKt.UploadErrorDialogSizeLimitPreview$lambda$9(i2, jt1Var, iIntValue);
        }
    }
}
