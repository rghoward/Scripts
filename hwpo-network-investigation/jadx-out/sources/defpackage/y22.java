package defpackage;

import android.view.inputmethod.InputMethodManager;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y22 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ y22(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$71$lambda$70((ConversationViewModel) obj);
            case 1:
                Object systemService = ((nd5) obj).a.getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            default:
                o48 o48Var = (o48) obj;
                return Integer.valueOf(zs4.c(o48Var, (SerialDescriptor[]) o48Var.j.getValue()));
        }
    }
}
