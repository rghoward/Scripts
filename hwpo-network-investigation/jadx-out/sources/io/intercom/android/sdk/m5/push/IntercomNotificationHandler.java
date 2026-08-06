package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.intercom.twig.BuildConfig;
import com.intercom.twig.Twig;
import defpackage.cd7;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.js7;
import defpackage.kh6;
import defpackage.mh4;
import defpackage.ox7;
import defpackage.pc7;
import defpackage.pi6;
import defpackage.th1;
import defpackage.u;
import defpackage.vn9;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.z;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomNotificationHandler;
import io.intercom.android.sdk.m5.push.ui.ConversationShortcutKt;
import io.intercom.android.sdk.m5.push.ui.ConversationStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.DeepLinkStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomNotificationHandler {
    public static final IntercomNotificationHandler INSTANCE = new IntercomNotificationHandler();
    private static List<IntercomPushConversation> conversations = hf3.t;
    private static final Twig twig = LumberMill.getLogger();
    public static final int $stable = 8;

    private IntercomNotificationHandler() {
    }

    public static /* synthetic */ void processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData.ConversationPushData conversationPushData, TaskStackBuilder taskStackBuilder, boolean z, TimeProvider timeProvider, int i, Object obj) throws Throwable {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release(context, conversationPushData, taskStackBuilder, z2, timeProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b processConversationPushNotification$lambda$2(Context context, IntercomPushData.ConversationPushData conversationPushData, long j, TaskStackBuilder taskStackBuilder, boolean z, NotificationChannel notificationChannel) {
        IntercomNotificationHandler intercomNotificationHandler = INSTANCE;
        js7<IntercomPushConversation, List<IntercomPushConversation>> js7VarUpdateConversations = intercomNotificationHandler.updateConversations(context, conversationPushData, j);
        intercomNotificationHandler.showNotification(context, js7VarUpdateConversations.t, js7VarUpdateConversations.u, conversationPushData, taskStackBuilder, z, notificationChannel, null);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b processConversationPushNotification$lambda$4(IntercomPushData.ConversationPushData conversationPushData, long j, Context context, TaskStackBuilder taskStackBuilder, NotificationChannel notificationChannel, Bitmap bitmap, Bitmap bitmap2) {
        Uri bitmapUri = bitmap != null ? IntercomPushBitmapUtilsKt.getBitmapUri(context, bitmap) : null;
        IntercomNotificationHandler intercomNotificationHandler = INSTANCE;
        js7<IntercomPushConversation, List<IntercomPushConversation>> js7VarUpdateConversationImages = intercomNotificationHandler.updateConversationImages(conversationPushData.getConversationId(), j, bitmapUri, bitmap2);
        if (js7VarUpdateConversationImages == null) {
            return g2b.a;
        }
        intercomNotificationHandler.showNotification(context, js7VarUpdateConversationImages.t, js7VarUpdateConversationImages.u, conversationPushData, taskStackBuilder, true, notificationChannel, bitmap2);
        return g2b.a;
    }

    private final void processDeepLinkPushNotification(final Context context, final IntercomPushData.DeepLinkPushData deepLinkPushData, final TaskStackBuilder taskStackBuilder) throws Throwable {
        twig.i("This is a push only message", new Object[0]);
        Injector.get().getMetricTracker().receivedPushOnlyNotification("instance_id:" + deepLinkPushData.getInstanceId(), deepLinkPushData.getInstanceId());
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        appConfig.getClass();
        IntercomPushBitmapUtilsKt.loadBitmaps$default(context, appConfig, deepLinkPushData.getContentImageUrl(), null, null, new mh4() { // from class: xh5
            @Override // defpackage.mh4
            public final Object invoke() {
                return IntercomNotificationHandler.processDeepLinkPushNotification$lambda$0(context, deepLinkPushData, taskStackBuilder);
            }
        }, new ci4() { // from class: yh5
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                return IntercomNotificationHandler.processDeepLinkPushNotification$lambda$1(context, deepLinkPushData, taskStackBuilder, (Bitmap) obj, (Bitmap) obj2);
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b processDeepLinkPushNotification$lambda$0(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, TaskStackBuilder taskStackBuilder) {
        Notification notificationBuildDeepLinkNotification$default = DeepLinkStylePushUIKt.buildDeepLinkNotification$default(context, deepLinkPushData, null, taskStackBuilder, false, 16, null);
        int notificationId = deepLinkPushData.getNotificationId();
        Twig twig2 = twig;
        twig2.getClass();
        NotificationPermissionCheckerKt.showNotification(context, notificationId, notificationBuildDeepLinkNotification$default, twig2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b processDeepLinkPushNotification$lambda$1(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, TaskStackBuilder taskStackBuilder, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap != null) {
            Notification notificationBuildDeepLinkNotification = DeepLinkStylePushUIKt.buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder, true);
            int notificationId = deepLinkPushData.getNotificationId();
            Twig twig2 = twig;
            twig2.getClass();
            NotificationPermissionCheckerKt.showNotification(context, notificationId, notificationBuildDeepLinkNotification, twig2);
        }
        return g2b.a;
    }

    public static /* synthetic */ void processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData intercomPushData, TaskStackBuilder taskStackBuilder, TimeProvider timeProvider, int i, Object obj) throws Throwable {
        if ((i & 8) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release(context, intercomPushData, taskStackBuilder, timeProvider);
    }

    private final void showNotification(Context context, IntercomPushConversation intercomPushConversation, List<IntercomPushConversation> list, IntercomPushData.ConversationPushData conversationPushData, TaskStackBuilder taskStackBuilder, boolean z, NotificationChannel notificationChannel, Bitmap bitmap) {
        js7<List<vn9>, vn9> js7VarCreateTemporaryShortcut = ConversationShortcutKt.createTemporaryShortcut(context, intercomPushConversation.getConversationId(), intercomPushConversation.getConversationTitle(), bitmap);
        List<vn9> list2 = js7VarCreateTemporaryShortcut.t;
        vn9 vn9Var = js7VarCreateTemporaryShortcut.u;
        Notification notificationBuildConversationStyleNotification = ConversationStylePushUIKt.buildConversationStyleNotification(context, intercomPushConversation, vn9Var, conversationPushData, notificationChannel, z, taskStackBuilder);
        Notification notificationBuildConversationStyleSummaryNotification = list.size() > 1 ? ConversationStylePushUIKt.buildConversationStyleSummaryNotification(context, list, notificationChannel, taskStackBuilder) : null;
        kh6 kh6Var = new kh6();
        kh6Var.put(Integer.valueOf(conversationPushData.getNotificationId()), notificationBuildConversationStyleNotification);
        if (notificationBuildConversationStyleSummaryNotification != null) {
            kh6Var.put(Integer.valueOf(ConversationStylePushUIKt.SUMMARY_NOTIFICATION_ID), notificationBuildConversationStyleSummaryNotification);
        }
        kh6 kh6VarF = pi6.f(kh6Var);
        Twig twig2 = twig;
        twig2.getClass();
        NotificationPermissionCheckerKt.showNotifications(context, kh6VarF, twig2);
        ConversationShortcutKt.resetShortcuts(context, list2, vn9Var, twig2);
    }

    private final synchronized js7<IntercomPushConversation, List<IntercomPushConversation>> updateConversationImages(String str, long j, Uri uri, Bitmap bitmap) {
        Object next;
        ox7 ox7Var;
        try {
            Iterator<T> it = conversations.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!xj5.a(((IntercomPushConversation) next).getConversationId(), str));
            IntercomPushConversation intercomPushConversation = (IntercomPushConversation) next;
            if (intercomPushConversation == null) {
                return null;
            }
            if (intercomPushConversation.getMessages().isEmpty()) {
                return null;
            }
            Iterator<IntercomPushConversation.Message> it2 = intercomPushConversation.getMessages().iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (it2.next().getTimestamp() == j) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return null;
            }
            IntercomPushConversation.Message message = intercomPushConversation.getMessages().get(i);
            ox7 person = message.getPerson();
            if (person != null) {
                CharSequence charSequence = person.a;
                String str2 = person.d;
                IconCompat iconCompatB = bitmap != null ? IconCompat.b(bitmap) : person.b;
                ox7 ox7Var2 = new ox7();
                ox7Var2.a = charSequence;
                ox7Var2.b = iconCompatB;
                ox7Var2.c = null;
                ox7Var2.d = str2;
                ox7Var2.e = false;
                ox7Var2.f = false;
                ox7Var = ox7Var2;
            } else {
                ox7Var = null;
            }
            IntercomPushConversation.Message messageCopy$default = IntercomPushConversation.Message.copy$default(message, ox7Var, 0L, null, uri, 6, null);
            ArrayList arrayListU = th1.U(intercomPushConversation.getMessages());
            arrayListU.set(i, messageCopy$default);
            IntercomPushConversation intercomPushConversationCopy$default = IntercomPushConversation.copy$default(intercomPushConversation, null, null, arrayListU, 3, null);
            List<IntercomPushConversation> list = conversations;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!xj5.a(((IntercomPushConversation) obj).getConversationId(), str)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayListL = th1.L(arrayList, intercomPushConversationCopy$default);
            conversations = arrayListL;
            return new js7<>(intercomPushConversationCopy$default, arrayListL);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized js7<IntercomPushConversation, List<IntercomPushConversation>> updateConversations(Context context, IntercomPushData.ConversationPushData conversationPushData, long j) {
        Object next;
        IntercomPushConversation intercomPushConversationCopy$default;
        ArrayList arrayListL;
        try {
            Iterator<T> it = conversations.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!xj5.a(((IntercomPushConversation) next).getConversationId(), conversationPushData.getConversationId()));
            IntercomPushConversation intercomPushConversation = (IntercomPushConversation) next;
            IntercomPushConversation.Message message$default = ConversationStylePushUIKt.toMessage$default(conversationPushData, j, null, null, 6, null);
            if (intercomPushConversation == null) {
                String conversationId = conversationPushData.getConversationId();
                String authorName = conversationPushData.getAuthorName();
                if (z2a.w(authorName)) {
                    authorName = context.getString(R.string.intercom_new_notifications);
                    authorName.getClass();
                }
                intercomPushConversationCopy$default = new IntercomPushConversation(conversationId, authorName, ws0.h(message$default));
            } else {
                IntercomPushConversation.Message message = (IntercomPushConversation.Message) th1.H(intercomPushConversation.getMessages());
                List listL = (message == null || !message.isCurrentUser() || conversationPushData.isCurrentUser()) ? th1.L(intercomPushConversation.getMessages(), message$default) : ws0.h(message$default);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listL.iterator();
                while (it2.hasNext()) {
                    ox7 person = ((IntercomPushConversation.Message) it2.next()).getPerson();
                    if (person != null) {
                        arrayList.add(person);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (hashSet.add(((ox7) obj).d)) {
                        arrayList2.add(obj);
                    }
                }
                intercomPushConversationCopy$default = IntercomPushConversation.copy$default(intercomPushConversation, null, arrayList2.size() > 1 ? GroupConversationTextFormatter.groupConversationTitle(((ox7) th1.G(arrayList2)).a.toString(), arrayList2.size() - 1, context).toString() : intercomPushConversation.getConversationTitle(), listL, 1, null);
            }
            List<IntercomPushConversation> list = conversations;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!xj5.a(((IntercomPushConversation) obj2).getConversationId(), intercomPushConversationCopy$default.getConversationId())) {
                    arrayList3.add(obj2);
                }
            }
            arrayListL = th1.L(arrayList3, intercomPushConversationCopy$default);
            conversations = arrayListL;
        } catch (Throwable th) {
            throw th;
        }
        return new js7<>(intercomPushConversationCopy$default, arrayListL);
    }

    public final synchronized void clear(Context context) {
        context.getClass();
        if (!conversations.isEmpty()) {
            twig.i("Removing Intercom push notifications.", new Object[0]);
        }
        try {
            try {
                new cd7(context).b.cancelAll();
            } catch (NullPointerException e) {
                twig.w("Failed to clear notifications due to unavailable NotificationManager service.", e);
            }
        } catch (Exception e2) {
            twig.w("Failed to clear notifications due to unexpected error.", e2);
        }
        conversations = hf3.t;
    }

    public final List<IntercomPushConversation> getConversations$intercom_sdk_base_release() {
        return conversations;
    }

    public final void processConversationPushNotification$intercom_sdk_base_release(final Context context, final IntercomPushData.ConversationPushData conversationPushData, final TaskStackBuilder taskStackBuilder, final boolean z, TimeProvider timeProvider) throws Throwable {
        String url;
        context.getClass();
        conversationPushData.getClass();
        timeProvider.getClass();
        if (Injector.get().getDataLayer().getHostAppState().getValue().isForeground()) {
            twig.i("Intercom message received but not displayed in notification bar. This happened because the host app was in the foreground.", new Object[0]);
            return;
        }
        twig.i("This is a background push message", new Object[0]);
        Injector.get().getMetricTracker().receivedPushNotification(conversationPushData.getConversationId());
        final NotificationChannel notificationChannel = conversationPushData.isNewConversation() ? NotificationChannel.NEW_CHATS_CHANNEL : NotificationChannel.CHAT_REPLIES_CHANNEL;
        IntercomPushData.ConversationPushData.MessageData messageData = conversationPushData.getMessageData();
        IntercomPushData.ConversationPushData.MessageData.Image image = messageData instanceof IntercomPushData.ConversationPushData.MessageData.Image ? (IntercomPushData.ConversationPushData.MessageData.Image) messageData : null;
        if (image == null || (url = image.getUrl()) == null) {
            url = BuildConfig.FLAVOR;
        }
        String str = url;
        final long jCurrentTimeMillis = timeProvider.currentTimeMillis();
        AppConfig appConfig = (AppConfig) z.a();
        appConfig.getClass();
        IntercomPushBitmapUtilsKt.loadBitmaps(context, appConfig, str, conversationPushData.getAvatarUrl(), conversationPushData.getAuthorName(), new mh4() { // from class: vh5
            @Override // defpackage.mh4
            public final Object invoke() {
                return IntercomNotificationHandler.processConversationPushNotification$lambda$2(context, conversationPushData, jCurrentTimeMillis, taskStackBuilder, z, notificationChannel);
            }
        }, new ci4() { // from class: wh5
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                return IntercomNotificationHandler.processConversationPushNotification$lambda$4(conversationPushData, jCurrentTimeMillis, context, taskStackBuilder, notificationChannel, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public final void processIntercomPushNotification$intercom_sdk_base_release(Context context, IntercomPushData intercomPushData, TaskStackBuilder taskStackBuilder, TimeProvider timeProvider) throws Throwable {
        context.getClass();
        intercomPushData.getClass();
        timeProvider.getClass();
        if (intercomPushData instanceof IntercomPushData.DeepLinkPushData) {
            processDeepLinkPushNotification(context, (IntercomPushData.DeepLinkPushData) intercomPushData, taskStackBuilder);
        } else if (intercomPushData instanceof IntercomPushData.ConversationPushData) {
            processConversationPushNotification$intercom_sdk_base_release$default(this, context, (IntercomPushData.ConversationPushData) intercomPushData, taskStackBuilder, false, timeProvider, 8, null);
        } else {
            u.b();
        }
    }

    public final void setConversations$intercom_sdk_base_release(List<IntercomPushConversation> list) {
        list.getClass();
        conversations = list;
    }

    public final void setUpNotificationChannels$intercom_sdk_base_release(Context context) {
        context.getClass();
        try {
            pc7 pc7Var = new pc7(NotificationChannel.CHAT_REPLIES_CHANNEL.getChannelName());
            pc7Var.b = context.getString(R.string.intercom_notification_channel_chat_replies_title);
            pc7Var.d = context.getString(R.string.intercom_notification_channel_chat_replies_description);
            pc7 pc7Var2 = new pc7(NotificationChannel.NEW_CHATS_CHANNEL.getChannelName());
            pc7Var2.b = context.getString(R.string.intercom_notification_channel_new_chats_title);
            pc7Var2.d = context.getString(R.string.intercom_notification_channel_new_chats_description);
            pc7 pc7Var3 = new pc7(NotificationChannel.ACTIONS_CHANNEL.getChannelName());
            pc7Var3.b = context.getString(R.string.intercom_notification_channel_actions_title);
            pc7Var3.d = context.getString(R.string.intercom_notification_channel_actions_description);
            new cd7(context).a(ws0.i(pc7Var, pc7Var2, pc7Var3));
        } catch (NullPointerException e) {
            twig.w("Failed to create notification channels due to unavailable NotificationManager service. This can happen during app initialization or in restricted environments. Notifications may not work until the service becomes available.", e);
        } catch (Exception e2) {
            twig.w("Failed to create notification channels due to unexpected error.", e2);
        }
    }

    public static /* synthetic */ void getConversations$intercom_sdk_base_release$annotations() {
    }
}
