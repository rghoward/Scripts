package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ld6;
import defpackage.ox7;
import defpackage.qc7;
import defpackage.rh1;
import defpackage.u;
import defpackage.uc7;
import defpackage.vn9;
import defpackage.wc7;
import defpackage.xc7;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.ConversationActionHandlerKt;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationStylePushUIKt {
    public static final String KEY_GROUP_CONVERSATION = "io.intercom.android.sdk.INTERCOM_KEY_GROUP_CONVERSATION";
    public static final int SUMMARY_NOTIFICATION_ID = 9999997;

    public static final Notification buildConversationStyleNotification(Context context, IntercomPushConversation intercomPushConversation, vn9 vn9Var, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z, TaskStackBuilder taskStackBuilder) {
        qc7 qc7VarBuildContextualAction;
        context.getClass();
        intercomPushConversation.getClass();
        conversationPushData.getClass();
        notificationChannel.getClass();
        String string = context.getString(R.string.intercom_new_notifications);
        string.getClass();
        String messagesContentText = getMessagesContentText(context, intercomPushConversation.getMessages().size());
        String string2 = context.getString(R.string.intercom_you);
        string2.getClass();
        ox7 ox7Var = new ox7();
        ox7Var.a = string2;
        ox7Var.b = null;
        ox7Var.c = null;
        ox7Var.d = null;
        ox7Var.e = false;
        ox7Var.f = false;
        xc7 xc7Var = new xc7(ox7Var);
        for (IntercomPushConversation.Message message : intercomPushConversation.getMessages()) {
            xc7.d dVar = new xc7.d(message.getMessage(), message.getTimestamp(), message.getPerson());
            Uri contentImageUri = message.getContentImageUri();
            if (contentImageUri != null) {
                dVar.e = "image/png";
                dVar.f = contentImageUri;
            }
            ArrayList arrayList = xc7Var.e;
            arrayList.add(dVar);
            if (arrayList.size() > 25) {
                arrayList.remove(0);
            }
        }
        uc7 uc7VarCreateBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel);
        uc7VarCreateBaseNotificationBuilder.e(xc7Var);
        if (vn9Var != null) {
            String str = vn9Var.b;
            uc7VarCreateBaseNotificationBuilder.t = str;
            if (uc7VarCreateBaseNotificationBuilder.u == null) {
                ld6 ld6Var = vn9Var.k;
                if (ld6Var != null) {
                    uc7VarCreateBaseNotificationBuilder.u = ld6Var;
                } else if (str != null) {
                    uc7VarCreateBaseNotificationBuilder.u = new ld6(str);
                }
            }
            if (uc7VarCreateBaseNotificationBuilder.e == null) {
                uc7VarCreateBaseNotificationBuilder.e = uc7.b(vn9Var.e);
            }
        }
        uc7VarCreateBaseNotificationBuilder.g = ConversationDeepLinkRouterKt.buildIntentForConversationScreen(context, intercomPushConversation.getConversationId(), taskStackBuilder);
        if ((conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Attachment) && (qc7VarBuildContextualAction = ConversationActionHandlerKt.buildContextualAction(context, ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getUrl())) != null) {
            uc7VarCreateBaseNotificationBuilder.b.add(qc7VarBuildContextualAction);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            uc7VarCreateBaseNotificationBuilder.w = BubbleMetaDataKt.getBubbleMetaData(context, intercomPushConversation);
        }
        uc7VarCreateBaseNotificationBuilder.m = KEY_GROUP_CONVERSATION;
        uc7VarCreateBaseNotificationBuilder.y = z;
        Notification notificationA = uc7VarCreateBaseNotificationBuilder.a();
        notificationA.getClass();
        return notificationA;
    }

    public static /* synthetic */ Notification buildConversationStyleNotification$default(Context context, IntercomPushConversation intercomPushConversation, vn9 vn9Var, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z, TaskStackBuilder taskStackBuilder, int i, Object obj) {
        if ((i & 64) != 0) {
            taskStackBuilder = null;
        }
        return buildConversationStyleNotification(context, intercomPushConversation, vn9Var, conversationPushData, notificationChannel, z, taskStackBuilder);
    }

    public static final Notification buildConversationStyleSummaryNotification(Context context, List<IntercomPushConversation> list, NotificationChannel notificationChannel, TaskStackBuilder taskStackBuilder) {
        CharSequence charSequence;
        context.getClass();
        list.getClass();
        notificationChannel.getClass();
        String string = context.getString(R.string.intercom_new_notifications);
        string.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            rh1.o(((IntercomPushConversation) it.next()).getMessages(), arrayList);
        }
        String messagesContentText = getMessagesContentText(context, arrayList.size());
        wc7 wc7Var = new wc7();
        wc7Var.b = uc7.b(string);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            for (IntercomPushConversation.Message message : ((IntercomPushConversation) it2.next()).getMessages()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ox7 person = message.getPerson();
                if (person != null && (charSequence = person.a) != null) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = spannableStringBuilder.length();
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    sb.append(' ');
                    spannableStringBuilder.append((CharSequence) sb.toString());
                    spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                }
                spannableStringBuilder.append((CharSequence) message.getMessage());
                wc7Var.e.add(uc7.b(new SpannedString(spannableStringBuilder)));
            }
        }
        uc7 uc7VarCreateBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel);
        uc7VarCreateBaseNotificationBuilder.g = ConversationDeepLinkRouterKt.buildIntentForMessagesScreen(context, taskStackBuilder);
        uc7VarCreateBaseNotificationBuilder.m = KEY_GROUP_CONVERSATION;
        uc7VarCreateBaseNotificationBuilder.n = true;
        uc7VarCreateBaseNotificationBuilder.e(wc7Var);
        Notification notificationA = uc7VarCreateBaseNotificationBuilder.a();
        notificationA.getClass();
        return notificationA;
    }

    private static final String getMessagesContentText(Context context, int i) {
        String string = i == 1 ? context.getString(R.string.intercom_one_new_message) : Phrase.from(context, R.string.intercom_new_messages).put("n", i).format().toString();
        string.getClass();
        return string;
    }

    public static final IntercomPushConversation.Message toMessage(IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri) {
        ox7 ox7Var;
        String title;
        conversationPushData.getClass();
        if (conversationPushData.isCurrentUser()) {
            ox7Var = null;
        } else {
            String authorName = conversationPushData.getAuthorName();
            String str = conversationPushData.getAuthorName() + conversationPushData.getAvatarUrl();
            IconCompat iconCompatB = bitmap != null ? IconCompat.b(bitmap) : null;
            ox7 ox7Var2 = new ox7();
            ox7Var2.a = authorName;
            ox7Var2.b = iconCompatB;
            ox7Var2.c = null;
            ox7Var2.d = str;
            ox7Var2.e = false;
            ox7Var2.f = false;
            ox7Var = ox7Var2;
        }
        IntercomPushData.ConversationPushData.MessageData messageData = conversationPushData.getMessageData();
        if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Text) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Text) conversationPushData.getMessageData()).getMessage();
        } else if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Image) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getTitle();
        } else {
            if (!(messageData instanceof IntercomPushData.ConversationPushData.MessageData.Attachment)) {
                u.b();
                return null;
            }
            title = ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getTitle();
        }
        return new IntercomPushConversation.Message(ox7Var, j, title, uri);
    }

    public static /* synthetic */ IntercomPushConversation.Message toMessage$default(IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri, int i, Object obj) {
        if ((i & 2) != 0) {
            bitmap = null;
        }
        if ((i & 4) != 0) {
            uri = null;
        }
        return toMessage(conversationPushData, j, bitmap, uri);
    }
}
