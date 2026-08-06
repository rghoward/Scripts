package io.intercom.android.sdk.tickets.create.model;

import defpackage.nl3;
import defpackage.ol3;
import io.intercom.android.sdk.metrics.MetricTracker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum CreateTicketLaunchedFrom {
    Conversation("conversation"),
    Home(MetricTracker.Context.HOME_SCREEN);

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());
    private final String from;

    CreateTicketLaunchedFrom(String str) {
        this.from = str;
    }

    public static nl3<CreateTicketLaunchedFrom> getEntries() {
        return $ENTRIES;
    }

    public final String getFrom() {
        return this.from;
    }
}
