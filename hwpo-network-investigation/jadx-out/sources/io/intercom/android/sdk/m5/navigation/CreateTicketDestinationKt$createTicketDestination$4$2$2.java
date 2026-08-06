package io.intercom.android.sdk.m5.navigation;

import defpackage.bj1;
import defpackage.bt1;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.h37;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.t72;
import defpackage.w20;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketDestinationKt$createTicketDestination$4$2$2 implements ei4<bj1, jt1, Integer, g2b> {
    final /* synthetic */ h37<AnswerClickData> $answerClickedData;
    final /* synthetic */ AnswerClickData $data;
    final /* synthetic */ t72 $scope;
    final /* synthetic */ CreateTicketViewModel $viewModel;

    public CreateTicketDestinationKt$createTicketDestination$4$2$2(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel, t72 t72Var, h37<AnswerClickData> h37Var) {
        this.$data = answerClickData;
        this.$viewModel = createTicketViewModel;
        this.$scope = t72Var;
        this.$answerClickedData = h37Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$8$lambda$1$lambda$0(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, t72 t72Var, h37 h37Var) {
        createTicketViewModel.onRetryFileClicked(answerClickData);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(t72Var, h37Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$8$lambda$3$lambda$2(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, t72 t72Var, h37 h37Var) {
        createTicketViewModel.onDeleteFileClicked(answerClickData);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(t72Var, h37Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$8$lambda$5$lambda$4(CreateTicketViewModel createTicketViewModel, AnswerClickData answerClickData, t72 t72Var, h37 h37Var) {
        createTicketViewModel.onDeleteFileClicked(answerClickData);
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(t72Var, h37Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$8$lambda$7$lambda$6(t72 t72Var, h37 h37Var) {
        CreateTicketDestinationKt.AnonymousClass4.invoke$dismissSheet(t72Var, h37Var);
        return g2b.a;
    }

    public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
        bj1Var.getClass();
        if ((i & 17) == 16 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6 ox6VarC = w20.c(ox6.a.t, w20.f);
        final AnswerClickData answerClickData = this.$data;
        final CreateTicketViewModel createTicketViewModel = this.$viewModel;
        final t72 t72Var = this.$scope;
        final h37<AnswerClickData> h37Var = this.$answerClickedData;
        fl6 fl6VarD = dv0.d(di.a.a, false);
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
        Answer.MediaAnswer.MediaItem clickedItem = answerClickData.getClickedItem();
        jt1Var.K(-1711815186);
        boolean zJ = jt1Var.j(createTicketViewModel) | jt1Var.j(answerClickData) | jt1Var.j(t72Var);
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (zJ || objF == obj) {
            objF = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.l
                @Override // defpackage.mh4
                public final Object invoke() {
                    return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$8$lambda$1$lambda$0(createTicketViewModel, answerClickData, t72Var, h37Var);
                }
            };
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        jt1Var.B();
        jt1Var.K(-1711807057);
        boolean zJ2 = jt1Var.j(createTicketViewModel) | jt1Var.j(answerClickData) | jt1Var.j(t72Var);
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == obj) {
            objF2 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.m
                @Override // defpackage.mh4
                public final Object invoke() {
                    return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$8$lambda$3$lambda$2(createTicketViewModel, answerClickData, t72Var, h37Var);
                }
            };
            jt1Var.C(objF2);
        }
        mh4 mh4Var2 = (mh4) objF2;
        jt1Var.B();
        jt1Var.K(-1711798833);
        boolean zJ3 = jt1Var.j(createTicketViewModel) | jt1Var.j(answerClickData) | jt1Var.j(t72Var);
        Object objF3 = jt1Var.f();
        if (zJ3 || objF3 == obj) {
            objF3 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.n
                @Override // defpackage.mh4
                public final Object invoke() {
                    return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$8$lambda$5$lambda$4(createTicketViewModel, answerClickData, t72Var, h37Var);
                }
            };
            jt1Var.C(objF3);
        }
        mh4 mh4Var3 = (mh4) objF3;
        jt1Var.B();
        jt1Var.K(-1711791060);
        boolean zJ4 = jt1Var.j(t72Var);
        Object objF4 = jt1Var.f();
        if (zJ4 || objF4 == obj) {
            objF4 = new mh4() { // from class: io.intercom.android.sdk.m5.navigation.o
                @Override // defpackage.mh4
                public final Object invoke() {
                    return CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$8$lambda$7$lambda$6(t72Var, h37Var);
                }
            };
            jt1Var.C(objF4);
        }
        jt1Var.B();
        FileActionSheetKt.FileActionSheet(clickedItem, mh4Var, mh4Var2, mh4Var3, (mh4) objF4, jt1Var, 0);
        jt1Var.I();
    }

    @Override // defpackage.ei4
    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
        invoke(bj1Var, jt1Var, num.intValue());
        return g2b.a;
    }
}
