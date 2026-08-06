package io.intercom.android.sdk.models;

import defpackage.fk;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InlineSource {
    public static final int $stable = 0;
    private final String dataEntityId;
    private final String dataEntityType;
    private final String dataSourceIndex;
    private final String href;
    private final String title;

    public InlineSource(String str, String str2, String str3, String str4, String str5) {
        fk.b(str, str3, str4);
        this.dataEntityId = str;
        this.dataEntityType = str2;
        this.dataSourceIndex = str3;
        this.href = str4;
        this.title = str5;
    }

    public static /* synthetic */ InlineSource copy$default(InlineSource inlineSource, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inlineSource.dataEntityId;
        }
        if ((i & 2) != 0) {
            str2 = inlineSource.dataEntityType;
        }
        if ((i & 4) != 0) {
            str3 = inlineSource.dataSourceIndex;
        }
        if ((i & 8) != 0) {
            str4 = inlineSource.href;
        }
        if ((i & 16) != 0) {
            str5 = inlineSource.title;
        }
        String str6 = str5;
        String str7 = str3;
        return inlineSource.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.dataEntityId;
    }

    public final String component2() {
        return this.dataEntityType;
    }

    public final String component3() {
        return this.dataSourceIndex;
    }

    public final String component4() {
        return this.href;
    }

    public final String component5() {
        return this.title;
    }

    public final InlineSource copy(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        return new InlineSource(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineSource)) {
            return false;
        }
        InlineSource inlineSource = (InlineSource) obj;
        return xj5.a(this.dataEntityId, inlineSource.dataEntityId) && xj5.a(this.dataEntityType, inlineSource.dataEntityType) && xj5.a(this.dataSourceIndex, inlineSource.dataSourceIndex) && xj5.a(this.href, inlineSource.href) && xj5.a(this.title, inlineSource.title);
    }

    public final String getDataEntityId() {
        return this.dataEntityId;
    }

    public final String getDataEntityType() {
        return this.dataEntityType;
    }

    public final String getDataSourceIndex() {
        return this.dataSourceIndex;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.dataEntityId.hashCode() * 31;
        String str = this.dataEntityType;
        int iC = ru3.c(ru3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.dataSourceIndex), 31, this.href);
        String str2 = this.title;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InlineSource(dataEntityId=");
        sb.append(this.dataEntityId);
        sb.append(", dataEntityType=");
        sb.append(this.dataEntityType);
        sb.append(", dataSourceIndex=");
        sb.append(this.dataSourceIndex);
        sb.append(", href=");
        sb.append(this.href);
        sb.append(", title=");
        return wu0.a(sb, this.title, ')');
    }
}
