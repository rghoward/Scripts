package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
public final class nn0 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ v94 u;
    public final /* synthetic */ fra v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn0(v94 v94Var, fra fraVar, r02<? super nn0> r02Var) {
        super(2, r02Var);
        this.u = v94Var;
        this.v = fraVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new nn0(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((nn0) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        v94 v94Var = this.u;
        fra fraVar = this.v;
        if (i == 0) {
            dv8.b(obj);
            if (v94Var.e()) {
                this.t = 1;
                Object objC = fraVar.c(o37.v, this);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        if (fraVar.b() && !v94Var.e()) {
            fraVar.a();
        }
        return g2b.a;
    }
}
