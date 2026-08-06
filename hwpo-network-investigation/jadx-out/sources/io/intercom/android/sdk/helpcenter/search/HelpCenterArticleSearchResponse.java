package io.intercom.android.sdk.helpcenter.search;

import com.intercom.twig.BuildConfig;
import defpackage.hl3;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.sd9;
import defpackage.st1;
import defpackage.wu0;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class HelpCenterArticleSearchResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String articleId;
    private final Highlight highlight;
    private final String summary;
    private final String title;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(int i, String str, String str2, String str3, String str4, Highlight highlight, sd9 sd9Var) {
        String str5 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (1 != (i & 1)) {
            hl3.b(i, 1, HelpCenterArticleSearchResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.articleId = str;
        if ((i & 2) == 0) {
            this.summary = BuildConfig.FLAVOR;
        } else {
            this.summary = str2;
        }
        if ((i & 4) == 0) {
            this.title = BuildConfig.FLAVOR;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.url = BuildConfig.FLAVOR;
        } else {
            this.url = str4;
        }
        if ((i & 16) != 0) {
            this.highlight = highlight;
        } else {
            this.highlight = new Highlight(str5, (String) (objArr2 == true ? 1 : 0), 3, (qq2) (objArr == true ? 1 : 0));
        }
    }

    public static /* synthetic */ HelpCenterArticleSearchResponse copy$default(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, String str, String str2, String str3, String str4, Highlight highlight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpCenterArticleSearchResponse.articleId;
        }
        if ((i & 2) != 0) {
            str2 = helpCenterArticleSearchResponse.summary;
        }
        if ((i & 4) != 0) {
            str3 = helpCenterArticleSearchResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = helpCenterArticleSearchResponse.url;
        }
        if ((i & 16) != 0) {
            highlight = helpCenterArticleSearchResponse.highlight;
        }
        Highlight highlight2 = highlight;
        String str5 = str3;
        return helpCenterArticleSearchResponse.copy(str, str2, str5, str4, highlight2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, st1 st1Var, SerialDescriptor serialDescriptor) {
        st1Var.p(serialDescriptor, 0, helpCenterArticleSearchResponse.articleId);
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterArticleSearchResponse.summary, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 1, helpCenterArticleSearchResponse.summary);
        }
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterArticleSearchResponse.title, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 2, helpCenterArticleSearchResponse.title);
        }
        int i = 3;
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterArticleSearchResponse.url, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 3, helpCenterArticleSearchResponse.url);
        }
        if (!st1Var.C(serialDescriptor) && xj5.a(helpCenterArticleSearchResponse.highlight, new Highlight((String) null, (String) (0 == true ? 1 : 0), i, (qq2) (0 == true ? 1 : 0)))) {
            return;
        }
        st1Var.q(serialDescriptor, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, helpCenterArticleSearchResponse.highlight);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.url;
    }

    public final Highlight component5() {
        return this.highlight;
    }

    public final HelpCenterArticleSearchResponse copy(String str, String str2, String str3, String str4, Highlight highlight) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        highlight.getClass();
        return new HelpCenterArticleSearchResponse(str, str2, str3, str4, highlight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticleSearchResponse)) {
            return false;
        }
        HelpCenterArticleSearchResponse helpCenterArticleSearchResponse = (HelpCenterArticleSearchResponse) obj;
        return xj5.a(this.articleId, helpCenterArticleSearchResponse.articleId) && xj5.a(this.summary, helpCenterArticleSearchResponse.summary) && xj5.a(this.title, helpCenterArticleSearchResponse.title) && xj5.a(this.url, helpCenterArticleSearchResponse.url) && xj5.a(this.highlight, helpCenterArticleSearchResponse.highlight);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final Highlight getHighlight() {
        return this.highlight;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.highlight.hashCode() + ru3.c(ru3.c(ru3.c(this.articleId.hashCode() * 31, 31, this.summary), 31, this.title), 31, this.url);
    }

    public String toString() {
        return "HelpCenterArticleSearchResponse(articleId=" + this.articleId + ", summary=" + this.summary + ", title=" + this.title + ", url=" + this.url + ", highlight=" + this.highlight + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @rd9
    public static final class Highlight {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String summary;
        private final String title;

        public /* synthetic */ Highlight(int i, String str, String str2, sd9 sd9Var) {
            if ((i & 1) == 0) {
                this.title = BuildConfig.FLAVOR;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.summary = BuildConfig.FLAVOR;
            } else {
                this.summary = str2;
            }
        }

        public static /* synthetic */ Highlight copy$default(Highlight highlight, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = highlight.title;
            }
            if ((i & 2) != 0) {
                str2 = highlight.summary;
            }
            return highlight.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Highlight highlight, st1 st1Var, SerialDescriptor serialDescriptor) {
            if (st1Var.C(serialDescriptor) || !xj5.a(highlight.title, BuildConfig.FLAVOR)) {
                st1Var.p(serialDescriptor, 0, highlight.title);
            }
            if (!st1Var.C(serialDescriptor) && xj5.a(highlight.summary, BuildConfig.FLAVOR)) {
                return;
            }
            st1Var.p(serialDescriptor, 1, highlight.summary);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.summary;
        }

        public final Highlight copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new Highlight(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Highlight)) {
                return false;
            }
            Highlight highlight = (Highlight) obj;
            return xj5.a(this.title, highlight.title) && xj5.a(this.summary, highlight.summary);
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.summary.hashCode() + (this.title.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Highlight(title=");
            sb.append(this.title);
            sb.append(", summary=");
            return wu0.a(sb, this.summary, ')');
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Highlight> serializer() {
                return HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(qq2 qq2Var) {
                this();
            }
        }

        public static /* synthetic */ void getSummary$annotations() {
        }

        public static /* synthetic */ void getTitle$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Highlight() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (qq2) (0 == true ? 1 : 0));
        }

        public Highlight(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.summary = str2;
        }

        public /* synthetic */ Highlight(String str, String str2, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<HelpCenterArticleSearchResponse> serializer() {
            return HelpCenterArticleSearchResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getHighlight$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public HelpCenterArticleSearchResponse(String str, String str2, String str3, String str4, Highlight highlight) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        highlight.getClass();
        this.articleId = str;
        this.summary = str2;
        this.title = str3;
        this.url = str4;
        this.highlight = highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(String str, String str2, String str3, String str4, Highlight highlight, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? BuildConfig.FLAVOR : str4, (i & 16) != 0 ? new Highlight((String) null, (String) (0 == true ? 1 : 0), 3, (qq2) (0 == true ? 1 : 0)) : highlight);
    }
}
