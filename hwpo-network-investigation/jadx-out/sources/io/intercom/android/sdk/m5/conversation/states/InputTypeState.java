package io.intercom.android.sdk.m5.conversation.states;

import defpackage.e44;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonKt;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InputTypeState {
    private final int availableMediaItems;
    private final boolean cameraInputEnabled;
    private final boolean fileInputEnabled;
    private final boolean gifInputEnabled;
    private final boolean mediaInputEnabled;
    private final Set<String> trustedFileExtensions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InputTypeState DEFAULT = new InputTypeState(true, true, true, true, MediaPickerButtonKt.getDefaultTrustedFileExtensions(), 10);

    public InputTypeState(boolean z, boolean z2, boolean z3, boolean z4, Set<String> set, int i) {
        set.getClass();
        this.mediaInputEnabled = z;
        this.gifInputEnabled = z2;
        this.cameraInputEnabled = z3;
        this.fileInputEnabled = z4;
        this.trustedFileExtensions = set;
        this.availableMediaItems = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTypeState copy$default(InputTypeState inputTypeState, boolean z, boolean z2, boolean z3, boolean z4, Set set, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = inputTypeState.mediaInputEnabled;
        }
        if ((i2 & 2) != 0) {
            z2 = inputTypeState.gifInputEnabled;
        }
        if ((i2 & 4) != 0) {
            z3 = inputTypeState.cameraInputEnabled;
        }
        if ((i2 & 8) != 0) {
            z4 = inputTypeState.fileInputEnabled;
        }
        if ((i2 & 16) != 0) {
            set = inputTypeState.trustedFileExtensions;
        }
        if ((i2 & 32) != 0) {
            i = inputTypeState.availableMediaItems;
        }
        Set set2 = set;
        int i3 = i;
        return inputTypeState.copy(z, z2, z3, z4, set2, i3);
    }

    public final boolean component1() {
        return this.mediaInputEnabled;
    }

    public final boolean component2() {
        return this.gifInputEnabled;
    }

    public final boolean component3() {
        return this.cameraInputEnabled;
    }

    public final boolean component4() {
        return this.fileInputEnabled;
    }

    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    public final int component6() {
        return this.availableMediaItems;
    }

    public final InputTypeState copy(boolean z, boolean z2, boolean z3, boolean z4, Set<String> set, int i) {
        set.getClass();
        return new InputTypeState(z, z2, z3, z4, set, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputTypeState)) {
            return false;
        }
        InputTypeState inputTypeState = (InputTypeState) obj;
        return this.mediaInputEnabled == inputTypeState.mediaInputEnabled && this.gifInputEnabled == inputTypeState.gifInputEnabled && this.cameraInputEnabled == inputTypeState.cameraInputEnabled && this.fileInputEnabled == inputTypeState.fileInputEnabled && xj5.a(this.trustedFileExtensions, inputTypeState.trustedFileExtensions) && this.availableMediaItems == inputTypeState.availableMediaItems;
    }

    public final int getAvailableMediaItems() {
        return this.availableMediaItems;
    }

    public final boolean getCameraInputEnabled() {
        return this.cameraInputEnabled;
    }

    public final boolean getFileInputEnabled() {
        return this.fileInputEnabled;
    }

    public final boolean getGifInputEnabled() {
        return this.gifInputEnabled;
    }

    public final boolean getMediaInputEnabled() {
        return this.mediaInputEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public int hashCode() {
        return Integer.hashCode(this.availableMediaItems) + ((this.trustedFileExtensions.hashCode() + uo2.a(uo2.a(uo2.a(Boolean.hashCode(this.mediaInputEnabled) * 31, this.gifInputEnabled, 31), this.cameraInputEnabled, 31), this.fileInputEnabled, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InputTypeState(mediaInputEnabled=");
        sb.append(this.mediaInputEnabled);
        sb.append(", gifInputEnabled=");
        sb.append(this.gifInputEnabled);
        sb.append(", cameraInputEnabled=");
        sb.append(this.cameraInputEnabled);
        sb.append(", fileInputEnabled=");
        sb.append(this.fileInputEnabled);
        sb.append(", trustedFileExtensions=");
        sb.append(this.trustedFileExtensions);
        sb.append(", availableMediaItems=");
        return e44.a(sb, this.availableMediaItems, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final InputTypeState getDEFAULT() {
            return InputTypeState.DEFAULT;
        }

        private Companion() {
        }
    }
}
