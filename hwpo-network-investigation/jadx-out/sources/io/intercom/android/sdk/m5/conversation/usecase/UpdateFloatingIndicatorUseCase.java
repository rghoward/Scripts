package io.intercom.android.sdk.m5.conversation.usecase;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.i37;
import defpackage.ph1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UpdateFloatingIndicatorUseCase {
    public static final int $stable = 0;

    public final void invoke(i37<ConversationClientState> i37Var, ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        ConversationClientState value2;
        ConversationClientState value3;
        ConversationClientState conversationClientState;
        String title;
        String subtitle;
        List arrayList;
        List<Avatar.Builder> avatars;
        i37Var.getClass();
        conversationScrolledState.getClass();
        boolean scrolled = conversationScrolledState.getScrolled();
        Conversation conversation = i37Var.getValue().getConversation();
        FooterNotice footerNotice = conversation != null ? conversation.getFooterNotice() : null;
        if (footerNotice == null || conversationScrolledState.isLandscape() || conversationScrolledState.isLargeFont()) {
            if (scrolled && !(i37Var.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator)) {
                do {
                    value = i37Var.getValue();
                } while (!i37Var.c(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, new FloatingIndicatorState.JumpToBottomIndicator(new JumpToBottomButtonState(0, conversationScrolledState.getLastSeenItemIndex(), 1, null)), null, false, false, null, null, null, 8323071, null)));
            }
        } else if (scrolled && !(i37Var.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.FooterNoticeIndicator)) {
            do {
                value3 = i37Var.getValue();
                conversationClientState = value3;
                title = footerNotice.getTitle();
                subtitle = footerNotice.getSubtitle();
                if (subtitle == null) {
                    subtitle = BuildConfig.FLAVOR;
                }
                AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
                if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                    arrayList = hf3.t;
                } else {
                    arrayList = new ArrayList(ph1.n(avatars, 10));
                    Iterator<T> it = avatars.iterator();
                    while (it.hasNext()) {
                        Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                        avatarBuild.getClass();
                        arrayList.add(new AvatarWrapper(avatarBuild, false, 2, null));
                    }
                }
            } while (!i37Var.c(value3, ConversationClientState.copy$default(conversationClientState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, new FloatingIndicatorState.FooterNoticeIndicator(new FooterNoticeState(title, subtitle, arrayList)), null, false, false, null, null, null, 8323071, null)));
        }
        if (scrolled || (i37Var.getValue().getFloatingIndicatorState() instanceof FloatingIndicatorState.None)) {
            return;
        }
        do {
            value2 = i37Var.getValue();
        } while (!i37Var.c(value2, ConversationClientState.copy$default(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, FloatingIndicatorState.None.INSTANCE, null, false, false, null, null, null, 8323071, null)));
    }
}
