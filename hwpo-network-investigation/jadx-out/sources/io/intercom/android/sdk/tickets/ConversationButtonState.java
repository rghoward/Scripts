package io.intercom.android.sdk.tickets;

import defpackage.xj5;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationButtonState {
    public static final int $stable = StringProvider.$stable;
    private final Integer iconRes;
    private final boolean showButton;
    private final StringProvider text;

    public ConversationButtonState(boolean z, Integer num, StringProvider stringProvider) {
        stringProvider.getClass();
        this.showButton = z;
        this.iconRes = num;
        this.text = stringProvider;
    }

    public static /* synthetic */ ConversationButtonState copy$default(ConversationButtonState conversationButtonState, boolean z, Integer num, StringProvider stringProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            z = conversationButtonState.showButton;
        }
        if ((i & 2) != 0) {
            num = conversationButtonState.iconRes;
        }
        if ((i & 4) != 0) {
            stringProvider = conversationButtonState.text;
        }
        return conversationButtonState.copy(z, num, stringProvider);
    }

    public final boolean component1() {
        return this.showButton;
    }

    public final Integer component2() {
        return this.iconRes;
    }

    public final StringProvider component3() {
        return this.text;
    }

    public final ConversationButtonState copy(boolean z, Integer num, StringProvider stringProvider) {
        stringProvider.getClass();
        return new ConversationButtonState(z, num, stringProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationButtonState)) {
            return false;
        }
        ConversationButtonState conversationButtonState = (ConversationButtonState) obj;
        return this.showButton == conversationButtonState.showButton && xj5.a(this.iconRes, conversationButtonState.iconRes) && xj5.a(this.text, conversationButtonState.text);
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    public final StringProvider getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showButton) * 31;
        Integer num = this.iconRes;
        return this.text.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        return "ConversationButtonState(showButton=" + this.showButton + ", iconRes=" + this.iconRes + ", text=" + this.text + ')';
    }
}
