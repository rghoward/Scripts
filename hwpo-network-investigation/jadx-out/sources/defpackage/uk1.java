package defpackage;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uk1 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ uk1(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof w60.b) {
                        arrayList.add(obj2);
                    }
                }
                return Boolean.valueOf(arrayList.size() != 2);
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$136$lambda$135((AttributeData) obj);
            default:
                jr8.a aVar = jr8.Companion;
                return ((or8) obj).b;
        }
    }
}
