package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.IndicatorLineNode$update$1", f = "TextField.kt", l = {1537}, m = "invokeSuspend")
public final class gb5 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ eb5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb5(eb5 eb5Var, r02<? super gb5> r02Var) {
        super(2, r02Var);
        this.u = eb5Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new gb5(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((gb5) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            this.t = 1;
            eb5.f2(this.u, this);
            return v72.t;
        }
        if (i == 1) {
            dv8.b(obj);
            return g2b.a;
        }
        aa0.c("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
