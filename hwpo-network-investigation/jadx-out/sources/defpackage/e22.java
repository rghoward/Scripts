package defpackage;

import android.content.Context;
import io.intercom.android.sdk.api.WrapperPrefsStore;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e22 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ e22(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$1$lambda$0((HeaderMenuItem) obj);
            default:
                return WrapperPrefsStore.wrapperPrefsDataStore_delegate$lambda$4((Context) obj);
        }
    }
}
