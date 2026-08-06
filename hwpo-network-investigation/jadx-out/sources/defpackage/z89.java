package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {496}, m = "invokeSuspend", v = 1)
public final class z89 extends p6a implements oh4<r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ w89<Object> w;
    public final /* synthetic */ tva<Object> x;
    public final /* synthetic */ float y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {518}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ Object v;
        public final /* synthetic */ Object w;
        public final /* synthetic */ w89<Object> x;
        public final /* synthetic */ tva<Object> y;
        public final /* synthetic */ float z;

        /* JADX INFO: renamed from: z89$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {514}, m = "invokeSuspend", v = 1)
        public static final class C0292a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ w89<Object> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0292a(w89<Object> w89Var, r02<? super C0292a> r02Var) {
                super(2, r02Var);
                this.u = w89Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0292a(this.u, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0292a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    this.t = 1;
                    Object objV = w89.v(this.u, this);
                    v72 v72Var = v72.t;
                    if (objV == v72Var) {
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
        public a(Object obj, Object obj2, w89<Object> w89Var, tva<Object> tvaVar, float f, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = obj;
            this.w = obj2;
            this.x = w89Var;
            this.y = tvaVar;
            this.z = f;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, this.x, this.y, this.z, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            w89<Object> w89Var = this.x;
            if (i == 0) {
                dv8.b(obj);
                t72 t72Var = (t72) this.u;
                Object obj2 = this.v;
                Object obj3 = this.w;
                if (xj5.a(obj2, obj3)) {
                    w89Var.o = null;
                    if (xj5.a(w89Var.c.getValue(), obj2)) {
                        return g2b.a;
                    }
                } else {
                    w89.u(w89Var);
                }
                boolean zA = xj5.a(obj2, obj3);
                float f = this.z;
                if (!zA) {
                    tva<Object> tvaVar = this.y;
                    tvaVar.p(obj2);
                    tvaVar.n(0L);
                    w89Var.b.setValue(obj2);
                    tvaVar.j(f);
                }
                bw bwVar = w89.s;
                w89Var.D(f);
                if (w89Var.n.e()) {
                    oy0.d(t72Var, null, null, new C0292a(w89Var, null), 3);
                } else {
                    w89Var.m = Long.MIN_VALUE;
                }
                this.t = 1;
                Object objX = w89.x(w89Var, this);
                v72 v72Var = v72.t;
                if (objX == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            bw bwVar2 = w89.s;
            w89Var.C();
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z89(Object obj, Object obj2, w89<Object> w89Var, tva<Object> tvaVar, float f, r02<? super z89> r02Var) {
        super(1, r02Var);
        this.u = obj;
        this.v = obj2;
        this.w = w89Var;
        this.x = tvaVar;
        this.y = f;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new z89(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((z89) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(this.u, this.v, this.w, this.x, this.y, null);
            this.t = 1;
            Object objD = u72.d(aVar, this);
            v72 v72Var = v72.t;
            if (objD == v72Var) {
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
