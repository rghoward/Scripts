package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfigModules {
    private static final ConfigModules DEFAULT;
    private static final ConfigModules DEFAULT_WITH_ACTION_COLORS;

    @SerializedName("customization")
    private final CustomizationModel customization;

    @SerializedName("home")
    private final HomeConfig home;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        String str2 = null;
        String str3 = null;
        CustomizationColorsModel customizationColorsModel = new CustomizationColorsModel(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, str, str2, str3, 60, null);
        String str4 = null;
        CustomizationColorsModel customizationColorsModel2 = new CustomizationColorsModel(BuildConfig.FLAVOR, BuildConfig.FLAVOR, str, str2, str3, str4, 60, null);
        String str5 = BuildConfig.FLAVOR;
        String str6 = BuildConfig.FLAVOR;
        String str7 = null;
        CustomizationModel customizationModel = new CustomizationModel(customizationColorsModel, customizationColorsModel2, null, BuildConfig.FLAVOR, BuildConfig.FLAVOR, new CustomizationColorsModel(str5, str6, str2, str3, str4, str7, 60, null), 0, str4, str7, BuildConfig.FLAVOR, 0 == true ? 1 : 0, 0, 4, null);
        int i = 2;
        DEFAULT = new ConfigModules(customizationModel, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        String str8 = null;
        CustomizationColorsModel customizationColorsModel3 = new CustomizationColorsModel("#000000", "#FFFFFF", "#FFFFFF", str8, str4, str7, 56, 0 == true ? 1 : 0);
        String str9 = null;
        CustomizationColorsModel customizationColorsModel4 = new CustomizationColorsModel("#000000", "#FAFAFA", str8, str4, str7, str9, 60, null);
        String str10 = BuildConfig.FLAVOR;
        String str11 = BuildConfig.FLAVOR;
        String str12 = null;
        DEFAULT_WITH_ACTION_COLORS = new ConfigModules(new CustomizationModel(customizationColorsModel3, customizationColorsModel4, null, BuildConfig.FLAVOR, BuildConfig.FLAVOR, new CustomizationColorsModel(str10, str11, str4, str7, str9, str12, 60, null), 0, str9, str12, BuildConfig.FLAVOR, 0 == true ? 1 : 0, 0, 4, null), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ConfigModules(CustomizationModel customizationModel, HomeConfig homeConfig, int i, qq2 qq2Var) {
        if ((i & 2) != 0) {
            homeConfig = new HomeConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(customizationModel, homeConfig);
    }

    public static /* synthetic */ ConfigModules copy$default(ConfigModules configModules, CustomizationModel customizationModel, HomeConfig homeConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            customizationModel = configModules.customization;
        }
        if ((i & 2) != 0) {
            homeConfig = configModules.home;
        }
        return configModules.copy(customizationModel, homeConfig);
    }

    public static final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
        return Companion.getDEFAULT_WITH_ACTION_COLORS();
    }

    public final CustomizationModel component1() {
        return this.customization;
    }

    public final HomeConfig component2() {
        return this.home;
    }

    public final ConfigModules copy(CustomizationModel customizationModel, HomeConfig homeConfig) {
        customizationModel.getClass();
        homeConfig.getClass();
        return new ConfigModules(customizationModel, homeConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigModules)) {
            return false;
        }
        ConfigModules configModules = (ConfigModules) obj;
        return xj5.a(this.customization, configModules.customization) && xj5.a(this.home, configModules.home);
    }

    public final CustomizationModel getCustomization() {
        return this.customization;
    }

    public final HomeConfig getHome() {
        return this.home;
    }

    public int hashCode() {
        return this.home.hashCode() + (this.customization.hashCode() * 31);
    }

    public String toString() {
        return "ConfigModules(customization=" + this.customization + ", home=" + this.home + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final ConfigModules getDEFAULT() {
            return ConfigModules.DEFAULT;
        }

        public final ConfigModules getDEFAULT_WITH_ACTION_COLORS() {
            return ConfigModules.DEFAULT_WITH_ACTION_COLORS;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEFAULT_WITH_ACTION_COLORS$annotations() {
        }
    }

    public ConfigModules(CustomizationModel customizationModel, HomeConfig homeConfig) {
        customizationModel.getClass();
        homeConfig.getClass();
        this.customization = customizationModel;
        this.home = homeConfig;
    }
}
