package defpackage;

import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ bs0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$1$lambda$0((AttributeData) obj);
            default:
                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$1$lambda$0(((Boolean) obj).booleanValue());
        }
    }
}
