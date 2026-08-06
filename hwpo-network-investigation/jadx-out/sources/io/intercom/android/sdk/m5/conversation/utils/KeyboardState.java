package io.intercom.android.sdk.m5.conversation.utils;

import defpackage.e44;
import defpackage.os2;
import defpackage.qq2;
import defpackage.uo2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class KeyboardState {
    public static final int $stable = 0;
    private final int bottomDiff;
    private final boolean isAnimating;
    private final boolean isDismissed;
    private final boolean isVisible;
    private final int keyboardHeight;

    public /* synthetic */ KeyboardState(boolean z, int i, boolean z2, boolean z3, int i2, int i3, qq2 qq2Var) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? false : z3, (i3 & 16) != 0 ? 0 : i2);
    }

    public static /* synthetic */ KeyboardState copy$default(KeyboardState keyboardState, boolean z, int i, boolean z2, boolean z3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = keyboardState.isAnimating;
        }
        if ((i3 & 2) != 0) {
            i = keyboardState.bottomDiff;
        }
        if ((i3 & 4) != 0) {
            z2 = keyboardState.isVisible;
        }
        if ((i3 & 8) != 0) {
            z3 = keyboardState.isDismissed;
        }
        if ((i3 & 16) != 0) {
            i2 = keyboardState.keyboardHeight;
        }
        int i4 = i2;
        boolean z4 = z2;
        return keyboardState.copy(z, i, z4, z3, i4);
    }

    public final boolean component1() {
        return this.isAnimating;
    }

    public final int component2() {
        return this.bottomDiff;
    }

    public final boolean component3() {
        return this.isVisible;
    }

    public final boolean component4() {
        return this.isDismissed;
    }

    public final int component5() {
        return this.keyboardHeight;
    }

    public final KeyboardState copy(boolean z, int i, boolean z2, boolean z3, int i2) {
        return new KeyboardState(z, i, z2, z3, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardState)) {
            return false;
        }
        KeyboardState keyboardState = (KeyboardState) obj;
        return this.isAnimating == keyboardState.isAnimating && this.bottomDiff == keyboardState.bottomDiff && this.isVisible == keyboardState.isVisible && this.isDismissed == keyboardState.isDismissed && this.keyboardHeight == keyboardState.keyboardHeight;
    }

    public final int getBottomDiff() {
        return this.bottomDiff;
    }

    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public int hashCode() {
        return Integer.hashCode(this.keyboardHeight) + uo2.a(uo2.a(os2.a(this.bottomDiff, Boolean.hashCode(this.isAnimating) * 31, 31), this.isVisible, 31), this.isDismissed, 31);
    }

    public final boolean isAnimating() {
        return this.isAnimating;
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyboardState(isAnimating=");
        sb.append(this.isAnimating);
        sb.append(", bottomDiff=");
        sb.append(this.bottomDiff);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", isDismissed=");
        sb.append(this.isDismissed);
        sb.append(", keyboardHeight=");
        return e44.a(sb, this.keyboardHeight, ')');
    }

    public KeyboardState(boolean z, int i, boolean z2, boolean z3, int i2) {
        this.isAnimating = z;
        this.bottomDiff = i;
        this.isVisible = z2;
        this.isDismissed = z3;
        this.keyboardHeight = i2;
    }

    public KeyboardState() {
        this(false, 0, false, false, 0, 31, null);
    }
}
