package io.intercom.android.sdk.m5.navigation;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.o67;
import defpackage.pi4;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class TicketDetailDestinationKt$ticketDetailDestination$17$2$1 extends pi4 implements ci4<String, Boolean, g2b> {
    final /* synthetic */ o67 $navController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDetailDestinationKt$ticketDetailDestination$17$2$1(o67 o67Var) {
        super(2, xj5.a.class, "onConversationCTAClicked", "ticketDetailDestination$onConversationCTAClicked(Landroidx/navigation/NavHostController;Ljava/lang/String;Z)V", 0);
        this.$navController = o67Var;
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(String str, Boolean bool) {
        invoke(str, bool.booleanValue());
        return g2b.a;
    }

    public final void invoke(String str, boolean z) {
        TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(this.$navController, str, z);
    }
}
