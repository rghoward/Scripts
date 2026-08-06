package com.hwpo_training_app.notifications.data.network.response;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum SocketNotificationTypeNetworkEntity {
    READ_NOTIFICATIONS("read"),
    NEW_NOTIFICATION("new");

    public static final Companion Companion = new Companion(0);
    public final String t;

    SocketNotificationTypeNetworkEntity(String str) {
        this.t = str;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
