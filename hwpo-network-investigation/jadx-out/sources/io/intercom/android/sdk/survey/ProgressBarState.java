package io.intercom.android.sdk.survey;

import defpackage.ho;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgressBarState {
    public static final int $stable = 0;
    private final boolean isVisible;
    private final float progress;

    public /* synthetic */ ProgressBarState(boolean z, float f, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0f : f);
    }

    public static /* synthetic */ ProgressBarState copy$default(ProgressBarState progressBarState, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = progressBarState.isVisible;
        }
        if ((i & 2) != 0) {
            f = progressBarState.progress;
        }
        return progressBarState.copy(z, f);
    }

    public final boolean component1() {
        return this.isVisible;
    }

    public final float component2() {
        return this.progress;
    }

    public final ProgressBarState copy(boolean z, float f) {
        return new ProgressBarState(z, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarState)) {
            return false;
        }
        ProgressBarState progressBarState = (ProgressBarState) obj;
        return this.isVisible == progressBarState.isVisible && Float.compare(this.progress, progressBarState.progress) == 0;
    }

    public final float getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Float.hashCode(this.progress) + (Boolean.hashCode(this.isVisible) * 31);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarState(isVisible=");
        sb.append(this.isVisible);
        sb.append(", progress=");
        return ho.a(sb, this.progress, ')');
    }

    public ProgressBarState(boolean z, float f) {
        this.isVisible = z;
        this.progress = f;
    }

    public ProgressBarState() {
        this(false, 0.0f, 3, null);
    }
}
