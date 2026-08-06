package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplyOption implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ReplyOption> CREATOR = new Creator();
    private final String text;
    private final String uuid;

    public ReplyOption(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.uuid = str2;
    }

    public static /* synthetic */ ReplyOption copy$default(ReplyOption replyOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyOption.text;
        }
        if ((i & 2) != 0) {
            str2 = replyOption.uuid;
        }
        return replyOption.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.uuid;
    }

    public final ReplyOption copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new ReplyOption(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplyOption)) {
            return false;
        }
        ReplyOption replyOption = (ReplyOption) obj;
        return xj5.a(this.text, replyOption.text) && xj5.a(this.uuid, replyOption.uuid);
    }

    public final String getText() {
        return this.text;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReplyOption(text=");
        sb.append(this.text);
        sb.append(", uuid=");
        return wu0.a(sb, this.uuid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.text);
        parcel.writeString(this.uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<ReplyOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyOption createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ReplyOption(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyOption[] newArray(int i) {
            return new ReplyOption[i];
        }
    }
}
