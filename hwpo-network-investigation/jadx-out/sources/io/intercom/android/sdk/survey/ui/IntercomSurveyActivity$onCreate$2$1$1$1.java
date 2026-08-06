package io.intercom.android.sdk.survey.ui;

import defpackage.g2b;
import defpackage.oh4;
import defpackage.pi4;
import defpackage.t72;
import io.intercom.android.sdk.survey.SurveyViewModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class IntercomSurveyActivity$onCreate$2$1$1$1 extends pi4 implements oh4<t72, g2b> {
    public IntercomSurveyActivity$onCreate$2$1$1$1(Object obj) {
        super(1, obj, SurveyViewModel.class, "continueClicked", "continueClicked(Lkotlinx/coroutines/CoroutineScope;)V", 0);
    }

    @Override // defpackage.oh4
    public /* bridge */ /* synthetic */ g2b invoke(t72 t72Var) {
        invoke2(t72Var);
        return g2b.a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t72 t72Var) {
        ((SurveyViewModel) this.receiver).continueClicked(t72Var);
    }
}
