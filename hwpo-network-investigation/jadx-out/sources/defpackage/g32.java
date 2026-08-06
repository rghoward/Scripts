package defpackage;

import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g32 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ g32(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$89$lambda$88((ConversationViewModel) obj2, ((Integer) obj).intValue());
            case 1:
                ((oh4) obj).invoke((cca) obj2);
                return g2b.a;
            default:
                tsb tsbVar = (tsb) obj2;
                int i2 = tsb.F;
                boolean z = tsbVar.b().c instanceof yp4.a;
                bu8 bu8Var = tsbVar.A;
                return z ? bu8Var.b(R.string.next, new Object[0]) : bu8Var.b(R.string.save, new Object[0]);
        }
    }
}
