package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.os.Bundle;
import defpackage.c89;
import defpackage.hl3;
import defpackage.ll8;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.sd9;
import defpackage.st1;
import defpackage.uo2;
import defpackage.wn5;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.z2a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface IntercomPushData {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final IntercomPushData createFrom(Context context, Bundle bundle) {
            context.getClass();
            bundle.getClass();
            SimplePushData simplePushDataFromBundle = IntercomPushDataKt.getSimplePushDataFromBundle(bundle);
            if (!simplePushDataFromBundle.isIntercomPush()) {
                return null;
            }
            if (xj5.a(simplePushDataFromBundle.getIntercomPushType(), "push_only")) {
                return new DeepLinkPushData(simplePushDataFromBundle.getContentTitle(context), simplePushDataFromBundle.getContentText(), simplePushDataFromBundle.getUri(), simplePushDataFromBundle.getContentImageUrl(), simplePushDataFromBundle.getInstanceId());
            }
            String authorName = simplePushDataFromBundle.getAuthorName();
            String imageUrl = simplePushDataFromBundle.getImageUrl();
            String conversationId = simplePushDataFromBundle.getConversationId();
            boolean zA = xj5.a(simplePushDataFromBundle.getConversationPartType(), MetricTracker.Object.MESSAGE);
            ConversationPushData.MessageData messageData = simplePushDataFromBundle.getMessageData();
            if (messageData == null) {
                messageData = new ConversationPushData.MessageData.Text(z2a.R(z2a.C(simplePushDataFromBundle.getContentText(), simplePushDataFromBundle.getAuthorName() + ':')).toString());
            }
            return new ConversationPushData(authorName, imageUrl, conversationId, messageData, false, zA);
        }

        public final boolean isIntercomPush(Bundle bundle) {
            bundle.getClass();
            return IntercomPushDataKt.getSimplePushDataFromBundle(bundle).isIntercomPush();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ConversationPushData implements IntercomPushData {
        public static final int $stable = 8;
        private final String authorName;
        private final String avatarUrl;
        private final String conversationId;
        private final boolean isCurrentUser;
        private final boolean isNewConversation;
        private final MessageData messageData;

        public ConversationPushData(String str, String str2, String str3, MessageData messageData, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            messageData.getClass();
            this.authorName = str;
            this.avatarUrl = str2;
            this.conversationId = str3;
            this.messageData = messageData;
            this.isCurrentUser = z;
            this.isNewConversation = z2;
        }

        public static /* synthetic */ ConversationPushData copy$default(ConversationPushData conversationPushData, String str, String str2, String str3, MessageData messageData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversationPushData.authorName;
            }
            if ((i & 2) != 0) {
                str2 = conversationPushData.avatarUrl;
            }
            if ((i & 4) != 0) {
                str3 = conversationPushData.conversationId;
            }
            if ((i & 8) != 0) {
                messageData = conversationPushData.messageData;
            }
            if ((i & 16) != 0) {
                z = conversationPushData.isCurrentUser;
            }
            if ((i & 32) != 0) {
                z2 = conversationPushData.isNewConversation;
            }
            boolean z3 = z;
            boolean z4 = z2;
            return conversationPushData.copy(str, str2, str3, messageData, z3, z4);
        }

        public final String component1() {
            return this.authorName;
        }

        public final String component2() {
            return this.avatarUrl;
        }

        public final String component3() {
            return this.conversationId;
        }

        public final MessageData component4() {
            return this.messageData;
        }

        public final boolean component5() {
            return this.isCurrentUser;
        }

        public final boolean component6() {
            return this.isNewConversation;
        }

        public final ConversationPushData copy(String str, String str2, String str3, MessageData messageData, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            messageData.getClass();
            return new ConversationPushData(str, str2, str3, messageData, z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationPushData)) {
                return false;
            }
            ConversationPushData conversationPushData = (ConversationPushData) obj;
            return xj5.a(this.authorName, conversationPushData.authorName) && xj5.a(this.avatarUrl, conversationPushData.avatarUrl) && xj5.a(this.conversationId, conversationPushData.conversationId) && xj5.a(this.messageData, conversationPushData.messageData) && this.isCurrentUser == conversationPushData.isCurrentUser && this.isNewConversation == conversationPushData.isNewConversation;
        }

        public final String getAuthorName() {
            return this.authorName;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final MessageData getMessageData() {
            return this.messageData;
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.conversationId.hashCode();
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNewConversation) + uo2.a((this.messageData.hashCode() + ru3.c(ru3.c(this.authorName.hashCode() * 31, 31, this.avatarUrl), 31, this.conversationId)) * 31, this.isCurrentUser, 31);
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public final boolean isNewConversation() {
            return this.isNewConversation;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ConversationPushData(authorName=");
            sb.append(this.authorName);
            sb.append(", avatarUrl=");
            sb.append(this.avatarUrl);
            sb.append(", conversationId=");
            sb.append(this.conversationId);
            sb.append(", messageData=");
            sb.append(this.messageData);
            sb.append(", isCurrentUser=");
            sb.append(this.isCurrentUser);
            sb.append(", isNewConversation=");
            return pi1.a(sb, this.isNewConversation, ')');
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @rd9
        public interface MessageData {
            public static final Companion Companion = Companion.$$INSTANCE;

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();

                private Companion() {
                }

                public final KSerializer<MessageData> serializer() {
                    return new c89(ll8.a(MessageData.class), new wn5[]{ll8.a(Attachment.class), ll8.a(Image.class), ll8.a(Text.class)}, new KSerializer[]{IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE}, new Annotation[0]);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @rd9
            public static final class Attachment implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);
                private final String title;
                private final String url;

                public /* synthetic */ Attachment(int i, String str, String str2, sd9 sd9Var) {
                    if (3 != (i & 3)) {
                        hl3.b(i, 3, IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = attachment.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = attachment.url;
                    }
                    return attachment.copy(str, str2);
                }

                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Attachment attachment, st1 st1Var, SerialDescriptor serialDescriptor) {
                    st1Var.p(serialDescriptor, 0, attachment.title);
                    st1Var.p(serialDescriptor, 1, attachment.url);
                }

                public final String component1() {
                    return this.title;
                }

                public final String component2() {
                    return this.url;
                }

                public final Attachment copy(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    return new Attachment(str, str2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Attachment)) {
                        return false;
                    }
                    Attachment attachment = (Attachment) obj;
                    return xj5.a(this.title, attachment.title) && xj5.a(this.url, attachment.url);
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.url.hashCode() + (this.title.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("Attachment(title=");
                    sb.append(this.title);
                    sb.append(", url=");
                    return wu0.a(sb, this.url, ')');
                }

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class Companion {
                    private Companion() {
                    }

                    public final KSerializer<Attachment> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(qq2 qq2Var) {
                        this();
                    }
                }

                public Attachment(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.url = str2;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @rd9
            public static final class Image implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);
                private final String title;
                private final String url;

                public /* synthetic */ Image(int i, String str, String str2, sd9 sd9Var) {
                    if (3 != (i & 3)) {
                        hl3.b(i, 3, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = image.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = image.url;
                    }
                    return image.copy(str, str2);
                }

                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Image image, st1 st1Var, SerialDescriptor serialDescriptor) {
                    st1Var.p(serialDescriptor, 0, image.title);
                    st1Var.p(serialDescriptor, 1, image.url);
                }

                public final String component1() {
                    return this.title;
                }

                public final String component2() {
                    return this.url;
                }

                public final Image copy(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    return new Image(str, str2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) obj;
                    return xj5.a(this.title, image.title) && xj5.a(this.url, image.url);
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.url.hashCode() + (this.title.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("Image(title=");
                    sb.append(this.title);
                    sb.append(", url=");
                    return wu0.a(sb, this.url, ')');
                }

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class Companion {
                    private Companion() {
                    }

                    public final KSerializer<Image> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(qq2 qq2Var) {
                        this();
                    }
                }

                public Image(String str, String str2) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.url = str2;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @rd9
            public static final class Text implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);
                private final String message;

                public /* synthetic */ Text(int i, String str, sd9 sd9Var) {
                    if (1 == (i & 1)) {
                        this.message = str;
                    } else {
                        hl3.b(i, 1, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                }

                public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = text.message;
                    }
                    return text.copy(str);
                }

                public final String component1() {
                    return this.message;
                }

                public final Text copy(String str) {
                    str.getClass();
                    return new Text(str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && xj5.a(this.message, ((Text) obj).message);
                }

                public final String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return wu0.a(new StringBuilder("Text(message="), this.message, ')');
                }

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class Companion {
                    private Companion() {
                    }

                    public final KSerializer<Text> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(qq2 qq2Var) {
                        this();
                    }
                }

                public Text(String str) {
                    str.getClass();
                    this.message = str;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DeepLinkPushData implements IntercomPushData {
        public static final int $stable = 0;
        private final String contentImageUrl;
        private final String contentText;
        private final String contentTitle;
        private final String instanceId;
        private final String uri;

        public DeepLinkPushData(String str, String str2, String str3, String str4, String str5) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            this.contentTitle = str;
            this.contentText = str2;
            this.uri = str3;
            this.contentImageUrl = str4;
            this.instanceId = str5;
        }

        public static /* synthetic */ DeepLinkPushData copy$default(DeepLinkPushData deepLinkPushData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deepLinkPushData.contentTitle;
            }
            if ((i & 2) != 0) {
                str2 = deepLinkPushData.contentText;
            }
            if ((i & 4) != 0) {
                str3 = deepLinkPushData.uri;
            }
            if ((i & 8) != 0) {
                str4 = deepLinkPushData.contentImageUrl;
            }
            if ((i & 16) != 0) {
                str5 = deepLinkPushData.instanceId;
            }
            String str6 = str5;
            String str7 = str3;
            return deepLinkPushData.copy(str, str2, str7, str4, str6);
        }

        public final String component1() {
            return this.contentTitle;
        }

        public final String component2() {
            return this.contentText;
        }

        public final String component3() {
            return this.uri;
        }

        public final String component4() {
            return this.contentImageUrl;
        }

        public final String component5() {
            return this.instanceId;
        }

        public final DeepLinkPushData copy(String str, String str2, String str3, String str4, String str5) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            return new DeepLinkPushData(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeepLinkPushData)) {
                return false;
            }
            DeepLinkPushData deepLinkPushData = (DeepLinkPushData) obj;
            return xj5.a(this.contentTitle, deepLinkPushData.contentTitle) && xj5.a(this.contentText, deepLinkPushData.contentText) && xj5.a(this.uri, deepLinkPushData.uri) && xj5.a(this.contentImageUrl, deepLinkPushData.contentImageUrl) && xj5.a(this.instanceId, deepLinkPushData.instanceId);
        }

        public final String getContentImageUrl() {
            return this.contentImageUrl;
        }

        public final String getContentText() {
            return this.contentText;
        }

        public final String getContentTitle() {
            return this.contentTitle;
        }

        public final String getInstanceId() {
            return this.instanceId;
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.instanceId.hashCode();
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.instanceId.hashCode() + ru3.c(ru3.c(ru3.c(this.contentTitle.hashCode() * 31, 31, this.contentText), 31, this.uri), 31, this.contentImageUrl);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DeepLinkPushData(contentTitle=");
            sb.append(this.contentTitle);
            sb.append(", contentText=");
            sb.append(this.contentText);
            sb.append(", uri=");
            sb.append(this.uri);
            sb.append(", contentImageUrl=");
            sb.append(this.contentImageUrl);
            sb.append(", instanceId=");
            return wu0.a(sb, this.instanceId, ')');
        }
    }

    int getNotificationId();
}
