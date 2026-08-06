package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
public final class hn0 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ fra t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(fra fraVar, r02<? super hn0> r02Var) {
        super(2, r02Var);
        this.t = fraVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new hn0(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((hn0) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.a();
        return g2b.a;
    }
}
