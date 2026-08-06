package io.intercom.android.sdk.tickets.create.ui;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.xr1;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CreateTicketContentScreenKt$lambda3$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda3$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$7$lambda$6(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$9$lambda$8(AnswerClickData answerClickData) {
        answerClickData.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        CreateTicketViewModel.CreateTicketFormUiState.Loading loading = CreateTicketViewModel.CreateTicketFormUiState.Loading.INSTANCE;
        jt1Var.K(-1409387294);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new e();
            jt1Var.C(objF);
        }
        mh4 mh4Var = (mh4) objF;
        Object objA = xr1.a(jt1Var, -1409386238);
        if (objA == c0187a) {
            objA = new f();
            jt1Var.C(objA);
        }
        mh4 mh4Var2 = (mh4) objA;
        Object objA2 = xr1.a(jt1Var, -1409385374);
        if (objA2 == c0187a) {
            objA2 = new g();
            jt1Var.C(objA2);
        }
        mh4 mh4Var3 = (mh4) objA2;
        Object objA3 = xr1.a(jt1Var, -1409384286);
        if (objA3 == c0187a) {
            objA3 = new h();
            jt1Var.C(objA3);
        }
        oh4 oh4Var = (oh4) objA3;
        Object objA4 = xr1.a(jt1Var, -1409383262);
        if (objA4 == c0187a) {
            objA4 = new i();
            jt1Var.C(objA4);
        }
        jt1Var.B();
        CreateTicketContentScreenKt.CreateTicketScreen(loading, mh4Var, mh4Var2, mh4Var3, oh4Var, (oh4) objA4, jt1Var, 224694);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
