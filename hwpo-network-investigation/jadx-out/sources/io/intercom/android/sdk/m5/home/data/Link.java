package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Link {
    public static final int $stable = 0;

    @SerializedName("label")
    private final String label;

    @SerializedName("href")
    private final String url;

    public Link(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.url = str2;
    }

    public static /* synthetic */ Link copy$default(Link link, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = link.label;
        }
        if ((i & 2) != 0) {
            str2 = link.url;
        }
        return link.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.url;
    }

    public final Link copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new Link(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return xj5.a(this.label, link.label) && xj5.a(this.url, link.url);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.label.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Link(label=");
        sb.append(this.label);
        sb.append(", url=");
        return wu0.a(sb, this.url, ')');
    }
}
