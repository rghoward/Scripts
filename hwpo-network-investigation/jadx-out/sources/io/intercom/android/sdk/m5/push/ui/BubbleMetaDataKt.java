package io.intercom.android.sdk.m5.push.ui;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ac4;
import defpackage.ox7;
import defpackage.tc7;
import defpackage.th1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BubbleMetaDataKt {
    public static final tc7 getBubbleMetaData(Context context, IntercomPushConversation intercomPushConversation) {
        ox7 person;
        context.getClass();
        intercomPushConversation.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, 2, ConversationScreenOpenerKt.getComposerIntent$default(context, null, false, null, intercomPushConversation.getConversationId(), IntercomBubbleActivity.class, 2, null), 33554432);
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) th1.A(intercomPushConversation.getMessages());
        IconCompat iconCompatC = (message == null || (person = message.getPerson()) == null) ? null : person.b;
        if (iconCompatC == null) {
            int i = R.drawable.intercom_ic_avatar_person;
            PorterDuff.Mode mode = IconCompat.k;
            iconCompatC = IconCompat.c(context.getResources(), context.getPackageName(), i);
        }
        if (activity == null) {
            ac4.c("Bubble requires non-null pending intent");
            return null;
        }
        int iMax = Math.max(600, 0);
        tc7 tc7Var = new tc7();
        tc7Var.a = activity;
        tc7Var.b = iconCompatC;
        tc7Var.c = iMax;
        tc7Var.d = 2;
        return tc7Var;
    }
}
