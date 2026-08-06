package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
public final class x54 extends p6a implements ci4<ua8<Object>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ s66 v;
    public final /* synthetic */ r54<Object> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ r54<Object> u;
        public final /* synthetic */ ua8<Object> v;

        /* JADX INFO: renamed from: x54$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0278a<T> implements s54 {
            public final /* synthetic */ ua8<T> t;

            /* JADX WARN: Multi-variable type inference failed */
            public C0278a(ua8<? super T> ua8Var) {
                this.t = ua8Var;
            }

            @Override // defpackage.s54
            public final Object emit(T t, r02<? super g2b> r02Var) {
                Object objA = this.t.a(r02Var, t);
                return objA == v72.t ? objA : g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r54<Object> r54Var, ua8<Object> ua8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = r54Var;
            this.v = ua8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, r02Var);
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
                C0278a c0278a = new C0278a(this.v);
                this.t = 1;
                Object objCollect = this.u.collect(c0278a, this);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
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
    public x54(s66 s66Var, r54 r54Var, r02 r02Var) {
        super(2, r02Var);
        this.v = s66Var;
        this.w = r54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        x54 x54Var = new x54(this.v, this.w, r02Var);
        x54Var.u = obj;
        return x54Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(ua8<Object> ua8Var, r02<? super g2b> r02Var) {
        return ((x54) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ua8 ua8Var;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            ua8 ua8Var2 = (ua8) this.u;
            a aVar = new a(this.w, ua8Var2, null);
            this.u = ua8Var2;
            this.t = 1;
            Object objA = sn8.a(this.v, s66.b.x, aVar, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
            ua8Var = ua8Var2;
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ua8Var = (ua8) this.u;
            dv8.b(obj);
        }
        ua8Var.g(null);
        return g2b.a;
    }
}
