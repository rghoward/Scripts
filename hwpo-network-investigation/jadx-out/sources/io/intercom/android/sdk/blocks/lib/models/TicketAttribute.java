package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hf3;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketAttribute implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TicketAttribute> CREATOR = new Creator();
    private final long id;
    private final String identifier;
    private final String name;
    private final List<String> options;
    private final boolean required;
    private final String type;

    public TicketAttribute(long j, String str, String str2, boolean z, String str3, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.id = j;
        this.name = str;
        this.type = str2;
        this.required = z;
        this.identifier = str3;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketAttribute copy$default(TicketAttribute ticketAttribute, long j, String str, String str2, boolean z, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ticketAttribute.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = ticketAttribute.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = ticketAttribute.type;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            z = ticketAttribute.required;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = ticketAttribute.identifier;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            list = ticketAttribute.options;
        }
        return ticketAttribute.copy(j2, str4, str5, z2, str6, list);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.required;
    }

    public final String component5() {
        return this.identifier;
    }

    public final List<String> component6() {
        return this.options;
    }

    public final TicketAttribute copy(long j, String str, String str2, boolean z, String str3, List<String> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new TicketAttribute(j, str, str2, z, str3, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttribute)) {
            return false;
        }
        TicketAttribute ticketAttribute = (TicketAttribute) obj;
        return this.id == ticketAttribute.id && xj5.a(this.name, ticketAttribute.name) && xj5.a(this.type, ticketAttribute.type) && this.required == ticketAttribute.required && xj5.a(this.identifier, ticketAttribute.identifier) && xj5.a(this.options, ticketAttribute.options);
    }

    public final long getId() {
        return this.id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = uo2.a(ru3.c(ru3.c(Long.hashCode(this.id) * 31, 31, this.name), 31, this.type), this.required, 31);
        String str = this.identifier;
        return this.options.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TicketAttribute(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", required=");
        sb.append(this.required);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", options=");
        return zc6.a(sb, this.options, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeString(this.identifier);
        parcel.writeStringList(this.options);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<TicketAttribute> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketAttribute createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TicketAttribute(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketAttribute[] newArray(int i) {
            return new TicketAttribute[i];
        }
    }

    public /* synthetic */ TicketAttribute(long j, String str, String str2, boolean z, String str3, List list, int i, qq2 qq2Var) {
        this(j, str, str2, z, str3, (i & 32) != 0 ? hf3.t : list);
    }
}
