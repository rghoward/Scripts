package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderBackgroundModel {
    public static final int $stable = 8;

    @SerializedName("color")
    private final String color;

    @SerializedName("color_dark")
    private final String colorDark;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("fade_to_white")
    private final boolean fade;

    @SerializedName("fade_to_dark")
    private final Boolean fadeToDark;

    @SerializedName("gradient")
    private final List<String> gradient;

    @SerializedName("gradient_dark")
    private final List<String> gradientDark;

    @SerializedName("image_dark_url")
    private final String imageDarkUrl;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("type")
    private final HeaderBackdropType type;

    @SerializedName("type_dark")
    private final HeaderBackdropType typeDark;

    public /* synthetic */ HeaderBackgroundModel(String str, String str2, List list, List list2, String str3, String str4, boolean z, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z2, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? true : z, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? HeaderBackdropType.SOLID : headerBackdropType, (i & 512) != 0 ? null : headerBackdropType2, (i & 1024) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderBackgroundModel copy$default(HeaderBackgroundModel headerBackgroundModel, String str, String str2, List list, List list2, String str3, String str4, boolean z, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerBackgroundModel.color;
        }
        if ((i & 2) != 0) {
            str2 = headerBackgroundModel.colorDark;
        }
        if ((i & 4) != 0) {
            list = headerBackgroundModel.gradient;
        }
        if ((i & 8) != 0) {
            list2 = headerBackgroundModel.gradientDark;
        }
        if ((i & 16) != 0) {
            str3 = headerBackgroundModel.imageUrl;
        }
        if ((i & 32) != 0) {
            str4 = headerBackgroundModel.imageDarkUrl;
        }
        if ((i & 64) != 0) {
            z = headerBackgroundModel.fade;
        }
        if ((i & 128) != 0) {
            bool = headerBackgroundModel.fadeToDark;
        }
        if ((i & 256) != 0) {
            headerBackdropType = headerBackgroundModel.type;
        }
        if ((i & 512) != 0) {
            headerBackdropType2 = headerBackgroundModel.typeDark;
        }
        if ((i & 1024) != 0) {
            z2 = headerBackgroundModel.enabled;
        }
        HeaderBackdropType headerBackdropType3 = headerBackdropType2;
        boolean z3 = z2;
        Boolean bool2 = bool;
        HeaderBackdropType headerBackdropType4 = headerBackdropType;
        String str5 = str4;
        boolean z4 = z;
        String str6 = str3;
        List list3 = list;
        return headerBackgroundModel.copy(str, str2, list3, list2, str6, str5, z4, bool2, headerBackdropType4, headerBackdropType3, z3);
    }

    public final String component1() {
        return this.color;
    }

    public final HeaderBackdropType component10() {
        return this.typeDark;
    }

    public final boolean component11() {
        return this.enabled;
    }

    public final String component2() {
        return this.colorDark;
    }

    public final List<String> component3() {
        return this.gradient;
    }

    public final List<String> component4() {
        return this.gradientDark;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final String component6() {
        return this.imageDarkUrl;
    }

    public final boolean component7() {
        return this.fade;
    }

    public final Boolean component8() {
        return this.fadeToDark;
    }

    public final HeaderBackdropType component9() {
        return this.type;
    }

    public final HeaderBackgroundModel copy(String str, String str2, List<String> list, List<String> list2, String str3, String str4, boolean z, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z2) {
        str.getClass();
        headerBackdropType.getClass();
        return new HeaderBackgroundModel(str, str2, list, list2, str3, str4, z, bool, headerBackdropType, headerBackdropType2, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBackgroundModel)) {
            return false;
        }
        HeaderBackgroundModel headerBackgroundModel = (HeaderBackgroundModel) obj;
        return xj5.a(this.color, headerBackgroundModel.color) && xj5.a(this.colorDark, headerBackgroundModel.colorDark) && xj5.a(this.gradient, headerBackgroundModel.gradient) && xj5.a(this.gradientDark, headerBackgroundModel.gradientDark) && xj5.a(this.imageUrl, headerBackgroundModel.imageUrl) && xj5.a(this.imageDarkUrl, headerBackgroundModel.imageDarkUrl) && this.fade == headerBackgroundModel.fade && xj5.a(this.fadeToDark, headerBackgroundModel.fadeToDark) && this.type == headerBackgroundModel.type && this.typeDark == headerBackgroundModel.typeDark && this.enabled == headerBackgroundModel.enabled;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorDark() {
        return this.colorDark;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFade() {
        return this.fade;
    }

    public final Boolean getFadeToDark() {
        return this.fadeToDark;
    }

    public final List<String> getGradient() {
        return this.gradient;
    }

    public final List<String> getGradientDark() {
        return this.gradientDark;
    }

    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final HeaderBackdropType getType() {
        return this.type;
    }

    public final HeaderBackdropType getTypeDark() {
        return this.typeDark;
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        String str = this.colorDark;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.gradient;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.gradientDark;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageDarkUrl;
        int iA = uo2.a((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, this.fade, 31);
        Boolean bool = this.fadeToDark;
        int iHashCode6 = (this.type.hashCode() + ((iA + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        HeaderBackdropType headerBackdropType = this.typeDark;
        return Boolean.hashCode(this.enabled) + ((iHashCode6 + (headerBackdropType != null ? headerBackdropType.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderBackgroundModel(color=");
        sb.append(this.color);
        sb.append(", colorDark=");
        sb.append(this.colorDark);
        sb.append(", gradient=");
        sb.append(this.gradient);
        sb.append(", gradientDark=");
        sb.append(this.gradientDark);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", imageDarkUrl=");
        sb.append(this.imageDarkUrl);
        sb.append(", fade=");
        sb.append(this.fade);
        sb.append(", fadeToDark=");
        sb.append(this.fadeToDark);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", typeDark=");
        sb.append(this.typeDark);
        sb.append(", enabled=");
        return pi1.a(sb, this.enabled, ')');
    }

    public HeaderBackgroundModel(String str, String str2, List<String> list, List<String> list2, String str3, String str4, boolean z, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z2) {
        str.getClass();
        headerBackdropType.getClass();
        this.color = str;
        this.colorDark = str2;
        this.gradient = list;
        this.gradientDark = list2;
        this.imageUrl = str3;
        this.imageDarkUrl = str4;
        this.fade = z;
        this.fadeToDark = bool;
        this.type = headerBackdropType;
        this.typeDark = headerBackdropType2;
        this.enabled = z2;
    }

    public HeaderBackgroundModel() {
        this(null, null, null, null, null, null, false, null, null, null, false, 2047, null);
    }
}
