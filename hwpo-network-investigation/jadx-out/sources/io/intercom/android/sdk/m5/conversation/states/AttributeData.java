package io.intercom.android.sdk.m5.conversation.states;

import defpackage.pi1;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.models.Attribute;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AttributeData {
    public static final int $stable = 8;
    private final Attribute attribute;
    private final boolean isFormDisabled;
    private final String partId;

    public AttributeData(Attribute attribute, String str, boolean z) {
        attribute.getClass();
        str.getClass();
        this.attribute = attribute;
        this.partId = str;
        this.isFormDisabled = z;
    }

    public static /* synthetic */ AttributeData copy$default(AttributeData attributeData, Attribute attribute, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            attribute = attributeData.attribute;
        }
        if ((i & 2) != 0) {
            str = attributeData.partId;
        }
        if ((i & 4) != 0) {
            z = attributeData.isFormDisabled;
        }
        return attributeData.copy(attribute, str, z);
    }

    public final Attribute component1() {
        return this.attribute;
    }

    public final String component2() {
        return this.partId;
    }

    public final boolean component3() {
        return this.isFormDisabled;
    }

    public final AttributeData copy(Attribute attribute, String str, boolean z) {
        attribute.getClass();
        str.getClass();
        return new AttributeData(attribute, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeData)) {
            return false;
        }
        AttributeData attributeData = (AttributeData) obj;
        return xj5.a(this.attribute, attributeData.attribute) && xj5.a(this.partId, attributeData.partId) && this.isFormDisabled == attributeData.isFormDisabled;
    }

    public final Attribute getAttribute() {
        return this.attribute;
    }

    public final String getPartId() {
        return this.partId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFormDisabled) + ru3.c(this.attribute.hashCode() * 31, 31, this.partId);
    }

    public final boolean isFormDisabled() {
        return this.isFormDisabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AttributeData(attribute=");
        sb.append(this.attribute);
        sb.append(", partId=");
        sb.append(this.partId);
        sb.append(", isFormDisabled=");
        return pi1.a(sb, this.isFormDisabled, ')');
    }
}
