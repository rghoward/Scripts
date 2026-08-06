package io.intercom.android.sdk.m5.conversation.usecase;

import com.intercom.twig.BuildConfig;
import defpackage.i37;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChangeInputUseCase {
    public static final int $stable = 0;

    public final void invoke(i37<ConversationClientState> i37Var, ComposerInputType composerInputType) {
        ConversationClientState value;
        i37Var.getClass();
        composerInputType.getClass();
        do {
            value = i37Var.getValue();
        } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, new ComposerState.TextInput(BuildConfig.FLAVOR, new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, composerInputType, 28, null), null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388591, null)));
    }
}
