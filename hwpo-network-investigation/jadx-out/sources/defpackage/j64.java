package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend", v = 1)
public final class j64 extends p6a implements ei4<t72, s54<Object>, r02<? super g2b>, Object> {
    public tj8 t;
    public gl8 u;
    public tj8 v;
    public int w;
    public /* synthetic */ t72 x;
    public /* synthetic */ s54 y;
    public final /* synthetic */ r54<Object> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<ga1<? extends Object>, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;
        public final /* synthetic */ gl8<Object> u;
        public final /* synthetic */ tj8<g2b> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gl8<Object> gl8Var, tj8<g2b> tj8Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = gl8Var;
            this.v = tj8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, this.v, r02Var);
            aVar.t = ((ga1) obj).a;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ga1<? extends Object> ga1Var, r02<? super g2b> r02Var) {
            Object obj = ga1Var.a;
            a aVar = new a(this.u, this.v, r02Var);
            aVar.t = obj;
            return aVar.invokeSuspend(g2b.a);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v3, types: [T, k7a] */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r0 = this.t;
            dv8.b(obj);
            boolean z = r0 instanceof ga1.b;
            gl8<Object> gl8Var = this.u;
            if (!z) {
                gl8Var.t = r0;
            }
            if (z) {
                ga1.a aVar = r0 instanceof ga1.a ? (ga1.a) r0 : null;
                Throwable th = aVar != null ? aVar.a : null;
                if (th != null) {
                    throw th;
                }
                this.v.k(new yb1());
                gl8Var.t = rd7.c;
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ gl8<Object> u;
        public final /* synthetic */ s54<Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r02 r02Var, s54 s54Var, gl8 gl8Var) {
            super(2, r02Var);
            this.u = gl8Var;
            this.v = s54Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(r02Var, this.v, this.u);
        }

        @Override // defpackage.ci4
        public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
            return ((b) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                gl8<Object> gl8Var = this.u;
                Object obj2 = gl8Var.t;
                if (obj2 == null) {
                    return g2b.a;
                }
                gl8Var.t = null;
                Object obj3 = obj2 != rd7.a ? obj2 : null;
                this.t = 1;
                Object objEmit = this.v.emit(obj3, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
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

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", l = {273}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<ua8<? super Object>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ r54<Object> v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<T> implements s54 {
            public final /* synthetic */ ua8<Object> t;

            /* JADX INFO: renamed from: j64$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", l = {273}, m = "emit", v = 1)
            public static final class C0183a extends u02 {
                public /* synthetic */ Object t;
                public final /* synthetic */ a<T> u;
                public int v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0183a(a<? super T> aVar, r02<? super C0183a> r02Var) {
                    super(r02Var);
                    this.u = aVar;
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) {
                    this.t = obj;
                    this.v |= Integer.MIN_VALUE;
                    return this.u.emit(null, this);
                }
            }

            public a(ua8<Object> ua8Var) {
                this.t = ua8Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.s54
            public final Object emit(T t, r02<? super g2b> r02Var) throws Throwable {
                C0183a c0183a;
                if (r02Var instanceof C0183a) {
                    c0183a = (C0183a) r02Var;
                    int i = c0183a.v;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0183a.v = i - Integer.MIN_VALUE;
                    } else {
                        c0183a = new C0183a(this, r02Var);
                    }
                } else {
                    c0183a = new C0183a(this, r02Var);
                }
                Object obj = c0183a.t;
                int i2 = c0183a.v;
                if (i2 == 0) {
                    dv8.b(obj);
                    if (t == null) {
                        t = (T) rd7.a;
                    }
                    c0183a.v = 1;
                    Object objA = this.t.a(c0183a, t);
                    v72 v72Var = v72.t;
                    if (objA == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i2 != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r54<Object> r54Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.v = r54Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            c cVar = new c(this.v, r02Var);
            cVar.u = obj;
            return cVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ua8<? super Object> ua8Var, r02<? super g2b> r02Var) {
            return ((c) create(ua8Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ua8 ua8Var = (ua8) this.u;
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                a aVar = new a(ua8Var);
                this.u = null;
                this.t = 1;
                Object objCollect = this.v.collect(aVar, this);
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
    public j64(r54 r54Var, r02 r02Var) {
        super(3, r02Var);
        this.z = r54Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, s54<Object> s54Var, r02<? super g2b> r02Var) {
        j64 j64Var = new j64(this.z, r02Var);
        j64Var.x = t72Var;
        j64Var.y = s54Var;
        return j64Var.invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        gl8 gl8Var;
        tj8 tj8VarB;
        tj8 tj8Var;
        t72 t72Var = this.x;
        s54 s54Var = this.y;
        int i = this.w;
        if (i == 0) {
            dv8.b(obj);
            ta8 ta8VarB = qa8.b(t72Var, -1, new c(this.z, null), 1);
            gl8Var = new gl8();
            tj8VarB = qa8.b(t72Var, 0, new i64(2, null), 1);
            tj8Var = ta8VarB;
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tj8VarB = this.v;
            gl8Var = this.u;
            tj8Var = this.t;
            dv8.b(obj);
        }
        while (gl8Var.t != rd7.c) {
            n99 n99Var = new n99(getContext());
            n99Var.i(tj8Var.c(), new a(gl8Var, tj8VarB, null));
            n99Var.i(tj8VarB.b(), new b(null, s54Var, gl8Var));
            this.x = null;
            this.y = s54Var;
            this.t = tj8Var;
            this.u = gl8Var;
            this.v = tj8VarB;
            this.w = 1;
            Object objF = n99Var.j() ? n99Var.f(this) : n99Var.g(this);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
                return v72Var;
            }
        }
        return g2b.a;
    }
}
