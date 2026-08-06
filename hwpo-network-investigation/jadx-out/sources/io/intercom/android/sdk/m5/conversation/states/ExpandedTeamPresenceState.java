package io.intercom.android.sdk.m5.conversation.states;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedTeamPresenceState {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ExpandedTeamPresenceState f80default;
    private final AvatarType avatarType;
    private final List<AvatarWrapper> avatars;
    private final List<Header.Expanded.Body> body;
    private final boolean displayActiveIndicator;
    private final List<Header.Expanded.Footer> footers;
    private final List<Header.Expanded.SocialAccount> socialAccounts;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        AvatarType avatarType = AvatarType.UNKNOWN;
        hf3 hf3Var = hf3.t;
        f80default = new ExpandedTeamPresenceState(BuildConfig.FLAVOR, hf3Var, avatarType, hf3Var, hf3Var, hf3Var, false);
    }

    public ExpandedTeamPresenceState(String str, List<Header.Expanded.Body> list, AvatarType avatarType, List<AvatarWrapper> list2, List<Header.Expanded.Footer> list3, List<Header.Expanded.SocialAccount> list4, boolean z) {
        str.getClass();
        list.getClass();
        avatarType.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.title = str;
        this.body = list;
        this.avatarType = avatarType;
        this.avatars = list2;
        this.footers = list3;
        this.socialAccounts = list4;
        this.displayActiveIndicator = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandedTeamPresenceState copy$default(ExpandedTeamPresenceState expandedTeamPresenceState, String str, List list, AvatarType avatarType, List list2, List list3, List list4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expandedTeamPresenceState.title;
        }
        if ((i & 2) != 0) {
            list = expandedTeamPresenceState.body;
        }
        if ((i & 4) != 0) {
            avatarType = expandedTeamPresenceState.avatarType;
        }
        if ((i & 8) != 0) {
            list2 = expandedTeamPresenceState.avatars;
        }
        if ((i & 16) != 0) {
            list3 = expandedTeamPresenceState.footers;
        }
        if ((i & 32) != 0) {
            list4 = expandedTeamPresenceState.socialAccounts;
        }
        if ((i & 64) != 0) {
            z = expandedTeamPresenceState.displayActiveIndicator;
        }
        List list5 = list4;
        boolean z2 = z;
        List list6 = list3;
        AvatarType avatarType2 = avatarType;
        return expandedTeamPresenceState.copy(str, list, avatarType2, list2, list6, list5, z2);
    }

    public final String component1() {
        return this.title;
    }

    public final List<Header.Expanded.Body> component2() {
        return this.body;
    }

    public final AvatarType component3() {
        return this.avatarType;
    }

    public final List<AvatarWrapper> component4() {
        return this.avatars;
    }

    public final List<Header.Expanded.Footer> component5() {
        return this.footers;
    }

    public final List<Header.Expanded.SocialAccount> component6() {
        return this.socialAccounts;
    }

    public final boolean component7() {
        return this.displayActiveIndicator;
    }

    public final ExpandedTeamPresenceState copy(String str, List<Header.Expanded.Body> list, AvatarType avatarType, List<AvatarWrapper> list2, List<Header.Expanded.Footer> list3, List<Header.Expanded.SocialAccount> list4, boolean z) {
        str.getClass();
        list.getClass();
        avatarType.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new ExpandedTeamPresenceState(str, list, avatarType, list2, list3, list4, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandedTeamPresenceState)) {
            return false;
        }
        ExpandedTeamPresenceState expandedTeamPresenceState = (ExpandedTeamPresenceState) obj;
        return xj5.a(this.title, expandedTeamPresenceState.title) && xj5.a(this.body, expandedTeamPresenceState.body) && this.avatarType == expandedTeamPresenceState.avatarType && xj5.a(this.avatars, expandedTeamPresenceState.avatars) && xj5.a(this.footers, expandedTeamPresenceState.footers) && xj5.a(this.socialAccounts, expandedTeamPresenceState.socialAccounts) && this.displayActiveIndicator == expandedTeamPresenceState.displayActiveIndicator;
    }

    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    public final List<Header.Expanded.Body> getBody() {
        return this.body;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final List<Header.Expanded.Footer> getFooters() {
        return this.footers;
    }

    public final List<Header.Expanded.SocialAccount> getSocialAccounts() {
        return this.socialAccounts;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.displayActiveIndicator) + ho2.a(ho2.a(ho2.a((this.avatarType.hashCode() + ho2.a(this.title.hashCode() * 31, 31, this.body)) * 31, 31, this.avatars), 31, this.footers), 31, this.socialAccounts);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExpandedTeamPresenceState(title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", avatarType=");
        sb.append(this.avatarType);
        sb.append(", avatars=");
        sb.append(this.avatars);
        sb.append(", footers=");
        sb.append(this.footers);
        sb.append(", socialAccounts=");
        sb.append(this.socialAccounts);
        sb.append(", displayActiveIndicator=");
        return pi1.a(sb, this.displayActiveIndicator, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final ExpandedTeamPresenceState getDefault() {
            return ExpandedTeamPresenceState.f80default;
        }

        private Companion() {
        }
    }
}
