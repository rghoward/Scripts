package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Location implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Location> CREATOR = new Creator();

    @SerializedName("city_name")
    private final String _cityName;

    @SerializedName("country_name")
    private final String _countryName;

    @SerializedName("timezone_offset")
    private final Integer timezoneOffset;

    public /* synthetic */ Location(String str, String str2, Integer num, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }

    private final String component1() {
        return this._cityName;
    }

    private final String component2() {
        return this._countryName;
    }

    public static /* synthetic */ Location copy$default(Location location, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = location._cityName;
        }
        if ((i & 2) != 0) {
            str2 = location._countryName;
        }
        if ((i & 4) != 0) {
            num = location.timezoneOffset;
        }
        return location.copy(str, str2, num);
    }

    public final Integer component3() {
        return this.timezoneOffset;
    }

    public final Location copy(String str, String str2, Integer num) {
        return new Location(str, str2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return xj5.a(this._cityName, location._cityName) && xj5.a(this._countryName, location._countryName) && xj5.a(this.timezoneOffset, location.timezoneOffset);
    }

    public final String getCityName() {
        String str = this._cityName;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getCountryName() {
        String str = this._countryName;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final Integer getTimezoneOffset() {
        return this.timezoneOffset;
    }

    public int hashCode() {
        String str = this._cityName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._countryName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.timezoneOffset;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Location(_cityName=" + this._cityName + ", _countryName=" + this._countryName + ", timezoneOffset=" + this.timezoneOffset + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this._cityName);
        parcel.writeString(this._countryName);
        Integer num = this.timezoneOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Location> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Location createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Location(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Location[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location(String str) {
        this(str, null, null, 6, null);
    }

    public Location(String str, String str2) {
        this(str, str2, null, 4, null);
    }

    public Location(String str, String str2, Integer num) {
        this._cityName = str;
        this._countryName = str2;
        this.timezoneOffset = num;
    }

    public Location() {
        this(null, null, null, 7, null);
    }
}
