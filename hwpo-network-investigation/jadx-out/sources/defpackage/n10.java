package defpackage;

import android.content.Context;
import io.intercom.android.sdk.identity.AppIdentityStore;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n10 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ n10(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return AppIdentityStore.appDataStore_delegate$lambda$0((Context) obj);
            case 1:
                return MessageComposerKt.MessageComposer$lambda$5$lambda$4((ComposerInputType) obj);
            default:
                obj.getClass();
                return new e86.b(((Integer) obj).intValue());
        }
    }
}
