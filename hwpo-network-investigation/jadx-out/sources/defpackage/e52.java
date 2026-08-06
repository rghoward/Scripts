package defpackage;

import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt;
import io.intercom.android.sdk.m5.utils.TextFieldSaver;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e52 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ e52(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationTopAppBarKt.ConversationTopAppBar$lambda$7$lambda$6((MetricData) obj);
            default:
                return TextFieldSaver.textFieldValueSaver$lambda$1((List) obj);
        }
    }
}
