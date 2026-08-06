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
public final class Reaction implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("image_url")
    private final String _imageUrl;

    @SerializedName("index")
    private final int index;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Reaction> CREATOR = new Creator();

    public /* synthetic */ Reaction(int i, String str, int i2, qq2 qq2Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }

    private final String component2() {
        return this._imageUrl;
    }

    public static /* synthetic */ Reaction copy$default(Reaction reaction, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reaction.index;
        }
        if ((i2 & 2) != 0) {
            str = reaction._imageUrl;
        }
        return reaction.copy(i, str);
    }

    public static final Reaction create(int i, String str) {
        return Companion.create(i, str);
    }

    public final int component1() {
        return this.index;
    }

    public final Reaction copy(int i, String str) {
        return new Reaction(i, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        return this.index == reaction.index && xj5.a(this._imageUrl, reaction._imageUrl);
    }

    public final String getImageUrl() {
        String str = this._imageUrl;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        String str = this._imageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Reaction(index=");
        sb.append(this.index);
        sb.append(", _imageUrl=");
        return wu0.a(sb, this._imageUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.index);
        parcel.writeString(this._imageUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Reaction create(int i, String str) {
            str.getClass();
            return new Reaction(i, str);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Reaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Reaction(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Reaction[] newArray(int i) {
            return new Reaction[i];
        }
    }

    public Reaction(int i, String str) {
        this.index = i;
        this._imageUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Reaction() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
