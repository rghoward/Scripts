package io.intercom.android.sdk.m5.navigation;

import defpackage.dq1;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.o67;
import defpackage.pi4;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class CreateTicketDestinationKt$createTicketDestination$4$3$1 extends pi4 implements mh4<g2b> {
    final /* synthetic */ o67 $navController;
    final /* synthetic */ dq1 $rootActivity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTicketDestinationKt$createTicketDestination$4$3$1(o67 o67Var, dq1 dq1Var) {
        super(0, xj5.a.class, "navigateUp", "createTicketDestination$navigateUp(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
        this.$navController = o67Var;
        this.$rootActivity = dq1Var;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CreateTicketDestinationKt.createTicketDestination$navigateUp(this.$navController, this.$rootActivity);
    }

    @Override // defpackage.mh4
    public /* bridge */ /* synthetic */ g2b invoke() {
        invoke2();
        return g2b.a;
    }
}
