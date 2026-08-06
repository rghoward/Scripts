package io.intercom.android.sdk.m5.navigation;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import io.intercom.android.sdk.tickets.list.ui.TicketsLoadingScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketsDestinationKt {
    public static final ComposableSingletons$TicketsDestinationKt INSTANCE = new ComposableSingletons$TicketsDestinationKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f274lambda1 = new fr1(false, -1433294616, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.ComposableSingletons$TicketsDestinationKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                TicketsLoadingScreenKt.TicketsLoadingScreen(null, jt1Var, 0, 1);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m374getLambda1$intercom_sdk_base_release() {
        return f274lambda1;
    }
}
