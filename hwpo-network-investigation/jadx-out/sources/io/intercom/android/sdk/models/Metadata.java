package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.xj5;
import defpackage.zc6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Metadata implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Metadata> CREATOR = new Creator();

    @SerializedName("avatars")
    private final List<Avatar.Builder> _avatars;

    @SerializedName("suffix")
    private final String suffix;

    @SerializedName("timestamp")
    private final Long timestamp;

    @SerializedName("title")
    private final String title;

    public /* synthetic */ Metadata(String str, String str2, Long l, List list, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list);
    }

    private final List<Avatar.Builder> component4() {
        return this._avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, String str2, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metadata.title;
        }
        if ((i & 2) != 0) {
            str2 = metadata.suffix;
        }
        if ((i & 4) != 0) {
            l = metadata.timestamp;
        }
        if ((i & 8) != 0) {
            list = metadata._avatars;
        }
        return metadata.copy(str, str2, l, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.suffix;
    }

    public final Long component3() {
        return this.timestamp;
    }

    public final Metadata copy(String str, String str2, Long l, List<Avatar.Builder> list) {
        str.getClass();
        return new Metadata(str, str2, l, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return xj5.a(this.title, metadata.title) && xj5.a(this.suffix, metadata.suffix) && xj5.a(this.timestamp, metadata.timestamp) && xj5.a(this._avatars, metadata._avatars);
    }

    public final List<Avatar> getAvatars() {
        List<Avatar.Builder> list = this._avatars;
        if (list == null) {
            return hf3.t;
        }
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Avatar.Builder) it.next()).build());
        }
        return arrayList;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.suffix;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.timestamp;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<Avatar.Builder> list = this._avatars;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(title=");
        sb.append(this.title);
        sb.append(", suffix=");
        sb.append(this.suffix);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", _avatars=");
        return zc6.a(sb, this._avatars, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.suffix);
        Long l = this.timestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Metadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Metadata(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), null, 8, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    private static /* synthetic */ void get_avatars$annotations() {
    }

    public Metadata(String str, String str2, Long l, List<Avatar.Builder> list) {
        str.getClass();
        this.title = str;
        this.suffix = str2;
        this.timestamp = l;
        this._avatars = list;
    }

    public Metadata() {
        this(null, null, null, null, 15, null);
    }
}
