package io.intercom.android.sdk.tickets.list.ui;

import defpackage.aj1;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.v5a;
import defpackage.ws0;
import defpackage.yi1;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketRowKt {
    public static final ComposableSingletons$TicketRowKt INSTANCE = new ComposableSingletons$TicketRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f368lambda1 = new fr1(false, 1406853974, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketRowKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            jt1Var.K(-1850249501);
            Iterator it = ws0.i(new TicketRowData("123", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "#123 • Waiting on you", TicketStatus.WaitingOnCustomer, true), new TicketRowData("321", "Bug", "#123456789012345678901234567890 • Submitted", TicketStatus.Submitted, true), new TicketRowData("456", "Address change", "In progress", TicketStatus.InProgress, false), new TicketRowData("654", "Can’t download from dashboard request ", "Resolved", TicketStatus.Resolved, true)).iterator();
            while (it.hasNext()) {
                jt1 jt1Var2 = jt1Var;
                TicketRowKt.TicketRow(null, (TicketRowData) it.next(), null, false, jt1Var2, 0, 13);
                IntercomDividerKt.IntercomDivider(eo7.k(aVar, 20.0f, 0.0f, 2), jt1Var2, 6, 0);
                jt1Var = jt1Var2;
            }
            jt1 jt1Var3 = jt1Var;
            jt1Var3.B();
            jt1Var3.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f369lambda2 = new fr1(false, 488165755, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketRowKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketRowKt.INSTANCE.m539getLambda1$intercom_sdk_base_release(), jt1Var, 12582912, 127);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m539getLambda1$intercom_sdk_base_release() {
        return f368lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m540getLambda2$intercom_sdk_base_release() {
        return f369lambda2;
    }
}
