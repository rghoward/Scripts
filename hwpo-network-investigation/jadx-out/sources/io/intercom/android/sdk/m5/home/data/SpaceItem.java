package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpaceItem {
    public static final int $stable = 0;

    @SerializedName(MetricTracker.Object.BADGE)
    private final Badge badge;

    @SerializedName("label")
    private final String label;

    @SerializedName("type")
    private final SpaceItemType type;

    public SpaceItem(Badge badge, String str, SpaceItemType spaceItemType) {
        str.getClass();
        spaceItemType.getClass();
        this.badge = badge;
        this.label = str;
        this.type = spaceItemType;
    }

    public static /* synthetic */ SpaceItem copy$default(SpaceItem spaceItem, Badge badge, String str, SpaceItemType spaceItemType, int i, Object obj) {
        if ((i & 1) != 0) {
            badge = spaceItem.badge;
        }
        if ((i & 2) != 0) {
            str = spaceItem.label;
        }
        if ((i & 4) != 0) {
            spaceItemType = spaceItem.type;
        }
        return spaceItem.copy(badge, str, spaceItemType);
    }

    public final Badge component1() {
        return this.badge;
    }

    public final String component2() {
        return this.label;
    }

    public final SpaceItemType component3() {
        return this.type;
    }

    public final SpaceItem copy(Badge badge, String str, SpaceItemType spaceItemType) {
        str.getClass();
        spaceItemType.getClass();
        return new SpaceItem(badge, str, spaceItemType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpaceItem)) {
            return false;
        }
        SpaceItem spaceItem = (SpaceItem) obj;
        return xj5.a(this.badge, spaceItem.badge) && xj5.a(this.label, spaceItem.label) && this.type == spaceItem.type;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final String getLabel() {
        return this.label;
    }

    public final SpaceItemType getType() {
        return this.type;
    }

    public int hashCode() {
        Badge badge = this.badge;
        return this.type.hashCode() + ru3.c((badge == null ? 0 : badge.hashCode()) * 31, 31, this.label);
    }

    public String toString() {
        return "SpaceItem(badge=" + this.badge + ", label=" + this.label + ", type=" + this.type + ')';
    }
}
