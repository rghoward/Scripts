package defpackage;

import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eg implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ eg(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                ((ya) obj).getClass();
                return g2b.a;
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Integer num = obj2 != null ? (Integer) obj2 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj3 = list.get(1);
                Integer num2 = obj3 != null ? (Integer) obj3 : null;
                num2.getClass();
                return new lja(ay.c(iIntValue, num2.intValue()));
            default:
                return SurveyComponentKt.SimpleSurvey$lambda$13$lambda$12((String) obj);
        }
    }
}
