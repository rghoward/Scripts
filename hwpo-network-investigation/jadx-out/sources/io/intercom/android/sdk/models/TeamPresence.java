package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.hf3;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresence {

    @SerializedName("active_admins")
    private final List<Participant.Builder> activeAdmins;

    @SerializedName("active_bot")
    private final ActiveBot activeBot;

    @SerializedName("expected_response_delay_long_text")
    private final String expectedResponseDelayLongText;

    @SerializedName("expected_response_delay_short_text")
    private final String expectedResponseDelayShortText;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final TeamPresence NULL = new TeamPresence(null, null, null, null, 15, null);

    public /* synthetic */ TeamPresence(List list, ActiveBot activeBot, String str, String str2, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : activeBot, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPresence copy$default(TeamPresence teamPresence, List list, ActiveBot activeBot, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = teamPresence.activeAdmins;
        }
        if ((i & 2) != 0) {
            activeBot = teamPresence.activeBot;
        }
        if ((i & 4) != 0) {
            str = teamPresence.expectedResponseDelayShortText;
        }
        if ((i & 8) != 0) {
            str2 = teamPresence.expectedResponseDelayLongText;
        }
        return teamPresence.copy(list, activeBot, str, str2);
    }

    public final List<Participant.Builder> component1() {
        return this.activeAdmins;
    }

    public final ActiveBot component2() {
        return this.activeBot;
    }

    public final String component3() {
        return this.expectedResponseDelayShortText;
    }

    public final String component4() {
        return this.expectedResponseDelayLongText;
    }

    public final TeamPresence copy(List<Participant.Builder> list, ActiveBot activeBot, String str, String str2) {
        return new TeamPresence(list, activeBot, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPresence)) {
            return false;
        }
        TeamPresence teamPresence = (TeamPresence) obj;
        return xj5.a(this.activeAdmins, teamPresence.activeAdmins) && xj5.a(this.activeBot, teamPresence.activeBot) && xj5.a(this.expectedResponseDelayShortText, teamPresence.expectedResponseDelayShortText) && xj5.a(this.expectedResponseDelayLongText, teamPresence.expectedResponseDelayLongText);
    }

    public final List<Participant.Builder> getActiveAdmins() {
        return this.activeAdmins;
    }

    public final ActiveBot getActiveBot() {
        return this.activeBot;
    }

    public final List<Participant> getBuiltActiveAdmins() {
        Iterable iterable = this.activeAdmins;
        if (iterable == null) {
            iterable = hf3.t;
        }
        ArrayList arrayList = new ArrayList(ph1.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((Participant.Builder) it.next()).build());
        }
        return arrayList;
    }

    public final String getExpectedResponseDelayLongText() {
        return this.expectedResponseDelayLongText;
    }

    public final String getExpectedResponseDelayShortText() {
        return this.expectedResponseDelayShortText;
    }

    public int hashCode() {
        List<Participant.Builder> list = this.activeAdmins;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ActiveBot activeBot = this.activeBot;
        int iHashCode2 = (iHashCode + (activeBot == null ? 0 : activeBot.hashCode())) * 31;
        String str = this.expectedResponseDelayShortText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expectedResponseDelayLongText;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TeamPresence(activeAdmins=");
        sb.append(this.activeAdmins);
        sb.append(", activeBot=");
        sb.append(this.activeBot);
        sb.append(", expectedResponseDelayShortText=");
        sb.append(this.expectedResponseDelayShortText);
        sb.append(", expectedResponseDelayLongText=");
        return wu0.a(sb, this.expectedResponseDelayLongText, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    public TeamPresence(List<Participant.Builder> list, ActiveBot activeBot, String str, String str2) {
        this.activeAdmins = list;
        this.activeBot = activeBot;
        this.expectedResponseDelayShortText = str;
        this.expectedResponseDelayLongText = str2;
    }

    public TeamPresence() {
        this(null, null, null, null, 15, null);
    }
}
