package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.xj5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketType implements Parcelable {

    @SerializedName("archived")
    private final boolean archived;

    @SerializedName("attributes")
    private final List<TicketAttribute> attributes;

    @SerializedName("emoji")
    private final String emoji;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TicketType> CREATOR = new Creator();
    private static final TicketType NULL = new TicketType(-1, BuildConfig.FLAVOR, BuildConfig.FLAVOR, hf3.t, false);

    public TicketType(long j, String str, String str2, List<TicketAttribute> list, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.id = j;
        this.name = str;
        this.emoji = str2;
        this.attributes = list;
        this.archived = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketType copy$default(TicketType ticketType, long j, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ticketType.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = ticketType.name;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = ticketType.emoji;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = ticketType.attributes;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = ticketType.archived;
        }
        return ticketType.copy(j2, str3, str4, list2, z);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.emoji;
    }

    public final List<TicketAttribute> component4() {
        return this.attributes;
    }

    public final boolean component5() {
        return this.archived;
    }

    public final TicketType copy(long j, String str, String str2, List<TicketAttribute> list, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new TicketType(j, str, str2, list, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketType)) {
            return false;
        }
        TicketType ticketType = (TicketType) obj;
        return this.id == ticketType.id && xj5.a(this.name, ticketType.name) && xj5.a(this.emoji, ticketType.emoji) && xj5.a(this.attributes, ticketType.attributes) && this.archived == ticketType.archived;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.archived) + ho2.a(ru3.c(ru3.c(Long.hashCode(this.id) * 31, 31, this.name), 31, this.emoji), 31, this.attributes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TicketType(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", emoji=");
        sb.append(this.emoji);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", archived=");
        return pi1.a(sb, this.archived, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.emoji);
        List<TicketAttribute> list = this.attributes;
        parcel.writeInt(list.size());
        Iterator<TicketAttribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.archived ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final TicketType getNULL() {
            return TicketType.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<TicketType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TicketAttribute.CREATOR.createFromParcel(parcel));
            }
            return new TicketType(j, string, string2, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TicketType[] newArray(int i) {
            return new TicketType[i];
        }
    }
}
