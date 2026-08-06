package defpackage;

import ay5.a;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c32 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ c32(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$77$lambda$76((ConversationViewModel) obj2, (PendingMessage.FailedMediaUploadData) obj);
            default:
                ay5 ay5Var = (ay5) obj2;
                int iIntValue = ((Integer) obj).intValue();
                hw5 hw5VarInvoke = ay5Var.H.invoke();
                if (iIntValue < 0 || iIntValue >= hw5VarInvoke.b()) {
                    StringBuilder sbB = t43.b(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbB.append(hw5VarInvoke.b());
                    sbB.append(')');
                    xc5.a(sbB.toString());
                }
                oy0.d(ay5Var.Q1(), null, null, ay5Var.new a(iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
