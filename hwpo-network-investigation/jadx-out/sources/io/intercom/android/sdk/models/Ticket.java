package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.al;
import defpackage.fh0;
import defpackage.fk;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.z2a;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ticket {

    @SerializedName("assignee")
    private final Participant.Builder assignee;

    @SerializedName("attributes")
    private final List<TicketAttribute> attributes;

    @SerializedName("conversation_button")
    private final ConversationButton conversationButton;

    @SerializedName(CreateTicketDestinationKt.CONVERSATION_ID)
    private final String conversationId;

    @SerializedName("current_status")
    private final Status currentStatus;

    @SerializedName("description")
    private final String description;

    @SerializedName("emoji")
    private final String emoji;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("id")
    private final String id;

    @SerializedName("read")
    private final Boolean isRead;

    @SerializedName("latest_status_updated_at")
    private final long latestStatusUpdatedAt;

    @SerializedName("public_ticket_id")
    private final String publicId;

    @SerializedName("status_list")
    private final List<Status> statusList;

    @SerializedName(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final long ticketTypeId;

    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Ticket NULL = new Ticket(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, 32767, null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ConversationButton {
        public static final int $stable = 0;

        @SerializedName("icon")
        private final IconType icon;

        @SerializedName(AttributeType.TEXT)
        private final String text;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public enum IconType {
            SEND,
            CONVERSATION;

            private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

            public static nl3<IconType> getEntries() {
                return $ENTRIES;
            }
        }

        public ConversationButton(IconType iconType, String str) {
            str.getClass();
            this.icon = iconType;
            this.text = str;
        }

        public static /* synthetic */ ConversationButton copy$default(ConversationButton conversationButton, IconType iconType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconType = conversationButton.icon;
            }
            if ((i & 2) != 0) {
                str = conversationButton.text;
            }
            return conversationButton.copy(iconType, str);
        }

        public final IconType component1() {
            return this.icon;
        }

        public final String component2() {
            return this.text;
        }

        public final ConversationButton copy(IconType iconType, String str) {
            str.getClass();
            return new ConversationButton(iconType, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) obj;
            return this.icon == conversationButton.icon && xj5.a(this.text, conversationButton.text);
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            IconType iconType = this.icon;
            return this.text.hashCode() + ((iconType == null ? 0 : iconType.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConversationButton(icon=");
            sb.append(this.icon);
            sb.append(", text=");
            return wu0.a(sb, this.text, ')');
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, long j, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j2, int i, qq2 qq2Var) {
        int i2 = i & 1;
        String str8 = BuildConfig.FLAVOR;
        String str9 = i2 != 0 ? BuildConfig.FLAVOR : str;
        String str10 = (i & 2) != 0 ? null : str2;
        String str11 = (i & 4) != 0 ? BuildConfig.FLAVOR : str3;
        String str12 = (i & 8) != 0 ? BuildConfig.FLAVOR : str4;
        String str13 = (i & 16) != 0 ? BuildConfig.FLAVOR : str5;
        str8 = (i & 32) == 0 ? str6 : str8;
        Status status2 = (i & 64) != 0 ? new Status(null, null, null, false, 0L, 31, null) : status;
        int i3 = i & 128;
        List list3 = hf3.t;
        this(str9, str10, str11, str12, str13, str8, status2, i3 != 0 ? list3 : list, (i & 256) == 0 ? list2 : list3, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? new Participant.Builder() : builder, (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? null : str7, (i & 4096) != 0 ? null : conversationButton, (i & 8192) != 0 ? null : bool, (i & 16384) != 0 ? 0L : j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, long j, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j2, int i, Object obj) {
        long j3;
        Boolean bool2;
        String str8 = (i & 1) != 0 ? ticket.id : str;
        String str9 = (i & 2) != 0 ? ticket.publicId : str2;
        String str10 = (i & 4) != 0 ? ticket.title : str3;
        String str11 = (i & 8) != 0 ? ticket.description : str4;
        String str12 = (i & 16) != 0 ? ticket.iconUrl : str5;
        String str13 = (i & 32) != 0 ? ticket.emoji : str6;
        Status status2 = (i & 64) != 0 ? ticket.currentStatus : status;
        List list3 = (i & 128) != 0 ? ticket.statusList : list;
        List list4 = (i & 256) != 0 ? ticket.attributes : list2;
        long j4 = (i & 512) != 0 ? ticket.ticketTypeId : j;
        Participant.Builder builder2 = (i & 1024) != 0 ? ticket.assignee : builder;
        String str14 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? ticket.conversationId : str7;
        ConversationButton conversationButton2 = (i & 4096) != 0 ? ticket.conversationButton : conversationButton;
        String str15 = str8;
        Boolean bool3 = (i & 8192) != 0 ? ticket.isRead : bool;
        if ((i & 16384) != 0) {
            bool2 = bool3;
            j3 = ticket.latestStatusUpdatedAt;
        } else {
            j3 = j2;
            bool2 = bool3;
        }
        return ticket.copy(str15, str9, str10, str11, str12, str13, status2, list3, list4, j4, builder2, str14, conversationButton2, bool2, j3);
    }

    public final String component1() {
        return this.id;
    }

    public final long component10() {
        return this.ticketTypeId;
    }

    public final Participant.Builder component11() {
        return this.assignee;
    }

    public final String component12() {
        return this.conversationId;
    }

    public final ConversationButton component13() {
        return this.conversationButton;
    }

    public final Boolean component14() {
        return this.isRead;
    }

    public final long component15() {
        return this.latestStatusUpdatedAt;
    }

    public final String component2() {
        return this.publicId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.emoji;
    }

    public final Status component7() {
        return this.currentStatus;
    }

    public final List<Status> component8() {
        return this.statusList;
    }

    public final List<TicketAttribute> component9() {
        return this.attributes;
    }

    public final Ticket copy(String str, String str2, String str3, String str4, String str5, String str6, Status status, List<Status> list, List<? extends TicketAttribute> list2, long j, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j2) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        status.getClass();
        list.getClass();
        list2.getClass();
        builder.getClass();
        return new Ticket(str, str2, str3, str4, str5, str6, status, list, list2, j, builder, str7, conversationButton, bool, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) obj;
        return xj5.a(this.id, ticket.id) && xj5.a(this.publicId, ticket.publicId) && xj5.a(this.title, ticket.title) && xj5.a(this.description, ticket.description) && xj5.a(this.iconUrl, ticket.iconUrl) && xj5.a(this.emoji, ticket.emoji) && xj5.a(this.currentStatus, ticket.currentStatus) && xj5.a(this.statusList, ticket.statusList) && xj5.a(this.attributes, ticket.attributes) && this.ticketTypeId == ticket.ticketTypeId && xj5.a(this.assignee, ticket.assignee) && xj5.a(this.conversationId, ticket.conversationId) && xj5.a(this.conversationButton, ticket.conversationButton) && xj5.a(this.isRead, ticket.isRead) && this.latestStatusUpdatedAt == ticket.latestStatusUpdatedAt;
    }

    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    public final String getPublicId() {
        return this.publicId;
    }

    public final List<Status> getStatusList() {
        return this.statusList;
    }

    public final long getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.publicId;
        int iHashCode2 = (this.assignee.hashCode() + al.c(this.ticketTypeId, ho2.a(ho2.a((this.currentStatus.hashCode() + ru3.c(ru3.c(ru3.c(ru3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.description), 31, this.iconUrl), 31, this.emoji)) * 31, 31, this.statusList), 31, this.attributes), 31)) * 31;
        String str2 = this.conversationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConversationButton conversationButton = this.conversationButton;
        int iHashCode4 = (iHashCode3 + (conversationButton == null ? 0 : conversationButton.hashCode())) * 31;
        Boolean bool = this.isRead;
        return Long.hashCode(this.latestStatusUpdatedAt) + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final Boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ticket(id=");
        sb.append(this.id);
        sb.append(", publicId=");
        sb.append(this.publicId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", emoji=");
        sb.append(this.emoji);
        sb.append(", currentStatus=");
        sb.append(this.currentStatus);
        sb.append(", statusList=");
        sb.append(this.statusList);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", ticketTypeId=");
        sb.append(this.ticketTypeId);
        sb.append(", assignee=");
        sb.append(this.assignee);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", conversationButton=");
        sb.append(this.conversationButton);
        sb.append(", isRead=");
        sb.append(this.isRead);
        sb.append(", latestStatusUpdatedAt=");
        return fh0.b(sb, this.latestStatusUpdatedAt, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Ticket getNULL() {
            return Ticket.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class TicketAttribute {
        public static final int $stable = 0;

        @SerializedName("id")
        private final String id;

        @SerializedName("identifier")
        private final String identifier;

        @SerializedName("name")
        private final String name;

        @SerializedName("required")
        private final boolean required;

        @SerializedName("type")
        private final TicketAttributeType type;

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? false : z, ticketAttributeType, null);
        }

        public final String getId() {
            return this.id;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public final TicketAttributeType getType() {
            return this.type;
        }

        public abstract boolean hasValue();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FilesAttribute extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            private final List<File> value;

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class File {
                public static final int $stable = 0;

                @SerializedName("media_type")
                private final FileType fileType;

                @SerializedName("id")
                private final String id;

                @SerializedName("name")
                private final String name;

                @SerializedName("url")
                private final String url;

                public File(String str, String str2, String str3, FileType fileType) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    fileType.getClass();
                    this.id = str;
                    this.name = str2;
                    this.url = str3;
                    this.fileType = fileType;
                }

                public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, FileType fileType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = file.id;
                    }
                    if ((i & 2) != 0) {
                        str2 = file.name;
                    }
                    if ((i & 4) != 0) {
                        str3 = file.url;
                    }
                    if ((i & 8) != 0) {
                        fileType = file.fileType;
                    }
                    return file.copy(str, str2, str3, fileType);
                }

                public final String component1() {
                    return this.id;
                }

                public final String component2() {
                    return this.name;
                }

                public final String component3() {
                    return this.url;
                }

                public final FileType component4() {
                    return this.fileType;
                }

                public final File copy(String str, String str2, String str3, FileType fileType) {
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    fileType.getClass();
                    return new File(str, str2, str3, fileType);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof File)) {
                        return false;
                    }
                    File file = (File) obj;
                    return xj5.a(this.id, file.id) && xj5.a(this.name, file.name) && xj5.a(this.url, file.url) && this.fileType == file.fileType;
                }

                public final FileType getFileType() {
                    return this.fileType;
                }

                public final String getId() {
                    return this.id;
                }

                public final String getName() {
                    return this.name;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.fileType.hashCode() + ru3.c(ru3.c(this.id.hashCode() * 31, 31, this.name), 31, this.url);
                }

                public String toString() {
                    return "File(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", fileType=" + this.fileType + ')';
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilesAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, List<File> list) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                list.getClass();
                this.value = list;
            }

            public final List<File> getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !this.value.isEmpty();
            }

            public /* synthetic */ FilesAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, List list, int i, qq2 qq2Var) {
                this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? false : z, ticketAttributeType, list);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class UnSupported extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            private final Object value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnSupported(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, Object obj) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                obj.getClass();
                this.value = obj;
            }

            public final Object getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !z2a.w(this.value.toString());
            }

            public /* synthetic */ UnSupported(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, Object obj, int i, qq2 qq2Var) {
                this(str, str2, str3, z, ticketAttributeType, (i & 32) != 0 ? BuildConfig.FLAVOR : obj);
            }
        }

        private TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType) {
            this.id = str;
            this.identifier = str2;
            this.name = str3;
            this.required = z;
            this.type = ticketAttributeType;
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, qq2 qq2Var) {
            this(str, str2, str3, z, ticketAttributeType);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class DateTimeAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public /* synthetic */ DateTimeAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, qq2 qq2Var) {
                this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.DATETIME : ticketAttributeType, (i & 32) != 0 ? BuildConfig.FLAVOR : str4);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !z2a.w(this.value);
            }

            public DateTimeAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateTimeAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                str4.getClass();
                this.value = str4;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ListAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public /* synthetic */ ListAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, qq2 qq2Var) {
                this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.LIST : ticketAttributeType, (i & 32) != 0 ? BuildConfig.FLAVOR : str4);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !z2a.w(this.value);
            }

            public ListAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                str4.getClass();
                this.value = str4;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class PrimitiveAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public /* synthetic */ PrimitiveAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, qq2 qq2Var) {
                this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.STRING : ticketAttributeType, (i & 32) != 0 ? BuildConfig.FLAVOR : str4);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !z2a.w(this.value);
            }

            public PrimitiveAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4) {
                super(str, str2, str3, z, ticketAttributeType, null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                ticketAttributeType.getClass();
                str4.getClass();
                this.value = str4;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Status {
        public static final int $stable = 0;

        @SerializedName("created_date")
        private final long createdDate;

        @SerializedName("is_current_status")
        private final boolean isCurrentStatus;

        @SerializedName("status_detail")
        private final String statusDetail;

        @SerializedName("title")
        private final String title;

        @SerializedName("type")
        private final String type;

        public /* synthetic */ Status(String str, String str2, String str3, boolean z, long j, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j);
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.title;
            }
            if ((i & 2) != 0) {
                str2 = status.type;
            }
            if ((i & 4) != 0) {
                str3 = status.statusDetail;
            }
            if ((i & 8) != 0) {
                z = status.isCurrentStatus;
            }
            if ((i & 16) != 0) {
                j = status.createdDate;
            }
            long j2 = j;
            return status.copy(str, str2, str3, z, j2);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.statusDetail;
        }

        public final boolean component4() {
            return this.isCurrentStatus;
        }

        public final long component5() {
            return this.createdDate;
        }

        public final Status copy(String str, String str2, String str3, boolean z, long j) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new Status(str, str2, str3, z, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return xj5.a(this.title, status.title) && xj5.a(this.type, status.type) && xj5.a(this.statusDetail, status.statusDetail) && this.isCurrentStatus == status.isCurrentStatus && this.createdDate == status.createdDate;
        }

        public final long getCreatedDate() {
            return this.createdDate;
        }

        public final String getStatusDetail() {
            return this.statusDetail;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return Long.hashCode(this.createdDate) + uo2.a(ru3.c(ru3.c(this.title.hashCode() * 31, 31, this.type), 31, this.statusDetail), this.isCurrentStatus, 31);
        }

        public final boolean isCurrentStatus() {
            return this.isCurrentStatus;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Status(title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", statusDetail=");
            sb.append(this.statusDetail);
            sb.append(", isCurrentStatus=");
            sb.append(this.isCurrentStatus);
            sb.append(", createdDate=");
            return fh0.b(sb, this.createdDate, ')');
        }

        public Status(String str, String str2, String str3, boolean z, long j) {
            fk.b(str, str2, str3);
            this.title = str;
            this.type = str2;
            this.statusDetail = str3;
            this.isCurrentStatus = z;
            this.createdDate = j;
        }

        public Status() {
            this(null, null, null, false, 0L, 31, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List<Status> list, List<? extends TicketAttribute> list2, long j, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j2) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        status.getClass();
        list.getClass();
        list2.getClass();
        builder.getClass();
        this.id = str;
        this.publicId = str2;
        this.title = str3;
        this.description = str4;
        this.iconUrl = str5;
        this.emoji = str6;
        this.currentStatus = status;
        this.statusList = list;
        this.attributes = list2;
        this.ticketTypeId = j;
        this.assignee = builder;
        this.conversationId = str7;
        this.conversationButton = conversationButton;
        this.isRead = bool;
        this.latestStatusUpdatedAt = j2;
    }

    public Ticket() {
        this(null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 0L, 32767, null);
    }
}
