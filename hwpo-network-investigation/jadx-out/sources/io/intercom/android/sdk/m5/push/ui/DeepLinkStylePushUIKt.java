package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.rc7;
import defpackage.sc7;
import defpackage.uc7;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeepLinkStylePushUIKt {
    public static final Notification buildDeepLinkNotification(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, TaskStackBuilder taskStackBuilder, boolean z) {
        context.getClass();
        deepLinkPushData.getClass();
        uc7 uc7VarCreateBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, deepLinkPushData.getContentTitle(), deepLinkPushData.getContentText(), NotificationChannel.ACTIONS_CHANNEL);
        if (bitmap != null) {
            rc7 rc7Var = new rc7();
            rc7Var.e = IconCompat.b(bitmap);
            rc7Var.f = null;
            rc7Var.g = true;
            rc7Var.b = uc7.b(deepLinkPushData.getContentTitle());
            rc7Var.c = uc7.b(deepLinkPushData.getContentText());
            rc7Var.d = true;
            uc7VarCreateBaseNotificationBuilder.e(rc7Var);
            uc7VarCreateBaseNotificationBuilder.d(bitmap);
        } else {
            sc7 sc7Var = new sc7();
            sc7Var.b = uc7.b(deepLinkPushData.getContentTitle());
            sc7Var.e = uc7.b(deepLinkPushData.getContentText());
            uc7VarCreateBaseNotificationBuilder.e(sc7Var);
        }
        uc7VarCreateBaseNotificationBuilder.g = ConversationDeepLinkRouterKt.buildIntentForDeepLinkScreen(context, deepLinkPushData.getUri(), deepLinkPushData.getInstanceId(), taskStackBuilder);
        uc7VarCreateBaseNotificationBuilder.y = z;
        Notification notificationA = uc7VarCreateBaseNotificationBuilder.a();
        notificationA.getClass();
        return notificationA;
    }

    public static /* synthetic */ Notification buildDeepLinkNotification$default(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, TaskStackBuilder taskStackBuilder, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            taskStackBuilder = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder, z);
    }
}
