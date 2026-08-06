package io.intercom.android.sdk.survey.ui.questiontype.text;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.fw0;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$2$1$1", f = "TextInputPill.kt", l = {73}, m = "invokeSuspend")
public final class TextInputPillKt$TextInputPill$2$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ fw0 $bringIntoViewRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputPillKt$TextInputPill$2$1$1(fw0 fw0Var, r02<? super TextInputPillKt$TextInputPill$2$1$1> r02Var) {
        super(2, r02Var);
        this.$bringIntoViewRequester = fw0Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new TextInputPillKt$TextInputPill$2$1$1(this.$bringIntoViewRequester, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((TextInputPillKt$TextInputPill$2$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            fw0 fw0Var = this.$bringIntoViewRequester;
            this.label = 1;
            Object objA = fw0Var.a(null, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
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
