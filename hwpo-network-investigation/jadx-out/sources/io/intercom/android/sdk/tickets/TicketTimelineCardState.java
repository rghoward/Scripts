package io.intercom.android.sdk.tickets;

import defpackage.a83;
import defpackage.al;
import defpackage.e44;
import defpackage.gy2;
import defpackage.ho2;
import defpackage.jt1;
import defpackage.nr1;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.u;
import defpackage.uh1;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketTimelineCardState {
    public static final int $stable = 8;
    private final List<AvatarWrapper> adminAvatars;
    private final long progressColor;
    private final List<ProgressSection> progressSections;
    private final String statusLabel;
    private final String statusSubtitle;
    private final String statusTitle;
    private final Long timestamp;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ProgressSection {
        public static final int $stable = 0;
        private final boolean isDone;
        private final boolean isLoading;

        public ProgressSection(boolean z, boolean z2) {
            this.isDone = z;
            this.isLoading = z2;
        }

        public static /* synthetic */ ProgressSection copy$default(ProgressSection progressSection, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = progressSection.isDone;
            }
            if ((i & 2) != 0) {
                z2 = progressSection.isLoading;
            }
            return progressSection.copy(z, z2);
        }

        public final boolean component1() {
            return this.isDone;
        }

        public final boolean component2() {
            return this.isLoading;
        }

        public final ProgressSection copy(boolean z, boolean z2) {
            return new ProgressSection(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressSection)) {
                return false;
            }
            ProgressSection progressSection = (ProgressSection) obj;
            return this.isDone == progressSection.isDone && this.isLoading == progressSection.isLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading) + (Boolean.hashCode(this.isDone) * 31);
        }

        public final boolean isDone() {
            return this.isDone;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ProgressSection(isDone=");
            sb.append(this.isDone);
            sb.append(", isLoading=");
            return pi1.a(sb, this.isLoading, ')');
        }
    }

    private TicketTimelineCardState(List<AvatarWrapper> list, String str, String str2, long j, List<ProgressSection> list2, String str3, Long l) {
        list.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        str3.getClass();
        this.adminAvatars = list;
        this.statusTitle = str;
        this.statusSubtitle = str2;
        this.progressColor = j;
        this.progressSections = list2;
        this.statusLabel = str3;
        this.timestamp = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-ww6aTOc$default, reason: not valid java name */
    public static /* synthetic */ TicketTimelineCardState m528copyww6aTOc$default(TicketTimelineCardState ticketTimelineCardState, List list, String str, String str2, long j, List list2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ticketTimelineCardState.adminAvatars;
        }
        if ((i & 2) != 0) {
            str = ticketTimelineCardState.statusTitle;
        }
        if ((i & 4) != 0) {
            str2 = ticketTimelineCardState.statusSubtitle;
        }
        if ((i & 8) != 0) {
            j = ticketTimelineCardState.progressColor;
        }
        if ((i & 16) != 0) {
            list2 = ticketTimelineCardState.progressSections;
        }
        if ((i & 32) != 0) {
            str3 = ticketTimelineCardState.statusLabel;
        }
        if ((i & 64) != 0) {
            l = ticketTimelineCardState.timestamp;
        }
        Long l2 = l;
        List list3 = list2;
        long j2 = j;
        String str4 = str2;
        return ticketTimelineCardState.m530copyww6aTOc(list, str, str4, j2, list3, str3, l2);
    }

    public final List<AvatarWrapper> component1() {
        return this.adminAvatars;
    }

    public final String component2() {
        return this.statusTitle;
    }

    public final String component3() {
        return this.statusSubtitle;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m529component40d7_KjU() {
        return this.progressColor;
    }

    public final List<ProgressSection> component5() {
        return this.progressSections;
    }

    public final String component6() {
        return this.statusLabel;
    }

    public final Long component7() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: copy-ww6aTOc, reason: not valid java name */
    public final TicketTimelineCardState m530copyww6aTOc(List<AvatarWrapper> list, String str, String str2, long j, List<ProgressSection> list2, String str3, Long l) {
        list.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        str3.getClass();
        return new TicketTimelineCardState(list, str, str2, j, list2, str3, l, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketTimelineCardState)) {
            return false;
        }
        TicketTimelineCardState ticketTimelineCardState = (TicketTimelineCardState) obj;
        return xj5.a(this.adminAvatars, ticketTimelineCardState.adminAvatars) && xj5.a(this.statusTitle, ticketTimelineCardState.statusTitle) && xj5.a(this.statusSubtitle, ticketTimelineCardState.statusSubtitle) && uh1.c(this.progressColor, ticketTimelineCardState.progressColor) && xj5.a(this.progressSections, ticketTimelineCardState.progressSections) && xj5.a(this.statusLabel, ticketTimelineCardState.statusLabel) && xj5.a(this.timestamp, ticketTimelineCardState.timestamp);
    }

    public final List<AvatarWrapper> getAdminAvatars() {
        return this.adminAvatars;
    }

    /* JADX INFO: renamed from: getProgressColor-0d7_KjU, reason: not valid java name */
    public final long m531getProgressColor0d7_KjU() {
        return this.progressColor;
    }

    public final List<ProgressSection> getProgressSections() {
        return this.progressSections;
    }

    public final String getStatusLabel() {
        return this.statusLabel;
    }

    public final String getStatusSubtitle() {
        return this.statusSubtitle;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iC = ru3.c(ru3.c(this.adminAvatars.hashCode() * 31, 31, this.statusTitle), 31, this.statusSubtitle);
        long j = this.progressColor;
        int i = uh1.l;
        int iC2 = ru3.c(ho2.a(al.c(j, iC, 31), 31, this.progressSections), 31, this.statusLabel);
        Long l = this.timestamp;
        return iC2 + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TicketTimelineCardState(adminAvatars=");
        sb.append(this.adminAvatars);
        sb.append(", statusTitle=");
        sb.append(this.statusTitle);
        sb.append(", statusSubtitle=");
        sb.append(this.statusSubtitle);
        sb.append(", progressColor=");
        a83.b(this.progressColor, ", progressSections=", sb);
        sb.append(this.progressSections);
        sb.append(", statusLabel=");
        sb.append(this.statusLabel);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @gy2
    public static abstract class ActualStringOrRes {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ActualString extends ActualStringOrRes {
            public static final int $stable = 0;
            private final String string;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActualString(String str) {
                super(null);
                str.getClass();
                this.string = str;
            }

            public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actualString.string;
                }
                return actualString.copy(str);
            }

            public final String component1() {
                return this.string;
            }

            public final ActualString copy(String str) {
                str.getClass();
                return new ActualString(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActualString) && xj5.a(this.string, ((ActualString) obj).string);
            }

            public final String getString() {
                return this.string;
            }

            public int hashCode() {
                return this.string.hashCode();
            }

            public String toString() {
                return wu0.a(new StringBuilder("ActualString(string="), this.string, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class StringRes extends ActualStringOrRes {
            public static final int $stable = 0;
            private final int stringRes;

            public StringRes(int i) {
                super(null);
                this.stringRes = i;
            }

            public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = stringRes.stringRes;
                }
                return stringRes.copy(i);
            }

            public final int component1() {
                return this.stringRes;
            }

            public final StringRes copy(int i) {
                return new StringRes(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StringRes) && this.stringRes == ((StringRes) obj).stringRes;
            }

            public final int getStringRes() {
                return this.stringRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.stringRes);
            }

            public String toString() {
                return e44.a(new StringBuilder("StringRes(stringRes="), this.stringRes, ')');
            }
        }

        public /* synthetic */ ActualStringOrRes(qq2 qq2Var) {
            this();
        }

        public final String getText(jt1 jt1Var, int i) {
            String strF;
            jt1Var.K(796462681);
            if (this instanceof ActualString) {
                strF = ((ActualString) this).getString();
            } else {
                if (!(this instanceof StringRes)) {
                    u.b();
                    return null;
                }
                strF = nr1.f(jt1Var, ((StringRes) this).getStringRes());
            }
            jt1Var.B();
            return strF;
        }

        private ActualStringOrRes() {
        }
    }

    public /* synthetic */ TicketTimelineCardState(List list, String str, String str2, long j, List list2, String str3, Long l, qq2 qq2Var) {
        this(list, str, str2, j, list2, str3, l);
    }
}
