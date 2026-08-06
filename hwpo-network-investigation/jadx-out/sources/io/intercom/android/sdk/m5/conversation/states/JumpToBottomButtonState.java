package io.intercom.android.sdk.m5.conversation.states;

import defpackage.e44;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class JumpToBottomButtonState {
    public static final int $stable = 0;
    private final int lastSeenItemIndex;
    private final int unreadMessages;

    public /* synthetic */ JumpToBottomButtonState(int i, int i2, int i3, qq2 qq2Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public static /* synthetic */ JumpToBottomButtonState copy$default(JumpToBottomButtonState jumpToBottomButtonState, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = jumpToBottomButtonState.unreadMessages;
        }
        if ((i3 & 2) != 0) {
            i2 = jumpToBottomButtonState.lastSeenItemIndex;
        }
        return jumpToBottomButtonState.copy(i, i2);
    }

    public final int component1() {
        return this.unreadMessages;
    }

    public final int component2() {
        return this.lastSeenItemIndex;
    }

    public final JumpToBottomButtonState copy(int i, int i2) {
        return new JumpToBottomButtonState(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JumpToBottomButtonState)) {
            return false;
        }
        JumpToBottomButtonState jumpToBottomButtonState = (JumpToBottomButtonState) obj;
        return this.unreadMessages == jumpToBottomButtonState.unreadMessages && this.lastSeenItemIndex == jumpToBottomButtonState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSeenItemIndex) + (Integer.hashCode(this.unreadMessages) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JumpToBottomButtonState(unreadMessages=");
        sb.append(this.unreadMessages);
        sb.append(", lastSeenItemIndex=");
        return e44.a(sb, this.lastSeenItemIndex, ')');
    }

    public JumpToBottomButtonState(int i, int i2) {
        this.unreadMessages = i;
        this.lastSeenItemIndex = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JumpToBottomButtonState() {
        int i = 0;
        this(i, i, 3, null);
    }
}
