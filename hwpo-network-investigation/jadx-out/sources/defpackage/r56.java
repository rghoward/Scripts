package defpackage;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r56 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ r56(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                int i = ny7.C;
                return Boolean.valueOf(((oy7) obj).a);
            case 2:
                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$1$lambda$0((AnswerClickData) obj);
            case 3:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                str.getClass();
                Object obj3 = list.get(1);
                return new l86.a(str, (xj5.a(obj3, Boolean.FALSE) || obj3 == null) ? null : (fja) ((oh4) t29.j.u).invoke(obj3), null);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$15((ru) obj);
        }
    }
}
