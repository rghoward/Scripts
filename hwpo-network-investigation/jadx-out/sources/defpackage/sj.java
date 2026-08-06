package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {566}, m = "invokeSuspend")
public final class sj extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ wj<Object> u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ fi4<ej, g63<Object>, Object, r02<? super g2b>, Object> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {568}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<js7<? extends g63<Object>, Object>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ fi4<ej, g63<Object>, Object, r02<? super g2b>, Object> v;
        public final /* synthetic */ wj<Object> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(fi4<? super ej, ? super g63<Object>, Object, ? super r02<? super g2b>, ? extends Object> fi4Var, wj<Object> wjVar, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = fi4Var;
            this.w = wjVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(js7<? extends g63<Object>, Object> js7Var, r02<? super g2b> r02Var) {
            return ((a) create(js7Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                js7 js7Var = (js7) this.u;
                g63<Object> g63Var = (g63) js7Var.t;
                Object obj2 = js7Var.u;
                tj tjVar = this.w.n;
                this.t = 1;
                Object objInvoke = this.v.invoke(tjVar, g63Var, obj2, this);
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
    /* JADX WARN: Multi-variable type inference failed */
    public sj(wj<Object> wjVar, Object obj, fi4<? super ej, ? super g63<Object>, Object, ? super r02<? super g2b>, ? extends Object> fi4Var, r02<? super sj> r02Var) {
        super(1, r02Var);
        this.u = wjVar;
        this.v = obj;
        this.w = fi4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new sj(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((sj) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            Object obj2 = this.v;
            wj<Object> wjVar = this.u;
            wjVar.i(obj2);
            rj rjVar = new rj(0, wjVar);
            a aVar = new a(this.w, wjVar, null);
            this.t = 1;
            Object objA = jj.a(rjVar, aVar, this);
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
