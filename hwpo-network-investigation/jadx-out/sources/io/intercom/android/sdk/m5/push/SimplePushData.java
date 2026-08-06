package io.intercom.android.sdk.m5.push;

import android.content.Context;
import com.intercom.twig.Twig;
import defpackage.g2b;
import defpackage.js7;
import defpackage.ru3;
import defpackage.ry0;
import defpackage.sl5;
import defpackage.tm5;
import defpackage.vl5;
import defpackage.ws0;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.z2a;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.ui.common.ActualStringOrResKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class SimplePushData {
    private final String appName;
    private final String authorName;
    private final String body;
    private final String contentImageUrl;
    private final String conversationId;
    private final String conversationPartType;
    private final String imageUrl;
    private final String instanceId;
    private final String intercomPushType;
    private final sl5 json;
    private final String message;
    private final String messageData;
    private final String receiver;
    private final String title;
    private final Twig twig;
    private final String uri;

    public SimplePushData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        this.intercomPushType = str;
        this.conversationId = str2;
        this.title = str3;
        this.message = str4;
        this.body = str5;
        this.receiver = str6;
        this.authorName = str7;
        this.appName = str8;
        this.contentImageUrl = str9;
        this.imageUrl = str10;
        this.uri = str11;
        this.instanceId = str12;
        this.conversationPartType = str13;
        this.messageData = str14;
        this.json = tm5.a(new a());
        this.twig = LumberMill.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b json$lambda$0(vl5 vl5Var) {
        vl5Var.getClass();
        vl5Var.a = true;
        return g2b.a;
    }

    public final String component1() {
        return this.intercomPushType;
    }

    public final String component10() {
        return this.imageUrl;
    }

    public final String component11() {
        return this.uri;
    }

    public final String component12() {
        return this.instanceId;
    }

    public final String component13() {
        return this.conversationPartType;
    }

    public final String component14() {
        return this.messageData;
    }

    public final String component2() {
        return this.conversationId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.body;
    }

    public final String component6() {
        return this.receiver;
    }

    public final String component7() {
        return this.authorName;
    }

    public final String component8() {
        return this.appName;
    }

    public final String component9() {
        return this.contentImageUrl;
    }

    public final SimplePushData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        return new SimplePushData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePushData)) {
            return false;
        }
        SimplePushData simplePushData = (SimplePushData) obj;
        return xj5.a(this.intercomPushType, simplePushData.intercomPushType) && xj5.a(this.conversationId, simplePushData.conversationId) && xj5.a(this.title, simplePushData.title) && xj5.a(this.message, simplePushData.message) && xj5.a(this.body, simplePushData.body) && xj5.a(this.receiver, simplePushData.receiver) && xj5.a(this.authorName, simplePushData.authorName) && xj5.a(this.appName, simplePushData.appName) && xj5.a(this.contentImageUrl, simplePushData.contentImageUrl) && xj5.a(this.imageUrl, simplePushData.imageUrl) && xj5.a(this.uri, simplePushData.uri) && xj5.a(this.instanceId, simplePushData.instanceId) && xj5.a(this.conversationPartType, simplePushData.conversationPartType) && xj5.a(this.messageData, simplePushData.messageData);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final String getContentText() {
        String str = this.message;
        return z2a.w(str) ? this.body : str;
    }

    public final String getContentTitle(Context context) {
        context.getClass();
        if (!z2a.w(this.title)) {
            return this.title;
        }
        if (z2a.w(this.authorName) || z2a.w(this.appName)) {
            return !z2a.w(this.authorName) ? this.authorName : this.appName;
        }
        return ActualStringOrResKt.parseString(context, R.string.intercom_teammate_from_company, ws0.i(new js7("name", this.authorName), new js7("company", this.appName)));
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final IntercomPushData.ConversationPushData.MessageData getMessageData() {
        if (!z2a.w(this.body)) {
            return new IntercomPushData.ConversationPushData.MessageData.Text(this.body);
        }
        if (z2a.w(this.messageData)) {
            return null;
        }
        try {
            sl5 sl5Var = this.json;
            String str = this.messageData;
            sl5Var.getClass();
            return (IntercomPushData.ConversationPushData.MessageData) sl5Var.b(ry0.a(IntercomPushData.ConversationPushData.MessageData.Companion.serializer()), str);
        } catch (IllegalArgumentException e) {
            this.twig.e(e);
            return null;
        }
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.messageData.hashCode() + ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(ru3.c(this.intercomPushType.hashCode() * 31, 31, this.conversationId), 31, this.title), 31, this.message), 31, this.body), 31, this.receiver), 31, this.authorName), 31, this.appName), 31, this.contentImageUrl), 31, this.imageUrl), 31, this.uri), 31, this.instanceId), 31, this.conversationPartType);
    }

    public final boolean isIntercomPush() {
        return !z2a.w(this.intercomPushType) && Intercom.PUSH_RECEIVER.equals(this.receiver);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SimplePushData(intercomPushType=");
        sb.append(this.intercomPushType);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", receiver=");
        sb.append(this.receiver);
        sb.append(", authorName=");
        sb.append(this.authorName);
        sb.append(", appName=");
        sb.append(this.appName);
        sb.append(", contentImageUrl=");
        sb.append(this.contentImageUrl);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(", instanceId=");
        sb.append(this.instanceId);
        sb.append(", conversationPartType=");
        sb.append(this.conversationPartType);
        sb.append(", messageData=");
        return wu0.a(sb, this.messageData, ')');
    }

    /* JADX INFO: renamed from: getMessageData, reason: collision with other method in class */
    public final String m391getMessageData() {
        return this.messageData;
    }
}
