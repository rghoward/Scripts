package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
public final class dra extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ fra u;
    public final /* synthetic */ era v;
    public final /* synthetic */ o37 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ era u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(era eraVar, r02 r02Var) {
            super(2, r02Var);
            this.u = eraVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objInvoke = this.u.invoke(this);
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
    public dra(fra fraVar, era eraVar, o37 o37Var, r02 r02Var) {
        super(1, r02Var);
        this.u = fraVar;
        this.v = eraVar;
        this.w = o37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new dra(this.u, this.v, this.w, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((dra) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        era eraVar = this.v;
        int i = this.t;
        o37 o37Var = o37.v;
        o37 o37Var2 = this.w;
        fra fraVar = this.u;
        try {
            if (i == 0) {
                dv8.b(obj);
                a aVar = new a(eraVar, null);
                this.t = 2;
                Object objA = yoa.a(new xoa(1500L, this), aVar);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            if (o37Var2 != o37Var) {
                fraVar.a();
            }
            return g2b.a;
        } catch (Throwable th) {
            if (o37Var2 != o37Var) {
                fraVar.a();
            }
            throw th;
        }
    }
}
