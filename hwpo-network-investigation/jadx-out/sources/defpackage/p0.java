package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", f = "Clickable.kt", l = {1900}, m = "invokeSuspend", v = 1)
public final class p0 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ m0 u;
    public final /* synthetic */ n88.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(m0 m0Var, n88.b bVar, r02<? super p0> r02Var) {
        super(2, r02Var);
        this.u = m0Var;
        this.v = bVar;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new p0(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((p0) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            h27 h27Var = this.u.J;
            if (h27Var != null) {
                n88.a aVar = new n88.a(this.v);
                this.t = 1;
                Object objC = h27Var.c(aVar, this);
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
        return g2b.a;
    }
}
