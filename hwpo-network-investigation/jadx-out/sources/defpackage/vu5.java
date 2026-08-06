package defpackage;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vu5 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ vu5(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                List list = (List) obj;
                return new zu5(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 1:
                return ListAttributeCollectorKt.ListAttributeCollector$lambda$1$lambda$0((AttributeData) obj);
            default:
                int i = qo9.H;
                return Boolean.valueOf(((qo9.b) obj).a);
        }
    }
}
