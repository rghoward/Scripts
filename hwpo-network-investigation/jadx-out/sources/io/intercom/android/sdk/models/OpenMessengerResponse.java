package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenMessengerResponse {
    public static final int $stable = 8;

    @SerializedName("bot_intro_id")
    private final String botIntroId;

    @SerializedName("composer_state")
    private final ComposerState composerState;

    @SerializedName(MetricTracker.Object.COMPOSER_SUGGESTIONS)
    private final ComposerSuggestions composerSuggestions;

    @SerializedName("new_conversation")
    private final NewConversationData newConversationData;

    @SerializedName("open_inbound_conversation_ids")
    private final List<String> openInboundConversations;

    @SerializedName("powered_by")
    private final PoweredBy poweredBy;

    @SerializedName("privacy_policy_notice")
    private final PrivacyNotice privacyNotice;

    @SerializedName("request_id")
    private final String requestId;

    @SerializedName("resolution_bot_behavior_version_id")
    private final String resolutionBotBehaviorVersionId;

    @SerializedName("team_presence")
    private final TeamPresence teamPresence;

    public /* synthetic */ OpenMessengerResponse(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, TeamPresence teamPresence, String str2, String str3, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : composerSuggestions, (i & 2) != 0 ? null : newConversationData, (i & 4) != 0 ? ComposerState.Companion.getNULL() : composerState, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : poweredBy, (i & 32) != 0 ? hf3.t : list, (i & 64) != 0 ? null : privacyNotice, (i & 128) != 0 ? null : teamPresence, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenMessengerResponse copy$default(OpenMessengerResponse openMessengerResponse, ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, TeamPresence teamPresence, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            composerSuggestions = openMessengerResponse.composerSuggestions;
        }
        if ((i & 2) != 0) {
            newConversationData = openMessengerResponse.newConversationData;
        }
        if ((i & 4) != 0) {
            composerState = openMessengerResponse.composerState;
        }
        if ((i & 8) != 0) {
            str = openMessengerResponse.requestId;
        }
        if ((i & 16) != 0) {
            poweredBy = openMessengerResponse.poweredBy;
        }
        if ((i & 32) != 0) {
            list = openMessengerResponse.openInboundConversations;
        }
        if ((i & 64) != 0) {
            privacyNotice = openMessengerResponse.privacyNotice;
        }
        if ((i & 128) != 0) {
            teamPresence = openMessengerResponse.teamPresence;
        }
        if ((i & 256) != 0) {
            str2 = openMessengerResponse.resolutionBotBehaviorVersionId;
        }
        if ((i & 512) != 0) {
            str3 = openMessengerResponse.botIntroId;
        }
        String str4 = str2;
        String str5 = str3;
        PrivacyNotice privacyNotice2 = privacyNotice;
        TeamPresence teamPresence2 = teamPresence;
        PoweredBy poweredBy2 = poweredBy;
        List list2 = list;
        return openMessengerResponse.copy(composerSuggestions, newConversationData, composerState, str, poweredBy2, list2, privacyNotice2, teamPresence2, str4, str5);
    }

    public final ComposerSuggestions component1() {
        return this.composerSuggestions;
    }

    public final String component10() {
        return this.botIntroId;
    }

    public final NewConversationData component2() {
        return this.newConversationData;
    }

    public final ComposerState component3() {
        return this.composerState;
    }

    public final String component4() {
        return this.requestId;
    }

    public final PoweredBy component5() {
        return this.poweredBy;
    }

    public final List<String> component6() {
        return this.openInboundConversations;
    }

    public final PrivacyNotice component7() {
        return this.privacyNotice;
    }

    public final TeamPresence component8() {
        return this.teamPresence;
    }

    public final String component9() {
        return this.resolutionBotBehaviorVersionId;
    }

    public final OpenMessengerResponse copy(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List<String> list, PrivacyNotice privacyNotice, TeamPresence teamPresence, String str2, String str3) {
        composerState.getClass();
        list.getClass();
        return new OpenMessengerResponse(composerSuggestions, newConversationData, composerState, str, poweredBy, list, privacyNotice, teamPresence, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMessengerResponse)) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        return xj5.a(this.composerSuggestions, openMessengerResponse.composerSuggestions) && xj5.a(this.newConversationData, openMessengerResponse.newConversationData) && xj5.a(this.composerState, openMessengerResponse.composerState) && xj5.a(this.requestId, openMessengerResponse.requestId) && xj5.a(this.poweredBy, openMessengerResponse.poweredBy) && xj5.a(this.openInboundConversations, openMessengerResponse.openInboundConversations) && xj5.a(this.privacyNotice, openMessengerResponse.privacyNotice) && xj5.a(this.teamPresence, openMessengerResponse.teamPresence) && xj5.a(this.resolutionBotBehaviorVersionId, openMessengerResponse.resolutionBotBehaviorVersionId) && xj5.a(this.botIntroId, openMessengerResponse.botIntroId);
    }

    public final String getBotIntroId() {
        return this.botIntroId;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    public final NewConversationData getNewConversationData() {
        return this.newConversationData;
    }

    public final List<String> getOpenInboundConversations() {
        return this.openInboundConversations;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getResolutionBotBehaviorVersionId() {
        return this.resolutionBotBehaviorVersionId;
    }

    public final TeamPresence getTeamPresence() {
        return this.teamPresence;
    }

    public int hashCode() {
        ComposerSuggestions composerSuggestions = this.composerSuggestions;
        int iHashCode = (composerSuggestions == null ? 0 : composerSuggestions.hashCode()) * 31;
        NewConversationData newConversationData = this.newConversationData;
        int iHashCode2 = (this.composerState.hashCode() + ((iHashCode + (newConversationData == null ? 0 : newConversationData.hashCode())) * 31)) * 31;
        String str = this.requestId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int iA = ho2.a((iHashCode3 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31, 31, this.openInboundConversations);
        PrivacyNotice privacyNotice = this.privacyNotice;
        int iHashCode4 = (iA + (privacyNotice == null ? 0 : privacyNotice.hashCode())) * 31;
        TeamPresence teamPresence = this.teamPresence;
        int iHashCode5 = (iHashCode4 + (teamPresence == null ? 0 : teamPresence.hashCode())) * 31;
        String str2 = this.resolutionBotBehaviorVersionId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.botIntroId;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenMessengerResponse(composerSuggestions=");
        sb.append(this.composerSuggestions);
        sb.append(", newConversationData=");
        sb.append(this.newConversationData);
        sb.append(", composerState=");
        sb.append(this.composerState);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", poweredBy=");
        sb.append(this.poweredBy);
        sb.append(", openInboundConversations=");
        sb.append(this.openInboundConversations);
        sb.append(", privacyNotice=");
        sb.append(this.privacyNotice);
        sb.append(", teamPresence=");
        sb.append(this.teamPresence);
        sb.append(", resolutionBotBehaviorVersionId=");
        sb.append(this.resolutionBotBehaviorVersionId);
        sb.append(", botIntroId=");
        return wu0.a(sb, this.botIntroId, ')');
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class IconType {
        private static final /* synthetic */ nl3 $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;

        @SerializedName("chevron")
        public static final IconType CHEVRON = new CHEVRON("CHEVRON", 0);

        @SerializedName("question_bubble")
        public static final IconType QUESTION_BUBBLE = new QUESTION_BUBBLE("QUESTION_BUBBLE", 1);

        @SerializedName("paper_plane")
        public static final IconType PAPER_PLANE = new PAPER_PLANE("PAPER_PLANE", 2);

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class CHEVRON extends IconType {
            public CHEVRON(String str, int i) {
                super(str, i, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_chevron);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class PAPER_PLANE extends IconType {
            public PAPER_PLANE(String str, int i) {
                super(str, i, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_send_message_icon);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class QUESTION_BUBBLE extends IconType {
            public QUESTION_BUBBLE(String str, int i) {
                super(str, i, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_conversation_card_question);
            }
        }

        private static final /* synthetic */ IconType[] $values() {
            return new IconType[]{CHEVRON, QUESTION_BUBBLE, PAPER_PLANE};
        }

        static {
            IconType[] iconTypeArr$values = $values();
            $VALUES = iconTypeArr$values;
            $ENTRIES = ol3.b(iconTypeArr$values);
        }

        public /* synthetic */ IconType(String str, int i, qq2 qq2Var) {
            this(str, i);
        }

        public static nl3<IconType> getEntries() {
            return $ENTRIES;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }

        public abstract Integer getIcon();

        private IconType(String str, int i) {
            super(str, i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NewConversationData {
        public static final int $stable = 8;

        @SerializedName("cta")
        private final Cta cta;

        @SerializedName("header")
        private final Header header;

        @SerializedName("home_card")
        private final HomeCard homeCard;

        @SerializedName("participants")
        private final List<Participant.Builder> participants;

        @SerializedName("parts")
        private final List<Part.Builder> parts;

        @SerializedName("special_notice")
        private final String specialNotice;

        @SerializedName("team_intro")
        private final String teamIntro;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ NewConversationData(Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i, qq2 qq2Var) {
            int i2 = i & 4;
            hf3 hf3Var = hf3.t;
            this(cta, homeCard, i2 != 0 ? hf3Var : list, (i & 8) != 0 ? hf3Var : list2, (i & 16) != 0 ? null : header, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewConversationData copy$default(NewConversationData newConversationData, Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                cta = newConversationData.cta;
            }
            if ((i & 2) != 0) {
                homeCard = newConversationData.homeCard;
            }
            if ((i & 4) != 0) {
                list = newConversationData.parts;
            }
            if ((i & 8) != 0) {
                list2 = newConversationData.participants;
            }
            if ((i & 16) != 0) {
                header = newConversationData.header;
            }
            if ((i & 32) != 0) {
                str = newConversationData.teamIntro;
            }
            if ((i & 64) != 0) {
                str2 = newConversationData.specialNotice;
            }
            String str3 = str;
            String str4 = str2;
            Header header2 = header;
            List list3 = list;
            return newConversationData.copy(cta, homeCard, list3, list2, header2, str3, str4);
        }

        public final Cta component1() {
            return this.cta;
        }

        public final HomeCard component2() {
            return this.homeCard;
        }

        public final List<Part.Builder> component3() {
            return this.parts;
        }

        public final List<Participant.Builder> component4() {
            return this.participants;
        }

        public final Header component5() {
            return this.header;
        }

        public final String component6() {
            return this.teamIntro;
        }

        public final String component7() {
            return this.specialNotice;
        }

        public final NewConversationData copy(Cta cta, HomeCard homeCard, List<Part.Builder> list, List<Participant.Builder> list2, Header header, String str, String str2) {
            cta.getClass();
            homeCard.getClass();
            list.getClass();
            list2.getClass();
            return new NewConversationData(cta, homeCard, list, list2, header, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewConversationData)) {
                return false;
            }
            NewConversationData newConversationData = (NewConversationData) obj;
            return xj5.a(this.cta, newConversationData.cta) && xj5.a(this.homeCard, newConversationData.homeCard) && xj5.a(this.parts, newConversationData.parts) && xj5.a(this.participants, newConversationData.participants) && xj5.a(this.header, newConversationData.header) && xj5.a(this.teamIntro, newConversationData.teamIntro) && xj5.a(this.specialNotice, newConversationData.specialNotice);
        }

        public final Cta getCta() {
            return this.cta;
        }

        public final Header getHeader() {
            return this.header;
        }

        public final HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final List<Part.Builder> getParts() {
            return this.parts;
        }

        public final String getSpecialNotice() {
            return this.specialNotice;
        }

        public final String getTeamIntro() {
            return this.teamIntro;
        }

        public int hashCode() {
            int iA = ho2.a(ho2.a((this.homeCard.hashCode() + (this.cta.hashCode() * 31)) * 31, 31, this.parts), 31, this.participants);
            Header header = this.header;
            int iHashCode = (iA + (header == null ? 0 : header.hashCode())) * 31;
            String str = this.teamIntro;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.specialNotice;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NewConversationData(cta=");
            sb.append(this.cta);
            sb.append(", homeCard=");
            sb.append(this.homeCard);
            sb.append(", parts=");
            sb.append(this.parts);
            sb.append(", participants=");
            sb.append(this.participants);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", teamIntro=");
            sb.append(this.teamIntro);
            sb.append(", specialNotice=");
            return wu0.a(sb, this.specialNotice, ')');
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Cta {
            public static final int $stable = 0;

            @SerializedName("icon")
            private final IconType icon;

            @SerializedName("subtitle")
            private final String subtitle;

            @SerializedName(AttributeType.TEXT)
            private final String text;

            public Cta(String str, String str2, IconType iconType) {
                str.getClass();
                iconType.getClass();
                this.text = str;
                this.subtitle = str2;
                this.icon = iconType;
            }

            public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, IconType iconType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cta.text;
                }
                if ((i & 2) != 0) {
                    str2 = cta.subtitle;
                }
                if ((i & 4) != 0) {
                    iconType = cta.icon;
                }
                return cta.copy(str, str2, iconType);
            }

            public final String component1() {
                return this.text;
            }

            public final String component2() {
                return this.subtitle;
            }

            public final IconType component3() {
                return this.icon;
            }

            public final Cta copy(String str, String str2, IconType iconType) {
                str.getClass();
                iconType.getClass();
                return new Cta(str, str2, iconType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cta)) {
                    return false;
                }
                Cta cta = (Cta) obj;
                return xj5.a(this.text, cta.text) && xj5.a(this.subtitle, cta.subtitle) && this.icon == cta.icon;
            }

            public final IconType getIcon() {
                return this.icon;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                return this.icon.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                return "Cta(text=" + this.text + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ')';
            }

            public /* synthetic */ Cta(String str, String str2, IconType iconType, int i, qq2 qq2Var) {
                this(str, (i & 2) != 0 ? null : str2, iconType);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class HomeCard {
            public static final int $stable = 8;

            @SerializedName("avatar_details")
            private final AvatarDetails avatarDetails;

            @SerializedName("icon")
            private final IconType icon;

            @SerializedName("subtitle")
            private final String subtitle;

            @SerializedName(AttributeType.TEXT)
            private final String text;

            public /* synthetic */ HomeCard(String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i, qq2 qq2Var) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : avatarDetails, (i & 8) != 0 ? null : iconType);
            }

            public static /* synthetic */ HomeCard copy$default(HomeCard homeCard, String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = homeCard.text;
                }
                if ((i & 2) != 0) {
                    str2 = homeCard.subtitle;
                }
                if ((i & 4) != 0) {
                    avatarDetails = homeCard.avatarDetails;
                }
                if ((i & 8) != 0) {
                    iconType = homeCard.icon;
                }
                return homeCard.copy(str, str2, avatarDetails, iconType);
            }

            public final String component1() {
                return this.text;
            }

            public final String component2() {
                return this.subtitle;
            }

            public final AvatarDetails component3() {
                return this.avatarDetails;
            }

            public final IconType component4() {
                return this.icon;
            }

            public final HomeCard copy(String str, String str2, AvatarDetails avatarDetails, IconType iconType) {
                str.getClass();
                return new HomeCard(str, str2, avatarDetails, iconType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HomeCard)) {
                    return false;
                }
                HomeCard homeCard = (HomeCard) obj;
                return xj5.a(this.text, homeCard.text) && xj5.a(this.subtitle, homeCard.subtitle) && xj5.a(this.avatarDetails, homeCard.avatarDetails) && this.icon == homeCard.icon;
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final IconType getIcon() {
                return this.icon;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                int iHashCode3 = (iHashCode2 + (avatarDetails == null ? 0 : avatarDetails.hashCode())) * 31;
                IconType iconType = this.icon;
                return iHashCode3 + (iconType != null ? iconType.hashCode() : 0);
            }

            public String toString() {
                return "HomeCard(text=" + this.text + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ')';
            }

            public HomeCard(String str, String str2, AvatarDetails avatarDetails, IconType iconType) {
                str.getClass();
                this.text = str;
                this.subtitle = str2;
                this.avatarDetails = avatarDetails;
                this.icon = iconType;
            }
        }

        public NewConversationData(Cta cta, HomeCard homeCard, List<Part.Builder> list, List<Participant.Builder> list2, Header header, String str, String str2) {
            cta.getClass();
            homeCard.getClass();
            list.getClass();
            list2.getClass();
            this.cta = cta;
            this.homeCard = homeCard;
            this.parts = list;
            this.participants = list2;
            this.header = header;
            this.teamIntro = str;
            this.specialNotice = str2;
        }
    }

    public OpenMessengerResponse(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List<String> list, PrivacyNotice privacyNotice, TeamPresence teamPresence, String str2, String str3) {
        composerState.getClass();
        list.getClass();
        this.composerSuggestions = composerSuggestions;
        this.newConversationData = newConversationData;
        this.composerState = composerState;
        this.requestId = str;
        this.poweredBy = poweredBy;
        this.openInboundConversations = list;
        this.privacyNotice = privacyNotice;
        this.teamPresence = teamPresence;
        this.resolutionBotBehaviorVersionId = str2;
        this.botIntroId = str3;
    }

    public OpenMessengerResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
