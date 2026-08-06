package io.intercom.android.sdk.m5.conversation.states;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceState {
    public static final int $stable = 8;
    private final ExpandedTeamPresenceState expandedTeamPresenceState;
    private final String specialNotice;
    private final String teamIntro;

    public TeamPresenceState(ExpandedTeamPresenceState expandedTeamPresenceState, String str, String str2) {
        expandedTeamPresenceState.getClass();
        str.getClass();
        str2.getClass();
        this.expandedTeamPresenceState = expandedTeamPresenceState;
        this.teamIntro = str;
        this.specialNotice = str2;
    }

    public final ExpandedTeamPresenceState getExpandedTeamPresenceState() {
        return this.expandedTeamPresenceState;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }
}
