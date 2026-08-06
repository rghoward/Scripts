package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.e44;
import defpackage.os2;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomizationModel {
    public static final int $stable = 0;

    @SerializedName("action")
    private final CustomizationColorsModel action;

    @SerializedName("action_contrast_dark")
    private final CustomizationColorsModel actionContrastDark;

    @SerializedName("action_contrast_white")
    private final CustomizationColorsModel actionContrastWhite;

    @SerializedName("alignment")
    private final String alignment;

    @SerializedName("brand_name")
    private final String brandName;

    @SerializedName("header")
    private final CustomizationColorsModel header;

    @SerializedName("horizontal_padding")
    private final int horizontalPadding;

    @SerializedName("launcher_logo_dark_url")
    private final String launcherLogoDarkUrl;

    @SerializedName("launcher_logo_url")
    private final String launcherLogoUrl;

    @SerializedName("messenger_wallpaper")
    private final String messengerWallpaper;

    @SerializedName("theme_mode")
    private final String themeMode;

    @SerializedName("vertical_padding")
    private final int verticalPadding;

    public CustomizationModel(CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, CustomizationColorsModel customizationColorsModel3, String str, String str2, CustomizationColorsModel customizationColorsModel4, int i, String str3, String str4, String str5, String str6, int i2) {
        customizationColorsModel.getClass();
        str.getClass();
        str2.getClass();
        customizationColorsModel4.getClass();
        str5.getClass();
        this.action = customizationColorsModel;
        this.actionContrastWhite = customizationColorsModel2;
        this.actionContrastDark = customizationColorsModel3;
        this.alignment = str;
        this.brandName = str2;
        this.header = customizationColorsModel4;
        this.horizontalPadding = i;
        this.launcherLogoUrl = str3;
        this.launcherLogoDarkUrl = str4;
        this.messengerWallpaper = str5;
        this.themeMode = str6;
        this.verticalPadding = i2;
    }

    public static /* synthetic */ CustomizationModel copy$default(CustomizationModel customizationModel, CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, CustomizationColorsModel customizationColorsModel3, String str, String str2, CustomizationColorsModel customizationColorsModel4, int i, String str3, String str4, String str5, String str6, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            customizationColorsModel = customizationModel.action;
        }
        if ((i3 & 2) != 0) {
            customizationColorsModel2 = customizationModel.actionContrastWhite;
        }
        if ((i3 & 4) != 0) {
            customizationColorsModel3 = customizationModel.actionContrastDark;
        }
        if ((i3 & 8) != 0) {
            str = customizationModel.alignment;
        }
        if ((i3 & 16) != 0) {
            str2 = customizationModel.brandName;
        }
        if ((i3 & 32) != 0) {
            customizationColorsModel4 = customizationModel.header;
        }
        if ((i3 & 64) != 0) {
            i = customizationModel.horizontalPadding;
        }
        if ((i3 & 128) != 0) {
            str3 = customizationModel.launcherLogoUrl;
        }
        if ((i3 & 256) != 0) {
            str4 = customizationModel.launcherLogoDarkUrl;
        }
        if ((i3 & 512) != 0) {
            str5 = customizationModel.messengerWallpaper;
        }
        if ((i3 & 1024) != 0) {
            str6 = customizationModel.themeMode;
        }
        if ((i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
            i2 = customizationModel.verticalPadding;
        }
        String str7 = str6;
        int i4 = i2;
        String str8 = str4;
        String str9 = str5;
        int i5 = i;
        String str10 = str3;
        String str11 = str2;
        CustomizationColorsModel customizationColorsModel5 = customizationColorsModel4;
        return customizationModel.copy(customizationColorsModel, customizationColorsModel2, customizationColorsModel3, str, str11, customizationColorsModel5, i5, str10, str8, str9, str7, i4);
    }

    public final CustomizationColorsModel component1() {
        return this.action;
    }

    public final String component10() {
        return this.messengerWallpaper;
    }

    public final String component11() {
        return this.themeMode;
    }

    public final int component12() {
        return this.verticalPadding;
    }

    public final CustomizationColorsModel component2() {
        return this.actionContrastWhite;
    }

    public final CustomizationColorsModel component3() {
        return this.actionContrastDark;
    }

    public final String component4() {
        return this.alignment;
    }

    public final String component5() {
        return this.brandName;
    }

    public final CustomizationColorsModel component6() {
        return this.header;
    }

    public final int component7() {
        return this.horizontalPadding;
    }

    public final String component8() {
        return this.launcherLogoUrl;
    }

    public final String component9() {
        return this.launcherLogoDarkUrl;
    }

    public final CustomizationModel copy(CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, CustomizationColorsModel customizationColorsModel3, String str, String str2, CustomizationColorsModel customizationColorsModel4, int i, String str3, String str4, String str5, String str6, int i2) {
        customizationColorsModel.getClass();
        str.getClass();
        str2.getClass();
        customizationColorsModel4.getClass();
        str5.getClass();
        return new CustomizationModel(customizationColorsModel, customizationColorsModel2, customizationColorsModel3, str, str2, customizationColorsModel4, i, str3, str4, str5, str6, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizationModel)) {
            return false;
        }
        CustomizationModel customizationModel = (CustomizationModel) obj;
        return xj5.a(this.action, customizationModel.action) && xj5.a(this.actionContrastWhite, customizationModel.actionContrastWhite) && xj5.a(this.actionContrastDark, customizationModel.actionContrastDark) && xj5.a(this.alignment, customizationModel.alignment) && xj5.a(this.brandName, customizationModel.brandName) && xj5.a(this.header, customizationModel.header) && this.horizontalPadding == customizationModel.horizontalPadding && xj5.a(this.launcherLogoUrl, customizationModel.launcherLogoUrl) && xj5.a(this.launcherLogoDarkUrl, customizationModel.launcherLogoDarkUrl) && xj5.a(this.messengerWallpaper, customizationModel.messengerWallpaper) && xj5.a(this.themeMode, customizationModel.themeMode) && this.verticalPadding == customizationModel.verticalPadding;
    }

    public final CustomizationColorsModel getAction() {
        return this.action;
    }

    public final CustomizationColorsModel getActionContrastDark() {
        return this.actionContrastDark;
    }

    public final CustomizationColorsModel getActionContrastWhite() {
        return this.actionContrastWhite;
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final CustomizationColorsModel getHeader() {
        return this.header;
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final String getLauncherLogoDarkUrl() {
        return this.launcherLogoDarkUrl;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getMessengerWallpaper() {
        return this.messengerWallpaper;
    }

    public final String getThemeMode() {
        return this.themeMode;
    }

    public final int getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        CustomizationColorsModel customizationColorsModel = this.actionContrastWhite;
        int iHashCode2 = (iHashCode + (customizationColorsModel == null ? 0 : customizationColorsModel.hashCode())) * 31;
        CustomizationColorsModel customizationColorsModel2 = this.actionContrastDark;
        int iA = os2.a(this.horizontalPadding, (this.header.hashCode() + ru3.c(ru3.c((iHashCode2 + (customizationColorsModel2 == null ? 0 : customizationColorsModel2.hashCode())) * 31, 31, this.alignment), 31, this.brandName)) * 31, 31);
        String str = this.launcherLogoUrl;
        int iHashCode3 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.launcherLogoDarkUrl;
        int iC = ru3.c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.messengerWallpaper);
        String str3 = this.themeMode;
        return Integer.hashCode(this.verticalPadding) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CustomizationModel(action=");
        sb.append(this.action);
        sb.append(", actionContrastWhite=");
        sb.append(this.actionContrastWhite);
        sb.append(", actionContrastDark=");
        sb.append(this.actionContrastDark);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", brandName=");
        sb.append(this.brandName);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", horizontalPadding=");
        sb.append(this.horizontalPadding);
        sb.append(", launcherLogoUrl=");
        sb.append(this.launcherLogoUrl);
        sb.append(", launcherLogoDarkUrl=");
        sb.append(this.launcherLogoDarkUrl);
        sb.append(", messengerWallpaper=");
        sb.append(this.messengerWallpaper);
        sb.append(", themeMode=");
        sb.append(this.themeMode);
        sb.append(", verticalPadding=");
        return e44.a(sb, this.verticalPadding, ')');
    }

    public /* synthetic */ CustomizationModel(CustomizationColorsModel customizationColorsModel, CustomizationColorsModel customizationColorsModel2, CustomizationColorsModel customizationColorsModel3, String str, String str2, CustomizationColorsModel customizationColorsModel4, int i, String str3, String str4, String str5, String str6, int i2, int i3, qq2 qq2Var) {
        this(customizationColorsModel, customizationColorsModel2, (i3 & 4) != 0 ? null : customizationColorsModel3, str, str2, customizationColorsModel4, i, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : str4, str5, (i3 & 1024) != 0 ? null : str6, i2);
    }
}
