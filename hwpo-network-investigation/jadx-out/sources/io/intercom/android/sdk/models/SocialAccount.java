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
public final class SocialAccount implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("profile_url")
    private final String _profileUrl;

    @SerializedName("provider")
    private final String _provider;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SocialAccount> CREATOR = new Creator();
    public static final SocialAccount NULL = new SocialAccount(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    public /* synthetic */ SocialAccount(String str, String str2, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    private final String component1() {
        return this._provider;
    }

    private final String component2() {
        return this._profileUrl;
    }

    public static /* synthetic */ SocialAccount copy$default(SocialAccount socialAccount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialAccount._provider;
        }
        if ((i & 2) != 0) {
            str2 = socialAccount._profileUrl;
        }
        return socialAccount.copy(str, str2);
    }

    public final SocialAccount copy(String str, String str2) {
        return new SocialAccount(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAccount)) {
            return false;
        }
        SocialAccount socialAccount = (SocialAccount) obj;
        return xj5.a(this._provider, socialAccount._provider) && xj5.a(this._profileUrl, socialAccount._profileUrl);
    }

    public final String getProfileUrl() {
        String str = this._profileUrl;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getProvider() {
        String str = this._provider;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int hashCode() {
        String str = this._provider;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._profileUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocialAccount(_provider=");
        sb.append(this._provider);
        sb.append(", _profileUrl=");
        return wu0.a(sb, this._profileUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this._provider);
        parcel.writeString(this._profileUrl);
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
    public static final class Creator implements Parcelable.Creator<SocialAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialAccount createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SocialAccount(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SocialAccount[] newArray(int i) {
            return new SocialAccount[i];
        }
    }

    public SocialAccount(String str, String str2) {
        this._provider = str;
        this._profileUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SocialAccount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
