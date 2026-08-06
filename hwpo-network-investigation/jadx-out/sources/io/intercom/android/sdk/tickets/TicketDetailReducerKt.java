package io.intercom.android.sdk.tickets;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ph1;
import defpackage.th1;
import defpackage.ws0;
import defpackage.xj5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailReducerKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ticket.ConversationButton.IconType.values().length];
            try {
                iArr[Ticket.ConversationButton.IconType.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ticket.ConversationButton.IconType.CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TicketDetailState.TicketDetailContentState computeTicketViewState(Ticket ticket, UserIdentity userIdentity, List<AvatarWrapper> list, TicketLaunchedFrom ticketLaunchedFrom) {
        List listH;
        ticket.getClass();
        userIdentity.getClass();
        list.getClass();
        ticketLaunchedFrom.getClass();
        String title = ticket.getTitle();
        Participant participantBuild = ticket.getAssignee().build();
        participantBuild.getClass();
        if (!isUnassignedOrBot(participantBuild) || list.isEmpty()) {
            Avatar avatar = ticket.getAssignee().build().getAvatar();
            avatar.getClass();
            listH = ws0.h(new AvatarWrapper(avatar, false, 2, null));
        } else {
            listH = th1.O(3, list);
        }
        List list2 = listH;
        String statusDetail = ticket.getCurrentStatus().getStatusDetail();
        long jM527getColor0d7_KjU = toTicketStatus(ticket.getCurrentStatus()).m527getColor0d7_KjU();
        List<Ticket.Status> statusList = ticket.getStatusList();
        ArrayList arrayList = new ArrayList(ph1.n(statusList, 10));
        for (Ticket.Status status : statusList) {
            arrayList.add(new TicketTimelineCardState.ProgressSection(isDone(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus())), isLoading(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus()))));
        }
        TicketTimelineCardState ticketTimelineCardState = new TicketTimelineCardState(list2, statusDetail, BuildConfig.FLAVOR, jM527getColor0d7_KjU, arrayList, ticket.getCurrentStatus().getTitle(), Long.valueOf(ticket.getLatestStatusUpdatedAt()), null);
        List<Ticket.TicketAttribute> attributes = ticket.getAttributes();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : attributes) {
            if (((Ticket.TicketAttribute) obj).hasValue()) {
                arrayList2.add(obj);
            }
        }
        String email = userIdentity.getEmail();
        email.getClass();
        return new TicketDetailState.TicketDetailContentState(title, ticketTimelineCardState, arrayList2, email, ticket.getConversationId(), conversationButtonState(ticket.getConversationButton(), ticketLaunchedFrom));
    }

    public static /* synthetic */ TicketDetailState.TicketDetailContentState computeTicketViewState$default(Ticket ticket, UserIdentity userIdentity, List list, TicketLaunchedFrom ticketLaunchedFrom, int i, Object obj) {
        if ((i & 4) != 0) {
            list = hf3.t;
        }
        return computeTicketViewState(ticket, userIdentity, list, ticketLaunchedFrom);
    }

    private static final ConversationButtonState conversationButtonState(Ticket.ConversationButton conversationButton, TicketLaunchedFrom ticketLaunchedFrom) {
        String text;
        boolean z = ((ticketLaunchedFrom instanceof TicketLaunchedFrom.Conversation) || conversationButton == null) ? false : true;
        Integer numValueOf = null;
        Ticket.ConversationButton.IconType icon = conversationButton != null ? conversationButton.getIcon() : null;
        int i = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i == 2) {
            numValueOf = Integer.valueOf(R.drawable.intercom_messages_icon);
        }
        if (conversationButton == null || (text = conversationButton.getText()) == null) {
            text = BuildConfig.FLAVOR;
        }
        return new ConversationButtonState(z, numValueOf, new StringProvider.ActualString(text));
    }

    public static final boolean isDone(TicketStatus ticketStatus, TicketStatus ticketStatus2) {
        ticketStatus.getClass();
        ticketStatus2.getClass();
        return ticketStatus2.ordinal() >= ticketStatus.ordinal();
    }

    public static final boolean isLoading(TicketStatus ticketStatus, TicketStatus ticketStatus2) {
        ticketStatus.getClass();
        ticketStatus2.getClass();
        if (ticketStatus2.ordinal() != ticketStatus.ordinal()) {
            return false;
        }
        int iOrdinal = ticketStatus2.ordinal();
        TicketStatus[] ticketStatusArrValues = TicketStatus.values();
        ticketStatusArrValues.getClass();
        return iOrdinal < ticketStatusArrValues.length - 1;
    }

    private static final boolean isUnassignedOrBot(Participant participant) {
        return xj5.a(participant, Participant.create(BuildConfig.FLAVOR, BuildConfig.FLAVOR, Participant.USER_TYPE, BuildConfig.FLAVOR, Avatar.create(BuildConfig.FLAVOR, BuildConfig.FLAVOR), Boolean.FALSE)) || participant.isBot().booleanValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final TicketStatus toTicketStatus(Ticket.Status status) {
        status.getClass();
        String type = status.getType();
        switch (type.hashCode()) {
            case -882067636:
                if (type.equals("waiting_on_customer")) {
                    return TicketStatus.WaitingOnCustomer;
                }
                break;
            case -753541113:
                if (type.equals("in_progress")) {
                    return TicketStatus.InProgress;
                }
                break;
            case -341328904:
                if (type.equals("resolved")) {
                    return TicketStatus.Resolved;
                }
                break;
            case 348678395:
                if (type.equals(MetricTracker.Action.SUBMITTED)) {
                    return TicketStatus.Submitted;
                }
                break;
        }
        return TicketStatus.Submitted;
    }
}
