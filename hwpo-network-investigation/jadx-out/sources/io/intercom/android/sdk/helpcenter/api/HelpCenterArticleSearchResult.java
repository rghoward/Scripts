package io.intercom.android.sdk.helpcenter.api;

import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterArticleSearchResult {
    public static final int $stable = 0;
    private final String articleId;
    private final String matchingSnippet;
    private final String summary;
    private final String title;

    public HelpCenterArticleSearchResult(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.articleId = str;
        this.title = str2;
        this.summary = str3;
        this.matchingSnippet = str4;
    }

    public static /* synthetic */ HelpCenterArticleSearchResult copy$default(HelpCenterArticleSearchResult helpCenterArticleSearchResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpCenterArticleSearchResult.articleId;
        }
        if ((i & 2) != 0) {
            str2 = helpCenterArticleSearchResult.title;
        }
        if ((i & 4) != 0) {
            str3 = helpCenterArticleSearchResult.summary;
        }
        if ((i & 8) != 0) {
            str4 = helpCenterArticleSearchResult.matchingSnippet;
        }
        return helpCenterArticleSearchResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.matchingSnippet;
    }

    public final HelpCenterArticleSearchResult copy(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new HelpCenterArticleSearchResult(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResult)) {
            return false;
        }
        HelpCenterArticleSearchResult helpCenterArticleSearchResult = (HelpCenterArticleSearchResult) obj;
        return xj5.a(this.articleId, helpCenterArticleSearchResult.articleId) && xj5.a(this.title, helpCenterArticleSearchResult.title) && xj5.a(this.summary, helpCenterArticleSearchResult.summary) && xj5.a(this.matchingSnippet, helpCenterArticleSearchResult.matchingSnippet);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.matchingSnippet.hashCode() + ru3.c(ru3.c(this.articleId.hashCode() * 31, 31, this.title), 31, this.summary);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterArticleSearchResult(articleId=");
        sb.append(this.articleId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", matchingSnippet=");
        return wu0.a(sb, this.matchingSnippet, ')');
    }

    public /* synthetic */ HelpCenterArticleSearchResult(String str, String str2, String str3, String str4, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? BuildConfig.FLAVOR : str4);
    }
}
