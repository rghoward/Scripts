package io.intercom.android.sdk.m5.conversation.reducers;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ph1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceReducerKt {
    public static final TeamPresenceState reduceTeamPresenceState(Conversation conversation, OpenMessengerResponse openMessengerResponse) {
        Header.Expanded expanded;
        Header header;
        ExpandedTeamPresenceState expandedTeamPresenceState;
        String teamIntro;
        String specialNotice;
        Header header2;
        AvatarType avatarType;
        List arrayList;
        List<Avatar.Builder> avatars;
        Header header3;
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null;
        if (conversation == null || (header3 = conversation.getHeader()) == null || (expanded = header3.getExpanded()) == null) {
            expanded = (newConversationData == null || (header = newConversationData.getHeader()) == null) ? null : header.getExpanded();
        }
        if (expanded != null) {
            if (conversation == null || (header2 = conversation.getHeader()) == null) {
                header2 = newConversationData != null ? newConversationData.getHeader() : null;
            }
            String title = expanded.getTitle();
            List<Header.Expanded.Body> body = expanded.getBody();
            AvatarDetails avatarDetails = expanded.getAvatarDetails();
            if (avatarDetails == null || (avatarType = avatarDetails.getAvatarType()) == null) {
                avatarType = AvatarType.UNKNOWN;
            }
            AvatarType avatarType2 = avatarType;
            AvatarDetails avatarDetails2 = expanded.getAvatarDetails();
            if (avatarDetails2 == null || (avatars = avatarDetails2.getAvatars()) == null) {
                arrayList = hf3.t;
            } else {
                arrayList = new ArrayList(ph1.n(avatars, 10));
                Iterator<T> it = avatars.iterator();
                while (it.hasNext()) {
                    Avatar avatarBuild = ((Avatar.Builder) it.next()).build();
                    avatarBuild.getClass();
                    arrayList.add(new AvatarWrapper(avatarBuild, false));
                }
            }
            expandedTeamPresenceState = new ExpandedTeamPresenceState(title, body, avatarType2, arrayList, expanded.getFooter(), expanded.getSocialAccounts(), header2 != null ? header2.getDisplayActiveIndicator() : false);
        } else {
            expandedTeamPresenceState = ExpandedTeamPresenceState.Companion.getDefault();
        }
        String str = BuildConfig.FLAVOR;
        if (conversation == null || (teamIntro = conversation.getTeamIntro()) == null) {
            teamIntro = newConversationData != null ? newConversationData.getTeamIntro() : null;
            if (teamIntro == null) {
                teamIntro = BuildConfig.FLAVOR;
            }
        }
        if (conversation == null || (specialNotice = conversation.getSpecialNotice()) == null) {
            String specialNotice2 = newConversationData != null ? newConversationData.getSpecialNotice() : null;
            if (specialNotice2 != null) {
                str = specialNotice2;
            }
        } else {
            str = specialNotice;
        }
        return new TeamPresenceState(expandedTeamPresenceState, teamIntro, str);
    }
}
