package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {370}, m = "invokeSuspend", v = 1)
public final class k79 extends p6a implements ci4<k97, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ y53.b.a v;
    public final /* synthetic */ z79 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k79(y53.b.a aVar, z79 z79Var, r02 r02Var) {
        super(2, r02Var);
        this.v = aVar;
        this.w = z79Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        k79 k79Var = new k79(this.v, this.w, r02Var);
        k79Var.u = obj;
        return k79Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(k97 k97Var, r02<? super g2b> r02Var) {
        return ((k79) create(k97Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            final k97 k97Var = (k97) this.u;
            final z79 z79Var = this.w;
            oh4<? super n53.b, ? extends g2b> oh4Var = new oh4() { // from class: j79
                @Override // defpackage.oh4
                public final Object invoke(Object obj2) {
                    n53.b bVar = (n53.b) obj2;
                    float f = bVar.b ? -1.0f : 1.0f;
                    long j = bVar.a;
                    k97Var.b(1, vf7.f(f, z79Var.d == fl7.u ? vf7.a(j, 0.0f, 1) : vf7.a(j, 0.0f, 2)));
                    return g2b.a;
                }
            };
            this.t = 1;
            Object objInvoke = this.v.invoke(oh4Var, this);
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
