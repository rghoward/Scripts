package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PoweredBy {
    public static final int $stable = 0;

    @SerializedName("icon")
    private final PoweredByIconType icon;

    @SerializedName("link_url")
    private final String linkUrl;

    @SerializedName(AttributeType.TEXT)
    private final String text;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum PoweredByIconType {
        INTERCOM,
        FIN;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<PoweredByIconType> getEntries() {
            return $ENTRIES;
        }
    }

    public PoweredBy(PoweredByIconType poweredByIconType, String str, String str2) {
        poweredByIconType.getClass();
        str.getClass();
        str2.getClass();
        this.icon = poweredByIconType;
        this.linkUrl = str;
        this.text = str2;
    }

    public static /* synthetic */ PoweredBy copy$default(PoweredBy poweredBy, PoweredByIconType poweredByIconType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            poweredByIconType = poweredBy.icon;
        }
        if ((i & 2) != 0) {
            str = poweredBy.linkUrl;
        }
        if ((i & 4) != 0) {
            str2 = poweredBy.text;
        }
        return poweredBy.copy(poweredByIconType, str, str2);
    }

    public final PoweredByIconType component1() {
        return this.icon;
    }

    public final String component2() {
        return this.linkUrl;
    }

    public final String component3() {
        return this.text;
    }

    public final PoweredBy copy(PoweredByIconType poweredByIconType, String str, String str2) {
        poweredByIconType.getClass();
        str.getClass();
        str2.getClass();
        return new PoweredBy(poweredByIconType, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoweredBy)) {
            return false;
        }
        PoweredBy poweredBy = (PoweredBy) obj;
        return this.icon == poweredBy.icon && xj5.a(this.linkUrl, poweredBy.linkUrl) && xj5.a(this.text, poweredBy.text);
    }

    public final PoweredByIconType getIcon() {
        return this.icon;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + ru3.c(this.icon.hashCode() * 31, 31, this.linkUrl);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PoweredBy(icon=");
        sb.append(this.icon);
        sb.append(", linkUrl=");
        sb.append(this.linkUrl);
        sb.append(", text=");
        return wu0.a(sb, this.text, ')');
    }
}
