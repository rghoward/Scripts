package io.intercom.android.sdk.m5.home.data;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class HomeCards {
    public static final int $stable = 0;

    @SerializedName("card_title")
    private final String cardTitle;

    @SerializedName("type")
    private final HomeCardType type;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeExternalLinkData extends HomeCards {
        public static final int $stable = 8;

        @SerializedName("links")
        private final List<Link> links;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeExternalLinkData(String str, HomeCardType homeCardType, List<Link> list) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            list.getClass();
            this.links = list;
        }

        public final List<Link> getLinks() {
            return this.links;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeHelpCenterData extends HomeCards {
        public static final int $stable = 8;

        @SerializedName("suggested_articles")
        private final List<SuggestedArticle> suggestedArticles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeHelpCenterData(String str, HomeCardType homeCardType, List<SuggestedArticle> list) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            list.getClass();
            this.suggestedArticles = list;
        }

        public final List<SuggestedArticle> getSuggestedArticles() {
            return this.suggestedArticles;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeMessengerAppData extends HomeCards {
        public static final int $stable = 0;

        @SerializedName("fallback_url")
        private final String fallbackUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeMessengerAppData(String str, HomeCardType homeCardType, String str2) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            str2.getClass();
            this.fallbackUrl = str2;
        }

        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeNewConversationData extends HomeCards {
        public static final int $stable = 8;

        @SerializedName("action")
        private final Action action;
        private final OpenMessengerResponse.NewConversationData.HomeCard homeCard;

        @SerializedName("open_inbound_conversation_ids")
        private final List<String> openInboundConversationsIds;

        @SerializedName("prevent_multiple_inbound_conversations_enabled")
        private final boolean preventMultipleInboundConversationsEnabled;

        @SerializedName("show_fin_avatar")
        private final boolean showFinAvatar;

        @SerializedName("show_teammate_expectations")
        private final boolean showTeammateExpectations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeNewConversationData(String str, HomeCardType homeCardType, Action action, boolean z, List<String> list, boolean z2, boolean z3, OpenMessengerResponse.NewConversationData.HomeCard homeCard) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            action.getClass();
            list.getClass();
            this.action = action;
            this.preventMultipleInboundConversationsEnabled = z;
            this.openInboundConversationsIds = list;
            this.showFinAvatar = z2;
            this.showTeammateExpectations = z3;
            this.homeCard = homeCard;
        }

        public final Action getAction() {
            return this.action;
        }

        public final OpenMessengerResponse.NewConversationData.HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<String> getOpenInboundConversationsIds() {
            return this.openInboundConversationsIds;
        }

        public final boolean getPreventMultipleInboundConversationsEnabled() {
            return this.preventMultipleInboundConversationsEnabled;
        }

        public final boolean getShowFinAvatar() {
            return this.showFinAvatar;
        }

        public final boolean getShowTeammateExpectations() {
            return this.showTeammateExpectations;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeRecentConversationData extends HomeCards {
        public static final int $stable = 8;

        @SerializedName("conversations")
        private final List<Conversation> conversations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeRecentConversationData(String str, HomeCardType homeCardType, List<Conversation> list) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            list.getClass();
            this.conversations = list;
        }

        public final List<Conversation> getConversations() {
            return this.conversations;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeRecentTicketsData extends HomeCards {
        public static final int $stable = 8;

        @SerializedName("tickets")
        private final List<Ticket> tickets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeRecentTicketsData(String str, HomeCardType homeCardType, List<Ticket> list) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            list.getClass();
            this.tickets = list;
        }

        public final List<Ticket> getTickets() {
            return this.tickets;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeSpacesData extends HomeCards {
        public static final int $stable = 8;

        @SerializedName("space_items")
        private final List<SpaceItem> spaceItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeSpacesData(String str, HomeCardType homeCardType, List<SpaceItem> list) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            list.getClass();
            this.spaceItems = list;
        }

        public final List<SpaceItem> getSpaceItems() {
            return this.spaceItems;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class UnSupported extends HomeCards {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnSupported(String str, HomeCardType homeCardType) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
        }
    }

    public HomeCards(String str, HomeCardType homeCardType) {
        str.getClass();
        homeCardType.getClass();
        this.cardTitle = str;
        this.type = homeCardType;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final HomeCardType getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeTicketLinksData extends HomeCards {
        public static final int $stable = 8;

        @SerializedName("links")
        private final List<TicketLink> links;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeTicketLinksData(String str, HomeCardType homeCardType, List<TicketLink> list) {
            super(str, homeCardType);
            str.getClass();
            homeCardType.getClass();
            list.getClass();
            this.links = list;
        }

        public final List<TicketLink> getLinks() {
            return this.links;
        }

        public /* synthetic */ HomeTicketLinksData(String str, HomeCardType homeCardType, List list, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, homeCardType, list);
        }
    }
}
