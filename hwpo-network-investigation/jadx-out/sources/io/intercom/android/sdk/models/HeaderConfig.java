package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderConfig {
    public static final int $stable = 8;

    @SerializedName("background")
    private final HeaderBackgroundModel background;

    @SerializedName("content")
    private final HeaderContentModel content;

    @SerializedName("header_expanded")
    private final boolean headerExpanded;

    public /* synthetic */ HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? new HeaderBackgroundModel(null, null, null, null, null, null, false, null, null, null, false, 2047, null) : headerBackgroundModel, (i & 2) != 0 ? new HeaderContentModel(null, null, false, null, null, null, null, null, 255, null) : headerContentModel, (i & 4) != 0 ? true : z);
    }

    public static /* synthetic */ HeaderConfig copy$default(HeaderConfig headerConfig, HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            headerBackgroundModel = headerConfig.background;
        }
        if ((i & 2) != 0) {
            headerContentModel = headerConfig.content;
        }
        if ((i & 4) != 0) {
            z = headerConfig.headerExpanded;
        }
        return headerConfig.copy(headerBackgroundModel, headerContentModel, z);
    }

    public final HeaderBackgroundModel component1() {
        return this.background;
    }

    public final HeaderContentModel component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.headerExpanded;
    }

    public final HeaderConfig copy(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z) {
        headerBackgroundModel.getClass();
        headerContentModel.getClass();
        return new HeaderConfig(headerBackgroundModel, headerContentModel, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderConfig)) {
            return false;
        }
        HeaderConfig headerConfig = (HeaderConfig) obj;
        return xj5.a(this.background, headerConfig.background) && xj5.a(this.content, headerConfig.content) && this.headerExpanded == headerConfig.headerExpanded;
    }

    public final HeaderBackgroundModel getBackground() {
        return this.background;
    }

    public final HeaderContentModel getContent() {
        return this.content;
    }

    public final boolean getHeaderExpanded() {
        return this.headerExpanded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.headerExpanded) + ((this.content.hashCode() + (this.background.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderConfig(background=");
        sb.append(this.background);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", headerExpanded=");
        return pi1.a(sb, this.headerExpanded, ')');
    }

    public HeaderConfig(HeaderBackgroundModel headerBackgroundModel, HeaderContentModel headerContentModel, boolean z) {
        headerBackgroundModel.getClass();
        headerContentModel.getClass();
        this.background = headerBackgroundModel;
        this.content = headerContentModel;
        this.headerExpanded = z;
    }

    public HeaderConfig() {
        this(null, null, false, 7, null);
    }
}
