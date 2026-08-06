package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import defpackage.uc7;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.NotificationChannel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BasePushUIKt {
    public static final uc7 createBaseNotificationBuilder(Context context, String str, String str2, NotificationChannel notificationChannel) {
        context.getClass();
        str.getClass();
        str2.getClass();
        notificationChannel.getClass();
        uc7 uc7Var = new uc7(context, notificationChannel.getChannelName());
        uc7Var.e = uc7.b(str);
        uc7Var.f = uc7.b(str2);
        uc7Var.x.icon = R.drawable.intercom_push_icon;
        uc7Var.c(true);
        return uc7Var;
    }
}
