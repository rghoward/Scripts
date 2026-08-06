package io.intercom.android.sdk.helpcenter.component;

import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeammateHelpKt {
    public static final ArticleViewState.TeamPresenceState computeViewState(ArticleMetadata articleMetadata, ArticleViewState.TeamPresenceState teamPresenceState, AppConfig appConfig, String str, boolean z) {
        teamPresenceState.getClass();
        appConfig.getClass();
        str.getClass();
        return ArticleViewState.TeamPresenceState.copy$default(teamPresenceState, articleMetadata, null, null, 0, 0, appConfig.getPrimaryColor(), str, appConfig.isAccessToTeammateEnabled() ? MetricTracker.Context.STYLE_HUMAN : MetricTracker.Context.STYLE_BOT, z, null, 542, null);
    }
}
