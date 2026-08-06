package io.intercom.android.sdk.m5.navigation;

import defpackage.g2b;
import defpackage.mh4;
import defpackage.pi4;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class TicketsDestinationKt$ticketsDestination$7$1$1$1 extends pi4 implements mh4<g2b> {
    public TicketsDestinationKt$ticketsDestination$7$1$1$1(Object obj) {
        super(0, obj, TicketsScreenViewModel.class, "onRetryOpen", "onRetryOpen()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TicketsScreenViewModel) this.receiver).onRetryOpen();
    }

    @Override // defpackage.mh4
    public /* bridge */ /* synthetic */ g2b invoke() {
        invoke2();
        return g2b.a;
    }
}
