package io.intercom.android.sdk.helpcenter.collections;

import com.intercom.twig.BuildConfig;
import defpackage.e44;
import defpackage.fk;
import defpackage.hl3;
import defpackage.os2;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.sd9;
import defpackage.st1;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class HelpCenterCollection {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int articlesCount;
    private final int collectionsCount;
    private final String id;
    private final String summary;
    private final String title;

    public /* synthetic */ HelpCenterCollection(int i, String str, String str2, String str3, int i2, int i3, sd9 sd9Var) {
        if (2 != (i & 2)) {
            hl3.b(i, 2, HelpCenterCollection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.summary = BuildConfig.FLAVOR;
        } else {
            this.summary = str;
        }
        this.id = str2;
        if ((i & 4) == 0) {
            this.title = BuildConfig.FLAVOR;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.articlesCount = 0;
        } else {
            this.articlesCount = i2;
        }
        if ((i & 16) == 0) {
            this.collectionsCount = 0;
        } else {
            this.collectionsCount = i3;
        }
    }

    public static /* synthetic */ HelpCenterCollection copy$default(HelpCenterCollection helpCenterCollection, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = helpCenterCollection.summary;
        }
        if ((i3 & 2) != 0) {
            str2 = helpCenterCollection.id;
        }
        if ((i3 & 4) != 0) {
            str3 = helpCenterCollection.title;
        }
        if ((i3 & 8) != 0) {
            i = helpCenterCollection.articlesCount;
        }
        if ((i3 & 16) != 0) {
            i2 = helpCenterCollection.collectionsCount;
        }
        int i4 = i2;
        String str4 = str3;
        return helpCenterCollection.copy(str, str2, str4, i, i4);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollection helpCenterCollection, st1 st1Var, SerialDescriptor serialDescriptor) {
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterCollection.summary, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 0, helpCenterCollection.summary);
        }
        st1Var.p(serialDescriptor, 1, helpCenterCollection.id);
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterCollection.title, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 2, helpCenterCollection.title);
        }
        if (st1Var.C(serialDescriptor) || helpCenterCollection.articlesCount != 0) {
            st1Var.g(3, helpCenterCollection.articlesCount, serialDescriptor);
        }
        if (!st1Var.C(serialDescriptor) && helpCenterCollection.collectionsCount == 0) {
            return;
        }
        st1Var.g(4, helpCenterCollection.collectionsCount, serialDescriptor);
    }

    public final String component1() {
        return this.summary;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.articlesCount;
    }

    public final int component5() {
        return this.collectionsCount;
    }

    public final HelpCenterCollection copy(String str, String str2, String str3, int i, int i2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new HelpCenterCollection(str, str2, str3, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterCollection)) {
            return false;
        }
        HelpCenterCollection helpCenterCollection = (HelpCenterCollection) obj;
        return xj5.a(this.summary, helpCenterCollection.summary) && xj5.a(this.id, helpCenterCollection.id) && xj5.a(this.title, helpCenterCollection.title) && this.articlesCount == helpCenterCollection.articlesCount && this.collectionsCount == helpCenterCollection.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.collectionsCount) + os2.a(this.articlesCount, ru3.c(ru3.c(this.summary.hashCode() * 31, 31, this.id), 31, this.title), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterCollection(summary=");
        sb.append(this.summary);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", articlesCount=");
        sb.append(this.articlesCount);
        sb.append(", collectionsCount=");
        return e44.a(sb, this.collectionsCount, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<HelpCenterCollection> serializer() {
            return HelpCenterCollection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    public static /* synthetic */ void getCollectionsCount$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getSummary$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public HelpCenterCollection(String str, String str2, String str3, int i, int i2) {
        fk.b(str, str2, str3);
        this.summary = str;
        this.id = str2;
        this.title = str3;
        this.articlesCount = i;
        this.collectionsCount = i2;
    }

    public /* synthetic */ HelpCenterCollection(String str, String str2, String str3, int i, int i2, int i3, qq2 qq2Var) {
        this((i3 & 1) != 0 ? BuildConfig.FLAVOR : str, str2, (i3 & 4) != 0 ? BuildConfig.FLAVOR : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
