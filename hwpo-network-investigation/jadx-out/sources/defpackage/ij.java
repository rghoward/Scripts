package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {708}, m = "invokeSuspend")
public final class ij extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ mh4<Object> v;
    public final /* synthetic */ ci4<Object, r02<? super g2b>, Object> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ gl8<el5> t;
        public final /* synthetic */ t72 u;
        public final /* synthetic */ ci4<Object, r02<? super g2b>, Object> v;

        /* JADX INFO: renamed from: ij$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {715}, m = "invokeSuspend")
        public static final class C0110a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public int t;
            public final /* synthetic */ ci4<Object, r02<? super g2b>, Object> u;
            public final /* synthetic */ Object v;
            public final /* synthetic */ t72 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0110a(ci4<Object, ? super r02<? super g2b>, ? extends Object> ci4Var, Object obj, t72 t72Var, r02<? super C0110a> r02Var) {
                super(2, r02Var);
                this.u = ci4Var;
                this.v = obj;
                this.w = t72Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0110a(this.u, this.v, this.w, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0110a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    this.t = 1;
                    Object objInvoke = this.u.invoke(this.v, this);
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
                u72.c(this.w, new dj());
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {711}, m = "emit")
        public static final class b extends u02 {
            public Object t;
            public el5 u;
            public /* synthetic */ Object v;
            public final /* synthetic */ a<T> w;
            public int x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, r02<? super b> r02Var) {
                super(r02Var);
                this.w = aVar;
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.v = obj;
                this.x |= Integer.MIN_VALUE;
                return this.w.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(gl8<el5> gl8Var, t72 t72Var, ci4<Object, ? super r02<? super g2b>, ? extends Object> ci4Var) {
            this.t = gl8Var;
            this.u = t72Var;
            this.v = ci4Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.s54
        public final Object emit(Object obj, r02<? super g2b> r02Var) throws Throwable {
            b bVar;
            if (r02Var instanceof b) {
                bVar = (b) r02Var;
                int i = bVar.x;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.x = i - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, r02Var);
                }
            } else {
                bVar = new b(this, r02Var);
            }
            Object obj2 = bVar.v;
            int i2 = bVar.x;
            gl8<el5> gl8Var = this.t;
            if (i2 == 0) {
                dv8.b(obj2);
                el5 el5Var = gl8Var.t;
                if (el5Var != null) {
                    el5Var.k(new dj());
                    bVar.t = obj;
                    bVar.u = el5Var;
                    bVar.x = 1;
                    Object objP0 = el5Var.p0(bVar);
                    v72 v72Var = v72.t;
                    if (objP0 == v72Var) {
                        return v72Var;
                    }
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = bVar.t;
                dv8.b(obj2);
            }
            ci4<Object, r02<? super g2b>, Object> ci4Var = this.v;
            t72 t72Var = this.u;
            gl8Var.t = (T) oy0.d(t72Var, null, x72.w, new C0110a(ci4Var, obj, t72Var, null), 1);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ij(mh4<Object> mh4Var, ci4<Object, ? super r02<? super g2b>, ? extends Object> ci4Var, r02<? super ij> r02Var) {
        super(2, r02Var);
        this.v = mh4Var;
        this.w = ci4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        ij ijVar = new ij(this.v, this.w, r02Var);
        ijVar.u = obj;
        return ijVar;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ij) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            t72 t72Var = (t72) this.u;
            gl8 gl8Var = new gl8();
            oz8 oz8VarK = bl7.k(this.v);
            a aVar = new a(gl8Var, t72Var, this.w);
            this.t = 1;
            Object objCollect = oz8VarK.collect(aVar, this);
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
