package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventContent implements Parcelable {
    public static final int $stable = 0;

    @SerializedName(AttributeType.TEXT)
    private final String text;

    @SerializedName("weight")
    private final Weight weight;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EventContent> CREATOR = new Creator();
    public static final EventContent EMPTY = new EventContent(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    public /* synthetic */ EventContent(String str, Weight weight, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? null : weight);
    }

    public static /* synthetic */ EventContent copy$default(EventContent eventContent, String str, Weight weight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContent.text;
        }
        if ((i & 2) != 0) {
            weight = eventContent.weight;
        }
        return eventContent.copy(str, weight);
    }

    public final String component1() {
        return this.text;
    }

    public final Weight component2() {
        return this.weight;
    }

    public final EventContent copy(String str, Weight weight) {
        str.getClass();
        return new EventContent(str, weight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventContent)) {
            return false;
        }
        EventContent eventContent = (EventContent) obj;
        return xj5.a(this.text, eventContent.text) && this.weight == eventContent.weight;
    }

    public final String getText() {
        return this.text;
    }

    public final Weight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Weight weight = this.weight;
        return iHashCode + (weight == null ? 0 : weight.hashCode());
    }

    public String toString() {
        return "EventContent(text=" + this.text + ", weight=" + this.weight + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.text);
        Weight weight = this.weight;
        if (weight == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(weight.name());
        }
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
    public static final class Creator implements Parcelable.Creator<EventContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EventContent(parcel.readString(), parcel.readInt() == 0 ? null : Weight.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContent[] newArray(int i) {
            return new EventContent[i];
        }
    }

    public EventContent(String str, Weight weight) {
        str.getClass();
        this.text = str;
        this.weight = weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
