package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.library.extensions.ViewExtensionsKt$debouncedClick$1$1", f = "ViewExtensions.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class tgb extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ei4<t72, View, r02<? super g2b>, Object> v;
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tgb(ei4<? super t72, ? super View, ? super r02<? super g2b>, ? extends Object> ei4Var, View view, r02<? super tgb> r02Var) {
        super(2, r02Var);
        this.v = ei4Var;
        this.w = view;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        tgb tgbVar = new tgb(this.v, this.w, r02Var);
        tgbVar.u = obj;
        return tgbVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((tgb) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        t72 t72Var = (t72) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.u = null;
            this.t = 1;
            Object objInvoke = this.v.invoke(t72Var, this.w, this);
            v72 v72Var = v72.t;
            if (objInvoke == v72Var) {
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
