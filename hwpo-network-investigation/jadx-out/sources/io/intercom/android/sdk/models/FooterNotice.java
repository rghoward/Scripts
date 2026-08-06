package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FooterNotice {
    public static final int $stable = 8;

    @SerializedName("avatar_details")
    private final AvatarDetails avatarDetails;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    public FooterNotice(String str, String str2, AvatarDetails avatarDetails) {
        str.getClass();
        this.title = str;
        this.subtitle = str2;
        this.avatarDetails = avatarDetails;
    }

    public static /* synthetic */ FooterNotice copy$default(FooterNotice footerNotice, String str, String str2, AvatarDetails avatarDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = footerNotice.title;
        }
        if ((i & 2) != 0) {
            str2 = footerNotice.subtitle;
        }
        if ((i & 4) != 0) {
            avatarDetails = footerNotice.avatarDetails;
        }
        return footerNotice.copy(str, str2, avatarDetails);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final AvatarDetails component3() {
        return this.avatarDetails;
    }

    public final FooterNotice copy(String str, String str2, AvatarDetails avatarDetails) {
        str.getClass();
        return new FooterNotice(str, str2, avatarDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterNotice)) {
            return false;
        }
        FooterNotice footerNotice = (FooterNotice) obj;
        return xj5.a(this.title, footerNotice.title) && xj5.a(this.subtitle, footerNotice.subtitle) && xj5.a(this.avatarDetails, footerNotice.avatarDetails);
    }

    public final AvatarDetails getAvatarDetails() {
        return this.avatarDetails;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AvatarDetails avatarDetails = this.avatarDetails;
        return iHashCode2 + (avatarDetails != null ? avatarDetails.hashCode() : 0);
    }

    public String toString() {
        return "FooterNotice(title=" + this.title + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ')';
    }
}
