package io.intercom.android.sdk.m5.push.ui;

import android.net.Uri;
import defpackage.al;
import defpackage.ox7;
import defpackage.ru3;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushConversation {
    public static final int $stable = 8;
    private final String conversationId;
    private final String conversationTitle;
    private final List<Message> messages;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Message {
        public static final int $stable = 8;
        private final Uri contentImageUri;
        private final boolean isCurrentUser;
        private final String message;
        private final ox7 person;
        private final long timestamp;

        public Message(ox7 ox7Var, long j, String str, Uri uri) {
            str.getClass();
            this.person = ox7Var;
            this.timestamp = j;
            this.message = str;
            this.contentImageUri = uri;
            this.isCurrentUser = ox7Var == null;
        }

        public static /* synthetic */ Message copy$default(Message message, ox7 ox7Var, long j, String str, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                ox7Var = message.person;
            }
            if ((i & 2) != 0) {
                j = message.timestamp;
            }
            if ((i & 4) != 0) {
                str = message.message;
            }
            if ((i & 8) != 0) {
                uri = message.contentImageUri;
            }
            return message.copy(ox7Var, j, str, uri);
        }

        public final ox7 component1() {
            return this.person;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final String component3() {
            return this.message;
        }

        public final Uri component4() {
            return this.contentImageUri;
        }

        public final Message copy(ox7 ox7Var, long j, String str, Uri uri) {
            str.getClass();
            return new Message(ox7Var, j, str, uri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return xj5.a(this.person, message.person) && this.timestamp == message.timestamp && xj5.a(this.message, message.message) && xj5.a(this.contentImageUri, message.contentImageUri);
        }

        public final Uri getContentImageUri() {
            return this.contentImageUri;
        }

        public final String getMessage() {
            return this.message;
        }

        public final ox7 getPerson() {
            return this.person;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            ox7 ox7Var = this.person;
            int iC = ru3.c(al.c(this.timestamp, (ox7Var == null ? 0 : ox7Var.hashCode()) * 31, 31), 31, this.message);
            Uri uri = this.contentImageUri;
            return iC + (uri != null ? uri.hashCode() : 0);
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public String toString() {
            return "Message(person=" + this.person + ", timestamp=" + this.timestamp + ", message=" + this.message + ", contentImageUri=" + this.contentImageUri + ')';
        }
    }

    public IntercomPushConversation(String str, String str2, List<Message> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.conversationId = str;
        this.conversationTitle = str2;
        this.messages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomPushConversation copy$default(IntercomPushConversation intercomPushConversation, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intercomPushConversation.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = intercomPushConversation.conversationTitle;
        }
        if ((i & 4) != 0) {
            list = intercomPushConversation.messages;
        }
        return intercomPushConversation.copy(str, str2, list);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final String component2() {
        return this.conversationTitle;
    }

    public final List<Message> component3() {
        return this.messages;
    }

    public final IntercomPushConversation copy(String str, String str2, List<Message> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        return new IntercomPushConversation(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomPushConversation)) {
            return false;
        }
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) obj;
        return xj5.a(this.conversationId, intercomPushConversation.conversationId) && xj5.a(this.conversationTitle, intercomPushConversation.conversationTitle) && xj5.a(this.messages, intercomPushConversation.messages);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode() + ru3.c(this.conversationId.hashCode() * 31, 31, this.conversationTitle);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomPushConversation(conversationId=");
        sb.append(this.conversationId);
        sb.append(", conversationTitle=");
        sb.append(this.conversationTitle);
        sb.append(", messages=");
        return zc6.a(sb, this.messages, ')');
    }
}
