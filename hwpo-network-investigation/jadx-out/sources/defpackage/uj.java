package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
public final class uj extends p6a implements ei4<ej, g63<Object>, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ vj u;
    public final /* synthetic */ o63 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(vj vjVar, o63 o63Var, r02 r02Var) {
        super(3, r02Var);
        this.u = vjVar;
        this.v = o63Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(ej ejVar, g63<Object> g63Var, r02<? super g2b> r02Var) {
        return new uj(this.u, this.v, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            vj.a aVar = this.u.a;
            this.t = 1;
            Object objInvoke = this.v.invoke(aVar, this);
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
