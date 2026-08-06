package io.intercom.android.sdk.helpcenter.sections;

import com.intercom.twig.BuildConfig;
import defpackage.gy2;
import defpackage.hf3;
import defpackage.hl3;
import defpackage.ho2;
import defpackage.m30;
import defpackage.os2;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.sd9;
import defpackage.st1;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$$serializer;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class HelpCenterCollectionContent {
    private final int articlesCount;
    private final List<Author> authors;
    private final String collectionId;
    private final List<HelpCenterArticle> helpCenterArticles;
    private final List<HelpCenterSection> helpCenterSections;
    private final List<HelpCenterCollection> subCollections;
    private final String summary;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new m30(HelpCenterArticle$$serializer.INSTANCE), new m30(HelpCenterSection$$serializer.INSTANCE), new m30(HelpCenterCollection$$serializer.INSTANCE), null, new m30(Author$$serializer.INSTANCE)};

    public /* synthetic */ HelpCenterCollectionContent(int i, String str, String str2, String str3, List list, List list2, List list3, int i2, List list4, sd9 sd9Var) {
        if (65 != (i & 65)) {
            hl3.b(i, 65, HelpCenterCollectionContent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.collectionId = str;
        if ((i & 2) == 0) {
            this.title = BuildConfig.FLAVOR;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.summary = BuildConfig.FLAVOR;
        } else {
            this.summary = str3;
        }
        int i3 = i & 8;
        hf3 hf3Var = hf3.t;
        if (i3 == 0) {
            this.helpCenterArticles = hf3Var;
        } else {
            this.helpCenterArticles = list;
        }
        if ((i & 16) == 0) {
            this.helpCenterSections = hf3Var;
        } else {
            this.helpCenterSections = list2;
        }
        if ((i & 32) == 0) {
            this.subCollections = hf3Var;
        } else {
            this.subCollections = list3;
        }
        this.articlesCount = i2;
        if ((i & 128) == 0) {
            this.authors = hf3Var;
        } else {
            this.authors = list4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpCenterCollectionContent copy$default(HelpCenterCollectionContent helpCenterCollectionContent, String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = helpCenterCollectionContent.collectionId;
        }
        if ((i2 & 2) != 0) {
            str2 = helpCenterCollectionContent.title;
        }
        if ((i2 & 4) != 0) {
            str3 = helpCenterCollectionContent.summary;
        }
        if ((i2 & 8) != 0) {
            list = helpCenterCollectionContent.helpCenterArticles;
        }
        if ((i2 & 16) != 0) {
            list2 = helpCenterCollectionContent.helpCenterSections;
        }
        if ((i2 & 32) != 0) {
            list3 = helpCenterCollectionContent.subCollections;
        }
        if ((i2 & 64) != 0) {
            i = helpCenterCollectionContent.articlesCount;
        }
        if ((i2 & 128) != 0) {
            list4 = helpCenterCollectionContent.authors;
        }
        int i3 = i;
        List list5 = list4;
        List list6 = list2;
        List list7 = list3;
        return helpCenterCollectionContent.copy(str, str2, str3, list, list6, list7, i3, list5);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollectionContent helpCenterCollectionContent, st1 st1Var, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        st1Var.p(serialDescriptor, 0, helpCenterCollectionContent.collectionId);
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterCollectionContent.title, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 1, helpCenterCollectionContent.title);
        }
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterCollectionContent.summary, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 2, helpCenterCollectionContent.summary);
        }
        boolean zC = st1Var.C(serialDescriptor);
        hf3 hf3Var = hf3.t;
        if (zC || !xj5.a(helpCenterCollectionContent.helpCenterArticles, hf3Var)) {
            st1Var.q(serialDescriptor, 3, kSerializerArr[3], helpCenterCollectionContent.helpCenterArticles);
        }
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterCollectionContent.helpCenterSections, hf3Var)) {
            st1Var.q(serialDescriptor, 4, kSerializerArr[4], helpCenterCollectionContent.helpCenterSections);
        }
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterCollectionContent.subCollections, hf3Var)) {
            st1Var.q(serialDescriptor, 5, kSerializerArr[5], helpCenterCollectionContent.subCollections);
        }
        st1Var.g(6, helpCenterCollectionContent.articlesCount, serialDescriptor);
        if (!st1Var.C(serialDescriptor) && xj5.a(helpCenterCollectionContent.authors, hf3Var)) {
            return;
        }
        st1Var.q(serialDescriptor, 7, kSerializerArr[7], helpCenterCollectionContent.authors);
    }

    public final String component1() {
        return this.collectionId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    public final int component7() {
        return this.articlesCount;
    }

    public final List<Author> component8() {
        return this.authors;
    }

    public final HelpCenterCollectionContent copy(String str, String str2, String str3, List<HelpCenterArticle> list, List<HelpCenterSection> list2, List<HelpCenterCollection> list3, int i, List<Author> list4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new HelpCenterCollectionContent(str, str2, str3, list, list2, list3, i, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterCollectionContent)) {
            return false;
        }
        HelpCenterCollectionContent helpCenterCollectionContent = (HelpCenterCollectionContent) obj;
        return xj5.a(this.collectionId, helpCenterCollectionContent.collectionId) && xj5.a(this.title, helpCenterCollectionContent.title) && xj5.a(this.summary, helpCenterCollectionContent.summary) && xj5.a(this.helpCenterArticles, helpCenterCollectionContent.helpCenterArticles) && xj5.a(this.helpCenterSections, helpCenterCollectionContent.helpCenterSections) && xj5.a(this.subCollections, helpCenterCollectionContent.subCollections) && this.articlesCount == helpCenterCollectionContent.articlesCount && xj5.a(this.authors, helpCenterCollectionContent.authors);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final List<Author> getAuthors() {
        return this.authors;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.authors.hashCode() + os2.a(this.articlesCount, ho2.a(ho2.a(ho2.a(ru3.c(ru3.c(this.collectionId.hashCode() * 31, 31, this.title), 31, this.summary), 31, this.helpCenterArticles), 31, this.helpCenterSections), 31, this.subCollections), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterCollectionContent(collectionId=");
        sb.append(this.collectionId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", helpCenterArticles=");
        sb.append(this.helpCenterArticles);
        sb.append(", helpCenterSections=");
        sb.append(this.helpCenterSections);
        sb.append(", subCollections=");
        sb.append(this.subCollections);
        sb.append(", articlesCount=");
        sb.append(this.articlesCount);
        sb.append(", authors=");
        return zc6.a(sb, this.authors, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<HelpCenterCollectionContent> serializer() {
            return HelpCenterCollectionContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    public static /* synthetic */ void getAuthors$annotations() {
    }

    public static /* synthetic */ void getCollectionId$annotations() {
    }

    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @gy2
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    public static /* synthetic */ void getSubCollections$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public HelpCenterCollectionContent(String str, String str2, String str3, List<HelpCenterArticle> list, List<HelpCenterSection> list2, List<HelpCenterCollection> list3, int i, List<Author> list4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.collectionId = str;
        this.title = str2;
        this.summary = str3;
        this.helpCenterArticles = list;
        this.helpCenterSections = list2;
        this.subCollections = list3;
        this.articlesCount = i;
        this.authors = list4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HelpCenterCollectionContent(String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, qq2 qq2Var) {
        str2 = (i2 & 2) != 0 ? BuildConfig.FLAVOR : str2;
        str3 = (i2 & 4) != 0 ? BuildConfig.FLAVOR : str3;
        int i3 = i2 & 8;
        hf3 hf3Var = hf3.t;
        this(str, str2, str3, i3 != 0 ? hf3Var : list, (i2 & 16) != 0 ? hf3Var : list2, (i2 & 32) != 0 ? hf3Var : list3, i, (i2 & 128) != 0 ? hf3Var : list4);
    }
}
