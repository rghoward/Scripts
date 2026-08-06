package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Attachments implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("content_type")
    private final String _contentType;

    @SerializedName("human_file_size")
    private final String _humanFileSize;

    @SerializedName("name")
    private final String _name;

    @SerializedName("url")
    private final String _url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Attachments> CREATOR = new Creator();

    public /* synthetic */ Attachments(String str, String str2, String str3, String str4, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    private final String component1() {
        return this._name;
    }

    private final String component2() {
        return this._url;
    }

    private final String component3() {
        return this._contentType;
    }

    private final String component4() {
        return this._humanFileSize;
    }

    public static /* synthetic */ Attachments copy$default(Attachments attachments, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attachments._name;
        }
        if ((i & 2) != 0) {
            str2 = attachments._url;
        }
        if ((i & 4) != 0) {
            str3 = attachments._contentType;
        }
        if ((i & 8) != 0) {
            str4 = attachments._humanFileSize;
        }
        return attachments.copy(str, str2, str3, str4);
    }

    public static final Attachments create(String str, String str2, String str3, String str4) {
        return Companion.create(str, str2, str3, str4);
    }

    public final Attachments copy(String str, String str2, String str3, String str4) {
        return new Attachments(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attachments)) {
            return false;
        }
        Attachments attachments = (Attachments) obj;
        return xj5.a(this._name, attachments._name) && xj5.a(this._url, attachments._url) && xj5.a(this._contentType, attachments._contentType) && xj5.a(this._humanFileSize, attachments._humanFileSize);
    }

    public final String getContentType() {
        String str = this._contentType;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getHumanFileSize() {
        String str = this._humanFileSize;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getName() {
        String str = this._name;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getUrl() {
        String str = this._url;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int hashCode() {
        String str = this._name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._contentType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this._humanFileSize;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attachments(_name=");
        sb.append(this._name);
        sb.append(", _url=");
        sb.append(this._url);
        sb.append(", _contentType=");
        sb.append(this._contentType);
        sb.append(", _humanFileSize=");
        return wu0.a(sb, this._humanFileSize, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this._name);
        parcel.writeString(this._url);
        parcel.writeString(this._contentType);
        parcel.writeString(this._humanFileSize);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public static /* synthetic */ Attachments create$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = BuildConfig.FLAVOR;
            }
            if ((i & 2) != 0) {
                str2 = BuildConfig.FLAVOR;
            }
            if ((i & 4) != 0) {
                str3 = BuildConfig.FLAVOR;
            }
            if ((i & 8) != 0) {
                str4 = BuildConfig.FLAVOR;
            }
            return companion.create(str, str2, str3, str4);
        }

        public final Attachments create(String str, String str2, String str3, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return new Attachments(str, str2, str3, str4);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Attachments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attachments createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Attachments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Attachments[] newArray(int i) {
            return new Attachments[i];
        }
    }

    public Attachments(String str, String str2, String str3, String str4) {
        this._name = str;
        this._url = str2;
        this._contentType = str3;
        this._humanFileSize = str4;
    }

    public Attachments() {
        this(null, null, null, null, 15, null);
    }
}
