package io.intercom.android.sdk.m5.conversation.states;

import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CurrentlyTypingState {
    public static final int $stable = 8;
    private final AvatarWrapper avatarWrapper;
    private final StringProvider description;
    private final boolean showAvatar;
    private final TypingIndicatorType userType;

    public /* synthetic */ CurrentlyTypingState(AvatarWrapper avatarWrapper, boolean z, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? AvatarWrapper.Companion.getNULL() : avatarWrapper, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new StringProvider.StringRes(R.string.intercom_thinking, null, 2, null) : stringProvider, typingIndicatorType);
    }

    public static /* synthetic */ CurrentlyTypingState copy$default(CurrentlyTypingState currentlyTypingState, AvatarWrapper avatarWrapper, boolean z, StringProvider stringProvider, TypingIndicatorType typingIndicatorType, int i, Object obj) {
        if ((i & 1) != 0) {
            avatarWrapper = currentlyTypingState.avatarWrapper;
        }
        if ((i & 2) != 0) {
            z = currentlyTypingState.showAvatar;
        }
        if ((i & 4) != 0) {
            stringProvider = currentlyTypingState.description;
        }
        if ((i & 8) != 0) {
            typingIndicatorType = currentlyTypingState.userType;
        }
        return currentlyTypingState.copy(avatarWrapper, z, stringProvider, typingIndicatorType);
    }

    public final AvatarWrapper component1() {
        return this.avatarWrapper;
    }

    public final boolean component2() {
        return this.showAvatar;
    }

    public final StringProvider component3() {
        return this.description;
    }

    public final TypingIndicatorType component4() {
        return this.userType;
    }

    public final CurrentlyTypingState copy(AvatarWrapper avatarWrapper, boolean z, StringProvider stringProvider, TypingIndicatorType typingIndicatorType) {
        avatarWrapper.getClass();
        stringProvider.getClass();
        typingIndicatorType.getClass();
        return new CurrentlyTypingState(avatarWrapper, z, stringProvider, typingIndicatorType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentlyTypingState)) {
            return false;
        }
        CurrentlyTypingState currentlyTypingState = (CurrentlyTypingState) obj;
        return xj5.a(this.avatarWrapper, currentlyTypingState.avatarWrapper) && this.showAvatar == currentlyTypingState.showAvatar && xj5.a(this.description, currentlyTypingState.description) && this.userType == currentlyTypingState.userType;
    }

    public final AvatarWrapper getAvatarWrapper() {
        return this.avatarWrapper;
    }

    public final StringProvider getDescription() {
        return this.description;
    }

    public final boolean getShowAvatar() {
        return this.showAvatar;
    }

    public final TypingIndicatorType getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return this.userType.hashCode() + ((this.description.hashCode() + uo2.a(this.avatarWrapper.hashCode() * 31, this.showAvatar, 31)) * 31);
    }

    public String toString() {
        return "CurrentlyTypingState(avatarWrapper=" + this.avatarWrapper + ", showAvatar=" + this.showAvatar + ", description=" + this.description + ", userType=" + this.userType + ')';
    }

    public CurrentlyTypingState(AvatarWrapper avatarWrapper, boolean z, StringProvider stringProvider, TypingIndicatorType typingIndicatorType) {
        avatarWrapper.getClass();
        stringProvider.getClass();
        typingIndicatorType.getClass();
        this.avatarWrapper = avatarWrapper;
        this.showAvatar = z;
        this.description = stringProvider;
        this.userType = typingIndicatorType;
    }
}
