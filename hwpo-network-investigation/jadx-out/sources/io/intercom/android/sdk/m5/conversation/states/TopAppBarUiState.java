package io.intercom.android.sdk.m5.conversation.states;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TopAppBarUiState {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final TopAppBarUiState f81default;
    private final List<AvatarWrapper> avatars;
    private final uh1 backgroundColor;
    private final uh1 backgroundColorDark;
    private final uh1 contentColor;
    private final uh1 contentColorDark;
    private final boolean displayActiveIndicator;
    private final List<HeaderMenuItem> headerMenuItems;
    private final Integer navIcon;
    private final PushNotificationsBannerState pushNotificationsBannerState;
    private final StringProvider subTitle;
    private final uh1 subTitleColor;
    private final uh1 subTitleColorDark;
    private final Integer subTitleLeadingIcon;
    private final TicketProgressRowState ticketStatusState;
    private final StringProvider title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        hf3 hf3Var = hf3.t;
        f81default = new TopAppBarUiState(new StringProvider.ActualString(BuildConfig.FLAVOR), null, null, null, hf3Var, false, null, hf3Var, null, null, null, null, null, null, null, 16130, null);
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z, TicketProgressRowState ticketProgressRowState, List list2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3, uh1 uh1Var4, uh1 uh1Var5, uh1 uh1Var6, PushNotificationsBannerState pushNotificationsBannerState, int i, qq2 qq2Var) {
        this(stringProvider, (i & 2) != 0 ? null : num, stringProvider2, num2, list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : ticketProgressRowState, (i & 128) != 0 ? hf3.t : list2, (i & 256) != 0 ? null : uh1Var, (i & 512) != 0 ? null : uh1Var2, (i & 1024) != 0 ? null : uh1Var3, (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? null : uh1Var4, (i & 4096) != 0 ? null : uh1Var5, (i & 8192) != 0 ? null : uh1Var6, (i & 16384) != 0 ? null : pushNotificationsBannerState, null);
    }

    public final StringProvider component1() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10-QN2ZGVo, reason: not valid java name */
    public final uh1 m100component10QN2ZGVo() {
        return this.backgroundColorDark;
    }

    /* JADX INFO: renamed from: component11-QN2ZGVo, reason: not valid java name */
    public final uh1 m101component11QN2ZGVo() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: component12-QN2ZGVo, reason: not valid java name */
    public final uh1 m102component12QN2ZGVo() {
        return this.contentColorDark;
    }

    /* JADX INFO: renamed from: component13-QN2ZGVo, reason: not valid java name */
    public final uh1 m103component13QN2ZGVo() {
        return this.subTitleColor;
    }

    /* JADX INFO: renamed from: component14-QN2ZGVo, reason: not valid java name */
    public final uh1 m104component14QN2ZGVo() {
        return this.subTitleColorDark;
    }

    public final PushNotificationsBannerState component15() {
        return this.pushNotificationsBannerState;
    }

    public final Integer component2() {
        return this.navIcon;
    }

    public final StringProvider component3() {
        return this.subTitle;
    }

    public final Integer component4() {
        return this.subTitleLeadingIcon;
    }

    public final List<AvatarWrapper> component5() {
        return this.avatars;
    }

    public final boolean component6() {
        return this.displayActiveIndicator;
    }

    public final TicketProgressRowState component7() {
        return this.ticketStatusState;
    }

    public final List<HeaderMenuItem> component8() {
        return this.headerMenuItems;
    }

    /* JADX INFO: renamed from: component9-QN2ZGVo, reason: not valid java name */
    public final uh1 m105component9QN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: copy-N4y9b34, reason: not valid java name */
    public final TopAppBarUiState m106copyN4y9b34(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List<AvatarWrapper> list, boolean z, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> list2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3, uh1 uh1Var4, uh1 uh1Var5, uh1 uh1Var6, PushNotificationsBannerState pushNotificationsBannerState) {
        stringProvider.getClass();
        list.getClass();
        list2.getClass();
        return new TopAppBarUiState(stringProvider, num, stringProvider2, num2, list, z, ticketProgressRowState, list2, uh1Var, uh1Var2, uh1Var3, uh1Var4, uh1Var5, uh1Var6, pushNotificationsBannerState, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopAppBarUiState)) {
            return false;
        }
        TopAppBarUiState topAppBarUiState = (TopAppBarUiState) obj;
        return xj5.a(this.title, topAppBarUiState.title) && xj5.a(this.navIcon, topAppBarUiState.navIcon) && xj5.a(this.subTitle, topAppBarUiState.subTitle) && xj5.a(this.subTitleLeadingIcon, topAppBarUiState.subTitleLeadingIcon) && xj5.a(this.avatars, topAppBarUiState.avatars) && this.displayActiveIndicator == topAppBarUiState.displayActiveIndicator && xj5.a(this.ticketStatusState, topAppBarUiState.ticketStatusState) && xj5.a(this.headerMenuItems, topAppBarUiState.headerMenuItems) && xj5.a(this.backgroundColor, topAppBarUiState.backgroundColor) && xj5.a(this.backgroundColorDark, topAppBarUiState.backgroundColorDark) && xj5.a(this.contentColor, topAppBarUiState.contentColor) && xj5.a(this.contentColorDark, topAppBarUiState.contentColorDark) && xj5.a(this.subTitleColor, topAppBarUiState.subTitleColor) && xj5.a(this.subTitleColorDark, topAppBarUiState.subTitleColorDark) && xj5.a(this.pushNotificationsBannerState, topAppBarUiState.pushNotificationsBannerState);
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    /* JADX INFO: renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m107getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: getBackgroundColorDark-QN2ZGVo, reason: not valid java name */
    public final uh1 m108getBackgroundColorDarkQN2ZGVo() {
        return this.backgroundColorDark;
    }

    /* JADX INFO: renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m109getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: getContentColorDark-QN2ZGVo, reason: not valid java name */
    public final uh1 m110getContentColorDarkQN2ZGVo() {
        return this.contentColorDark;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final List<HeaderMenuItem> getHeaderMenuItems() {
        return this.headerMenuItems;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m111getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    /* JADX INFO: renamed from: getSubTitleColorDark-QN2ZGVo, reason: not valid java name */
    public final uh1 m112getSubTitleColorDarkQN2ZGVo() {
        return this.subTitleColorDark;
    }

    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    public final StringProvider getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.navIcon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StringProvider stringProvider = this.subTitle;
        int iHashCode3 = (iHashCode2 + (stringProvider == null ? 0 : stringProvider.hashCode())) * 31;
        Integer num2 = this.subTitleLeadingIcon;
        int iA = uo2.a(ho2.a((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.avatars), this.displayActiveIndicator, 31);
        TicketProgressRowState ticketProgressRowState = this.ticketStatusState;
        int iA2 = ho2.a((iA + (ticketProgressRowState == null ? 0 : ticketProgressRowState.hashCode())) * 31, 31, this.headerMenuItems);
        uh1 uh1Var = this.backgroundColor;
        int iHashCode4 = (iA2 + (uh1Var == null ? 0 : Long.hashCode(uh1Var.a))) * 31;
        uh1 uh1Var2 = this.backgroundColorDark;
        int iHashCode5 = (iHashCode4 + (uh1Var2 == null ? 0 : Long.hashCode(uh1Var2.a))) * 31;
        uh1 uh1Var3 = this.contentColor;
        int iHashCode6 = (iHashCode5 + (uh1Var3 == null ? 0 : Long.hashCode(uh1Var3.a))) * 31;
        uh1 uh1Var4 = this.contentColorDark;
        int iHashCode7 = (iHashCode6 + (uh1Var4 == null ? 0 : Long.hashCode(uh1Var4.a))) * 31;
        uh1 uh1Var5 = this.subTitleColor;
        int iHashCode8 = (iHashCode7 + (uh1Var5 == null ? 0 : Long.hashCode(uh1Var5.a))) * 31;
        uh1 uh1Var6 = this.subTitleColorDark;
        int iHashCode9 = (iHashCode8 + (uh1Var6 == null ? 0 : Long.hashCode(uh1Var6.a))) * 31;
        PushNotificationsBannerState pushNotificationsBannerState = this.pushNotificationsBannerState;
        return iHashCode9 + (pushNotificationsBannerState != null ? pushNotificationsBannerState.hashCode() : 0);
    }

    public String toString() {
        return "TopAppBarUiState(title=" + this.title + ", navIcon=" + this.navIcon + ", subTitle=" + this.subTitle + ", subTitleLeadingIcon=" + this.subTitleLeadingIcon + ", avatars=" + this.avatars + ", displayActiveIndicator=" + this.displayActiveIndicator + ", ticketStatusState=" + this.ticketStatusState + ", headerMenuItems=" + this.headerMenuItems + ", backgroundColor=" + this.backgroundColor + ", backgroundColorDark=" + this.backgroundColorDark + ", contentColor=" + this.contentColor + ", contentColorDark=" + this.contentColorDark + ", subTitleColor=" + this.subTitleColor + ", subTitleColorDark=" + this.subTitleColorDark + ", pushNotificationsBannerState=" + this.pushNotificationsBannerState + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final TopAppBarUiState getDefault() {
            return TopAppBarUiState.f81default;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List<AvatarWrapper> list, boolean z, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> list2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3, uh1 uh1Var4, uh1 uh1Var5, uh1 uh1Var6, PushNotificationsBannerState pushNotificationsBannerState) {
        stringProvider.getClass();
        list.getClass();
        list2.getClass();
        this.title = stringProvider;
        this.navIcon = num;
        this.subTitle = stringProvider2;
        this.subTitleLeadingIcon = num2;
        this.avatars = list;
        this.displayActiveIndicator = z;
        this.ticketStatusState = ticketProgressRowState;
        this.headerMenuItems = list2;
        this.backgroundColor = uh1Var;
        this.backgroundColorDark = uh1Var2;
        this.contentColor = uh1Var3;
        this.contentColorDark = uh1Var4;
        this.subTitleColor = uh1Var5;
        this.subTitleColorDark = uh1Var6;
        this.pushNotificationsBannerState = pushNotificationsBannerState;
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z, TicketProgressRowState ticketProgressRowState, List list2, uh1 uh1Var, uh1 uh1Var2, uh1 uh1Var3, uh1 uh1Var4, uh1 uh1Var5, uh1 uh1Var6, PushNotificationsBannerState pushNotificationsBannerState, qq2 qq2Var) {
        this(stringProvider, num, stringProvider2, num2, list, z, ticketProgressRowState, list2, uh1Var, uh1Var2, uh1Var3, uh1Var4, uh1Var5, uh1Var6, pushNotificationsBannerState);
    }
}
