package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ni5 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ni5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return ((IntercomSurveyActivity) obj).createVM();
            case 1:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14((mh4) obj);
            default:
                String str = (String) ((x57) obj).j.getValue();
                if (str != null) {
                    return new ol8(str, 0);
                }
                return null;
        }
    }
}
