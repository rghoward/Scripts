package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.g2b;
import defpackage.i37;
import defpackage.r02;
import defpackage.v72;
import defpackage.ws0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.models.carousel.AppearanceType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SendGifUseCase {
    public static final int $stable = 8;
    private final ChangeInputUseCase changeInputUseCase;
    private final SendMessageUseCase sendMessageUseCase;

    public SendGifUseCase(SendMessageUseCase sendMessageUseCase, ChangeInputUseCase changeInputUseCase) {
        sendMessageUseCase.getClass();
        changeInputUseCase.getClass();
        this.sendMessageUseCase = sendMessageUseCase;
        this.changeInputUseCase = changeInputUseCase;
    }

    public final Object invoke(i37<ConversationClientState> i37Var, MediaData.Gif gif, r02<? super g2b> r02Var) {
        this.changeInputUseCase.invoke(i37Var, ComposerInputType.Text.INSTANCE);
        Object objInvoke$default = SendMessageUseCase.invoke$default(this.sendMessageUseCase, i37Var, ws0.h(new Block.Builder().withType(AppearanceType.IMAGE).withUrl(gif.getUrl()).withAttribution(gif.getAttribution()).withHeight(gif.getHeight()).withWidth(gif.getWidth())), null, r02Var, 4, null);
        return objInvoke$default == v72.t ? objInvoke$default : g2b.a;
    }
}
