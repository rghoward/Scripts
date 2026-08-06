package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import defpackage.az3;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c33;
import defpackage.ci4;
import defpackage.dc4;
import defpackage.di;
import defpackage.dq1;
import defpackage.dv0;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.i67;
import defpackage.i77;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.m78;
import defpackage.ml5;
import defpackage.o67;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.p87;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.t72;
import defpackage.v5a;
import defpackage.wd3;
import defpackage.xj8;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootNavHostKt {
    public static final void IntercomRootNavHost(final Intent intent, final dq1 dq1Var, jt1 jt1Var, final int i) {
        int i2;
        intent.getClass();
        dq1Var.getClass();
        bj4 bj4VarO = jt1Var.o(884340874);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(intent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(dq1Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
            if (argsForIntent instanceof IntercomRootActivityArgs.NoContent) {
                dq1Var.finish();
                LumberMill.getLogger().e("No content to display. Closing the activity.", new Object[0]);
                xj8 xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ji5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomRootNavHostKt.IntercomRootNavHost$lambda$0(intent, dq1Var, i, (jt1) obj, iIntValue);
                        }
                    };
                    return;
                }
                return;
            }
            o67 o67VarD = dc4.d(new p87[0], bj4VarO);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                c33 c33Var = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(1903672037, new AnonymousClass2(o67VarD, argsForIntent, dq1Var, (t72) objF), bj4VarO), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW2 = bj4VarO.W();
        if (xj8VarW2 != null) {
            xj8VarW2.d = new ci4() { // from class: ki5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomRootNavHostKt.IntercomRootNavHost$lambda$1(intent, dq1Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomRootNavHost$lambda$0(Intent intent, dq1 dq1Var, int i, jt1 jt1Var, int i2) {
        IntercomRootNavHost(intent, dq1Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomRootNavHost$lambda$1(Intent intent, dq1 dq1Var, int i, jt1 jt1Var, int i2) {
        IntercomRootNavHost(intent, dq1Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt$IntercomRootNavHost$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass2 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
        final /* synthetic */ o67 $navController;
        final /* synthetic */ dq1 $rootActivity;
        final /* synthetic */ t72 $scope;

        public AnonymousClass2(o67 o67Var, IntercomRootActivityArgs intercomRootActivityArgs, dq1 dq1Var, t72 t72Var) {
            this.$navController = o67Var;
            this.$intercomRootActivityArgs = intercomRootActivityArgs;
            this.$rootActivity = dq1Var;
            this.$scope = t72Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$2$lambda$1$lambda$0(o67 o67Var, dq1 dq1Var, t72 t72Var, IntercomRootActivityArgs intercomRootActivityArgs, i67 i67Var) {
            i67Var.getClass();
            HomeScreenDestinationKt.homeScreen(i67Var, o67Var, dq1Var, t72Var);
            MessagesDestinationKt.messagesDestination(i67Var, o67Var, dq1Var);
            HelpCenterDestinationKt.helpCenterDestination(i67Var, dq1Var, o67Var, intercomRootActivityArgs);
            TicketDetailDestinationKt.ticketDetailDestination(i67Var, o67Var, dq1Var);
            ConversationDestinationKt.conversationDestination(i67Var, o67Var, dq1Var);
            TicketsDestinationKt.ticketsDestination(i67Var, o67Var, dq1Var);
            CreateTicketDestinationKt.createTicketDestination(i67Var, o67Var, dq1Var);
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            az3 az3Var = ir9.c;
            final o67 o67Var = this.$navController;
            final IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            final dq1 dq1Var = this.$rootActivity;
            final t72 t72Var = this.$scope;
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6 ox6VarC = it1.c(jt1Var, az3Var);
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
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            String route = intercomRootActivityArgs.getRoute();
            jt1Var.K(-1676284170);
            boolean zJ = jt1Var.j(o67Var) | jt1Var.j(dq1Var) | jt1Var.j(t72Var) | jt1Var.J(intercomRootActivityArgs);
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.b0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return IntercomRootNavHostKt.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(o67Var, dq1Var, t72Var, intercomRootActivityArgs, (i67) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            i77.b(o67Var, route, null, null, null, null, null, null, (oh4) objF, jt1Var, 0, 1020);
            jt1Var.I();
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
