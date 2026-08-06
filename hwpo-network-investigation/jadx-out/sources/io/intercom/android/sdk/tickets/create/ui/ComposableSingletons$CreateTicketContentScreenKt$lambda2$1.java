package io.intercom.android.sdk.tickets.create.ui;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.xr1;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$5$lambda$4(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$6(AnswerClickData answerClickData) {
        answerClickData.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        CreateTicketViewModel.CreateTicketFormUiState.Content content = new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", CreateTicketContentScreenKt.questions, false, true);
        jt1Var.K(1378017313);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new a();
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        Object objA = xr1.a(jt1Var, 1378018177);
        if (objA == c0187a) {
            objA = new b();
            jt1Var.C(objA);
        }
        mh4 mh4Var2 = (mh4) objA;
        Object objA2 = xr1.a(jt1Var, 1378019265);
        if (objA2 == c0187a) {
            objA2 = new c();
            jt1Var.C(objA2);
        }
        oh4 oh4Var = (oh4) objA2;
        Object objA3 = xr1.a(jt1Var, 1378020289);
        if (objA3 == c0187a) {
            objA3 = new d();
            jt1Var.C(objA3);
        }
        jt1Var.B();
        CreateTicketContentScreenKt.CreateTicketContentScreen(null, content, mh4Var, mh4Var2, oh4Var, (oh4) objA3, jt1Var, 224640, 1);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
