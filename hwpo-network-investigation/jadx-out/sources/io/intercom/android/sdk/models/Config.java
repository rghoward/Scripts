package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.al;
import defpackage.of3;
import defpackage.os2;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Config {
    public static final long DEFAULT_CACHE_MAX_AGE_SECONDS = 300;
    public static final int DEFAULT_RATE_LIMIT_COUNT = 100;
    public static final long DEFAULT_RATE_LIMIT_PERIOD_SECONDS = 60;
    public static final long DEFAULT_SESSION_TIMEOUT_SECONDS = 20;
    public static final long DEFAULT_SOFT_RESET_TIMEOUT_SECONDS = 1;

    @SerializedName("new_session_threshold")
    private final long _newSessionThresholdSeconds;

    @SerializedName("local_rate_limit_period")
    private final long _rateLimitPeriodSeconds;

    @SerializedName("real_time_config")
    private final NexusConfig.Builder _realTimeConfigBuilder;

    @SerializedName("soft_reset_timeout")
    private final long _softResetTimeoutSeconds;

    @SerializedName("user_update_dup_cache_max_age")
    private final long _userUpdateCacheMaxAgeSeconds;

    @SerializedName("access_to_teammate_enabled")
    private final boolean accessToTeammateEnabled;

    @SerializedName("ask_users_to_allow_notifications_android")
    private final boolean askUsersToAllowNotifications;

    @SerializedName("attachment_settings")
    private final AttachmentSettings attachmentSettings;

    @SerializedName("conversation_state_sync_settings")
    private final ConversationStateSyncSettings conversationStateSyncSettings;

    @SerializedName("crash_reporting_config")
    private final CrashReportingConfig crashReportingConfig;

    @SerializedName("features")
    private final Set<String> features;

    @SerializedName("has_open_conversations")
    private final boolean hasOpenConversations;

    @SerializedName("help_center_locale")
    private final String helpCenterLocale;

    @SerializedName("help_center_require_search")
    private final boolean helpCenterRequireSearch;

    @SerializedName("help_center_url")
    private final String helpCenterUrl;

    @SerializedName("help_center_urls")
    private final Set<String> helpCenterUrls;

    @SerializedName("identity_verification_enabled")
    private final boolean identityVerificationEnabled;

    @SerializedName("article_auto_reaction_enabled")
    private final boolean isArticleAutoReactionEnabled;

    @SerializedName("audio_enabled")
    private final boolean isAudioEnabled;

    @SerializedName("background_requests_enabled")
    private final boolean isBackgroundRequestsEnabled;

    @SerializedName("is_first_request")
    private final boolean isFirstRequest;

    @SerializedName("inbound_messages")
    private final boolean isInboundMessages;

    @SerializedName("metrics_enabled")
    private final boolean isMetricsEnabled;

    @SerializedName("primary_color_render_dark_text")
    private final boolean isPrimaryColorRenderDarkText;

    @SerializedName("secondary_color_render_dark_text")
    private final boolean isSecondaryColorRenderDarkText;

    @SerializedName("launcher_logo_url")
    private final String launcherLogoUrl;
    private final String locale;

    @SerializedName("modules")
    private final ConfigModules modules;
    private final String name;

    @SerializedName("prevent_multiple_inbound_conversations_enabled")
    private final boolean preventMultipleInboundConversationsEnabled;

    @SerializedName("base_color")
    private final String primaryColor;

    @SerializedName("local_rate_limit")
    private final int rateLimitCount;

    @SerializedName("secondary_color")
    private final String secondaryColor;

    @SerializedName("team_greeting")
    private final String teamGreeting;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Config NULL = new Config(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, null, null, null, null, false, false, false, false, false, null, null, false, null, false, null, -1, 3, null);

    public /* synthetic */ Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, int i, long j2, long j3, long j4, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, CrashReportingConfig crashReportingConfig, int i2, int i3, qq2 qq2Var) {
        CrashReportingConfig crashReportingConfig2;
        ConversationStateSyncSettings conversationStateSyncSettings2;
        int i4;
        String str9;
        String str10;
        int i5 = i2 & 1;
        String str11 = BuildConfig.FLAVOR;
        String str12 = i5 != 0 ? BuildConfig.FLAVOR : str;
        String str13 = (i2 & 2) != 0 ? null : str2;
        String str14 = (i2 & 4) != 0 ? null : str3;
        String str15 = (i2 & 8) != 0 ? BuildConfig.FLAVOR : str4;
        String str16 = (i2 & 16) != 0 ? BuildConfig.FLAVOR : str5;
        String str17 = (i2 & 32) != 0 ? BuildConfig.FLAVOR : str6;
        String str18 = (i2 & 64) != 0 ? BuildConfig.FLAVOR : str7;
        boolean z15 = (i2 & 128) != 0 ? false : z;
        boolean z16 = (i2 & 256) != 0 ? false : z2;
        boolean z17 = (i2 & 512) != 0 ? true : z3;
        boolean z18 = (i2 & 1024) != 0 ? true : z4;
        boolean z19 = (i2 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? true : z5;
        boolean z20 = (i2 & 4096) != 0 ? false : z6;
        boolean z21 = (i2 & 8192) != 0 ? false : z7;
        String str19 = str12;
        long j5 = (i2 & 16384) != 0 ? 60L : j;
        int i6 = (32768 & i2) != 0 ? 100 : i;
        long j6 = (i2 & 65536) != 0 ? 300L : j2;
        long j7 = (i2 & 131072) != 0 ? 1L : j3;
        long j8 = (i2 & 262144) != 0 ? 20L : j4;
        NexusConfig.Builder builder2 = (i2 & 524288) != 0 ? new NexusConfig.Builder() : builder;
        str11 = (i2 & 1048576) == 0 ? str8 : str11;
        int i7 = i2 & 2097152;
        Set set3 = of3.t;
        Set set4 = i7 != 0 ? set3 : set;
        set3 = (i2 & 4194304) == 0 ? set2 : set3;
        boolean z22 = (i2 & 8388608) != 0 ? false : z8;
        boolean z23 = (i2 & 16777216) != 0 ? true : z9;
        boolean z24 = (i2 & 33554432) != 0 ? false : z10;
        boolean z25 = (i2 & 67108864) != 0 ? false : z11;
        boolean z26 = (i2 & 134217728) != 0 ? false : z12;
        ConfigModules configModules2 = (i2 & 268435456) != 0 ? null : configModules;
        AttachmentSettings attachmentSettings2 = (i2 & 536870912) != 0 ? AttachmentSettings.Companion.getDEFAULT() : attachmentSettings;
        boolean z27 = (i2 & 1073741824) != 0 ? true : z13;
        ConversationStateSyncSettings conversationStateSyncSettings3 = (i2 & Integer.MIN_VALUE) != 0 ? ConversationStateSyncSettings.Companion.getDEFAULT() : conversationStateSyncSettings;
        boolean z28 = (i3 & 1) != 0 ? false : z14;
        if ((i3 & 2) != 0) {
            str9 = str11;
            str10 = str13;
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            i4 = i6;
            crashReportingConfig2 = new CrashReportingConfig(false, 1, null);
        } else {
            crashReportingConfig2 = crashReportingConfig;
            conversationStateSyncSettings2 = conversationStateSyncSettings3;
            i4 = i6;
            str9 = str11;
            str10 = str13;
        }
        this(str19, str10, str14, str15, str16, str17, str18, z15, z16, z17, z18, z19, z20, z21, j5, i4, j6, j7, j8, builder2, str9, set4, set3, z22, z23, z24, z25, z26, configModules2, attachmentSettings2, z27, conversationStateSyncSettings2, z28, crashReportingConfig2);
    }

    private final long component15() {
        return this._rateLimitPeriodSeconds;
    }

    private final long component17() {
        return this._userUpdateCacheMaxAgeSeconds;
    }

    private final long component18() {
        return this._softResetTimeoutSeconds;
    }

    private final long component19() {
        return this._newSessionThresholdSeconds;
    }

    private final NexusConfig.Builder component20() {
        return this._realTimeConfigBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, int i, long j2, long j3, long j4, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, CrashReportingConfig crashReportingConfig, int i2, int i3, Object obj) {
        CrashReportingConfig crashReportingConfig2;
        boolean z15;
        String str9 = (i2 & 1) != 0 ? config.name : str;
        String str10 = (i2 & 2) != 0 ? config.primaryColor : str2;
        String str11 = (i2 & 4) != 0 ? config.secondaryColor : str3;
        String str12 = (i2 & 8) != 0 ? config.locale : str4;
        String str13 = (i2 & 16) != 0 ? config.helpCenterLocale : str5;
        String str14 = (i2 & 32) != 0 ? config.launcherLogoUrl : str6;
        String str15 = (i2 & 64) != 0 ? config.teamGreeting : str7;
        boolean z16 = (i2 & 128) != 0 ? config.isFirstRequest : z;
        boolean z17 = (i2 & 256) != 0 ? config.isInboundMessages : z2;
        boolean z18 = (i2 & 512) != 0 ? config.isAudioEnabled : z3;
        boolean z19 = (i2 & 1024) != 0 ? config.isMetricsEnabled : z4;
        boolean z20 = (i2 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? config.isBackgroundRequestsEnabled : z5;
        boolean z21 = (i2 & 4096) != 0 ? config.isPrimaryColorRenderDarkText : z6;
        boolean z22 = (i2 & 8192) != 0 ? config.isSecondaryColorRenderDarkText : z7;
        String str16 = str9;
        long j5 = (i2 & 16384) != 0 ? config._rateLimitPeriodSeconds : j;
        int i4 = (i2 & 32768) != 0 ? config.rateLimitCount : i;
        long j6 = (i2 & 65536) != 0 ? config._userUpdateCacheMaxAgeSeconds : j2;
        long j7 = (i2 & 131072) != 0 ? config._softResetTimeoutSeconds : j3;
        long j8 = (i2 & 262144) != 0 ? config._newSessionThresholdSeconds : j4;
        NexusConfig.Builder builder2 = (i2 & 524288) != 0 ? config._realTimeConfigBuilder : builder;
        String str17 = (i2 & 1048576) != 0 ? config.helpCenterUrl : str8;
        NexusConfig.Builder builder3 = builder2;
        Set set3 = (i2 & 2097152) != 0 ? config.helpCenterUrls : set;
        Set set4 = (i2 & 4194304) != 0 ? config.features : set2;
        boolean z23 = (i2 & 8388608) != 0 ? config.identityVerificationEnabled : z8;
        boolean z24 = (i2 & 16777216) != 0 ? config.accessToTeammateEnabled : z9;
        boolean z25 = (i2 & 33554432) != 0 ? config.helpCenterRequireSearch : z10;
        boolean z26 = (i2 & 67108864) != 0 ? config.preventMultipleInboundConversationsEnabled : z11;
        boolean z27 = (i2 & 134217728) != 0 ? config.hasOpenConversations : z12;
        ConfigModules configModules2 = (i2 & 268435456) != 0 ? config.modules : configModules;
        AttachmentSettings attachmentSettings2 = (i2 & 536870912) != 0 ? config.attachmentSettings : attachmentSettings;
        boolean z28 = (i2 & 1073741824) != 0 ? config.isArticleAutoReactionEnabled : z13;
        ConversationStateSyncSettings conversationStateSyncSettings2 = (i2 & Integer.MIN_VALUE) != 0 ? config.conversationStateSyncSettings : conversationStateSyncSettings;
        boolean z29 = (i3 & 1) != 0 ? config.askUsersToAllowNotifications : z14;
        if ((i3 & 2) != 0) {
            z15 = z29;
            crashReportingConfig2 = config.crashReportingConfig;
        } else {
            crashReportingConfig2 = crashReportingConfig;
            z15 = z29;
        }
        return config.copy(str16, str10, str11, str12, str13, str14, str15, z16, z17, z18, z19, z20, z21, z22, j5, i4, j6, j7, j8, builder3, str17, set3, set4, z23, z24, z25, z26, z27, configModules2, attachmentSettings2, z28, conversationStateSyncSettings2, z15, crashReportingConfig2);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.isAudioEnabled;
    }

    public final boolean component11() {
        return this.isMetricsEnabled;
    }

    public final boolean component12() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean component13() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component14() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final int component16() {
        return this.rateLimitCount;
    }

    public final String component2() {
        return this.primaryColor;
    }

    public final String component21() {
        return this.helpCenterUrl;
    }

    public final Set<String> component22() {
        return this.helpCenterUrls;
    }

    public final Set<String> component23() {
        return this.features;
    }

    public final boolean component24() {
        return this.identityVerificationEnabled;
    }

    public final boolean component25() {
        return this.accessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.helpCenterRequireSearch;
    }

    public final boolean component27() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    public final ConfigModules component29() {
        return this.modules;
    }

    public final String component3() {
        return this.secondaryColor;
    }

    public final AttachmentSettings component30() {
        return this.attachmentSettings;
    }

    public final boolean component31() {
        return this.isArticleAutoReactionEnabled;
    }

    public final ConversationStateSyncSettings component32() {
        return this.conversationStateSyncSettings;
    }

    public final boolean component33() {
        return this.askUsersToAllowNotifications;
    }

    public final CrashReportingConfig component34() {
        return this.crashReportingConfig;
    }

    public final String component4() {
        return this.locale;
    }

    public final String component5() {
        return this.helpCenterLocale;
    }

    public final String component6() {
        return this.launcherLogoUrl;
    }

    public final String component7() {
        return this.teamGreeting;
    }

    public final boolean component8() {
        return this.isFirstRequest;
    }

    public final boolean component9() {
        return this.isInboundMessages;
    }

    public final Config copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, int i, long j2, long j3, long j4, NexusConfig.Builder builder, String str8, Set<String> set, Set<String> set2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, CrashReportingConfig crashReportingConfig) {
        str.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        builder.getClass();
        str8.getClass();
        set.getClass();
        set2.getClass();
        attachmentSettings.getClass();
        conversationStateSyncSettings.getClass();
        return new Config(str, str2, str3, str4, str5, str6, str7, z, z2, z3, z4, z5, z6, z7, j, i, j2, j3, j4, builder, str8, set, set2, z8, z9, z10, z11, z12, configModules, attachmentSettings, z13, conversationStateSyncSettings, z14, crashReportingConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return xj5.a(this.name, config.name) && xj5.a(this.primaryColor, config.primaryColor) && xj5.a(this.secondaryColor, config.secondaryColor) && xj5.a(this.locale, config.locale) && xj5.a(this.helpCenterLocale, config.helpCenterLocale) && xj5.a(this.launcherLogoUrl, config.launcherLogoUrl) && xj5.a(this.teamGreeting, config.teamGreeting) && this.isFirstRequest == config.isFirstRequest && this.isInboundMessages == config.isInboundMessages && this.isAudioEnabled == config.isAudioEnabled && this.isMetricsEnabled == config.isMetricsEnabled && this.isBackgroundRequestsEnabled == config.isBackgroundRequestsEnabled && this.isPrimaryColorRenderDarkText == config.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == config.isSecondaryColorRenderDarkText && this._rateLimitPeriodSeconds == config._rateLimitPeriodSeconds && this.rateLimitCount == config.rateLimitCount && this._userUpdateCacheMaxAgeSeconds == config._userUpdateCacheMaxAgeSeconds && this._softResetTimeoutSeconds == config._softResetTimeoutSeconds && this._newSessionThresholdSeconds == config._newSessionThresholdSeconds && xj5.a(this._realTimeConfigBuilder, config._realTimeConfigBuilder) && xj5.a(this.helpCenterUrl, config.helpCenterUrl) && xj5.a(this.helpCenterUrls, config.helpCenterUrls) && xj5.a(this.features, config.features) && this.identityVerificationEnabled == config.identityVerificationEnabled && this.accessToTeammateEnabled == config.accessToTeammateEnabled && this.helpCenterRequireSearch == config.helpCenterRequireSearch && this.preventMultipleInboundConversationsEnabled == config.preventMultipleInboundConversationsEnabled && this.hasOpenConversations == config.hasOpenConversations && xj5.a(this.modules, config.modules) && xj5.a(this.attachmentSettings, config.attachmentSettings) && this.isArticleAutoReactionEnabled == config.isArticleAutoReactionEnabled && xj5.a(this.conversationStateSyncSettings, config.conversationStateSyncSettings) && this.askUsersToAllowNotifications == config.askUsersToAllowNotifications && xj5.a(this.crashReportingConfig, config.crashReportingConfig);
    }

    public final boolean getAccessToTeammateEnabled() {
        return this.accessToTeammateEnabled;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final CrashReportingConfig getCrashReportingConfig() {
        return this.crashReportingConfig;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final boolean getHelpCenterRequireSearch() {
        return this.helpCenterRequireSearch;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final boolean getIdentityVerificationEnabled() {
        return this.identityVerificationEnabled;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final ConfigModules getModules() {
        return this.modules;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThreshold() {
        return TimeUnit.SECONDS.toMillis(this._newSessionThresholdSeconds);
    }

    public final boolean getPreventMultipleInboundConversationsEnabled() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriod() {
        return TimeUnit.SECONDS.toMillis(this._rateLimitPeriodSeconds);
    }

    public final NexusConfig getRealTimeConfig() {
        NexusConfig nexusConfigBuild = this._realTimeConfigBuilder.build();
        nexusConfigBuild.getClass();
        return nexusConfigBuild;
    }

    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final long getSoftResetTimeout() {
        return TimeUnit.SECONDS.toMillis(this._softResetTimeoutSeconds);
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAge() {
        return TimeUnit.SECONDS.toMillis(this._userUpdateCacheMaxAgeSeconds);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.primaryColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryColor;
        int iA = uo2.a(uo2.a(uo2.a(uo2.a(uo2.a((this.features.hashCode() + ((this.helpCenterUrls.hashCode() + ru3.c((this._realTimeConfigBuilder.hashCode() + al.c(this._newSessionThresholdSeconds, al.c(this._softResetTimeoutSeconds, al.c(this._userUpdateCacheMaxAgeSeconds, os2.a(this.rateLimitCount, al.c(this._rateLimitPeriodSeconds, uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(ru3.c(ru3.c(ru3.c(ru3.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.locale), 31, this.helpCenterLocale), 31, this.launcherLogoUrl), 31, this.teamGreeting), this.isFirstRequest, 31), this.isInboundMessages, 31), this.isAudioEnabled, 31), this.isMetricsEnabled, 31), this.isBackgroundRequestsEnabled, 31), this.isPrimaryColorRenderDarkText, 31), this.isSecondaryColorRenderDarkText, 31), 31), 31), 31), 31), 31)) * 31, 31, this.helpCenterUrl)) * 31)) * 31, this.identityVerificationEnabled, 31), this.accessToTeammateEnabled, 31), this.helpCenterRequireSearch, 31), this.preventMultipleInboundConversationsEnabled, 31), this.hasOpenConversations, 31);
        ConfigModules configModules = this.modules;
        int iA2 = uo2.a((this.conversationStateSyncSettings.hashCode() + uo2.a((this.attachmentSettings.hashCode() + ((iA + (configModules == null ? 0 : configModules.hashCode())) * 31)) * 31, this.isArticleAutoReactionEnabled, 31)) * 31, this.askUsersToAllowNotifications, 31);
        CrashReportingConfig crashReportingConfig = this.crashReportingConfig;
        return iA2 + (crashReportingConfig != null ? crashReportingConfig.hashCode() : 0);
    }

    public final boolean isArticleAutoReactionEnabled() {
        return this.isArticleAutoReactionEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public String toString() {
        return "Config(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isFirstRequest=" + this.isFirstRequest + ", isInboundMessages=" + this.isInboundMessages + ", isAudioEnabled=" + this.isAudioEnabled + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", _rateLimitPeriodSeconds=" + this._rateLimitPeriodSeconds + ", rateLimitCount=" + this.rateLimitCount + ", _userUpdateCacheMaxAgeSeconds=" + this._userUpdateCacheMaxAgeSeconds + ", _softResetTimeoutSeconds=" + this._softResetTimeoutSeconds + ", _newSessionThresholdSeconds=" + this._newSessionThresholdSeconds + ", _realTimeConfigBuilder=" + this._realTimeConfigBuilder + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", identityVerificationEnabled=" + this.identityVerificationEnabled + ", accessToTeammateEnabled=" + this.accessToTeammateEnabled + ", helpCenterRequireSearch=" + this.helpCenterRequireSearch + ", preventMultipleInboundConversationsEnabled=" + this.preventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", modules=" + this.modules + ", attachmentSettings=" + this.attachmentSettings + ", isArticleAutoReactionEnabled=" + this.isArticleAutoReactionEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ", askUsersToAllowNotifications=" + this.askUsersToAllowNotifications + ", crashReportingConfig=" + this.crashReportingConfig + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Config getNULL() {
            return Config.NULL;
        }

        private Companion() {
        }
    }

    public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, int i, long j2, long j3, long j4, NexusConfig.Builder builder, String str8, Set<String> set, Set<String> set2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, CrashReportingConfig crashReportingConfig) {
        str.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        builder.getClass();
        str8.getClass();
        set.getClass();
        set2.getClass();
        attachmentSettings.getClass();
        conversationStateSyncSettings.getClass();
        this.name = str;
        this.primaryColor = str2;
        this.secondaryColor = str3;
        this.locale = str4;
        this.helpCenterLocale = str5;
        this.launcherLogoUrl = str6;
        this.teamGreeting = str7;
        this.isFirstRequest = z;
        this.isInboundMessages = z2;
        this.isAudioEnabled = z3;
        this.isMetricsEnabled = z4;
        this.isBackgroundRequestsEnabled = z5;
        this.isPrimaryColorRenderDarkText = z6;
        this.isSecondaryColorRenderDarkText = z7;
        this._rateLimitPeriodSeconds = j;
        this.rateLimitCount = i;
        this._userUpdateCacheMaxAgeSeconds = j2;
        this._softResetTimeoutSeconds = j3;
        this._newSessionThresholdSeconds = j4;
        this._realTimeConfigBuilder = builder;
        this.helpCenterUrl = str8;
        this.helpCenterUrls = set;
        this.features = set2;
        this.identityVerificationEnabled = z8;
        this.accessToTeammateEnabled = z9;
        this.helpCenterRequireSearch = z10;
        this.preventMultipleInboundConversationsEnabled = z11;
        this.hasOpenConversations = z12;
        this.modules = configModules;
        this.attachmentSettings = attachmentSettings;
        this.isArticleAutoReactionEnabled = z13;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
        this.askUsersToAllowNotifications = z14;
        this.crashReportingConfig = crashReportingConfig;
    }

    public Config() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0L, 0, 0L, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, false, null, false, null, -1, 3, null);
    }
}
