package io.intercom.android.sdk.identity;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.models.User;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class UserIdentity {
    public static final String ANONYMOUS_ID = "anonymous_id";
    public static final String EMAIL = "email";
    public static final String INTERCOM_ID = "intercom_id";
    private static final String TYPE = "type";
    private static final String USER = "user";
    private static final String USER_ID = "user_id";
    private String anonymousId;
    private String email;
    private String encryptedUserId;
    private String fingerprint;
    private String hmac;
    private String intercomId;
    private String jwt;
    private SoftUserIdentity softUserIdentity = SoftUserIdentity.NONE;
    private final UserIdentityStore store;
    private String userId;

    public UserIdentity(UserIdentityStore userIdentityStore) {
        this.fingerprint = BuildConfig.FLAVOR;
        this.store = userIdentityStore;
        UserIdentityStore.UserFields userFieldsLoadUserFields = userIdentityStore.loadUserFields();
        this.anonymousId = userFieldsLoadUserFields.getAnonymousId();
        this.intercomId = userFieldsLoadUserFields.getIntercomId();
        this.userId = userFieldsLoadUserFields.getUserId();
        this.email = userFieldsLoadUserFields.getEmail();
        this.hmac = userFieldsLoadUserFields.getHmac();
        this.jwt = userFieldsLoadUserFields.getJwt();
        this.encryptedUserId = BuildConfig.FLAVOR;
        if (identityExists()) {
            this.fingerprint = generateFingerprint();
        }
    }

    private String generateFingerprint() {
        return UUID.randomUUID().toString();
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

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHmac() {
        return this.hmac;
    }

    public String getIntercomId() {
        return this.intercomId;
    }

    public String getJwt() {
        return this.jwt;
    }

    public String getSoftUserIdentityHmac() {
        return this.softUserIdentity.hmac();
    }

    public String getUserId() {
        return this.userId;
    }

    public void hardReset() {
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean hasIntercomId() {
        return !getIntercomId().isEmpty();
    }

    public boolean identityExists() {
        return (this.email.isEmpty() && this.userId.isEmpty() && this.intercomId.isEmpty() && this.anonymousId.isEmpty()) ? false : true;
    }

    public boolean isIdentified() {
        return identityExists() && !isUnidentified();
    }

    public boolean isSoftReset() {
        return this.softUserIdentity.isPresent();
    }

    public boolean isUnidentified() {
        return !this.anonymousId.isEmpty() && this.email.isEmpty() && this.userId.isEmpty();
    }

    public void registerIdentifiedUser(Registration registration) {
        this.intercomId = BuildConfig.FLAVOR;
        if (!registration.getUserId().isEmpty()) {
            this.userId = registration.getUserId();
        }
        if (!registration.getEmail().isEmpty()) {
            this.email = registration.getEmail();
        }
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = generateFingerprint();
        }
    }

    public void registerUnidentifiedUser() {
        String string = UUID.randomUUID().toString();
        this.anonymousId = string;
        this.store.save(new UserIdentityStore.UserFields(string, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = generateFingerprint();
        }
    }

    public boolean registrationHasAttributes(Registration registration) {
        return (registration == null || registration.getAttributes() == null || registration.getAttributes().isEmpty()) ? false : true;
    }

    public void setJwt(String str) {
        this.jwt = str;
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, str));
    }

    public void setUserHash(String str) {
        this.hmac = str;
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, str, this.jwt));
    }

    public boolean softIdentityIsSameUser(Registration registration) {
        if (isUnidentified()) {
            return false;
        }
        return this.softUserIdentity.isSameUser(registration);
    }

    public synchronized void softReset() {
        if (!isSoftReset()) {
            this.softUserIdentity = SoftUserIdentity.create(this.anonymousId, this.email, this.fingerprint, this.hmac, this.jwt, this.intercomId, this.userId, this.encryptedUserId);
            this.store.clear();
            this.anonymousId = BuildConfig.FLAVOR;
            this.intercomId = BuildConfig.FLAVOR;
            this.encryptedUserId = BuildConfig.FLAVOR;
            this.userId = BuildConfig.FLAVOR;
            this.email = BuildConfig.FLAVOR;
            this.hmac = BuildConfig.FLAVOR;
            this.jwt = BuildConfig.FLAVOR;
            this.fingerprint = BuildConfig.FLAVOR;
        }
    }

    public void softRestart() {
        this.userId = this.softUserIdentity.userId();
        this.email = this.softUserIdentity.email();
        this.anonymousId = this.softUserIdentity.anonymousId();
        this.intercomId = this.softUserIdentity.intercomId();
        this.encryptedUserId = this.softUserIdentity.encryptedUserId();
        this.hmac = this.softUserIdentity.hmac();
        this.jwt = this.softUserIdentity.jwt();
        this.fingerprint = this.softUserIdentity.fingerprint();
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean softUserIdentityHmacDiffers(String str) {
        return this.softUserIdentity.isPresent() && !getSoftUserIdentityHmac().equals(str);
    }

    public boolean softUserIdentityJwtDiffers(String str) {
        return this.softUserIdentity.isPresent() && !this.softUserIdentity.jwt().equals(str);
    }

    public Map<String, Object> softUserIdentityToMap() {
        HashMap map = new HashMap();
        String strAnonymousId = this.softUserIdentity.anonymousId();
        String strIntercomId = this.softUserIdentity.intercomId();
        String strUserId = this.softUserIdentity.userId();
        String strEmail = this.softUserIdentity.email();
        if (!strAnonymousId.isEmpty()) {
            map.put(ANONYMOUS_ID, strAnonymousId);
        } else if (!strIntercomId.isEmpty()) {
            map.put(INTERCOM_ID, strIntercomId);
        }
        if (!strUserId.isEmpty()) {
            map.put(USER_ID, strUserId);
        }
        if (!strEmail.isEmpty()) {
            map.put("email", strEmail);
        }
        map.put(TYPE, "user");
        return map;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        if (!this.anonymousId.isEmpty()) {
            map.put(ANONYMOUS_ID, this.anonymousId);
        } else if (!this.intercomId.isEmpty()) {
            map.put(INTERCOM_ID, this.intercomId);
        }
        if (!this.userId.isEmpty()) {
            map.put(USER_ID, this.userId);
        }
        if (!this.email.isEmpty()) {
            map.put("email", this.email);
        }
        map.put(TYPE, "user");
        return map;
    }

    public synchronized void update(User user) {
        try {
            if (user == User.NULL) {
                return;
            }
            this.userId = user.getUserId();
            this.email = user.getEmail();
            this.anonymousId = user.getAnonymousId();
            this.encryptedUserId = user.getEncryptedUserId();
            if (!user.getIntercomId().isEmpty()) {
                this.intercomId = user.getIntercomId();
            }
            this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        } catch (Throwable th) {
            throw th;
        }
    }
}
