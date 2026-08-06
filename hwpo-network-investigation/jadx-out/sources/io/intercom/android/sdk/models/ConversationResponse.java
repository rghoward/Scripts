package io.intercom.android.sdk.models;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationResponse extends BaseResponse {
    public static final int $stable = 8;
    private final Builder builder;
    private final Conversation conversation;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder extends BaseResponse.Builder {
        public static final int $stable = 8;
        private ComposerState composer_state;
        private List<Part.Builder> conversation_parts;
        private List<String> group_conversation_participant_ids;
        private String id;
        private boolean inbound_conversations_disabled;
        private boolean is_inbound;
        private LastParticipatingAdmin.Builder last_participating_admin;
        private String notification_status;
        private List<Participant.Builder> participants;
        private boolean prevent_end_user_replies;
        private boolean read;
        private String state;
        private Ticket ticket;
        private ConversationUiFlags ui_flags;

        public Builder() {
            hf3 hf3Var = hf3.t;
            this.participants = hf3Var;
            this.conversation_parts = hf3Var;
            this.group_conversation_participant_ids = hf3Var;
            this.last_participating_admin = new LastParticipatingAdmin.Builder();
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationResponse build() {
            return new ConversationResponse(this);
        }

        public final ComposerState getComposer_state() {
            return this.composer_state;
        }

        public final List<Part.Builder> getConversation_parts() {
            return this.conversation_parts;
        }

        public final List<String> getGroup_conversation_participant_ids() {
            return this.group_conversation_participant_ids;
        }

        public final String getId() {
            return this.id;
        }

        public final boolean getInbound_conversations_disabled() {
            return this.inbound_conversations_disabled;
        }

        public final LastParticipatingAdmin.Builder getLast_participating_admin() {
            return this.last_participating_admin;
        }

        public final String getNotification_status() {
            return this.notification_status;
        }

        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final boolean getPrevent_end_user_replies() {
            return this.prevent_end_user_replies;
        }

        public final boolean getRead() {
            return this.read;
        }

        public final String getState() {
            return this.state;
        }

        public final Ticket getTicket() {
            return this.ticket;
        }

        public final ConversationUiFlags getUi_flags() {
            return this.ui_flags;
        }

        public final boolean is_inbound() {
            return this.is_inbound;
        }

        public final void setComposer_state(ComposerState composerState) {
            this.composer_state = composerState;
        }

        public final void setConversation_parts(List<Part.Builder> list) {
            list.getClass();
            this.conversation_parts = list;
        }

        public final void setGroup_conversation_participant_ids(List<String> list) {
            list.getClass();
            this.group_conversation_participant_ids = list;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setInbound_conversations_disabled(boolean z) {
            this.inbound_conversations_disabled = z;
        }

        public final void setLast_participating_admin(LastParticipatingAdmin.Builder builder) {
            builder.getClass();
            this.last_participating_admin = builder;
        }

        public final void setNotification_status(String str) {
            this.notification_status = str;
        }

        public final void setParticipants(List<Participant.Builder> list) {
            list.getClass();
            this.participants = list;
        }

        public final void setPrevent_end_user_replies(boolean z) {
            this.prevent_end_user_replies = z;
        }

        public final void setRead(boolean z) {
            this.read = z;
        }

        public final void setState(String str) {
            this.state = str;
        }

        public final void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

        public final void setUi_flags(ConversationUiFlags conversationUiFlags) {
            this.ui_flags = conversationUiFlags;
        }

        public final void set_inbound(boolean z) {
            this.is_inbound = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationResponse(Builder builder) {
        super(builder);
        builder.getClass();
        this.builder = builder;
        String id = builder.getId();
        id = id == null ? BuildConfig.FLAVOR : id;
        boolean read = builder.getRead();
        List<Participant.Builder> participants = builder.getParticipants();
        List<Part.Builder> conversation_parts = builder.getConversation_parts();
        List<String> group_conversation_participant_ids = builder.getGroup_conversation_participant_ids();
        LastParticipatingAdmin.Builder last_participating_admin = builder.getLast_participating_admin();
        ComposerState composer_state = builder.getComposer_state();
        composer_state = composer_state == null ? ComposerState.Companion.getNULL() : composer_state;
        boolean prevent_end_user_replies = builder.getPrevent_end_user_replies();
        boolean inbound_conversations_disabled = builder.getInbound_conversations_disabled();
        String notification_status = builder.getNotification_status();
        notification_status = notification_status == null ? BuildConfig.FLAVOR : notification_status;
        String state = builder.getState();
        state = state == null ? BuildConfig.FLAVOR : state;
        boolean zIs_inbound = builder.is_inbound();
        Ticket ticket = builder.getTicket();
        ConversationUiFlags ui_flags = builder.getUi_flags();
        this.conversation = new Conversation(id, null, read, participants, conversation_parts, group_conversation_participant_ids, last_participating_admin, composer_state, prevent_end_user_replies, inbound_conversations_disabled, notification_status, state, zIs_inbound, ticket, ui_flags == null ? ConversationUiFlags.Companion.getDEFAULT() : ui_flags, null, null, null, null, null, null, 2064386, null);
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final Conversation getConversation() {
        return this.conversation;
    }
}
