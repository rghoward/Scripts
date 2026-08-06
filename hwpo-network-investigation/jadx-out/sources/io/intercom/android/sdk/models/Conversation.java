package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.ph1;
import defpackage.pi6;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.th1;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Conversation {
    public static final int $stable = 8;

    @SerializedName("composer_state")
    private final ComposerState composerState;

    @SerializedName("conversation_ended_button")
    private final ConversationEndedButton conversationEndedButton;

    @SerializedName("footer_notice")
    private final FooterNotice footerNotice;

    @SerializedName("group_conversation_participant_ids")
    private final List<String> groupConversationParticipantIds;
    private final Header header;
    private final String id;

    @SerializedName("inbound_conversations_disabled")
    private final boolean inboundConversationsDisabled;

    @SerializedName("is_inbound")
    private final boolean isInbound;

    @SerializedName("read")
    private final boolean isRead;

    @SerializedName("last_participating_admin")
    private final LastParticipatingAdmin.Builder lastParticipatingAdminBuilder;

    @SerializedName("notification_status")
    private final String notificationStatus;

    @SerializedName("conversation_parts")
    private final List<Part.Builder> partBuilderList;

    @SerializedName("participants")
    private final List<Participant.Builder> participantBuilderList;

    @SerializedName("powered_by")
    private final PoweredBy poweredBy;

    @SerializedName("prevent_end_user_replies")
    private final boolean preventEndUserReplies;

    @SerializedName("special_notice")
    private final String specialNotice;
    private final String state;

    @SerializedName("team_intro")
    private final String teamIntro;
    private final Ticket ticket;
    private final String title;

    @SerializedName("ui_flags")
    private final ConversationUiFlags uiFlags;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Conversation(String str, String str2, boolean z, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str3, String str4, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str5, String str6, int i, qq2 qq2Var) {
        int i2 = i & 1;
        String str7 = BuildConfig.FLAVOR;
        String str8 = i2 != 0 ? BuildConfig.FLAVOR : str;
        String str9 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        boolean z5 = (i & 4) != 0 ? false : z;
        int i3 = i & 8;
        List list4 = hf3.t;
        this(str8, str9, z5, i3 != 0 ? list4 : list, (i & 16) != 0 ? list4 : list2, (i & 32) == 0 ? list3 : list4, (i & 64) != 0 ? new LastParticipatingAdmin.Builder() : builder, (i & 128) != 0 ? ComposerState.Companion.getNULL() : composerState, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? BuildConfig.FLAVOR : str3, (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) == 0 ? str4 : str7, (i & 4096) == 0 ? z4 : false, (i & 8192) != 0 ? null : ticket, (i & 16384) != 0 ? ConversationUiFlags.Companion.getDEFAULT() : conversationUiFlags, (i & 32768) != 0 ? null : header, (i & 65536) != 0 ? null : conversationEndedButton, (i & 131072) != 0 ? null : footerNotice, (i & 262144) != 0 ? null : poweredBy, (i & 524288) != 0 ? null : str5, (i & 1048576) != 0 ? null : str6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, String str2, boolean z, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str3, String str4, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        String str9 = (i & 1) != 0 ? conversation.id : str;
        String str10 = (i & 2) != 0 ? conversation.title : str2;
        boolean z5 = (i & 4) != 0 ? conversation.isRead : z;
        List list4 = (i & 8) != 0 ? conversation.participantBuilderList : list;
        List list5 = (i & 16) != 0 ? conversation.partBuilderList : list2;
        List list6 = (i & 32) != 0 ? conversation.groupConversationParticipantIds : list3;
        LastParticipatingAdmin.Builder builder2 = (i & 64) != 0 ? conversation.lastParticipatingAdminBuilder : builder;
        ComposerState composerState2 = (i & 128) != 0 ? conversation.composerState : composerState;
        boolean z6 = (i & 256) != 0 ? conversation.preventEndUserReplies : z2;
        boolean z7 = (i & 512) != 0 ? conversation.inboundConversationsDisabled : z3;
        String str11 = (i & 1024) != 0 ? conversation.notificationStatus : str3;
        String str12 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? conversation.state : str4;
        boolean z8 = (i & 4096) != 0 ? conversation.isInbound : z4;
        Ticket ticket2 = (i & 8192) != 0 ? conversation.ticket : ticket;
        String str13 = str9;
        ConversationUiFlags conversationUiFlags2 = (i & 16384) != 0 ? conversation.uiFlags : conversationUiFlags;
        Header header2 = (i & 32768) != 0 ? conversation.header : header;
        ConversationEndedButton conversationEndedButton2 = (i & 65536) != 0 ? conversation.conversationEndedButton : conversationEndedButton;
        FooterNotice footerNotice2 = (i & 131072) != 0 ? conversation.footerNotice : footerNotice;
        PoweredBy poweredBy2 = (i & 262144) != 0 ? conversation.poweredBy : poweredBy;
        String str14 = (i & 524288) != 0 ? conversation.teamIntro : str5;
        if ((i & 1048576) != 0) {
            str8 = str14;
            str7 = conversation.specialNotice;
        } else {
            str7 = str6;
            str8 = str14;
        }
        return conversation.copy(str13, str10, z5, list4, list5, list6, builder2, composerState2, z6, z7, str11, str12, z8, ticket2, conversationUiFlags2, header2, conversationEndedButton2, footerNotice2, poweredBy2, str8, str7);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.inboundConversationsDisabled;
    }

    public final String component11() {
        return this.notificationStatus;
    }

    public final String component12() {
        return this.state;
    }

    public final boolean component13() {
        return this.isInbound;
    }

    public final Ticket component14() {
        return this.ticket;
    }

    public final ConversationUiFlags component15() {
        return this.uiFlags;
    }

    public final Header component16() {
        return this.header;
    }

    public final ConversationEndedButton component17() {
        return this.conversationEndedButton;
    }

    public final FooterNotice component18() {
        return this.footerNotice;
    }

    public final PoweredBy component19() {
        return this.poweredBy;
    }

    public final String component2() {
        return this.title;
    }

    public final String component20() {
        return this.teamIntro;
    }

    public final String component21() {
        return this.specialNotice;
    }

    public final boolean component3() {
        return this.isRead;
    }

    public final List<Participant.Builder> component4() {
        return this.participantBuilderList;
    }

    public final List<Part.Builder> component5() {
        return this.partBuilderList;
    }

    public final List<String> component6() {
        return this.groupConversationParticipantIds;
    }

    public final LastParticipatingAdmin.Builder component7() {
        return this.lastParticipatingAdminBuilder;
    }

    public final ComposerState component8() {
        return this.composerState;
    }

    public final boolean component9() {
        return this.preventEndUserReplies;
    }

    public final Conversation copy(String str, String str2, boolean z, List<Participant.Builder> list, List<Part.Builder> list2, List<String> list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str3, String str4, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str5, String str6) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        builder.getClass();
        composerState.getClass();
        str3.getClass();
        str4.getClass();
        conversationUiFlags.getClass();
        return new Conversation(str, str2, z, list, list2, list3, builder, composerState, z2, z3, str3, str4, z4, ticket, conversationUiFlags, header, conversationEndedButton, footerNotice, poweredBy, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        return xj5.a(this.id, conversation.id) && xj5.a(this.title, conversation.title) && this.isRead == conversation.isRead && xj5.a(this.participantBuilderList, conversation.participantBuilderList) && xj5.a(this.partBuilderList, conversation.partBuilderList) && xj5.a(this.groupConversationParticipantIds, conversation.groupConversationParticipantIds) && xj5.a(this.lastParticipatingAdminBuilder, conversation.lastParticipatingAdminBuilder) && xj5.a(this.composerState, conversation.composerState) && this.preventEndUserReplies == conversation.preventEndUserReplies && this.inboundConversationsDisabled == conversation.inboundConversationsDisabled && xj5.a(this.notificationStatus, conversation.notificationStatus) && xj5.a(this.state, conversation.state) && this.isInbound == conversation.isInbound && xj5.a(this.ticket, conversation.ticket) && xj5.a(this.uiFlags, conversation.uiFlags) && xj5.a(this.header, conversation.header) && xj5.a(this.conversationEndedButton, conversation.conversationEndedButton) && xj5.a(this.footerNotice, conversation.footerNotice) && xj5.a(this.poweredBy, conversation.poweredBy) && xj5.a(this.teamIntro, conversation.teamIntro) && xj5.a(this.specialNotice, conversation.specialNotice);
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    public final List<String> getGroupConversationParticipantIds() {
        return this.groupConversationParticipantIds;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    public final Part getLastAdminPart() {
        Part partPrevious;
        List<Part> listParts = parts();
        ListIterator<Part> listIterator = listParts.listIterator(listParts.size());
        do {
            if (!listIterator.hasPrevious()) {
                partPrevious = null;
                break;
            }
            partPrevious = listIterator.previous();
        } while (!partPrevious.isAdmin());
        Part part = partPrevious;
        if (part != null) {
            return part;
        }
        Part part2 = Part.NULL;
        part2.getClass();
        return part2;
    }

    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    public final List<Part.Builder> getPartBuilderList() {
        return this.partBuilderList;
    }

    public final List<Participant.Builder> getParticipantBuilderList() {
        return this.participantBuilderList;
    }

    public final Map<String, Participant> getParticipants() {
        List<Participant.Builder> list = this.participantBuilderList;
        int iG = pi6.g(ph1.n(list, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Participant.Builder builder : list) {
            linkedHashMap.put(builder.build().getId(), builder.build());
        }
        return linkedHashMap;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }

    public final Ticket getTicket() {
        return this.ticket;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    public final List<Participant> groupConversationParticipants() {
        List<String> list = this.groupConversationParticipantIds;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Participant participant = getParticipants().get((String) it.next());
            if (participant != null) {
                arrayList.add(participant);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int iA = uo2.a(ru3.c(ru3.c(uo2.a(uo2.a((this.composerState.hashCode() + ((this.lastParticipatingAdminBuilder.hashCode() + ho2.a(ho2.a(ho2.a(uo2.a(ru3.c(this.id.hashCode() * 31, 31, this.title), this.isRead, 31), 31, this.participantBuilderList), 31, this.partBuilderList), 31, this.groupConversationParticipantIds)) * 31)) * 31, this.preventEndUserReplies, 31), this.inboundConversationsDisabled, 31), 31, this.notificationStatus), 31, this.state), this.isInbound, 31);
        Ticket ticket = this.ticket;
        int iHashCode = (this.uiFlags.hashCode() + ((iA + (ticket == null ? 0 : ticket.hashCode())) * 31)) * 31;
        Header header = this.header;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        ConversationEndedButton conversationEndedButton = this.conversationEndedButton;
        int iHashCode3 = (iHashCode2 + (conversationEndedButton == null ? 0 : conversationEndedButton.hashCode())) * 31;
        FooterNotice footerNotice = this.footerNotice;
        int iHashCode4 = (iHashCode3 + (footerNotice == null ? 0 : footerNotice.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int iHashCode5 = (iHashCode4 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31;
        String str = this.teamIntro;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.specialNotice;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isInbound() {
        return this.isInbound;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final Part lastPart() {
        Part part = (Part) th1.H(parts());
        if (part != null) {
            return part;
        }
        Part part2 = Part.NULL;
        part2.getClass();
        return part2;
    }

    public final LastParticipatingAdmin lastParticipatingAdmin() {
        LastParticipatingAdmin lastParticipatingAdminBuild = this.lastParticipatingAdminBuilder.build();
        lastParticipatingAdminBuild.getClass();
        return lastParticipatingAdminBuild;
    }

    public final List<Part> parts() {
        List<Part.Builder> list = this.partBuilderList;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Part partBuild = ((Part.Builder) it.next()).build();
            Participant participant = getParticipants().get(partBuild.getParticipantId());
            if (participant != null) {
                partBuild.setParticipant(participant);
            }
            arrayList.add(partBuild);
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Conversation(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isRead=");
        sb.append(this.isRead);
        sb.append(", participantBuilderList=");
        sb.append(this.participantBuilderList);
        sb.append(", partBuilderList=");
        sb.append(this.partBuilderList);
        sb.append(", groupConversationParticipantIds=");
        sb.append(this.groupConversationParticipantIds);
        sb.append(", lastParticipatingAdminBuilder=");
        sb.append(this.lastParticipatingAdminBuilder);
        sb.append(", composerState=");
        sb.append(this.composerState);
        sb.append(", preventEndUserReplies=");
        sb.append(this.preventEndUserReplies);
        sb.append(", inboundConversationsDisabled=");
        sb.append(this.inboundConversationsDisabled);
        sb.append(", notificationStatus=");
        sb.append(this.notificationStatus);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", isInbound=");
        sb.append(this.isInbound);
        sb.append(", ticket=");
        sb.append(this.ticket);
        sb.append(", uiFlags=");
        sb.append(this.uiFlags);
        sb.append(", header=");
        sb.append(this.header);
        sb.append(", conversationEndedButton=");
        sb.append(this.conversationEndedButton);
        sb.append(", footerNotice=");
        sb.append(this.footerNotice);
        sb.append(", poweredBy=");
        sb.append(this.poweredBy);
        sb.append(", teamIntro=");
        sb.append(this.teamIntro);
        sb.append(", specialNotice=");
        return wu0.a(sb, this.specialNotice, ')');
    }

    public Conversation(String str, String str2, boolean z, List<Participant.Builder> list, List<Part.Builder> list2, List<String> list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str3, String str4, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str5, String str6) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        builder.getClass();
        composerState.getClass();
        str3.getClass();
        str4.getClass();
        conversationUiFlags.getClass();
        this.id = str;
        this.title = str2;
        this.isRead = z;
        this.participantBuilderList = list;
        this.partBuilderList = list2;
        this.groupConversationParticipantIds = list3;
        this.lastParticipatingAdminBuilder = builder;
        this.composerState = composerState;
        this.preventEndUserReplies = z2;
        this.inboundConversationsDisabled = z3;
        this.notificationStatus = str3;
        this.state = str4;
        this.isInbound = z4;
        this.ticket = ticket;
        this.uiFlags = conversationUiFlags;
        this.header = header;
        this.conversationEndedButton = conversationEndedButton;
        this.footerNotice = footerNotice;
        this.poweredBy = poweredBy;
        this.teamIntro = str5;
        this.specialNotice = str6;
    }

    public Conversation() {
        this(null, null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097151, null);
    }
}
