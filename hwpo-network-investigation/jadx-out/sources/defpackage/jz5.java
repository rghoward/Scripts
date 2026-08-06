package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {587}, m = "invokeSuspend", v = 1)
public final class jz5 extends p6a implements ci4<t69, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ nz5 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz5(nz5 nz5Var, int i, int i2, r02<? super jz5> r02Var) {
        super(2, r02Var);
        this.v = nz5Var;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        jz5 jz5Var = new jz5(this.v, this.w, this.x, r02Var);
        jz5Var.u = obj;
        return jz5Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t69 t69Var, r02<? super g2b> r02Var) {
        return ((jz5) create(t69Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            t69 t69Var = (t69) this.u;
            nz5 nz5Var = this.v;
            dz5 dz5Var = new dz5(t69Var, nz5Var);
            tx2 tx2Var = ((xy5) nz5Var.f.getValue()).i;
            this.t = 1;
            Object objB = q69.b(dz5Var, this.w, this.x, 100, tx2Var, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
