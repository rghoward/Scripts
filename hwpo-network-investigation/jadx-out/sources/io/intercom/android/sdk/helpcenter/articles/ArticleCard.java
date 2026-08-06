package io.intercom.android.sdk.helpcenter.articles;

import defpackage.hl3;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.sd9;
import defpackage.st1;
import defpackage.wu0;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class ArticleCard {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String articleId;
    private final String title;

    public /* synthetic */ ArticleCard(int i, String str, String str2, sd9 sd9Var) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, ArticleCard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.articleId = str;
        this.title = str2;
    }

    public static /* synthetic */ ArticleCard copy$default(ArticleCard articleCard, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articleCard.articleId;
        }
        if ((i & 2) != 0) {
            str2 = articleCard.title;
        }
        return articleCard.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(ArticleCard articleCard, st1 st1Var, SerialDescriptor serialDescriptor) {
        st1Var.p(serialDescriptor, 0, articleCard.articleId);
        st1Var.p(serialDescriptor, 1, articleCard.title);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final ArticleCard copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new ArticleCard(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleCard)) {
            return false;
        }
        ArticleCard articleCard = (ArticleCard) obj;
        return xj5.a(this.articleId, articleCard.articleId) && xj5.a(this.title, articleCard.title);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.articleId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArticleCard(articleId=");
        sb.append(this.articleId);
        sb.append(", title=");
        return wu0.a(sb, this.title, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ArticleCard> serializer() {
            return ArticleCard$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public ArticleCard(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.articleId = str;
        this.title = str2;
    }
}
