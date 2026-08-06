package defpackage;

import android.content.res.Resources;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ft6 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ft6(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return MessageComposerKt.MessageComposer$lambda$17$lambda$16((MediaUploadItem) obj);
            default:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
        }
    }
}
