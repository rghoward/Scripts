package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.g2b;
import defpackage.oh4;
import defpackage.pi4;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class ConversationScreenKt$ConversationScreen$16$1 extends pi4 implements oh4<MediaUploadItem, g2b> {
    public ConversationScreenKt$ConversationScreen$16$1(Object obj) {
        super(1, obj, ConversationViewModel.class, "deleteMediaUploadItem", "deleteMediaUploadItem(Lio/intercom/android/sdk/m5/conversation/states/MediaUploadItem;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        ((ConversationViewModel) this.receiver).deleteMediaUploadItem(mediaUploadItem);
    }

    @Override // defpackage.oh4
    public /* bridge */ /* synthetic */ g2b invoke(MediaUploadItem mediaUploadItem) {
        invoke2(mediaUploadItem);
        return g2b.a;
    }
}
