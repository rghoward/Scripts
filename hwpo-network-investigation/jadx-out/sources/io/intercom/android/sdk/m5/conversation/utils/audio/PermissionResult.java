package io.intercom.android.sdk.m5.conversation.utils.audio;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface PermissionResult {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Denied implements PermissionResult {
        public static final int $stable = 0;
        public static final Denied INSTANCE = new Denied();

        private Denied() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Denied);
        }

        public int hashCode() {
            return -1394334449;
        }

        public String toString() {
            return "Denied";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Granted implements PermissionResult {
        public static final int $stable = 0;
        public static final Granted INSTANCE = new Granted();

        private Granted() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Granted);
        }

        public int hashCode() {
            return -1546814521;
        }

        public String toString() {
            return "Granted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NotRequired implements PermissionResult {
        public static final int $stable = 0;
        public static final NotRequired INSTANCE = new NotRequired();

        private NotRequired() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotRequired);
        }

        public int hashCode() {
            return -1685989730;
        }

        public String toString() {
            return "NotRequired";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class PermanentlyDenied implements PermissionResult {
        public static final int $stable = 0;
        public static final PermanentlyDenied INSTANCE = new PermanentlyDenied();

        private PermanentlyDenied() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PermanentlyDenied);
        }

        public int hashCode() {
            return -1189886910;
        }

        public String toString() {
            return "PermanentlyDenied";
        }
    }
}
