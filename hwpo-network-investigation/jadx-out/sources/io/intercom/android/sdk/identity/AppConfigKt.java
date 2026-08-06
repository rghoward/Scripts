package io.intercom.android.sdk.identity;

import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.CrashReportingConfig;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppConfigKt {
    public static final AppConfig getAppConfig(Config config, int i) {
        config.getClass();
        int configColor = getConfigColor(config.getPrimaryColor(), i);
        int configColor2 = getConfigColor(config.getSecondaryColor(), i);
        String name = config.getName();
        int iDarkenColor = ColorUtils.darkenColor(configColor2);
        boolean zIsPrimaryColorRenderDarkText = config.isPrimaryColorRenderDarkText();
        boolean zIsSecondaryColorRenderDarkText = config.isSecondaryColorRenderDarkText();
        boolean zIsInboundMessages = config.isInboundMessages();
        int rateLimitCount = config.getRateLimitCount();
        long rateLimitPeriod = config.getRateLimitPeriod();
        long userUpdateCacheMaxAge = config.getUserUpdateCacheMaxAge();
        long newSessionThreshold = config.getNewSessionThreshold();
        long softResetTimeout = config.getSoftResetTimeout();
        boolean zIsMetricsEnabled = config.isMetricsEnabled();
        boolean zIsAudioEnabled = config.isAudioEnabled();
        String locale = config.getLocale();
        String helpCenterLocale = config.getHelpCenterLocale();
        boolean zIsBackgroundRequestsEnabled = config.isBackgroundRequestsEnabled();
        String helpCenterUrl = config.getHelpCenterUrl();
        Set<String> helpCenterUrls = config.getHelpCenterUrls();
        Set<String> features = config.getFeatures();
        String launcherLogoUrl = config.getLauncherLogoUrl();
        String teamGreeting = config.getTeamGreeting();
        boolean identityVerificationEnabled = config.getIdentityVerificationEnabled();
        boolean accessToTeammateEnabled = config.getAccessToTeammateEnabled();
        boolean helpCenterRequireSearch = config.getHelpCenterRequireSearch();
        boolean preventMultipleInboundConversationsEnabled = config.getPreventMultipleInboundConversationsEnabled();
        boolean hasOpenConversations = config.getHasOpenConversations();
        ConfigModules modules = config.getModules();
        NexusConfig realTimeConfig = config.getRealTimeConfig();
        AttachmentSettings attachmentSettings = config.getAttachmentSettings();
        boolean zIsArticleAutoReactionEnabled = config.isArticleAutoReactionEnabled();
        ConversationStateSyncSettings conversationStateSyncSettings = config.getConversationStateSyncSettings();
        boolean askUsersToAllowNotifications = config.getAskUsersToAllowNotifications();
        CrashReportingConfig crashReportingConfig = config.getCrashReportingConfig();
        return new AppConfig(name, configColor, configColor2, iDarkenColor, zIsPrimaryColorRenderDarkText, zIsSecondaryColorRenderDarkText, zIsInboundMessages, rateLimitCount, rateLimitPeriod, userUpdateCacheMaxAge, newSessionThreshold, softResetTimeout, zIsMetricsEnabled, zIsAudioEnabled, locale, helpCenterLocale, true, zIsBackgroundRequestsEnabled, helpCenterUrl, helpCenterUrls, features, launcherLogoUrl, teamGreeting, identityVerificationEnabled, accessToTeammateEnabled, helpCenterRequireSearch, preventMultipleInboundConversationsEnabled, hasOpenConversations, modules, realTimeConfig, attachmentSettings, zIsArticleAutoReactionEnabled, conversationStateSyncSettings, askUsersToAllowNotifications, crashReportingConfig != null ? crashReportingConfig.getEnabled() : true);
    }

    private static final int getConfigColor(String str, int i) {
        return str == null ? i : ColorUtils.parseColor(str);
    }
}
