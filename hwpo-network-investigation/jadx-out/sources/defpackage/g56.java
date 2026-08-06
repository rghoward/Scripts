package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend", v = 1)
public final class g56 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ h56 u;
    public final /* synthetic */ yo v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g56(h56 h56Var, yo yoVar, r02 r02Var) {
        super(2, r02Var);
        this.u = h56Var;
        this.v = yoVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new g56(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) throws Throwable {
        ((g56) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        return v72.t;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            v18.a(this.u, this.v, this);
            return v72.t;
        }
        if (i != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        fl.a();
        return null;
    }
}
