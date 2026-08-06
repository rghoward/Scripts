package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Action {
    public static final int $stable = 0;

    @SerializedName("icon")
    private final IconType icon;

    @SerializedName("label")
    private final String label;

    @SerializedName("subtitle")
    private final String subtitle;

    public Action(String str, IconType iconType, String str2) {
        str.getClass();
        this.label = str;
        this.icon = iconType;
        this.subtitle = str2;
    }

    public static /* synthetic */ Action copy$default(Action action, String str, IconType iconType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = action.label;
        }
        if ((i & 2) != 0) {
            iconType = action.icon;
        }
        if ((i & 4) != 0) {
            str2 = action.subtitle;
        }
        return action.copy(str, iconType, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final IconType component2() {
        return this.icon;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final Action copy(String str, IconType iconType, String str2) {
        str.getClass();
        return new Action(str, iconType, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return xj5.a(this.label, action.label) && this.icon == action.icon && xj5.a(this.subtitle, action.subtitle);
    }

    public final IconType getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        IconType iconType = this.icon;
        int iHashCode2 = (iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31;
        String str = this.subtitle;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Action(label=");
        sb.append(this.label);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", subtitle=");
        return wu0.a(sb, this.subtitle, ')');
    }
}
