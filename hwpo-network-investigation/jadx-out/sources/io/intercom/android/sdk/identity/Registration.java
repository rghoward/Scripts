package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.ru3;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Registration {
    private UserAttributes attributes;
    private final Twig twig = LumberMill.getLogger();
    private String email = BuildConfig.FLAVOR;
    private String userId = BuildConfig.FLAVOR;
    private Validity validity = Validity.NOT_SET;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Validity {
        NOT_SET,
        INVALID,
        VALID
    }

    public static Registration create() {
        return new Registration();
    }

    private void updateState(boolean z) {
        Validity validity = this.validity;
        if (validity == Validity.NOT_SET || validity == Validity.VALID) {
            this.validity = z ? Validity.VALID : Validity.INVALID;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Registration registration = (Registration) obj;
            if (!this.email.equals(registration.email) || !this.userId.equals(registration.userId)) {
                return false;
            }
            UserAttributes userAttributes = this.attributes;
            UserAttributes userAttributes2 = registration.attributes;
            if (userAttributes != null) {
                return userAttributes.equals(userAttributes2);
            }
            if (userAttributes2 == null) {
                return true;
            }
        }
        return false;
    }

    public UserAttributes getAttributes() {
        return this.attributes;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iC = ru3.c(this.email.hashCode() * 31, 31, this.userId);
        UserAttributes userAttributes = this.attributes;
        return iC + (userAttributes != null ? userAttributes.hashCode() : 0);
    }

    public boolean isValidRegistration() {
        return Validity.VALID.equals(this.validity);
    }

    public String toString() {
        return "Registration{email='" + this.email + "', userId='" + this.userId + "', attributes=" + this.attributes + '}';
    }

    public Registration withEmail(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.e("Email cannot be null or empty", new Object[0]);
        } else {
            this.email = str;
        }
        updateState(z);
        return this;
    }

    public Registration withUserAttributes(UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is null", new Object[0]);
            return this;
        }
        if (!userAttributes.isEmpty()) {
            this.attributes = userAttributes;
            return this;
        }
        this.validity = Validity.INVALID;
        this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is empty", new Object[0]);
        return this;
    }

    public Registration withUserId(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty;
        if (zIsEmpty) {
            this.twig.e("UserId cannot be null or empty", new Object[0]);
        } else {
            this.userId = str;
        }
        updateState(z);
        return this;
    }
}
