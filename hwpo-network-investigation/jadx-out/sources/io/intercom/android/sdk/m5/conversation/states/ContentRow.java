package io.intercom.android.sdk.m5.conversation.states;

import defpackage.al;
import defpackage.fh0;
import defpackage.fk;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.tickets.TicketDetailState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ContentRow {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AskedAboutRow implements ContentRow {
        public static final int $stable = 8;
        private final Part part;

        public AskedAboutRow(Part part) {
            part.getClass();
            this.part = part;
        }

        public static /* synthetic */ AskedAboutRow copy$default(AskedAboutRow askedAboutRow, Part part, int i, Object obj) {
            if ((i & 1) != 0) {
                part = askedAboutRow.part;
            }
            return askedAboutRow.copy(part);
        }

        public final Part component1() {
            return this.part;
        }

        public final AskedAboutRow copy(Part part) {
            part.getClass();
            return new AskedAboutRow(part);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AskedAboutRow) && xj5.a(this.part, ((AskedAboutRow) obj).part);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "asked_about_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.part.hashCode();
        }

        public String toString() {
            return "AskedAboutRow(part=" + this.part + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class BigTicketRow implements ContentRow {
        public static final int $stable = 8;
        private final TicketDetailState.TicketDetailContentState ticketDetailContentState;
        private final String ticketId;

        public BigTicketRow(TicketDetailState.TicketDetailContentState ticketDetailContentState, String str) {
            ticketDetailContentState.getClass();
            str.getClass();
            this.ticketDetailContentState = ticketDetailContentState;
            this.ticketId = str;
        }

        public static /* synthetic */ BigTicketRow copy$default(BigTicketRow bigTicketRow, TicketDetailState.TicketDetailContentState ticketDetailContentState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                ticketDetailContentState = bigTicketRow.ticketDetailContentState;
            }
            if ((i & 2) != 0) {
                str = bigTicketRow.ticketId;
            }
            return bigTicketRow.copy(ticketDetailContentState, str);
        }

        public final TicketDetailState.TicketDetailContentState component1() {
            return this.ticketDetailContentState;
        }

        public final String component2() {
            return this.ticketId;
        }

        public final BigTicketRow copy(TicketDetailState.TicketDetailContentState ticketDetailContentState, String str) {
            ticketDetailContentState.getClass();
            str.getClass();
            return new BigTicketRow(ticketDetailContentState, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BigTicketRow)) {
                return false;
            }
            BigTicketRow bigTicketRow = (BigTicketRow) obj;
            return xj5.a(this.ticketDetailContentState, bigTicketRow.ticketDetailContentState) && xj5.a(this.ticketId, bigTicketRow.ticketId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "big_ticket_row_" + this.ticketId;
        }

        public final TicketDetailState.TicketDetailContentState getTicketDetailContentState() {
            return this.ticketDetailContentState;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return this.ticketId.hashCode() + (this.ticketDetailContentState.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BigTicketRow(ticketDetailContentState=");
            sb.append(this.ticketDetailContentState);
            sb.append(", ticketId=");
            return wu0.a(sb, this.ticketId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ComposerSuggestionRow implements ContentRow {
        public static final int $stable = 8;
        private final List<ReplySuggestion> suggestions;

        public ComposerSuggestionRow(List<ReplySuggestion> list) {
            list.getClass();
            this.suggestions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComposerSuggestionRow copy$default(ComposerSuggestionRow composerSuggestionRow, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = composerSuggestionRow.suggestions;
            }
            return composerSuggestionRow.copy(list);
        }

        public final List<ReplySuggestion> component1() {
            return this.suggestions;
        }

        public final ComposerSuggestionRow copy(List<ReplySuggestion> list) {
            list.getClass();
            return new ComposerSuggestionRow(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerSuggestionRow) && xj5.a(this.suggestions, ((ComposerSuggestionRow) obj).suggestions);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "composer_suggestion_row_" + this.suggestions.hashCode();
        }

        public final List<ReplySuggestion> getSuggestions() {
            return this.suggestions;
        }

        public int hashCode() {
            return this.suggestions.hashCode();
        }

        public String toString() {
            return zc6.a(new StringBuilder("ComposerSuggestionRow(suggestions="), this.suggestions, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DayDividerRow implements ContentRow {
        public static final int $stable = 0;
        private final long timestamp;

        public DayDividerRow(long j) {
            this.timestamp = j;
        }

        public static /* synthetic */ DayDividerRow copy$default(DayDividerRow dayDividerRow, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dayDividerRow.timestamp;
            }
            return dayDividerRow.copy(j);
        }

        public final long component1() {
            return this.timestamp;
        }

        public final DayDividerRow copy(long j) {
            return new DayDividerRow(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DayDividerRow) && this.timestamp == ((DayDividerRow) obj).timestamp;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "day_divider_row_" + Long.hashCode(this.timestamp);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        public String toString() {
            return fh0.b(new StringBuilder("DayDividerRow(timestamp="), this.timestamp, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class EventRow implements ContentRow {
        public static final int $stable = 8;
        private final Avatar avatar;
        private final List<EventLabelSegment> labelSegments;
        private final String partId;

        public EventRow(List<EventLabelSegment> list, Avatar avatar, String str) {
            list.getClass();
            avatar.getClass();
            str.getClass();
            this.labelSegments = list;
            this.avatar = avatar;
            this.partId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EventRow copy$default(EventRow eventRow, List list, Avatar avatar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eventRow.labelSegments;
            }
            if ((i & 2) != 0) {
                avatar = eventRow.avatar;
            }
            if ((i & 4) != 0) {
                str = eventRow.partId;
            }
            return eventRow.copy(list, avatar, str);
        }

        public final List<EventLabelSegment> component1() {
            return this.labelSegments;
        }

        public final Avatar component2() {
            return this.avatar;
        }

        public final String component3() {
            return this.partId;
        }

        public final EventRow copy(List<EventLabelSegment> list, Avatar avatar, String str) {
            list.getClass();
            avatar.getClass();
            str.getClass();
            return new EventRow(list, avatar, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventRow)) {
                return false;
            }
            EventRow eventRow = (EventRow) obj;
            return xj5.a(this.labelSegments, eventRow.labelSegments) && xj5.a(this.avatar, eventRow.avatar) && xj5.a(this.partId, eventRow.partId);
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "event_row_" + this.partId;
        }

        public final List<EventLabelSegment> getLabelSegments() {
            return this.labelSegments;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return this.partId.hashCode() + ((this.avatar.hashCode() + (this.labelSegments.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("EventRow(labelSegments=");
            sb.append(this.labelSegments);
            sb.append(", avatar=");
            sb.append(this.avatar);
            sb.append(", partId=");
            return wu0.a(sb, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class FinAnswerRow implements ContentRow {
        public static final int $stable = 8;
        private final GroupingPosition groupingPosition;
        private final Part part;

        public FinAnswerRow(Part part, GroupingPosition groupingPosition) {
            part.getClass();
            groupingPosition.getClass();
            this.part = part;
            this.groupingPosition = groupingPosition;
        }

        public static /* synthetic */ FinAnswerRow copy$default(FinAnswerRow finAnswerRow, Part part, GroupingPosition groupingPosition, int i, Object obj) {
            if ((i & 1) != 0) {
                part = finAnswerRow.part;
            }
            if ((i & 2) != 0) {
                groupingPosition = finAnswerRow.groupingPosition;
            }
            return finAnswerRow.copy(part, groupingPosition);
        }

        public final Part component1() {
            return this.part;
        }

        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        public final FinAnswerRow copy(Part part, GroupingPosition groupingPosition) {
            part.getClass();
            groupingPosition.getClass();
            return new FinAnswerRow(part, groupingPosition);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinAnswerRow)) {
                return false;
            }
            FinAnswerRow finAnswerRow = (FinAnswerRow) obj;
            return xj5.a(this.part, finAnswerRow.part) && this.groupingPosition == finAnswerRow.groupingPosition;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "fin_answer_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.groupingPosition.hashCode() + (this.part.hashCode() * 31);
        }

        public String toString() {
            return "FinAnswerRow(part=" + this.part + ", groupingPosition=" + this.groupingPosition + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class FinStreamingRow implements ContentRow {
        public static final int $stable = 8;
        private final List<Block> blocks;
        private final StreamingPart streamingPart;

        /* JADX WARN: Multi-variable type inference failed */
        public FinStreamingRow(List<? extends Block> list, StreamingPart streamingPart) {
            list.getClass();
            streamingPart.getClass();
            this.blocks = list;
            this.streamingPart = streamingPart;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinStreamingRow copy$default(FinStreamingRow finStreamingRow, List list, StreamingPart streamingPart, int i, Object obj) {
            if ((i & 1) != 0) {
                list = finStreamingRow.blocks;
            }
            if ((i & 2) != 0) {
                streamingPart = finStreamingRow.streamingPart;
            }
            return finStreamingRow.copy(list, streamingPart);
        }

        public final List<Block> component1() {
            return this.blocks;
        }

        public final StreamingPart component2() {
            return this.streamingPart;
        }

        public final FinStreamingRow copy(List<? extends Block> list, StreamingPart streamingPart) {
            list.getClass();
            streamingPart.getClass();
            return new FinStreamingRow(list, streamingPart);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinStreamingRow)) {
                return false;
            }
            FinStreamingRow finStreamingRow = (FinStreamingRow) obj;
            return xj5.a(this.blocks, finStreamingRow.blocks) && xj5.a(this.streamingPart, finStreamingRow.streamingPart);
        }

        public final List<Block> getBlocks() {
            return this.blocks;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "fin_streaming_row_" + this.blocks.hashCode();
        }

        public final StreamingPart getStreamingPart() {
            return this.streamingPart;
        }

        public int hashCode() {
            return this.streamingPart.hashCode() + (this.blocks.hashCode() * 31);
        }

        public String toString() {
            return "FinStreamingRow(blocks=" + this.blocks + ", streamingPart=" + this.streamingPart + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class FooterNoticeRow implements ContentRow {
        public static final int $stable = 8;
        private final FooterNoticeState footerNoticeState;

        public FooterNoticeRow(FooterNoticeState footerNoticeState) {
            footerNoticeState.getClass();
            this.footerNoticeState = footerNoticeState;
        }

        public static /* synthetic */ FooterNoticeRow copy$default(FooterNoticeRow footerNoticeRow, FooterNoticeState footerNoticeState, int i, Object obj) {
            if ((i & 1) != 0) {
                footerNoticeState = footerNoticeRow.footerNoticeState;
            }
            return footerNoticeRow.copy(footerNoticeState);
        }

        public final FooterNoticeState component1() {
            return this.footerNoticeState;
        }

        public final FooterNoticeRow copy(FooterNoticeState footerNoticeState) {
            footerNoticeState.getClass();
            return new FooterNoticeRow(footerNoticeState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterNoticeRow) && xj5.a(this.footerNoticeState, ((FooterNoticeRow) obj).footerNoticeState);
        }

        public final FooterNoticeState getFooterNoticeState() {
            return this.footerNoticeState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "footer_notice_row_" + this.footerNoticeState.hashCode();
        }

        public int hashCode() {
            return this.footerNoticeState.hashCode();
        }

        public String toString() {
            return "FooterNoticeRow(footerNoticeState=" + this.footerNoticeState + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MergedConversationRow implements ContentRow {
        public static final int $stable = 0;
        private final String conversationId;
        private final String description;
        private final String partId;

        public MergedConversationRow(String str, String str2, String str3) {
            str3.getClass();
            this.description = str;
            this.conversationId = str2;
            this.partId = str3;
        }

        public static /* synthetic */ MergedConversationRow copy$default(MergedConversationRow mergedConversationRow, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mergedConversationRow.description;
            }
            if ((i & 2) != 0) {
                str2 = mergedConversationRow.conversationId;
            }
            if ((i & 4) != 0) {
                str3 = mergedConversationRow.partId;
            }
            return mergedConversationRow.copy(str, str2, str3);
        }

        public final String component1() {
            return this.description;
        }

        public final String component2() {
            return this.conversationId;
        }

        public final String component3() {
            return this.partId;
        }

        public final MergedConversationRow copy(String str, String str2, String str3) {
            str3.getClass();
            return new MergedConversationRow(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MergedConversationRow)) {
                return false;
            }
            MergedConversationRow mergedConversationRow = (MergedConversationRow) obj;
            return xj5.a(this.description, mergedConversationRow.description) && xj5.a(this.conversationId, mergedConversationRow.conversationId) && xj5.a(this.partId, mergedConversationRow.partId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getDescription() {
            return this.description;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "merged_conversation_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            String str = this.description;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.conversationId;
            return this.partId.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MergedConversationRow(description=");
            sb.append(this.description);
            sb.append(", conversationId=");
            sb.append(this.conversationId);
            sb.append(", partId=");
            return wu0.a(sb, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NewMessagesRow implements ContentRow {
        public static final int $stable = 0;
        private final String partId;

        public NewMessagesRow(String str) {
            str.getClass();
            this.partId = str;
        }

        public static /* synthetic */ NewMessagesRow copy$default(NewMessagesRow newMessagesRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newMessagesRow.partId;
            }
            return newMessagesRow.copy(str);
        }

        public final String component1() {
            return this.partId;
        }

        public final NewMessagesRow copy(String str) {
            str.getClass();
            return new NewMessagesRow(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewMessagesRow) && xj5.a(this.partId, ((NewMessagesRow) obj).partId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "new_messages_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public int hashCode() {
            return this.partId.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("NewMessagesRow(partId="), this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NoteCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public NoteCardRow(Part part, String str) {
            part.getClass();
            str.getClass();
            this.part = part;
            this.companyName = str;
        }

        public static /* synthetic */ NoteCardRow copy$default(NoteCardRow noteCardRow, Part part, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                part = noteCardRow.part;
            }
            if ((i & 2) != 0) {
                str = noteCardRow.companyName;
            }
            return noteCardRow.copy(part, str);
        }

        public final Part component1() {
            return this.part;
        }

        public final String component2() {
            return this.companyName;
        }

        public final NoteCardRow copy(Part part, String str) {
            part.getClass();
            str.getClass();
            return new NoteCardRow(part, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoteCardRow)) {
                return false;
            }
            NoteCardRow noteCardRow = (NoteCardRow) obj;
            return xj5.a(this.part, noteCardRow.part) && xj5.a(this.companyName, noteCardRow.companyName);
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "note_card_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.companyName.hashCode() + (this.part.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NoteCardRow(part=");
            sb.append(this.part);
            sb.append(", companyName=");
            return wu0.a(sb, this.companyName, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class PostCardRow implements ContentRow {
        public static final int $stable = 8;
        private final String companyName;
        private final Part part;

        public PostCardRow(Part part, String str) {
            part.getClass();
            str.getClass();
            this.part = part;
            this.companyName = str;
        }

        public static /* synthetic */ PostCardRow copy$default(PostCardRow postCardRow, Part part, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                part = postCardRow.part;
            }
            if ((i & 2) != 0) {
                str = postCardRow.companyName;
            }
            return postCardRow.copy(part, str);
        }

        public final Part component1() {
            return this.part;
        }

        public final String component2() {
            return this.companyName;
        }

        public final PostCardRow copy(Part part, String str) {
            part.getClass();
            str.getClass();
            return new PostCardRow(part, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PostCardRow)) {
                return false;
            }
            PostCardRow postCardRow = (PostCardRow) obj;
            return xj5.a(this.part, postCardRow.part) && xj5.a(this.companyName, postCardRow.companyName);
        }

        public final String getCompanyName() {
            return this.companyName;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "post_card_row_" + this.part.getId();
        }

        public final Part getPart() {
            return this.part;
        }

        public int hashCode() {
            return this.companyName.hashCode() + (this.part.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PostCardRow(part=");
            sb.append(this.part);
            sb.append(", companyName=");
            return wu0.a(sb, this.companyName, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class QuickRepliesRow implements ContentRow {
        public static final int $stable = 8;
        private final String partId;
        private final List<ReplyOption> replyOptions;

        public QuickRepliesRow(List<ReplyOption> list, String str) {
            list.getClass();
            str.getClass();
            this.replyOptions = list;
            this.partId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuickRepliesRow copy$default(QuickRepliesRow quickRepliesRow, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = quickRepliesRow.replyOptions;
            }
            if ((i & 2) != 0) {
                str = quickRepliesRow.partId;
            }
            return quickRepliesRow.copy(list, str);
        }

        public final List<ReplyOption> component1() {
            return this.replyOptions;
        }

        public final String component2() {
            return this.partId;
        }

        public final QuickRepliesRow copy(List<ReplyOption> list, String str) {
            list.getClass();
            str.getClass();
            return new QuickRepliesRow(list, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickRepliesRow)) {
                return false;
            }
            QuickRepliesRow quickRepliesRow = (QuickRepliesRow) obj;
            return xj5.a(this.replyOptions, quickRepliesRow.replyOptions) && xj5.a(this.partId, quickRepliesRow.partId);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "quick_replies_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final List<ReplyOption> getReplyOptions() {
            return this.replyOptions;
        }

        public int hashCode() {
            return this.partId.hashCode() + (this.replyOptions.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("QuickRepliesRow(replyOptions=");
            sb.append(this.replyOptions);
            sb.append(", partId=");
            return wu0.a(sb, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SpecialNoticeRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public SpecialNoticeRow(String str) {
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ SpecialNoticeRow copy$default(SpecialNoticeRow specialNoticeRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = specialNoticeRow.message;
            }
            return specialNoticeRow.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final SpecialNoticeRow copy(String str) {
            str.getClass();
            return new SpecialNoticeRow(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpecialNoticeRow) && xj5.a(this.message, ((SpecialNoticeRow) obj).message);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "special_notice_row_" + this.message.hashCode();
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("SpecialNoticeRow(message="), this.message, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TeamIntroRow implements ContentRow {
        public static final int $stable = 0;
        private final String message;

        public TeamIntroRow(String str) {
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ TeamIntroRow copy$default(TeamIntroRow teamIntroRow, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = teamIntroRow.message;
            }
            return teamIntroRow.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final TeamIntroRow copy(String str) {
            str.getClass();
            return new TeamIntroRow(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TeamIntroRow) && xj5.a(this.message, ((TeamIntroRow) obj).message);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "team_intro_row_" + this.message.hashCode();
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("TeamIntroRow(message="), this.message, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TicketStatusRow implements ContentRow {
        public static final int $stable = 0;
        private final long createdAt;
        private final String customStateLabel;
        private final String customStatePrefix;
        private final String partId;
        private final String ticketEventStatus;
        private final String ticketStatusText;

        public TicketStatusRow(String str, String str2, long j, String str3, String str4, String str5) {
            fk.b(str, str2, str5);
            this.ticketEventStatus = str;
            this.ticketStatusText = str2;
            this.createdAt = j;
            this.customStateLabel = str3;
            this.customStatePrefix = str4;
            this.partId = str5;
        }

        public static /* synthetic */ TicketStatusRow copy$default(TicketStatusRow ticketStatusRow, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketStatusRow.ticketEventStatus;
            }
            if ((i & 2) != 0) {
                str2 = ticketStatusRow.ticketStatusText;
            }
            if ((i & 4) != 0) {
                j = ticketStatusRow.createdAt;
            }
            if ((i & 8) != 0) {
                str3 = ticketStatusRow.customStateLabel;
            }
            if ((i & 16) != 0) {
                str4 = ticketStatusRow.customStatePrefix;
            }
            if ((i & 32) != 0) {
                str5 = ticketStatusRow.partId;
            }
            String str6 = str5;
            String str7 = str3;
            long j2 = j;
            return ticketStatusRow.copy(str, str2, j2, str7, str4, str6);
        }

        public final String component1() {
            return this.ticketEventStatus;
        }

        public final String component2() {
            return this.ticketStatusText;
        }

        public final long component3() {
            return this.createdAt;
        }

        public final String component4() {
            return this.customStateLabel;
        }

        public final String component5() {
            return this.customStatePrefix;
        }

        public final String component6() {
            return this.partId;
        }

        public final TicketStatusRow copy(String str, String str2, long j, String str3, String str4, String str5) {
            str.getClass();
            str2.getClass();
            str5.getClass();
            return new TicketStatusRow(str, str2, j, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketStatusRow)) {
                return false;
            }
            TicketStatusRow ticketStatusRow = (TicketStatusRow) obj;
            return xj5.a(this.ticketEventStatus, ticketStatusRow.ticketEventStatus) && xj5.a(this.ticketStatusText, ticketStatusRow.ticketStatusText) && this.createdAt == ticketStatusRow.createdAt && xj5.a(this.customStateLabel, ticketStatusRow.customStateLabel) && xj5.a(this.customStatePrefix, ticketStatusRow.customStatePrefix) && xj5.a(this.partId, ticketStatusRow.partId);
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getCustomStateLabel() {
            return this.customStateLabel;
        }

        public final String getCustomStatePrefix() {
            return this.customStatePrefix;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "ticket_status_row_" + this.partId;
        }

        public final String getPartId() {
            return this.partId;
        }

        public final String getTicketEventStatus() {
            return this.ticketEventStatus;
        }

        public final String getTicketStatusText() {
            return this.ticketStatusText;
        }

        public int hashCode() {
            int iC = al.c(this.createdAt, ru3.c(this.ticketEventStatus.hashCode() * 31, 31, this.ticketStatusText), 31);
            String str = this.customStateLabel;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customStatePrefix;
            return this.partId.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TicketStatusRow(ticketEventStatus=");
            sb.append(this.ticketEventStatus);
            sb.append(", ticketStatusText=");
            sb.append(this.ticketStatusText);
            sb.append(", createdAt=");
            sb.append(this.createdAt);
            sb.append(", customStateLabel=");
            sb.append(this.customStateLabel);
            sb.append(", customStatePrefix=");
            sb.append(this.customStatePrefix);
            sb.append(", partId=");
            return wu0.a(sb, this.partId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TypingIndicatorRow implements ContentRow {
        public static final int $stable = 8;
        private final CurrentlyTypingState currentlyTypingState;

        public TypingIndicatorRow(CurrentlyTypingState currentlyTypingState) {
            currentlyTypingState.getClass();
            this.currentlyTypingState = currentlyTypingState;
        }

        public static /* synthetic */ TypingIndicatorRow copy$default(TypingIndicatorRow typingIndicatorRow, CurrentlyTypingState currentlyTypingState, int i, Object obj) {
            if ((i & 1) != 0) {
                currentlyTypingState = typingIndicatorRow.currentlyTypingState;
            }
            return typingIndicatorRow.copy(currentlyTypingState);
        }

        public final CurrentlyTypingState component1() {
            return this.currentlyTypingState;
        }

        public final TypingIndicatorRow copy(CurrentlyTypingState currentlyTypingState) {
            currentlyTypingState.getClass();
            return new TypingIndicatorRow(currentlyTypingState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TypingIndicatorRow) && xj5.a(this.currentlyTypingState, ((TypingIndicatorRow) obj).currentlyTypingState);
        }

        public final CurrentlyTypingState getCurrentlyTypingState() {
            return this.currentlyTypingState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "typing_indicator_row_" + this.currentlyTypingState.hashCode();
        }

        public int hashCode() {
            return this.currentlyTypingState.hashCode();
        }

        public String toString() {
            return "TypingIndicatorRow(currentlyTypingState=" + this.currentlyTypingState + ')';
        }
    }

    String getKey();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class BubbleMessageRow implements ContentRow {
        public static final int $stable = 8;
        private final PendingMessage.FailedMediaUploadData failedMediaUploadData;
        private final GroupingPosition groupingPosition;
        private final boolean isFailed;
        private final boolean isPending;
        private final PartWrapper partWrapper;

        public BubbleMessageRow(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedMediaUploadData failedMediaUploadData, boolean z, boolean z2) {
            partWrapper.getClass();
            groupingPosition.getClass();
            this.partWrapper = partWrapper;
            this.groupingPosition = groupingPosition;
            this.failedMediaUploadData = failedMediaUploadData;
            this.isFailed = z;
            this.isPending = z2;
        }

        public static /* synthetic */ BubbleMessageRow copy$default(BubbleMessageRow bubbleMessageRow, PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedMediaUploadData failedMediaUploadData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                partWrapper = bubbleMessageRow.partWrapper;
            }
            if ((i & 2) != 0) {
                groupingPosition = bubbleMessageRow.groupingPosition;
            }
            if ((i & 4) != 0) {
                failedMediaUploadData = bubbleMessageRow.failedMediaUploadData;
            }
            if ((i & 8) != 0) {
                z = bubbleMessageRow.isFailed;
            }
            if ((i & 16) != 0) {
                z2 = bubbleMessageRow.isPending;
            }
            boolean z3 = z2;
            PendingMessage.FailedMediaUploadData failedMediaUploadData2 = failedMediaUploadData;
            return bubbleMessageRow.copy(partWrapper, groupingPosition, failedMediaUploadData2, z, z3);
        }

        public final PartWrapper component1() {
            return this.partWrapper;
        }

        public final GroupingPosition component2() {
            return this.groupingPosition;
        }

        public final PendingMessage.FailedMediaUploadData component3() {
            return this.failedMediaUploadData;
        }

        public final boolean component4() {
            return this.isFailed;
        }

        public final boolean component5() {
            return this.isPending;
        }

        public final BubbleMessageRow copy(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedMediaUploadData failedMediaUploadData, boolean z, boolean z2) {
            partWrapper.getClass();
            groupingPosition.getClass();
            return new BubbleMessageRow(partWrapper, groupingPosition, failedMediaUploadData, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleMessageRow)) {
                return false;
            }
            BubbleMessageRow bubbleMessageRow = (BubbleMessageRow) obj;
            return xj5.a(this.partWrapper, bubbleMessageRow.partWrapper) && this.groupingPosition == bubbleMessageRow.groupingPosition && xj5.a(this.failedMediaUploadData, bubbleMessageRow.failedMediaUploadData) && this.isFailed == bubbleMessageRow.isFailed && this.isPending == bubbleMessageRow.isPending;
        }

        public final PendingMessage.FailedMediaUploadData getFailedMediaUploadData() {
            return this.failedMediaUploadData;
        }

        public final GroupingPosition getGroupingPosition() {
            return this.groupingPosition;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ContentRow
        public String getKey() {
            return "message_row_" + this.partWrapper.getPart().getId();
        }

        public final PartWrapper getPartWrapper() {
            return this.partWrapper;
        }

        public int hashCode() {
            int iHashCode = (this.groupingPosition.hashCode() + (this.partWrapper.hashCode() * 31)) * 31;
            PendingMessage.FailedMediaUploadData failedMediaUploadData = this.failedMediaUploadData;
            return Boolean.hashCode(this.isPending) + uo2.a((iHashCode + (failedMediaUploadData == null ? 0 : failedMediaUploadData.hashCode())) * 31, this.isFailed, 31);
        }

        public final boolean isFailed() {
            return this.isFailed;
        }

        public final boolean isPending() {
            return this.isPending;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BubbleMessageRow(partWrapper=");
            sb.append(this.partWrapper);
            sb.append(", groupingPosition=");
            sb.append(this.groupingPosition);
            sb.append(", failedMediaUploadData=");
            sb.append(this.failedMediaUploadData);
            sb.append(", isFailed=");
            sb.append(this.isFailed);
            sb.append(", isPending=");
            return pi1.a(sb, this.isPending, ')');
        }

        public /* synthetic */ BubbleMessageRow(PartWrapper partWrapper, GroupingPosition groupingPosition, PendingMessage.FailedMediaUploadData failedMediaUploadData, boolean z, boolean z2, int i, qq2 qq2Var) {
            this(partWrapper, groupingPosition, failedMediaUploadData, z, (i & 16) != 0 ? false : z2);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class PartWrapper {
            public static final int $stable = 8;
            private final List<String> failedAttributeIdentifiers;
            private final boolean isAdminOrAltParticipant;
            private final boolean isLastPart;
            private final List<String> loadingAttributeIdentifiers;
            private final Part part;

            public PartWrapper(Part part, boolean z, boolean z2, List<String> list, List<String> list2) {
                part.getClass();
                list.getClass();
                list2.getClass();
                this.part = part;
                this.isLastPart = z;
                this.isAdminOrAltParticipant = z2;
                this.failedAttributeIdentifiers = list;
                this.loadingAttributeIdentifiers = list2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PartWrapper copy$default(PartWrapper partWrapper, Part part, boolean z, boolean z2, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    part = partWrapper.part;
                }
                if ((i & 2) != 0) {
                    z = partWrapper.isLastPart;
                }
                if ((i & 4) != 0) {
                    z2 = partWrapper.isAdminOrAltParticipant;
                }
                if ((i & 8) != 0) {
                    list = partWrapper.failedAttributeIdentifiers;
                }
                if ((i & 16) != 0) {
                    list2 = partWrapper.loadingAttributeIdentifiers;
                }
                List list3 = list2;
                boolean z3 = z2;
                return partWrapper.copy(part, z, z3, list, list3);
            }

            public final Part component1() {
                return this.part;
            }

            public final boolean component2() {
                return this.isLastPart;
            }

            public final boolean component3() {
                return this.isAdminOrAltParticipant;
            }

            public final List<String> component4() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> component5() {
                return this.loadingAttributeIdentifiers;
            }

            public final PartWrapper copy(Part part, boolean z, boolean z2, List<String> list, List<String> list2) {
                part.getClass();
                list.getClass();
                list2.getClass();
                return new PartWrapper(part, z, z2, list, list2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PartWrapper)) {
                    return false;
                }
                PartWrapper partWrapper = (PartWrapper) obj;
                return xj5.a(this.part, partWrapper.part) && this.isLastPart == partWrapper.isLastPart && this.isAdminOrAltParticipant == partWrapper.isAdminOrAltParticipant && xj5.a(this.failedAttributeIdentifiers, partWrapper.failedAttributeIdentifiers) && xj5.a(this.loadingAttributeIdentifiers, partWrapper.loadingAttributeIdentifiers);
            }

            public final List<String> getFailedAttributeIdentifiers() {
                return this.failedAttributeIdentifiers;
            }

            public final List<String> getLoadingAttributeIdentifiers() {
                return this.loadingAttributeIdentifiers;
            }

            public final Part getPart() {
                return this.part;
            }

            public int hashCode() {
                return this.loadingAttributeIdentifiers.hashCode() + ho2.a(uo2.a(uo2.a(this.part.hashCode() * 31, this.isLastPart, 31), this.isAdminOrAltParticipant, 31), 31, this.failedAttributeIdentifiers);
            }

            public final boolean isAdminOrAltParticipant() {
                return this.isAdminOrAltParticipant;
            }

            public final boolean isLastPart() {
                return this.isLastPart;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("PartWrapper(part=");
                sb.append(this.part);
                sb.append(", isLastPart=");
                sb.append(this.isLastPart);
                sb.append(", isAdminOrAltParticipant=");
                sb.append(this.isAdminOrAltParticipant);
                sb.append(", failedAttributeIdentifiers=");
                sb.append(this.failedAttributeIdentifiers);
                sb.append(", loadingAttributeIdentifiers=");
                return zc6.a(sb, this.loadingAttributeIdentifiers, ')');
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ PartWrapper(Part part, boolean z, boolean z2, List list, List list2, int i, qq2 qq2Var) {
                int i2 = i & 8;
                hf3 hf3Var = hf3.t;
                this(part, z, z2, i2 != 0 ? hf3Var : list, (i & 16) != 0 ? hf3Var : list2);
            }
        }
    }
}
