package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.e44;
import defpackage.qq2;
import defpackage.uo2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationScrolledState {
    public static final int $stable = 0;
    private final boolean isLandscape;
    private final boolean isLargeFont;
    private final int lastSeenItemIndex;
    private final boolean scrolled;

    public ConversationScrolledState(boolean z, boolean z2, boolean z3, int i) {
        this.scrolled = z;
        this.isLandscape = z2;
        this.isLargeFont = z3;
        this.lastSeenItemIndex = i;
    }

    public static /* synthetic */ ConversationScrolledState copy$default(ConversationScrolledState conversationScrolledState, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = conversationScrolledState.scrolled;
        }
        if ((i2 & 2) != 0) {
            z2 = conversationScrolledState.isLandscape;
        }
        if ((i2 & 4) != 0) {
            z3 = conversationScrolledState.isLargeFont;
        }
        if ((i2 & 8) != 0) {
            i = conversationScrolledState.lastSeenItemIndex;
        }
        return conversationScrolledState.copy(z, z2, z3, i);
    }

    public final boolean component1() {
        return this.scrolled;
    }

    public final boolean component2() {
        return this.isLandscape;
    }

    public final boolean component3() {
        return this.isLargeFont;
    }

    public final int component4() {
        return this.lastSeenItemIndex;
    }

    public final ConversationScrolledState copy(boolean z, boolean z2, boolean z3, int i) {
        return new ConversationScrolledState(z, z2, z3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationScrolledState)) {
            return false;
        }
        ConversationScrolledState conversationScrolledState = (ConversationScrolledState) obj;
        return this.scrolled == conversationScrolledState.scrolled && this.isLandscape == conversationScrolledState.isLandscape && this.isLargeFont == conversationScrolledState.isLargeFont && this.lastSeenItemIndex == conversationScrolledState.lastSeenItemIndex;
    }

    public final int getLastSeenItemIndex() {
        return this.lastSeenItemIndex;
    }

    public final boolean getScrolled() {
        return this.scrolled;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSeenItemIndex) + uo2.a(uo2.a(Boolean.hashCode(this.scrolled) * 31, this.isLandscape, 31), this.isLargeFont, 31);
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    public final boolean isLargeFont() {
        return this.isLargeFont;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationScrolledState(scrolled=");
        sb.append(this.scrolled);
        sb.append(", isLandscape=");
        sb.append(this.isLandscape);
        sb.append(", isLargeFont=");
        sb.append(this.isLargeFont);
        sb.append(", lastSeenItemIndex=");
        return e44.a(sb, this.lastSeenItemIndex, ')');
    }

    public /* synthetic */ ConversationScrolledState(boolean z, boolean z2, boolean z3, int i, int i2, qq2 qq2Var) {
        this(z, z2, z3, (i2 & 8) != 0 ? 0 : i);
    }
}
