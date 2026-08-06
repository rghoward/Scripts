package io.intercom.android.sdk.m5.conversation.data;

import defpackage.qq2;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ParsedAblyEvent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AblyClosed extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final AblyClosed INSTANCE = new AblyClosed();

        private AblyClosed() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AblyConnected extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final AblyConnected INSTANCE = new AblyConnected();

        private AblyConnected() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AblyFailed extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final AblyFailed INSTANCE = new AblyFailed();

        private AblyFailed() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AblyReconnectedWithoutResume extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final AblyReconnectedWithoutResume INSTANCE = new AblyReconnectedWithoutResume();

        private AblyReconnectedWithoutResume() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class UnSupportedEvent extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        private UnSupportedEvent() {
            super(null);
        }
    }

    public /* synthetic */ ParsedAblyEvent(qq2 qq2Var) {
        this();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class ConversationAblyEvent extends ParsedAblyEvent {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class NewComment extends ConversationAblyEvent {
            public static final int $stable = 8;
            private final String conversationId;
            private final String createdByUser;
            private final Part.Builder partBuilder;
            private final String ticketId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewComment(String str, String str2, String str3, Part.Builder builder) {
                super(null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                builder.getClass();
                this.conversationId = str;
                this.createdByUser = str2;
                this.ticketId = str3;
                this.partBuilder = builder;
            }

            public static /* synthetic */ NewComment copy$default(NewComment newComment, String str, String str2, String str3, Part.Builder builder, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = newComment.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = newComment.createdByUser;
                }
                if ((i & 4) != 0) {
                    str3 = newComment.ticketId;
                }
                if ((i & 8) != 0) {
                    builder = newComment.partBuilder;
                }
                return newComment.copy(str, str2, str3, builder);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final String component3() {
                return this.ticketId;
            }

            public final Part.Builder component4() {
                return this.partBuilder;
            }

            public final NewComment copy(String str, String str2, String str3, Part.Builder builder) {
                str.getClass();
                str2.getClass();
                str3.getClass();
                builder.getClass();
                return new NewComment(str, str2, str3, builder);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewComment)) {
                    return false;
                }
                NewComment newComment = (NewComment) obj;
                return xj5.a(this.conversationId, newComment.conversationId) && xj5.a(this.createdByUser, newComment.createdByUser) && xj5.a(this.ticketId, newComment.ticketId) && xj5.a(this.partBuilder, newComment.partBuilder);
            }

            public final String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final Part.Builder getPartBuilder() {
                return this.partBuilder;
            }

            public final String getTicketId() {
                return this.ticketId;
            }

            public int hashCode() {
                return this.partBuilder.hashCode() + ru3.c(ru3.c(this.conversationId.hashCode() * 31, 31, this.createdByUser), 31, this.ticketId);
            }

            public String toString() {
                return "NewComment(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", ticketId=" + this.ticketId + ", partBuilder=" + this.partBuilder + ')';
            }
        }

        private ConversationAblyEvent() {
            super(null);
        }

        public /* synthetic */ ConversationAblyEvent(qq2 qq2Var) {
            this();
        }
    }

    private ParsedAblyEvent() {
    }
}
