package defpackage;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t22 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ t22(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$60$lambda$59((ConversationViewModel) obj2, (String) obj);
            case 1:
                gl3 gl3Var = (gl3) obj2;
                int i2 = gl3.V;
                xj3 xj3Var = gl3Var.b().d;
                if (xj3Var == null) {
                    return hf3.t;
                }
                List<m89> list = xj3Var.h;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((m89) obj3).j == u60.w) {
                        arrayList.add(obj3);
                    }
                }
                e70 e70Var = gl3Var.z;
                ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    e70Var.getClass();
                    arrayList2.add(e70.a((m89) obj4));
                }
                return arrayList2;
            default:
                return Boolean.valueOf(xj5.a(((ft3) obj).a, (ms9) obj2));
        }
    }
}
