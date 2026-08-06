package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend", v = 1)
public final class h64 extends p6a implements ei4<t72, s54<Object>, r02<? super g2b>, Object> {
    public final /* synthetic */ r54<Object> A;
    public tj8 t;
    public gl8 u;
    public fl8 v;
    public int w;
    public /* synthetic */ t72 x;
    public /* synthetic */ s54 y;
    public final /* synthetic */ oh4<Object, Long> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements oh4<r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ s54<Object> u;
        public final /* synthetic */ gl8<Object> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r02 r02Var, s54 s54Var, gl8 gl8Var) {
            super(1, r02Var);
            this.u = s54Var;
            this.v = gl8Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(r02<?> r02Var) {
            return new a(r02Var, this.u, this.v);
        }

        @Override // defpackage.oh4
        public final Object invoke(r02<? super g2b> r02Var) {
            return ((a) create(r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            gl8<Object> gl8Var = this.v;
            if (i == 0) {
                dv8.b(obj);
                Object obj2 = gl8Var.t;
                if (obj2 == rd7.a) {
                    obj2 = null;
                }
                this.t = 1;
                Object objEmit = this.u.emit(obj2, this);
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
            gl8Var.t = null;
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<ga1<? extends Object>, r02<? super g2b>, Object> {
        public gl8 t;
        public int u;
        public /* synthetic */ Object v;
        public final /* synthetic */ gl8<Object> w;
        public final /* synthetic */ s54<Object> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r02 r02Var, s54 s54Var, gl8 gl8Var) {
            super(2, r02Var);
            this.w = gl8Var;
            this.x = s54Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(r02Var, this.x, this.w);
            bVar.v = ((ga1) obj).a;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ga1<? extends Object> ga1Var, r02<? super g2b> r02Var) {
            Object obj = ga1Var.a;
            b bVar = new b(r02Var, this.x, this.w);
            bVar.v = obj;
            return bVar.invokeSuspend(g2b.a);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, k7a] */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            gl8<Object> gl8Var;
            gl8<Object> gl8Var2;
            ?? r0 = this.v;
            int i = this.u;
            if (i == 0) {
                dv8.b(obj);
                boolean z = r0 instanceof ga1.b;
                gl8Var = this.w;
                if (!z) {
                    gl8Var.t = r0;
                }
                if (z) {
                    ga1.a aVar = r0 instanceof ga1.a ? (ga1.a) r0 : null;
                    Throwable th = aVar != null ? aVar.a : null;
                    if (th != null) {
                        throw th;
                    }
                    Object obj2 = gl8Var.t;
                    if (obj2 != null) {
                        if (obj2 == rd7.a) {
                            obj2 = null;
                        }
                        this.v = null;
                        this.t = gl8Var;
                        this.u = 1;
                        Object objEmit = this.x.emit(obj2, this);
                        v72 v72Var = v72.t;
                        if (objEmit == v72Var) {
                            return v72Var;
                        }
                        gl8Var2 = gl8Var;
                    }
                    gl8Var.t = rd7.c;
                }
                return g2b.a;
            }
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gl8Var2 = this.t;
            dv8.b(obj);
            gl8Var = gl8Var2;
            gl8Var.t = rd7.c;
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<ua8<? super Object>, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ r54<Object> v;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<T> implements s54 {
            public final /* synthetic */ ua8<Object> t;

            /* JADX INFO: renamed from: h64$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {204}, m = "emit", v = 1)
            public static final class C0099a extends u02 {
                public /* synthetic */ Object t;
                public final /* synthetic */ a<T> u;
                public int v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0099a(a<? super T> aVar, r02<? super C0099a> r02Var) {
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
                C0099a c0099a;
                if (r02Var instanceof C0099a) {
                    c0099a = (C0099a) r02Var;
                    int i = c0099a.v;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0099a.v = i - Integer.MIN_VALUE;
                    } else {
                        c0099a = new C0099a(this, r02Var);
                    }
                } else {
                    c0099a = new C0099a(this, r02Var);
                }
                Object obj = c0099a.t;
                int i2 = c0099a.v;
                if (i2 == 0) {
                    dv8.b(obj);
                    if (t == null) {
                        t = (T) rd7.a;
                    }
                    c0099a.v = 1;
                    Object objA = this.t.a(c0099a, t);
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
    public h64(oh4<Object, Long> oh4Var, r54<Object> r54Var, r02<? super h64> r02Var) {
        super(3, r02Var);
        this.z = oh4Var;
        this.A = r54Var;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, s54<Object> s54Var, r02<? super g2b> r02Var) {
        h64 h64Var = new h64(this.z, this.A, r02Var);
        h64Var.x = t72Var;
        h64Var.y = s54Var;
        return h64Var.invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[PHI: r1 r2 r3 r10
      0x0087: PHI (r1v2 fl8) = (r1v4 fl8), (r1v6 fl8), (r1v6 fl8) binds: [B:28:0x0085, B:15:0x0050, B:21:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v1 s54) = (r2v10 s54), (r2v11 s54), (r2v11 s54) binds: [B:28:0x0085, B:15:0x0050, B:21:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r3v3 gl8) = (r3v5 gl8), (r3v6 gl8), (r3v6 gl8) binds: [B:28:0x0085, B:15:0x0050, B:21:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r10v2 tj8) = (r10v3 tj8), (r10v4 tj8), (r10v4 tj8) binds: [B:28:0x0085, B:15:0x0050, B:21:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:7:0x001d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h64.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
