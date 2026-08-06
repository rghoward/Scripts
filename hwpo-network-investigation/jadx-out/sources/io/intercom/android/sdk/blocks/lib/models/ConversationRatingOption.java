package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationRatingOption implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ConversationRatingOption> CREATOR = new Creator();

    @SerializedName("emoji")
    private final String _emoji;

    @SerializedName("unicode")
    private final String _unicode;

    @SerializedName("index")
    private final int index;

    public /* synthetic */ ConversationRatingOption(int i, String str, String str2, int i2, qq2 qq2Var) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2);
    }

    private final String component2() {
        return this._emoji;
    }

    private final String component3() {
        return this._unicode;
    }

    public static /* synthetic */ ConversationRatingOption copy$default(ConversationRatingOption conversationRatingOption, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = conversationRatingOption.index;
        }
        if ((i2 & 2) != 0) {
            str = conversationRatingOption._emoji;
        }
        if ((i2 & 4) != 0) {
            str2 = conversationRatingOption._unicode;
        }
        return conversationRatingOption.copy(i, str, str2);
    }

    public final int component1() {
        return this.index;
    }

    public final ConversationRatingOption copy(int i, String str, String str2) {
        return new ConversationRatingOption(i, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationRatingOption)) {
            return false;
        }
        ConversationRatingOption conversationRatingOption = (ConversationRatingOption) obj;
        return this.index == conversationRatingOption.index && xj5.a(this._emoji, conversationRatingOption._emoji) && xj5.a(this._unicode, conversationRatingOption._unicode);
    }

    public final String getEmoji() {
        String str = this._emoji;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getUnicode() {
        String str = this._unicode;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        String str = this._emoji;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._unicode;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationRatingOption(index=");
        sb.append(this.index);
        sb.append(", _emoji=");
        sb.append(this._emoji);
        sb.append(", _unicode=");
        return wu0.a(sb, this._unicode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.index);
        parcel.writeString(this._emoji);
        parcel.writeString(this._unicode);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<ConversationRatingOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversationRatingOption createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ConversationRatingOption(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversationRatingOption[] newArray(int i) {
            return new ConversationRatingOption[i];
        }
    }

    public ConversationRatingOption(int i, String str, String str2) {
        this.index = i;
        this._emoji = str;
        this._unicode = str2;
    }

    public ConversationRatingOption() {
        this(0, null, null, 7, null);
    }
}
