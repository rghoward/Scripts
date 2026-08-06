package defpackage;

import com.hwpo_training_app.settings.presentation.view.AccountSettingsView;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ f7(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        String strValueOf;
        switch (this.t) {
            case 0:
                int i = AccountSettingsView.C;
                ((o33) obj).getClass();
                return g2b.a;
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$148$lambda$147((MetricData) obj);
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i2 = 0;
                    for (byte b : (byte[]) value) {
                        i2++;
                        if (i2 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return w27.a(new StringBuilder("  "), ((t78.a) entry.getKey()).a, " = ", strValueOf);
        }
    }
}
