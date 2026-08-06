package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderContentModel {
    public static final int $stable = 0;

    @SerializedName("close_button")
    private final CloseButtonModel closeButton;

    @SerializedName("greeting")
    private final HeaderTextModel greeting;

    @SerializedName("introduction")
    private final HeaderTextModel intro;

    @SerializedName("logo_dark_url")
    private final String logoDarkUrl;

    @SerializedName("logo_url")
    private final String logoUrl;

    @SerializedName("show_avatars")
    private final boolean showAvatars;

    @SerializedName("text_color_type")
    private final String textColorType;

    @SerializedName("text_color_type_dark")
    private final String textColorTypeDark;

    public /* synthetic */ HeaderContentModel(String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel, (i & 16) != 0 ? new HeaderTextModel(null, 0.0f, null, null, 15, null) : headerTextModel2, (i & 32) != 0 ? new CloseButtonModel(null, 0.0f, null, 7, null) : closeButtonModel, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4);
    }

    public static /* synthetic */ HeaderContentModel copy$default(HeaderContentModel headerContentModel, String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerContentModel.logoUrl;
        }
        if ((i & 2) != 0) {
            str2 = headerContentModel.logoDarkUrl;
        }
        if ((i & 4) != 0) {
            z = headerContentModel.showAvatars;
        }
        if ((i & 8) != 0) {
            headerTextModel = headerContentModel.greeting;
        }
        if ((i & 16) != 0) {
            headerTextModel2 = headerContentModel.intro;
        }
        if ((i & 32) != 0) {
            closeButtonModel = headerContentModel.closeButton;
        }
        if ((i & 64) != 0) {
            str3 = headerContentModel.textColorType;
        }
        if ((i & 128) != 0) {
            str4 = headerContentModel.textColorTypeDark;
        }
        String str5 = str3;
        String str6 = str4;
        HeaderTextModel headerTextModel3 = headerTextModel2;
        CloseButtonModel closeButtonModel2 = closeButtonModel;
        return headerContentModel.copy(str, str2, z, headerTextModel, headerTextModel3, closeButtonModel2, str5, str6);
    }

    public final String component1() {
        return this.logoUrl;
    }

    public final String component2() {
        return this.logoDarkUrl;
    }

    public final boolean component3() {
        return this.showAvatars;
    }

    public final HeaderTextModel component4() {
        return this.greeting;
    }

    public final HeaderTextModel component5() {
        return this.intro;
    }

    public final CloseButtonModel component6() {
        return this.closeButton;
    }

    public final String component7() {
        return this.textColorType;
    }

    public final String component8() {
        return this.textColorTypeDark;
    }

    public final HeaderContentModel copy(String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4) {
        str.getClass();
        headerTextModel.getClass();
        headerTextModel2.getClass();
        closeButtonModel.getClass();
        return new HeaderContentModel(str, str2, z, headerTextModel, headerTextModel2, closeButtonModel, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderContentModel)) {
            return false;
        }
        HeaderContentModel headerContentModel = (HeaderContentModel) obj;
        return xj5.a(this.logoUrl, headerContentModel.logoUrl) && xj5.a(this.logoDarkUrl, headerContentModel.logoDarkUrl) && this.showAvatars == headerContentModel.showAvatars && xj5.a(this.greeting, headerContentModel.greeting) && xj5.a(this.intro, headerContentModel.intro) && xj5.a(this.closeButton, headerContentModel.closeButton) && xj5.a(this.textColorType, headerContentModel.textColorType) && xj5.a(this.textColorTypeDark, headerContentModel.textColorTypeDark);
    }

    public final CloseButtonModel getCloseButton() {
        return this.closeButton;
    }

    public final HeaderTextModel getGreeting() {
        return this.greeting;
    }

    public final HeaderTextModel getIntro() {
        return this.intro;
    }

    public final String getLogoDarkUrl() {
        return this.logoDarkUrl;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final boolean getShowAvatars() {
        return this.showAvatars;
    }

    public final String getTextColorType() {
        return this.textColorType;
    }

    public final String getTextColorTypeDark() {
        return this.textColorTypeDark;
    }

    public int hashCode() {
        int iHashCode = this.logoUrl.hashCode() * 31;
        String str = this.logoDarkUrl;
        int iHashCode2 = (this.closeButton.hashCode() + ((this.intro.hashCode() + ((this.greeting.hashCode() + uo2.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.showAvatars, 31)) * 31)) * 31)) * 31;
        String str2 = this.textColorType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColorTypeDark;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderContentModel(logoUrl=");
        sb.append(this.logoUrl);
        sb.append(", logoDarkUrl=");
        sb.append(this.logoDarkUrl);
        sb.append(", showAvatars=");
        sb.append(this.showAvatars);
        sb.append(", greeting=");
        sb.append(this.greeting);
        sb.append(", intro=");
        sb.append(this.intro);
        sb.append(", closeButton=");
        sb.append(this.closeButton);
        sb.append(", textColorType=");
        sb.append(this.textColorType);
        sb.append(", textColorTypeDark=");
        return wu0.a(sb, this.textColorTypeDark, ')');
    }

    public HeaderContentModel(String str, String str2, boolean z, HeaderTextModel headerTextModel, HeaderTextModel headerTextModel2, CloseButtonModel closeButtonModel, String str3, String str4) {
        str.getClass();
        headerTextModel.getClass();
        headerTextModel2.getClass();
        closeButtonModel.getClass();
        this.logoUrl = str;
        this.logoDarkUrl = str2;
        this.showAvatars = z;
        this.greeting = headerTextModel;
        this.intro = headerTextModel2;
        this.closeButton = closeButtonModel;
        this.textColorType = str3;
        this.textColorTypeDark = str4;
    }

    public HeaderContentModel() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }
}
