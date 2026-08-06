package io.intercom.android.sdk.tickets.list.ui;

import defpackage.ae8;
import defpackage.bt1;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketsScreenKt {
    public static final ComposableSingletons$TicketsScreenKt INSTANCE = new ComposableSingletons$TicketsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ei4<fv5, jt1, Integer, g2b> f376lambda1 = new fr1(false, -1474046781, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsScreenKt$lambda-1$1
        public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
            fv5Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            ox6 ox6VarC = ir9.c(eo7.k(ox6.a.t, 0.0f, 16.0f, 1), 1.0f);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, fl6VarD);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC2);
            ae8.a(null, IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, jt1Var, 0, 61);
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
            invoke(fv5Var, jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ei4<fv5, jt1, Integer, g2b> m547getLambda1$intercom_sdk_base_release() {
        return f376lambda1;
    }
}
