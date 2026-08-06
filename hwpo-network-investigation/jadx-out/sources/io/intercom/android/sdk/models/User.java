package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.ru3;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class User {
    public static final User NULL = new User();

    @SerializedName(UserIdentity.ANONYMOUS_ID)
    private final String anonymousId;
    private final String email;

    @SerializedName("encrypted_user_id")
    private final String encryptedUserId;

    @SerializedName(UserIdentity.INTERCOM_ID)
    private final String intercomId;

    @SerializedName("user_id")
    private final String userId;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder {
        String anonymous_id;
        private Avatar.Builder avatar;
        String email;
        String encrypted_user_id;
        String intercom_id;
        String user_id;

        public User build() {
            return new User(this);
        }

        public Builder withAnonymousId(String str) {
            this.anonymous_id = str;
            return this;
        }

        public Builder withAvatar(Avatar.Builder builder) {
            this.avatar = builder;
            return this;
        }

        public Builder withEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder withEncryptedUserId(String str) {
            this.encrypted_user_id = str;
            return this;
        }

        public Builder withIntercomId(String str) {
            this.intercom_id = str;
            return this;
        }

        public Builder withUserId(String str) {
            this.user_id = str;
            return this;
        }
    }

    public User(Builder builder) {
        this.intercomId = NullSafety.valueOrEmpty(builder.intercom_id);
        this.encryptedUserId = NullSafety.valueOrEmpty(builder.encrypted_user_id);
        this.anonymousId = NullSafety.valueOrEmpty(builder.anonymous_id);
        this.userId = NullSafety.valueOrEmpty(builder.user_id);
        this.email = NullSafety.valueOrEmpty(builder.email);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.intercomId.equals(user.intercomId) && this.encryptedUserId.equals(user.encryptedUserId) && this.anonymousId.equals(user.anonymousId) && this.userId.equals(user.userId)) {
            return this.email.equals(user.email);
        }
        return false;
    }

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public String getIntercomId() {
        return this.intercomId;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.email.hashCode() + ru3.c(ru3.c(ru3.c(this.intercomId.hashCode() * 31, 31, this.encryptedUserId), 31, this.anonymousId), 31, this.userId);
    }

    public User() {
        this.intercomId = BuildConfig.FLAVOR;
        this.encryptedUserId = BuildConfig.FLAVOR;
        this.anonymousId = BuildConfig.FLAVOR;
        this.userId = BuildConfig.FLAVOR;
        this.email = BuildConfig.FLAVOR;
    }
}
