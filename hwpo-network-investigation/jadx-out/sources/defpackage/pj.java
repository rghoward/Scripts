package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {518}, m = "invokeSuspend")
public final class pj extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ wj<Object> u;
    public final /* synthetic */ ei4<ej, g63<Object>, r02<? super g2b>, Object> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {519}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<g63<Object>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ ei4<ej, g63<Object>, r02<? super g2b>, Object> v;
        public final /* synthetic */ wj<Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wj wjVar, r02 r02Var, ei4 ei4Var) {
            super(2, r02Var);
            this.v = ei4Var;
            this.w = wjVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.w, r02Var, this.v);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(g63<Object> g63Var, r02<? super g2b> r02Var) {
            return ((a) create(g63Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                g63<Object> g63Var = (g63) this.u;
                tj tjVar = this.w.n;
                this.t = 1;
                Object objInvoke = this.v.invoke(tjVar, g63Var, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(wj wjVar, r02 r02Var, ei4 ei4Var) {
        super(1, r02Var);
        this.u = wjVar;
        this.v = ei4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new pj(this.u, r02Var, this.v);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((pj) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            wj<Object> wjVar = this.u;
            oj ojVar = new oj(0, wjVar);
            a aVar = new a(wjVar, null, this.v);
            this.t = 1;
            Object objA = jj.a(ojVar, aVar, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
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
