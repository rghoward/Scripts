package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b32 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ b32(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$75$lambda$74((ConversationViewModel) obj2, (Part) obj);
            case 1:
                ya yaVar = (ya) obj;
                yaVar.getClass();
                ConstraintLayout constraintLayout = ((la6) yaVar.u).a;
                constraintLayout.getClass();
                xgb.a(constraintLayout, new no8((to8.b) obj2, yaVar, null));
                yaVar.s(new yx5(2, yaVar));
                return g2b.a;
            default:
                ec9.b((String) obj2, (hc9) obj);
                return g2b.a;
        }
    }
}
