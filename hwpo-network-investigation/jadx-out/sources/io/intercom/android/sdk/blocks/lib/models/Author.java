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
public final class Author implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("avatar")
    private final String _avatar;

    @SerializedName("firstName")
    private final String _firstName;

    @SerializedName("lastName")
    private final String _lastName;

    @SerializedName("name")
    private final String _name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Author> CREATOR = new Creator();

    public /* synthetic */ Author(String str, String str2, String str3, String str4, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    private final String component1() {
        return this._name;
    }

    private final String component2() {
        return this._avatar;
    }

    private final String component3() {
        return this._firstName;
    }

    private final String component4() {
        return this._lastName;
    }

    public static /* synthetic */ Author copy$default(Author author, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = author._name;
        }
        if ((i & 2) != 0) {
            str2 = author._avatar;
        }
        if ((i & 4) != 0) {
            str3 = author._firstName;
        }
        if ((i & 8) != 0) {
            str4 = author._lastName;
        }
        return author.copy(str, str2, str3, str4);
    }

    public static final Author create(String str, String str2, String str3, String str4) {
        return Companion.create(str, str2, str3, str4);
    }

    public final Author copy(String str, String str2, String str3, String str4) {
        return new Author(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return xj5.a(this._name, author._name) && xj5.a(this._avatar, author._avatar) && xj5.a(this._firstName, author._firstName) && xj5.a(this._lastName, author._lastName);
    }

    public final String getAvatar() {
        String str = this._avatar;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getFirstName() {
        String str = this._firstName;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getLastName() {
        String str = this._lastName;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getName() {
        String str = this._name;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int hashCode() {
        String str = this._name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._firstName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this._lastName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Author(_name=");
        sb.append(this._name);
        sb.append(", _avatar=");
        sb.append(this._avatar);
        sb.append(", _firstName=");
        sb.append(this._firstName);
        sb.append(", _lastName=");
        return wu0.a(sb, this._lastName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this._name);
        parcel.writeString(this._avatar);
        parcel.writeString(this._firstName);
        parcel.writeString(this._lastName);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public static /* synthetic */ Author create$default(Companion companion, String str, String str2, String str3, String str4, int i, Object obj) {
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

        public final Author create(String str, String str2, String str3, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return new Author(str, str2, str3, str4);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Author> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Author createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Author(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Author[] newArray(int i) {
            return new Author[i];
        }
    }

    public Author(String str) {
        this(str, null, null, null, 14, null);
    }

    public Author(String str, String str2) {
        this(str, str2, null, null, 12, null);
    }

    public Author(String str, String str2, String str3) {
        this(str, str2, str3, null, 8, null);
    }

    public Author(String str, String str2, String str3, String str4) {
        this._name = str;
        this._avatar = str2;
        this._firstName = str3;
        this._lastName = str4;
    }

    public Author() {
        this(null, null, null, null, 15, null);
    }
}
