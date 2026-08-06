package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import defpackage.a68;
import defpackage.bt7;
import defpackage.ci4;
import defpackage.dq1;
import defpackage.e12;
import defpackage.f12;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.g27;
import defpackage.g2b;
import defpackage.g57;
import defpackage.h47;
import defpackage.i67;
import defpackage.j67;
import defpackage.jo3;
import defpackage.jt1;
import defpackage.k77;
import defpackage.l77;
import defpackage.m77;
import defpackage.mh4;
import defpackage.mu6;
import defpackage.nu;
import defpackage.o67;
import defpackage.oh4;
import defpackage.p47;
import defpackage.q47;
import defpackage.r47;
import defpackage.ru;
import defpackage.th3;
import defpackage.wd3;
import defpackage.whb;
import defpackage.ws0;
import defpackage.x86;
import defpackage.xc6;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MessagesDestinationKt {
    public static final void messagesDestination(i67 i67Var, o67 o67Var, dq1 dq1Var) {
        i67Var.getClass();
        o67Var.getClass();
        dq1Var.getClass();
        q47 q47Var = new q47();
        messagesDestination$lambda$0(q47Var);
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
        messagesDestination$lambda$1(q47Var2);
        p47.a aVar2 = q47Var2.a;
        m77<Object> m77VarB2 = aVar2.a;
        if (m77VarB2 == null) {
            m77.b bVar2 = m77.Companion;
            Object obj2 = aVar2.c;
            bVar2.getClass();
            m77VarB2 = m77.b.b(obj2);
        }
        List listI = ws0.i(h47Var, new h47("isLaunchedProgrammatically", new p47(m77VarB2, aVar2.b, aVar2.c, aVar2.d)));
        int i = 1;
        j67.a(i67Var, "MESSAGES?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", listI, new x86(i), new e12(i), new f12(i), new mu6(), new fr1(true, 559331213, new AnonymousClass7(dq1Var, o67Var)), 132);
    }

    private static final g2b messagesDestination$lambda$0(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(TransitionStyleKt.getTransitionArgNavType());
        q47Var.a(new TransitionArgs(null, null, null, null, 15, null));
        return g2b.a;
    }

    private static final g2b messagesDestination$lambda$1(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        q47Var.a(Boolean.FALSE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 messagesDestination$lambda$2(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 messagesDestination$lambda$3(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 messagesDestination$lambda$4(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 messagesDestination$lambda$5(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass7 implements fi4<nu, r47, jt1, Integer, g2b> {
        final /* synthetic */ o67 $navController;
        final /* synthetic */ dq1 $rootActivity;

        public AnonymousClass7(dq1 dq1Var, o67 o67Var) {
            this.$rootActivity = dq1Var;
            this.$navController = o67Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$12$lambda$11(boolean z, o67 o67Var, InboxUiEffects.NavigateToConversation navigateToConversation) {
            TransitionArgs transitionArgs;
            navigateToConversation.getClass();
            Injector.get().getMetricTracker().viewedConversation("messages", navigateToConversation.getConversation().getId());
            if (z) {
                transitionArgs = new TransitionArgs(null, null, null, null, 15, null);
            } else {
                transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
            }
            TransitionArgs transitionArgs2 = transitionArgs;
            String id = navigateToConversation.getConversation().getId();
            l77 l77Var = new l77();
            invoke$lambda$12$lambda$11$lambda$10(l77Var);
            boolean z2 = l77Var.b;
            k77.a aVar = l77Var.a;
            aVar.a = z2;
            aVar.b = l77Var.c;
            String str = l77Var.e;
            if (str != null) {
                boolean z3 = l77Var.f;
                boolean z4 = l77Var.g;
                aVar.d = str;
                aVar.c = -1;
                aVar.e = z3;
                aVar.f = z4;
            } else {
                aVar.b(l77Var.d, l77Var.f, l77Var.g);
            }
            IntercomRouterKt.openConversation$default(o67Var, id, null, z, null, aVar.a(), transitionArgs2, 10, null);
            return g2b.a;
        }

        private static final g2b invoke$lambda$12$lambda$11$lambda$10(l77 l77Var) {
            l77Var.getClass();
            l77Var.b("CONVERSATION");
            l77Var.a(-1);
            a68 a68Var = new a68();
            invoke$lambda$12$lambda$11$lambda$10$lambda$9(a68Var);
            l77Var.f = a68Var.a;
            l77Var.g = a68Var.b;
            return g2b.a;
        }

        private static final g2b invoke$lambda$12$lambda$11$lambda$10$lambda$9(a68 a68Var) {
            a68Var.getClass();
            a68Var.a = true;
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3(o67 o67Var, boolean z) {
            Injector.get().getMetricTracker().viewedNewConversation("messages");
            l77 l77Var = new l77();
            invoke$lambda$4$lambda$3$lambda$2(l77Var);
            boolean z2 = l77Var.b;
            k77.a aVar = l77Var.a;
            aVar.a = z2;
            aVar.b = l77Var.c;
            String str = l77Var.e;
            if (str != null) {
                boolean z3 = l77Var.f;
                boolean z4 = l77Var.g;
                aVar.d = str;
                aVar.c = -1;
                aVar.e = z3;
                aVar.f = z4;
            } else {
                aVar.b(l77Var.d, l77Var.f, l77Var.g);
            }
            IntercomRouterKt.openNewConversation$default(o67Var, z, aVar.a(), null, 4, null);
            return g2b.a;
        }

        private static final g2b invoke$lambda$4$lambda$3$lambda$2(l77 l77Var) {
            l77Var.getClass();
            l77Var.b("CONVERSATION");
            l77Var.a(-1);
            a68 a68Var = new a68();
            invoke$lambda$4$lambda$3$lambda$2$lambda$1(a68Var);
            l77Var.f = a68Var.a;
            l77Var.g = a68Var.b;
            return g2b.a;
        }

        private static final g2b invoke$lambda$4$lambda$3$lambda$2$lambda$1(a68 a68Var) {
            a68Var.getClass();
            a68Var.a = true;
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$6$lambda$5(o67 o67Var) {
            g57.c(o67Var, "HELP_CENTER", null, 6);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$8$lambda$7(o67 o67Var, dq1 dq1Var) {
            if (o67Var.b() == null) {
                dq1Var.finish();
            } else {
                o67Var.d();
            }
            return g2b.a;
        }

        public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
            int i2;
            nuVar.getClass();
            r47Var.getClass();
            InboxViewModel.Companion companion = InboxViewModel.Companion;
            whb whbVarA = xc6.a(jt1Var);
            if (whbVarA == null) {
                whbVarA = this.$rootActivity;
            }
            InboxViewModel inboxViewModelCreate = companion.create(whbVarA);
            Bundle bundleA = r47Var.A.a();
            final boolean z = bundleA != null ? bundleA.getBoolean("isLaunchedProgrammatically") : false;
            jt1Var.K(596908281);
            o67 o67Var = this.$navController;
            Object objF = jt1Var.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                if (o67Var.b() == null) {
                    i2 = R.drawable.intercom_ic_close;
                } else {
                    i2 = z ? R.drawable.intercom_ic_chevron_down : R.drawable.intercom_ic_back;
                }
                objF = new bt7(i2);
                jt1Var.C(objF);
            }
            g27 g27Var = (g27) objF;
            jt1Var.B();
            jt1Var.K(596922783);
            boolean zJ = jt1Var.j(this.$navController) | jt1Var.c(z);
            final o67 o67Var2 = this.$navController;
            Object objF2 = jt1Var.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.c0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MessagesDestinationKt.AnonymousClass7.invoke$lambda$4$lambda$3(o67Var2, z);
                    }
                };
                jt1Var.C(objF2);
            }
            mh4 mh4Var = (mh4) objF2;
            jt1Var.B();
            jt1Var.K(596940405);
            boolean zJ2 = jt1Var.j(this.$navController);
            final o67 o67Var3 = this.$navController;
            Object objF3 = jt1Var.f();
            if (zJ2 || objF3 == c0187a) {
                objF3 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.d0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MessagesDestinationKt.AnonymousClass7.invoke$lambda$6$lambda$5(o67Var3);
                    }
                };
                jt1Var.C(objF3);
            }
            mh4 mh4Var2 = (mh4) objF3;
            jt1Var.B();
            jt1Var.K(596944480);
            boolean zJ3 = jt1Var.j(this.$navController) | jt1Var.j(this.$rootActivity);
            final o67 o67Var4 = this.$navController;
            final dq1 dq1Var = this.$rootActivity;
            Object objF4 = jt1Var.f();
            if (zJ3 || objF4 == c0187a) {
                objF4 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.e0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MessagesDestinationKt.AnonymousClass7.invoke$lambda$8$lambda$7(o67Var4, dq1Var);
                    }
                };
                jt1Var.C(objF4);
            }
            mh4 mh4Var3 = (mh4) objF4;
            jt1Var.B();
            jt1Var.K(596951066);
            boolean zC = jt1Var.c(z) | jt1Var.j(this.$navController);
            final o67 o67Var5 = this.$navController;
            Object objF5 = jt1Var.f();
            if (zC || objF5 == c0187a) {
                objF5 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.f0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MessagesDestinationKt.AnonymousClass7.invoke$lambda$12$lambda$11(z, o67Var5, (InboxUiEffects.NavigateToConversation) obj);
                    }
                };
                jt1Var.C(objF5);
            }
            jt1Var.B();
            InboxScreenKt.InboxScreen(inboxViewModelCreate, mh4Var, mh4Var2, mh4Var3, (oh4) objF5, g27Var.k(), jt1Var, 0);
            jt1Var.K(596991718);
            Object objF6 = jt1Var.f();
            if (objF6 == c0187a) {
                objF6 = new MessagesDestinationKt$messagesDestination$7$5$1(null);
                jt1Var.C(objF6);
            }
            jt1Var.B();
            wd3.d(jt1Var, (ci4) objF6, BuildConfig.FLAVOR);
        }

        @Override // defpackage.fi4
        public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
            invoke(nuVar, r47Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
