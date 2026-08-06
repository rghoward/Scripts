package defpackage;

import android.content.Context;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n40 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ n40(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                jz7.a.t((jz7.a) obj, (jz7) obj2, 0, 0);
                return g2b.a;
            case 1:
                h37 h37Var = (h37) obj2;
                hc9 hc9Var = (hc9) obj;
                if (!z2a.w((CharSequence) h37Var.getValue())) {
                    String str = (String) h37Var.getValue();
                    ho5<Object>[] ho5VarArr = ec9.a;
                    hc9Var.d(ac9.M, str);
                }
                return g2b.a;
            default:
                return LoadingComponentKt.SurveyLoading$lambda$2$lambda$1((SurveyState.Loading) obj2, (Context) obj);
        }
    }
}
