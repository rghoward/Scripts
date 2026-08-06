package io.intercom.android.sdk.helpcenter.articles;

import defpackage.hl3;
import defpackage.o2a;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.sd9;
import defpackage.st1;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class Article {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final ArticleCard card;
    private final String relatedConversationId;

    public /* synthetic */ Article(int i, String str, ArticleCard articleCard, sd9 sd9Var) {
        if (2 != (i & 2)) {
            hl3.b(i, 2, Article$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.relatedConversationId = null;
        } else {
            this.relatedConversationId = str;
        }
        this.card = articleCard;
    }

    public static /* synthetic */ Article copy$default(Article article, String str, ArticleCard articleCard, int i, Object obj) {
        if ((i & 1) != 0) {
            str = article.relatedConversationId;
        }
        if ((i & 2) != 0) {
            articleCard = article.card;
        }
        return article.copy(str, articleCard);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Article article, st1 st1Var, SerialDescriptor serialDescriptor) {
        if (st1Var.C(serialDescriptor) || article.relatedConversationId != null) {
            st1Var.z(serialDescriptor, 0, o2a.a, article.relatedConversationId);
        }
        st1Var.q(serialDescriptor, 1, ArticleCard$$serializer.INSTANCE, article.card);
    }

    public final String component1() {
        return this.relatedConversationId;
    }

    public final ArticleCard component2() {
        return this.card;
    }

    public final Article copy(String str, ArticleCard articleCard) {
        articleCard.getClass();
        return new Article(str, articleCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return xj5.a(this.relatedConversationId, article.relatedConversationId) && xj5.a(this.card, article.card);
    }

    public final ArticleCard getCard() {
        return this.card;
    }

    public final String getRelatedConversationId() {
        return this.relatedConversationId;
    }

    public int hashCode() {
        String str = this.relatedConversationId;
        return this.card.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "Article(relatedConversationId=" + this.relatedConversationId + ", card=" + this.card + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<Article> serializer() {
            return Article$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getCard$annotations() {
    }

    public static /* synthetic */ void getRelatedConversationId$annotations() {
    }

    public Article(String str, ArticleCard articleCard) {
        articleCard.getClass();
        this.relatedConversationId = str;
        this.card = articleCard;
    }

    public /* synthetic */ Article(String str, ArticleCard articleCard, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str, articleCard);
    }
}
