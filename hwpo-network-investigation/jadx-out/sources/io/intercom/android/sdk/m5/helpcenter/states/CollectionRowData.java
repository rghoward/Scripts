package io.intercom.android.sdk.m5.helpcenter.states;

import defpackage.e44;
import defpackage.fk;
import defpackage.os2;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionRowData {
    public static final int $stable = 0;
    private final int articlesCount;
    private final int collectionsCount;
    private final String descriptionText;
    private final int descriptionVisibility;
    private final String id;
    private final String titleText;

    public CollectionRowData(String str, String str2, int i, String str3, int i2, int i3) {
        fk.b(str, str2, str3);
        this.id = str;
        this.titleText = str2;
        this.descriptionVisibility = i;
        this.descriptionText = str3;
        this.articlesCount = i2;
        this.collectionsCount = i3;
    }

    public static /* synthetic */ CollectionRowData copy$default(CollectionRowData collectionRowData, String str, String str2, int i, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = collectionRowData.id;
        }
        if ((i4 & 2) != 0) {
            str2 = collectionRowData.titleText;
        }
        if ((i4 & 4) != 0) {
            i = collectionRowData.descriptionVisibility;
        }
        if ((i4 & 8) != 0) {
            str3 = collectionRowData.descriptionText;
        }
        if ((i4 & 16) != 0) {
            i2 = collectionRowData.articlesCount;
        }
        if ((i4 & 32) != 0) {
            i3 = collectionRowData.collectionsCount;
        }
        int i5 = i2;
        int i6 = i3;
        return collectionRowData.copy(str, str2, i, str3, i5, i6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.titleText;
    }

    public final int component3() {
        return this.descriptionVisibility;
    }

    public final String component4() {
        return this.descriptionText;
    }

    public final int component5() {
        return this.articlesCount;
    }

    public final int component6() {
        return this.collectionsCount;
    }

    public final CollectionRowData copy(String str, String str2, int i, String str3, int i2, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new CollectionRowData(str, str2, i, str3, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionRowData)) {
            return false;
        }
        CollectionRowData collectionRowData = (CollectionRowData) obj;
        return xj5.a(this.id, collectionRowData.id) && xj5.a(this.titleText, collectionRowData.titleText) && this.descriptionVisibility == collectionRowData.descriptionVisibility && xj5.a(this.descriptionText, collectionRowData.descriptionText) && this.articlesCount == collectionRowData.articlesCount && this.collectionsCount == collectionRowData.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final int getDescriptionVisibility() {
        return this.descriptionVisibility;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return Integer.hashCode(this.collectionsCount) + os2.a(this.articlesCount, ru3.c(os2.a(this.descriptionVisibility, ru3.c(this.id.hashCode() * 31, 31, this.titleText), 31), 31, this.descriptionText), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CollectionRowData(id=");
        sb.append(this.id);
        sb.append(", titleText=");
        sb.append(this.titleText);
        sb.append(", descriptionVisibility=");
        sb.append(this.descriptionVisibility);
        sb.append(", descriptionText=");
        sb.append(this.descriptionText);
        sb.append(", articlesCount=");
        sb.append(this.articlesCount);
        sb.append(", collectionsCount=");
        return e44.a(sb, this.collectionsCount, ')');
    }

    public /* synthetic */ CollectionRowData(String str, String str2, int i, String str3, int i2, int i3, int i4, qq2 qq2Var) {
        this(str, str2, i, str3, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3);
    }
}
