package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", f = "PlatformSelectionBehaviors.android.kt", l = {172}, m = "invokeSuspend", v = 1)
public final class l18 extends p6a implements ci4<TextClassifier, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ o18 v;
    public final /* synthetic */ CharSequence w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l18(long j, r02 r02Var, o18 o18Var, CharSequence charSequence) {
        super(2, r02Var);
        this.v = o18Var;
        this.w = charSequence;
        this.x = j;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        l18 l18Var = new l18(this.x, r02Var, this.v, this.w);
        l18Var.u = obj;
        return l18Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(TextClassifier textClassifier, r02<? super g2b> r02Var) {
        return ((l18) create(vk.a(textClassifier), r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            TextClassifier textClassifierA = vk.a(this.u);
            this.t = 1;
            Object objD = o18.d(this.v, this.w, this.x, textClassifierA, this);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
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
