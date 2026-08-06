package io.intercom.android.sdk.api;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class UserUpdateRequest {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder {
        Map<String, Object> attributes;
        boolean isNewSession = false;
        boolean isSentFromBackground = true;
        boolean isInternalUpdate = false;

        public UserUpdateRequest build() {
            HashMap map = new HashMap();
            Map<String, Object> map2 = this.attributes;
            if (map2 != null) {
                map.putAll(map2);
            }
            return new AutoValue_UserUpdateRequest(this.isNewSession, this.isSentFromBackground, this.isInternalUpdate, map);
        }

        public Builder isInternalUpdate(boolean z) {
            this.isInternalUpdate = z;
            return this;
        }

        public Builder isNewSession(boolean z) {
            this.isNewSession = z;
            return this;
        }

        public Builder isSentFromBackground(boolean z) {
            this.isSentFromBackground = z;
            return this;
        }

        public Builder withAttributes(Map<String, Object> map) {
            this.attributes = map;
            return this;
        }
    }

    public static UserUpdateRequest create(boolean z, boolean z2, Map<String, Object> map, boolean z3) {
        return new Builder().isNewSession(z).isSentFromBackground(z2).withAttributes(map).isInternalUpdate(z3).build();
    }

    public abstract Map<String, Object> getAttributes();

    public abstract boolean isInternalUpdate();

    public abstract boolean isNewSession();

    public abstract boolean isSentFromBackground();

    public boolean isValidUpdate() {
        return isInternalUpdate() || !getAttributes().isEmpty();
    }

    public static UserUpdateRequest create(boolean z, boolean z2, boolean z3) {
        return create(z, z2, null, z3);
    }
}
