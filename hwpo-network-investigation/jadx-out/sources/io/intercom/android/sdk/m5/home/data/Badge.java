package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Badge {
    public static final int $stable = 0;

    @SerializedName("badge_type")
    private final BadgeType badgeType;

    @SerializedName("label")
    private final String label;

    public Badge(BadgeType badgeType, String str) {
        badgeType.getClass();
        this.badgeType = badgeType;
        this.label = str;
    }

    public static /* synthetic */ Badge copy$default(Badge badge, BadgeType badgeType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            badgeType = badge.badgeType;
        }
        if ((i & 2) != 0) {
            str = badge.label;
        }
        return badge.copy(badgeType, str);
    }

    public final BadgeType component1() {
        return this.badgeType;
    }

    public final String component2() {
        return this.label;
    }

    public final Badge copy(BadgeType badgeType, String str) {
        badgeType.getClass();
        return new Badge(badgeType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.badgeType == badge.badgeType && xj5.a(this.label, badge.label);
    }

    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.badgeType.hashCode() * 31;
        String str = this.label;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Badge(badgeType=");
        sb.append(this.badgeType);
        sb.append(", label=");
        return wu0.a(sb, this.label, ')');
    }
}
