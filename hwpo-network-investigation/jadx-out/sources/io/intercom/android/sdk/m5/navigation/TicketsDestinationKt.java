package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import android.view.View;
import com.intercom.twig.BuildConfig;
import defpackage.a06;
import defpackage.al8;
import defpackage.az3;
import defpackage.b33;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.bt7;
import defpackage.c33;
import defpackage.ci4;
import defpackage.d06;
import defpackage.di;
import defpackage.dq1;
import defpackage.dv0;
import defpackage.e12;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.f12;
import defpackage.fi4;
import defpackage.fl6;
import defpackage.fnb;
import defpackage.fr1;
import defpackage.g27;
import defpackage.g2b;
import defpackage.g76;
import defpackage.gi0;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h47;
import defpackage.hnb;
import defpackage.i67;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j67;
import defpackage.jo3;
import defpackage.jt1;
import defpackage.kc6;
import defpackage.kk;
import defpackage.kw7;
import defpackage.m76;
import defpackage.m77;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.nu;
import defpackage.o67;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.p47;
import defpackage.q39;
import defpackage.q47;
import defpackage.qr5;
import defpackage.r47;
import defpackage.rd7;
import defpackage.ru;
import defpackage.s66;
import defpackage.sh;
import defpackage.th3;
import defpackage.ub6;
import defpackage.w86;
import defpackage.wd3;
import defpackage.whb;
import defpackage.ws0;
import defpackage.x86;
import defpackage.xc6;
import defpackage.xj8;
import defpackage.yn5;
import defpackage.yz9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.tickets.list.reducers.TicketsListReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsErrorScreenKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsDestinationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketsOpenGateScaffold(final int i, final mh4<g2b> mh4Var, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(2089400481);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.h(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.j(ci4Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            ox6 ox6VarC = gi0.c(ox6.a.t, kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable), al8.a);
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            bj4Var = bj4VarO;
            q39.a(hnb.c(ox6VarC, fnb.a.c(bj4VarO).b), gr1.b(-1414555, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt.TicketsOpenGateScaffold.1
                public final void invoke(jt1 jt1Var2, int i4) {
                    if ((i4 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String strF = nr1.f(jt1Var2, R.string.intercom_tickets_space_title);
                    mh4<g2b> mh4Var2 = mh4Var;
                    Integer numValueOf = Integer.valueOf(i);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i5 = IntercomTheme.$stable;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, strF, null, null, null, mh4Var2, numValueOf, false, intercomTheme.getColors(jt1Var2, i5).m767getHeader0d7_KjU(), intercomTheme.getColors(jt1Var2, i5).m771getOnHeader0d7_KjU(), 0L, null, null, jt1Var2, 0, 0, 7325);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, null, null, 0, 0L, 0L, null, gr1.b(-1897413392, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt.TicketsOpenGateScaffold.2
                public final void invoke(go7 go7Var, jt1 jt1Var2, int i4) {
                    go7Var.getClass();
                    if ((i4 & 6) == 0) {
                        i4 |= jt1Var2.J(go7Var) ? 4 : 2;
                    }
                    if ((i4 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6 ox6VarH = eo7.h(ir9.c, go7Var);
                    ci4<jt1, Integer, g2b> ci4Var2 = ci4Var;
                    fl6 fl6VarD = dv0.d(di.a.a, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarH);
                    bt1.c.getClass();
                    qr5.a aVar = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                    sh.a(ci4Var2, jt1Var2, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var2, Integer num) {
                    invoke(go7Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, 805306416, 508);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: kma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketsDestinationKt.TicketsOpenGateScaffold$lambda$6(i, mh4Var, ci4Var, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketsOpenGateScaffold$lambda$6(int i, mh4 mh4Var, ci4 ci4Var, int i2, jt1 jt1Var, int i3) {
        TicketsOpenGateScaffold(i, mh4Var, ci4Var, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    public static final void ticketsDestination(i67 i67Var, o67 o67Var, dq1 dq1Var) {
        i67Var.getClass();
        o67Var.getClass();
        dq1Var.getClass();
        q47 q47Var = new q47();
        ticketsDestination$lambda$0(q47Var);
        p47.a aVar = q47Var.a;
        m77<Object> m77VarB = aVar.a;
        if (m77VarB == null) {
            m77.b bVar = m77.Companion;
            Object obj = aVar.c;
            bVar.getClass();
            m77VarB = m77.b.b(obj);
        }
        h47 h47Var = new h47("transitionArgs", new p47(m77VarB, aVar.b, aVar.c, aVar.d));
        q47 q47Var2 = new q47();
        ticketsDestination$lambda$1(q47Var2);
        p47.a aVar2 = q47Var2.a;
        m77<Object> m77VarB2 = aVar2.a;
        if (m77VarB2 == null) {
            m77.b bVar2 = m77.Companion;
            Object obj2 = aVar2.c;
            bVar2.getClass();
            m77VarB2 = m77.b.b(obj2);
        }
        List listI = ws0.i(h47Var, new h47("isLaunchedProgrammatically", new p47(m77VarB2, aVar2.b, aVar2.c, aVar2.d)));
        int i = 2;
        j67.a(i67Var, "TICKETS?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", listI, new w86(i), new x86(i), new e12(i), new f12(i), new fr1(true, 655582181, new AnonymousClass7(dq1Var, o67Var)), 132);
    }

    private static final g2b ticketsDestination$lambda$0(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(TransitionStyleKt.getTransitionArgNavType());
        q47Var.a(new TransitionArgs(null, null, null, null, 15, null));
        return g2b.a;
    }

    private static final g2b ticketsDestination$lambda$1(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        q47Var.a(Boolean.FALSE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 ticketsDestination$lambda$2(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 ticketsDestination$lambda$3(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 ticketsDestination$lambda$4(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 ticketsDestination$lambda$5(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass7 implements fi4<nu, r47, jt1, Integer, g2b> {
        final /* synthetic */ o67 $navController;
        final /* synthetic */ dq1 $rootActivity;

        public AnonymousClass7(dq1 dq1Var, o67 o67Var) {
            this.$rootActivity = dq1Var;
            this.$navController = o67Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$10$lambda$9(boolean z, o67 o67Var, String str) {
            str.getClass();
            IntercomRouterKt.openTicketDetailScreen$default(o67Var, str, MetricTracker.Context.FROM_TICKETS_SPACE, z ? new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_DOWN, EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT) : new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$2$lambda$1(o67 o67Var, dq1 dq1Var) {
            if (o67Var.b() == null) {
                dq1Var.finish();
            } else {
                o67Var.d();
            }
            return g2b.a;
        }

        private static final NetworkResponse<OpenMessengerResponse> invoke$lambda$3(yz9<? extends NetworkResponse<OpenMessengerResponse>> yz9Var) {
            return yz9Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b33 invoke$lambda$8$lambda$7(final m76 m76Var, final a06 a06Var, c33 c33Var) {
            c33Var.getClass();
            final g76 g76Var = new g76() { // from class: io.intercom.android.sdk.m5.navigation.h0
                @Override // defpackage.g76
                public final void t(m76 m76Var2, s66.a aVar) {
                    TicketsDestinationKt.AnonymousClass7.invoke$lambda$8$lambda$7$lambda$5(a06Var, m76Var2, aVar);
                }
            };
            m76Var.getLifecycle().a(g76Var);
            return new b33() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$ticketsDestination$7$invoke$lambda$8$lambda$7$$inlined$onDispose$1
                @Override // defpackage.b33
                public void dispose() {
                    m76Var.getLifecycle().c(g76Var);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$8$lambda$7$lambda$5(a06 a06Var, m76 m76Var, s66.a aVar) {
            m76Var.getClass();
            aVar.getClass();
            if (aVar == s66.a.ON_RESUME && (a06Var.b().a instanceof ub6.c)) {
                a06Var.c();
            }
        }

        public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
            int i2;
            nuVar.getClass();
            r47Var.getClass();
            TicketsScreenViewModel.Companion companion = TicketsScreenViewModel.Companion;
            whb whbVarA = xc6.a(jt1Var);
            if (whbVarA == null) {
                whbVarA = this.$rootActivity;
            }
            final TicketsScreenViewModel ticketsScreenViewModelCreate = companion.create(whbVarA);
            Bundle bundleA = r47Var.A.a();
            final boolean z = bundleA != null ? bundleA.getBoolean("isLaunchedProgrammatically") : false;
            jt1Var.K(834704654);
            o67 o67Var = this.$navController;
            Object objF = jt1Var.f();
            Object obj = jt1.a.a;
            if (objF == obj) {
                if (o67Var.b() == null) {
                    i2 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_close;
                } else {
                    i2 = z ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down : io.intercom.android.sdk.ui.R.drawable.intercom_ic_back;
                }
                objF = new bt7(i2);
                jt1Var.C(objF);
            }
            g27 g27Var = (g27) objF;
            jt1Var.B();
            jt1Var.K(834717133);
            boolean zJ = jt1Var.j(this.$navController) | jt1Var.j(this.$rootActivity);
            final o67 o67Var2 = this.$navController;
            final dq1 dq1Var = this.$rootActivity;
            Object objF2 = jt1Var.f();
            if (zJ || objF2 == obj) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.i0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TicketsDestinationKt.AnonymousClass7.invoke$lambda$2$lambda$1(o67Var2, dq1Var);
                    }
                };
                jt1Var.C(objF2);
            }
            mh4 mh4Var = (mh4) objF2;
            jt1Var.B();
            final NetworkResponse<OpenMessengerResponse> networkResponseInvoke$lambda$3 = invoke$lambda$3(bl7.c(ticketsScreenViewModelCreate.getOpenState(), jt1Var, 0));
            if (networkResponseInvoke$lambda$3 == null) {
                jt1Var.K(106690880);
                TicketsDestinationKt.TicketsOpenGateScaffold(g27Var.k(), mh4Var, ComposableSingletons$TicketsDestinationKt.INSTANCE.m374getLambda1$intercom_sdk_base_release(), jt1Var, 384);
                jt1Var.B();
                return;
            }
            if ((networkResponseInvoke$lambda$3 instanceof NetworkResponse.NetworkError) || (networkResponseInvoke$lambda$3 instanceof NetworkResponse.ClientError) || (networkResponseInvoke$lambda$3 instanceof NetworkResponse.ServerError)) {
                jt1Var.K(107092392);
                TicketsDestinationKt.TicketsOpenGateScaffold(g27Var.k(), mh4Var, gr1.b(-341459361, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt.ticketsDestination.7.1
                    public final void invoke(jt1 jt1Var2, int i3) {
                        ErrorState withoutCTA;
                        if ((i3 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        az3 az3Var = ir9.c;
                        jt1Var2.K(1298868949);
                        if (NetworkResponseKt.isRetryable(networkResponseInvoke$lambda$3)) {
                            TicketsScreenViewModel ticketsScreenViewModel = ticketsScreenViewModelCreate;
                            jt1Var2.K(1298871875);
                            boolean zJ2 = jt1Var2.j(ticketsScreenViewModel);
                            Object objF3 = jt1Var2.f();
                            if (zJ2 || objF3 == jt1.a.a) {
                                objF3 = new TicketsDestinationKt$ticketsDestination$7$1$1$1(ticketsScreenViewModel);
                                jt1Var2.C(objF3);
                            }
                            jt1Var2.B();
                            withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, (mh4) ((yn5) objF3), 15, null);
                        } else {
                            withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
                        }
                        jt1Var2.B();
                        TicketsErrorScreenKt.TicketsErrorScreen(withoutCTA, az3Var, jt1Var2, 48, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var), jt1Var, 384);
                jt1Var.B();
                return;
            }
            if (!(networkResponseInvoke$lambda$3 instanceof NetworkResponse.Success)) {
                jt1Var.K(834727398);
                jt1Var.B();
                defpackage.u.b();
                return;
            }
            jt1Var.K(107790822);
            final a06 a06VarA = d06.a(ticketsScreenViewModelCreate.getPagerFlow(), jt1Var);
            TicketsScreenUiState ticketsScreenUiStateReduceToTicketsScreenUiState = TicketsListReducerKt.reduceToTicketsScreenUiState(a06VarA, null, jt1Var, 8, 1);
            jt1Var.K(834764929);
            boolean zJ2 = jt1Var.j(ticketsScreenViewModelCreate) | jt1Var.j(a06VarA);
            Object objF3 = jt1Var.f();
            if (zJ2 || objF3 == obj) {
                objF3 = new TicketsDestinationKt$ticketsDestination$7$2$1(ticketsScreenViewModelCreate, a06VarA, null);
                jt1Var.C(objF3);
            }
            jt1Var.B();
            wd3.d(jt1Var, (ci4) objF3, null);
            final m76 m76Var = (m76) jt1Var.F(kc6.a);
            jt1Var.K(834776819);
            boolean zJ3 = jt1Var.j(a06VarA) | jt1Var.j(m76Var);
            Object objF4 = jt1Var.f();
            if (zJ3 || objF4 == obj) {
                objF4 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.j0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        return TicketsDestinationKt.AnonymousClass7.invoke$lambda$8$lambda$7(m76Var, a06VarA, (c33) obj2);
                    }
                };
                jt1Var.C(objF4);
            }
            jt1Var.B();
            wd3.a(m76Var, (oh4) objF4, jt1Var);
            jt1Var.K(834804323);
            boolean zC = jt1Var.c(z) | jt1Var.j(this.$navController);
            final o67 o67Var3 = this.$navController;
            Object objF5 = jt1Var.f();
            if (zC || objF5 == obj) {
                objF5 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.k0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        return TicketsDestinationKt.AnonymousClass7.invoke$lambda$10$lambda$9(z, o67Var3, (String) obj2);
                    }
                };
                jt1Var.C(objF5);
            }
            jt1Var.B();
            TicketsScreenKt.TicketsScreen(ticketsScreenUiStateReduceToTicketsScreenUiState, mh4Var, (oh4) objF5, g27Var.k(), jt1Var, 0, 0);
            jt1Var.K(834845930);
            Object objF6 = jt1Var.f();
            if (objF6 == obj) {
                objF6 = new TicketsDestinationKt$ticketsDestination$7$5$1(null);
                jt1Var.C(objF6);
            }
            jt1Var.B();
            wd3.d(jt1Var, (ci4) objF6, BuildConfig.FLAVOR);
            jt1Var.B();
        }

        @Override // defpackage.fi4
        public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
            invoke(nuVar, r47Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
