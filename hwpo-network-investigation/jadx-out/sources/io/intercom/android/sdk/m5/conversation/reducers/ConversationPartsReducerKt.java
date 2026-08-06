package io.intercom.android.sdk.m5.conversation.reducers;

import android.text.format.DateUtils;
import defpackage.e96;
import defpackage.hf3;
import defpackage.ph1;
import defpackage.th1;
import defpackage.ws0;
import defpackage.xj5;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EventContent;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationPartsReducerKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStyle.values().length];
            try {
                iArr[MessageStyle.TICKET_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStyle.MERGED_PRIMARY_CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final GroupingPosition getGroupingPosition(List<? extends Part> list, int i) {
        list.getClass();
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(list, i) && PartExtensionsKt.hasNextConcatPartNewStyle(list, i)) {
            return GroupingPosition.MIDDLE;
        }
        if (PartExtensionsKt.hasPreviousConcatPartNewStyle(list, i)) {
            return GroupingPosition.BOTTOM;
        }
        return PartExtensionsKt.hasNextConcatPartNewStyle(list, i) ? GroupingPosition.TOP : GroupingPosition.STANDALONE;
    }

    private static final boolean hasPendingMessageAfter(Part part, Map<String, PendingMessage> map) {
        Long l;
        long createdAt = part.getCreatedAt();
        Iterator<T> it = map.values().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        return l != null && createdAt < l.longValue();
    }

    public static final boolean isAdminOrAltParticipant(Part part, UserIdentity userIdentity) {
        part.getClass();
        userIdentity.getClass();
        return part.isAdmin() || !part.getParticipant().isUserWithId(userIdentity.getIntercomId());
    }

    private static final ContentRow reduceEvent(Part part) {
        List listH;
        MessageStyle messageStyle = part.getMessageStyle();
        int i = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
        if (i == 1) {
            String status = part.getEventData().getStatus();
            String eventAsPlainText = part.getEventData().getEventAsPlainText();
            long createdAt = part.getCreatedAt();
            String customStateLabel = part.getEventData().getCustomStateLabel();
            String customStatePrefix = part.getEventData().getCustomStatePrefix();
            String id = part.getId();
            id.getClass();
            return new ContentRow.TicketStatusRow(status, eventAsPlainText, createdAt, customStateLabel, customStatePrefix, id);
        }
        if (i == 2) {
            String mergedConversationId = part.getEventData().getMergedConversationId();
            String description = part.getEventData().getDescription();
            String id2 = part.getId();
            id2.getClass();
            return new ContentRow.MergedConversationRow(description, mergedConversationId, id2);
        }
        if (part.getEventData().getEventContent().isEmpty()) {
            listH = ws0.h(new EventLabelSegment(part.getEventData().getEventAsPlainText(), null));
        } else {
            List<EventContent> eventContent = part.getEventData().getEventContent();
            listH = new ArrayList(ph1.n(eventContent, 10));
            for (EventContent eventContent2 : eventContent) {
                listH.add(new EventLabelSegment(eventContent2.getText(), eventContent2.getWeight()));
            }
        }
        Avatar avatarCreate = Avatar.create(part.getEventData().getParticipant().getAvatar().getImageUrl(), part.getEventData().getParticipant().getInitial());
        avatarCreate.getClass();
        String id3 = part.getId();
        id3.getClass();
        return new ContentRow.EventRow(listH, avatarCreate, id3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    public static final List<ContentRow> reduceMessages(ConversationClientState conversationClientState, UserIdentity userIdentity, AppConfig appConfig) {
        conversationClientState.getClass();
        userIdentity.getClass();
        appConfig.getClass();
        Conversation conversation = conversationClientState.getConversation();
        if (conversation == null) {
            return hf3.t;
        }
        if (conversation.getTicket() != null && !ConversationExtensionsKt.hasNonTicketParts(conversation) && conversationClientState.getPendingMessages().isEmpty()) {
            return ws0.h(new ContentRow.BigTicketRow(TicketDetailReducerKt.computeTicketViewState$default(conversation.getTicket(), userIdentity, null, new TicketLaunchedFrom.Conversation(conversation.getTicket()), 4, null), conversation.getTicket().getId()));
        }
        e96 e96VarF = ws0.f();
        List<Part> listParts = conversation.parts();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listParts) {
            List<ReplyOption> replyOptions = ((Part) obj).getReplyOptions();
            replyOptions.getClass();
            if (replyOptions.isEmpty() || !conversation.getPreventEndUserReplies()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            String id = null;
            if (i2 >= size) {
                Object objH = th1.H(arrayList2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    Calendar calendar = Calendar.getInstance();
                    calendar.getClass();
                    calendar.setTime(new Date(1000 * ((Part) obj2).getCreatedAt()));
                    Integer numValueOf = Integer.valueOf(calendar.get(6));
                    Object arrayList3 = linkedHashMap.get(numValueOf);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(numValueOf, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    boolean zIsToday = DateUtils.isToday(((Part) th1.y(list)).getCreatedAt() * 1000);
                    if (!((Part) th1.y(list)).isInitialMessage() || (!PartExtensionsKt.isLinkCard((Part) th1.y(list)) && !zIsToday)) {
                        e96VarF.add(new ContentRow.DayDividerRow(((Part) th1.y(list)).getCreatedAt()));
                    }
                    Collection<PendingMessage> collectionValues = conversationClientState.getPendingMessages().values();
                    ArrayList arrayList4 = new ArrayList(ph1.n(collectionValues, 10));
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((PendingMessage) it.next()).getPart());
                    }
                    ArrayList arrayListK = th1.K(list, arrayList4);
                    e96 e96VarF2 = ws0.f();
                    ArrayList arrayList5 = new ArrayList(ph1.n(list, 10));
                    int i4 = 0;
                    for (Object obj3 : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            ?? r22 = id;
                            ws0.m();
                            throw r22;
                        }
                        Part part = (Part) obj3;
                        if (conversationClientState.getNewMessageId() != null && xj5.a(conversationClientState.getNewMessageId(), part.getId())) {
                            String id2 = part.getId();
                            id2.getClass();
                            e96VarF2.add(new ContentRow.NewMessagesRow(id2));
                        }
                        if (part.isInitialMessage() && PartExtensionsKt.isLinkCard(part)) {
                            e96VarF2.add(new ContentRow.AskedAboutRow(part));
                        } else if (part.isEvent().booleanValue()) {
                            e96VarF2.add(reduceEvent(part));
                        } else if (part.getMessageStyle() == MessageStyle.POST) {
                            e96VarF2.add(new ContentRow.PostCardRow(part, appConfig.getName()));
                        } else if (part.getMessageStyle() == MessageStyle.NOTE) {
                            e96VarF2.add(new ContentRow.NoteCardRow(part, appConfig.getName()));
                        } else if (part.getMessageStyle() == MessageStyle.FIN_ANSWER) {
                            e96VarF2.add(new ContentRow.FinAnswerRow(part, getGroupingPosition(arrayListK, i4)));
                        } else {
                            if (PartExtensionsKt.isQuickReplyOnly(part)) {
                                List<ReplyOption> replyOptions2 = part.getReplyOptions();
                                replyOptions2.getClass();
                                String id3 = part.getId();
                                id3.getClass();
                                e96VarF2.add(new ContentRow.QuickRepliesRow(replyOptions2, id3));
                            } else {
                                boolean zIsAdminOrAltParticipant = isAdminOrAltParticipant(part, userIdentity);
                                String id4 = part.getId();
                                Part part2 = (Part) objH;
                                if (part2 != null) {
                                    id = part2.getId();
                                }
                                boolean z = xj5.a(id4, id) && conversationClientState.getPendingMessages().isEmpty() && !conversationClientState.getFinStreamingData().isFinStreaming() && xj5.a(conversationClientState.getCurrentlyTypingState(), new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null));
                                part.setParentConversation(conversation);
                                ContentRow.BubbleMessageRow bubbleMessageRow = new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(part, z, zIsAdminOrAltParticipant, conversationClientState.getFailedAttributeIdentifiers(), conversationClientState.getLoadingAttributeIdentifiers()), getGroupingPosition(arrayListK, i4), null, false, false, 16, null);
                                if (shouldShowQuickReplies(part, z, zIsAdminOrAltParticipant)) {
                                    e96VarF2.add(bubbleMessageRow);
                                    List<ReplyOption> replyOptions3 = part.getReplyOptions();
                                    replyOptions3.getClass();
                                    String id5 = part.getId();
                                    id5.getClass();
                                    e96VarF2.add(new ContentRow.QuickRepliesRow(replyOptions3, id5));
                                } else {
                                    e96VarF2.add(bubbleMessageRow);
                                }
                            }
                            arrayList5.add(true);
                            i4 = i5;
                            id = id;
                        }
                        id = id;
                        arrayList5.add(true);
                        i4 = i5;
                        id = id;
                    }
                    e96VarF.addAll(ws0.e(e96VarF2));
                }
                return ws0.e(e96VarF);
            }
            Object obj4 = arrayList.get(i2);
            i2++;
            int i6 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            Part part3 = (Part) obj4;
            if (part3.getMessageStyle() != MessageStyle.QUICK_REPLY || (i == ws0.g(conversation.parts()) && !hasPendingMessageAfter(part3, conversationClientState.getPendingMessages()))) {
                arrayList2.add(obj4);
            }
            i = i6;
        }
    }

    private static final boolean shouldShowQuickReplies(Part part, boolean z, boolean z2) {
        if (!z) {
            return false;
        }
        List<ReplyOption> replyOptions = part.getReplyOptions();
        replyOptions.getClass();
        return !replyOptions.isEmpty() && z2;
    }
}
