package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {101}, m = "invokeSuspend", v = 1)
public final class k11 extends p6a implements ci4<s54<? super oo7<Object>>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ n11<Object> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<sa5<? extends oo7<Object>>, r02<? super Boolean>, Object> {
        public /* synthetic */ Object t;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(2, r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(sa5<? extends oo7<Object>> sa5Var, r02<? super Boolean> r02Var) {
            return ((a) create(sa5Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            return Boolean.valueOf(((sa5) this.t) != null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<T> implements s54 {
        public final /* synthetic */ el8 t;
        public final /* synthetic */ s54<oo7<T>> u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {104}, m = "emit", v = 1)
        public static final class a extends u02 {
            public sa5 t;
            public /* synthetic */ Object u;
            public final /* synthetic */ b<T> v;
            public int w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, r02<? super a> r02Var) {
                super(r02Var);
                this.v = bVar;
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.u = obj;
                this.w |= Integer.MIN_VALUE;
                return this.v.emit(null, this);
            }
        }

        public b(s54 s54Var, el8 el8Var) {
            this.t = el8Var;
            this.u = s54Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(sa5<? extends oo7<T>> sa5Var, r02<? super g2b> r02Var) throws Throwable {
            a aVar;
            if (r02Var instanceof a) {
                aVar = (a) r02Var;
                int i = aVar.w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.w = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, r02Var);
                }
            } else {
                aVar = new a(this, r02Var);
            }
            Object obj = aVar.u;
            int i2 = aVar.w;
            el8 el8Var = this.t;
            if (i2 == 0) {
                dv8.b(obj);
                sa5Var.getClass();
                if (sa5Var.a > el8Var.t) {
                    T t = sa5Var.b;
                    aVar.t = sa5Var;
                    aVar.w = 1;
                    Object objEmit = this.u.emit(t, aVar);
                    v72 v72Var = v72.t;
                    if (objEmit == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            }
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sa5Var = aVar.t;
            dv8.b(obj);
            el8Var.t = sa5Var.a;
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k11(n11<Object> n11Var, r02<? super k11> r02Var) {
        super(2, r02Var);
        this.v = n11Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        k11 k11Var = new k11(this.v, r02Var);
        k11Var.u = obj;
        return k11Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(s54<? super oo7<Object>> s54Var, r02<? super g2b> r02Var) {
        return ((k11) create(s54Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            s54 s54Var = (s54) this.u;
            el8 el8Var = new el8();
            el8Var.t = Integer.MIN_VALUE;
            x64 x64Var = new x64(this.v.c, new a(2, null));
            b bVar = new b(s54Var, el8Var);
            this.t = 1;
            Object objCollect = x64Var.collect(bVar, this);
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
