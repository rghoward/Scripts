package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.fk;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Attribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Attribute> CREATOR = new Creator();

    @SerializedName("custom_bot_control_id")
    private final String customBotControlId;

    @SerializedName("identifier")
    private final String identifier;

    @SerializedName("multiline")
    private final Boolean multiline;

    @SerializedName("name")
    private final String name;

    @SerializedName("options")
    private final List<String> options;

    @SerializedName(MetricTracker.Action.SUBMITTED)
    private final boolean submitted;

    @SerializedName("type")
    private final String type;

    @SerializedName("value")
    private final String value;

    public /* synthetic */ Attribute(String str, String str2, String str3, boolean z, String str4, List list, Boolean bool, String str5, int i, qq2 qq2Var) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, String str3, boolean z, String str4, List list, Boolean bool, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attribute.identifier;
        }
        if ((i & 2) != 0) {
            str2 = attribute.name;
        }
        if ((i & 4) != 0) {
            str3 = attribute.type;
        }
        if ((i & 8) != 0) {
            z = attribute.submitted;
        }
        if ((i & 16) != 0) {
            str4 = attribute.customBotControlId;
        }
        if ((i & 32) != 0) {
            list = attribute.options;
        }
        if ((i & 64) != 0) {
            bool = attribute.multiline;
        }
        if ((i & 128) != 0) {
            str5 = attribute.value;
        }
        Boolean bool2 = bool;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        return attribute.copy(str, str2, str3, z, str7, list2, bool2, str6);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.submitted;
    }

    public final String component5() {
        return this.customBotControlId;
    }

    public final List<String> component6() {
        return this.options;
    }

    public final Boolean component7() {
        return this.multiline;
    }

    public final String component8() {
        return this.value;
    }

    public final Attribute copy(String str, String str2, String str3, boolean z, String str4, List<String> list, Boolean bool, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new Attribute(str, str2, str3, z, str4, list, bool, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        return xj5.a(this.identifier, attribute.identifier) && xj5.a(this.name, attribute.name) && xj5.a(this.type, attribute.type) && this.submitted == attribute.submitted && xj5.a(this.customBotControlId, attribute.customBotControlId) && xj5.a(this.options, attribute.options) && xj5.a(this.multiline, attribute.multiline) && xj5.a(this.value, attribute.value);
    }

    public final String getCustomBotControlId() {
        return this.customBotControlId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Boolean getMultiline() {
        return this.multiline;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final String getRenderType() {
        String str = this.type;
        switch (str.hashCode()) {
            case -891985903:
                if (!str.equals("string")) {
                    return "unknown";
                }
                List<String> list = this.options;
                if (list != null && !list.isEmpty()) {
                    return AttributeType.LIST;
                }
                String str2 = this.identifier;
                int iHashCode = str2.hashCode();
                if (iHashCode != 75849770) {
                    if (iHashCode != 96619420) {
                        if (iHashCode != 106642798 || !str2.equals(AttributeType.PHONE)) {
                            return AttributeType.TEXT;
                        }
                    } else if (!str2.equals("email")) {
                        return AttributeType.TEXT;
                    }
                } else if (!str2.equals(AttributeType.WEBSITE)) {
                    return AttributeType.TEXT;
                }
                return this.identifier;
            case 3076014:
                return !str.equals(AttributeType.DATE) ? "unknown" : AttributeType.DATE;
            case 64711720:
                return !str.equals(AttributeType.BOOLEAN) ? "unknown" : AttributeType.BOOLEAN;
            case 97526364:
                return !str.equals(AttributeType.FLOAT) ? "unknown" : AttributeType.FLOAT;
            case 1958052158:
                return !str.equals(AttributeType.INTEGER) ? "unknown" : AttributeType.NUMBER;
            default:
                return "unknown";
        }
    }

    public final boolean getSubmitted() {
        return this.submitted;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean hasValue() {
        String str = this.value;
        return !(str == null || str.length() == 0);
    }

    public int hashCode() {
        int iA = uo2.a(ru3.c(ru3.c(this.identifier.hashCode() * 31, 31, this.name), 31, this.type), this.submitted, 31);
        String str = this.customBotControlId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.options;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.multiline;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.value;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attribute(identifier=");
        sb.append(this.identifier);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", submitted=");
        sb.append(this.submitted);
        sb.append(", customBotControlId=");
        sb.append(this.customBotControlId);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", multiline=");
        sb.append(this.multiline);
        sb.append(", value=");
        return wu0.a(sb, this.value, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.getClass();
        parcel.writeString(this.identifier);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.submitted ? 1 : 0);
        parcel.writeString(this.customBotControlId);
        parcel.writeStringList(this.options);
        Boolean bool = this.multiline;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.value);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Attribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z2 = true;
                z = true;
            } else {
                z = true;
            }
            String string4 = parcel.readString();
            boolean z3 = z;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z3 : false);
            }
            return new Attribute(string, string2, string3, z2, string4, arrayListCreateStringArrayList, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attribute[] newArray(int i) {
            return new Attribute[i];
        }
    }

    public Attribute(String str, String str2, String str3, boolean z, String str4, List<String> list, Boolean bool, String str5) {
        fk.b(str, str2, str3);
        this.identifier = str;
        this.name = str2;
        this.type = str3;
        this.submitted = z;
        this.customBotControlId = str4;
        this.options = list;
        this.multiline = bool;
        this.value = str5;
    }
}
