package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PrivacyNotice {
    public static final int $stable = 0;

    @SerializedName("is_dismissed")
    private final boolean isDismissed;

    @SerializedName("paragraph")
    private final String text;

    public PrivacyNotice(boolean z, String str) {
        str.getClass();
        this.isDismissed = z;
        this.text = str;
    }

    public static /* synthetic */ PrivacyNotice copy$default(PrivacyNotice privacyNotice, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = privacyNotice.isDismissed;
        }
        if ((i & 2) != 0) {
            str = privacyNotice.text;
        }
        return privacyNotice.copy(z, str);
    }

    public final boolean component1() {
        return this.isDismissed;
    }

    public final String component2() {
        return this.text;
    }

    public final PrivacyNotice copy(boolean z, String str) {
        str.getClass();
        return new PrivacyNotice(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyNotice)) {
            return false;
        }
        PrivacyNotice privacyNotice = (PrivacyNotice) obj;
        return this.isDismissed == privacyNotice.isDismissed && xj5.a(this.text, privacyNotice.text);
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (Boolean.hashCode(this.isDismissed) * 31);
    }

    public final boolean isDismissed() {
        return this.isDismissed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrivacyNotice(isDismissed=");
        sb.append(this.isDismissed);
        sb.append(", text=");
        return wu0.a(sb, this.text, ')');
    }
}
