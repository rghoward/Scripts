package io.intercom.android.sdk.m5.conversation.data;

import defpackage.os2;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ParsedNexusEvent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AblyReconnectedWithoutResume extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final AblyReconnectedWithoutResume INSTANCE = new AblyReconnectedWithoutResume();

        private AblyReconnectedWithoutResume() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AblyReconnectedWithoutResume);
        }

        public int hashCode() {
            return 828901668;
        }

        public String toString() {
            return "AblyReconnectedWithoutResume";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NexusConnected extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final NexusConnected INSTANCE = new NexusConnected();

        private NexusConnected() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NexusConnected);
        }

        public int hashCode() {
            return -1135156447;
        }

        public String toString() {
            return "NexusConnected";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class UnSupportedEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        private UnSupportedEvent() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnSupportedEvent);
        }

        public int hashCode() {
            return -2056396516;
        }

        public String toString() {
            return "UnSupportedEvent";
        }
    }

    public /* synthetic */ ParsedNexusEvent(qq2 qq2Var) {
        this();
    }

    private ParsedNexusEvent() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class ConversationNexusEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        private final String conversationId;
        private final NexusEventType eventType;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AdminIsTyping extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String clientId;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;
            private final boolean showAvatar;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdminIsTyping(String str, String str2, Avatar avatar, boolean z, boolean z2, String str3) {
                super(str, NexusEventType.AdminIsTyping);
                str.getClass();
                str2.getClass();
                avatar.getClass();
                str3.getClass();
                this.conversationId = str;
                this.createdByUser = str2;
                this.avatar = avatar;
                this.isBot = z;
                this.showAvatar = z2;
                this.clientId = str3;
            }

            public static /* synthetic */ AdminIsTyping copy$default(AdminIsTyping adminIsTyping, String str, String str2, Avatar avatar, boolean z, boolean z2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = adminIsTyping.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = adminIsTyping.createdByUser;
                }
                if ((i & 4) != 0) {
                    avatar = adminIsTyping.avatar;
                }
                if ((i & 8) != 0) {
                    z = adminIsTyping.isBot;
                }
                if ((i & 16) != 0) {
                    z2 = adminIsTyping.showAvatar;
                }
                if ((i & 32) != 0) {
                    str3 = adminIsTyping.clientId;
                }
                boolean z3 = z2;
                String str4 = str3;
                return adminIsTyping.copy(str, str2, avatar, z, z3, str4);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            public final boolean component5() {
                return this.showAvatar;
            }

            public final String component6() {
                return this.clientId;
            }

            public final AdminIsTyping copy(String str, String str2, Avatar avatar, boolean z, boolean z2, String str3) {
                str.getClass();
                str2.getClass();
                avatar.getClass();
                str3.getClass();
                return new AdminIsTyping(str, str2, avatar, z, z2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdminIsTyping)) {
                    return false;
                }
                AdminIsTyping adminIsTyping = (AdminIsTyping) obj;
                return xj5.a(this.conversationId, adminIsTyping.conversationId) && xj5.a(this.createdByUser, adminIsTyping.createdByUser) && xj5.a(this.avatar, adminIsTyping.avatar) && this.isBot == adminIsTyping.isBot && this.showAvatar == adminIsTyping.showAvatar && xj5.a(this.clientId, adminIsTyping.clientId);
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            public final String getClientId() {
                return this.clientId;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final boolean getShowAvatar() {
                return this.showAvatar;
            }

            public int hashCode() {
                return this.clientId.hashCode() + uo2.a(uo2.a((this.avatar.hashCode() + ru3.c(this.conversationId.hashCode() * 31, 31, this.createdByUser)) * 31, this.isBot, 31), this.showAvatar, 31);
            }

            public final boolean isBot() {
                return this.isBot;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("AdminIsTyping(conversationId=");
                sb.append(this.conversationId);
                sb.append(", createdByUser=");
                sb.append(this.createdByUser);
                sb.append(", avatar=");
                sb.append(this.avatar);
                sb.append(", isBot=");
                sb.append(this.isBot);
                sb.append(", showAvatar=");
                sb.append(this.showAvatar);
                sb.append(", clientId=");
                return wu0.a(sb, this.clientId, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FinStreaming extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final List<Block> blocks;
            private final String clientAssignedUUID;
            private final String conversationId;
            private final String partType;
            private final int tokenSequenceIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public FinStreaming(String str, String str2, String str3, int i, List<? extends Block> list) {
                super(str, NexusEventType.ConversationPartToken);
                str.getClass();
                str2.getClass();
                str3.getClass();
                list.getClass();
                this.conversationId = str;
                this.clientAssignedUUID = str2;
                this.partType = str3;
                this.tokenSequenceIndex = i;
                this.blocks = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FinStreaming copy$default(FinStreaming finStreaming, String str, String str2, String str3, int i, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = finStreaming.conversationId;
                }
                if ((i2 & 2) != 0) {
                    str2 = finStreaming.clientAssignedUUID;
                }
                if ((i2 & 4) != 0) {
                    str3 = finStreaming.partType;
                }
                if ((i2 & 8) != 0) {
                    i = finStreaming.tokenSequenceIndex;
                }
                if ((i2 & 16) != 0) {
                    list = finStreaming.blocks;
                }
                List list2 = list;
                String str4 = str3;
                return finStreaming.copy(str, str2, str4, i, list2);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.clientAssignedUUID;
            }

            public final String component3() {
                return this.partType;
            }

            public final int component4() {
                return this.tokenSequenceIndex;
            }

            public final List<Block> component5() {
                return this.blocks;
            }

            public final FinStreaming copy(String str, String str2, String str3, int i, List<? extends Block> list) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                list.getClass();
                return new FinStreaming(str, str2, str3, i, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinStreaming)) {
                    return false;
                }
                FinStreaming finStreaming = (FinStreaming) obj;
                return xj5.a(this.conversationId, finStreaming.conversationId) && xj5.a(this.clientAssignedUUID, finStreaming.clientAssignedUUID) && xj5.a(this.partType, finStreaming.partType) && this.tokenSequenceIndex == finStreaming.tokenSequenceIndex && xj5.a(this.blocks, finStreaming.blocks);
            }

            public final List<Block> getBlocks() {
                return this.blocks;
            }

            public final String getClientAssignedUUID() {
                return this.clientAssignedUUID;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getPartType() {
                return this.partType;
            }

            public final int getTokenSequenceIndex() {
                return this.tokenSequenceIndex;
            }

            public int hashCode() {
                return this.blocks.hashCode() + os2.a(this.tokenSequenceIndex, ru3.c(ru3.c(this.conversationId.hashCode() * 31, 31, this.clientAssignedUUID), 31, this.partType), 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FinStreaming(conversationId=");
                sb.append(this.conversationId);
                sb.append(", clientAssignedUUID=");
                sb.append(this.clientAssignedUUID);
                sb.append(", partType=");
                sb.append(this.partType);
                sb.append(", tokenSequenceIndex=");
                sb.append(this.tokenSequenceIndex);
                sb.append(", blocks=");
                return zc6.a(sb, this.blocks, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class UserContentSeenByAdmin extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserContentSeenByAdmin(String str, String str2, Avatar avatar, boolean z) {
                super(str, NexusEventType.AdminIsTyping);
                str.getClass();
                str2.getClass();
                avatar.getClass();
                this.conversationId = str;
                this.createdByUser = str2;
                this.avatar = avatar;
                this.isBot = z;
            }

            public static /* synthetic */ UserContentSeenByAdmin copy$default(UserContentSeenByAdmin userContentSeenByAdmin, String str, String str2, Avatar avatar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userContentSeenByAdmin.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = userContentSeenByAdmin.createdByUser;
                }
                if ((i & 4) != 0) {
                    avatar = userContentSeenByAdmin.avatar;
                }
                if ((i & 8) != 0) {
                    z = userContentSeenByAdmin.isBot;
                }
                return userContentSeenByAdmin.copy(str, str2, avatar, z);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            public final UserContentSeenByAdmin copy(String str, String str2, Avatar avatar, boolean z) {
                str.getClass();
                str2.getClass();
                avatar.getClass();
                return new UserContentSeenByAdmin(str, str2, avatar, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserContentSeenByAdmin)) {
                    return false;
                }
                UserContentSeenByAdmin userContentSeenByAdmin = (UserContentSeenByAdmin) obj;
                return xj5.a(this.conversationId, userContentSeenByAdmin.conversationId) && xj5.a(this.createdByUser, userContentSeenByAdmin.createdByUser) && xj5.a(this.avatar, userContentSeenByAdmin.avatar) && this.isBot == userContentSeenByAdmin.isBot;
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isBot) + ((this.avatar.hashCode() + ru3.c(this.conversationId.hashCode() * 31, 31, this.createdByUser)) * 31);
            }

            public final boolean isBot() {
                return this.isBot;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("UserContentSeenByAdmin(conversationId=");
                sb.append(this.conversationId);
                sb.append(", createdByUser=");
                sb.append(this.createdByUser);
                sb.append(", avatar=");
                sb.append(this.avatar);
                sb.append(", isBot=");
                return pi1.a(sb, this.isBot, ')');
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationNexusEvent(String str, NexusEventType nexusEventType) {
            super(null);
            str.getClass();
            nexusEventType.getClass();
            this.conversationId = str;
            this.eventType = nexusEventType;
        }

        public String getConversationId() {
            return this.conversationId;
        }

        public final NexusEventType getEventType() {
            return this.eventType;
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class NewComment extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final String conversationId;
            private final String createdByUser;
            private final Part.Builder partBuilder;
            private final String ticketId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewComment(String str, String str2, String str3, Part.Builder builder) {
                super(str, NexusEventType.NewComment);
                str.getClass();
                str2.getClass();
                this.conversationId = str;
                this.createdByUser = str2;
                this.ticketId = str3;
                this.partBuilder = builder;
            }

            public static /* synthetic */ NewComment copy$default(NewComment newComment, String str, String str2, String str3, Part.Builder builder, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = newComment.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = newComment.createdByUser;
                }
                if ((i & 4) != 0) {
                    str3 = newComment.ticketId;
                }
                if ((i & 8) != 0) {
                    builder = newComment.partBuilder;
                }
                return newComment.copy(str, str2, str3, builder);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final String component3() {
                return this.ticketId;
            }

            public final Part.Builder component4() {
                return this.partBuilder;
            }

            public final NewComment copy(String str, String str2, String str3, Part.Builder builder) {
                str.getClass();
                str2.getClass();
                return new NewComment(str, str2, str3, builder);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewComment)) {
                    return false;
                }
                NewComment newComment = (NewComment) obj;
                return xj5.a(this.conversationId, newComment.conversationId) && xj5.a(this.createdByUser, newComment.createdByUser) && xj5.a(this.ticketId, newComment.ticketId) && xj5.a(this.partBuilder, newComment.partBuilder);
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final Part.Builder getPartBuilder() {
                return this.partBuilder;
            }

            public final String getTicketId() {
                return this.ticketId;
            }

            public int hashCode() {
                int iC = ru3.c(this.conversationId.hashCode() * 31, 31, this.createdByUser);
                String str = this.ticketId;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                Part.Builder builder = this.partBuilder;
                return iHashCode + (builder != null ? builder.hashCode() : 0);
            }

            public String toString() {
                return "NewComment(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", ticketId=" + this.ticketId + ", partBuilder=" + this.partBuilder + ')';
            }

            public /* synthetic */ NewComment(String str, String str2, String str3, Part.Builder builder, int i, qq2 qq2Var) {
                this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : builder);
            }
        }
    }
}
