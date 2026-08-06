package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import defpackage.al8;
import defpackage.bl7;
import defpackage.bx6;
import defpackage.c33;
import defpackage.ci4;
import defpackage.dq1;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.h37;
import defpackage.h47;
import defpackage.hn9;
import defpackage.i67;
import defpackage.j67;
import defpackage.jo3;
import defpackage.jt1;
import defpackage.m77;
import defpackage.mh4;
import defpackage.nm8;
import defpackage.nu;
import defpackage.o67;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p47;
import defpackage.q47;
import defpackage.r47;
import defpackage.ru;
import defpackage.t72;
import defpackage.th3;
import defpackage.u47;
import defpackage.uh1;
import defpackage.wd3;
import defpackage.whb;
import defpackage.ws0;
import defpackage.xc6;
import defpackage.yn5;
import defpackage.yz9;
import defpackage.zg5;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketLaunchedFrom;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketDestinationKt {
    public static final String CONVERSATION_ID = "conversation_id";
    public static final String TICKET_TYPE_ID = "ticket_type_id";

    public static final void createTicketDestination(i67 i67Var, o67 o67Var, dq1 dq1Var) {
        i67Var.getClass();
        o67Var.getClass();
        dq1Var.getClass();
        oh4<ru<r47>, th3> slideUpEnterTransition = IntercomTransitionsKt.getSlideUpEnterTransition();
        oh4<ru<r47>, jo3> slideDownExitTransition = IntercomTransitionsKt.getSlideDownExitTransition();
        q47 q47Var = new q47();
        createTicketDestination$lambda$0(q47Var);
        p47.a aVar = q47Var.a;
        m77<Object> m77VarB = aVar.a;
        if (m77VarB == null) {
            m77.b bVar = m77.Companion;
            Object obj = aVar.c;
            bVar.getClass();
            m77VarB = m77.b.b(obj);
        }
        h47 h47Var = new h47(TICKET_TYPE_ID, new p47(m77VarB, aVar.b, aVar.c, aVar.d));
        q47 q47Var2 = new q47();
        createTicketDestination$lambda$1(q47Var2);
        p47.a aVar2 = q47Var2.a;
        m77<Object> m77VarB2 = aVar2.a;
        if (m77VarB2 == null) {
            m77.b bVar2 = m77.Companion;
            Object obj2 = aVar2.c;
            bVar2.getClass();
            m77VarB2 = m77.b.b(obj2);
        }
        h47 h47Var2 = new h47(CONVERSATION_ID, new p47(m77VarB2, aVar2.b, aVar2.c, aVar2.d));
        q47 q47Var3 = new q47();
        createTicketDestination$lambda$2(q47Var3);
        p47.a aVar3 = q47Var3.a;
        m77<Object> m77VarB3 = aVar3.a;
        if (m77VarB3 == null) {
            m77.b bVar3 = m77.Companion;
            Object obj3 = aVar3.c;
            bVar3.getClass();
            m77VarB3 = m77.b.b(obj3);
        }
        j67.a(i67Var, "CREATE_TICKET/{ticket_type_id}?conversation_id={conversation_id}?from={from}", ws0.i(h47Var, h47Var2, new h47(TicketDetailDestinationKt.LAUNCHED_FROM, new p47(m77VarB3, aVar3.b, aVar3.c, aVar3.d))), slideUpEnterTransition, slideDownExitTransition, null, null, new fr1(true, -521503931, new AnonymousClass4(dq1Var, o67Var)), 228);
    }

    private static final g2b createTicketDestination$lambda$0(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.LongType);
        return g2b.a;
    }

    private static final g2b createTicketDestination$lambda$1(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        q47Var.a.b = true;
        return g2b.a;
    }

    private static final g2b createTicketDestination$lambda$2(q47 q47Var) {
        q47Var.getClass();
        q47Var.b(m77.StringType);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createTicketDestination$navigateUp(o67 o67Var, dq1 dq1Var) {
        if (o67Var.d()) {
            return;
        }
        dq1Var.finish();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass4 implements fi4<nu, r47, jt1, Integer, g2b> {
        final /* synthetic */ o67 $navController;
        final /* synthetic */ dq1 $rootActivity;

        public AnonymousClass4(dq1 dq1Var, o67 o67Var) {
            this.$rootActivity = dq1Var;
            this.$navController = o67Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$dismissSheet(t72 t72Var, h37<AnswerClickData> h37Var) {
            oy0.d(t72Var, null, null, new CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1(h37Var, null), 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$11$lambda$10(CreateTicketViewModel createTicketViewModel, String str) {
            str.getClass();
            createTicketViewModel.onAnswerUpdated(str);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$13$lambda$12(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData) {
            answerClickData.getClass();
            createTicketViewModel.onAnswerClicked(answerClickData);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3$lambda$2(t72 t72Var, h37 h37Var) {
            invoke$dismissSheet(t72Var, h37Var);
            return g2b.a;
        }

        private static final CreateTicketViewModel.CreateTicketFormUiState invoke$lambda$5(yz9<? extends CreateTicketViewModel.CreateTicketFormUiState> yz9Var) {
            return yz9Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$8$lambda$7(CreateTicketViewModel createTicketViewModel, t72 t72Var) {
            createTicketViewModel.createTicket(t72Var);
            return g2b.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$showSheet(t72 t72Var, h37<AnswerClickData> h37Var, AnswerClickData answerClickData) {
            oy0.d(t72Var, null, null, new CreateTicketDestinationKt$createTicketDestination$4$showSheet$1(h37Var, answerClickData, null), 3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(nu nuVar, r47 r47Var, jt1 jt1Var, int i) {
            String string;
            Object createTicketDestinationKt$createTicketDestination$4$1$1;
            CreateTicketViewModel createTicketViewModel;
            Object obj;
            t72 t72Var;
            nuVar.getClass();
            r47Var.getClass();
            u47 u47Var = r47Var.A;
            Bundle bundleA = u47Var.a();
            Long lValueOf = bundleA != null ? Long.valueOf(bundleA.getLong(CreateTicketDestinationKt.TICKET_TYPE_ID)) : null;
            Bundle bundleA2 = u47Var.a();
            String string2 = bundleA2 != null ? bundleA2.getString(CreateTicketDestinationKt.CONVERSATION_ID) : null;
            Bundle bundleA3 = u47Var.a();
            if (bundleA3 == null || (string = bundleA3.getString(TicketDetailDestinationKt.LAUNCHED_FROM)) == null) {
                string = "conversation";
            }
            if (lValueOf == null) {
                return;
            }
            CreateTicketViewModel.Companion companion = CreateTicketViewModel.Companion;
            whb whbVarA = xc6.a(jt1Var);
            if (whbVarA == null) {
                whbVarA = this.$rootActivity;
            }
            CreateTicketViewModel createTicketViewModelCreate = companion.create(whbVarA, lValueOf.longValue(), string2, string.equals("conversation") ? CreateTicketLaunchedFrom.Conversation : CreateTicketLaunchedFrom.Home);
            jt1Var.K(-693655536);
            Object objF = jt1Var.f();
            Object obj2 = jt1.a.a;
            if (objF == obj2) {
                objF = bl7.i(null);
                jt1Var.C(objF);
            }
            final h37 h37Var = (h37) objF;
            jt1Var.B();
            hn9 hn9VarF = bx6.f(6, jt1Var, 2);
            Object objF2 = jt1Var.f();
            if (objF2 == obj2) {
                c33 c33Var = wd3.a;
                Object nm8Var = new nm8(jt1Var.x());
                jt1Var.C(nm8Var);
                objF2 = nm8Var;
            }
            final t72 t72Var2 = (t72) objF2;
            jt1Var.K(-693637337);
            boolean zJ = jt1Var.j(createTicketViewModelCreate) | jt1Var.j(this.$navController) | jt1Var.j(t72Var2);
            o67 o67Var = this.$navController;
            Object objF3 = jt1Var.f();
            if (zJ || objF3 == obj2) {
                createTicketDestinationKt$createTicketDestination$4$1$1 = new CreateTicketDestinationKt$createTicketDestination$4$1$1(createTicketViewModelCreate, o67Var, t72Var2, h37Var, null);
                jt1Var.C(createTicketDestinationKt$createTicketDestination$4$1$1);
            } else {
                createTicketDestinationKt$createTicketDestination$4$1$1 = objF3;
            }
            jt1Var.B();
            wd3.d(jt1Var, (ci4) createTicketDestinationKt$createTicketDestination$4$1$1, BuildConfig.FLAVOR);
            AnswerClickData answerClickData = (AnswerClickData) h37Var.getValue();
            jt1Var.K(-693618128);
            if (answerClickData == null) {
                createTicketViewModel = createTicketViewModelCreate;
                obj = obj2;
                t72Var = t72Var2;
            } else {
                jt1Var.K(-693614134);
                long jA = answerClickData.getClickedItem().getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success ? uh1.b : zg5.a(IntercomTheme.INSTANCE, jt1Var, IntercomTheme.$stable);
                jt1Var.B();
                jt1Var.K(806366386);
                boolean zJ2 = jt1Var.j(t72Var2);
                Object objF4 = jt1Var.f();
                if (zJ2 || objF4 == obj2) {
                    objF4 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.h
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$4$lambda$3$lambda$2(t72Var2, h37Var);
                        }
                    };
                    jt1Var.C(objF4);
                }
                jt1Var.B();
                createTicketViewModel = createTicketViewModelCreate;
                obj = obj2;
                t72Var = t72Var2;
                bx6.a((mh4) objF4, null, hn9VarF, 0.0f, false, al8.a, jA, 0L, 0L, null, null, null, gr1.b(-693932488, new CreateTicketDestinationKt$createTicketDestination$4$2$2(answerClickData, createTicketViewModelCreate, t72Var2, h37Var), jt1Var), jt1Var, 196608, 3078, 7066);
                g2b g2bVar = g2b.a;
            }
            jt1Var.B();
            CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiStateInvoke$lambda$5 = invoke$lambda$5(bl7.d(createTicketViewModel.getUiState(), CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE, null, jt1Var, 48, 2));
            jt1Var.K(-693563255);
            boolean zJ3 = jt1Var.j(this.$navController) | jt1Var.j(this.$rootActivity);
            o67 o67Var2 = this.$navController;
            dq1 dq1Var = this.$rootActivity;
            Object objF5 = jt1Var.f();
            Object obj3 = obj;
            if (zJ3 || objF5 == obj3) {
                objF5 = new CreateTicketDestinationKt$createTicketDestination$4$3$1(o67Var2, dq1Var);
                jt1Var.C(objF5);
            }
            jt1Var.B();
            mh4 mh4Var = (mh4) ((yn5) objF5);
            jt1Var.K(-693561806);
            final CreateTicketViewModel createTicketViewModel2 = createTicketViewModel;
            final t72 t72Var3 = t72Var;
            boolean zJ4 = jt1Var.j(createTicketViewModel2) | jt1Var.j(t72Var3);
            Object objF6 = jt1Var.f();
            if (zJ4 || objF6 == obj3) {
                objF6 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.i
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$8$lambda$7(createTicketViewModel2, t72Var3);
                    }
                };
                jt1Var.C(objF6);
            }
            mh4 mh4Var2 = (mh4) objF6;
            jt1Var.B();
            jt1Var.K(-693558359);
            boolean zJ5 = jt1Var.j(this.$navController) | jt1Var.j(this.$rootActivity);
            o67 o67Var3 = this.$navController;
            dq1 dq1Var2 = this.$rootActivity;
            Object objF7 = jt1Var.f();
            if (zJ5 || objF7 == obj3) {
                objF7 = new CreateTicketDestinationKt$createTicketDestination$4$5$1(o67Var3, dq1Var2);
                jt1Var.C(objF7);
            }
            jt1Var.B();
            mh4 mh4Var3 = (mh4) ((yn5) objF7);
            jt1Var.K(-693556930);
            boolean zJ6 = jt1Var.j(createTicketViewModel2);
            Object objF8 = jt1Var.f();
            if (zJ6 || objF8 == obj3) {
                objF8 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.j
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj4) {
                        return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$11$lambda$10(createTicketViewModel2, (String) obj4);
                    }
                };
                jt1Var.C(objF8);
            }
            oh4 oh4Var = (oh4) objF8;
            jt1Var.B();
            jt1Var.K(-693554868);
            boolean zJ7 = jt1Var.j(createTicketViewModel2);
            Object objF9 = jt1Var.f();
            if (zJ7 || objF9 == obj3) {
                objF9 = new oh4() { // from class: io.intercom.android.sdk.m5.navigation.k
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj4) {
                        return CreateTicketDestinationKt.AnonymousClass4.invoke$lambda$13$lambda$12(createTicketViewModel2, (AnswerClickData) obj4);
                    }
                };
                jt1Var.C(objF9);
            }
            jt1Var.B();
            CreateTicketContentScreenKt.CreateTicketScreen(createTicketFormUiStateInvoke$lambda$5, mh4Var, mh4Var2, mh4Var3, oh4Var, (oh4) objF9, jt1Var, 0);
        }

        @Override // defpackage.fi4
        public /* bridge */ /* synthetic */ g2b invoke(nu nuVar, r47 r47Var, jt1 jt1Var, Integer num) {
            invoke(nuVar, r47Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
