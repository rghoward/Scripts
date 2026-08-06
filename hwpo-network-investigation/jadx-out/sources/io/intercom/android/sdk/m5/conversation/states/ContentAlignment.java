package io.intercom.android.sdk.m5.conversation.states;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ContentAlignment {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Center implements ContentAlignment {
        public static final int $stable = 0;
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Center);
        }

        public int hashCode() {
            return 2101579366;
        }

        public String toString() {
            return "Center";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Start implements ContentAlignment {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Start);
        }

        public int hashCode() {
            return 1052834865;
        }

        public String toString() {
            return "Start";
        }
    }
}
