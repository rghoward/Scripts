package io.intercom.android.sdk.blocks.lib.models;

import com.google.gson.annotations.SerializedName;
import defpackage.fk;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FormField {
    public static final int $stable = 8;

    @SerializedName("id")
    private final String id;

    @SerializedName("identifier")
    private final String identifier;

    @SerializedName("is_controlling_attribute")
    private final boolean isControllingAttribute;

    @SerializedName("name")
    private final String name;

    @SerializedName("options")
    private final Options options;

    @SerializedName("required")
    private final boolean required;

    @SerializedName("type")
    private final String type;

    @SerializedName("value")
    private final String value;

    public /* synthetic */ FormField(String str, String str2, String str3, String str4, boolean z, Options options, String str5, boolean z2, int i, qq2 qq2Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, z, (i & 32) != 0 ? null : options, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z2);
    }

    public static /* synthetic */ FormField copy$default(FormField formField, String str, String str2, String str3, String str4, boolean z, Options options, String str5, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formField.id;
        }
        if ((i & 2) != 0) {
            str2 = formField.name;
        }
        if ((i & 4) != 0) {
            str3 = formField.value;
        }
        if ((i & 8) != 0) {
            str4 = formField.type;
        }
        if ((i & 16) != 0) {
            z = formField.required;
        }
        if ((i & 32) != 0) {
            options = formField.options;
        }
        if ((i & 64) != 0) {
            str5 = formField.identifier;
        }
        if ((i & 128) != 0) {
            z2 = formField.isControllingAttribute;
        }
        String str6 = str5;
        boolean z3 = z2;
        boolean z4 = z;
        Options options2 = options;
        return formField.copy(str, str2, str3, str4, z4, options2, str6, z3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.value;
    }

    public final String component4() {
        return this.type;
    }

    public final boolean component5() {
        return this.required;
    }

    public final Options component6() {
        return this.options;
    }

    public final String component7() {
        return this.identifier;
    }

    public final boolean component8() {
        return this.isControllingAttribute;
    }

    public final FormField copy(String str, String str2, String str3, String str4, boolean z, Options options, String str5, boolean z2) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        return new FormField(str, str2, str3, str4, z, options, str5, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormField)) {
            return false;
        }
        FormField formField = (FormField) obj;
        return xj5.a(this.id, formField.id) && xj5.a(this.name, formField.name) && xj5.a(this.value, formField.value) && xj5.a(this.type, formField.type) && this.required == formField.required && xj5.a(this.options, formField.options) && xj5.a(this.identifier, formField.identifier) && this.isControllingAttribute == formField.isControllingAttribute;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iC = ru3.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.value;
        int iA = uo2.a(ru3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.type), this.required, 31);
        Options options = this.options;
        int iHashCode = (iA + (options == null ? 0 : options.hashCode())) * 31;
        String str2 = this.identifier;
        return Boolean.hashCode(this.isControllingAttribute) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isControllingAttribute() {
        return this.isControllingAttribute;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FormField(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", required=");
        sb.append(this.required);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", isControllingAttribute=");
        return pi1.a(sb, this.isControllingAttribute, ')');
    }

    public FormField(String str, String str2, String str3, String str4, boolean z, Options options, String str5, boolean z2) {
        fk.b(str, str2, str4);
        this.id = str;
        this.name = str2;
        this.value = str3;
        this.type = str4;
        this.required = z;
        this.options = options;
        this.identifier = str5;
        this.isControllingAttribute = z2;
    }
}
