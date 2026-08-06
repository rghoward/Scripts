package io.intercom.android.sdk.survey.ui.components;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.x69;
import defpackage.xm2;
import defpackage.zh1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyContent$1$1$1", f = "SurveyComponent.kt", l = {145}, m = "invokeSuspend")
public final class SurveyComponentKt$SurveyContent$1$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ x69 $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyComponentKt$SurveyContent$1$1$1(x69 x69Var, r02<? super SurveyComponentKt$SurveyContent$1$1$1> r02Var) {
        super(2, r02Var);
        this.$scrollState = x69Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new SurveyComponentKt$SurveyContent$1$1$1(this.$scrollState, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((SurveyComponentKt$SurveyContent$1$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            x69 x69Var = this.$scrollState;
            this.label = 1;
            Object objC = zh1.c(x69Var, 0 - x69Var.a.k(), this);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
