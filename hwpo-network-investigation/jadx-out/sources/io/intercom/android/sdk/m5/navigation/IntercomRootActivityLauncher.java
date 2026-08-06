package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import defpackage.hf3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootActivityLauncher {
    public static final int $stable = 0;
    public static final IntercomRootActivityLauncher INSTANCE = new IntercomRootActivityLauncher();

    private IntercomRootActivityLauncher() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startHelpCenterCollections$default(IntercomRootActivityLauncher intercomRootActivityLauncher, Context context, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            list = hf3.t;
        }
        intercomRootActivityLauncher.startHelpCenterCollections(context, list, str);
    }

    public final void startHelpCenterCollection(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionArgs(str, str2), null, null, 12, null));
    }

    public final void startHelpCenterCollections(Context context, List<String> list, String str) {
        context.getClass();
        list.getClass();
        str.getClass();
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionsArgs(list, str), null, null, 12, null));
    }

    public final void startHome(Context context) {
        context.getClass();
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.HomeScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startMessages(Context context) {
        context.getClass();
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startTicketDetails(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.TicketDetailsScreenArgs(str, str2), null, null, 12, null));
    }

    public final void startTickets(Context context) {
        context.getClass();
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.TicketsScreenArgs.INSTANCE, null, null, 12, null));
    }
}
