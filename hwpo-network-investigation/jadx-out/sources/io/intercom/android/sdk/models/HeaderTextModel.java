package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.h44;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderTextModel {
    public static final int $stable = 0;

    @SerializedName("text_color")
    private final String color;

    @SerializedName("text_color_dark")
    private final String colorDark;

    @SerializedName("opacity")
    private final float opacity;

    @SerializedName("content")
    private final String text;

    public /* synthetic */ HeaderTextModel(String str, float f, String str2, String str3, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? "#000000" : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ HeaderTextModel copy$default(HeaderTextModel headerTextModel, String str, float f, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerTextModel.text;
        }
        if ((i & 2) != 0) {
            f = headerTextModel.opacity;
        }
        if ((i & 4) != 0) {
            str2 = headerTextModel.color;
        }
        if ((i & 8) != 0) {
            str3 = headerTextModel.colorDark;
        }
        return headerTextModel.copy(str, f, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final float component2() {
        return this.opacity;
    }

    public final String component3() {
        return this.color;
    }

    public final String component4() {
        return this.colorDark;
    }

    public final HeaderTextModel copy(String str, float f, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return new HeaderTextModel(str, f, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTextModel)) {
            return false;
        }
        HeaderTextModel headerTextModel = (HeaderTextModel) obj;
        return xj5.a(this.text, headerTextModel.text) && Float.compare(this.opacity, headerTextModel.opacity) == 0 && xj5.a(this.color, headerTextModel.color) && xj5.a(this.colorDark, headerTextModel.colorDark);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorDark() {
        return this.colorDark;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iC = ru3.c(h44.a(this.text.hashCode() * 31, this.opacity, 31), 31, this.color);
        String str = this.colorDark;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderTextModel(text=");
        sb.append(this.text);
        sb.append(", opacity=");
        sb.append(this.opacity);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", colorDark=");
        return wu0.a(sb, this.colorDark, ')');
    }

    public HeaderTextModel(String str, float f, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.opacity = f;
        this.color = str2;
        this.colorDark = str3;
    }

    public HeaderTextModel() {
        this(null, 0.0f, null, null, 15, null);
    }
}
