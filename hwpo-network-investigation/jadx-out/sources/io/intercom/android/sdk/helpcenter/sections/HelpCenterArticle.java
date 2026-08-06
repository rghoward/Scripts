package io.intercom.android.sdk.helpcenter.sections;

import com.intercom.twig.BuildConfig;
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
public final class HelpCenterArticle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String articleId;
    private final String title;

    public /* synthetic */ HelpCenterArticle(int i, String str, String str2, sd9 sd9Var) {
        if (1 != (i & 1)) {
            hl3.b(i, 1, HelpCenterArticle$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.articleId = str;
        if ((i & 2) == 0) {
            this.title = BuildConfig.FLAVOR;
        } else {
            this.title = str2;
        }
    }

    public static /* synthetic */ HelpCenterArticle copy$default(HelpCenterArticle helpCenterArticle, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpCenterArticle.articleId;
        }
        if ((i & 2) != 0) {
            str2 = helpCenterArticle.title;
        }
        return helpCenterArticle.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticle helpCenterArticle, st1 st1Var, SerialDescriptor serialDescriptor) {
        st1Var.p(serialDescriptor, 0, helpCenterArticle.articleId);
        if (!st1Var.C(serialDescriptor) && xj5.a(helpCenterArticle.title, BuildConfig.FLAVOR)) {
            return;
        }
        st1Var.p(serialDescriptor, 1, helpCenterArticle.title);
    }

    public final String component1() {
        return this.articleId;
    }

    public final String component2() {
        return this.title;
    }

    public final HelpCenterArticle copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new HelpCenterArticle(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArticle)) {
            return false;
        }
        HelpCenterArticle helpCenterArticle = (HelpCenterArticle) obj;
        return xj5.a(this.articleId, helpCenterArticle.articleId) && xj5.a(this.title, helpCenterArticle.title);
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
        StringBuilder sb = new StringBuilder("HelpCenterArticle(articleId=");
        sb.append(this.articleId);
        sb.append(", title=");
        return wu0.a(sb, this.title, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<HelpCenterArticle> serializer() {
            return HelpCenterArticle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getArticleId$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public HelpCenterArticle(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.articleId = str;
        this.title = str2;
    }

    public /* synthetic */ HelpCenterArticle(String str, String str2, int i, qq2 qq2Var) {
        this(str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
    }
}
