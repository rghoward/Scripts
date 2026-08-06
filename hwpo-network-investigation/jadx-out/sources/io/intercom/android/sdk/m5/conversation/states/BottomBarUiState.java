package io.intercom.android.sdk.m5.conversation.states;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BottomBarUiState {
    public static final int $stable = 8;
    private final BottomBadgeState bottomBadge;
    private final ComposerState composerState;
    private final CurrentlyTypingState currentlyTypingState;
    private final InputTypeState inputTypeState;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface BottomBadgeState {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class None implements BottomBadgeState {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            private None() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public int hashCode() {
                return -495368601;
            }

            public String toString() {
                return "None";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class PoweredByBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final PoweredBy poweredBy;

            public PoweredByBadgeState(PoweredBy poweredBy) {
                poweredBy.getClass();
                this.poweredBy = poweredBy;
            }

            public static /* synthetic */ PoweredByBadgeState copy$default(PoweredByBadgeState poweredByBadgeState, PoweredBy poweredBy, int i, Object obj) {
                if ((i & 1) != 0) {
                    poweredBy = poweredByBadgeState.poweredBy;
                }
                return poweredByBadgeState.copy(poweredBy);
            }

            public final PoweredBy component1() {
                return this.poweredBy;
            }

            public final PoweredByBadgeState copy(PoweredBy poweredBy) {
                poweredBy.getClass();
                return new PoweredByBadgeState(poweredBy);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PoweredByBadgeState) && xj5.a(this.poweredBy, ((PoweredByBadgeState) obj).poweredBy);
            }

            public final PoweredBy getPoweredBy() {
                return this.poweredBy;
            }

            public int hashCode() {
                return this.poweredBy.hashCode();
            }

            public String toString() {
                return "PoweredByBadgeState(poweredBy=" + this.poweredBy + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class PrivacyNoticeBadgeState implements BottomBadgeState {
            public static final int $stable = 0;
            private final String text;

            public PrivacyNoticeBadgeState(String str) {
                str.getClass();
                this.text = str;
            }

            public static /* synthetic */ PrivacyNoticeBadgeState copy$default(PrivacyNoticeBadgeState privacyNoticeBadgeState, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = privacyNoticeBadgeState.text;
                }
                return privacyNoticeBadgeState.copy(str);
            }

            public final String component1() {
                return this.text;
            }

            public final PrivacyNoticeBadgeState copy(String str) {
                str.getClass();
                return new PrivacyNoticeBadgeState(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PrivacyNoticeBadgeState) && xj5.a(this.text, ((PrivacyNoticeBadgeState) obj).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return wu0.a(new StringBuilder("PrivacyNoticeBadgeState(text="), this.text, ')');
            }
        }
    }

    public BottomBarUiState(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadgeState) {
        composerState.getClass();
        currentlyTypingState.getClass();
        inputTypeState.getClass();
        bottomBadgeState.getClass();
        this.composerState = composerState;
        this.currentlyTypingState = currentlyTypingState;
        this.inputTypeState = inputTypeState;
        this.bottomBadge = bottomBadgeState;
    }

    public static /* synthetic */ BottomBarUiState copy$default(BottomBarUiState bottomBarUiState, ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadgeState, int i, Object obj) {
        if ((i & 1) != 0) {
            composerState = bottomBarUiState.composerState;
        }
        if ((i & 2) != 0) {
            currentlyTypingState = bottomBarUiState.currentlyTypingState;
        }
        if ((i & 4) != 0) {
            inputTypeState = bottomBarUiState.inputTypeState;
        }
        if ((i & 8) != 0) {
            bottomBadgeState = bottomBarUiState.bottomBadge;
        }
        return bottomBarUiState.copy(composerState, currentlyTypingState, inputTypeState, bottomBadgeState);
    }

    public final ComposerState component1() {
        return this.composerState;
    }

    public final CurrentlyTypingState component2() {
        return this.currentlyTypingState;
    }

    public final InputTypeState component3() {
        return this.inputTypeState;
    }

    public final BottomBadgeState component4() {
        return this.bottomBadge;
    }

    public final BottomBarUiState copy(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadgeState) {
        composerState.getClass();
        currentlyTypingState.getClass();
        inputTypeState.getClass();
        bottomBadgeState.getClass();
        return new BottomBarUiState(composerState, currentlyTypingState, inputTypeState, bottomBadgeState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarUiState)) {
            return false;
        }
        BottomBarUiState bottomBarUiState = (BottomBarUiState) obj;
        return xj5.a(this.composerState, bottomBarUiState.composerState) && xj5.a(this.currentlyTypingState, bottomBarUiState.currentlyTypingState) && xj5.a(this.inputTypeState, bottomBarUiState.inputTypeState) && xj5.a(this.bottomBadge, bottomBarUiState.bottomBadge);
    }

    public final BottomBadgeState getBottomBadge() {
        return this.bottomBadge;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final InputTypeState getInputTypeState() {
        return this.inputTypeState;
    }

    public int hashCode() {
        return this.bottomBadge.hashCode() + ((this.inputTypeState.hashCode() + ((this.currentlyTypingState.hashCode() + (this.composerState.hashCode() * 31)) * 31)) * 31);
    }

    public final boolean isMaxMediaItemsReached() {
        List<MediaUploadItem> mediaUploadItems;
        ComposerState composerState = this.composerState;
        ComposerState.TextInput textInput = composerState instanceof ComposerState.TextInput ? (ComposerState.TextInput) composerState : null;
        return ((textInput == null || (mediaUploadItems = textInput.getMediaUploadItems()) == null) ? 0 : mediaUploadItems.size()) >= 10;
    }

    public String toString() {
        return "BottomBarUiState(composerState=" + this.composerState + ", currentlyTypingState=" + this.currentlyTypingState + ", inputTypeState=" + this.inputTypeState + ", bottomBadge=" + this.bottomBadge + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class BottomBarButton {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class GifInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final GifInsert INSTANCE = new GifInsert();

            private GifInsert() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GifInsert);
            }

            public int hashCode() {
                return 806342211;
            }

            public String toString() {
                return "GifInsert";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class MediaInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final MediaInsert INSTANCE = new MediaInsert();

            private MediaInsert() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof MediaInsert);
            }

            public int hashCode() {
                return -196410141;
            }

            public String toString() {
                return "MediaInsert";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class VoiceNotesInsert extends BottomBarButton {
            public static final int $stable = 0;
            public static final VoiceNotesInsert INSTANCE = new VoiceNotesInsert();

            private VoiceNotesInsert() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof VoiceNotesInsert);
            }

            public int hashCode() {
                return 501154530;
            }

            public String toString() {
                return "VoiceNotesInsert";
            }
        }

        public /* synthetic */ BottomBarButton(qq2 qq2Var) {
            this();
        }

        private BottomBarButton() {
        }
    }

    public /* synthetic */ BottomBarUiState(ComposerState composerState, CurrentlyTypingState currentlyTypingState, InputTypeState inputTypeState, BottomBadgeState bottomBadgeState, int i, qq2 qq2Var) {
        this(composerState, currentlyTypingState, inputTypeState, (i & 8) != 0 ? BottomBadgeState.None.INSTANCE : bottomBadgeState);
    }
}
