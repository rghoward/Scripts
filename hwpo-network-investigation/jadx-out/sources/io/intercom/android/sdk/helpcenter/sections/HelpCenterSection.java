package io.intercom.android.sdk.helpcenter.sections;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.m30;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.sd9;
import defpackage.st1;
import defpackage.wu0;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class HelpCenterSection {
    private final List<HelpCenterArticle> helpCenterArticles;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new m30(HelpCenterArticle$$serializer.INSTANCE), null};

    public /* synthetic */ HelpCenterSection(int i, List list, String str, sd9 sd9Var) {
        this.helpCenterArticles = (i & 1) == 0 ? hf3.t : list;
        if ((i & 2) == 0) {
            this.title = BuildConfig.FLAVOR;
        } else {
            this.title = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpCenterSection copy$default(HelpCenterSection helpCenterSection, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = helpCenterSection.helpCenterArticles;
        }
        if ((i & 2) != 0) {
            str = helpCenterSection.title;
        }
        return helpCenterSection.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterSection helpCenterSection, st1 st1Var, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (st1Var.C(serialDescriptor) || !xj5.a(helpCenterSection.helpCenterArticles, hf3.t)) {
            st1Var.q(serialDescriptor, 0, kSerializerArr[0], helpCenterSection.helpCenterArticles);
        }
        if (!st1Var.C(serialDescriptor) && xj5.a(helpCenterSection.title, BuildConfig.FLAVOR)) {
            return;
        }
        st1Var.p(serialDescriptor, 1, helpCenterSection.title);
    }

    public final List<HelpCenterArticle> component1() {
        return this.helpCenterArticles;
    }

    public final String component2() {
        return this.title;
    }

    public final HelpCenterSection copy(List<HelpCenterArticle> list, String str) {
        list.getClass();
        str.getClass();
        return new HelpCenterSection(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterSection)) {
            return false;
        }
        HelpCenterSection helpCenterSection = (HelpCenterSection) obj;
        return xj5.a(this.helpCenterArticles, helpCenterSection.helpCenterArticles) && xj5.a(this.title, helpCenterSection.title);
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.helpCenterArticles.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterSection(helpCenterArticles=");
        sb.append(this.helpCenterArticles);
        sb.append(", title=");
        return wu0.a(sb, this.title, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<HelpCenterSection> serializer() {
            return HelpCenterSection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HelpCenterSection() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (qq2) (0 == true ? 1 : 0));
    }

    public HelpCenterSection(List<HelpCenterArticle> list, String str) {
        list.getClass();
        str.getClass();
        this.helpCenterArticles = list;
        this.title = str;
    }

    public /* synthetic */ HelpCenterSection(List list, String str, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? hf3.t : list, (i & 2) != 0 ? BuildConfig.FLAVOR : str);
    }
}
