package defpackage;

import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o12 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ o12(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationDestinationKt.conversationDestination$lambda$9((ru) obj);
            case 1:
                fj3.a aVar = fj3.Companion;
                List<l89> list = ((oj3) obj).h;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((l89) obj2).v != u60.w) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                ((Integer) obj).getClass();
                gu5 gu5Var = cv5.a;
                return -1;
        }
    }
}
