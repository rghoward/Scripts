package io.intercom.android.sdk.helpcenter.articles;

import defpackage.e44;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.os2;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ArticleViewState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content extends ArticleViewState {
        public static final int $stable = 0;
        private final ArticleMetadata articleMetadata;
        private final String articleUrl;
        private final ReactionState reactionState;
        private final TeamPresenceState teamPresenceState;
        private final WebViewStatus webViewStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState) {
            super(null);
            str.getClass();
            webViewStatus.getClass();
            reactionState.getClass();
            teamPresenceState.getClass();
            this.articleUrl = str;
            this.articleMetadata = articleMetadata;
            this.webViewStatus = webViewStatus;
            this.reactionState = reactionState;
            this.teamPresenceState = teamPresenceState;
        }

        public static /* synthetic */ Content copy$default(Content content, String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.articleUrl;
            }
            if ((i & 2) != 0) {
                articleMetadata = content.articleMetadata;
            }
            if ((i & 4) != 0) {
                webViewStatus = content.webViewStatus;
            }
            if ((i & 8) != 0) {
                reactionState = content.reactionState;
            }
            if ((i & 16) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            WebViewStatus webViewStatus2 = webViewStatus;
            return content.copy(str, articleMetadata, webViewStatus2, reactionState, teamPresenceState2);
        }

        public final String component1() {
            return this.articleUrl;
        }

        public final ArticleMetadata component2() {
            return this.articleMetadata;
        }

        public final WebViewStatus component3() {
            return this.webViewStatus;
        }

        public final ReactionState component4() {
            return this.reactionState;
        }

        public final TeamPresenceState component5() {
            return this.teamPresenceState;
        }

        public final Content copy(String str, ArticleMetadata articleMetadata, WebViewStatus webViewStatus, ReactionState reactionState, TeamPresenceState teamPresenceState) {
            str.getClass();
            webViewStatus.getClass();
            reactionState.getClass();
            teamPresenceState.getClass();
            return new Content(str, articleMetadata, webViewStatus, reactionState, teamPresenceState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return xj5.a(this.articleUrl, content.articleUrl) && xj5.a(this.articleMetadata, content.articleMetadata) && this.webViewStatus == content.webViewStatus && xj5.a(this.reactionState, content.reactionState) && xj5.a(this.teamPresenceState, content.teamPresenceState);
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final String getArticleUrl() {
            return this.articleUrl;
        }

        public final ReactionState getReactionState() {
            return this.reactionState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        public final WebViewStatus getWebViewStatus() {
            return this.webViewStatus;
        }

        public int hashCode() {
            int iHashCode = this.articleUrl.hashCode() * 31;
            ArticleMetadata articleMetadata = this.articleMetadata;
            return this.teamPresenceState.hashCode() + ((this.reactionState.hashCode() + ((this.webViewStatus.hashCode() + ((iHashCode + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Content(articleUrl=" + this.articleUrl + ", articleMetadata=" + this.articleMetadata + ", webViewStatus=" + this.webViewStatus + ", reactionState=" + this.reactionState + ", teamPresenceState=" + this.teamPresenceState + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends ArticleViewState {
        public static final int $stable = 0;
        private final int message;
        private final int retryButtonPrimaryColor;
        private final int retryButtonVisibility;

        public Error(int i, int i2, int i3) {
            super(null);
            this.message = i;
            this.retryButtonVisibility = i2;
            this.retryButtonPrimaryColor = i3;
        }

        public static /* synthetic */ Error copy$default(Error error, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = error.message;
            }
            if ((i4 & 2) != 0) {
                i2 = error.retryButtonVisibility;
            }
            if ((i4 & 4) != 0) {
                i3 = error.retryButtonPrimaryColor;
            }
            return error.copy(i, i2, i3);
        }

        public final int component1() {
            return this.message;
        }

        public final int component2() {
            return this.retryButtonVisibility;
        }

        public final int component3() {
            return this.retryButtonPrimaryColor;
        }

        public final Error copy(int i, int i2, int i3) {
            return new Error(i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.message == error.message && this.retryButtonVisibility == error.retryButtonVisibility && this.retryButtonPrimaryColor == error.retryButtonPrimaryColor;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getRetryButtonPrimaryColor() {
            return this.retryButtonPrimaryColor;
        }

        public final int getRetryButtonVisibility() {
            return this.retryButtonVisibility;
        }

        public int hashCode() {
            return Integer.hashCode(this.retryButtonPrimaryColor) + os2.a(this.retryButtonVisibility, Integer.hashCode(this.message) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(message=");
            sb.append(this.message);
            sb.append(", retryButtonVisibility=");
            sb.append(this.retryButtonVisibility);
            sb.append(", retryButtonPrimaryColor=");
            return e44.a(sb, this.retryButtonPrimaryColor, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Initial extends ArticleViewState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Reaction {
        None,
        Sad,
        Neutral,
        Happy;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<Reaction> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum WebViewStatus {
        Idle,
        Loading,
        Ready;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<WebViewStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ ArticleViewState(qq2 qq2Var) {
        this();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ReactionState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final ReactionState defaultReactionState = new ReactionState(8, null, 8, false, 2, null);
        private final int reactionComponentVisibility;
        private final Reaction selectedReaction;
        private final boolean shouldScrollToBottom;
        private final int teamHelpVisibility;

        public ReactionState(int i, Reaction reaction, int i2, boolean z) {
            reaction.getClass();
            this.reactionComponentVisibility = i;
            this.selectedReaction = reaction;
            this.teamHelpVisibility = i2;
            this.shouldScrollToBottom = z;
        }

        public static /* synthetic */ ReactionState copy$default(ReactionState reactionState, int i, Reaction reaction, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = reactionState.reactionComponentVisibility;
            }
            if ((i3 & 2) != 0) {
                reaction = reactionState.selectedReaction;
            }
            if ((i3 & 4) != 0) {
                i2 = reactionState.teamHelpVisibility;
            }
            if ((i3 & 8) != 0) {
                z = reactionState.shouldScrollToBottom;
            }
            return reactionState.copy(i, reaction, i2, z);
        }

        public final int component1() {
            return this.reactionComponentVisibility;
        }

        public final Reaction component2() {
            return this.selectedReaction;
        }

        public final int component3() {
            return this.teamHelpVisibility;
        }

        public final boolean component4() {
            return this.shouldScrollToBottom;
        }

        public final ReactionState copy(int i, Reaction reaction, int i2, boolean z) {
            reaction.getClass();
            return new ReactionState(i, reaction, i2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReactionState)) {
                return false;
            }
            ReactionState reactionState = (ReactionState) obj;
            return this.reactionComponentVisibility == reactionState.reactionComponentVisibility && this.selectedReaction == reactionState.selectedReaction && this.teamHelpVisibility == reactionState.teamHelpVisibility && this.shouldScrollToBottom == reactionState.shouldScrollToBottom;
        }

        public final int getReactionComponentVisibility() {
            return this.reactionComponentVisibility;
        }

        public final Reaction getSelectedReaction() {
            return this.selectedReaction;
        }

        public final boolean getShouldScrollToBottom() {
            return this.shouldScrollToBottom;
        }

        public final int getTeamHelpVisibility() {
            return this.teamHelpVisibility;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldScrollToBottom) + os2.a(this.teamHelpVisibility, (this.selectedReaction.hashCode() + (Integer.hashCode(this.reactionComponentVisibility) * 31)) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ReactionState(reactionComponentVisibility=");
            sb.append(this.reactionComponentVisibility);
            sb.append(", selectedReaction=");
            sb.append(this.selectedReaction);
            sb.append(", teamHelpVisibility=");
            sb.append(this.teamHelpVisibility);
            sb.append(", shouldScrollToBottom=");
            return pi1.a(sb, this.shouldScrollToBottom, ')');
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            public /* synthetic */ Companion(qq2 qq2Var) {
                this();
            }

            public final ReactionState getDefaultReactionState() {
                return ReactionState.defaultReactionState;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ReactionState(int i, Reaction reaction, int i2, boolean z, int i3, qq2 qq2Var) {
            this(i, (i3 & 2) != 0 ? Reaction.None : reaction, i2, z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TeamPresenceState {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final TeamPresenceState defaultTeamPresenceState;
        private final ArticleMetadata articleMetadata;
        private final ConversationState conversationState;
        private final OpenMessengerResponse.NewConversationData.Cta ctaData;
        private final boolean isFromSearchBrowse;
        private final int messageButtonColor;
        private final int messageButtonIcon;
        private final int messageButtonText;
        private final String metricContext;
        private final String metricPlace;
        private final Integer subtitleText;

        static {
            ArticleMetadata articleMetadata = null;
            ConversationState conversationState = null;
            defaultTeamPresenceState = new TeamPresenceState(articleMetadata, conversationState, Integer.valueOf(R.string.intercom_the_team_can_help_if_needed), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, null, 512, null);
        }

        public /* synthetic */ TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z, OpenMessengerResponse.NewConversationData.Cta cta, int i4, qq2 qq2Var) {
            this(articleMetadata, conversationState, num, i, i2, i3, str, str2, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? null : cta);
        }

        public static /* synthetic */ TeamPresenceState copy$default(TeamPresenceState teamPresenceState, ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z, OpenMessengerResponse.NewConversationData.Cta cta, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                articleMetadata = teamPresenceState.articleMetadata;
            }
            if ((i4 & 2) != 0) {
                conversationState = teamPresenceState.conversationState;
            }
            if ((i4 & 4) != 0) {
                num = teamPresenceState.subtitleText;
            }
            if ((i4 & 8) != 0) {
                i = teamPresenceState.messageButtonText;
            }
            if ((i4 & 16) != 0) {
                i2 = teamPresenceState.messageButtonIcon;
            }
            if ((i4 & 32) != 0) {
                i3 = teamPresenceState.messageButtonColor;
            }
            if ((i4 & 64) != 0) {
                str = teamPresenceState.metricPlace;
            }
            if ((i4 & 128) != 0) {
                str2 = teamPresenceState.metricContext;
            }
            if ((i4 & 256) != 0) {
                z = teamPresenceState.isFromSearchBrowse;
            }
            if ((i4 & 512) != 0) {
                cta = teamPresenceState.ctaData;
            }
            boolean z2 = z;
            OpenMessengerResponse.NewConversationData.Cta cta2 = cta;
            String str3 = str;
            String str4 = str2;
            int i5 = i2;
            int i6 = i3;
            return teamPresenceState.copy(articleMetadata, conversationState, num, i, i5, i6, str3, str4, z2, cta2);
        }

        public final ArticleMetadata component1() {
            return this.articleMetadata;
        }

        public final OpenMessengerResponse.NewConversationData.Cta component10() {
            return this.ctaData;
        }

        public final ConversationState component2() {
            return this.conversationState;
        }

        public final Integer component3() {
            return this.subtitleText;
        }

        public final int component4() {
            return this.messageButtonText;
        }

        public final int component5() {
            return this.messageButtonIcon;
        }

        public final int component6() {
            return this.messageButtonColor;
        }

        public final String component7() {
            return this.metricPlace;
        }

        public final String component8() {
            return this.metricContext;
        }

        public final boolean component9() {
            return this.isFromSearchBrowse;
        }

        public final TeamPresenceState copy(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z, OpenMessengerResponse.NewConversationData.Cta cta) {
            str.getClass();
            str2.getClass();
            return new TeamPresenceState(articleMetadata, conversationState, num, i, i2, i3, str, str2, z, cta);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TeamPresenceState)) {
                return false;
            }
            TeamPresenceState teamPresenceState = (TeamPresenceState) obj;
            return xj5.a(this.articleMetadata, teamPresenceState.articleMetadata) && xj5.a(this.conversationState, teamPresenceState.conversationState) && xj5.a(this.subtitleText, teamPresenceState.subtitleText) && this.messageButtonText == teamPresenceState.messageButtonText && this.messageButtonIcon == teamPresenceState.messageButtonIcon && this.messageButtonColor == teamPresenceState.messageButtonColor && xj5.a(this.metricPlace, teamPresenceState.metricPlace) && xj5.a(this.metricContext, teamPresenceState.metricContext) && this.isFromSearchBrowse == teamPresenceState.isFromSearchBrowse && xj5.a(this.ctaData, teamPresenceState.ctaData);
        }

        public final ArticleMetadata getArticleMetadata() {
            return this.articleMetadata;
        }

        public final ConversationState getConversationState() {
            return this.conversationState;
        }

        public final OpenMessengerResponse.NewConversationData.Cta getCtaData() {
            return this.ctaData;
        }

        public final int getMessageButtonColor() {
            return this.messageButtonColor;
        }

        public final int getMessageButtonIcon() {
            return this.messageButtonIcon;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public final String getMetricContext() {
            return this.metricContext;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final Integer getSubtitleText() {
            return this.subtitleText;
        }

        public int hashCode() {
            ArticleMetadata articleMetadata = this.articleMetadata;
            int iHashCode = (articleMetadata == null ? 0 : articleMetadata.hashCode()) * 31;
            ConversationState conversationState = this.conversationState;
            int iHashCode2 = (iHashCode + (conversationState == null ? 0 : conversationState.hashCode())) * 31;
            Integer num = this.subtitleText;
            int iA = uo2.a(ru3.c(ru3.c(os2.a(this.messageButtonColor, os2.a(this.messageButtonIcon, os2.a(this.messageButtonText, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31, this.metricPlace), 31, this.metricContext), this.isFromSearchBrowse, 31);
            OpenMessengerResponse.NewConversationData.Cta cta = this.ctaData;
            return iA + (cta != null ? cta.hashCode() : 0);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return "TeamPresenceState(articleMetadata=" + this.articleMetadata + ", conversationState=" + this.conversationState + ", subtitleText=" + this.subtitleText + ", messageButtonText=" + this.messageButtonText + ", messageButtonIcon=" + this.messageButtonIcon + ", messageButtonColor=" + this.messageButtonColor + ", metricPlace=" + this.metricPlace + ", metricContext=" + this.metricContext + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", ctaData=" + this.ctaData + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Companion {
            public /* synthetic */ Companion(qq2 qq2Var) {
                this();
            }

            public final TeamPresenceState getDefaultTeamPresenceState() {
                return TeamPresenceState.defaultTeamPresenceState;
            }

            private Companion() {
            }
        }

        public TeamPresenceState(ArticleMetadata articleMetadata, ConversationState conversationState, Integer num, int i, int i2, int i3, String str, String str2, boolean z, OpenMessengerResponse.NewConversationData.Cta cta) {
            str.getClass();
            str2.getClass();
            this.articleMetadata = articleMetadata;
            this.conversationState = conversationState;
            this.subtitleText = num;
            this.messageButtonText = i;
            this.messageButtonIcon = i2;
            this.messageButtonColor = i3;
            this.metricPlace = str;
            this.metricContext = str2;
            this.isFromSearchBrowse = z;
            this.ctaData = cta;
        }
    }

    private ArticleViewState() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ConversationState {
        public static final int $stable = 0;
        private final String conversationId;
        private final int messageButtonText;

        public ConversationState(String str, int i) {
            str.getClass();
            this.conversationId = str;
            this.messageButtonText = i;
        }

        public static /* synthetic */ ConversationState copy$default(ConversationState conversationState, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = conversationState.conversationId;
            }
            if ((i2 & 2) != 0) {
                i = conversationState.messageButtonText;
            }
            return conversationState.copy(str, i);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final int component2() {
            return this.messageButtonText;
        }

        public final ConversationState copy(String str, int i) {
            str.getClass();
            return new ConversationState(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationState)) {
                return false;
            }
            ConversationState conversationState = (ConversationState) obj;
            return xj5.a(this.conversationId, conversationState.conversationId) && this.messageButtonText == conversationState.messageButtonText;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final int getMessageButtonText() {
            return this.messageButtonText;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageButtonText) + (this.conversationId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConversationState(conversationId=");
            sb.append(this.conversationId);
            sb.append(", messageButtonText=");
            return e44.a(sb, this.messageButtonText, ')');
        }

        public /* synthetic */ ConversationState(String str, int i, int i2, qq2 qq2Var) {
            this(str, (i2 & 2) != 0 ? R.string.intercom_continue_the_conversation : i);
        }
    }
}
