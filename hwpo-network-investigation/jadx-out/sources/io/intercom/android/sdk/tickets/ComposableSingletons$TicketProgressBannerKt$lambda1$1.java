package io.intercom.android.sdk.tickets;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$TicketProgressBannerKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketProgressBannerKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$TicketProgressBannerKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketProgressBannerKt$lambda1$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        jt1Var.K(57238520);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new c();
            jt1Var.C(objF);
        }
        jt1Var.B();
        TicketProgressBannerKt.TicketProgressBanner("API issue", (mh4) objF, true, null, jt1Var, 438, 8);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
