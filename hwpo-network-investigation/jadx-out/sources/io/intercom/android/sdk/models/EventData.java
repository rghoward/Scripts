package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventData implements Parcelable {

    @SerializedName("eventAsPlainText")
    private final String _eventAsPlainText;

    @SerializedName("eventContent")
    private final List<EventContent> _eventContent;

    @SerializedName("participant")
    private final EventParticipant.Builder _participant;

    @SerializedName("status")
    private final String _status;

    @SerializedName("customStateLabel")
    private final String customStateLabel;

    @SerializedName("customStatePrefix")
    private final String customStatePrefix;
    private final String description;
    private final String mergedConversationId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EventData> CREATOR = new Creator();
    public static final EventData NULL = new EventData(null, null, null, null, null, null, null, null, 255, null);

    public /* synthetic */ EventData(EventParticipant.Builder builder, String str, List list, String str2, String str3, String str4, String str5, String str6, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : builder, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }

    private final EventParticipant.Builder component1() {
        return this._participant;
    }

    private final String component2() {
        return this._eventAsPlainText;
    }

    private final List<EventContent> component3() {
        return this._eventContent;
    }

    private final String component4() {
        return this._status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventData copy$default(EventData eventData, EventParticipant.Builder builder, String str, List list, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = eventData._participant;
        }
        if ((i & 2) != 0) {
            str = eventData._eventAsPlainText;
        }
        if ((i & 4) != 0) {
            list = eventData._eventContent;
        }
        if ((i & 8) != 0) {
            str2 = eventData._status;
        }
        if ((i & 16) != 0) {
            str3 = eventData.customStateLabel;
        }
        if ((i & 32) != 0) {
            str4 = eventData.customStatePrefix;
        }
        if ((i & 64) != 0) {
            str5 = eventData.mergedConversationId;
        }
        if ((i & 128) != 0) {
            str6 = eventData.description;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        return eventData.copy(builder, str, list, str2, str9, str10, str7, str8);
    }

    public final String component5() {
        return this.customStateLabel;
    }

    public final String component6() {
        return this.customStatePrefix;
    }

    public final String component7() {
        return this.mergedConversationId;
    }

    public final String component8() {
        return this.description;
    }

    public final EventData copy(EventParticipant.Builder builder, String str, List<EventContent> list, String str2, String str3, String str4, String str5, String str6) {
        return new EventData(builder, str, list, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return xj5.a(this._participant, eventData._participant) && xj5.a(this._eventAsPlainText, eventData._eventAsPlainText) && xj5.a(this._eventContent, eventData._eventContent) && xj5.a(this._status, eventData._status) && xj5.a(this.customStateLabel, eventData.customStateLabel) && xj5.a(this.customStatePrefix, eventData.customStatePrefix) && xj5.a(this.mergedConversationId, eventData.mergedConversationId) && xj5.a(this.description, eventData.description);
    }

    public final String getCustomStateLabel() {
        return this.customStateLabel;
    }

    public final String getCustomStatePrefix() {
        return this.customStatePrefix;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEventAsPlainText() {
        String str = this._eventAsPlainText;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final List<EventContent> getEventContent() {
        List<EventContent> list = this._eventContent;
        return list == null ? hf3.t : list;
    }

    public final String getMergedConversationId() {
        return this.mergedConversationId;
    }

    public final EventParticipant getParticipant() {
        EventParticipant eventParticipantBuild;
        EventParticipant.Builder builder = this._participant;
        if (builder != null && (eventParticipantBuild = builder.build()) != null) {
            return eventParticipantBuild;
        }
        EventParticipant eventParticipant = EventParticipant.NULL;
        eventParticipant.getClass();
        return eventParticipant;
    }

    public final String getStatus() {
        String str = this._status;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int hashCode() {
        EventParticipant.Builder builder = this._participant;
        int iHashCode = (builder == null ? 0 : builder.hashCode()) * 31;
        String str = this._eventAsPlainText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<EventContent> list = this._eventContent;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this._status;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customStateLabel;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customStatePrefix;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mergedConversationId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventData(_participant=");
        sb.append(this._participant);
        sb.append(", _eventAsPlainText=");
        sb.append(this._eventAsPlainText);
        sb.append(", _eventContent=");
        sb.append(this._eventContent);
        sb.append(", _status=");
        sb.append(this._status);
        sb.append(", customStateLabel=");
        sb.append(this.customStateLabel);
        sb.append(", customStatePrefix=");
        sb.append(this.customStatePrefix);
        sb.append(", mergedConversationId=");
        sb.append(this.mergedConversationId);
        sb.append(", description=");
        return wu0.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeValue(this._participant);
        parcel.writeString(this._eventAsPlainText);
        List<EventContent> list = this._eventContent;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<EventContent> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this._status);
        parcel.writeString(this.customStateLabel);
        parcel.writeString(this.customStatePrefix);
        parcel.writeString(this.mergedConversationId);
        parcel.writeString(this.description);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<EventData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            EventParticipant.Builder builder = (EventParticipant.Builder) parcel.readValue(EventData.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(EventContent.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new EventData(builder, string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData[] newArray(int i) {
            return new EventData[i];
        }
    }

    public EventData(EventParticipant.Builder builder, String str, List<EventContent> list, String str2, String str3, String str4, String str5, String str6) {
        this._participant = builder;
        this._eventAsPlainText = str;
        this._eventContent = list;
        this._status = str2;
        this.customStateLabel = str3;
        this.customStatePrefix = str4;
        this.mergedConversationId = str5;
        this.description = str6;
    }

    public EventData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
