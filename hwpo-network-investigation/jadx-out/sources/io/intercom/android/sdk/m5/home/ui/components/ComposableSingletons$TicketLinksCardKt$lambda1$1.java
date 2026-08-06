package io.intercom.android.sdk.m5.home.ui.components;

import com.intercom.twig.BuildConfig;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ws0;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$TicketLinksCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketLinksCardKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$TicketLinksCardKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketLinksCardKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(TicketType ticketType) {
        ticketType.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        TicketType.Companion companion = TicketType.Companion;
        HomeCards.HomeTicketLinksData homeTicketLinksData = new HomeCards.HomeTicketLinksData("Create a ticket", HomeCardType.TICKET_LINKS, ws0.i(new TicketLink(1L, "Billing issue", BuildConfig.FLAVOR, 0, companion.getNULL()), new TicketLink(2L, "Bug", BuildConfig.FLAVOR, 1, companion.getNULL())));
        jt1Var.K(-1344773304);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new e();
            jt1Var.C(objF);
        }
        jt1Var.B();
        TicketLinksCardKt.TicketLinksCard(homeTicketLinksData, (oh4) objF, jt1Var, 48);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
