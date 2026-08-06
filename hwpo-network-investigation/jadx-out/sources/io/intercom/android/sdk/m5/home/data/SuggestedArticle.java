package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import defpackage.fk;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SuggestedArticle {
    public static final int $stable = 0;

    @SerializedName("id")
    private final String id;

    @SerializedName("title")
    private final String title;

    @SerializedName("url")
    private final String url;

    public SuggestedArticle(String str, String str2, String str3) {
        fk.b(str, str2, str3);
        this.id = str;
        this.title = str2;
        this.url = str3;
    }

    public static /* synthetic */ SuggestedArticle copy$default(SuggestedArticle suggestedArticle, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestedArticle.id;
        }
        if ((i & 2) != 0) {
            str2 = suggestedArticle.title;
        }
        if ((i & 4) != 0) {
            str3 = suggestedArticle.url;
        }
        return suggestedArticle.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.url;
    }

    public final SuggestedArticle copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new SuggestedArticle(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedArticle)) {
            return false;
        }
        SuggestedArticle suggestedArticle = (SuggestedArticle) obj;
        return xj5.a(this.id, suggestedArticle.id) && xj5.a(this.title, suggestedArticle.title) && xj5.a(this.url, suggestedArticle.url);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + ru3.c(this.id.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SuggestedArticle(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        return wu0.a(sb, this.url, ')');
    }
}
