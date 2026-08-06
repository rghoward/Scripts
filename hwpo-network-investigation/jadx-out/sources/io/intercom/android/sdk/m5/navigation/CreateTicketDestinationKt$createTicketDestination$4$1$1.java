package io.intercom.android.sdk.m5.navigation;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.fl;
import defpackage.g2b;
import defpackage.h37;
import defpackage.o67;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.zl9;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1$1", f = "CreateTicketDestination.kt", l = {101}, m = "invokeSuspend")
public final class CreateTicketDestinationKt$createTicketDestination$4$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ h37<AnswerClickData> $answerClickedData;
    final /* synthetic */ o67 $navController;
    final /* synthetic */ t72 $scope;
    final /* synthetic */ CreateTicketViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTicketDestinationKt$createTicketDestination$4$1$1(CreateTicketViewModel createTicketViewModel, o67 o67Var, t72 t72Var, h37<AnswerClickData> h37Var, r02<? super CreateTicketDestinationKt$createTicketDestination$4$1$1> r02Var) {
        super(2, r02Var);
        this.$viewModel = createTicketViewModel;
        this.$navController = o67Var;
        this.$scope = t72Var;
        this.$answerClickedData = h37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new CreateTicketDestinationKt$createTicketDestination$4$1$1(this.$viewModel, this.$navController, this.$scope, this.$answerClickedData, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((CreateTicketDestinationKt$createTicketDestination$4$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            zl9<CreateTicketViewModel.TicketSideEffect> effect = this.$viewModel.getEffect();
            final o67 o67Var = this.$navController;
            final t72 t72Var = this.$scope;
            final h37<AnswerClickData> h37Var = this.$answerClickedData;
            s54<? super CreateTicketViewModel.TicketSideEffect> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1$1.1
                public final Object emit(CreateTicketViewModel.TicketSideEffect ticketSideEffect, r02<? super g2b> r02Var) {
                    if (xj5.a(ticketSideEffect, CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE)) {
                        o67Var.d();
                        IntercomRouterKt.openTicketDetailScreen$default(o67Var, true, null, false, 6, null);
                    } else {
                        if (!(ticketSideEffect instanceof CreateTicketViewModel.TicketSideEffect.AnswerClicked)) {
                            defpackage.u.b();
                            return null;
                        }
                        CreateTicketDestinationKt.AnonymousClass4.invoke$showSheet(t72Var, h37Var, ((CreateTicketViewModel.TicketSideEffect.AnswerClicked) ticketSideEffect).getAnswerClickData());
                    }
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit((CreateTicketViewModel.TicketSideEffect) obj2, (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            Object objCollect = effect.collect(s54Var, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}
