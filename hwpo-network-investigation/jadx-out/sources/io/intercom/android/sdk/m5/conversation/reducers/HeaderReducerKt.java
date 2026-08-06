package io.intercom.android.sdk.m5.conversation.reducers;

import com.intercom.twig.BuildConfig;
import defpackage.e96;
import defpackage.hf3;
import defpackage.ph1;
import defpackage.u;
import defpackage.uh1;
import defpackage.ws0;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.PushNotificationsBannerState;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderReducerKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Header.Collapsed.HeaderIconType.values().length];
            try {
                iArr[Header.Collapsed.HeaderIconType.CLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Header.Collapsed.HeaderIconType.AI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String getCappedUnreadCountString(int i) {
        if (i > 9) {
            return "9+";
        }
        return i == 0 ? BuildConfig.FLAVOR : String.valueOf(i);
    }

    private static final int getNavIcon(LaunchMode launchMode) {
        return launchMode == LaunchMode.PROGRAMMATIC ? R.drawable.intercom_ic_close : R.drawable.intercom_ic_back;
    }

    public static final List<HeaderMenuItem> reduceHeaderMenuItems(AppConfig appConfig, int i, boolean z, LaunchMode launchMode, int i2) {
        HeaderMenuItem.TotalCountIndicator unreadCountIndicator;
        appConfig.getClass();
        launchMode.getClass();
        e96 e96VarF = ws0.f();
        if (launchMode == LaunchMode.PROGRAMMATIC) {
            String cappedUnreadCountString = getCappedUnreadCountString(i);
            if (i != 0 || i2 <= 0) {
                unreadCountIndicator = i > 0 ? new HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator(cappedUnreadCountString) : HeaderMenuItem.TotalCountIndicator.NoIndicator.INSTANCE;
            } else {
                unreadCountIndicator = HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator.INSTANCE;
            }
            HeaderMenuItem.TotalCountIndicator totalCountIndicator = unreadCountIndicator;
            String spaceLabelIfExists = appConfig.getSpaceLabelIfExists(Space.Type.MESSAGES);
            e96VarF.add(new HeaderMenuItem.Messages(totalCountIndicator, cappedUnreadCountString, false, spaceLabelIfExists != null ? new StringProvider.ActualString(spaceLabelIfExists) : new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_messages_space_title, null, 2, null), 4, null));
            if (AppConfigExtensionsKt.canStartNewConversation(appConfig)) {
                e96VarF.add(new HeaderMenuItem.StartNewConversation(!z, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_new_conversation, null, 2, null)));
            }
            if (appConfig.isSpaceEnabled(Space.Type.HELP)) {
                e96VarF.add(new HeaderMenuItem.Help(true, new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_help_space_title, null, 2, null)));
            }
            Space.Type type = Space.Type.TICKETS;
            if (appConfig.isSpaceEnabled(type)) {
                boolean z2 = i2 > 0;
                String spaceLabelIfExists2 = appConfig.getSpaceLabelIfExists(type);
                e96VarF.add(new HeaderMenuItem.Tickets(z2, true, spaceLabelIfExists2 != null ? new StringProvider.ActualString(spaceLabelIfExists2) : new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_tickets_space_title, null, 2, null)));
            }
        }
        return ws0.e(e96VarF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [io.intercom.android.sdk.ui.common.StringProvider] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Integer] */
    public static final TopAppBarUiState reduceTopAppBarUiState(boolean z, boolean z2, Conversation conversation, Header header, AppConfig appConfig, int i, int i2, LaunchMode launchMode, PushNotificationsBannerState pushNotificationsBannerState) {
        Header header2;
        TopAppBarUiState topAppBarUiState;
        TicketProgressRowState ticketProgressRowState;
        Object objValueOf;
        StringProvider.ActualString actualString;
        List arrayList;
        List<Avatar.Builder> avatars;
        int i3;
        appConfig.getClass();
        launchMode.getClass();
        List<HeaderMenuItem> listReduceHeaderMenuItems = reduceHeaderMenuItems(appConfig, i, z, launchMode, i2);
        if (z && header == null) {
            TopAppBarUiState topAppBarUiState2 = TopAppBarUiState.Companion.getDefault();
            return topAppBarUiState2.m106copyN4y9b34((32765 & 1) != 0 ? topAppBarUiState2.title : null, (32765 & 2) != 0 ? topAppBarUiState2.navIcon : Integer.valueOf(getNavIcon(launchMode)), (32765 & 4) != 0 ? topAppBarUiState2.subTitle : null, (32765 & 8) != 0 ? topAppBarUiState2.subTitleLeadingIcon : null, (32765 & 16) != 0 ? topAppBarUiState2.avatars : null, (32765 & 32) != 0 ? topAppBarUiState2.displayActiveIndicator : false, (32765 & 64) != 0 ? topAppBarUiState2.ticketStatusState : null, (32765 & 128) != 0 ? topAppBarUiState2.headerMenuItems : listReduceHeaderMenuItems, (32765 & 256) != 0 ? topAppBarUiState2.backgroundColor : null, (32765 & 512) != 0 ? topAppBarUiState2.backgroundColorDark : null, (32765 & 1024) != 0 ? topAppBarUiState2.contentColor : null, (32765 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? topAppBarUiState2.contentColorDark : null, (32765 & 4096) != 0 ? topAppBarUiState2.subTitleColor : null, (32765 & 8192) != 0 ? topAppBarUiState2.subTitleColorDark : null, (32765 & 16384) != 0 ? topAppBarUiState2.pushNotificationsBannerState : pushNotificationsBannerState);
        }
        if (conversation == null || (header2 = conversation.getHeader()) == null) {
            if (header == null) {
                TopAppBarUiState topAppBarUiState3 = TopAppBarUiState.Companion.getDefault();
                return topAppBarUiState3.m106copyN4y9b34((32765 & 1) != 0 ? topAppBarUiState3.title : null, (32765 & 2) != 0 ? topAppBarUiState3.navIcon : Integer.valueOf(getNavIcon(launchMode)), (32765 & 4) != 0 ? topAppBarUiState3.subTitle : null, (32765 & 8) != 0 ? topAppBarUiState3.subTitleLeadingIcon : null, (32765 & 16) != 0 ? topAppBarUiState3.avatars : null, (32765 & 32) != 0 ? topAppBarUiState3.displayActiveIndicator : false, (32765 & 64) != 0 ? topAppBarUiState3.ticketStatusState : null, (32765 & 128) != 0 ? topAppBarUiState3.headerMenuItems : listReduceHeaderMenuItems, (32765 & 256) != 0 ? topAppBarUiState3.backgroundColor : null, (32765 & 512) != 0 ? topAppBarUiState3.backgroundColorDark : null, (32765 & 1024) != 0 ? topAppBarUiState3.contentColor : null, (32765 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? topAppBarUiState3.contentColorDark : null, (32765 & 4096) != 0 ? topAppBarUiState3.subTitleColor : null, (32765 & 8192) != 0 ? topAppBarUiState3.subTitleColorDark : null, (32765 & 16384) != 0 ? topAppBarUiState3.pushNotificationsBannerState : pushNotificationsBannerState);
            }
            header2 = header;
        }
        long composeColor$default = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColor(), 0.0f, 1, null);
        long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(header2.getBackgroundColorDark(), 0.0f, 1, null);
        long composeColor$default3 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColor(), 0.0f, 1, null);
        long composeColor$default4 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundPrimaryColorDark(), 0.0f, 1, null);
        Header header3 = header2;
        long composeColor$default5 = ColorExtensionsKt.toComposeColor$default(header2.getForegroundSecondaryColor(), 0.0f, 1, null);
        long composeColor$default6 = ColorExtensionsKt.toComposeColor$default(header3.getForegroundSecondaryColorDark(), 0.0f, 1, null);
        if ((conversation != null ? conversation.getTicket() : null) == null || (!ConversationExtensionsKt.hasNonTicketParts(conversation) && !z2)) {
            topAppBarUiState = null;
            ticketProgressRowState = null;
        } else {
            topAppBarUiState = null;
            ticketProgressRowState = new TicketProgressRowState(conversation.getTicket().getTitle(), conversation.getTicket().getCurrentStatus().getTitle());
        }
        Header.Collapsed collapsed = header3.getCollapsed();
        TicketProgressRowState ticketProgressRowState2 = ticketProgressRowState;
        StringProvider.ActualString actualString2 = new StringProvider.ActualString(collapsed.getTitle());
        Integer numValueOf = Integer.valueOf(getNavIcon(launchMode));
        String subtitle = collapsed.getSubtitle();
        Object actualString3 = subtitle != null ? new StringProvider.ActualString(subtitle) : topAppBarUiState;
        Header.Collapsed.HeaderIconType icon = collapsed.getIcon();
        if (icon != null) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i4 == 1) {
                i3 = io.intercom.android.sdk.R.drawable.intercom_clock;
            } else {
                if (i4 != 2) {
                    u.b();
                    return topAppBarUiState;
                }
                i3 = io.intercom.android.sdk.R.drawable.intercom_ic_ai;
            }
            objValueOf = Integer.valueOf(i3);
        } else {
            objValueOf = topAppBarUiState;
        }
        AvatarDetails avatarDetails = collapsed.getAvatarDetails();
        if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
            actualString = actualString2;
            arrayList = hf3.t;
        } else {
            arrayList = new ArrayList(ph1.n(avatars, 10));
            Iterator it = avatars.iterator();
            while (it.hasNext()) {
                Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                avatarBuild.getClass();
                arrayList.add(new AvatarWrapper(avatarBuild, header3.getUseBotHeader()));
                it = it;
                actualString2 = actualString2;
            }
            actualString = actualString2;
        }
        return new TopAppBarUiState(actualString, numValueOf, actualString3, objValueOf, arrayList, header3.getDisplayActiveIndicator(), ticketProgressRowState2, listReduceHeaderMenuItems, new uh1(composeColor$default), new uh1(composeColor$default2), new uh1(composeColor$default3), new uh1(composeColor$default4), new uh1(composeColor$default5), new uh1(composeColor$default6), pushNotificationsBannerState, null);
    }
}
