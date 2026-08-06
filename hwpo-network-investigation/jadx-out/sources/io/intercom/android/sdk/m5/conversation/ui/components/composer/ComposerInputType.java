package io.intercom.android.sdk.m5.conversation.ui.components.composer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ComposerInputType {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Text implements ComposerInputType {
        public static final int $stable = 0;
        public static final Text INSTANCE = new Text();

        private Text() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Text);
        }

        public int hashCode() {
            return 877964142;
        }

        public String toString() {
            return "Text";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class VoiceNotes implements ComposerInputType {
        public static final int $stable = 0;
        public static final VoiceNotes INSTANCE = new VoiceNotes();

        private VoiceNotes() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceNotes);
        }

        public int hashCode() {
            return -193831376;
        }

        public String toString() {
            return "VoiceNotes";
        }
    }
}
