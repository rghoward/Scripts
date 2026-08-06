package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import defpackage.aa;
import defpackage.zc6;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CustomAttributeValidator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class UserAttributes {
    private static final String COMPANIES = "companies";
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String EMAIL = "email";
    private static final String LANGUAGE_OVERRIDE = "language_override";
    private static final String NAME = "name";
    private static final String PHONE = "phone";
    private static final String SIGNED_UP_AT = "signed_up_at";
    private static final Twig TWIG = LumberMill.getLogger();
    private static final String UNSUBSCRIBED_FROM_EMAILS = "unsubscribed_from_emails";
    private static final String USER_ID = "user_id";
    private final Map<String, Object> attributes;
    private final List<Map<String, Object>> companies;
    private final Map<String, Object> customAttributes;

    public UserAttributes(Builder builder) {
        this.attributes = builder.attributes;
        this.customAttributes = builder.customAttributes;
        this.companies = builder.companies;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserAttributes userAttributes = (UserAttributes) obj;
        if (this.attributes.equals(userAttributes.attributes) && this.customAttributes.equals(userAttributes.customAttributes)) {
            return this.companies.equals(userAttributes.companies);
        }
        return false;
    }

    public int hashCode() {
        return this.companies.hashCode() + ((this.customAttributes.hashCode() + (this.attributes.hashCode() * 31)) * 31);
    }

    public boolean isEmpty() {
        return this.attributes.isEmpty() && this.customAttributes.isEmpty() && this.companies.isEmpty();
    }

    public Map<String, Object> toMap() {
        if (!this.customAttributes.isEmpty()) {
            this.attributes.put(CUSTOM_ATTRIBUTES, this.customAttributes);
        }
        if (!this.companies.isEmpty()) {
            this.attributes.put(COMPANIES, this.companies);
        }
        return this.attributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserAttributes{attributes=");
        sb.append(this.attributes);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", companies=");
        return zc6.a(sb, this.companies, '}');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder {
        final Map<String, Object> attributes = new HashMap();
        final Map<String, Object> customAttributes = new HashMap();
        final List<Map<String, Object>> companies = new ArrayList();

        public UserAttributes build() {
            return new UserAttributes(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Builder.class != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (this.attributes.equals(builder.attributes) && this.customAttributes.equals(builder.customAttributes)) {
                return this.companies.equals(builder.companies);
            }
            return false;
        }

        public int hashCode() {
            return this.companies.hashCode() + ((this.customAttributes.hashCode() + (this.attributes.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder{attributes=");
            sb.append(this.attributes);
            sb.append(", customAttributes=");
            sb.append(this.customAttributes);
            sb.append(", companies=");
            return zc6.a(sb, this.companies, '}');
        }

        public Builder withCompany(Company company) {
            if (company == null) {
                UserAttributes.TWIG.w("The company you provided was null", new Object[0]);
                return this;
            }
            this.companies.add(company.getAttributes());
            return this;
        }

        public Builder withCustomAttribute(String str, Object obj) {
            if (str == null) {
                UserAttributes.TWIG.w("The key you provided was null for the attribute " + obj, new Object[0]);
                return this;
            }
            if (CustomAttributeValidator.isValid(obj)) {
                this.customAttributes.put(str, obj);
                return this;
            }
            Twig twig = UserAttributes.TWIG;
            StringBuilder sbA = aa.a("The custom user attribute ", str, " was of type ");
            sbA.append(obj.getClass().getSimpleName());
            sbA.append(" We only accept the following types: ");
            sbA.append(CustomAttributeValidator.getAcceptedTypes());
            twig.w(sbA.toString(), new Object[0]);
            return this;
        }

        public Builder withCustomAttributes(Map<String, ?> map) {
            if (map == null) {
                UserAttributes.TWIG.w("The map of attributes you provided was null.", new Object[0]);
                return this;
            }
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (CustomAttributeValidator.isValid(value)) {
                    this.customAttributes.put(entry.getKey(), value);
                } else {
                    UserAttributes.TWIG.w("The custom user attribute " + entry.getKey() + " was of type " + value.getClass().getSimpleName() + " We only accept the following types: " + CustomAttributeValidator.getAcceptedTypes(), new Object[0]);
                }
            }
            return this;
        }

        public Builder withEmail(String str) {
            this.attributes.put("email", str);
            return this;
        }

        public Builder withLanguageOverride(String str) {
            this.attributes.put(UserAttributes.LANGUAGE_OVERRIDE, str);
            return this;
        }

        public Builder withName(String str) {
            this.attributes.put(UserAttributes.NAME, str);
            return this;
        }

        public Builder withPhone(String str) {
            this.attributes.put("phone", str);
            return this;
        }

        public Builder withSignedUpAt(Date date) {
            return withSignedUpAt(date == null ? null : Long.valueOf(date.getTime() / 1000));
        }

        public Builder withUnsubscribedFromEmails(Boolean bool) {
            this.attributes.put(UserAttributes.UNSUBSCRIBED_FROM_EMAILS, bool);
            return this;
        }

        public Builder withUserId(String str) {
            this.attributes.put(UserAttributes.USER_ID, str);
            return this;
        }

        public Builder withSignedUpAt(Long l) {
            this.attributes.put(UserAttributes.SIGNED_UP_AT, l);
            return this;
        }
    }
}
