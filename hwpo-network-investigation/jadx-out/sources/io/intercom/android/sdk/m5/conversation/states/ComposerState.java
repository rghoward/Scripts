package io.intercom.android.sdk.m5.conversation.states;

import defpackage.hf3;
import defpackage.ho2;
import defpackage.os2;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ComposerState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Reactions implements ComposerState {
        public static final int $stable = 8;
        private final String conversationId;
        private final String lastPartId;
        private final ReactionReply reactionReply;

        public Reactions(ReactionReply reactionReply, String str, String str2) {
            reactionReply.getClass();
            str.getClass();
            str2.getClass();
            this.reactionReply = reactionReply;
            this.lastPartId = str;
            this.conversationId = str2;
        }

        public static /* synthetic */ Reactions copy$default(Reactions reactions, ReactionReply reactionReply, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                reactionReply = reactions.reactionReply;
            }
            if ((i & 2) != 0) {
                str = reactions.lastPartId;
            }
            if ((i & 4) != 0) {
                str2 = reactions.conversationId;
            }
            return reactions.copy(reactionReply, str, str2);
        }

        public final ReactionReply component1() {
            return this.reactionReply;
        }

        public final String component2() {
            return this.lastPartId;
        }

        public final String component3() {
            return this.conversationId;
        }

        public final Reactions copy(ReactionReply reactionReply, String str, String str2) {
            reactionReply.getClass();
            str.getClass();
            str2.getClass();
            return new Reactions(reactionReply, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reactions)) {
                return false;
            }
            Reactions reactions = (Reactions) obj;
            return xj5.a(this.reactionReply, reactions.reactionReply) && xj5.a(this.lastPartId, reactions.lastPartId) && xj5.a(this.conversationId, reactions.conversationId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getLastPartId() {
            return this.lastPartId;
        }

        public final ReactionReply getReactionReply() {
            return this.reactionReply;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + ru3.c(this.reactionReply.hashCode() * 31, 31, this.lastPartId);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Reactions(reactionReply=");
            sb.append(this.reactionReply);
            sb.append(", lastPartId=");
            sb.append(this.lastPartId);
            sb.append(", conversationId=");
            return wu0.a(sb, this.conversationId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Hidden implements ComposerState {
        public static final int $stable = 0;
        private final boolean hideKeyboard;

        public /* synthetic */ Hidden(boolean z, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? true : z);
        }

        public static /* synthetic */ Hidden copy$default(Hidden hidden, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = hidden.hideKeyboard;
            }
            return hidden.copy(z);
        }

        public final boolean component1() {
            return this.hideKeyboard;
        }

        public final Hidden copy(boolean z) {
            return new Hidden(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hidden) && this.hideKeyboard == ((Hidden) obj).hideKeyboard;
        }

        public final boolean getHideKeyboard() {
            return this.hideKeyboard;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideKeyboard);
        }

        public String toString() {
            return pi1.a(new StringBuilder("Hidden(hideKeyboard="), this.hideKeyboard, ')');
        }

        public Hidden(boolean z) {
            this.hideKeyboard = z;
        }

        public Hidden() {
            this(false, 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ConversationEnded implements ComposerState {
        public static final int $stable = StringProvider.$stable;
        private final ConversationEndedCta cta;
        private final StringProvider message;

        public ConversationEnded(StringProvider stringProvider, ConversationEndedCta conversationEndedCta) {
            stringProvider.getClass();
            this.message = stringProvider;
            this.cta = conversationEndedCta;
        }

        public static /* synthetic */ ConversationEnded copy$default(ConversationEnded conversationEnded, StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i, Object obj) {
            if ((i & 1) != 0) {
                stringProvider = conversationEnded.message;
            }
            if ((i & 2) != 0) {
                conversationEndedCta = conversationEnded.cta;
            }
            return conversationEnded.copy(stringProvider, conversationEndedCta);
        }

        public final StringProvider component1() {
            return this.message;
        }

        public final ConversationEndedCta component2() {
            return this.cta;
        }

        public final ConversationEnded copy(StringProvider stringProvider, ConversationEndedCta conversationEndedCta) {
            stringProvider.getClass();
            return new ConversationEnded(stringProvider, conversationEndedCta);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationEnded)) {
                return false;
            }
            ConversationEnded conversationEnded = (ConversationEnded) obj;
            return xj5.a(this.message, conversationEnded.message) && xj5.a(this.cta, conversationEnded.cta);
        }

        public final ConversationEndedCta getCta() {
            return this.cta;
        }

        public final StringProvider getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            ConversationEndedCta conversationEndedCta = this.cta;
            return iHashCode + (conversationEndedCta == null ? 0 : conversationEndedCta.hashCode());
        }

        public String toString() {
            return "ConversationEnded(message=" + this.message + ", cta=" + this.cta + ')';
        }

        public /* synthetic */ ConversationEnded(StringProvider stringProvider, ConversationEndedCta conversationEndedCta, int i, qq2 qq2Var) {
            this(stringProvider, (i & 2) != 0 ? null : conversationEndedCta);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ConversationEndedCta {
            public static final int $stable = StringProvider.$stable;
            private final String linkedConversationId;
            private final StringProvider title;
            private final int trailingIcon;

            public ConversationEndedCta(StringProvider stringProvider, int i, String str) {
                stringProvider.getClass();
                this.title = stringProvider;
                this.trailingIcon = i;
                this.linkedConversationId = str;
            }

            public static /* synthetic */ ConversationEndedCta copy$default(ConversationEndedCta conversationEndedCta, StringProvider stringProvider, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    stringProvider = conversationEndedCta.title;
                }
                if ((i2 & 2) != 0) {
                    i = conversationEndedCta.trailingIcon;
                }
                if ((i2 & 4) != 0) {
                    str = conversationEndedCta.linkedConversationId;
                }
                return conversationEndedCta.copy(stringProvider, i, str);
            }

            public final StringProvider component1() {
                return this.title;
            }

            public final int component2() {
                return this.trailingIcon;
            }

            public final String component3() {
                return this.linkedConversationId;
            }

            public final ConversationEndedCta copy(StringProvider stringProvider, int i, String str) {
                stringProvider.getClass();
                return new ConversationEndedCta(stringProvider, i, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConversationEndedCta)) {
                    return false;
                }
                ConversationEndedCta conversationEndedCta = (ConversationEndedCta) obj;
                return xj5.a(this.title, conversationEndedCta.title) && this.trailingIcon == conversationEndedCta.trailingIcon && xj5.a(this.linkedConversationId, conversationEndedCta.linkedConversationId);
            }

            public final String getLinkedConversationId() {
                return this.linkedConversationId;
            }

            public final StringProvider getTitle() {
                return this.title;
            }

            public final int getTrailingIcon() {
                return this.trailingIcon;
            }

            public int hashCode() {
                int iA = os2.a(this.trailingIcon, this.title.hashCode() * 31, 31);
                String str = this.linkedConversationId;
                return iA + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("ConversationEndedCta(title=");
                sb.append(this.title);
                sb.append(", trailingIcon=");
                sb.append(this.trailingIcon);
                sb.append(", linkedConversationId=");
                return wu0.a(sb, this.linkedConversationId, ')');
            }

            public /* synthetic */ ConversationEndedCta(StringProvider stringProvider, int i, String str, int i2, qq2 qq2Var) {
                this(stringProvider, i, (i2 & 4) != 0 ? null : str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TextInput implements ComposerState {
        public static final int $stable = 8;
        private final List<BottomBarUiState.BottomBarButton> buttons;
        private final StringProvider hintText;
        private final String initialMessage;
        private final ComposerInputType inputType;
        private final boolean isDisabled;
        private final List<MediaUploadItem> mediaUploadItems;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ TextInput(String str, StringProvider stringProvider, boolean z, List list, List list2, ComposerInputType composerInputType, int i, qq2 qq2Var) {
            boolean z2 = (i & 4) != 0 ? false : z;
            int i2 = i & 8;
            hf3 hf3Var = hf3.t;
            this(str, stringProvider, z2, i2 != 0 ? hf3Var : list, (i & 16) != 0 ? hf3Var : list2, (i & 32) != 0 ? ComposerInputType.Text.INSTANCE : composerInputType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, StringProvider stringProvider, boolean z, List list, List list2, ComposerInputType composerInputType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textInput.initialMessage;
            }
            if ((i & 2) != 0) {
                stringProvider = textInput.hintText;
            }
            if ((i & 4) != 0) {
                z = textInput.isDisabled;
            }
            if ((i & 8) != 0) {
                list = textInput.buttons;
            }
            if ((i & 16) != 0) {
                list2 = textInput.mediaUploadItems;
            }
            if ((i & 32) != 0) {
                composerInputType = textInput.inputType;
            }
            List list3 = list2;
            ComposerInputType composerInputType2 = composerInputType;
            return textInput.copy(str, stringProvider, z, list, list3, composerInputType2);
        }

        public final String component1() {
            return this.initialMessage;
        }

        public final StringProvider component2() {
            return this.hintText;
        }

        public final boolean component3() {
            return this.isDisabled;
        }

        public final List<BottomBarUiState.BottomBarButton> component4() {
            return this.buttons;
        }

        public final List<MediaUploadItem> component5() {
            return this.mediaUploadItems;
        }

        public final ComposerInputType component6() {
            return this.inputType;
        }

        public final TextInput copy(String str, StringProvider stringProvider, boolean z, List<? extends BottomBarUiState.BottomBarButton> list, List<MediaUploadItem> list2, ComposerInputType composerInputType) {
            str.getClass();
            stringProvider.getClass();
            list.getClass();
            list2.getClass();
            composerInputType.getClass();
            return new TextInput(str, stringProvider, z, list, list2, composerInputType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) obj;
            return xj5.a(this.initialMessage, textInput.initialMessage) && xj5.a(this.hintText, textInput.hintText) && this.isDisabled == textInput.isDisabled && xj5.a(this.buttons, textInput.buttons) && xj5.a(this.mediaUploadItems, textInput.mediaUploadItems) && xj5.a(this.inputType, textInput.inputType);
        }

        public final List<BottomBarUiState.BottomBarButton> getButtons() {
            return this.buttons;
        }

        public final StringProvider getHintText() {
            return this.hintText;
        }

        public final String getInitialMessage() {
            return this.initialMessage;
        }

        public final ComposerInputType getInputType() {
            return this.inputType;
        }

        public final List<MediaUploadItem> getMediaUploadItems() {
            return this.mediaUploadItems;
        }

        public int hashCode() {
            return this.inputType.hashCode() + ho2.a(ho2.a(uo2.a((this.hintText.hashCode() + (this.initialMessage.hashCode() * 31)) * 31, this.isDisabled, 31), 31, this.buttons), 31, this.mediaUploadItems);
        }

        public final boolean isDisabled() {
            return this.isDisabled;
        }

        public String toString() {
            return "TextInput(initialMessage=" + this.initialMessage + ", hintText=" + this.hintText + ", isDisabled=" + this.isDisabled + ", buttons=" + this.buttons + ", mediaUploadItems=" + this.mediaUploadItems + ", inputType=" + this.inputType + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextInput(String str, StringProvider stringProvider, boolean z, List<? extends BottomBarUiState.BottomBarButton> list, List<MediaUploadItem> list2, ComposerInputType composerInputType) {
            str.getClass();
            stringProvider.getClass();
            list.getClass();
            list2.getClass();
            composerInputType.getClass();
            this.initialMessage = str;
            this.hintText = stringProvider;
            this.isDisabled = z;
            this.buttons = list;
            this.mediaUploadItems = list2;
            this.inputType = composerInputType;
        }
    }
}
