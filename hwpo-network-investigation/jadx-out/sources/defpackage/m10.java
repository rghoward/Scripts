package defpackage;

import android.app.Application;
import io.intercom.android.sdk.AppIdentityInjector;
import io.intercom.android.sdk.survey.QuestionState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m10 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ m10(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return AppIdentityInjector.httpClientWithoutHeaders_delegate$lambda$2((Application) obj);
            default:
                return ((QuestionState) obj).get_answer();
        }
    }
}
