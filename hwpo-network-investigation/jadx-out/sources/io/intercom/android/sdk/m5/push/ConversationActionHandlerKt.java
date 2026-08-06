package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ac4;
import defpackage.qc7;
import defpackage.uc7;
import defpackage.wm8;
import io.intercom.android.sdk.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationActionHandlerKt {
    public static final qc7 buildContextualAction(Context context, String str) {
        context.getClass();
        str.getClass();
        int i = R.drawable.intercom_ic_attachment;
        PorterDuff.Mode mode = IconCompat.k;
        IconCompat iconCompatC = IconCompat.c(context.getResources(), context.getPackageName(), i);
        PendingIntent attachmentIntent = getAttachmentIntent(context, str);
        Bundle bundle = new Bundle();
        CharSequence charSequenceB = uc7.b("Open Attachment");
        if (attachmentIntent == null) {
            ac4.c("Contextual Actions must contain a valid PendingIntent");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
        }
        return new qc7(iconCompatC, charSequenceB, attachmentIntent, bundle, arrayList2.isEmpty() ? null : (wm8[]) arrayList2.toArray(new wm8[arrayList2.size()]), true, true, true);
    }

    private static final PendingIntent getAttachmentIntent(Context context, String str) {
        int iHashCode = str.hashCode();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(context, iHashCode, intent, 201326592);
        activity.getClass();
        return activity;
    }
}
