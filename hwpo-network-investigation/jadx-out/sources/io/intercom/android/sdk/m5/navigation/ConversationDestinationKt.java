package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.a68;
import defpackage.az3;
import defpackage.b33;
import defpackage.c33;
import defpackage.cl8;
import defpackage.dq1;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.g76;
import defpackage.h47;
import defpackage.i67;
import defpackage.ir9;
import defpackage.j67;
import defpackage.jo3;
import defpackage.jt1;
import defpackage.k77;
import defpackage.kc6;
import defpackage.l12;
import defpackage.l77;
import defpackage.m12;
import defpackage.m76;
import defpackage.m77;
import defpackage.mh4;
import defpackage.n12;
import defpackage.nu;
import defpackage.o12;
import defpackage.o67;
import defpackage.oh4;
import defpackage.p47;
import defpackage.q47;
import defpackage.r47;
import defpackage.ru;
import defpackage.s66;
import defpackage.th3;
import defpackage.u47;
import defpackage.wd3;
import defpackage.whb;
import defpackage.ws0;
import defpackage.xc6;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationDestinationKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[s66.a.values().length];
            try {
                iArr[s66.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s66.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void conversationDestination(i67 i67Var, o67 o67Var, dq1 dq1Var) {
        i67Var.getClass();
        o67Var.getClass();
        dq1Var.getClass();
        q47 q47Var = new q47();
        conversationDestination$lambda$0(q47Var);
        p47.a aVar = q47Var.a;
        m77<Object> m77VarB = aVar.a;
        if (m77VarB == null) {
            m77.b bVar = m77.Companion;
            Object obj = aVar.c;
            bVar.getClass();
            m77VarB = m77.b.b(obj);
        }
        h47 h47Var = new h47("conversationId", new p47(m77VarB, aVar.b, aVar.c, aVar.d));
        q47 q47Var2 = new q47();
        conversationDestination$lambda$1(q47Var2);
        p47.a aVar2 = q47Var2.a;
        m77<Object> m77VarB2 = aVar2.a;
        if (m77VarB2 == null) {
            m77.b bVar2 = m77.Companion;
            Object obj2 = aVar2.c;
            bVar2.getClass();
            m77VarB2 = m77.b.b(obj2);
        }
        h47 h47Var2 = new h47("initialMessage", new p47(m77VarB2, aVar2.b, aVar2.c, aVar2.d));
        q47 q47Var3 = new q47();
        conversationDestination$lambda$2(q47Var3);
        p47.a aVar3 = q47Var3.a;
        m77<Object> m77VarB3 = aVar3.a;
        if (m77VarB3 == null) {
            m77.b bVar3 = m77.Companion;
            Object obj3 = aVar3.c;
            bVar3.getClass();
            m77VarB3 = m77.b.b(obj3);
        }
        h47 h47Var3 = new h47("articleId", new p47(m77VarB3, aVar3.b, aVar3.c, aVar3.d));
        q47 q47Var4 = new q47();
        conversationDestination$lambda$3(q47Var4);
        p47.a aVar4 = q47Var4.a;
        m77<Object> m77VarB4 = aVar4.a;
        if (m77VarB4 == null) {
            m77.b bVar4 = m77.Companion;
            Object obj4 = aVar4.c;
            bVar4.getClass();
            m77VarB4 = m77.b.b(obj4);
        }
        h47 h47Var4 = new h47("articleTitle", new p47(m77VarB4, aVar4.b, aVar4.c, aVar4.d));
        q47 q47Var5 = new q47();
        conversationDestination$lambda$4(q47Var5);
        p47.a aVar5 = q47Var5.a;
        m77<Object> m77VarB5 = aVar5.a;
        if (m77VarB5 == null) {
            m77.b bVar5 = m77.Companion;
            Object obj5 = aVar5.c;
            bVar5.getClass();
            m77VarB5 = m77.b.b(obj5);
        }
        h47 h47Var5 = new h47("isLaunchedProgrammatically", new p47(m77VarB5, aVar5.b, aVar5.c, aVar5.d));
        q47 q47Var6 = new q47();
        conversationDestination$lambda$5(q47Var6);
        p47.a aVar6 = q47Var6.a;
        m77<Object> m77VarB6 = aVar6.a;
        if (m77VarB6 == null) {
            m77.b bVar6 = m77.Companion;
            Object obj6 = aVar6.c;
            bVar6.getClass();
            m77VarB6 = m77.b.b(obj6);
        }
        List listI = ws0.i(h47Var, h47Var2, h47Var3, h47Var4, h47Var5, new h47("transitionArgs", new p47(m77VarB6, aVar6.b, aVar6.c, aVar6.d)));
        int i = 0;
        j67.a(i67Var, "CONVERSATION?conversationId={conversationId}&initialMessage={initialMessage}&articleId={articleId}&articleTitle={articleTitle}&isLaunchedProgrammatically={isLaunchedProgrammatically}&transitionArgs={transitionArgs}", listI, new l12(i), new m12(i), new n12(i), new o12(i), new fr1(true, -1198092933, new AnonymousClass11(dq1Var, o67Var)), 132);
    }

    private static final g2b conversationDestination$lambda$0(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        q47Var.a.b = true;
        return g2b.a;
    }

    private static final g2b conversationDestination$lambda$1(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        q47Var.a.b = true;
        return g2b.a;
    }

    private static final g2b conversationDestination$lambda$2(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        q47Var.a.b = true;
        return g2b.a;
    }

    private static final g2b conversationDestination$lambda$3(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        q47Var.a.b = true;
        return g2b.a;
    }

    private static final g2b conversationDestination$lambda$4(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.BoolType);
        q47Var.a.b = false;
        q47Var.a(Boolean.FALSE);
        return g2b.a;
    }

    private static final g2b conversationDestination$lambda$5(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(TransitionStyleKt.getTransitionArgNavType());
        q47Var.a.b = false;
        q47Var.a(new TransitionArgs(null, null, null, null, 15, null));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 conversationDestination$lambda$6(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 conversationDestination$lambda$7(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final th3 conversationDestination$lambda$8(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.f(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jo3 conversationDestination$lambda$9(ru ruVar) {
        ruVar.getClass();
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((r47) ruVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationViewModel getConversationViewModel(whb whbVar, String str, String str2, boolean z, ArticleMetadata articleMetadata, jt1 jt1Var, int i, int i2) {
        jt1Var.K(-1203114984);
        if ((i2 & 4) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            articleMetadata = null;
        }
        ArticleMetadata articleMetadata2 = articleMetadata;
        final m76 m76Var = (m76) jt1Var.F(kc6.a);
        final Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
        final ConversationViewModel conversationViewModelCreate = ConversationViewModel.Companion.create(whbVar, str, str3, articleMetadata2, z ? LaunchMode.PROGRAMMATIC : LaunchMode.CLASSIC);
        jt1Var.K(1938580361);
        boolean zJ = jt1Var.j(conversationViewModelCreate) | jt1Var.j(context) | jt1Var.j(m76Var);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new oh4() { // from class: j12
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return ConversationDestinationKt.getConversationViewModel$lambda$13$lambda$12(m76Var, conversationViewModelCreate, context, (c33) obj);
                }
            };
            jt1Var.C(objF);
        }
        jt1Var.B();
        wd3.a(m76Var, (oh4) objF, jt1Var);
        jt1Var.B();
        return conversationViewModelCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b33 getConversationViewModel$lambda$13$lambda$12(final m76 m76Var, final ConversationViewModel conversationViewModel, final Context context, c33 c33Var) {
        c33Var.getClass();
        final g76 g76Var = new g76() { // from class: k12
            @Override // defpackage.g76
            public final void t(m76 m76Var2, s66.a aVar) {
                ConversationDestinationKt.getConversationViewModel$lambda$13$lambda$12$lambda$10(conversationViewModel, context, m76Var2, aVar);
            }
        };
        m76Var.getLifecycle().a(g76Var);
        return new b33() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$getConversationViewModel$lambda$13$lambda$12$$inlined$onDispose$1
            @Override // defpackage.b33
            public void dispose() {
                m76Var.getLifecycle().c(g76Var);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getConversationViewModel$lambda$13$lambda$12$lambda$10(ConversationViewModel conversationViewModel, Context context, m76 m76Var, s66.a aVar) {
        m76Var.getClass();
        aVar.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1) {
            conversationViewModel.onResume(context);
        } else {
            if (i != 2) {
                return;
            }
            conversationViewModel.onPause(context);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass11 implements fi4<nu, r47, jt1, Integer, g2b> {
        final /* synthetic */ o67 $navController;
        final /* synthetic */ dq1 $rootActivity;

        public AnonymousClass11(dq1 dq1Var, o67 o67Var) {
            this.$rootActivity = dq1Var;
            this.$navController = o67Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$12(o67 o67Var, cl8 cl8Var, String str) {
            k77 k77VarA;
            str.getClass();
            boolean z = cl8Var.t;
            if (z) {
                l77 l77Var = new l77();
                invoke$lambda$12$lambda$11(l77Var);
                boolean z2 = l77Var.b;
                k77.a aVar = l77Var.a;
                aVar.a = z2;
                aVar.b = l77Var.c;
                String str2 = l77Var.e;
                if (str2 != null) {
                    boolean z3 = l77Var.f;
                    boolean z4 = l77Var.g;
                    aVar.d = str2;
                    aVar.c = -1;
                    aVar.e = z3;
                    aVar.f = z4;
                } else {
                    aVar.b(l77Var.d, l77Var.f, l77Var.g);
                }
                k77VarA = aVar.a();
            } else {
                k77VarA = null;
            }
            IntercomRouterKt.openConversation$default(o67Var, str, null, z, null, k77VarA, null, 42, null);
            return g2b.a;
        }

        private static final g2b invoke$lambda$12$lambda$11(l77 l77Var) {
            l77Var.getClass();
            l77Var.b("CONVERSATION");
            l77Var.a(-1);
            a68 a68Var = new a68();
            invoke$lambda$12$lambda$11$lambda$10(a68Var);
            l77Var.f = a68Var.a;
            l77Var.g = a68Var.b;
            return g2b.a;
        }

        private static final g2b invoke$lambda$12$lambda$11$lambda$10(a68 a68Var) {
            a68Var.getClass();
            a68Var.a = true;
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$2$lambda$1(o67 o67Var, dq1 dq1Var) {
            if (o67Var.b() == null) {
                dq1Var.getOnBackPressedDispatcher().c().a();
            } else {
                o67Var.d();
            }
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3(o67 o67Var) {
            Injector.get().getMetricTracker().viewedNewConversation(MetricTracker.Context.FROM_CONVERSATION);
            IntercomRouterKt.openNewConversation$default(o67Var, false, null, null, 7, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$5(o67 o67Var, cl8 cl8Var) {
            IntercomRouterKt.openTicketDetailScreen$default(o67Var, false, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), cl8Var.t, 1, null);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$6(o67 o67Var, cl8 cl8Var, String str) {
            str.getClass();
            IntercomRouterKt.openTicketDetailScreen(o67Var, str, MetricTracker.Context.HOME_SCREEN, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), cl8Var.t);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$8$lambda$7(o67 o67Var, ConversationViewModel conversationViewModel, TicketType ticketType) {
            ticketType.getClass();
            IntercomRouterKt.openCreateTicketsScreen(o67Var, ticketType, conversationViewModel.getConversationId(), MetricTracker.Context.FROM_CONVERSATION);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$9(o67 o67Var, cl8 cl8Var, HeaderMenuItem headerMenuItem) {
            headerMenuItem.getClass();
            if (headerMenuItem instanceof HeaderMenuItem.Messages) {
                IntercomRouterKt.openMessages(o67Var, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), cl8Var.t);
            } else if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
                IntercomRouterKt.openNewConversation$default(o67Var, cl8Var.t, null, null, 6, null);
            } else if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
                IntercomRouterKt.openTicketList(o67Var, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_OUT_LEFT, EnterTransitionStyle.SLIDE_IN_RIGHT, ExitTransitionStyle.SLIDE_DOWN), true);
            } else {
                if (!(headerMenuItem instanceof HeaderMenuItem.Help)) {
                    defpackage.u.b();
                    return null;
                }
                IntercomRouterKt.openHelpCenter(o67Var, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), true);
            }
            return g2b.a;
        }

        public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
            String str;
            String articleId;
            String articleTitle;
            String str2;
            nuVar.getClass();
            r47Var.getClass();
            u47 u47Var = r47Var.A;
            final cl8 cl8Var = new cl8();
            Intent intent = this.$rootActivity.getIntent();
            intent.getClass();
            IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
            IntercomRootActivityArgs.ConversationScreenArgs conversationScreenArgs = argsForIntent instanceof IntercomRootActivityArgs.ConversationScreenArgs ? (IntercomRootActivityArgs.ConversationScreenArgs) argsForIntent : null;
            Bundle bundleA = u47Var.a();
            if (bundleA != null && bundleA.containsKey("conversationId")) {
                Bundle bundleA2 = u47Var.a();
                String string = bundleA2 != null ? bundleA2.getString("conversationId") : null;
                Bundle bundleA3 = u47Var.a();
                String string2 = bundleA3 != null ? bundleA3.getString("initialMessage") : null;
                Bundle bundleA4 = u47Var.a();
                articleId = bundleA4 != null ? bundleA4.getString("articleId") : null;
                Bundle bundleA5 = u47Var.a();
                articleTitle = bundleA5 != null ? bundleA5.getString("articleTitle") : null;
                Bundle bundleA6 = u47Var.a();
                cl8Var.t = bundleA6 != null ? bundleA6.getBoolean("isLaunchedProgrammatically") : false;
                str2 = string2;
                str = string;
            } else if (conversationScreenArgs != null) {
                String conversationId = conversationScreenArgs.getConversationId();
                String encodedInitialMessage = conversationScreenArgs.getEncodedInitialMessage();
                cl8Var.t = conversationScreenArgs.isLaunchedProgrammatically();
                articleId = conversationScreenArgs.getArticleId();
                articleTitle = conversationScreenArgs.getArticleTitle();
                str = conversationId;
                str2 = encodedInitialMessage;
            } else {
                str = null;
                articleId = null;
                articleTitle = null;
                str2 = BuildConfig.FLAVOR;
            }
            whb whbVarA = xc6.a(jt1Var);
            if (whbVarA == null) {
                whbVarA = this.$rootActivity;
            }
            final ConversationViewModel conversationViewModel = ConversationDestinationKt.getConversationViewModel(whbVarA, str, str2 == null ? BuildConfig.FLAVOR : str2, cl8Var.t, articleId != null ? new ArticleMetadata(articleId, articleTitle) : null, jt1Var, 0, 0);
            az3 az3Var = ir9.c;
            jt1Var.K(931012280);
            boolean zJ = jt1Var.j(this.$navController) | jt1Var.j(this.$rootActivity);
            final o67 o67Var = this.$navController;
            final dq1 dq1Var = this.$rootActivity;
            Object objF = jt1Var.f();
            Object obj = jt1.a.a;
            if (zJ || objF == obj) {
                objF = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.a
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationDestinationKt.AnonymousClass11.invoke$lambda$2$lambda$1(o67Var, dq1Var);
                    }
                };
                jt1Var.C(objF);
            }
            mh4 mh4Var = (mh4) objF;
            jt1Var.B();
            jt1Var.K(931021432);
            boolean zJ2 = jt1Var.j(this.$navController);
            final o67 o67Var2 = this.$navController;
            Object objF2 = jt1Var.f();
            if (zJ2 || objF2 == obj) {
                objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.b
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ConversationDestinationKt.AnonymousClass11.invoke$lambda$4$lambda$3(o67Var2);
                    }
                };
                jt1Var.C(objF2);
            }
            mh4 mh4Var2 = (mh4) objF2;
            jt1Var.B();
            final o67 o67Var3 = this.$navController;
            mh4 mh4Var3 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.c
                @Override // defpackage.mh4
                public final Object invoke() {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$5(o67Var3, cl8Var);
                }
            };
            oh4 oh4Var = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.d
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$6(o67Var3, cl8Var, (String) obj2);
                }
            };
            jt1Var.K(931122893);
            boolean zJ3 = jt1Var.j(this.$navController) | jt1Var.j(conversationViewModel);
            final o67 o67Var4 = this.$navController;
            Object objF3 = jt1Var.f();
            if (zJ3 || objF3 == obj) {
                objF3 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.e
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        return ConversationDestinationKt.AnonymousClass11.invoke$lambda$8$lambda$7(o67Var4, conversationViewModel, (TicketType) obj2);
                    }
                };
                jt1Var.C(objF3);
            }
            jt1Var.B();
            final o67 o67Var5 = this.$navController;
            ConversationScreenKt.ConversationScreen(conversationViewModel, az3Var, mh4Var, mh4Var2, mh4Var3, oh4Var, (oh4) objF3, new oh4() { // from class: io.intercom.android.sdk.m5.navigation.f
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$9(o67Var5, cl8Var, (HeaderMenuItem) obj2);
                }
            }, new oh4() { // from class: io.intercom.android.sdk.m5.navigation.g
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    return ConversationDestinationKt.AnonymousClass11.invoke$lambda$12(o67Var5, cl8Var, (String) obj2);
                }
            }, jt1Var, 48, 0);
        }

        @Override // defpackage.fi4
        public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
            invoke(nuVar, r47Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
