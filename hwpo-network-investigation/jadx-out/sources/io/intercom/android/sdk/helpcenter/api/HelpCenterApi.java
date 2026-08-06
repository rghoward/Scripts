package io.intercom.android.sdk.helpcenter.api;

import defpackage.eu7;
import defpackage.g2b;
import defpackage.gg8;
import defpackage.pr0;
import defpackage.r02;
import defpackage.ru3;
import defpackage.wn7;
import io.intercom.android.sdk.helpcenter.articles.ArticleResponse;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface HelpCenterApi {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchArticle$default(HelpCenterApi helpCenterApi, String str, Map map, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: fetchArticle");
                return null;
            }
            if ((i & 2) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchArticle(str, map, r02Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollectionDetails$default(HelpCenterApi helpCenterApi, String str, Map map, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: fetchCollectionDetails");
                return null;
            }
            if ((i & 2) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchCollectionDetails(str, map, r02Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchCollections$default(HelpCenterApi helpCenterApi, Map map, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: fetchCollections");
                return null;
            }
            if ((i & 1) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.fetchCollections(map, r02Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object reactToArticle$default(HelpCenterApi helpCenterApi, String str, int i, String str2, boolean z, String str3, Map map, r02 r02Var, int i2, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: reactToArticle");
                return null;
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                str3 = null;
            }
            String str4 = str3;
            if ((i2 & 32) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.reactToArticle(str, i, str2, z2, str4, map, r02Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchForArticles$default(HelpCenterApi helpCenterApi, String str, String str2, Map map, r02 r02Var, int i, Object obj) {
            if (obj != null) {
                ru3.f("Super calls with default arguments not supported in this target, function: searchForArticles");
                return null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                map = HelpCenterApiHelper.INSTANCE.addDefaultOptions();
            }
            return helpCenterApi.searchForArticles(str, str2, map, r02Var);
        }
    }

    @wn7("articles/{articleId}")
    Object fetchArticle(@eu7("articleId") String str, @pr0 Map<String, String> map, r02<? super NetworkResponse<ArticleResponse>> r02Var);

    @wn7("help_center/collections/{id}")
    Object fetchCollectionDetails(@eu7("id") String str, @pr0 Map<String, String> map, r02<? super NetworkResponse<HelpCenterCollectionContent>> r02Var);

    @wn7("help_center/collections")
    Object fetchCollections(@pr0 Map<String, String> map, r02<? super NetworkResponse<? extends List<HelpCenterCollection>>> r02Var);

    @wn7("articles/{articleId}/react")
    Object reactToArticle(@eu7("articleId") String str, @gg8("reaction_index") int i, @gg8("article_content_id") String str2, @gg8("allow_auto_responses") boolean z, @gg8(ConstantsKt.KEY_ARTICLE_SOURCE) String str3, @pr0 Map<String, String> map, r02<? super NetworkResponse<g2b>> r02Var);

    @wn7("help_center/search")
    Object searchForArticles(@gg8("phrase") String str, @gg8(ConstantsKt.KEY_ARTICLE_SOURCE) String str2, @pr0 Map<String, String> map, r02<? super NetworkResponse<? extends List<HelpCenterArticleSearchResponse>>> r02Var);
}
