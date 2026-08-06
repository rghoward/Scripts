package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.d94;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt$DropDownQuestion$1$1$1$4$1$1", f = "DropDownQuestion.kt", l = {}, m = "invokeSuspend")
public final class DropDownQuestionKt$DropDownQuestion$1$1$1$4$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ d94 $focusManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownQuestionKt$DropDownQuestion$1$1$1$4$1$1(d94 d94Var, r02<? super DropDownQuestionKt$DropDownQuestion$1$1$1$4$1$1> r02Var) {
        super(2, r02Var);
        this.$focusManager = d94Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new DropDownQuestionKt$DropDownQuestion$1$1$1$4$1$1(this.$focusManager, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((DropDownQuestionKt$DropDownQuestion$1$1$1$4$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        this.$focusManager.w(false);
        return g2b.a;
    }
}
