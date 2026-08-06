package defpackage;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ms0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ms0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                ((cz1) obj).K1();
                return g2b.a;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            default:
                return TextAttributeCollectorKt.TextAttributeCollector$lambda$3$lambda$2((AttributeData) obj);
        }
    }
}
