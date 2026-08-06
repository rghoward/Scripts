package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.fk;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomizationColorsModel {
    public static final int $stable = 0;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("background_color_dark")
    private final String backgroundColorDark;

    @SerializedName("foreground_color")
    private final String foregroundColor;

    @SerializedName("foreground_color_dark")
    private final String foregroundColorDark;

    @SerializedName("foreground_color_low_contrast")
    private final String foregroundLowContrastColor;

    @SerializedName("foreground_color_low_contrast_dark")
    private final String foregroundLowContrastColorDark;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomizationColorsModel(String str, String str2, String str3, String str4, String str5, String str6, int i, qq2 qq2Var) {
        str = (i & 1) != 0 ? "#FFFFFF" : str;
        str2 = (i & 2) != 0 ? "#000000" : str2;
        this(str, str2, (i & 4) != 0 ? str2 : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ CustomizationColorsModel copy$default(CustomizationColorsModel customizationColorsModel, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customizationColorsModel.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = customizationColorsModel.foregroundColor;
        }
        if ((i & 4) != 0) {
            str3 = customizationColorsModel.foregroundLowContrastColor;
        }
        if ((i & 8) != 0) {
            str4 = customizationColorsModel.backgroundColorDark;
        }
        if ((i & 16) != 0) {
            str5 = customizationColorsModel.foregroundColorDark;
        }
        if ((i & 32) != 0) {
            str6 = customizationColorsModel.foregroundLowContrastColorDark;
        }
        String str7 = str5;
        String str8 = str6;
        return customizationColorsModel.copy(str, str2, str3, str4, str7, str8);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.foregroundColor;
    }

    public final String component3() {
        return this.foregroundLowContrastColor;
    }

    public final String component4() {
        return this.backgroundColorDark;
    }

    public final String component5() {
        return this.foregroundColorDark;
    }

    public final String component6() {
        return this.foregroundLowContrastColorDark;
    }

    public final CustomizationColorsModel copy(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new CustomizationColorsModel(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationColorsModel)) {
            return false;
        }
        CustomizationColorsModel customizationColorsModel = (CustomizationColorsModel) obj;
        return xj5.a(this.backgroundColor, customizationColorsModel.backgroundColor) && xj5.a(this.foregroundColor, customizationColorsModel.foregroundColor) && xj5.a(this.foregroundLowContrastColor, customizationColorsModel.foregroundLowContrastColor) && xj5.a(this.backgroundColorDark, customizationColorsModel.backgroundColorDark) && xj5.a(this.foregroundColorDark, customizationColorsModel.foregroundColorDark) && xj5.a(this.foregroundLowContrastColorDark, customizationColorsModel.foregroundLowContrastColorDark);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getForegroundColorDark() {
        return this.foregroundColorDark;
    }

    public final String getForegroundLowContrastColor() {
        return this.foregroundLowContrastColor;
    }

    public final String getForegroundLowContrastColorDark() {
        return this.foregroundLowContrastColorDark;
    }

    public int hashCode() {
        int iC = ru3.c(ru3.c(this.backgroundColor.hashCode() * 31, 31, this.foregroundColor), 31, this.foregroundLowContrastColor);
        String str = this.backgroundColorDark;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.foregroundColorDark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foregroundLowContrastColorDark;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomizationColorsModel(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", foregroundColor=");
        sb.append(this.foregroundColor);
        sb.append(", foregroundLowContrastColor=");
        sb.append(this.foregroundLowContrastColor);
        sb.append(", backgroundColorDark=");
        sb.append(this.backgroundColorDark);
        sb.append(", foregroundColorDark=");
        sb.append(this.foregroundColorDark);
        sb.append(", foregroundLowContrastColorDark=");
        return wu0.a(sb, this.foregroundLowContrastColorDark, ')');
    }

    public CustomizationColorsModel(String str, String str2, String str3, String str4, String str5, String str6) {
        fk.b(str, str2, str3);
        this.backgroundColor = str;
        this.foregroundColor = str2;
        this.foregroundLowContrastColor = str3;
        this.backgroundColorDark = str4;
        this.foregroundColorDark = str5;
        this.foregroundLowContrastColorDark = str6;
    }

    public CustomizationColorsModel() {
        this(null, null, null, null, null, null, 63, null);
    }
}
