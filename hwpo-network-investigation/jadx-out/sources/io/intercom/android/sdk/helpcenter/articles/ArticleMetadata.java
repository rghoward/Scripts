package io.intercom.android.sdk.helpcenter.articles;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleMetadata {
    public static final int $stable = 0;
    private final String id;
    private final String title;

    public ArticleMetadata(String str, String str2) {
        str.getClass();
        this.id = str;
        this.title = str2;
    }

    public static /* synthetic */ ArticleMetadata copy$default(ArticleMetadata articleMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articleMetadata.id;
        }
        if ((i & 2) != 0) {
            str2 = articleMetadata.title;
        }
        return articleMetadata.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final ArticleMetadata copy(String str, String str2) {
        str.getClass();
        return new ArticleMetadata(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleMetadata)) {
            return false;
        }
        ArticleMetadata articleMetadata = (ArticleMetadata) obj;
        return xj5.a(this.id, articleMetadata.id) && xj5.a(this.title, articleMetadata.title);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArticleMetadata(id=");
        sb.append(this.id);
        sb.append(", title=");
        return wu0.a(sb, this.title, ')');
    }

    public /* synthetic */ ArticleMetadata(String str, String str2, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
