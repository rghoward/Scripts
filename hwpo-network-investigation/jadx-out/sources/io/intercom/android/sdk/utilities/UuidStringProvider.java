package io.intercom.android.sdk.utilities;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface UuidStringProvider {
    public static final UuidStringProvider SYSTEM = new UuidStringProvider() { // from class: io.intercom.android.sdk.utilities.UuidStringProvider.1
        @Override // io.intercom.android.sdk.utilities.UuidStringProvider
        public String newUuidString() {
            return UUID.randomUUID().toString();
        }
    };

    String newUuidString();
}
