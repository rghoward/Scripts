package io.intercom.android.sdk.identity;

import defpackage.ac4;
import defpackage.av;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_SoftUserIdentity extends SoftUserIdentity {
    private final String anonymousId;
    private final String email;
    private final String encryptedUserId;
    private final String fingerprint;
    private final String hmac;
    private final String intercomId;
    private final String jwt;
    private final String userId;

    public AutoValue_SoftUserIdentity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str == null) {
            ac4.c("Null anonymousId");
            throw null;
        }
        this.anonymousId = str;
        if (str2 == null) {
            ac4.c("Null email");
            throw null;
        }
        this.email = str2;
        if (str3 == null) {
            ac4.c("Null fingerprint");
            throw null;
        }
        this.fingerprint = str3;
        if (str4 == null) {
            ac4.c("Null hmac");
            throw null;
        }
        this.hmac = str4;
        if (str5 == null) {
            ac4.c("Null jwt");
            throw null;
        }
        this.jwt = str5;
        if (str6 == null) {
            ac4.c("Null intercomId");
            throw null;
        }
        this.intercomId = str6;
        if (str7 == null) {
            ac4.c("Null userId");
            throw null;
        }
        this.userId = str7;
        if (str8 != null) {
            this.encryptedUserId = str8;
        } else {
            ac4.c("Null encryptedUserId");
            throw null;
        }
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String anonymousId() {
        return this.anonymousId;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String email() {
        return this.email;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String encryptedUserId() {
        return this.encryptedUserId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SoftUserIdentity) {
            SoftUserIdentity softUserIdentity = (SoftUserIdentity) obj;
            if (this.anonymousId.equals(softUserIdentity.anonymousId()) && this.email.equals(softUserIdentity.email()) && this.fingerprint.equals(softUserIdentity.fingerprint()) && this.hmac.equals(softUserIdentity.hmac()) && this.jwt.equals(softUserIdentity.jwt()) && this.intercomId.equals(softUserIdentity.intercomId()) && this.userId.equals(softUserIdentity.userId()) && this.encryptedUserId.equals(softUserIdentity.encryptedUserId())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String fingerprint() {
        return this.fingerprint;
    }

    public int hashCode() {
        return this.encryptedUserId.hashCode() ^ ((((((((((((((this.anonymousId.hashCode() ^ 1000003) * 1000003) ^ this.email.hashCode()) * 1000003) ^ this.fingerprint.hashCode()) * 1000003) ^ this.hmac.hashCode()) * 1000003) ^ this.jwt.hashCode()) * 1000003) ^ this.intercomId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003);
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String hmac() {
        return this.hmac;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String intercomId() {
        return this.intercomId;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String jwt() {
        return this.jwt;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SoftUserIdentity{anonymousId=");
        sb.append(this.anonymousId);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", fingerprint=");
        sb.append(this.fingerprint);
        sb.append(", hmac=");
        sb.append(this.hmac);
        sb.append(", jwt=");
        sb.append(this.jwt);
        sb.append(", intercomId=");
        sb.append(this.intercomId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", encryptedUserId=");
        return av.a(sb, this.encryptedUserId, "}");
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String userId() {
        return this.userId;
    }
}
