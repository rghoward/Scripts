package io.intercom.android.sdk.m5.navigation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomRootActivityArgs implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ IntercomRootActivityArgs(qq2 qq2Var) {
        this();
    }

    public abstract String getRoute();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ConversationScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ConversationScreenArgs> CREATOR = new Creator();
        private final String articleId;
        private final String articleTitle;
        private final String conversationId;
        private final String initialMessage;
        private final boolean isLaunchedProgrammatically;
        private final TransitionArgs transitionArgs;

        public /* synthetic */ ConversationScreenArgs(String str, String str2, boolean z, String str3, String str4, TransitionArgs transitionArgs, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs);
        }

        private final String component2() {
            return this.initialMessage;
        }

        public static /* synthetic */ ConversationScreenArgs copy$default(ConversationScreenArgs conversationScreenArgs, String str, String str2, boolean z, String str3, String str4, TransitionArgs transitionArgs, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversationScreenArgs.conversationId;
            }
            if ((i & 2) != 0) {
                str2 = conversationScreenArgs.initialMessage;
            }
            if ((i & 4) != 0) {
                z = conversationScreenArgs.isLaunchedProgrammatically;
            }
            if ((i & 8) != 0) {
                str3 = conversationScreenArgs.articleId;
            }
            if ((i & 16) != 0) {
                str4 = conversationScreenArgs.articleTitle;
            }
            if ((i & 32) != 0) {
                transitionArgs = conversationScreenArgs.transitionArgs;
            }
            String str5 = str4;
            TransitionArgs transitionArgs2 = transitionArgs;
            return conversationScreenArgs.copy(str, str2, z, str3, str5, transitionArgs2);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final boolean component3() {
            return this.isLaunchedProgrammatically;
        }

        public final String component4() {
            return this.articleId;
        }

        public final String component5() {
            return this.articleTitle;
        }

        public final TransitionArgs component6() {
            return this.transitionArgs;
        }

        public final ConversationScreenArgs copy(String str, String str2, boolean z, String str3, String str4, TransitionArgs transitionArgs) {
            str2.getClass();
            transitionArgs.getClass();
            return new ConversationScreenArgs(str, str2, z, str3, str4, transitionArgs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationScreenArgs)) {
                return false;
            }
            ConversationScreenArgs conversationScreenArgs = (ConversationScreenArgs) obj;
            return xj5.a(this.conversationId, conversationScreenArgs.conversationId) && xj5.a(this.initialMessage, conversationScreenArgs.initialMessage) && this.isLaunchedProgrammatically == conversationScreenArgs.isLaunchedProgrammatically && xj5.a(this.articleId, conversationScreenArgs.articleId) && xj5.a(this.articleTitle, conversationScreenArgs.articleTitle) && xj5.a(this.transitionArgs, conversationScreenArgs.transitionArgs);
        }

        public final String getArticleId() {
            return this.articleId;
        }

        public final String getArticleTitle() {
            return this.articleTitle;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getEncodedInitialMessage() {
            String strEncode = Uri.encode(this.initialMessage);
            strEncode.getClass();
            return strEncode;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "CONVERSATION?conversationId=" + this.conversationId + "&initialMessage=" + getEncodedInitialMessage() + "&articleId=" + this.articleId + "&articleTitle=" + this.articleTitle + "&isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + "&transitionArgs=" + this.transitionArgs;
        }

        public final TransitionArgs getTransitionArgs() {
            return this.transitionArgs;
        }

        public int hashCode() {
            String str = this.conversationId;
            int iA = uo2.a(ru3.c((str == null ? 0 : str.hashCode()) * 31, 31, this.initialMessage), this.isLaunchedProgrammatically, 31);
            String str2 = this.articleId;
            int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.articleTitle;
            return this.transitionArgs.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final boolean isLaunchedProgrammatically() {
            return this.isLaunchedProgrammatically;
        }

        public String toString() {
            return "ConversationScreenArgs(conversationId=" + this.conversationId + ", initialMessage=" + this.initialMessage + ", isLaunchedProgrammatically=" + this.isLaunchedProgrammatically + ", articleId=" + this.articleId + ", articleTitle=" + this.articleTitle + ", transitionArgs=" + this.transitionArgs + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.conversationId);
            parcel.writeString(this.initialMessage);
            parcel.writeInt(this.isLaunchedProgrammatically ? 1 : 0);
            parcel.writeString(this.articleId);
            parcel.writeString(this.articleTitle);
            this.transitionArgs.writeToParcel(parcel, i);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<ConversationScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ConversationScreenArgs(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), TransitionArgs.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConversationScreenArgs[] newArray(int i) {
                return new ConversationScreenArgs[i];
            }
        }

        public ConversationScreenArgs() {
            this(null, null, false, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationScreenArgs(String str, String str2, boolean z, String str3, String str4, TransitionArgs transitionArgs) {
            super(null);
            str2.getClass();
            transitionArgs.getClass();
            this.conversationId = str;
            this.initialMessage = str2;
            this.isLaunchedProgrammatically = z;
            this.articleId = str3;
            this.articleTitle = str4;
            this.transitionArgs = transitionArgs;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HelpCenterCollectionArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<HelpCenterCollectionArgs> CREATOR = new Creator();
        private final String collectionId;
        private final String metricPlace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionArgs(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.collectionId = str;
            this.metricPlace = str2;
        }

        public static /* synthetic */ HelpCenterCollectionArgs copy$default(HelpCenterCollectionArgs helpCenterCollectionArgs, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = helpCenterCollectionArgs.collectionId;
            }
            if ((i & 2) != 0) {
                str2 = helpCenterCollectionArgs.metricPlace;
            }
            return helpCenterCollectionArgs.copy(str, str2);
        }

        public final String component1() {
            return this.collectionId;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionArgs copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new HelpCenterCollectionArgs(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionArgs)) {
                return false;
            }
            HelpCenterCollectionArgs helpCenterCollectionArgs = (HelpCenterCollectionArgs) obj;
            return xj5.a(this.collectionId, helpCenterCollectionArgs.collectionId) && xj5.a(this.metricPlace, helpCenterCollectionArgs.metricPlace);
        }

        public final String getCollectionId() {
            return this.collectionId;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return this.metricPlace.hashCode() + (this.collectionId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HelpCenterCollectionArgs(collectionId=");
            sb.append(this.collectionId);
            sb.append(", metricPlace=");
            return wu0.a(sb, this.metricPlace, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.collectionId);
            parcel.writeString(this.metricPlace);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HelpCenterCollectionArgs(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionArgs[] newArray(int i) {
                return new HelpCenterCollectionArgs[i];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HelpCenterCollectionsArgs extends IntercomRootActivityArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<HelpCenterCollectionsArgs> CREATOR = new Creator();
        private final List<String> collectionIds;
        private final String metricPlace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollectionsArgs(List<String> list, String str) {
            super(null);
            list.getClass();
            str.getClass();
            this.collectionIds = list;
            this.metricPlace = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollectionsArgs copy$default(HelpCenterCollectionsArgs helpCenterCollectionsArgs, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = helpCenterCollectionsArgs.collectionIds;
            }
            if ((i & 2) != 0) {
                str = helpCenterCollectionsArgs.metricPlace;
            }
            return helpCenterCollectionsArgs.copy(list, str);
        }

        public final List<String> component1() {
            return this.collectionIds;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final HelpCenterCollectionsArgs copy(List<String> list, String str) {
            list.getClass();
            str.getClass();
            return new HelpCenterCollectionsArgs(list, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpCenterCollectionsArgs)) {
                return false;
            }
            HelpCenterCollectionsArgs helpCenterCollectionsArgs = (HelpCenterCollectionsArgs) obj;
            return xj5.a(this.collectionIds, helpCenterCollectionsArgs.collectionIds) && xj5.a(this.metricPlace, helpCenterCollectionsArgs.metricPlace);
        }

        public final List<String> getCollectionIds() {
            return this.collectionIds;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HELP_CENTER";
        }

        public int hashCode() {
            return this.metricPlace.hashCode() + (this.collectionIds.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HelpCenterCollectionsArgs(collectionIds=");
            sb.append(this.collectionIds);
            sb.append(", metricPlace=");
            return wu0.a(sb, this.metricPlace, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeStringList(this.collectionIds);
            parcel.writeString(this.metricPlace);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<HelpCenterCollectionsArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HelpCenterCollectionsArgs(parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HelpCenterCollectionsArgs[] newArray(int i) {
                return new HelpCenterCollectionsArgs[i];
            }
        }

        public /* synthetic */ HelpCenterCollectionsArgs(List list, String str, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? hf3.t : list, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HomeScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final HomeScreenArgs INSTANCE = new HomeScreenArgs();
        public static final Parcelable.Creator<HomeScreenArgs> CREATOR = new Creator();

        private HomeScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "HOME";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<HomeScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return HomeScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HomeScreenArgs[] newArray(int i) {
                return new HomeScreenArgs[i];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MessagesScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final MessagesScreenArgs INSTANCE = new MessagesScreenArgs();
        public static final Parcelable.Creator<MessagesScreenArgs> CREATOR = new Creator();

        private MessagesScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "MESSAGES";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<MessagesScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return MessagesScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessagesScreenArgs[] newArray(int i) {
                return new MessagesScreenArgs[i];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NoContent extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final NoContent INSTANCE = new NoContent();
        public static final Parcelable.Creator<NoContent> CREATOR = new Creator();

        private NoContent() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return BuildConfig.FLAVOR;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<NoContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return NoContent.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoContent[] newArray(int i) {
                return new NoContent[i];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TicketDetailsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final Parcelable.Creator<TicketDetailsScreenArgs> CREATOR = new Creator();
        private final String from;
        private final String ticketId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketDetailsScreenArgs(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.ticketId = str;
            this.from = str2;
        }

        public static /* synthetic */ TicketDetailsScreenArgs copy$default(TicketDetailsScreenArgs ticketDetailsScreenArgs, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketDetailsScreenArgs.ticketId;
            }
            if ((i & 2) != 0) {
                str2 = ticketDetailsScreenArgs.from;
            }
            return ticketDetailsScreenArgs.copy(str, str2);
        }

        public final String component1() {
            return this.ticketId;
        }

        public final String component2() {
            return this.from;
        }

        public final TicketDetailsScreenArgs copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new TicketDetailsScreenArgs(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketDetailsScreenArgs)) {
                return false;
            }
            TicketDetailsScreenArgs ticketDetailsScreenArgs = (TicketDetailsScreenArgs) obj;
            return xj5.a(this.ticketId, ticketDetailsScreenArgs.ticketId) && xj5.a(this.from, ticketDetailsScreenArgs.from);
        }

        public final String getFrom() {
            return this.from;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "TICKET_DETAIL/" + this.ticketId + "?from=" + this.from;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return this.from.hashCode() + (this.ticketId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TicketDetailsScreenArgs(ticketId=");
            sb.append(this.ticketId);
            sb.append(", from=");
            return wu0.a(sb, this.from, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.ticketId);
            parcel.writeString(this.from);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<TicketDetailsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TicketDetailsScreenArgs(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketDetailsScreenArgs[] newArray(int i) {
                return new TicketDetailsScreenArgs[i];
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TicketsScreenArgs extends IntercomRootActivityArgs {
        public static final int $stable = 0;
        public static final TicketsScreenArgs INSTANCE = new TicketsScreenArgs();
        public static final Parcelable.Creator<TicketsScreenArgs> CREATOR = new Creator();

        private TicketsScreenArgs() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs
        public String getRoute() {
            return "TICKETS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Creator implements Parcelable.Creator<TicketsScreenArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return TicketsScreenArgs.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TicketsScreenArgs[] newArray(int i) {
                return new TicketsScreenArgs[i];
            }
        }
    }

    private IntercomRootActivityArgs() {
    }
}
