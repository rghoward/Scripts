package io.intercom.android.sdk.m5.navigation;

import com.intercom.twig.BuildConfig;
import defpackage.a68;
import defpackage.ci4;
import defpackage.dq1;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.i67;
import defpackage.j67;
import defpackage.jt1;
import defpackage.k77;
import defpackage.kc6;
import defpackage.l77;
import defpackage.m76;
import defpackage.mh4;
import defpackage.nu;
import defpackage.o67;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.q57;
import defpackage.r47;
import defpackage.ru;
import defpackage.t72;
import defpackage.th3;
import defpackage.wd3;
import defpackage.whb;
import defpackage.xc6;
import defpackage.zc;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeScreenDestinationKt {
    public static final void homeScreen(i67 i67Var, o67 o67Var, dq1 dq1Var, t72 t72Var) {
        i67Var.getClass();
        o67Var.getClass();
        dq1Var.getClass();
        t72Var.getClass();
        j67.a(i67Var, "HOME", null, null, null, new zc(2), null, new fr1(true, 1180315695, new AnonymousClass2(dq1Var, o67Var, t72Var)), 222);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final th3 homeScreen$lambda$0(ru ruVar) {
        ruVar.getClass();
        return EnterTransitionStyle.PEEK_BEHIND.transition();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass2 implements fi4<nu, r47, jt1, Integer, g2b> {
        final /* synthetic */ o67 $navController;
        final /* synthetic */ dq1 $rootActivity;
        final /* synthetic */ t72 $scope;

        public AnonymousClass2(dq1 dq1Var, o67 o67Var, t72 t72Var) {
            this.$rootActivity = dq1Var;
            this.$navController = o67Var;
            this.$scope = t72Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(o67 o67Var) {
            Injector.get().getMetricTracker().clickedSpace("messages");
            IntercomRouterKt.openMessages$default(o67Var, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$11$lambda$10(o67 o67Var) {
            q57 q57Var = o67Var.b;
            q57Var.getClass();
            l77 l77Var = new l77();
            invoke$lambda$11$lambda$10$lambda$9(l77Var);
            boolean z = l77Var.b;
            k77.a aVar = l77Var.a;
            aVar.a = z;
            aVar.b = l77Var.c;
            String str = l77Var.e;
            if (str != null) {
                boolean z2 = l77Var.f;
                boolean z3 = l77Var.g;
                aVar.d = str;
                aVar.c = -1;
                aVar.e = z2;
                aVar.f = z3;
            } else {
                aVar.b(l77Var.d, l77Var.f, l77Var.g);
            }
            q57Var.m("MESSAGES", aVar.a());
            return g2b.a;
        }

        private static final g2b invoke$lambda$11$lambda$10$lambda$9(l77 l77Var) {
            l77Var.getClass();
            l77Var.b("HOME");
            l77Var.a(-1);
            a68 a68Var = new a68();
            invoke$lambda$11$lambda$10$lambda$9$lambda$8(a68Var);
            l77Var.f = a68Var.a;
            l77Var.g = a68Var.b;
            return g2b.a;
        }

        private static final g2b invoke$lambda$11$lambda$10$lambda$9$lambda$8(a68 a68Var) {
            a68Var.getClass();
            a68Var.a = true;
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$15$lambda$14(o67 o67Var) {
            l77 l77Var = new l77();
            invoke$lambda$15$lambda$14$lambda$13(l77Var);
            boolean z = l77Var.b;
            k77.a aVar = l77Var.a;
            aVar.a = z;
            aVar.b = l77Var.c;
            String str = l77Var.e;
            if (str != null) {
                boolean z2 = l77Var.f;
                boolean z3 = l77Var.g;
                aVar.d = str;
                aVar.c = -1;
                aVar.e = z2;
                aVar.f = z3;
            } else {
                aVar.b(l77Var.d, l77Var.f, l77Var.g);
            }
            IntercomRouterKt.openNewConversation(o67Var, false, aVar.a(), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
            return g2b.a;
        }

        private static final g2b invoke$lambda$15$lambda$14$lambda$13(l77 l77Var) {
            l77Var.getClass();
            l77Var.b("HOME");
            l77Var.a(-1);
            a68 a68Var = new a68();
            invoke$lambda$15$lambda$14$lambda$13$lambda$12(a68Var);
            l77Var.f = a68Var.a;
            l77Var.g = a68Var.b;
            return g2b.a;
        }

        private static final g2b invoke$lambda$15$lambda$14$lambda$13$lambda$12(a68 a68Var) {
            a68Var.getClass();
            a68Var.a = false;
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$19$lambda$18(o67 o67Var, String str) {
            str.getClass();
            l77 l77Var = new l77();
            invoke$lambda$19$lambda$18$lambda$17(l77Var);
            boolean z = l77Var.b;
            k77.a aVar = l77Var.a;
            aVar.a = z;
            aVar.b = l77Var.c;
            String str2 = l77Var.e;
            if (str2 != null) {
                boolean z2 = l77Var.f;
                boolean z3 = l77Var.g;
                aVar.d = str2;
                aVar.c = -1;
                aVar.e = z2;
                aVar.f = z3;
            } else {
                aVar.b(l77Var.d, l77Var.f, l77Var.g);
            }
            invoke$openConversation(o67Var, str, aVar.a(), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
            return g2b.a;
        }

        private static final g2b invoke$lambda$19$lambda$18$lambda$17(l77 l77Var) {
            l77Var.getClass();
            l77Var.b("HOME");
            l77Var.a(-1);
            a68 a68Var = new a68();
            invoke$lambda$19$lambda$18$lambda$17$lambda$16(a68Var);
            l77Var.f = a68Var.a;
            l77Var.g = a68Var.b;
            return g2b.a;
        }

        private static final g2b invoke$lambda$19$lambda$18$lambda$17$lambda$16(a68 a68Var) {
            a68Var.getClass();
            a68Var.a = false;
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$21$lambda$20(o67 o67Var) {
            Injector.get().getMetricTracker().viewedNewConversation("home");
            IntercomRouterKt.openNewConversation$default(o67Var, false, null, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null), 3, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$23$lambda$22(o67 o67Var, Conversation conversation) {
            conversation.getClass();
            invoke$openConversation$default(o67Var, conversation.getId(), null, null, 12, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$25$lambda$24(t72 t72Var, dq1 dq1Var) {
            oy0.d(t72Var, null, null, new HomeScreenDestinationKt$homeScreen$2$10$1$1(dq1Var, null), 3);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$27$lambda$26(o67 o67Var, TicketType ticketType) {
            ticketType.getClass();
            IntercomRouterKt.openCreateTicketsScreen(o67Var, ticketType, null, MetricTracker.Context.HOME_SCREEN);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$3$lambda$2(o67 o67Var) {
            Injector.get().getMetricTracker().clickedSpace("help");
            IntercomRouterKt.openHelpCenter$default(o67Var, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$5$lambda$4(o67 o67Var) {
            IntercomRouterKt.openTicketList$default(o67Var, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$7$lambda$6(o67 o67Var, String str) {
            str.getClass();
            IntercomRouterKt.openTicketDetailScreen$default(o67Var, str, "home", new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, null);
            return g2b.a;
        }

        private static final void invoke$openConversation(o67 o67Var, String str, k77 k77Var, TransitionArgs transitionArgs) {
            Injector.get().getMetricTracker().viewedConversation("home", str);
            IntercomRouterKt.openConversation$default(o67Var, str, null, false, null, k77Var, transitionArgs, 14, null);
        }

        public static /* synthetic */ void invoke$openConversation$default(o67 o67Var, String str, k77 k77Var, TransitionArgs transitionArgs, int i, Object obj) {
            if ((i & 4) != 0) {
                k77Var = null;
            }
            if ((i & 8) != 0) {
                transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
            }
            invoke$openConversation(o67Var, str, k77Var, transitionArgs);
        }

        public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
            nuVar.getClass();
            r47Var.getClass();
            m76 m76Var = (m76) jt1Var.F(kc6.a);
            whb whbVarA = xc6.a(jt1Var);
            if (whbVarA == null) {
                whbVarA = this.$rootActivity;
            }
            HomeViewModel homeViewModelCreate = HomeViewModel.Companion.create(whbVarA, m76Var.getLifecycle());
            jt1Var.K(940847052);
            boolean zJ = jt1Var.j(this.$navController);
            final o67 o67Var = this.$navController;
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.q
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$1$lambda$0(o67Var);
                    }
                };
                jt1Var.C(objF);
            }
            mh4 mh4Var = (mh4) objF;
            jt1Var.B();
            jt1Var.K(940864202);
            boolean zJ2 = jt1Var.j(this.$navController);
            final o67 o67Var2 = this.$navController;
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.t
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$3$lambda$2(o67Var2);
                    }
                };
                jt1Var.C(objF2);
            }
            mh4 mh4Var2 = (mh4) objF2;
            jt1Var.B();
            jt1Var.K(940881295);
            boolean zJ3 = jt1Var.j(this.$navController);
            final o67 o67Var3 = this.$navController;
            Object objF3 = jt1Var.f();
            if (zJ3 || objF3 == c0187a) {
                objF3 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.u
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$5$lambda$4(o67Var3);
                    }
                };
                jt1Var.C(objF3);
            }
            mh4 mh4Var3 = (mh4) objF3;
            jt1Var.B();
            jt1Var.K(940895775);
            boolean zJ4 = jt1Var.j(this.$navController);
            final o67 o67Var4 = this.$navController;
            Object objF4 = jt1Var.f();
            if (zJ4 || objF4 == c0187a) {
                objF4 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.v
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$7$lambda$6(o67Var4, (String) obj);
                    }
                };
                jt1Var.C(objF4);
            }
            oh4 oh4Var = (oh4) objF4;
            jt1Var.B();
            jt1Var.K(940913359);
            boolean zJ5 = jt1Var.j(this.$navController);
            final o67 o67Var5 = this.$navController;
            Object objF5 = jt1Var.f();
            if (zJ5 || objF5 == c0187a) {
                objF5 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.w
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$11$lambda$10(o67Var5);
                    }
                };
                jt1Var.C(objF5);
            }
            mh4 mh4Var4 = (mh4) objF5;
            jt1Var.B();
            jt1Var.K(940921059);
            boolean zJ6 = jt1Var.j(this.$navController);
            final o67 o67Var6 = this.$navController;
            Object objF6 = jt1Var.f();
            if (zJ6 || objF6 == c0187a) {
                objF6 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.x
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$15$lambda$14(o67Var6);
                    }
                };
                jt1Var.C(objF6);
            }
            mh4 mh4Var5 = (mh4) objF6;
            jt1Var.B();
            jt1Var.K(940960995);
            boolean zJ7 = jt1Var.j(this.$navController);
            final o67 o67Var7 = this.$navController;
            Object objF7 = jt1Var.f();
            if (zJ7 || objF7 == c0187a) {
                objF7 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.y
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$19$lambda$18(o67Var7, (String) obj);
                    }
                };
                jt1Var.C(objF7);
            }
            oh4 oh4Var2 = (oh4) objF7;
            jt1Var.B();
            jt1Var.K(940942534);
            boolean zJ8 = jt1Var.j(this.$navController);
            final o67 o67Var8 = this.$navController;
            Object objF8 = jt1Var.f();
            if (zJ8 || objF8 == c0187a) {
                objF8 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.z
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$21$lambda$20(o67Var8);
                    }
                };
                jt1Var.C(objF8);
            }
            mh4 mh4Var6 = (mh4) objF8;
            jt1Var.B();
            jt1Var.K(940957321);
            boolean zJ9 = jt1Var.j(this.$navController);
            final o67 o67Var9 = this.$navController;
            Object objF9 = jt1Var.f();
            if (zJ9 || objF9 == c0187a) {
                objF9 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.a0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$23$lambda$22(o67Var9, (Conversation) obj);
                    }
                };
                jt1Var.C(objF9);
            }
            oh4 oh4Var3 = (oh4) objF9;
            jt1Var.B();
            jt1Var.K(940937500);
            boolean zJ10 = jt1Var.j(this.$scope) | jt1Var.j(this.$rootActivity);
            final t72 t72Var = this.$scope;
            final dq1 dq1Var = this.$rootActivity;
            Object objF10 = jt1Var.f();
            if (zJ10 || objF10 == c0187a) {
                objF10 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.r
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$25$lambda$24(t72Var, dq1Var);
                    }
                };
                jt1Var.C(objF10);
            }
            mh4 mh4Var7 = (mh4) objF10;
            jt1Var.B();
            jt1Var.K(940976796);
            boolean zJ11 = jt1Var.j(this.$navController);
            final o67 o67Var10 = this.$navController;
            Object objF11 = jt1Var.f();
            if (zJ11 || objF11 == c0187a) {
                objF11 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.s
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HomeScreenDestinationKt.AnonymousClass2.invoke$lambda$27$lambda$26(o67Var10, (TicketType) obj);
                    }
                };
                jt1Var.C(objF11);
            }
            jt1Var.B();
            HomeScreenKt.HomeScreen(homeViewModelCreate, mh4Var, mh4Var2, mh4Var3, oh4Var, mh4Var4, mh4Var5, oh4Var2, mh4Var6, oh4Var3, mh4Var7, (oh4) objF11, jt1Var, 0, 0);
            jt1Var.K(940986683);
            Object objF12 = jt1Var.f();
            if (objF12 == c0187a) {
                objF12 = new HomeScreenDestinationKt$homeScreen$2$12$1(null);
                jt1Var.C(objF12);
            }
            jt1Var.B();
            wd3.d(jt1Var, (ci4) objF12, BuildConfig.FLAVOR);
        }

        @Override // defpackage.fi4
        public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
            invoke(nuVar, r47Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
