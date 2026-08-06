package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.h44;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CloseButtonModel {
    public static final int $stable = 0;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("background_opacity")
    private final float backgroundOpacity;

    @SerializedName("foreground_color")
    private final String foregroundColor;

    public /* synthetic */ CloseButtonModel(String str, float f, String str2, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? "#000000" : str2);
    }

    public static /* synthetic */ CloseButtonModel copy$default(CloseButtonModel closeButtonModel, String str, float f, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = closeButtonModel.backgroundColor;
        }
        if ((i & 2) != 0) {
            f = closeButtonModel.backgroundOpacity;
        }
        if ((i & 4) != 0) {
            str2 = closeButtonModel.foregroundColor;
        }
        return closeButtonModel.copy(str, f, str2);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final float component2() {
        return this.backgroundOpacity;
    }

    public final String component3() {
        return this.foregroundColor;
    }

    public final CloseButtonModel copy(String str, float f, String str2) {
        str.getClass();
        str2.getClass();
        return new CloseButtonModel(str, f, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseButtonModel)) {
            return false;
        }
        CloseButtonModel closeButtonModel = (CloseButtonModel) obj;
        return xj5.a(this.backgroundColor, closeButtonModel.backgroundColor) && Float.compare(this.backgroundOpacity, closeButtonModel.backgroundOpacity) == 0 && xj5.a(this.foregroundColor, closeButtonModel.foregroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final float getBackgroundOpacity() {
        return this.backgroundOpacity;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public int hashCode() {
        return this.foregroundColor.hashCode() + h44.a(this.backgroundColor.hashCode() * 31, this.backgroundOpacity, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CloseButtonModel(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", backgroundOpacity=");
        sb.append(this.backgroundOpacity);
        sb.append(", foregroundColor=");
        return wu0.a(sb, this.foregroundColor, ')');
    }

    public CloseButtonModel(String str, float f, String str2) {
        str.getClass();
        str2.getClass();
        this.backgroundColor = str;
        this.backgroundOpacity = f;
        this.foregroundColor = str2;
    }

    public CloseButtonModel() {
        this(null, 0.0f, null, 7, null);
    }
}
