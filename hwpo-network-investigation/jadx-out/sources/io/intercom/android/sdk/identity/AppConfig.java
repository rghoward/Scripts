package io.intercom.android.sdk.identity;

import defpackage.al;
import defpackage.gy2;
import defpackage.os2;
import defpackage.pi1;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppConfig {
    public static final int $stable = 8;
    private final boolean articleAutoReactionEnabled;
    private final boolean askUsersToAllowNotifications;
    private final AttachmentSettings attachmentSettings;
    private final ConfigModules configModules;
    private final ConversationStateSyncSettings conversationStateSyncSettings;
    private final Set<String> features;
    private final boolean hasOpenConversations;
    private final String helpCenterLocale;
    private final String helpCenterUrl;
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isCrashReportingEnabled;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;
    private final String launcherLogoUrl;
    private final String locale;
    private final String name;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final long softResetTimeoutMs;
    private final String teamGreeting;
    private final long userUpdateCacheMaxAgeMs;

    public AppConfig(String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, long j, long j2, long j3, long j4, boolean z4, boolean z5, String str2, String str3, boolean z6, boolean z7, String str4, Set<String> set, Set<String> set2, String str5, String str6, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        set.getClass();
        set2.getClass();
        str5.getClass();
        str6.getClass();
        nexusConfig.getClass();
        attachmentSettings.getClass();
        conversationStateSyncSettings.getClass();
        this.name = str;
        this.primaryColor = i;
        this.secondaryColor = i2;
        this.secondaryColorDark = i3;
        this.isPrimaryColorRenderDarkText = z;
        this.isSecondaryColorRenderDarkText = z2;
        this.isInboundMessages = z3;
        this.rateLimitCount = i4;
        this.rateLimitPeriodMs = j;
        this.userUpdateCacheMaxAgeMs = j2;
        this.newSessionThresholdMs = j3;
        this.softResetTimeoutMs = j4;
        this.isMetricsEnabled = z4;
        this.isAudioEnabled = z5;
        this.locale = str2;
        this.helpCenterLocale = str3;
        this.isReceivedFromServer = z6;
        this.isBackgroundRequestsEnabled = z7;
        this.helpCenterUrl = str4;
        this.helpCenterUrls = set;
        this.features = set2;
        this.launcherLogoUrl = str5;
        this.teamGreeting = str6;
        this.isIdentityVerificationEnabled = z8;
        this.isAccessToTeammateEnabled = z9;
        this.isHelpCenterRequireSearchEnabled = z10;
        this.isPreventMultipleInboundConversationsEnabled = z11;
        this.hasOpenConversations = z12;
        this.configModules = configModules;
        this.realTimeConfig = nexusConfig;
        this.attachmentSettings = attachmentSettings;
        this.articleAutoReactionEnabled = z13;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
        this.askUsersToAllowNotifications = z14;
        this.isCrashReportingEnabled = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, long j, long j2, long j3, long j4, boolean z4, boolean z5, String str2, String str3, boolean z6, boolean z7, String str4, Set set, Set set2, String str5, String str6, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, boolean z15, int i5, int i6, Object obj) {
        boolean z16;
        boolean z17;
        String str7 = (i5 & 1) != 0 ? appConfig.name : str;
        int i7 = (i5 & 2) != 0 ? appConfig.primaryColor : i;
        int i8 = (i5 & 4) != 0 ? appConfig.secondaryColor : i2;
        int i9 = (i5 & 8) != 0 ? appConfig.secondaryColorDark : i3;
        boolean z18 = (i5 & 16) != 0 ? appConfig.isPrimaryColorRenderDarkText : z;
        boolean z19 = (i5 & 32) != 0 ? appConfig.isSecondaryColorRenderDarkText : z2;
        boolean z20 = (i5 & 64) != 0 ? appConfig.isInboundMessages : z3;
        int i10 = (i5 & 128) != 0 ? appConfig.rateLimitCount : i4;
        long j5 = (i5 & 256) != 0 ? appConfig.rateLimitPeriodMs : j;
        long j6 = (i5 & 512) != 0 ? appConfig.userUpdateCacheMaxAgeMs : j2;
        long j7 = (i5 & 1024) != 0 ? appConfig.newSessionThresholdMs : j3;
        String str8 = str7;
        int i11 = i7;
        long j8 = (i5 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? appConfig.softResetTimeoutMs : j4;
        boolean z21 = (i5 & 4096) != 0 ? appConfig.isMetricsEnabled : z4;
        boolean z22 = (i5 & 8192) != 0 ? appConfig.isAudioEnabled : z5;
        boolean z23 = z21;
        String str9 = (i5 & 16384) != 0 ? appConfig.locale : str2;
        String str10 = (i5 & 32768) != 0 ? appConfig.helpCenterLocale : str3;
        boolean z24 = (i5 & 65536) != 0 ? appConfig.isReceivedFromServer : z6;
        boolean z25 = (i5 & 131072) != 0 ? appConfig.isBackgroundRequestsEnabled : z7;
        String str11 = (i5 & 262144) != 0 ? appConfig.helpCenterUrl : str4;
        Set set3 = (i5 & 524288) != 0 ? appConfig.helpCenterUrls : set;
        Set set4 = (i5 & 1048576) != 0 ? appConfig.features : set2;
        String str12 = (i5 & 2097152) != 0 ? appConfig.launcherLogoUrl : str5;
        String str13 = (i5 & 4194304) != 0 ? appConfig.teamGreeting : str6;
        boolean z26 = (i5 & 8388608) != 0 ? appConfig.isIdentityVerificationEnabled : z8;
        boolean z27 = (i5 & 16777216) != 0 ? appConfig.isAccessToTeammateEnabled : z9;
        boolean z28 = (i5 & 33554432) != 0 ? appConfig.isHelpCenterRequireSearchEnabled : z10;
        boolean z29 = (i5 & 67108864) != 0 ? appConfig.isPreventMultipleInboundConversationsEnabled : z11;
        boolean z30 = (i5 & 134217728) != 0 ? appConfig.hasOpenConversations : z12;
        ConfigModules configModules2 = (i5 & 268435456) != 0 ? appConfig.configModules : configModules;
        NexusConfig nexusConfig2 = (i5 & 536870912) != 0 ? appConfig.realTimeConfig : nexusConfig;
        AttachmentSettings attachmentSettings2 = (i5 & 1073741824) != 0 ? appConfig.attachmentSettings : attachmentSettings;
        boolean z31 = (i5 & Integer.MIN_VALUE) != 0 ? appConfig.articleAutoReactionEnabled : z13;
        ConversationStateSyncSettings conversationStateSyncSettings2 = (i6 & 1) != 0 ? appConfig.conversationStateSyncSettings : conversationStateSyncSettings;
        boolean z32 = (i6 & 2) != 0 ? appConfig.askUsersToAllowNotifications : z14;
        if ((i6 & 4) != 0) {
            z17 = z32;
            z16 = appConfig.isCrashReportingEnabled;
        } else {
            z16 = z15;
            z17 = z32;
        }
        return appConfig.copy(str8, i11, i8, i9, z18, z19, z20, i10, j5, j6, j7, j8, z23, z22, str9, str10, z24, z25, str11, set3, set4, str12, str13, z26, z27, z28, z29, z30, configModules2, nexusConfig2, attachmentSettings2, z31, conversationStateSyncSettings2, z17, z16);
    }

    public final String component1() {
        return this.name;
    }

    public final long component10() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final long component11() {
        return this.newSessionThresholdMs;
    }

    public final long component12() {
        return this.softResetTimeoutMs;
    }

    public final boolean component13() {
        return this.isMetricsEnabled;
    }

    public final boolean component14() {
        return this.isAudioEnabled;
    }

    public final String component15() {
        return this.locale;
    }

    public final String component16() {
        return this.helpCenterLocale;
    }

    public final boolean component17() {
        return this.isReceivedFromServer;
    }

    public final boolean component18() {
        return this.isBackgroundRequestsEnabled;
    }

    public final String component19() {
        return this.helpCenterUrl;
    }

    public final int component2() {
        return this.primaryColor;
    }

    public final Set<String> component20() {
        return this.helpCenterUrls;
    }

    public final Set<String> component21() {
        return this.features;
    }

    public final String component22() {
        return this.launcherLogoUrl;
    }

    public final String component23() {
        return this.teamGreeting;
    }

    public final boolean component24() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean component25() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean component27() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    public final ConfigModules component29() {
        return this.configModules;
    }

    public final int component3() {
        return this.secondaryColor;
    }

    public final NexusConfig component30() {
        return this.realTimeConfig;
    }

    public final AttachmentSettings component31() {
        return this.attachmentSettings;
    }

    public final boolean component32() {
        return this.articleAutoReactionEnabled;
    }

    public final ConversationStateSyncSettings component33() {
        return this.conversationStateSyncSettings;
    }

    public final boolean component34() {
        return this.askUsersToAllowNotifications;
    }

    public final boolean component35() {
        return this.isCrashReportingEnabled;
    }

    public final int component4() {
        return this.secondaryColorDark;
    }

    public final boolean component5() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component6() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean component7() {
        return this.isInboundMessages;
    }

    public final int component8() {
        return this.rateLimitCount;
    }

    public final long component9() {
        return this.rateLimitPeriodMs;
    }

    public final AppConfig copy(String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, long j, long j2, long j3, long j4, boolean z4, boolean z5, String str2, String str3, boolean z6, boolean z7, String str4, Set<String> set, Set<String> set2, String str5, String str6, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, ConfigModules configModules, NexusConfig nexusConfig, AttachmentSettings attachmentSettings, boolean z13, ConversationStateSyncSettings conversationStateSyncSettings, boolean z14, boolean z15) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        set.getClass();
        set2.getClass();
        str5.getClass();
        str6.getClass();
        nexusConfig.getClass();
        attachmentSettings.getClass();
        conversationStateSyncSettings.getClass();
        return new AppConfig(str, i, i2, i3, z, z2, z3, i4, j, j2, j3, j4, z4, z5, str2, str3, z6, z7, str4, set, set2, str5, str6, z8, z9, z10, z11, z12, configModules, nexusConfig, attachmentSettings, z13, conversationStateSyncSettings, z14, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) obj;
        return xj5.a(this.name, appConfig.name) && this.primaryColor == appConfig.primaryColor && this.secondaryColor == appConfig.secondaryColor && this.secondaryColorDark == appConfig.secondaryColorDark && this.isPrimaryColorRenderDarkText == appConfig.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == appConfig.isSecondaryColorRenderDarkText && this.isInboundMessages == appConfig.isInboundMessages && this.rateLimitCount == appConfig.rateLimitCount && this.rateLimitPeriodMs == appConfig.rateLimitPeriodMs && this.userUpdateCacheMaxAgeMs == appConfig.userUpdateCacheMaxAgeMs && this.newSessionThresholdMs == appConfig.newSessionThresholdMs && this.softResetTimeoutMs == appConfig.softResetTimeoutMs && this.isMetricsEnabled == appConfig.isMetricsEnabled && this.isAudioEnabled == appConfig.isAudioEnabled && xj5.a(this.locale, appConfig.locale) && xj5.a(this.helpCenterLocale, appConfig.helpCenterLocale) && this.isReceivedFromServer == appConfig.isReceivedFromServer && this.isBackgroundRequestsEnabled == appConfig.isBackgroundRequestsEnabled && xj5.a(this.helpCenterUrl, appConfig.helpCenterUrl) && xj5.a(this.helpCenterUrls, appConfig.helpCenterUrls) && xj5.a(this.features, appConfig.features) && xj5.a(this.launcherLogoUrl, appConfig.launcherLogoUrl) && xj5.a(this.teamGreeting, appConfig.teamGreeting) && this.isIdentityVerificationEnabled == appConfig.isIdentityVerificationEnabled && this.isAccessToTeammateEnabled == appConfig.isAccessToTeammateEnabled && this.isHelpCenterRequireSearchEnabled == appConfig.isHelpCenterRequireSearchEnabled && this.isPreventMultipleInboundConversationsEnabled == appConfig.isPreventMultipleInboundConversationsEnabled && this.hasOpenConversations == appConfig.hasOpenConversations && xj5.a(this.configModules, appConfig.configModules) && xj5.a(this.realTimeConfig, appConfig.realTimeConfig) && xj5.a(this.attachmentSettings, appConfig.attachmentSettings) && this.articleAutoReactionEnabled == appConfig.articleAutoReactionEnabled && xj5.a(this.conversationStateSyncSettings, appConfig.conversationStateSyncSettings) && this.askUsersToAllowNotifications == appConfig.askUsersToAllowNotifications && this.isCrashReportingEnabled == appConfig.isCrashReportingEnabled;
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    public final boolean getAskUsersToAllowNotifications() {
        return this.askUsersToAllowNotifications;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
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

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    public final String getSpaceLabelIfExists(Space.Type type) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Object next;
        type.getClass();
        ConfigModules configModules = this.configModules;
        if (configModules != null && (home = configModules.getHome()) != null && (openConfig = home.getOpenConfig()) != null && (spaces = openConfig.getSpaces()) != null) {
            Iterator<T> it = spaces.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Space) next).getType() != type);
            Space space = (Space) next;
            if (space != null) {
                return space.getLabel();
            }
        }
        return null;
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final boolean hasFeature(String str) {
        str.getClass();
        return this.features.contains(str);
    }

    public int hashCode() {
        int iA = uo2.a(uo2.a(uo2.a(uo2.a(uo2.a(ru3.c(ru3.c((this.features.hashCode() + ((this.helpCenterUrls.hashCode() + ru3.c(uo2.a(uo2.a(ru3.c(ru3.c(uo2.a(uo2.a(al.c(this.softResetTimeoutMs, al.c(this.newSessionThresholdMs, al.c(this.userUpdateCacheMaxAgeMs, al.c(this.rateLimitPeriodMs, os2.a(this.rateLimitCount, uo2.a(uo2.a(uo2.a(os2.a(this.secondaryColorDark, os2.a(this.secondaryColor, os2.a(this.primaryColor, this.name.hashCode() * 31, 31), 31), 31), this.isPrimaryColorRenderDarkText, 31), this.isSecondaryColorRenderDarkText, 31), this.isInboundMessages, 31), 31), 31), 31), 31), 31), this.isMetricsEnabled, 31), this.isAudioEnabled, 31), 31, this.locale), 31, this.helpCenterLocale), this.isReceivedFromServer, 31), this.isBackgroundRequestsEnabled, 31), 31, this.helpCenterUrl)) * 31)) * 31, 31, this.launcherLogoUrl), 31, this.teamGreeting), this.isIdentityVerificationEnabled, 31), this.isAccessToTeammateEnabled, 31), this.isHelpCenterRequireSearchEnabled, 31), this.isPreventMultipleInboundConversationsEnabled, 31), this.hasOpenConversations, 31);
        ConfigModules configModules = this.configModules;
        return Boolean.hashCode(this.isCrashReportingEnabled) + uo2.a((this.conversationStateSyncSettings.hashCode() + uo2.a((this.attachmentSettings.hashCode() + ((this.realTimeConfig.hashCode() + ((iA + (configModules == null ? 0 : configModules.hashCode())) * 31)) * 31)) * 31, this.articleAutoReactionEnabled, 31)) * 31, this.askUsersToAllowNotifications, 31);
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsDisabled() {
        return !this.isBackgroundRequestsEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isCrashReportingEnabled() {
        return this.isCrashReportingEnabled;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isSpaceEnabled(Space.Type type) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        type.getClass();
        ConfigModules configModules = this.configModules;
        if (configModules == null || (home = configModules.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (spaces = openConfig.getSpaces()) == null || spaces.isEmpty()) {
            return false;
        }
        Iterator<T> it = spaces.iterator();
        while (it.hasNext()) {
            if (((Space) it.next()).getType() == type) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppConfig(name=");
        sb.append(this.name);
        sb.append(", primaryColor=");
        sb.append(this.primaryColor);
        sb.append(", secondaryColor=");
        sb.append(this.secondaryColor);
        sb.append(", secondaryColorDark=");
        sb.append(this.secondaryColorDark);
        sb.append(", isPrimaryColorRenderDarkText=");
        sb.append(this.isPrimaryColorRenderDarkText);
        sb.append(", isSecondaryColorRenderDarkText=");
        sb.append(this.isSecondaryColorRenderDarkText);
        sb.append(", isInboundMessages=");
        sb.append(this.isInboundMessages);
        sb.append(", rateLimitCount=");
        sb.append(this.rateLimitCount);
        sb.append(", rateLimitPeriodMs=");
        sb.append(this.rateLimitPeriodMs);
        sb.append(", userUpdateCacheMaxAgeMs=");
        sb.append(this.userUpdateCacheMaxAgeMs);
        sb.append(", newSessionThresholdMs=");
        sb.append(this.newSessionThresholdMs);
        sb.append(", softResetTimeoutMs=");
        sb.append(this.softResetTimeoutMs);
        sb.append(", isMetricsEnabled=");
        sb.append(this.isMetricsEnabled);
        sb.append(", isAudioEnabled=");
        sb.append(this.isAudioEnabled);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", helpCenterLocale=");
        sb.append(this.helpCenterLocale);
        sb.append(", isReceivedFromServer=");
        sb.append(this.isReceivedFromServer);
        sb.append(", isBackgroundRequestsEnabled=");
        sb.append(this.isBackgroundRequestsEnabled);
        sb.append(", helpCenterUrl=");
        sb.append(this.helpCenterUrl);
        sb.append(", helpCenterUrls=");
        sb.append(this.helpCenterUrls);
        sb.append(", features=");
        sb.append(this.features);
        sb.append(", launcherLogoUrl=");
        sb.append(this.launcherLogoUrl);
        sb.append(", teamGreeting=");
        sb.append(this.teamGreeting);
        sb.append(", isIdentityVerificationEnabled=");
        sb.append(this.isIdentityVerificationEnabled);
        sb.append(", isAccessToTeammateEnabled=");
        sb.append(this.isAccessToTeammateEnabled);
        sb.append(", isHelpCenterRequireSearchEnabled=");
        sb.append(this.isHelpCenterRequireSearchEnabled);
        sb.append(", isPreventMultipleInboundConversationsEnabled=");
        sb.append(this.isPreventMultipleInboundConversationsEnabled);
        sb.append(", hasOpenConversations=");
        sb.append(this.hasOpenConversations);
        sb.append(", configModules=");
        sb.append(this.configModules);
        sb.append(", realTimeConfig=");
        sb.append(this.realTimeConfig);
        sb.append(", attachmentSettings=");
        sb.append(this.attachmentSettings);
        sb.append(", articleAutoReactionEnabled=");
        sb.append(this.articleAutoReactionEnabled);
        sb.append(", conversationStateSyncSettings=");
        sb.append(this.conversationStateSyncSettings);
        sb.append(", askUsersToAllowNotifications=");
        sb.append(this.askUsersToAllowNotifications);
        sb.append(", isCrashReportingEnabled=");
        return pi1.a(sb, this.isCrashReportingEnabled, ')');
    }

    @gy2
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }
}
