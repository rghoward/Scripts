package io.intercom.android.sdk.helpcenter.articles;

import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleStatsArguments implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ArticleStatsArguments> CREATOR = new Creator();
    private final String articleId;
    private final boolean isFromSearchBrowse;

    public /* synthetic */ ArticleStatsArguments(String str, boolean z, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ ArticleStatsArguments copy$default(ArticleStatsArguments articleStatsArguments, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articleStatsArguments.articleId;
        }
        if ((i & 2) != 0) {
            z = articleStatsArguments.isFromSearchBrowse;
        }
        return articleStatsArguments.copy(str, z);
    }

    public final String component1() {
        return this.articleId;
    }

    public final boolean component2() {
        return this.isFromSearchBrowse;
    }

    public final ArticleStatsArguments copy(String str, boolean z) {
        str.getClass();
        return new ArticleStatsArguments(str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleStatsArguments)) {
            return false;
        }
        ArticleStatsArguments articleStatsArguments = (ArticleStatsArguments) obj;
        return xj5.a(this.articleId, articleStatsArguments.articleId) && this.isFromSearchBrowse == articleStatsArguments.isFromSearchBrowse;
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFromSearchBrowse) + (this.articleId.hashCode() * 31);
    }

    public final boolean isFromSearchBrowse() {
        return this.isFromSearchBrowse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ArticleStatsArguments(articleId=");
        sb.append(this.articleId);
        sb.append(", isFromSearchBrowse=");
        return pi1.a(sb, this.isFromSearchBrowse, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.articleId);
        parcel.writeInt(this.isFromSearchBrowse ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<ArticleStatsArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ArticleStatsArguments(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArticleStatsArguments[] newArray(int i) {
            return new ArticleStatsArguments[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleStatsArguments(String str) {
        this(str, false, 2, null);
        str.getClass();
    }

    public ArticleStatsArguments(String str, boolean z) {
        str.getClass();
        this.articleId = str;
        this.isFromSearchBrowse = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticleStatsArguments() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
