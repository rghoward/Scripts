package io.intercom.android.sdk.helpcenter.articles;

import defpackage.hl3;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.sd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class ArticleResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Article article;

    public /* synthetic */ ArticleResponse(int i, Article article, sd9 sd9Var) {
        if (1 == (i & 1)) {
            this.article = article;
        } else {
            hl3.b(i, 1, ArticleResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ArticleResponse copy$default(ArticleResponse articleResponse, Article article, int i, Object obj) {
        if ((i & 1) != 0) {
            article = articleResponse.article;
        }
        return articleResponse.copy(article);
    }

    public final Article component1() {
        return this.article;
    }

    public final ArticleResponse copy(Article article) {
        article.getClass();
        return new ArticleResponse(article);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArticleResponse) && xj5.a(this.article, ((ArticleResponse) obj).article);
    }

    public final Article getArticle() {
        return this.article;
    }

    public int hashCode() {
        return this.article.hashCode();
    }

    public String toString() {
        return "ArticleResponse(article=" + this.article + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ArticleResponse> serializer() {
            return ArticleResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getArticle$annotations() {
    }

    public ArticleResponse(Article article) {
        article.getClass();
        this.article = article;
    }
}
