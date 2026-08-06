package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.e44;
import defpackage.os2;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Image implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Image> CREATOR = new Creator();

    @SerializedName("alt")
    private final String _alt;

    @SerializedName("attribution")
    private final String _attribution;

    @SerializedName("previewUrl")
    private final String _previewUrl;

    @SerializedName("url")
    private final String _url;

    @SerializedName("height")
    private final int height;

    @SerializedName("width")
    private final int width;

    public /* synthetic */ Image(String str, String str2, String str3, String str4, int i, int i2, int i3, qq2 qq2Var) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2);
    }

    private final String component1() {
        return this._alt;
    }

    private final String component2() {
        return this._url;
    }

    private final String component3() {
        return this._previewUrl;
    }

    private final String component4() {
        return this._attribution;
    }

    public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, String str4, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = image._alt;
        }
        if ((i3 & 2) != 0) {
            str2 = image._url;
        }
        if ((i3 & 4) != 0) {
            str3 = image._previewUrl;
        }
        if ((i3 & 8) != 0) {
            str4 = image._attribution;
        }
        if ((i3 & 16) != 0) {
            i = image.width;
        }
        if ((i3 & 32) != 0) {
            i2 = image.height;
        }
        int i4 = i;
        int i5 = i2;
        return image.copy(str, str2, str3, str4, i4, i5);
    }

    public final int component5() {
        return this.width;
    }

    public final int component6() {
        return this.height;
    }

    public final Image copy(String str, String str2, String str3, String str4, int i, int i2) {
        return new Image(str, str2, str3, str4, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return xj5.a(this._alt, image._alt) && xj5.a(this._url, image._url) && xj5.a(this._previewUrl, image._previewUrl) && xj5.a(this._attribution, image._attribution) && this.width == image.width && this.height == image.height;
    }

    public final String getAlt() {
        String str = this._alt;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getAttribution() {
        String str = this._attribution;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPreviewUrl() {
        String str = this._previewUrl;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getUrl() {
        String str = this._url;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this._alt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._previewUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this._attribution;
        return Integer.hashCode(this.height) + os2.a(this.width, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Image(_alt=");
        sb.append(this._alt);
        sb.append(", _url=");
        sb.append(this._url);
        sb.append(", _previewUrl=");
        sb.append(this._previewUrl);
        sb.append(", _attribution=");
        sb.append(this._attribution);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return e44.a(sb, this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this._alt);
        parcel.writeString(this._url);
        parcel.writeString(this._previewUrl);
        parcel.writeString(this._attribution);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Image> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Image createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Image(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Image[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image(String str) {
        this(str, null, null, null, 0, 0, 62, null);
    }

    public Image(String str, String str2) {
        this(str, str2, null, null, 0, 0, 60, null);
    }

    public Image(String str, String str2, String str3) {
        this(str, str2, str3, null, 0, 0, 56, null);
    }

    public Image(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, 0, 0, 48, null);
    }

    public Image(String str, String str2, String str3, String str4, int i) {
        this(str, str2, str3, str4, i, 0, 32, null);
    }

    public Image(String str, String str2, String str3, String str4, int i, int i2) {
        this._alt = str;
        this._url = str2;
        this._previewUrl = str3;
        this._attribution = str4;
        this.width = i;
        this.height = i2;
    }

    public Image() {
        this(null, null, null, null, 0, 0, 63, null);
    }
}
