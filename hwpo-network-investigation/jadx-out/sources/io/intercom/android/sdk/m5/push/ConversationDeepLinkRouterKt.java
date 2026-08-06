package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import defpackage.js7;
import defpackage.uy0;
import defpackage.xj5;
import defpackage.z2a;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationDeepLinkRouterKt {
    private static final int DEFAULT_REQUEST_CODE = 0;
    public static final String INTERCOM_PUSH_INSTANCE_ID = "io.intercom.android.sdk.INTERCOM_PUSH_INSTANCE_ID";

    private static final PendingIntent buildBasePendingIntent(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        if (bundle != null) {
            if (intent != null) {
                intent.putExtras(bundle);
            }
            launchIntentForPackage.putExtras(bundle);
        }
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        if (taskStackBuilder == null) {
            return intent != null ? PendingIntent.getActivity(context, iIntValue, intent, 201326592) : PendingIntent.getActivity(context, iIntValue, launchIntentForPackage, 201326592);
        }
        if (intent != null) {
            Intent[] intents = taskStackBuilder.getIntents();
            intents.getClass();
            int length = intents.length;
            while (true) {
                if (i >= length) {
                    taskStackBuilder.addNextIntent(intent);
                    break;
                }
                if (xj5.a(intents[i].getComponent(), intent.getComponent())) {
                    break;
                }
                i++;
            }
        }
        Intent[] intents2 = taskStackBuilder.getIntents();
        intents2.getClass();
        if (intents2.length == 0) {
            taskStackBuilder.addNextIntent(launchIntentForPackage);
        }
        try {
            return taskStackBuilder.getPendingIntent(iIntValue, 201326592);
        } catch (IllegalStateException unused) {
            return PendingIntent.getActivity(context, iIntValue, launchIntentForPackage, 201326592);
        }
    }

    public static /* synthetic */ PendingIntent buildBasePendingIntent$default(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle, int i, Object obj) {
        if ((i & 16) != 0) {
            bundle = null;
        }
        return buildBasePendingIntent(context, num, intent, taskStackBuilder, bundle);
    }

    public static final PendingIntent buildIntentForConversationScreen(Context context, String str, TaskStackBuilder taskStackBuilder) {
        Context context2;
        Intent intentForArgs$default;
        context.getClass();
        str.getClass();
        if (z2a.w(str)) {
            context2 = context;
            intentForArgs$default = null;
        } else {
            context2 = context;
            intentForArgs$default = IntercomRootActivityArgsKt.getIntentForArgs$default(context2, new IntercomRootActivityArgs.ConversationScreenArgs(str, BuildConfig.FLAVOR, false, null, null, null, 48, null), null, null, 4, null);
        }
        return buildBasePendingIntent(context2, intentForArgs$default != null ? Integer.valueOf(str.hashCode()) : null, intentForArgs$default, taskStackBuilder, null);
    }

    public static final PendingIntent buildIntentForDeepLinkScreen(Context context, String str, String str2, TaskStackBuilder taskStackBuilder) {
        Intent intent;
        context.getClass();
        str.getClass();
        str2.getClass();
        if (z2a.w(str)) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        }
        return buildBasePendingIntent(context, intent != null ? Integer.valueOf(str.hashCode()) : null, intent, taskStackBuilder, uy0.c(new js7(INTERCOM_PUSH_INSTANCE_ID, str2)));
    }

    public static final PendingIntent buildIntentForMessagesScreen(Context context, TaskStackBuilder taskStackBuilder) {
        context.getClass();
        return buildBasePendingIntent(context, 0, IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 4, null), taskStackBuilder, null);
    }
}
