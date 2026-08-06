package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qw0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ qw0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                if (((Context) ((iu1) obj).o(AndroidCompositionLocals_androidKt.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return rw0.b;
                }
                pw0.a.getClass();
                return pw0.a.c;
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$130$lambda$129((Part) obj);
            default:
                return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$1$lambda$0((String) obj);
        }
    }
}
